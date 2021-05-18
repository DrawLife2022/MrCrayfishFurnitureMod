package com.mrcrayfish.furniture.datagen;

import com.mrcrayfish.furniture.Reference;
import com.mrcrayfish.furniture.common.ModTags;
import com.mrcrayfish.furniture.core.ModBlocks;
import net.minecraft.data.BlockTagsProvider;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.ExistingFileHelper;

/**
 * @author Ocelot
 */
public class BlockTagGen extends BlockTagsProvider
{
    public BlockTagGen(DataGenerator generatorIn, ExistingFileHelper existingFileHelper)
    {
        super(generatorIn, Reference.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerTags()
    {
        // Picket fences connect to other picket fences
        this.getOrCreateBuilder(ModTags.Blocks.PICKET_FENCES)
                .add(ModBlocks.PICKET_FENCE_WHITE.get())
                .add(ModBlocks.PICKET_FENCE_ORANGE.get())
                .add(ModBlocks.PICKET_FENCE_MAGENTA.get())
                .add(ModBlocks.PICKET_FENCE_LIGHT_BLUE.get())
                .add(ModBlocks.PICKET_FENCE_YELLOW.get())
                .add(ModBlocks.PICKET_FENCE_LIME.get())
                .add(ModBlocks.PICKET_FENCE_PINK.get())
                .add(ModBlocks.PICKET_FENCE_GRAY.get())
                .add(ModBlocks.PICKET_FENCE_LIGHT_GRAY.get())
                .add(ModBlocks.PICKET_FENCE_CYAN.get())
                .add(ModBlocks.PICKET_FENCE_PURPLE.get())
                .add(ModBlocks.PICKET_FENCE_BLUE.get())
                .add(ModBlocks.PICKET_FENCE_BROWN.get())
                .add(ModBlocks.PICKET_FENCE_GREEN.get())
                .add(ModBlocks.PICKET_FENCE_RED.get())
                .add(ModBlocks.PICKET_FENCE_BLACK.get());

        // Picket fences are considered "upgraded" since they work the same. The tag is used for connecting
        this.getOrCreateBuilder(ModTags.Blocks.UPGRADED_FENCES)
                .addTag(ModTags.Blocks.PICKET_FENCES)
                .add(ModBlocks.UPGRADED_FENCE_OAK.get())
                .add(ModBlocks.UPGRADED_FENCE_SPRUCE.get())
                .add(ModBlocks.UPGRADED_FENCE_BIRCH.get())
                .add(ModBlocks.UPGRADED_FENCE_JUNGLE.get())
                .add(ModBlocks.UPGRADED_FENCE_ACACIA.get())
                .add(ModBlocks.UPGRADED_FENCE_DARK_OAK.get())
                .add(ModBlocks.UPGRADED_FENCE_STRIPPED_OAK.get())
                .add(ModBlocks.UPGRADED_FENCE_STRIPPED_SPRUCE.get())
                .add(ModBlocks.UPGRADED_FENCE_STRIPPED_BIRCH.get())
                .add(ModBlocks.UPGRADED_FENCE_STRIPPED_JUNGLE.get())
                .add(ModBlocks.UPGRADED_FENCE_STRIPPED_ACACIA.get())
                .add(ModBlocks.UPGRADED_FENCE_STRIPPED_DARK_OAK.get());

        // Picket fence gates connect to other picket fence gates
        this.getOrCreateBuilder(ModTags.Blocks.PICKET_FENCE_GATES)
                .add(ModBlocks.PICKET_GATE_WHITE.get())
                .add(ModBlocks.PICKET_GATE_ORANGE.get())
                .add(ModBlocks.PICKET_GATE_MAGENTA.get())
                .add(ModBlocks.PICKET_GATE_LIGHT_BLUE.get())
                .add(ModBlocks.PICKET_GATE_YELLOW.get())
                .add(ModBlocks.PICKET_GATE_LIME.get())
                .add(ModBlocks.PICKET_GATE_PINK.get())
                .add(ModBlocks.PICKET_GATE_GRAY.get())
                .add(ModBlocks.PICKET_GATE_LIGHT_GRAY.get())
                .add(ModBlocks.PICKET_GATE_CYAN.get())
                .add(ModBlocks.PICKET_GATE_PURPLE.get())
                .add(ModBlocks.PICKET_GATE_BLUE.get())
                .add(ModBlocks.PICKET_GATE_BROWN.get())
                .add(ModBlocks.PICKET_GATE_GREEN.get())
                .add(ModBlocks.PICKET_GATE_RED.get())
                .add(ModBlocks.PICKET_GATE_BLACK.get());

        // Picket fence gates are considered "upgraded" since they work the same.
        this.getOrCreateBuilder(ModTags.Blocks.UPGRADED_FENCE_GATES)
                .addTag(ModTags.Blocks.PICKET_FENCE_GATES)
                .add(ModBlocks.UPGRADED_GATE_OAK.get())
                .add(ModBlocks.UPGRADED_GATE_SPRUCE.get())
                .add(ModBlocks.UPGRADED_GATE_BIRCH.get())
                .add(ModBlocks.UPGRADED_GATE_JUNGLE.get())
                .add(ModBlocks.UPGRADED_GATE_ACACIA.get())
                .add(ModBlocks.UPGRADED_GATE_DARK_OAK.get())
                .add(ModBlocks.UPGRADED_GATE_STRIPPED_OAK.get())
                .add(ModBlocks.UPGRADED_GATE_STRIPPED_SPRUCE.get())
                .add(ModBlocks.UPGRADED_GATE_STRIPPED_BIRCH.get())
                .add(ModBlocks.UPGRADED_GATE_STRIPPED_JUNGLE.get())
                .add(ModBlocks.UPGRADED_GATE_STRIPPED_ACACIA.get())
                .add(ModBlocks.UPGRADED_GATE_STRIPPED_DARK_OAK.get());

        this.getOrCreateBuilder(ModTags.Blocks.HEDGES)
                .add(ModBlocks.HEDGE_OAK.get())
                .add(ModBlocks.HEDGE_SPRUCE.get())
                .add(ModBlocks.HEDGE_BIRCH.get())
                .add(ModBlocks.HEDGE_JUNGLE.get())
                .add(ModBlocks.HEDGE_ACACIA.get())
                .add(ModBlocks.HEDGE_DARK_OAK.get());
    }
}
