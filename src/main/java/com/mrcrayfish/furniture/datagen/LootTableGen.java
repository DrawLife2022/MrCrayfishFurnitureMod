package com.mrcrayfish.furniture.datagen;

import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;
import com.mrcrayfish.furniture.Reference;
import com.mrcrayfish.furniture.block.CoffeeTableBlock;
import com.mrcrayfish.furniture.core.ModBlocks;
import net.minecraft.advancements.critereon.StatePropertiesPredicate;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.loot.BlockLoot;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.ValidationContext;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.CopyNameFunction;
import net.minecraft.world.level.storage.loot.functions.CopyNbtFunction;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSet;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;
import net.minecraft.world.level.storage.loot.predicates.LootItemBlockStatePropertyCondition;
import net.minecraft.world.level.storage.loot.providers.nbt.ContextNbtProvider;
import net.minecraft.world.level.storage.loot.providers.number.ConstantValue;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.stream.Collectors;

/**
 * @author Ocelot
 */
public class LootTableGen extends LootTableProvider
{
    private final List<Pair<Supplier<Consumer<BiConsumer<ResourceLocation, LootTable.Builder>>>, LootContextParamSet>> tables = ImmutableList.of(Pair.of(BlockProvider::new, LootContextParamSets.BLOCK));

    public LootTableGen(DataGenerator generator)
    {
        super(generator);
    }

    @Override
    public List<Pair<Supplier<Consumer<BiConsumer<ResourceLocation, LootTable.Builder>>>, LootContextParamSet>> getTables()
    {
        return this.tables;
    }

    @Override
    protected void validate(Map<ResourceLocation, LootTable> map, ValidationContext context) {}

