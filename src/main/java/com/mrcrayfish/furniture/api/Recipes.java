package com.mrcrayfish.furniture.api;

import com.mrcrayfish.furniture.MrCrayfishFurnitureMod;
import net.minecraft.item.ItemStack;

import java.util.ArrayList;

public class Recipes
{
    // Used for sending to clients
    public static ArrayList<String> recipeData = new ArrayList<>();

    /**
     * Recipes registered from the Config
     */
    public static ArrayList<RecipeData> localMineBayRecipes = new ArrayList<>();
    public static ArrayList<RecipeData> localOvenRecipes = new ArrayList<>();
    public static ArrayList<RecipeData> localFreezerRecipes = new ArrayList<>();
    public static ArrayList<RecipeData> localPrinterRecipes = new ArrayList<>();
    public static ArrayList<RecipeData> localToasterRecipes = new ArrayList<>();
    public static ArrayList<RecipeData> localChoppingBoardRecipes = new ArrayList<>();
    public static ArrayList<RecipeData> localBlenderRecipes = new ArrayList<>();
    public static ArrayList<RecipeData> localDishwasherRecipes = new ArrayList<>();
    public static ArrayList<RecipeData> localWashingMachineRecipes = new ArrayList<>();
    public static ArrayList<RecipeData> localMicrowaveRecipes = new ArrayList<>();
    public static ArrayList<RecipeData> localGrillRecipes = new ArrayList<>();

    /**
     * Recipes registered through FMLInterModComms
     */
    public static ArrayList<RecipeData> commMineBayRecipes = new ArrayList<>();
    public static ArrayList<RecipeData> commOvenRecipes = new ArrayList<>();
    public static ArrayList<RecipeData> commFreezerRecipes = new ArrayList<>();
    public static ArrayList<RecipeData> commPrinterRecipes = new ArrayList<>();
    public static ArrayList<RecipeData> commToasterRecipes = new ArrayList<>();
    public static ArrayList<RecipeData> commChoppingBoardRecipes = new ArrayList<>();
    public static ArrayList<RecipeData> commBlenderRecipes = new ArrayList<>();
    public static ArrayList<RecipeData> commDishwasherRecipes = new ArrayList<>();
    public static ArrayList<RecipeData> commWashingMachineRecipes = new ArrayList<>();
    public static ArrayList<RecipeData> commMicrowaveRecipes = new ArrayList<>();
    public static ArrayList<RecipeData> commGrillRecipes = new ArrayList<>();

    /**
     * Recipes registered from a server
     */
    public static ArrayList<RecipeData> remoteMineBayRecipes = new ArrayList<>();
    public static ArrayList<RecipeData> remoteOvenRecipes = new ArrayList<>();
    public static ArrayList<RecipeData> remoteFreezerRecipes = new ArrayList<>();
    public static ArrayList<RecipeData> remotePrinterRecipes = new ArrayList<>();
    public static ArrayList<RecipeData> remoteToasterRecipes = new ArrayList<>();
    public static ArrayList<RecipeData> remoteChoppingBoardRecipes = new ArrayList<>();
    public static ArrayList<RecipeData> remoteBlenderRecipes = new ArrayList<>();
    public static ArrayList<RecipeData> remoteDishwasherRecipes = new ArrayList<>();
    public static ArrayList<RecipeData> remoteWashingMachineRecipes = new ArrayList<>();
    public static ArrayList<RecipeData> remoteMicrowaveRecipes = new ArrayList<>();
    public static ArrayList<RecipeData> remoteGrillRecipes = new ArrayList<>();

    public static RecipeData[] getMineBayItems()
    {
        return getRecipes("minebay").toArray(new RecipeData[0]);
    }

    public static RecipeData getOvenRecipeFromInput(ItemStack itemStack)
    {
        ArrayList<RecipeData> recipes = getRecipes("oven");
        for(RecipeData recipe : recipes)
        {
            ItemStack validItemStack = recipe.getInput();
            if(validItemStack.getItem() == itemStack.getItem())
            {
                if(validItemStack.getItemDamage() == itemStack.getItemDamage())
                {
                    return recipe;
                }
            }
        }
        return null;
    }

    public static RecipeData getFreezerRecipeFromInput(ItemStack itemStack)
    {
        ArrayList<RecipeData> recipes = getRecipes("freezer");
        for(RecipeData recipe : recipes)
        {
            ItemStack validItemStack = recipe.getInput();
            if(validItemStack.getItem() == itemStack.getItem())
            {
                if(validItemStack.getItemDamage() == itemStack.getItemDamage())
                {
                    return recipe;
                }
            }
        }
        return null;
    }

    public static RecipeData getPrinterRecipeFromInput(ItemStack itemStack)
    {
        ArrayList<RecipeData> recipes = getRecipes("printer");
        for(RecipeData recipe : recipes)
        {
            ItemStack validItemStack = recipe.getInput();
            if(validItemStack.getItem() == itemStack.getItem())
            {
                if(validItemStack.getItemDamage() == itemStack.getItemDamage())
                {
                    if(itemStack.getCount() == 1)
                    {
                        return recipe;
                    }
                }
            }
        }
        return null;
    }

