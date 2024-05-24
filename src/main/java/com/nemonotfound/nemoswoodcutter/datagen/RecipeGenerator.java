package com.nemonotfound.nemoswoodcutter.datagen;

import biomesoplenty.api.block.BOPBlocks;
import biomesoplenty.api.item.BOPItems;
import biomesoplenty.init.ModTags;
import com.mojang.datafixers.util.Pair;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.fabricmc.fabric.api.resource.conditions.v1.DefaultResourceConditions;
import net.minecraft.block.Block;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.item.Item;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.Registries;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class RecipeGenerator extends FabricRecipeProvider {

    public RecipeGenerator(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(RecipeExporter exporter) {

        //Biomes O' Plenty
        RecipeExporter exporterForBiomesOPlenty = withConditions(exporter, DefaultResourceConditions.allModsLoaded("biomesoplenty"));
        createCarpentryRecipe(exporterForBiomesOPlenty, ModTags.Items.FIR_LOGS, 1, BOPItems.FIR_PLANKS, 4);
        createCarpentryRecipe(exporterForBiomesOPlenty, ModTags.Items.FIR_LOGS, 1, BOPItems.FIR_BOAT, 1);
        createCarpentryRecipe(exporterForBiomesOPlenty, ModTags.Items.FIR_LOGS, 1, BOPItems.FIR_BUTTON, 16);
        createCarpentryRecipe(exporterForBiomesOPlenty, ModTags.Items.FIR_LOGS, 1, BOPItems.FIR_DOOR, 4);
        createCarpentryRecipe(exporterForBiomesOPlenty, ModTags.Items.FIR_LOGS, 1, BOPItems.FIR_FENCE_GATE, 4);
        createCarpentryRecipe(exporterForBiomesOPlenty, ModTags.Items.FIR_LOGS, 1, BOPItems.FIR_FENCE, 4);
        createCarpentryRecipe(exporterForBiomesOPlenty, ModTags.Items.FIR_LOGS, 1, BOPItems.FIR_PRESSURE_PLATE, 16);
        createCarpentryRecipe(exporterForBiomesOPlenty, ModTags.Items.FIR_LOGS, 1, BOPItems.FIR_SIGN, 12);
        createCarpentryRecipe(exporterForBiomesOPlenty, ModTags.Items.FIR_LOGS, 1, BOPItems.FIR_SLAB, 8);
        createCarpentryRecipe(exporterForBiomesOPlenty, ModTags.Items.FIR_LOGS, 1, BOPItems.FIR_STAIRS, 4);
        createCarpentryRecipe(exporterForBiomesOPlenty, ModTags.Items.FIR_LOGS, 1, BOPItems.FIR_TRAPDOOR, 8);

        createCarpentryRecipe(exporterForBiomesOPlenty, Pair.of(BOPBlocks.FIR_PLANKS, 2), BOPItems.FIR_BOAT, 1);
        createCarpentryRecipe(exporterForBiomesOPlenty, Pair.of(BOPBlocks.FIR_PLANKS, 1), BOPItems.FIR_BUTTON, 4);
        createCarpentryRecipe(exporterForBiomesOPlenty, Pair.of(BOPBlocks.FIR_PLANKS, 2), BOPItems.FIR_DOOR, 2);
        createCarpentryRecipe(exporterForBiomesOPlenty, Pair.of(BOPBlocks.FIR_PLANKS, 1), BOPItems.FIR_FENCE_GATE, 1);
        createCarpentryRecipe(exporterForBiomesOPlenty, Pair.of(BOPBlocks.FIR_PLANKS, 1), BOPItems.FIR_FENCE, 1);
        createCarpentryRecipe(exporterForBiomesOPlenty, Pair.of(BOPBlocks.FIR_PLANKS, 1), BOPItems.FIR_PRESSURE_PLATE, 4);
        createCarpentryRecipe(exporterForBiomesOPlenty, Pair.of(BOPBlocks.FIR_PLANKS, 1), BOPItems.FIR_SIGN, 3);
        createCarpentryRecipe(exporterForBiomesOPlenty, Pair.of(BOPBlocks.FIR_PLANKS, 1), BOPItems.FIR_SLAB, 2);
        createCarpentryRecipe(exporterForBiomesOPlenty, Pair.of(BOPBlocks.FIR_PLANKS, 1), BOPItems.FIR_STAIRS, 1);
        createCarpentryRecipe(exporterForBiomesOPlenty, Pair.of(BOPBlocks.FIR_PLANKS, 1), BOPItems.FIR_TRAPDOOR, 2);

        createCarpentryRecipe(exporterForBiomesOPlenty, ModTags.Items.PINE_LOGS, 1, BOPItems.PINE_PLANKS, 4);
        createCarpentryRecipe(exporterForBiomesOPlenty, ModTags.Items.PINE_LOGS, 1, BOPItems.PINE_BOAT, 1);
        createCarpentryRecipe(exporterForBiomesOPlenty, ModTags.Items.PINE_LOGS, 1, BOPItems.PINE_BUTTON, 16);
        createCarpentryRecipe(exporterForBiomesOPlenty, ModTags.Items.PINE_LOGS, 1, BOPItems.PINE_DOOR, 4);
        createCarpentryRecipe(exporterForBiomesOPlenty, ModTags.Items.PINE_LOGS, 1, BOPItems.PINE_FENCE_GATE, 4);
        createCarpentryRecipe(exporterForBiomesOPlenty, ModTags.Items.PINE_LOGS, 1, BOPItems.PINE_FENCE, 4);
        createCarpentryRecipe(exporterForBiomesOPlenty, ModTags.Items.PINE_LOGS, 1, BOPItems.PINE_PRESSURE_PLATE, 16);
        createCarpentryRecipe(exporterForBiomesOPlenty, ModTags.Items.PINE_LOGS, 1, BOPItems.PINE_SIGN, 12);
        createCarpentryRecipe(exporterForBiomesOPlenty, ModTags.Items.PINE_LOGS, 1, BOPItems.PINE_SLAB, 8);
        createCarpentryRecipe(exporterForBiomesOPlenty, ModTags.Items.PINE_LOGS, 1, BOPItems.PINE_STAIRS, 4);
        createCarpentryRecipe(exporterForBiomesOPlenty, ModTags.Items.PINE_LOGS, 1, BOPItems.PINE_TRAPDOOR, 8);

        createCarpentryRecipe(exporterForBiomesOPlenty, Pair.of(BOPBlocks.PINE_PLANKS, 2), BOPItems.PINE_BOAT, 1);
        createCarpentryRecipe(exporterForBiomesOPlenty, Pair.of(BOPBlocks.PINE_PLANKS, 1), BOPItems.PINE_BUTTON, 4);
        createCarpentryRecipe(exporterForBiomesOPlenty, Pair.of(BOPBlocks.PINE_PLANKS, 2), BOPItems.PINE_DOOR, 2);
        createCarpentryRecipe(exporterForBiomesOPlenty, Pair.of(BOPBlocks.PINE_PLANKS, 1), BOPItems.PINE_FENCE_GATE, 1);
        createCarpentryRecipe(exporterForBiomesOPlenty, Pair.of(BOPBlocks.PINE_PLANKS, 1), BOPItems.PINE_FENCE, 1);
        createCarpentryRecipe(exporterForBiomesOPlenty, Pair.of(BOPBlocks.PINE_PLANKS, 1), BOPItems.PINE_PRESSURE_PLATE, 4);
        createCarpentryRecipe(exporterForBiomesOPlenty, Pair.of(BOPBlocks.PINE_PLANKS, 1), BOPItems.PINE_SIGN, 3);
        createCarpentryRecipe(exporterForBiomesOPlenty, Pair.of(BOPBlocks.PINE_PLANKS, 1), BOPItems.PINE_SLAB, 2);
        createCarpentryRecipe(exporterForBiomesOPlenty, Pair.of(BOPBlocks.PINE_PLANKS, 1), BOPItems.PINE_STAIRS, 1);
        createCarpentryRecipe(exporterForBiomesOPlenty, Pair.of(BOPBlocks.PINE_PLANKS, 1), BOPItems.PINE_TRAPDOOR, 2);

        createCarpentryRecipe(exporterForBiomesOPlenty, ModTags.Items.MAPLE_LOGS, 1, BOPItems.MAPLE_PLANKS, 4);
        createCarpentryRecipe(exporterForBiomesOPlenty, ModTags.Items.MAPLE_LOGS, 1, BOPItems.MAPLE_BOAT, 1);
        createCarpentryRecipe(exporterForBiomesOPlenty, ModTags.Items.MAPLE_LOGS, 1, BOPItems.MAPLE_BUTTON, 16);
        createCarpentryRecipe(exporterForBiomesOPlenty, ModTags.Items.MAPLE_LOGS, 1, BOPItems.MAPLE_DOOR, 4);
        createCarpentryRecipe(exporterForBiomesOPlenty, ModTags.Items.MAPLE_LOGS, 1, BOPItems.MAPLE_FENCE_GATE, 4);
        createCarpentryRecipe(exporterForBiomesOPlenty, ModTags.Items.MAPLE_LOGS, 1, BOPItems.MAPLE_FENCE, 4);
        createCarpentryRecipe(exporterForBiomesOPlenty, ModTags.Items.MAPLE_LOGS, 1, BOPItems.MAPLE_PRESSURE_PLATE, 16);
        createCarpentryRecipe(exporterForBiomesOPlenty, ModTags.Items.MAPLE_LOGS, 1, BOPItems.MAPLE_SIGN, 12);
        createCarpentryRecipe(exporterForBiomesOPlenty, ModTags.Items.MAPLE_LOGS, 1, BOPItems.MAPLE_SLAB, 8);
        createCarpentryRecipe(exporterForBiomesOPlenty, ModTags.Items.MAPLE_LOGS, 1, BOPItems.MAPLE_STAIRS, 4);
        createCarpentryRecipe(exporterForBiomesOPlenty, ModTags.Items.MAPLE_LOGS, 1, BOPItems.MAPLE_TRAPDOOR, 8);

        createCarpentryRecipe(exporterForBiomesOPlenty, Pair.of(BOPBlocks.MAPLE_PLANKS, 2), BOPItems.MAPLE_BOAT, 1);
        createCarpentryRecipe(exporterForBiomesOPlenty, Pair.of(BOPBlocks.MAPLE_PLANKS, 1), BOPItems.MAPLE_BUTTON, 4);
        createCarpentryRecipe(exporterForBiomesOPlenty, Pair.of(BOPBlocks.MAPLE_PLANKS, 2), BOPItems.MAPLE_DOOR, 2);
        createCarpentryRecipe(exporterForBiomesOPlenty, Pair.of(BOPBlocks.MAPLE_PLANKS, 1), BOPItems.MAPLE_FENCE_GATE, 1);
        createCarpentryRecipe(exporterForBiomesOPlenty, Pair.of(BOPBlocks.MAPLE_PLANKS, 1), BOPItems.MAPLE_FENCE, 1);
        createCarpentryRecipe(exporterForBiomesOPlenty, Pair.of(BOPBlocks.MAPLE_PLANKS, 1), BOPItems.MAPLE_PRESSURE_PLATE, 4);
        createCarpentryRecipe(exporterForBiomesOPlenty, Pair.of(BOPBlocks.MAPLE_PLANKS, 1), BOPItems.MAPLE_SIGN, 3);
        createCarpentryRecipe(exporterForBiomesOPlenty, Pair.of(BOPBlocks.MAPLE_PLANKS, 1), BOPItems.MAPLE_SLAB, 2);
        createCarpentryRecipe(exporterForBiomesOPlenty, Pair.of(BOPBlocks.MAPLE_PLANKS, 1), BOPItems.MAPLE_STAIRS, 1);
        createCarpentryRecipe(exporterForBiomesOPlenty, Pair.of(BOPBlocks.MAPLE_PLANKS, 1), BOPItems.MAPLE_TRAPDOOR, 2);

        createCarpentryRecipe(exporterForBiomesOPlenty, ModTags.Items.REDWOOD_LOGS, 1, BOPItems.REDWOOD_PLANKS, 4);
        createCarpentryRecipe(exporterForBiomesOPlenty, ModTags.Items.REDWOOD_LOGS, 1, BOPItems.REDWOOD_BOAT, 1);
        createCarpentryRecipe(exporterForBiomesOPlenty, ModTags.Items.REDWOOD_LOGS, 1, BOPItems.REDWOOD_BUTTON, 16);
        createCarpentryRecipe(exporterForBiomesOPlenty, ModTags.Items.REDWOOD_LOGS, 1, BOPItems.REDWOOD_DOOR, 4);
        createCarpentryRecipe(exporterForBiomesOPlenty, ModTags.Items.REDWOOD_LOGS, 1, BOPItems.REDWOOD_FENCE_GATE, 4);
        createCarpentryRecipe(exporterForBiomesOPlenty, ModTags.Items.REDWOOD_LOGS, 1, BOPItems.REDWOOD_FENCE, 4);
        createCarpentryRecipe(exporterForBiomesOPlenty, ModTags.Items.REDWOOD_LOGS, 1, BOPItems.REDWOOD_PRESSURE_PLATE, 16);
        createCarpentryRecipe(exporterForBiomesOPlenty, ModTags.Items.REDWOOD_LOGS, 1, BOPItems.REDWOOD_SIGN, 12);
        createCarpentryRecipe(exporterForBiomesOPlenty, ModTags.Items.REDWOOD_LOGS, 1, BOPItems.REDWOOD_SLAB, 8);
        createCarpentryRecipe(exporterForBiomesOPlenty, ModTags.Items.REDWOOD_LOGS, 1, BOPItems.REDWOOD_STAIRS, 4);
        createCarpentryRecipe(exporterForBiomesOPlenty, ModTags.Items.REDWOOD_LOGS, 1, BOPItems.REDWOOD_TRAPDOOR, 8);

        createCarpentryRecipe(exporterForBiomesOPlenty, Pair.of(BOPBlocks.REDWOOD_PLANKS, 2), BOPItems.REDWOOD_BOAT, 1);
        createCarpentryRecipe(exporterForBiomesOPlenty, Pair.of(BOPBlocks.REDWOOD_PLANKS, 1), BOPItems.REDWOOD_BUTTON, 4);
        createCarpentryRecipe(exporterForBiomesOPlenty, Pair.of(BOPBlocks.REDWOOD_PLANKS, 2), BOPItems.REDWOOD_DOOR, 2);
        createCarpentryRecipe(exporterForBiomesOPlenty, Pair.of(BOPBlocks.REDWOOD_PLANKS, 1), BOPItems.REDWOOD_FENCE_GATE, 1);
        createCarpentryRecipe(exporterForBiomesOPlenty, Pair.of(BOPBlocks.REDWOOD_PLANKS, 1), BOPItems.REDWOOD_FENCE, 1);
        createCarpentryRecipe(exporterForBiomesOPlenty, Pair.of(BOPBlocks.REDWOOD_PLANKS, 1), BOPItems.REDWOOD_PRESSURE_PLATE, 4);
        createCarpentryRecipe(exporterForBiomesOPlenty, Pair.of(BOPBlocks.REDWOOD_PLANKS, 1), BOPItems.REDWOOD_SIGN, 3);
        createCarpentryRecipe(exporterForBiomesOPlenty, Pair.of(BOPBlocks.REDWOOD_PLANKS, 1), BOPItems.REDWOOD_SLAB, 2);
        createCarpentryRecipe(exporterForBiomesOPlenty, Pair.of(BOPBlocks.REDWOOD_PLANKS, 1), BOPItems.REDWOOD_STAIRS, 1);
        createCarpentryRecipe(exporterForBiomesOPlenty, Pair.of(BOPBlocks.REDWOOD_PLANKS, 1), BOPItems.REDWOOD_TRAPDOOR, 2);

        createCarpentryRecipe(exporterForBiomesOPlenty, ModTags.Items.MAHOGANY_LOGS, 1, BOPItems.MAHOGANY_PLANKS, 4);
        createCarpentryRecipe(exporterForBiomesOPlenty, ModTags.Items.MAHOGANY_LOGS, 1, BOPItems.MAHOGANY_BOAT, 1);
        createCarpentryRecipe(exporterForBiomesOPlenty, ModTags.Items.MAHOGANY_LOGS, 1, BOPItems.MAHOGANY_BUTTON, 16);
        createCarpentryRecipe(exporterForBiomesOPlenty, ModTags.Items.MAHOGANY_LOGS, 1, BOPItems.MAHOGANY_DOOR, 4);
        createCarpentryRecipe(exporterForBiomesOPlenty, ModTags.Items.MAHOGANY_LOGS, 1, BOPItems.MAHOGANY_FENCE_GATE, 4);
        createCarpentryRecipe(exporterForBiomesOPlenty, ModTags.Items.MAHOGANY_LOGS, 1, BOPItems.MAHOGANY_FENCE, 4);
        createCarpentryRecipe(exporterForBiomesOPlenty, ModTags.Items.MAHOGANY_LOGS, 1, BOPItems.MAHOGANY_PRESSURE_PLATE, 16);
        createCarpentryRecipe(exporterForBiomesOPlenty, ModTags.Items.MAHOGANY_LOGS, 1, BOPItems.MAHOGANY_SIGN, 12);
        createCarpentryRecipe(exporterForBiomesOPlenty, ModTags.Items.MAHOGANY_LOGS, 1, BOPItems.MAHOGANY_SLAB, 8);
        createCarpentryRecipe(exporterForBiomesOPlenty, ModTags.Items.MAHOGANY_LOGS, 1, BOPItems.MAHOGANY_STAIRS, 4);
        createCarpentryRecipe(exporterForBiomesOPlenty, ModTags.Items.MAHOGANY_LOGS, 1, BOPItems.MAHOGANY_TRAPDOOR, 8);

        createCarpentryRecipe(exporterForBiomesOPlenty, Pair.of(BOPBlocks.MAHOGANY_PLANKS, 2), BOPItems.MAHOGANY_BOAT, 1);
        createCarpentryRecipe(exporterForBiomesOPlenty, Pair.of(BOPBlocks.MAHOGANY_PLANKS, 1), BOPItems.MAHOGANY_BUTTON, 4);
        createCarpentryRecipe(exporterForBiomesOPlenty, Pair.of(BOPBlocks.MAHOGANY_PLANKS, 2), BOPItems.MAHOGANY_DOOR, 2);
        createCarpentryRecipe(exporterForBiomesOPlenty, Pair.of(BOPBlocks.MAHOGANY_PLANKS, 1), BOPItems.MAHOGANY_FENCE_GATE, 1);
        createCarpentryRecipe(exporterForBiomesOPlenty, Pair.of(BOPBlocks.MAHOGANY_PLANKS, 1), BOPItems.MAHOGANY_FENCE, 1);
        createCarpentryRecipe(exporterForBiomesOPlenty, Pair.of(BOPBlocks.MAHOGANY_PLANKS, 1), BOPItems.MAHOGANY_PRESSURE_PLATE, 4);
        createCarpentryRecipe(exporterForBiomesOPlenty, Pair.of(BOPBlocks.MAHOGANY_PLANKS, 1), BOPItems.MAHOGANY_SIGN, 3);
        createCarpentryRecipe(exporterForBiomesOPlenty, Pair.of(BOPBlocks.MAHOGANY_PLANKS, 1), BOPItems.MAHOGANY_SLAB, 2);
        createCarpentryRecipe(exporterForBiomesOPlenty, Pair.of(BOPBlocks.MAHOGANY_PLANKS, 1), BOPItems.MAHOGANY_STAIRS, 1);
        createCarpentryRecipe(exporterForBiomesOPlenty, Pair.of(BOPBlocks.MAHOGANY_PLANKS, 1), BOPItems.MAHOGANY_TRAPDOOR, 2);

        createCarpentryRecipe(exporterForBiomesOPlenty, ModTags.Items.JACARANDA_LOGS, 1, BOPItems.JACARANDA_PLANKS, 4);
        createCarpentryRecipe(exporterForBiomesOPlenty, ModTags.Items.JACARANDA_LOGS, 1, BOPItems.JACARANDA_BOAT, 1);
        createCarpentryRecipe(exporterForBiomesOPlenty, ModTags.Items.JACARANDA_LOGS, 1, BOPItems.JACARANDA_BUTTON, 16);
        createCarpentryRecipe(exporterForBiomesOPlenty, ModTags.Items.JACARANDA_LOGS, 1, BOPItems.JACARANDA_DOOR, 4);
        createCarpentryRecipe(exporterForBiomesOPlenty, ModTags.Items.JACARANDA_LOGS, 1, BOPItems.JACARANDA_FENCE_GATE, 4);
        createCarpentryRecipe(exporterForBiomesOPlenty, ModTags.Items.JACARANDA_LOGS, 1, BOPItems.JACARANDA_FENCE, 4);
        createCarpentryRecipe(exporterForBiomesOPlenty, ModTags.Items.JACARANDA_LOGS, 1, BOPItems.JACARANDA_PRESSURE_PLATE, 16);
        createCarpentryRecipe(exporterForBiomesOPlenty, ModTags.Items.JACARANDA_LOGS, 1, BOPItems.JACARANDA_SIGN, 12);
        createCarpentryRecipe(exporterForBiomesOPlenty, ModTags.Items.JACARANDA_LOGS, 1, BOPItems.JACARANDA_SLAB, 8);
        createCarpentryRecipe(exporterForBiomesOPlenty, ModTags.Items.JACARANDA_LOGS, 1, BOPItems.JACARANDA_STAIRS, 4);
        createCarpentryRecipe(exporterForBiomesOPlenty, ModTags.Items.JACARANDA_LOGS, 1, BOPItems.JACARANDA_TRAPDOOR, 8);

        createCarpentryRecipe(exporterForBiomesOPlenty, Pair.of(BOPBlocks.JACARANDA_PLANKS, 2), BOPItems.JACARANDA_BOAT, 1);
        createCarpentryRecipe(exporterForBiomesOPlenty, Pair.of(BOPBlocks.JACARANDA_PLANKS, 1), BOPItems.JACARANDA_BUTTON, 4);
        createCarpentryRecipe(exporterForBiomesOPlenty, Pair.of(BOPBlocks.JACARANDA_PLANKS, 2), BOPItems.JACARANDA_DOOR, 2);
        createCarpentryRecipe(exporterForBiomesOPlenty, Pair.of(BOPBlocks.JACARANDA_PLANKS, 1), BOPItems.JACARANDA_FENCE_GATE, 1);
        createCarpentryRecipe(exporterForBiomesOPlenty, Pair.of(BOPBlocks.JACARANDA_PLANKS, 1), BOPItems.JACARANDA_FENCE, 1);
        createCarpentryRecipe(exporterForBiomesOPlenty, Pair.of(BOPBlocks.JACARANDA_PLANKS, 1), BOPItems.JACARANDA_PRESSURE_PLATE, 4);
        createCarpentryRecipe(exporterForBiomesOPlenty, Pair.of(BOPBlocks.JACARANDA_PLANKS, 1), BOPItems.JACARANDA_SIGN, 3);
        createCarpentryRecipe(exporterForBiomesOPlenty, Pair.of(BOPBlocks.JACARANDA_PLANKS, 1), BOPItems.JACARANDA_SLAB, 2);
        createCarpentryRecipe(exporterForBiomesOPlenty, Pair.of(BOPBlocks.JACARANDA_PLANKS, 1), BOPItems.JACARANDA_STAIRS, 1);
        createCarpentryRecipe(exporterForBiomesOPlenty, Pair.of(BOPBlocks.JACARANDA_PLANKS, 1), BOPItems.JACARANDA_TRAPDOOR, 2);

        createCarpentryRecipe(exporterForBiomesOPlenty, ModTags.Items.PALM_LOGS, 1, BOPItems.PALM_PLANKS, 4);
        createCarpentryRecipe(exporterForBiomesOPlenty, ModTags.Items.PALM_LOGS, 1, BOPItems.PALM_BOAT, 1);
        createCarpentryRecipe(exporterForBiomesOPlenty, ModTags.Items.PALM_LOGS, 1, BOPItems.PALM_BUTTON, 16);
        createCarpentryRecipe(exporterForBiomesOPlenty, ModTags.Items.PALM_LOGS, 1, BOPItems.PALM_DOOR, 4);
        createCarpentryRecipe(exporterForBiomesOPlenty, ModTags.Items.PALM_LOGS, 1, BOPItems.PALM_FENCE_GATE, 4);
        createCarpentryRecipe(exporterForBiomesOPlenty, ModTags.Items.PALM_LOGS, 1, BOPItems.PALM_FENCE, 4);
        createCarpentryRecipe(exporterForBiomesOPlenty, ModTags.Items.PALM_LOGS, 1, BOPItems.PALM_PRESSURE_PLATE, 16);
        createCarpentryRecipe(exporterForBiomesOPlenty, ModTags.Items.PALM_LOGS, 1, BOPItems.PALM_SIGN, 12);
        createCarpentryRecipe(exporterForBiomesOPlenty, ModTags.Items.PALM_LOGS, 1, BOPItems.PALM_SLAB, 8);
        createCarpentryRecipe(exporterForBiomesOPlenty, ModTags.Items.PALM_LOGS, 1, BOPItems.PALM_STAIRS, 4);
        createCarpentryRecipe(exporterForBiomesOPlenty, ModTags.Items.PALM_LOGS, 1, BOPItems.PALM_TRAPDOOR, 8);

        createCarpentryRecipe(exporterForBiomesOPlenty, Pair.of(BOPBlocks.PALM_PLANKS, 2), BOPItems.PALM_BOAT, 1);
        createCarpentryRecipe(exporterForBiomesOPlenty, Pair.of(BOPBlocks.PALM_PLANKS, 1), BOPItems.PALM_BUTTON, 4);
        createCarpentryRecipe(exporterForBiomesOPlenty, Pair.of(BOPBlocks.PALM_PLANKS, 2), BOPItems.PALM_DOOR, 2);
        createCarpentryRecipe(exporterForBiomesOPlenty, Pair.of(BOPBlocks.PALM_PLANKS, 1), BOPItems.PALM_FENCE_GATE, 1);
        createCarpentryRecipe(exporterForBiomesOPlenty, Pair.of(BOPBlocks.PALM_PLANKS, 1), BOPItems.PALM_FENCE, 1);
        createCarpentryRecipe(exporterForBiomesOPlenty, Pair.of(BOPBlocks.PALM_PLANKS, 1), BOPItems.PALM_PRESSURE_PLATE, 4);
        createCarpentryRecipe(exporterForBiomesOPlenty, Pair.of(BOPBlocks.PALM_PLANKS, 1), BOPItems.PALM_SIGN, 3);
        createCarpentryRecipe(exporterForBiomesOPlenty, Pair.of(BOPBlocks.PALM_PLANKS, 1), BOPItems.PALM_SLAB, 2);
        createCarpentryRecipe(exporterForBiomesOPlenty, Pair.of(BOPBlocks.PALM_PLANKS, 1), BOPItems.PALM_STAIRS, 1);
        createCarpentryRecipe(exporterForBiomesOPlenty, Pair.of(BOPBlocks.PALM_PLANKS, 1), BOPItems.PALM_TRAPDOOR, 2);

        createCarpentryRecipe(exporterForBiomesOPlenty, ModTags.Items.WILLOW_LOGS, 1, BOPItems.WILLOW_PLANKS, 4);
        createCarpentryRecipe(exporterForBiomesOPlenty, ModTags.Items.WILLOW_LOGS, 1, BOPItems.WILLOW_BOAT, 1);
        createCarpentryRecipe(exporterForBiomesOPlenty, ModTags.Items.WILLOW_LOGS, 1, BOPItems.WILLOW_BUTTON, 16);
        createCarpentryRecipe(exporterForBiomesOPlenty, ModTags.Items.WILLOW_LOGS, 1, BOPItems.WILLOW_DOOR, 4);
        createCarpentryRecipe(exporterForBiomesOPlenty, ModTags.Items.WILLOW_LOGS, 1, BOPItems.WILLOW_FENCE_GATE, 4);
        createCarpentryRecipe(exporterForBiomesOPlenty, ModTags.Items.WILLOW_LOGS, 1, BOPItems.WILLOW_FENCE, 4);
        createCarpentryRecipe(exporterForBiomesOPlenty, ModTags.Items.WILLOW_LOGS, 1, BOPItems.WILLOW_PRESSURE_PLATE, 16);
        createCarpentryRecipe(exporterForBiomesOPlenty, ModTags.Items.WILLOW_LOGS, 1, BOPItems.WILLOW_SIGN, 12);
        createCarpentryRecipe(exporterForBiomesOPlenty, ModTags.Items.WILLOW_LOGS, 1, BOPItems.WILLOW_SLAB, 8);
        createCarpentryRecipe(exporterForBiomesOPlenty, ModTags.Items.WILLOW_LOGS, 1, BOPItems.WILLOW_STAIRS, 4);
        createCarpentryRecipe(exporterForBiomesOPlenty, ModTags.Items.WILLOW_LOGS, 1, BOPItems.WILLOW_TRAPDOOR, 8);

        createCarpentryRecipe(exporterForBiomesOPlenty, Pair.of(BOPBlocks.WILLOW_PLANKS, 2), BOPItems.WILLOW_BOAT, 1);
        createCarpentryRecipe(exporterForBiomesOPlenty, Pair.of(BOPBlocks.WILLOW_PLANKS, 1), BOPItems.WILLOW_BUTTON, 4);
        createCarpentryRecipe(exporterForBiomesOPlenty, Pair.of(BOPBlocks.WILLOW_PLANKS, 2), BOPItems.WILLOW_DOOR, 2);
        createCarpentryRecipe(exporterForBiomesOPlenty, Pair.of(BOPBlocks.WILLOW_PLANKS, 1), BOPItems.WILLOW_FENCE_GATE, 1);
        createCarpentryRecipe(exporterForBiomesOPlenty, Pair.of(BOPBlocks.WILLOW_PLANKS, 1), BOPItems.WILLOW_FENCE, 1);
        createCarpentryRecipe(exporterForBiomesOPlenty, Pair.of(BOPBlocks.WILLOW_PLANKS, 1), BOPItems.WILLOW_PRESSURE_PLATE, 4);
        createCarpentryRecipe(exporterForBiomesOPlenty, Pair.of(BOPBlocks.WILLOW_PLANKS, 1), BOPItems.WILLOW_SIGN, 3);
        createCarpentryRecipe(exporterForBiomesOPlenty, Pair.of(BOPBlocks.WILLOW_PLANKS, 1), BOPItems.WILLOW_SLAB, 2);
        createCarpentryRecipe(exporterForBiomesOPlenty, Pair.of(BOPBlocks.WILLOW_PLANKS, 1), BOPItems.WILLOW_STAIRS, 1);
        createCarpentryRecipe(exporterForBiomesOPlenty, Pair.of(BOPBlocks.WILLOW_PLANKS, 1), BOPItems.WILLOW_TRAPDOOR, 2);

        createCarpentryRecipe(exporterForBiomesOPlenty, ModTags.Items.DEAD_LOGS, 1, BOPItems.DEAD_PLANKS, 4);
        createCarpentryRecipe(exporterForBiomesOPlenty, ModTags.Items.DEAD_LOGS, 1, BOPItems.DEAD_BOAT, 1);
        createCarpentryRecipe(exporterForBiomesOPlenty, ModTags.Items.DEAD_LOGS, 1, BOPItems.DEAD_BUTTON, 16);
        createCarpentryRecipe(exporterForBiomesOPlenty, ModTags.Items.DEAD_LOGS, 1, BOPItems.DEAD_DOOR, 4);
        createCarpentryRecipe(exporterForBiomesOPlenty, ModTags.Items.DEAD_LOGS, 1, BOPItems.DEAD_FENCE_GATE, 4);
        createCarpentryRecipe(exporterForBiomesOPlenty, ModTags.Items.DEAD_LOGS, 1, BOPItems.DEAD_FENCE, 4);
        createCarpentryRecipe(exporterForBiomesOPlenty, ModTags.Items.DEAD_LOGS, 1, BOPItems.DEAD_PRESSURE_PLATE, 16);
        createCarpentryRecipe(exporterForBiomesOPlenty, ModTags.Items.DEAD_LOGS, 1, BOPItems.DEAD_SIGN, 12);
        createCarpentryRecipe(exporterForBiomesOPlenty, ModTags.Items.DEAD_LOGS, 1, BOPItems.DEAD_SLAB, 8);
        createCarpentryRecipe(exporterForBiomesOPlenty, ModTags.Items.DEAD_LOGS, 1, BOPItems.DEAD_STAIRS, 4);
        createCarpentryRecipe(exporterForBiomesOPlenty, ModTags.Items.DEAD_LOGS, 1, BOPItems.DEAD_TRAPDOOR, 8);

        createCarpentryRecipe(exporterForBiomesOPlenty, Pair.of(BOPBlocks.DEAD_PLANKS, 2), BOPItems.DEAD_BOAT, 1);
        createCarpentryRecipe(exporterForBiomesOPlenty, Pair.of(BOPBlocks.DEAD_PLANKS, 1), BOPItems.DEAD_BUTTON, 4);
        createCarpentryRecipe(exporterForBiomesOPlenty, Pair.of(BOPBlocks.DEAD_PLANKS, 2), BOPItems.DEAD_DOOR, 2);
        createCarpentryRecipe(exporterForBiomesOPlenty, Pair.of(BOPBlocks.DEAD_PLANKS, 1), BOPItems.DEAD_FENCE_GATE, 1);
        createCarpentryRecipe(exporterForBiomesOPlenty, Pair.of(BOPBlocks.DEAD_PLANKS, 1), BOPItems.DEAD_FENCE, 1);
        createCarpentryRecipe(exporterForBiomesOPlenty, Pair.of(BOPBlocks.DEAD_PLANKS, 1), BOPItems.DEAD_PRESSURE_PLATE, 4);
        createCarpentryRecipe(exporterForBiomesOPlenty, Pair.of(BOPBlocks.DEAD_PLANKS, 1), BOPItems.DEAD_SIGN, 3);
        createCarpentryRecipe(exporterForBiomesOPlenty, Pair.of(BOPBlocks.DEAD_PLANKS, 1), BOPItems.DEAD_SLAB, 2);
        createCarpentryRecipe(exporterForBiomesOPlenty, Pair.of(BOPBlocks.DEAD_PLANKS, 1), BOPItems.DEAD_STAIRS, 1);
        createCarpentryRecipe(exporterForBiomesOPlenty, Pair.of(BOPBlocks.DEAD_PLANKS, 1), BOPItems.DEAD_TRAPDOOR, 2);

        createCarpentryRecipe(exporterForBiomesOPlenty, ModTags.Items.MAGIC_LOGS, 1, BOPItems.MAGIC_PLANKS, 4);
        createCarpentryRecipe(exporterForBiomesOPlenty, ModTags.Items.MAGIC_LOGS, 1, BOPItems.MAGIC_BOAT, 1);
        createCarpentryRecipe(exporterForBiomesOPlenty, ModTags.Items.MAGIC_LOGS, 1, BOPItems.MAGIC_BUTTON, 16);
        createCarpentryRecipe(exporterForBiomesOPlenty, ModTags.Items.MAGIC_LOGS, 1, BOPItems.MAGIC_DOOR, 4);
        createCarpentryRecipe(exporterForBiomesOPlenty, ModTags.Items.MAGIC_LOGS, 1, BOPItems.MAGIC_FENCE_GATE, 4);
        createCarpentryRecipe(exporterForBiomesOPlenty, ModTags.Items.MAGIC_LOGS, 1, BOPItems.MAGIC_FENCE, 4);
        createCarpentryRecipe(exporterForBiomesOPlenty, ModTags.Items.MAGIC_LOGS, 1, BOPItems.MAGIC_PRESSURE_PLATE, 16);
        createCarpentryRecipe(exporterForBiomesOPlenty, ModTags.Items.MAGIC_LOGS, 1, BOPItems.MAGIC_SIGN, 12);
        createCarpentryRecipe(exporterForBiomesOPlenty, ModTags.Items.MAGIC_LOGS, 1, BOPItems.MAGIC_SLAB, 8);
        createCarpentryRecipe(exporterForBiomesOPlenty, ModTags.Items.MAGIC_LOGS, 1, BOPItems.MAGIC_STAIRS, 4);
        createCarpentryRecipe(exporterForBiomesOPlenty, ModTags.Items.MAGIC_LOGS, 1, BOPItems.MAGIC_TRAPDOOR, 8);

        createCarpentryRecipe(exporterForBiomesOPlenty, Pair.of(BOPBlocks.MAGIC_PLANKS, 2), BOPItems.MAGIC_BOAT, 1);
        createCarpentryRecipe(exporterForBiomesOPlenty, Pair.of(BOPBlocks.MAGIC_PLANKS, 1), BOPItems.MAGIC_BUTTON, 4);
        createCarpentryRecipe(exporterForBiomesOPlenty, Pair.of(BOPBlocks.MAGIC_PLANKS, 2), BOPItems.MAGIC_DOOR, 2);
        createCarpentryRecipe(exporterForBiomesOPlenty, Pair.of(BOPBlocks.MAGIC_PLANKS, 1), BOPItems.MAGIC_FENCE_GATE, 1);
        createCarpentryRecipe(exporterForBiomesOPlenty, Pair.of(BOPBlocks.MAGIC_PLANKS, 1), BOPItems.MAGIC_FENCE, 1);
        createCarpentryRecipe(exporterForBiomesOPlenty, Pair.of(BOPBlocks.MAGIC_PLANKS, 1), BOPItems.MAGIC_PRESSURE_PLATE, 4);
        createCarpentryRecipe(exporterForBiomesOPlenty, Pair.of(BOPBlocks.MAGIC_PLANKS, 1), BOPItems.MAGIC_SIGN, 3);
        createCarpentryRecipe(exporterForBiomesOPlenty, Pair.of(BOPBlocks.MAGIC_PLANKS, 1), BOPItems.MAGIC_SLAB, 2);
        createCarpentryRecipe(exporterForBiomesOPlenty, Pair.of(BOPBlocks.MAGIC_PLANKS, 1), BOPItems.MAGIC_STAIRS, 1);
        createCarpentryRecipe(exporterForBiomesOPlenty, Pair.of(BOPBlocks.MAGIC_PLANKS, 1), BOPItems.MAGIC_TRAPDOOR, 2);

        createCarpentryRecipe(exporterForBiomesOPlenty, ModTags.Items.UMBRAN_LOGS, 1, BOPItems.UMBRAN_PLANKS, 4);
        createCarpentryRecipe(exporterForBiomesOPlenty, ModTags.Items.UMBRAN_LOGS, 1, BOPItems.UMBRAN_BOAT, 1);
        createCarpentryRecipe(exporterForBiomesOPlenty, ModTags.Items.UMBRAN_LOGS, 1, BOPItems.UMBRAN_BUTTON, 16);
        createCarpentryRecipe(exporterForBiomesOPlenty, ModTags.Items.UMBRAN_LOGS, 1, BOPItems.UMBRAN_DOOR, 4);
        createCarpentryRecipe(exporterForBiomesOPlenty, ModTags.Items.UMBRAN_LOGS, 1, BOPItems.UMBRAN_FENCE_GATE, 4);
        createCarpentryRecipe(exporterForBiomesOPlenty, ModTags.Items.UMBRAN_LOGS, 1, BOPItems.UMBRAN_FENCE, 4);
        createCarpentryRecipe(exporterForBiomesOPlenty, ModTags.Items.UMBRAN_LOGS, 1, BOPItems.UMBRAN_PRESSURE_PLATE, 16);
        createCarpentryRecipe(exporterForBiomesOPlenty, ModTags.Items.UMBRAN_LOGS, 1, BOPItems.UMBRAN_SIGN, 12);
        createCarpentryRecipe(exporterForBiomesOPlenty, ModTags.Items.UMBRAN_LOGS, 1, BOPItems.UMBRAN_SLAB, 8);
        createCarpentryRecipe(exporterForBiomesOPlenty, ModTags.Items.UMBRAN_LOGS, 1, BOPItems.UMBRAN_STAIRS, 4);
        createCarpentryRecipe(exporterForBiomesOPlenty, ModTags.Items.UMBRAN_LOGS, 1, BOPItems.UMBRAN_TRAPDOOR, 8);

        createCarpentryRecipe(exporterForBiomesOPlenty, Pair.of(BOPBlocks.UMBRAN_PLANKS, 2), BOPItems.UMBRAN_BOAT, 1);
        createCarpentryRecipe(exporterForBiomesOPlenty, Pair.of(BOPBlocks.UMBRAN_PLANKS, 1), BOPItems.UMBRAN_BUTTON, 4);
        createCarpentryRecipe(exporterForBiomesOPlenty, Pair.of(BOPBlocks.UMBRAN_PLANKS, 2), BOPItems.UMBRAN_DOOR, 2);
        createCarpentryRecipe(exporterForBiomesOPlenty, Pair.of(BOPBlocks.UMBRAN_PLANKS, 1), BOPItems.UMBRAN_FENCE_GATE, 1);
        createCarpentryRecipe(exporterForBiomesOPlenty, Pair.of(BOPBlocks.UMBRAN_PLANKS, 1), BOPItems.UMBRAN_FENCE, 1);
        createCarpentryRecipe(exporterForBiomesOPlenty, Pair.of(BOPBlocks.UMBRAN_PLANKS, 1), BOPItems.UMBRAN_PRESSURE_PLATE, 4);
        createCarpentryRecipe(exporterForBiomesOPlenty, Pair.of(BOPBlocks.UMBRAN_PLANKS, 1), BOPItems.UMBRAN_SIGN, 3);
        createCarpentryRecipe(exporterForBiomesOPlenty, Pair.of(BOPBlocks.UMBRAN_PLANKS, 1), BOPItems.UMBRAN_SLAB, 2);
        createCarpentryRecipe(exporterForBiomesOPlenty, Pair.of(BOPBlocks.UMBRAN_PLANKS, 1), BOPItems.UMBRAN_STAIRS, 1);
        createCarpentryRecipe(exporterForBiomesOPlenty, Pair.of(BOPBlocks.UMBRAN_PLANKS, 1), BOPItems.UMBRAN_TRAPDOOR, 2);

        createCarpentryRecipe(exporterForBiomesOPlenty, ModTags.Items.HELLBARK_LOGS, 1, BOPItems.HELLBARK_PLANKS, 4);
        createCarpentryRecipe(exporterForBiomesOPlenty, ModTags.Items.HELLBARK_LOGS, 1, BOPItems.HELLBARK_BOAT, 1);
        createCarpentryRecipe(exporterForBiomesOPlenty, ModTags.Items.HELLBARK_LOGS, 1, BOPItems.HELLBARK_BUTTON, 16);
        createCarpentryRecipe(exporterForBiomesOPlenty, ModTags.Items.HELLBARK_LOGS, 1, BOPItems.HELLBARK_DOOR, 4);
        createCarpentryRecipe(exporterForBiomesOPlenty, ModTags.Items.HELLBARK_LOGS, 1, BOPItems.HELLBARK_FENCE_GATE, 4);
        createCarpentryRecipe(exporterForBiomesOPlenty, ModTags.Items.HELLBARK_LOGS, 1, BOPItems.HELLBARK_FENCE, 4);
        createCarpentryRecipe(exporterForBiomesOPlenty, ModTags.Items.HELLBARK_LOGS, 1, BOPItems.HELLBARK_PRESSURE_PLATE, 16);
        createCarpentryRecipe(exporterForBiomesOPlenty, ModTags.Items.HELLBARK_LOGS, 1, BOPItems.HELLBARK_SIGN, 12);
        createCarpentryRecipe(exporterForBiomesOPlenty, ModTags.Items.HELLBARK_LOGS, 1, BOPItems.HELLBARK_SLAB, 8);
        createCarpentryRecipe(exporterForBiomesOPlenty, ModTags.Items.HELLBARK_LOGS, 1, BOPItems.HELLBARK_STAIRS, 4);
        createCarpentryRecipe(exporterForBiomesOPlenty, ModTags.Items.HELLBARK_LOGS, 1, BOPItems.HELLBARK_TRAPDOOR, 8);

        createCarpentryRecipe(exporterForBiomesOPlenty, Pair.of(BOPBlocks.HELLBARK_PLANKS, 2), BOPItems.HELLBARK_BOAT, 1);
        createCarpentryRecipe(exporterForBiomesOPlenty, Pair.of(BOPBlocks.HELLBARK_PLANKS, 1), BOPItems.HELLBARK_BUTTON, 4);
        createCarpentryRecipe(exporterForBiomesOPlenty, Pair.of(BOPBlocks.HELLBARK_PLANKS, 2), BOPItems.HELLBARK_DOOR, 2);
        createCarpentryRecipe(exporterForBiomesOPlenty, Pair.of(BOPBlocks.HELLBARK_PLANKS, 1), BOPItems.HELLBARK_FENCE_GATE, 1);
        createCarpentryRecipe(exporterForBiomesOPlenty, Pair.of(BOPBlocks.HELLBARK_PLANKS, 1), BOPItems.HELLBARK_FENCE, 1);
        createCarpentryRecipe(exporterForBiomesOPlenty, Pair.of(BOPBlocks.HELLBARK_PLANKS, 1), BOPItems.HELLBARK_PRESSURE_PLATE, 4);
        createCarpentryRecipe(exporterForBiomesOPlenty, Pair.of(BOPBlocks.HELLBARK_PLANKS, 1), BOPItems.HELLBARK_SIGN, 3);
        createCarpentryRecipe(exporterForBiomesOPlenty, Pair.of(BOPBlocks.HELLBARK_PLANKS, 1), BOPItems.HELLBARK_SLAB, 2);
        createCarpentryRecipe(exporterForBiomesOPlenty, Pair.of(BOPBlocks.HELLBARK_PLANKS, 1), BOPItems.HELLBARK_STAIRS, 1);
        createCarpentryRecipe(exporterForBiomesOPlenty, Pair.of(BOPBlocks.HELLBARK_PLANKS, 1), BOPItems.HELLBARK_TRAPDOOR, 2);

        createCarpentryRecipe(exporterForBiomesOPlenty, ModTags.Items.EMPYREAL_LOGS, 1, BOPItems.EMPYREAL_PLANKS, 4);
        createCarpentryRecipe(exporterForBiomesOPlenty, ModTags.Items.EMPYREAL_LOGS, 1, BOPItems.EMPYREAL_BOAT, 1);
        createCarpentryRecipe(exporterForBiomesOPlenty, ModTags.Items.EMPYREAL_LOGS, 1, BOPItems.EMPYREAL_BUTTON, 16);
        createCarpentryRecipe(exporterForBiomesOPlenty, ModTags.Items.EMPYREAL_LOGS, 1, BOPItems.EMPYREAL_DOOR, 4);
        createCarpentryRecipe(exporterForBiomesOPlenty, ModTags.Items.EMPYREAL_LOGS, 1, BOPItems.EMPYREAL_FENCE_GATE, 4);
        createCarpentryRecipe(exporterForBiomesOPlenty, ModTags.Items.EMPYREAL_LOGS, 1, BOPItems.EMPYREAL_FENCE, 4);
        createCarpentryRecipe(exporterForBiomesOPlenty, ModTags.Items.EMPYREAL_LOGS, 1, BOPItems.EMPYREAL_PRESSURE_PLATE, 16);
        createCarpentryRecipe(exporterForBiomesOPlenty, ModTags.Items.EMPYREAL_LOGS, 1, BOPItems.EMPYREAL_SIGN, 12);
        createCarpentryRecipe(exporterForBiomesOPlenty, ModTags.Items.EMPYREAL_LOGS, 1, BOPItems.EMPYREAL_SLAB, 8);
        createCarpentryRecipe(exporterForBiomesOPlenty, ModTags.Items.EMPYREAL_LOGS, 1, BOPItems.EMPYREAL_STAIRS, 4);
        createCarpentryRecipe(exporterForBiomesOPlenty, ModTags.Items.EMPYREAL_LOGS, 1, BOPItems.EMPYREAL_TRAPDOOR, 8);

        createCarpentryRecipe(exporterForBiomesOPlenty, Pair.of(BOPBlocks.EMPYREAL_PLANKS, 2), BOPItems.EMPYREAL_BOAT, 1);
        createCarpentryRecipe(exporterForBiomesOPlenty, Pair.of(BOPBlocks.EMPYREAL_PLANKS, 1), BOPItems.EMPYREAL_BUTTON, 4);
        createCarpentryRecipe(exporterForBiomesOPlenty, Pair.of(BOPBlocks.EMPYREAL_PLANKS, 2), BOPItems.EMPYREAL_DOOR, 2);
        createCarpentryRecipe(exporterForBiomesOPlenty, Pair.of(BOPBlocks.EMPYREAL_PLANKS, 1), BOPItems.EMPYREAL_FENCE_GATE, 1);
        createCarpentryRecipe(exporterForBiomesOPlenty, Pair.of(BOPBlocks.EMPYREAL_PLANKS, 1), BOPItems.EMPYREAL_FENCE, 1);
        createCarpentryRecipe(exporterForBiomesOPlenty, Pair.of(BOPBlocks.EMPYREAL_PLANKS, 1), BOPItems.EMPYREAL_PRESSURE_PLATE, 4);
        createCarpentryRecipe(exporterForBiomesOPlenty, Pair.of(BOPBlocks.EMPYREAL_PLANKS, 1), BOPItems.EMPYREAL_SIGN, 3);
        createCarpentryRecipe(exporterForBiomesOPlenty, Pair.of(BOPBlocks.EMPYREAL_PLANKS, 1), BOPItems.EMPYREAL_SLAB, 2);
        createCarpentryRecipe(exporterForBiomesOPlenty, Pair.of(BOPBlocks.EMPYREAL_PLANKS, 1), BOPItems.EMPYREAL_STAIRS, 1);
        createCarpentryRecipe(exporterForBiomesOPlenty, Pair.of(BOPBlocks.EMPYREAL_PLANKS, 1), BOPItems.EMPYREAL_TRAPDOOR, 2);
    }

    private void createCarpentryRecipe(RecipeExporter exporter, Pair<Block, Integer> ingredientPair, Item output,
                                       int outputCount) {
        Block input = ingredientPair.getFirst();
        String blockName = Registries.BLOCK.getId(input).getPath();

        WoodcuttingRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, output, outputCount)
                .input(Ingredient.ofItems(input), ingredientPair.getSecond())
                .criterion(FabricRecipeProvider.hasItem(output), conditionsFromItem(output))
                .offerTo(exporter, new Identifier(blockName + "_to_" + getRecipeName(output) + "_woodcutting"));
    }

    private void createCarpentryRecipe(RecipeExporter exporter, TagKey<Item> tag, Integer ingredientCount, Item output,
                                       int outputCount) {
        String tagPath = tag.id().getPath();

        WoodcuttingRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, output, outputCount)
                .input(Ingredient.fromTag(tag), ingredientCount)
                .criterion(FabricRecipeProvider.hasItem(output), conditionsFromItem(output))
                .offerTo(exporter, new Identifier(tagPath + "_to_" + getRecipeName(output) + "_woodcutting"));
    }
}