    private static class BlockProvider extends BlockLoot
    {
        @Override
        protected void addTables()
        {
            this.dropSelf(ModBlocks.TABLE_OAK.get());
            this.dropSelf(ModBlocks.TABLE_SPRUCE.get());
            this.dropSelf(ModBlocks.TABLE_BIRCH.get());
            this.dropSelf(ModBlocks.TABLE_JUNGLE.get());
            this.dropSelf(ModBlocks.TABLE_ACACIA.get());
            this.dropSelf(ModBlocks.TABLE_DARK_OAK.get());
            this.dropSelf(ModBlocks.TABLE_CRIMSON.get());
            this.dropSelf(ModBlocks.TABLE_WARPED.get());
            this.dropSelf(ModBlocks.TABLE_STONE.get());
            this.dropSelf(ModBlocks.TABLE_GRANITE.get());
            this.dropSelf(ModBlocks.TABLE_DIORITE.get());
            this.dropSelf(ModBlocks.TABLE_ANDESITE.get());
            this.dropSelf(ModBlocks.TABLE_STRIPPED_OAK.get());
            this.dropSelf(ModBlocks.TABLE_STRIPPED_SPRUCE.get());
            this.dropSelf(ModBlocks.TABLE_STRIPPED_BIRCH.get());
            this.dropSelf(ModBlocks.TABLE_STRIPPED_JUNGLE.get());
            this.dropSelf(ModBlocks.TABLE_STRIPPED_ACACIA.get());
            this.dropSelf(ModBlocks.TABLE_STRIPPED_DARK_OAK.get());
            this.dropSelf(ModBlocks.TABLE_STRIPPED_CRIMSON.get());
            this.dropSelf(ModBlocks.TABLE_STRIPPED_WARPED.get());
            this.dropSelf(ModBlocks.CHAIR_OAK.get());
            this.dropSelf(ModBlocks.CHAIR_SPRUCE.get());
            this.dropSelf(ModBlocks.CHAIR_BIRCH.get());
            this.dropSelf(ModBlocks.CHAIR_JUNGLE.get());
            this.dropSelf(ModBlocks.CHAIR_ACACIA.get());
            this.dropSelf(ModBlocks.CHAIR_DARK_OAK.get());
            this.dropSelf(ModBlocks.CHAIR_CRIMSON.get());
            this.dropSelf(ModBlocks.CHAIR_WARPED.get());
            this.dropSelf(ModBlocks.CHAIR_STONE.get());
            this.dropSelf(ModBlocks.CHAIR_GRANITE.get());
            this.dropSelf(ModBlocks.CHAIR_DIORITE.get());
            this.dropSelf(ModBlocks.CHAIR_ANDESITE.get());
            this.dropSelf(ModBlocks.CHAIR_STRIPPED_OAK.get());
            this.dropSelf(ModBlocks.CHAIR_STRIPPED_SPRUCE.get());
            this.dropSelf(ModBlocks.CHAIR_STRIPPED_BIRCH.get());
            this.dropSelf(ModBlocks.CHAIR_STRIPPED_JUNGLE.get());
            this.dropSelf(ModBlocks.CHAIR_STRIPPED_ACACIA.get());
            this.dropSelf(ModBlocks.CHAIR_STRIPPED_DARK_OAK.get());
            this.dropSelf(ModBlocks.CHAIR_STRIPPED_CRIMSON.get());
            this.dropSelf(ModBlocks.CHAIR_STRIPPED_WARPED.get());
            this.registerCoffeeTable(ModBlocks.COFFEE_TABLE_OAK.get());
            this.registerCoffeeTable(ModBlocks.COFFEE_TABLE_SPRUCE.get());
            this.registerCoffeeTable(ModBlocks.COFFEE_TABLE_BIRCH.get());
            this.registerCoffeeTable(ModBlocks.COFFEE_TABLE_JUNGLE.get());
            this.registerCoffeeTable(ModBlocks.COFFEE_TABLE_ACACIA.get());
            this.registerCoffeeTable(ModBlocks.COFFEE_TABLE_DARK_OAK.get());
            this.registerCoffeeTable(ModBlocks.COFFEE_TABLE_CRIMSON.get());
            this.registerCoffeeTable(ModBlocks.COFFEE_TABLE_WARPED.get());
            this.registerCoffeeTable(ModBlocks.COFFEE_TABLE_STONE.get());
            this.registerCoffeeTable(ModBlocks.COFFEE_TABLE_GRANITE.get());
            this.registerCoffeeTable(ModBlocks.COFFEE_TABLE_DIORITE.get());
            this.registerCoffeeTable(ModBlocks.COFFEE_TABLE_ANDESITE.get());
            this.registerCoffeeTable(ModBlocks.COFFEE_TABLE_STRIPPED_OAK.get());
            this.registerCoffeeTable(ModBlocks.COFFEE_TABLE_STRIPPED_SPRUCE.get());
            this.registerCoffeeTable(ModBlocks.COFFEE_TABLE_STRIPPED_BIRCH.get());
            this.registerCoffeeTable(ModBlocks.COFFEE_TABLE_STRIPPED_JUNGLE.get());
            this.registerCoffeeTable(ModBlocks.COFFEE_TABLE_STRIPPED_ACACIA.get());
            this.registerCoffeeTable(ModBlocks.COFFEE_TABLE_STRIPPED_DARK_OAK.get());
            this.registerCoffeeTable(ModBlocks.COFFEE_TABLE_STRIPPED_CRIMSON.get());
            this.registerCoffeeTable(ModBlocks.COFFEE_TABLE_STRIPPED_WARPED.get());
            this.dropSelf(ModBlocks.CABINET_OAK.get());
            this.dropSelf(ModBlocks.CABINET_SPRUCE.get());
            this.dropSelf(ModBlocks.CABINET_BIRCH.get());
            this.dropSelf(ModBlocks.CABINET_JUNGLE.get());
            this.dropSelf(ModBlocks.CABINET_ACACIA.get());
            this.dropSelf(ModBlocks.CABINET_DARK_OAK.get());
            this.dropSelf(ModBlocks.CABINET_CRIMSON.get());
            this.dropSelf(ModBlocks.CABINET_WARPED.get());
            this.dropSelf(ModBlocks.CABINET_STONE.get());
            this.dropSelf(ModBlocks.CABINET_GRANITE.get());
            this.dropSelf(ModBlocks.CABINET_DIORITE.get());
            this.dropSelf(ModBlocks.CABINET_ANDESITE.get());
            this.dropSelf(ModBlocks.CABINET_STRIPPED_OAK.get());
            this.dropSelf(ModBlocks.CABINET_STRIPPED_SPRUCE.get());
            this.dropSelf(ModBlocks.CABINET_STRIPPED_BIRCH.get());
            this.dropSelf(ModBlocks.CABINET_STRIPPED_JUNGLE.get());
            this.dropSelf(ModBlocks.CABINET_STRIPPED_ACACIA.get());
            this.dropSelf(ModBlocks.CABINET_STRIPPED_DARK_OAK.get());
            this.dropSelf(ModBlocks.CABINET_STRIPPED_CRIMSON.get());
            this.dropSelf(ModBlocks.CABINET_STRIPPED_WARPED.get());
            this.dropSelf(ModBlocks.BEDSIDE_CABINET_OAK.get());
            this.dropSelf(ModBlocks.BEDSIDE_CABINET_SPRUCE.get());
            this.dropSelf(ModBlocks.BEDSIDE_CABINET_BIRCH.get());
            this.dropSelf(ModBlocks.BEDSIDE_CABINET_JUNGLE.get());
            this.dropSelf(ModBlocks.BEDSIDE_CABINET_ACACIA.get());
            this.dropSelf(ModBlocks.BEDSIDE_CABINET_DARK_OAK.get());
            this.dropSelf(ModBlocks.BEDSIDE_CABINET_CRIMSON.get());
            this.dropSelf(ModBlocks.BEDSIDE_CABINET_WARPED.get());
            this.dropSelf(ModBlocks.BEDSIDE_CABINET_STONE.get());
            this.dropSelf(ModBlocks.BEDSIDE_CABINET_GRANITE.get());
            this.dropSelf(ModBlocks.BEDSIDE_CABINET_DIORITE.get());
            this.dropSelf(ModBlocks.BEDSIDE_CABINET_ANDESITE.get());
            this.dropSelf(ModBlocks.BEDSIDE_CABINET_STRIPPED_OAK.get());
            this.dropSelf(ModBlocks.BEDSIDE_CABINET_STRIPPED_SPRUCE.get());
            this.dropSelf(ModBlocks.BEDSIDE_CABINET_STRIPPED_BIRCH.get());
            this.dropSelf(ModBlocks.BEDSIDE_CABINET_STRIPPED_JUNGLE.get());
            this.dropSelf(ModBlocks.BEDSIDE_CABINET_STRIPPED_ACACIA.get());
            this.dropSelf(ModBlocks.BEDSIDE_CABINET_STRIPPED_DARK_OAK.get());
            this.dropSelf(ModBlocks.BEDSIDE_CABINET_STRIPPED_CRIMSON.get());
            this.dropSelf(ModBlocks.BEDSIDE_CABINET_STRIPPED_WARPED.get());
            this.dropSelf(ModBlocks.DESK_OAK.get());
            this.dropSelf(ModBlocks.DESK_SPRUCE.get());
            this.dropSelf(ModBlocks.DESK_BIRCH.get());
            this.dropSelf(ModBlocks.DESK_JUNGLE.get());
            this.dropSelf(ModBlocks.DESK_ACACIA.get());
            this.dropSelf(ModBlocks.DESK_DARK_OAK.get());
            this.dropSelf(ModBlocks.DESK_CRIMSON.get());
            this.dropSelf(ModBlocks.DESK_WARPED.get());
            this.dropSelf(ModBlocks.DESK_STONE.get());
            this.dropSelf(ModBlocks.DESK_GRANITE.get());
            this.dropSelf(ModBlocks.DESK_DIORITE.get());
            this.dropSelf(ModBlocks.DESK_ANDESITE.get());
            this.dropSelf(ModBlocks.DESK_STRIPPED_OAK.get());
            this.dropSelf(ModBlocks.DESK_STRIPPED_SPRUCE.get());
            this.dropSelf(ModBlocks.DESK_STRIPPED_BIRCH.get());
            this.dropSelf(ModBlocks.DESK_STRIPPED_JUNGLE.get());
            this.dropSelf(ModBlocks.DESK_STRIPPED_ACACIA.get());
            this.dropSelf(ModBlocks.DESK_STRIPPED_DARK_OAK.get());
            this.dropSelf(ModBlocks.DESK_STRIPPED_CRIMSON.get());
            this.dropSelf(ModBlocks.DESK_STRIPPED_WARPED.get());
            this.dropSelf(ModBlocks.DESK_CABINET_OAK.get());
            this.dropSelf(ModBlocks.DESK_CABINET_SPRUCE.get());
            this.dropSelf(ModBlocks.DESK_CABINET_BIRCH.get());
            this.dropSelf(ModBlocks.DESK_CABINET_JUNGLE.get());
            this.dropSelf(ModBlocks.DESK_CABINET_ACACIA.get());
            this.dropSelf(ModBlocks.DESK_CABINET_DARK_OAK.get());
            this.dropSelf(ModBlocks.DESK_CABINET_CRIMSON.get());
            this.dropSelf(ModBlocks.DESK_CABINET_WARPED.get());
            this.dropSelf(ModBlocks.DESK_CABINET_STONE.get());
            this.dropSelf(ModBlocks.DESK_CABINET_GRANITE.get());
            this.dropSelf(ModBlocks.DESK_CABINET_DIORITE.get());
            this.dropSelf(ModBlocks.DESK_CABINET_ANDESITE.get());
            this.dropSelf(ModBlocks.DESK_CABINET_STRIPPED_OAK.get());
            this.dropSelf(ModBlocks.DESK_CABINET_STRIPPED_SPRUCE.get());
            this.dropSelf(ModBlocks.DESK_CABINET_STRIPPED_BIRCH.get());
            this.dropSelf(ModBlocks.DESK_CABINET_STRIPPED_JUNGLE.get());
            this.dropSelf(ModBlocks.DESK_CABINET_STRIPPED_ACACIA.get());
            this.dropSelf(ModBlocks.DESK_CABINET_STRIPPED_DARK_OAK.get());
            this.dropSelf(ModBlocks.DESK_CABINET_STRIPPED_CRIMSON.get());
            this.dropSelf(ModBlocks.DESK_CABINET_STRIPPED_WARPED.get());
            this.dropSelf(ModBlocks.SOFA_WHITE.get());
            this.dropSelf(ModBlocks.SOFA_ORANGE.get());
            this.dropSelf(ModBlocks.SOFA_MAGENTA.get());
            this.dropSelf(ModBlocks.SOFA_LIGHT_BLUE.get());
            this.dropSelf(ModBlocks.SOFA_YELLOW.get());
            this.dropSelf(ModBlocks.SOFA_LIME.get());
            this.dropSelf(ModBlocks.SOFA_PINK.get());
            this.dropSelf(ModBlocks.SOFA_GRAY.get());
            this.dropSelf(ModBlocks.SOFA_LIGHT_GRAY.get());
            this.dropSelf(ModBlocks.SOFA_CYAN.get());
            this.dropSelf(ModBlocks.SOFA_PURPLE.get());
            this.dropSelf(ModBlocks.SOFA_BLUE.get());
            this.dropSelf(ModBlocks.SOFA_BROWN.get());
            this.dropSelf(ModBlocks.SOFA_GREEN.get());
            this.dropSelf(ModBlocks.SOFA_RED.get());
            this.dropSelf(ModBlocks.SOFA_BLACK.get());
            this.dropSelf(ModBlocks.SOFA_RAINBOW.get());
            this.dropSelf(ModBlocks.BLINDS_OAK.get());
            this.dropSelf(ModBlocks.BLINDS_SPRUCE.get());
            this.dropSelf(ModBlocks.BLINDS_BIRCH.get());
            this.dropSelf(ModBlocks.BLINDS_JUNGLE.get());
            this.dropSelf(ModBlocks.BLINDS_ACACIA.get());
            this.dropSelf(ModBlocks.BLINDS_DARK_OAK.get());
            this.dropSelf(ModBlocks.BLINDS_CRIMSON.get());
            this.dropSelf(ModBlocks.BLINDS_WARPED.get());
            this.dropSelf(ModBlocks.BLINDS_STRIPPED_OAK.get());
            this.dropSelf(ModBlocks.BLINDS_STRIPPED_SPRUCE.get());
            this.dropSelf(ModBlocks.BLINDS_STRIPPED_BIRCH.get());
            this.dropSelf(ModBlocks.BLINDS_STRIPPED_JUNGLE.get());
            this.dropSelf(ModBlocks.BLINDS_STRIPPED_ACACIA.get());
            this.dropSelf(ModBlocks.BLINDS_STRIPPED_DARK_OAK.get());
            this.dropSelf(ModBlocks.BLINDS_STRIPPED_CRIMSON.get());
            this.dropSelf(ModBlocks.BLINDS_STRIPPED_WARPED.get());
            this.dropSelf(ModBlocks.UPGRADED_FENCE_OAK.get());
            this.dropSelf(ModBlocks.UPGRADED_FENCE_SPRUCE.get());
            this.dropSelf(ModBlocks.UPGRADED_FENCE_BIRCH.get());
            this.dropSelf(ModBlocks.UPGRADED_FENCE_JUNGLE.get());
            this.dropSelf(ModBlocks.UPGRADED_FENCE_ACACIA.get());
            this.dropSelf(ModBlocks.UPGRADED_FENCE_DARK_OAK.get());
            this.dropSelf(ModBlocks.UPGRADED_FENCE_CRIMSON.get());
            this.dropSelf(ModBlocks.UPGRADED_FENCE_WARPED.get());
            this.dropSelf(ModBlocks.UPGRADED_FENCE_STRIPPED_OAK.get());
            this.dropSelf(ModBlocks.UPGRADED_FENCE_STRIPPED_SPRUCE.get());
            this.dropSelf(ModBlocks.UPGRADED_FENCE_STRIPPED_BIRCH.get());
            this.dropSelf(ModBlocks.UPGRADED_FENCE_STRIPPED_JUNGLE.get());
            this.dropSelf(ModBlocks.UPGRADED_FENCE_STRIPPED_ACACIA.get());
            this.dropSelf(ModBlocks.UPGRADED_FENCE_STRIPPED_DARK_OAK.get());
            this.dropSelf(ModBlocks.UPGRADED_FENCE_STRIPPED_CRIMSON.get());
            this.dropSelf(ModBlocks.UPGRADED_FENCE_STRIPPED_WARPED.get());
            this.dropSelf(ModBlocks.UPGRADED_GATE_OAK.get());
            this.dropSelf(ModBlocks.UPGRADED_GATE_SPRUCE.get());
            this.dropSelf(ModBlocks.UPGRADED_GATE_BIRCH.get());
            this.dropSelf(ModBlocks.UPGRADED_GATE_JUNGLE.get());
            this.dropSelf(ModBlocks.UPGRADED_GATE_ACACIA.get());
            this.dropSelf(ModBlocks.UPGRADED_GATE_DARK_OAK.get());
            this.dropSelf(ModBlocks.UPGRADED_GATE_CRIMSON.get());
            this.dropSelf(ModBlocks.UPGRADED_GATE_WARPED.get());
            this.dropSelf(ModBlocks.UPGRADED_GATE_STRIPPED_OAK.get());
            this.dropSelf(ModBlocks.UPGRADED_GATE_STRIPPED_SPRUCE.get());
            this.dropSelf(ModBlocks.UPGRADED_GATE_STRIPPED_BIRCH.get());
            this.dropSelf(ModBlocks.UPGRADED_GATE_STRIPPED_JUNGLE.get());
            this.dropSelf(ModBlocks.UPGRADED_GATE_STRIPPED_ACACIA.get());
            this.dropSelf(ModBlocks.UPGRADED_GATE_STRIPPED_DARK_OAK.get());
            this.dropSelf(ModBlocks.UPGRADED_GATE_STRIPPED_CRIMSON.get());
            this.dropSelf(ModBlocks.UPGRADED_GATE_STRIPPED_WARPED.get());
            this.dropSelf(ModBlocks.PICKET_FENCE_WHITE.get());
            this.dropSelf(ModBlocks.PICKET_FENCE_ORANGE.get());
            this.dropSelf(ModBlocks.PICKET_FENCE_MAGENTA.get());
            this.dropSelf(ModBlocks.PICKET_FENCE_LIGHT_BLUE.get());
            this.dropSelf(ModBlocks.PICKET_FENCE_YELLOW.get());
            this.dropSelf(ModBlocks.PICKET_FENCE_LIME.get());
            this.dropSelf(ModBlocks.PICKET_FENCE_PINK.get());
            this.dropSelf(ModBlocks.PICKET_FENCE_GRAY.get());
            this.dropSelf(ModBlocks.PICKET_FENCE_LIGHT_GRAY.get());
            this.dropSelf(ModBlocks.PICKET_FENCE_CYAN.get());
            this.dropSelf(ModBlocks.PICKET_FENCE_PURPLE.get());
            this.dropSelf(ModBlocks.PICKET_FENCE_BLUE.get());
            this.dropSelf(ModBlocks.PICKET_FENCE_BROWN.get());
            this.dropSelf(ModBlocks.PICKET_FENCE_GREEN.get());
            this.dropSelf(ModBlocks.PICKET_FENCE_RED.get());
            this.dropSelf(ModBlocks.PICKET_FENCE_BLACK.get());
            this.dropSelf(ModBlocks.PICKET_GATE_WHITE.get());
            this.dropSelf(ModBlocks.PICKET_GATE_ORANGE.get());
            this.dropSelf(ModBlocks.PICKET_GATE_MAGENTA.get());
            this.dropSelf(ModBlocks.PICKET_GATE_LIGHT_BLUE.get());
            this.dropSelf(ModBlocks.PICKET_GATE_YELLOW.get());
            this.dropSelf(ModBlocks.PICKET_GATE_LIME.get());
            this.dropSelf(ModBlocks.PICKET_GATE_PINK.get());
            this.dropSelf(ModBlocks.PICKET_GATE_GRAY.get());
            this.dropSelf(ModBlocks.PICKET_GATE_LIGHT_GRAY.get());
            this.dropSelf(ModBlocks.PICKET_GATE_CYAN.get());
            this.dropSelf(ModBlocks.PICKET_GATE_PURPLE.get());
            this.dropSelf(ModBlocks.PICKET_GATE_BLUE.get());
            this.dropSelf(ModBlocks.PICKET_GATE_BROWN.get());
            this.dropSelf(ModBlocks.PICKET_GATE_GREEN.get());
            this.dropSelf(ModBlocks.PICKET_GATE_RED.get());
            this.dropSelf(ModBlocks.PICKET_GATE_BLACK.get());
            this.dropSelf(ModBlocks.CRATE_OAK.get());
            this.dropSelf(ModBlocks.CRATE_SPRUCE.get());
            this.dropSelf(ModBlocks.CRATE_BIRCH.get());
            this.dropSelf(ModBlocks.CRATE_JUNGLE.get());
            this.dropSelf(ModBlocks.CRATE_ACACIA.get());
            this.dropSelf(ModBlocks.CRATE_DARK_OAK.get());
            this.dropSelf(ModBlocks.CRATE_CRIMSON.get());
            this.dropSelf(ModBlocks.CRATE_WARPED.get());
            this.dropSelf(ModBlocks.CRATE_STRIPPED_OAK.get());
            this.dropSelf(ModBlocks.CRATE_STRIPPED_SPRUCE.get());
            this.dropSelf(ModBlocks.CRATE_STRIPPED_BIRCH.get());
            this.dropSelf(ModBlocks.CRATE_STRIPPED_JUNGLE.get());
            this.dropSelf(ModBlocks.CRATE_STRIPPED_ACACIA.get());
            this.dropSelf(ModBlocks.CRATE_STRIPPED_DARK_OAK.get());
            this.dropSelf(ModBlocks.CRATE_STRIPPED_CRIMSON.get());
            this.dropSelf(ModBlocks.CRATE_STRIPPED_WARPED.get());
            this.dropSelf(ModBlocks.PARK_BENCH_OAK.get());
            this.dropSelf(ModBlocks.PARK_BENCH_SPRUCE.get());
            this.dropSelf(ModBlocks.PARK_BENCH_BIRCH.get());
            this.dropSelf(ModBlocks.PARK_BENCH_JUNGLE.get());
            this.dropSelf(ModBlocks.PARK_BENCH_ACACIA.get());
            this.dropSelf(ModBlocks.PARK_BENCH_DARK_OAK.get());
            this.dropSelf(ModBlocks.PARK_BENCH_CRIMSON.get());
            this.dropSelf(ModBlocks.PARK_BENCH_WARPED.get());
            this.dropSelf(ModBlocks.PARK_BENCH_STRIPPED_OAK.get());
            this.dropSelf(ModBlocks.PARK_BENCH_STRIPPED_SPRUCE.get());
            this.dropSelf(ModBlocks.PARK_BENCH_STRIPPED_BIRCH.get());
            this.dropSelf(ModBlocks.PARK_BENCH_STRIPPED_JUNGLE.get());
            this.dropSelf(ModBlocks.PARK_BENCH_STRIPPED_ACACIA.get());
            this.dropSelf(ModBlocks.PARK_BENCH_STRIPPED_DARK_OAK.get());
            this.dropSelf(ModBlocks.PARK_BENCH_STRIPPED_CRIMSON.get());
            this.dropSelf(ModBlocks.PARK_BENCH_STRIPPED_WARPED.get());
            this.dropSelf(ModBlocks.POST_BOX.get());
            this.dropSelf(ModBlocks.MAIL_BOX_OAK.get());
            this.dropSelf(ModBlocks.MAIL_BOX_SPRUCE.get());
            this.dropSelf(ModBlocks.MAIL_BOX_BIRCH.get());
            this.dropSelf(ModBlocks.MAIL_BOX_JUNGLE.get());
            this.dropSelf(ModBlocks.MAIL_BOX_ACACIA.get());
            this.dropSelf(ModBlocks.MAIL_BOX_DARK_OAK.get());
            this.dropSelf(ModBlocks.MAIL_BOX_CRIMSON.get());
            this.dropSelf(ModBlocks.MAIL_BOX_WARPED.get());
            this.dropSelf(ModBlocks.MAIL_BOX_STRIPPED_OAK.get());
            this.dropSelf(ModBlocks.MAIL_BOX_STRIPPED_SPRUCE.get());
            this.dropSelf(ModBlocks.MAIL_BOX_STRIPPED_BIRCH.get());
            this.dropSelf(ModBlocks.MAIL_BOX_STRIPPED_JUNGLE.get());
            this.dropSelf(ModBlocks.MAIL_BOX_STRIPPED_ACACIA.get());
            this.dropSelf(ModBlocks.MAIL_BOX_STRIPPED_DARK_OAK.get());
            this.dropSelf(ModBlocks.MAIL_BOX_STRIPPED_CRIMSON.get());
            this.dropSelf(ModBlocks.MAIL_BOX_STRIPPED_WARPED.get());
            this.dropSelf(ModBlocks.HEDGE_OAK.get());
            this.dropSelf(ModBlocks.HEDGE_SPRUCE.get());
            this.dropSelf(ModBlocks.HEDGE_BIRCH.get());
            this.dropSelf(ModBlocks.HEDGE_JUNGLE.get());
            this.dropSelf(ModBlocks.HEDGE_ACACIA.get());
            this.dropSelf(ModBlocks.HEDGE_DARK_OAK.get());
            this.dropSelf(ModBlocks.ROCK_PATH.get());
            this.registerTrampoline(ModBlocks.TRAMPOLINE.get());
            this.dropSelf(ModBlocks.COOLER_WHITE.get());
            this.dropSelf(ModBlocks.COOLER_ORANGE.get());
            this.dropSelf(ModBlocks.COOLER_MAGENTA.get());
            this.dropSelf(ModBlocks.COOLER_LIGHT_BLUE.get());
            this.dropSelf(ModBlocks.COOLER_YELLOW.get());
            this.dropSelf(ModBlocks.COOLER_LIME.get());
            this.dropSelf(ModBlocks.COOLER_PINK.get());
            this.dropSelf(ModBlocks.COOLER_GRAY.get());
            this.dropSelf(ModBlocks.COOLER_LIGHT_GRAY.get());
            this.dropSelf(ModBlocks.COOLER_CYAN.get());
            this.dropSelf(ModBlocks.COOLER_PURPLE.get());
            this.dropSelf(ModBlocks.COOLER_BLUE.get());
            this.dropSelf(ModBlocks.COOLER_BROWN.get());
            this.dropSelf(ModBlocks.COOLER_GREEN.get());
            this.dropSelf(ModBlocks.COOLER_RED.get());
            this.dropSelf(ModBlocks.COOLER_BLACK.get());
            this.dropSelf(ModBlocks.GRILL_WHITE.get());
            this.dropSelf(ModBlocks.GRILL_ORANGE.get());
            this.dropSelf(ModBlocks.GRILL_MAGENTA.get());
            this.dropSelf(ModBlocks.GRILL_LIGHT_BLUE.get());
            this.dropSelf(ModBlocks.GRILL_YELLOW.get());
            this.dropSelf(ModBlocks.GRILL_LIME.get());
            this.dropSelf(ModBlocks.GRILL_PINK.get());
            this.dropSelf(ModBlocks.GRILL_GRAY.get());
            this.dropSelf(ModBlocks.GRILL_LIGHT_GRAY.get());
            this.dropSelf(ModBlocks.GRILL_CYAN.get());
            this.dropSelf(ModBlocks.GRILL_PURPLE.get());
            this.dropSelf(ModBlocks.GRILL_BLUE.get());
            this.dropSelf(ModBlocks.GRILL_BROWN.get());
            this.dropSelf(ModBlocks.GRILL_GREEN.get());
            this.dropSelf(ModBlocks.GRILL_RED.get());
            this.dropSelf(ModBlocks.GRILL_BLACK.get());
            this.dropSelf(ModBlocks.DOOR_MAT.get());
            this.dropSelf(ModBlocks.DIVING_BOARD.get());
            this.dropSelf(ModBlocks.KITCHEN_COUNTER_OAK.get());
            this.dropSelf(ModBlocks.KITCHEN_COUNTER_SPRUCE.get());
            this.dropSelf(ModBlocks.KITCHEN_COUNTER_BIRCH.get());
            this.dropSelf(ModBlocks.KITCHEN_COUNTER_JUNGLE.get());
            this.dropSelf(ModBlocks.KITCHEN_COUNTER_ACACIA.get());
            this.dropSelf(ModBlocks.KITCHEN_COUNTER_DARK_OAK.get());
            this.dropSelf(ModBlocks.KITCHEN_COUNTER_CRIMSON.get());
            this.dropSelf(ModBlocks.KITCHEN_COUNTER_WARPED.get());
            this.dropSelf(ModBlocks.KITCHEN_COUNTER_STRIPPED_OAK.get());
            this.dropSelf(ModBlocks.KITCHEN_COUNTER_STRIPPED_SPRUCE.get());
            this.dropSelf(ModBlocks.KITCHEN_COUNTER_STRIPPED_BIRCH.get());
            this.dropSelf(ModBlocks.KITCHEN_COUNTER_STRIPPED_JUNGLE.get());
            this.dropSelf(ModBlocks.KITCHEN_COUNTER_STRIPPED_ACACIA.get());
            this.dropSelf(ModBlocks.KITCHEN_COUNTER_STRIPPED_DARK_OAK.get());
            this.dropSelf(ModBlocks.KITCHEN_COUNTER_STRIPPED_CRIMSON.get());
            this.dropSelf(ModBlocks.KITCHEN_COUNTER_STRIPPED_WARPED.get());
            this.dropSelf(ModBlocks.KITCHEN_COUNTER_WHITE.get());
            this.dropSelf(ModBlocks.KITCHEN_COUNTER_ORANGE.get());
            this.dropSelf(ModBlocks.KITCHEN_COUNTER_MAGENTA.get());
            this.dropSelf(ModBlocks.KITCHEN_COUNTER_LIGHT_BLUE.get());
            this.dropSelf(ModBlocks.KITCHEN_COUNTER_YELLOW.get());
            this.dropSelf(ModBlocks.KITCHEN_COUNTER_LIME.get());
            this.dropSelf(ModBlocks.KITCHEN_COUNTER_PINK.get());
            this.dropSelf(ModBlocks.KITCHEN_COUNTER_GRAY.get());
            this.dropSelf(ModBlocks.KITCHEN_COUNTER_LIGHT_GRAY.get());
            this.dropSelf(ModBlocks.KITCHEN_COUNTER_CYAN.get());
            this.dropSelf(ModBlocks.KITCHEN_COUNTER_PURPLE.get());
            this.dropSelf(ModBlocks.KITCHEN_COUNTER_BLUE.get());
            this.dropSelf(ModBlocks.KITCHEN_COUNTER_BROWN.get());
            this.dropSelf(ModBlocks.KITCHEN_COUNTER_GREEN.get());
            this.dropSelf(ModBlocks.KITCHEN_COUNTER_RED.get());
            this.dropSelf(ModBlocks.KITCHEN_COUNTER_BLACK.get());
            this.dropSelf(ModBlocks.KITCHEN_DRAWER_OAK.get());
            this.dropSelf(ModBlocks.KITCHEN_DRAWER_SPRUCE.get());
            this.dropSelf(ModBlocks.KITCHEN_DRAWER_BIRCH.get());
            this.dropSelf(ModBlocks.KITCHEN_DRAWER_JUNGLE.get());
            this.dropSelf(ModBlocks.KITCHEN_DRAWER_ACACIA.get());
            this.dropSelf(ModBlocks.KITCHEN_DRAWER_DARK_OAK.get());
            this.dropSelf(ModBlocks.KITCHEN_DRAWER_CRIMSON.get());
            this.dropSelf(ModBlocks.KITCHEN_DRAWER_WARPED.get());
            this.dropSelf(ModBlocks.KITCHEN_DRAWER_STRIPPED_OAK.get());
            this.dropSelf(ModBlocks.KITCHEN_DRAWER_STRIPPED_SPRUCE.get());
            this.dropSelf(ModBlocks.KITCHEN_DRAWER_STRIPPED_BIRCH.get());
            this.dropSelf(ModBlocks.KITCHEN_DRAWER_STRIPPED_JUNGLE.get());
            this.dropSelf(ModBlocks.KITCHEN_DRAWER_STRIPPED_ACACIA.get());
            this.dropSelf(ModBlocks.KITCHEN_DRAWER_STRIPPED_DARK_OAK.get());
            this.dropSelf(ModBlocks.KITCHEN_DRAWER_STRIPPED_CRIMSON.get());
            this.dropSelf(ModBlocks.KITCHEN_DRAWER_STRIPPED_WARPED.get());
            this.dropSelf(ModBlocks.KITCHEN_DRAWER_WHITE.get());
            this.dropSelf(ModBlocks.KITCHEN_DRAWER_ORANGE.get());
            this.dropSelf(ModBlocks.KITCHEN_DRAWER_MAGENTA.get());
            this.dropSelf(ModBlocks.KITCHEN_DRAWER_LIGHT_BLUE.get());
            this.dropSelf(ModBlocks.KITCHEN_DRAWER_YELLOW.get());
            this.dropSelf(ModBlocks.KITCHEN_DRAWER_LIME.get());
            this.dropSelf(ModBlocks.KITCHEN_DRAWER_PINK.get());
            this.dropSelf(ModBlocks.KITCHEN_DRAWER_GRAY.get());
            this.dropSelf(ModBlocks.KITCHEN_DRAWER_LIGHT_GRAY.get());
            this.dropSelf(ModBlocks.KITCHEN_DRAWER_CYAN.get());
            this.dropSelf(ModBlocks.KITCHEN_DRAWER_PURPLE.get());
            this.dropSelf(ModBlocks.KITCHEN_DRAWER_BLUE.get());
            this.dropSelf(ModBlocks.KITCHEN_DRAWER_BROWN.get());
            this.dropSelf(ModBlocks.KITCHEN_DRAWER_GREEN.get());
            this.dropSelf(ModBlocks.KITCHEN_DRAWER_RED.get());
            this.dropSelf(ModBlocks.KITCHEN_DRAWER_BLACK.get());
            this.dropSelf(ModBlocks.KITCHEN_SINK_LIGHT_OAK.get());
            this.dropSelf(ModBlocks.KITCHEN_SINK_LIGHT_SPRUCE.get());
            this.dropSelf(ModBlocks.KITCHEN_SINK_LIGHT_BIRCH.get());
            this.dropSelf(ModBlocks.KITCHEN_SINK_LIGHT_JUNGLE.get());
            this.dropSelf(ModBlocks.KITCHEN_SINK_LIGHT_ACACIA.get());
            this.dropSelf(ModBlocks.KITCHEN_SINK_LIGHT_DARK_OAK.get());
            this.dropSelf(ModBlocks.KITCHEN_SINK_LIGHT_CRIMSON.get());
            this.dropSelf(ModBlocks.KITCHEN_SINK_LIGHT_WARPED.get());
            this.dropSelf(ModBlocks.KITCHEN_SINK_LIGHT_STRIPPED_OAK.get());
            this.dropSelf(ModBlocks.KITCHEN_SINK_LIGHT_STRIPPED_SPRUCE.get());
            this.dropSelf(ModBlocks.KITCHEN_SINK_LIGHT_STRIPPED_BIRCH.get());
            this.dropSelf(ModBlocks.KITCHEN_SINK_LIGHT_STRIPPED_JUNGLE.get());
            this.dropSelf(ModBlocks.KITCHEN_SINK_LIGHT_STRIPPED_ACACIA.get());
            this.dropSelf(ModBlocks.KITCHEN_SINK_LIGHT_STRIPPED_DARK_OAK.get());
            this.dropSelf(ModBlocks.KITCHEN_SINK_LIGHT_STRIPPED_CRIMSON.get());
            this.dropSelf(ModBlocks.KITCHEN_SINK_LIGHT_STRIPPED_WARPED.get());
            this.dropSelf(ModBlocks.KITCHEN_SINK_DARK_OAK.get());
            this.dropSelf(ModBlocks.KITCHEN_SINK_DARK_SPRUCE.get());
            this.dropSelf(ModBlocks.KITCHEN_SINK_DARK_BIRCH.get());
            this.dropSelf(ModBlocks.KITCHEN_SINK_DARK_JUNGLE.get());
            this.dropSelf(ModBlocks.KITCHEN_SINK_DARK_ACACIA.get());
            this.dropSelf(ModBlocks.KITCHEN_SINK_DARK_DARK_OAK.get());
            this.dropSelf(ModBlocks.KITCHEN_SINK_DARK_CRIMSON.get());
            this.dropSelf(ModBlocks.KITCHEN_SINK_DARK_WARPED.get());
            this.dropSelf(ModBlocks.KITCHEN_SINK_DARK_STRIPPED_OAK.get());
            this.dropSelf(ModBlocks.KITCHEN_SINK_DARK_STRIPPED_SPRUCE.get());
            this.dropSelf(ModBlocks.KITCHEN_SINK_DARK_STRIPPED_BIRCH.get());
            this.dropSelf(ModBlocks.KITCHEN_SINK_DARK_STRIPPED_JUNGLE.get());
            this.dropSelf(ModBlocks.KITCHEN_SINK_DARK_STRIPPED_ACACIA.get());
            this.dropSelf(ModBlocks.KITCHEN_SINK_DARK_STRIPPED_DARK_OAK.get());
            this.dropSelf(ModBlocks.KITCHEN_SINK_DARK_STRIPPED_CRIMSON.get());
            this.dropSelf(ModBlocks.KITCHEN_SINK_DARK_STRIPPED_WARPED.get());
            this.dropSelf(ModBlocks.KITCHEN_SINK_WHITE.get());
            this.dropSelf(ModBlocks.KITCHEN_SINK_ORANGE.get());
            this.dropSelf(ModBlocks.KITCHEN_SINK_MAGENTA.get());
            this.dropSelf(ModBlocks.KITCHEN_SINK_LIGHT_BLUE.get());
            this.dropSelf(ModBlocks.KITCHEN_SINK_YELLOW.get());
            this.dropSelf(ModBlocks.KITCHEN_SINK_LIME.get());
            this.dropSelf(ModBlocks.KITCHEN_SINK_PINK.get());
            this.dropSelf(ModBlocks.KITCHEN_SINK_GRAY.get());
            this.dropSelf(ModBlocks.KITCHEN_SINK_LIGHT_GRAY.get());
            this.dropSelf(ModBlocks.KITCHEN_SINK_CYAN.get());
            this.dropSelf(ModBlocks.KITCHEN_SINK_PURPLE.get());
            this.dropSelf(ModBlocks.KITCHEN_SINK_BLUE.get());
            this.dropSelf(ModBlocks.KITCHEN_SINK_BROWN.get());
            this.dropSelf(ModBlocks.KITCHEN_SINK_GREEN.get());
            this.dropSelf(ModBlocks.KITCHEN_SINK_RED.get());
            this.dropSelf(ModBlocks.KITCHEN_SINK_BLACK.get());
            this.dropSelf(ModBlocks.FRIDGE_LIGHT.get());
            this.dropSelf(ModBlocks.FREEZER_LIGHT.get());
            this.dropSelf(ModBlocks.FRIDGE_DARK.get());
            this.dropSelf(ModBlocks.FREEZER_DARK.get());
        }