    public static RecipeData getToasterRecipeFormInput(ItemStack itemStack)
    {
        ArrayList<RecipeData> recipes = getRecipes("toaster");
        for(RecipeData recipe : recipes)
        {
            ItemStack validItemStack = recipe.getInput();
            if(validItemStack.getItem() == itemStack.getItem())
            {
                if(validItemStack.getItemDamage() == itemStack.getItemDamage())
                {
                    return recipe;
                }
            }
        }
        return null;
    }

    public static RecipeData getChoppingBoardRecipeFromInput(ItemStack itemStack)
    {
        ArrayList<RecipeData> recipes = getRecipes("choppingboard");
        for(RecipeData recipe : recipes)
        {
            ItemStack validItemStack = recipe.getInput();
            if(validItemStack.getItem() == itemStack.getItem())
            {
                if(validItemStack.getItemDamage() == itemStack.getItemDamage())
                {
                    return recipe;
                }
            }
        }
        return null;
    }

    public static RecipeData getBlenderRecipeFromIngredients(ItemStack[] itemStack)
    {
        ArrayList<RecipeData> recipes = getRecipes("blender");
        for(RecipeData recipe : recipes)
        {
            int count = 0;
            ArrayList<ItemStack> ingredients = recipe.getIngredients();
            for(ItemStack item : itemStack)
            {
                if(item != null)
                {
                    for(ItemStack ingredient : ingredients)
                    {
                        if(ingredient.getItem() == item.getItem())
                        {
                            if(ingredient.getCount() == item.getCount())
                            {
                                if(ingredient.getItemDamage() == item.getItemDamage())
                                {
                                    count++;
                                }
                            }
                        }
                        if(count == ingredients.size())
                        {
                            return recipe;
                        }
                    }
                }
            }
        }
        return null;
    }

    public static RecipeData getMicrowaveRecipeFromInput(ItemStack itemStack)
    {
        ArrayList<RecipeData> recipes = getRecipes("microwave");
        for(RecipeData recipe : recipes)
        {
            ItemStack validItemStack = recipe.getInput();
            if(validItemStack.getItem() == itemStack.getItem())
            {
                if(validItemStack.getItemDamage() == itemStack.getItemDamage())
                {
                    return recipe;
                }
            }
        }
        return null;
    }

    public static RecipeData getWashingMachineRecipeFromInput(ItemStack itemStack)
    {
        ArrayList<RecipeData> recipes = getRecipes("washingmachine");
        for(RecipeData recipe : recipes)
        {
            ItemStack validItemStack = recipe.getInput();
            if(validItemStack.getItem() == itemStack.getItem())
            {
                return recipe;
            }
        }
        return null;
    }

    public static RecipeData getDishwasherRecipeFromInput(ItemStack itemStack)
    {
        ArrayList<RecipeData> recipes = getRecipes("dishwasher");
        for(RecipeData recipe : recipes)
        {
            ItemStack validItemStack = recipe.getInput();
            if(validItemStack.getItem() == itemStack.getItem())
            {
                return recipe;
            }
        }
        return null;
    }

    public static RecipeData getGrillRecipeFromInput(ItemStack itemStack)
    {
        ArrayList<RecipeData> recipes = getRecipes("grill");
        for(RecipeData recipe : recipes)
        {
            ItemStack validItemStack = recipe.getInput();
            if(validItemStack.getItem() == itemStack.getItem())
            {
                if(validItemStack.getItemDamage() == itemStack.getItemDamage())
                {
                    return recipe;
                }
            }
        }
        return null;
    }

    public static void updateDataList()
    {
        recipeData.clear();
        for(RecipeData data : localMineBayRecipes)
        {
            recipeData.add("type=minebay," + data.toString());
        }
        for(RecipeData data : localOvenRecipes)
        {
            recipeData.add("type=oven," + data.toString());
        }
        for(RecipeData data : localFreezerRecipes)
        {
            recipeData.add("type=freezer," + data.toString());
        }
        for(RecipeData data : localPrinterRecipes)
        {
            recipeData.add("type=printer," + data.toString());
        }
        for(RecipeData data : localToasterRecipes)
        {
            recipeData.add("type=toaster," + data.toString());
        }
        for(RecipeData data : localChoppingBoardRecipes)
        {
            recipeData.add("type=choppingboard," + data.toString());
        }
        for(RecipeData data : localBlenderRecipes)
        {
            recipeData.add("type=blender," + data.toString());
        }
        for(RecipeData data : localMicrowaveRecipes)
        {
            recipeData.add("type=microwave," + data.toString());
        }
        for(RecipeData data : localWashingMachineRecipes)
        {
            recipeData.add("type=washingmachine," + data.toString());
        }
        for(RecipeData data : localDishwasherRecipes)
        {
            recipeData.add("type=dishwasher," + data.toString());
        }
        for(RecipeData data : localGrillRecipes)
        {
            recipeData.add("type=grill," + data.toString());
        }
    }

