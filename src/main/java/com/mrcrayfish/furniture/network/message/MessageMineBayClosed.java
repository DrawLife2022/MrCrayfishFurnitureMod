package com.mrcrayfish.furniture.network.message;

import com.mrcrayfish.furniture.gui.containers.ContainerComputer;
import com.mrcrayfish.furniture.tileentity.TileEntityComputer;
import com.mrcrayfish.furniture.util.TileEntityUtil;
import io.netty.buffer.ByteBuf;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.inventory.Container;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

public class MessageMineBayClosed implements IMessage, IMessageHandler<MessageMineBayClosed, IMessage>
{
    private int x, y, z;

    public MessageMineBayClosed() {}

    public MessageMineBayClosed(int x, int y, int z)
    {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    @Override
    public void fromBytes(ByteBuf buf)
    {
        this.x = buf.readInt();
        this.y = buf.readInt();
        this.z = buf.readInt();
    }

    @Override
    public void toBytes(ByteBuf buf)
    {
        buf.writeInt(x);
        buf.writeInt(y);
        buf.writeInt(z);
    }

    @Override
    public IMessage onMessage(MessageMineBayClosed message, MessageContext ctx)
    {
        EntityPlayerMP player = ctx.getServerHandler().player;
        World world = player.world;
        BlockPos pos = new BlockPos(message.x, message.y, message.z);
        if(!world.isAreaLoaded(pos, 0))
            return null;

        Container container = ctx.getServerHandler().player.openContainer;
        if(!(container instanceof ContainerComputer))
            return null;

        TileEntity tile_entity = player.world.getTileEntity(pos);
        if(tile_entity instanceof TileEntityComputer)
        {
            TileEntityComputer tileEntityComputer = (TileEntityComputer) tile_entity;
            if(((ContainerComputer) container).getComputerInventory() != tileEntityComputer)
                return null;

            if(!tileEntityComputer.getStackInSlot(0).isEmpty())
            {
                player.world.spawnEntity(new EntityItem(player.world, player.posX, player.posY, player.posZ, tileEntityComputer.getStackInSlot(0)));
                tileEntityComputer.setInventorySlotContents(0, ItemStack.EMPTY);
            }
            tileEntityComputer.setTrading(false);
        }
        TileEntityUtil.markBlockForUpdate(ctx.getServerHandler().player.world, pos);
        return null;
    }

}
