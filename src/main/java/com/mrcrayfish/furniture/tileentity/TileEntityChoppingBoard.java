package com.mrcrayfish.furniture.tileentity;

import com.mrcrayfish.furniture.api.RecipeAPI;
import com.mrcrayfish.furniture.api.RecipeData;
import com.mrcrayfish.furniture.gui.inventory.ISimpleInventory;
import com.mrcrayfish.furniture.init.FurnitureSounds;
import com.mrcrayfish.furniture.util.TileEntityUtil;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.util.SoundCategory;
import net.minecraftforge.common.util.Constants;

import java.util.ArrayList;

public class TileEntityChoppingBoard extends TileEntitySyncClient implements ISimpleInventory
{
    private ArrayList<ItemStack> food = new ArrayList<>();

    public void setFood(ItemStack food)
    {
        this.food.add(0, food);
    }

    public void addFood(ItemStack food)
    {
        this.food.add(food);
    }

    public ItemStack getFood()
    {
        return food.isEmpty() ? null : food.get(0);
    }

    public ArrayList<ItemStack> getAllFood()
    {
        return food;
    }

    public boolean chopFood()
    {
        if(food != null)
        {
            RecipeData data = RecipeAPI.getChoppingBoardRecipeFromInput(food.get(0));
            if(data != null)
            {
                if(!world.isRemote)
                {
                    EntityItem entityItem = new EntityItem(world, pos.getX() + 0.5, pos.getY() + 0.2, pos.getZ() + 0.5, data.getOutput().copy());
                    world.spawnEntity(entityItem);
                    world.playSound(null, pos.getX(), pos.getY(), pos.getZ(), FurnitureSounds.knife_chop, SoundCategory.BLOCKS, 0.75F, 1.0F);
                }
                setFood(null);
                TileEntityUtil.markBlockForUpdate(world, pos);
                return true;
            }
        }
        return false;
    }

    @Override
    public void readFromNBT(NBTTagCompound tagCompound)
    {
        super.readFromNBT(tagCompound);
        if(tagCompound.hasKey("Foods", 10))
        {
            NBTTagList itemList = tagCompound.getTagList("Foods", Constants.NBT.TAG_COMPOUND);

            for (int i = 0; i < itemList.tagCount(); i++) {
                NBTTagCompound itemTag = itemList.getCompoundTagAt(i);
                food.add(new ItemStack(itemTag));
            }
        }
    }

    @Override
    public NBTTagCompound writeToNBT(NBTTagCompound tagCompound)
    {
        super.writeToNBT(tagCompound);
        if(!food.isEmpty()) {
            NBTTagList itemList = new NBTTagList();
            for (ItemStack stack : food) {
                if(stack == null) continue;
                itemList.appendTag(stack.serializeNBT());
            }
            tagCompound.setTag("Foods", itemList);
        }
        return tagCompound;
    }

    @Override
    public int getSize()
    {
        return 1;
    }

    @Override
    public ItemStack getItem(int i)
    {
        return food.get(i);
    }

    @Override
    public void clear()
    {
        food = null;
    }
}