    public static ArrayList<RecipeData> getRecipes(String type)
    {
        if(MrCrayfishFurnitureMod.proxy.isSinglePlayer() || MrCrayfishFurnitureMod.proxy.isDedicatedServer())
        {
            if(type.equalsIgnoreCase("minebay"))
            {
                return localMineBayRecipes;
            }
            else if(type.equalsIgnoreCase("freezer"))
            {
                return localFreezerRecipes;
            }
            else if(type.equalsIgnoreCase("oven"))
            {
                return localOvenRecipes;
            }
            else if(type.equalsIgnoreCase("printer"))
            {
                return localPrinterRecipes;
            }
            else if(type.equalsIgnoreCase("toaster"))
            {
                return localToasterRecipes;
            }
            else if(type.equalsIgnoreCase("choppingboard"))
            {
                return localChoppingBoardRecipes;
            }
            else if(type.equalsIgnoreCase("blender"))
            {
                return localBlenderRecipes;
            }
            else if(type.equalsIgnoreCase("microwave"))
            {
                return localMicrowaveRecipes;
            }
            else if(type.equalsIgnoreCase("washingmachine"))
            {
                return localWashingMachineRecipes;
            }
            else if(type.equalsIgnoreCase("dishwasher"))
            {
                return localDishwasherRecipes;
            }
            else if(type.equalsIgnoreCase("grill"))
            {
                return localGrillRecipes;
            }
        }
        else
        {
            if(type.equalsIgnoreCase("minebay"))
            {
                return remoteMineBayRecipes;
            }
            else if(type.equalsIgnoreCase("freezer"))
            {
                return remoteFreezerRecipes;
            }
            else if(type.equalsIgnoreCase("oven"))
            {
                return remoteOvenRecipes;
            }
            else if(type.equalsIgnoreCase("printer"))
            {
                return remotePrinterRecipes;
            }
            else if(type.equalsIgnoreCase("toaster"))
            {
                return remoteToasterRecipes;
            }
            else if(type.equalsIgnoreCase("choppingboard"))
            {
                return remoteChoppingBoardRecipes;
            }
            else if(type.equalsIgnoreCase("blender"))
            {
                return remoteBlenderRecipes;
            }
            else if(type.equalsIgnoreCase("microwave"))
            {
                return remoteMicrowaveRecipes;
            }
            else if(type.equalsIgnoreCase("washingmachine"))
            {
                return remoteWashingMachineRecipes;
            }
            else if(type.equalsIgnoreCase("dishwasher"))
            {
                return remoteDishwasherRecipes;
            }
            else if(type.equalsIgnoreCase("grill"))
            {
                return remoteGrillRecipes;
            }
        }
        return new ArrayList<>();
    }

    public static void addCommRecipesToLocal()
    {
        localMineBayRecipes.addAll(commMineBayRecipes);
        localOvenRecipes.addAll(commOvenRecipes);
        localFreezerRecipes.addAll(commFreezerRecipes);
        localPrinterRecipes.addAll(commPrinterRecipes);
        localToasterRecipes.addAll(commToasterRecipes);
        localChoppingBoardRecipes.addAll(commChoppingBoardRecipes);
        localBlenderRecipes.addAll(commBlenderRecipes);
        localMicrowaveRecipes.addAll(commMicrowaveRecipes);
        localWashingMachineRecipes.addAll(commWashingMachineRecipes);
        localDishwasherRecipes.addAll(commDishwasherRecipes);
        localGrillRecipes.addAll(commGrillRecipes);
    }

    public static void clearLocalRecipes()
    {
        localMineBayRecipes.clear();
        localOvenRecipes.clear();
        localFreezerRecipes.clear();
        localPrinterRecipes.clear();
        localToasterRecipes.clear();
        localChoppingBoardRecipes.clear();
        localBlenderRecipes.clear();
        localMicrowaveRecipes.clear();
        localWashingMachineRecipes.clear();
        localDishwasherRecipes.clear();
        localGrillRecipes.clear();
    }

    public static void clearRemoteRecipes()
    {
        remoteMineBayRecipes.clear();
        remoteOvenRecipes.clear();
        remoteFreezerRecipes.clear();
        remotePrinterRecipes.clear();
        remoteToasterRecipes.clear();
        remoteChoppingBoardRecipes.clear();
        remoteBlenderRecipes.clear();
        remoteMicrowaveRecipes.clear();
        remoteWashingMachineRecipes.clear();
        remoteDishwasherRecipes.clear();
        remoteGrillRecipes.clear();
    }

    public static void clearCommRecipes()
    {
        commMineBayRecipes.clear();
        commOvenRecipes.clear();
        commFreezerRecipes.clear();
        commPrinterRecipes.clear();
        commToasterRecipes.clear();
        commChoppingBoardRecipes.clear();
        commBlenderRecipes.clear();
        commMicrowaveRecipes.clear();
        commWashingMachineRecipes.clear();
        commDishwasherRecipes.clear();
        commGrillRecipes.clear();
    }

    public static void clearAll()
    {
        clearLocalRecipes();
        clearRemoteRecipes();
        clearCommRecipes();
    }
}
