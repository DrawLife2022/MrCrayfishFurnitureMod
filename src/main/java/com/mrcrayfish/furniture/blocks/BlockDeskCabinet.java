package com.mrcrayfish.furniture.blocks;

import com.mrcrayfish.furniture.util.StateHelper;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.resources.I18n;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.IStringSerializable;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.List;

/**
 * Author: MrCrayfish
 */
public class BlockDeskCabinet extends BlockFurnitureTile implements IDesk
{
    public static final PropertyEnum<DeskCabinetType> TYPE = PropertyEnum.create("type", DeskCabinetType.class);

    public BlockDeskCabinet(Material material)
    {
        super(material);
        this.setHardness(1.0F);
        this.setDefaultState(this.blockState.getBaseState().withProperty(FACING, EnumFacing.NORTH).withProperty(TYPE, DeskCabinetType.NONE));
    }

    @Override
    public void addInformation(ItemStack stack, @Nullable World player, List<String> tooltip, ITooltipFlag advanced)
    {
        if(GuiScreen.isShiftKeyDown())
        {
            String info = I18n.format("tile.desk_cabinet.info");
            tooltip.addAll(Minecraft.getMinecraft().fontRenderer.listFormattedStringToWidth(info, 150));
        }
        else
        {
            tooltip.add(TextFormatting.YELLOW + "Hold SHIFT for Info");
        }
    }

    @Override
    public IBlockState getActualState(IBlockState state, IBlockAccess world, BlockPos pos)
    {
        boolean left = false;
        boolean right = false;

        if(StateHelper.getBlock(world, pos, state.getValue(FACING), StateHelper.Direction.LEFT) instanceof IDesk)
        {
            left = true;
        }
        if(StateHelper.getBlock(world, pos, state.getValue(FACING), StateHelper.Direction.RIGHT) instanceof IDesk)
        {
            right = true;
        }
        if(left && !right)
        {
            return state.withProperty(TYPE, DeskCabinetType.LEFT);
        }
        else if(!left && right)
        {
            return state.withProperty(TYPE, DeskCabinetType.RIGHT);
        }
        else if(!left && !right)
        {
            return state.withProperty(TYPE, DeskCabinetType.NONE);
        }
        return state.withProperty(TYPE, DeskCabinetType.BOTH);
    }

    @Override
    protected BlockStateContainer createBlockState()
    {
        return new BlockStateContainer(this, FACING, TYPE);
    }

    @Nullable
    @Override
    public TileEntity createNewTileEntity(World worldIn, int meta)
    {
        //TODO create tile entity
        return null;
    }

    public enum DeskCabinetType implements IStringSerializable
    {
        NONE,
        LEFT,
        RIGHT,
        BOTH;

        @Override
        public String getName()
        {
            return this.toString().toLowerCase();
        }
    }
}