        public void registerCoffeeTable(Block block)
        {
            this.add(block, coffeeTable -> LootTable.lootTable().withPool(LootPool.lootPool().setRolls(ConstantValue.exactly(1)).add(applyExplosionCondition(block, LootItem.lootTableItem(coffeeTable).apply(SetItemCountFunction.setCount(ConstantValue.exactly(2)).when(LootItemBlockStatePropertyCondition.hasBlockStateProperties(coffeeTable).setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(CoffeeTableBlock.TALL, true))))))));
        }

        public void registerTrampoline(Block block)
        {
            this.add(block, trampoline -> LootTable.lootTable().withPool(LootPool.lootPool().setRolls(ConstantValue.exactly(1)).add(LootItem.lootTableItem(trampoline).apply(CopyNameFunction.copyName(CopyNameFunction.NameSource.BLOCK_ENTITY)).apply(CopyNbtFunction.copyData(ContextNbtProvider.BLOCK_ENTITY).copy("BlockEntityTag.Count", "")))));
        }

        @Override
        protected Iterable<Block> getKnownBlocks()
        {
            return ForgeRegistries.BLOCKS.getValues().stream().filter(entityType -> entityType.getRegistryName() != null && Reference.MOD_ID.equals(entityType.getRegistryName().getNamespace())).collect(Collectors.toSet());
        }
    }
}