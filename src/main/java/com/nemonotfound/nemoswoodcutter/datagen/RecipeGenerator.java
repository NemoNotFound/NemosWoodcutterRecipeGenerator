package com.nemonotfound.nemoswoodcutter.datagen;

import biomesoplenty.api.block.BOPBlocks;
import biomesoplenty.api.item.BOPItems;
import biomesoplenty.init.ModTags;
import com.mojang.datafixers.util.Pair;
import io.github.uhq_games.regions_unexplored.block.RuBlocks;
import io.github.uhq_games.regions_unexplored.data.tags.RuTags;
import io.github.uhq_games.regions_unexplored.item.RuItems;
import net.Pandarix.betterarcheology.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.fabricmc.fabric.api.resource.conditions.v1.DefaultResourceConditions;
import net.minecraft.block.Block;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.item.Item;
import net.minecraft.item.ItemConvertible;
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
        createBiomesOPlentyRecipes(exporter);
        createRegionsUnexploredRecipes(exporter);
        createBetterArcheologyRecipes(exporter);
    }

    private void createBiomesOPlentyRecipes(RecipeExporter exporter) {
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

    private void createRegionsUnexploredRecipes(RecipeExporter exporter) {
        RecipeExporter exporterForRegionsUnexplored = withConditions(exporter, DefaultResourceConditions.allModsLoaded("regions_unexplored"));

        createCarpentryRecipe(exporterForRegionsUnexplored, Pair.of(RuBlocks.ALPHA_PLANKS, 1), RuBlocks.ALPHA_SLAB, 2);
        createCarpentryRecipe(exporterForRegionsUnexplored, Pair.of(RuBlocks.ALPHA_PLANKS, 1), RuBlocks.ALPHA_STAIRS, 1);

        createCarpentryRecipe(exporterForRegionsUnexplored, Pair.of(RuBlocks.ALPHA_LOG, 1), RuBlocks.ALPHA_PLANKS, 4);
        createCarpentryRecipe(exporterForRegionsUnexplored, Pair.of(RuBlocks.ALPHA_LOG, 1), RuBlocks.ALPHA_SLAB, 8);
        createCarpentryRecipe(exporterForRegionsUnexplored, Pair.of(RuBlocks.ALPHA_LOG, 1), RuBlocks.ALPHA_STAIRS, 4);

        createCarpentryRecipe(exporterForRegionsUnexplored, Pair.of(RuBlocks.BAOBAB_PLANKS, 2), RuItems.BAOBAB_BOAT, 1);
        createCarpentryRecipe(exporterForRegionsUnexplored, Pair.of(RuBlocks.BAOBAB_PLANKS, 1), RuBlocks.BAOBAB_BUTTON, 4);
        createCarpentryRecipe(exporterForRegionsUnexplored, Pair.of(RuBlocks.BAOBAB_PLANKS, 2), RuBlocks.BAOBAB_DOOR, 2);
        createCarpentryRecipe(exporterForRegionsUnexplored, Pair.of(RuBlocks.BAOBAB_PLANKS, 1), RuBlocks.BAOBAB_FENCE_GATE, 1);
        createCarpentryRecipe(exporterForRegionsUnexplored, Pair.of(RuBlocks.BAOBAB_PLANKS, 1), RuBlocks.BAOBAB_FENCE, 1);
        createCarpentryRecipe(exporterForRegionsUnexplored, Pair.of(RuBlocks.BAOBAB_PLANKS, 1), RuBlocks.BAOBAB_PRESSURE_PLATE, 4);
        createCarpentryRecipe(exporterForRegionsUnexplored, Pair.of(RuBlocks.BAOBAB_PLANKS, 1), RuBlocks.BAOBAB_SIGN, 3);
        createCarpentryRecipe(exporterForRegionsUnexplored, Pair.of(RuBlocks.BAOBAB_PLANKS, 1), RuBlocks.BAOBAB_SLAB, 2);
        createCarpentryRecipe(exporterForRegionsUnexplored, Pair.of(RuBlocks.BAOBAB_PLANKS, 1), RuBlocks.BAOBAB_STAIRS, 1);
        createCarpentryRecipe(exporterForRegionsUnexplored, Pair.of(RuBlocks.BAOBAB_PLANKS, 1), RuBlocks.BAOBAB_TRAPDOOR, 2);

        createCarpentryRecipe(exporterForRegionsUnexplored, RuTags.BAOBAB_LOGS_ITEM, 1, RuBlocks.BAOBAB_PLANKS, 4);
        createCarpentryRecipe(exporterForRegionsUnexplored, RuTags.BAOBAB_LOGS_ITEM, 1, RuItems.BAOBAB_BOAT, 1);
        createCarpentryRecipe(exporterForRegionsUnexplored, RuTags.BAOBAB_LOGS_ITEM, 1, RuBlocks.BAOBAB_BUTTON, 16);
        createCarpentryRecipe(exporterForRegionsUnexplored, RuTags.BAOBAB_LOGS_ITEM, 1, RuBlocks.BAOBAB_DOOR, 4);
        createCarpentryRecipe(exporterForRegionsUnexplored, RuTags.BAOBAB_LOGS_ITEM, 1, RuBlocks.BAOBAB_FENCE_GATE, 4);
        createCarpentryRecipe(exporterForRegionsUnexplored, RuTags.BAOBAB_LOGS_ITEM, 1, RuBlocks.BAOBAB_FENCE, 4);
        createCarpentryRecipe(exporterForRegionsUnexplored, RuTags.BAOBAB_LOGS_ITEM, 1, RuBlocks.BAOBAB_PRESSURE_PLATE, 16);
        createCarpentryRecipe(exporterForRegionsUnexplored, RuTags.BAOBAB_LOGS_ITEM, 1, RuBlocks.BAOBAB_SIGN, 12);
        createCarpentryRecipe(exporterForRegionsUnexplored, RuTags.BAOBAB_LOGS_ITEM, 1, RuBlocks.BAOBAB_SLAB, 8);
        createCarpentryRecipe(exporterForRegionsUnexplored, RuTags.BAOBAB_LOGS_ITEM, 1, RuBlocks.BAOBAB_STAIRS, 4);
        createCarpentryRecipe(exporterForRegionsUnexplored, RuTags.BAOBAB_LOGS_ITEM, 1, RuBlocks.BAOBAB_TRAPDOOR, 8);

        createCarpentryRecipe(exporterForRegionsUnexplored, Pair.of(RuBlocks.BLACKWOOD_PLANKS, 2), RuItems.BLACKWOOD_BOAT, 1);
        createCarpentryRecipe(exporterForRegionsUnexplored, Pair.of(RuBlocks.BLACKWOOD_PLANKS, 1), RuBlocks.BLACKWOOD_BUTTON, 4);
        createCarpentryRecipe(exporterForRegionsUnexplored, Pair.of(RuBlocks.BLACKWOOD_PLANKS, 2), RuBlocks.BLACKWOOD_DOOR, 2);
        createCarpentryRecipe(exporterForRegionsUnexplored, Pair.of(RuBlocks.BLACKWOOD_PLANKS, 1), RuBlocks.BLACKWOOD_FENCE_GATE, 1);
        createCarpentryRecipe(exporterForRegionsUnexplored, Pair.of(RuBlocks.BLACKWOOD_PLANKS, 1), RuBlocks.BLACKWOOD_FENCE, 1);
        createCarpentryRecipe(exporterForRegionsUnexplored, Pair.of(RuBlocks.BLACKWOOD_PLANKS, 1), RuBlocks.BLACKWOOD_PRESSURE_PLATE, 4);
        createCarpentryRecipe(exporterForRegionsUnexplored, Pair.of(RuBlocks.BLACKWOOD_PLANKS, 1), RuBlocks.BLACKWOOD_SIGN, 3);
        createCarpentryRecipe(exporterForRegionsUnexplored, Pair.of(RuBlocks.BLACKWOOD_PLANKS, 1), RuBlocks.BLACKWOOD_SLAB, 2);
        createCarpentryRecipe(exporterForRegionsUnexplored, Pair.of(RuBlocks.BLACKWOOD_PLANKS, 1), RuBlocks.BLACKWOOD_STAIRS, 1);
        createCarpentryRecipe(exporterForRegionsUnexplored, Pair.of(RuBlocks.BLACKWOOD_PLANKS, 1), RuBlocks.BLACKWOOD_TRAPDOOR, 2);

        createCarpentryRecipe(exporterForRegionsUnexplored, RuTags.BLACKWOOD_LOGS_ITEM, 1, RuBlocks.BLACKWOOD_PLANKS, 4);
        createCarpentryRecipe(exporterForRegionsUnexplored, RuTags.BLACKWOOD_LOGS_ITEM, 1, RuItems.BLACKWOOD_BOAT, 1);
        createCarpentryRecipe(exporterForRegionsUnexplored, RuTags.BLACKWOOD_LOGS_ITEM, 1, RuBlocks.BLACKWOOD_BUTTON, 16);
        createCarpentryRecipe(exporterForRegionsUnexplored, RuTags.BLACKWOOD_LOGS_ITEM, 1, RuBlocks.BLACKWOOD_DOOR, 4);
        createCarpentryRecipe(exporterForRegionsUnexplored, RuTags.BLACKWOOD_LOGS_ITEM, 1, RuBlocks.BLACKWOOD_FENCE_GATE, 4);
        createCarpentryRecipe(exporterForRegionsUnexplored, RuTags.BLACKWOOD_LOGS_ITEM, 1, RuBlocks.BLACKWOOD_FENCE, 4);
        createCarpentryRecipe(exporterForRegionsUnexplored, RuTags.BLACKWOOD_LOGS_ITEM, 1, RuBlocks.BLACKWOOD_PRESSURE_PLATE, 16);
        createCarpentryRecipe(exporterForRegionsUnexplored, RuTags.BLACKWOOD_LOGS_ITEM, 1, RuBlocks.BLACKWOOD_SIGN, 12);
        createCarpentryRecipe(exporterForRegionsUnexplored, RuTags.BLACKWOOD_LOGS_ITEM, 1, RuBlocks.BLACKWOOD_SLAB, 8);
        createCarpentryRecipe(exporterForRegionsUnexplored, RuTags.BLACKWOOD_LOGS_ITEM, 1, RuBlocks.BLACKWOOD_STAIRS, 4);
        createCarpentryRecipe(exporterForRegionsUnexplored, RuTags.BLACKWOOD_LOGS_ITEM, 1, RuBlocks.BLACKWOOD_TRAPDOOR, 8);

        createCarpentryRecipe(exporterForRegionsUnexplored, Pair.of(RuBlocks.BLUE_BIOSHROOM_PLANKS, 1), RuBlocks.BLUE_BIOSHROOM_BUTTON, 4);
        createCarpentryRecipe(exporterForRegionsUnexplored, Pair.of(RuBlocks.BLUE_BIOSHROOM_PLANKS, 2), RuBlocks.BLUE_BIOSHROOM_DOOR, 2);
        createCarpentryRecipe(exporterForRegionsUnexplored, Pair.of(RuBlocks.BLUE_BIOSHROOM_PLANKS, 1), RuBlocks.BLUE_BIOSHROOM_FENCE_GATE, 1);
        createCarpentryRecipe(exporterForRegionsUnexplored, Pair.of(RuBlocks.BLUE_BIOSHROOM_PLANKS, 1), RuBlocks.BLUE_BIOSHROOM_FENCE, 1);
        createCarpentryRecipe(exporterForRegionsUnexplored, Pair.of(RuBlocks.BLUE_BIOSHROOM_PLANKS, 1), RuBlocks.BLUE_BIOSHROOM_PRESSURE_PLATE, 4);
        createCarpentryRecipe(exporterForRegionsUnexplored, Pair.of(RuBlocks.BLUE_BIOSHROOM_PLANKS, 1), RuBlocks.BLUE_BIOSHROOM_SIGN, 3);
        createCarpentryRecipe(exporterForRegionsUnexplored, Pair.of(RuBlocks.BLUE_BIOSHROOM_PLANKS, 1), RuBlocks.BLUE_BIOSHROOM_SLAB, 2);
        createCarpentryRecipe(exporterForRegionsUnexplored, Pair.of(RuBlocks.BLUE_BIOSHROOM_PLANKS, 1), RuBlocks.BLUE_BIOSHROOM_STAIRS, 1);
        createCarpentryRecipe(exporterForRegionsUnexplored, Pair.of(RuBlocks.BLUE_BIOSHROOM_PLANKS, 1), RuBlocks.BLUE_BIOSHROOM_TRAPDOOR, 2);

        createCarpentryRecipe(exporterForRegionsUnexplored, RuTags.BLUE_BIOSHROOM_LOGS_ITEM, 1, RuBlocks.BLUE_BIOSHROOM_PLANKS, 4);
        createCarpentryRecipe(exporterForRegionsUnexplored, RuTags.BLUE_BIOSHROOM_LOGS_ITEM, 1, RuBlocks.BLUE_BIOSHROOM_BUTTON, 16);
        createCarpentryRecipe(exporterForRegionsUnexplored, RuTags.BLUE_BIOSHROOM_LOGS_ITEM, 1, RuBlocks.BLUE_BIOSHROOM_DOOR, 4);
        createCarpentryRecipe(exporterForRegionsUnexplored, RuTags.BLUE_BIOSHROOM_LOGS_ITEM, 1, RuBlocks.BLUE_BIOSHROOM_FENCE_GATE, 4);
        createCarpentryRecipe(exporterForRegionsUnexplored, RuTags.BLUE_BIOSHROOM_LOGS_ITEM, 1, RuBlocks.BLUE_BIOSHROOM_FENCE, 4);
        createCarpentryRecipe(exporterForRegionsUnexplored, RuTags.BLUE_BIOSHROOM_LOGS_ITEM, 1, RuBlocks.BLUE_BIOSHROOM_PRESSURE_PLATE, 16);
        createCarpentryRecipe(exporterForRegionsUnexplored, RuTags.BLUE_BIOSHROOM_LOGS_ITEM, 1, RuBlocks.BLUE_BIOSHROOM_SIGN, 12);
        createCarpentryRecipe(exporterForRegionsUnexplored, RuTags.BLUE_BIOSHROOM_LOGS_ITEM, 1, RuBlocks.BLUE_BIOSHROOM_SLAB, 8);
        createCarpentryRecipe(exporterForRegionsUnexplored, RuTags.BLUE_BIOSHROOM_LOGS_ITEM, 1, RuBlocks.BLUE_BIOSHROOM_STAIRS, 4);
        createCarpentryRecipe(exporterForRegionsUnexplored, RuTags.BLUE_BIOSHROOM_LOGS_ITEM, 1, RuBlocks.BLUE_BIOSHROOM_TRAPDOOR, 8);

        createCarpentryRecipe(exporterForRegionsUnexplored, Pair.of(RuBlocks.BRIMWOOD_PLANKS, 1), RuBlocks.BRIMWOOD_BUTTON, 4);
        createCarpentryRecipe(exporterForRegionsUnexplored, Pair.of(RuBlocks.BRIMWOOD_PLANKS, 2), RuBlocks.BRIMWOOD_DOOR, 2);
        createCarpentryRecipe(exporterForRegionsUnexplored, Pair.of(RuBlocks.BRIMWOOD_PLANKS, 1), RuBlocks.BRIMWOOD_FENCE_GATE, 1);
        createCarpentryRecipe(exporterForRegionsUnexplored, Pair.of(RuBlocks.BRIMWOOD_PLANKS, 1), RuBlocks.BRIMWOOD_FENCE, 1);
        createCarpentryRecipe(exporterForRegionsUnexplored, Pair.of(RuBlocks.BRIMWOOD_PLANKS, 1), RuBlocks.BRIMWOOD_PRESSURE_PLATE, 4);
        createCarpentryRecipe(exporterForRegionsUnexplored, Pair.of(RuBlocks.BRIMWOOD_PLANKS, 1), RuBlocks.BRIMWOOD_SIGN, 3);
        createCarpentryRecipe(exporterForRegionsUnexplored, Pair.of(RuBlocks.BRIMWOOD_PLANKS, 1), RuBlocks.BRIMWOOD_SLAB, 2);
        createCarpentryRecipe(exporterForRegionsUnexplored, Pair.of(RuBlocks.BRIMWOOD_PLANKS, 1), RuBlocks.BRIMWOOD_STAIRS, 1);
        createCarpentryRecipe(exporterForRegionsUnexplored, Pair.of(RuBlocks.BRIMWOOD_PLANKS, 1), RuBlocks.BRIMWOOD_TRAPDOOR, 2);

        createCarpentryRecipe(exporterForRegionsUnexplored, RuTags.BRIMWOOD_LOGS_ITEM, 1, RuBlocks.BRIMWOOD_PLANKS, 4);
        createCarpentryRecipe(exporterForRegionsUnexplored, RuTags.BRIMWOOD_LOGS_ITEM, 1, RuBlocks.BRIMWOOD_BUTTON, 16);
        createCarpentryRecipe(exporterForRegionsUnexplored, RuTags.BRIMWOOD_LOGS_ITEM, 1, RuBlocks.BRIMWOOD_DOOR, 4);
        createCarpentryRecipe(exporterForRegionsUnexplored, RuTags.BRIMWOOD_LOGS_ITEM, 1, RuBlocks.BRIMWOOD_FENCE_GATE, 4);
        createCarpentryRecipe(exporterForRegionsUnexplored, RuTags.BRIMWOOD_LOGS_ITEM, 1, RuBlocks.BRIMWOOD_FENCE, 4);
        createCarpentryRecipe(exporterForRegionsUnexplored, RuTags.BRIMWOOD_LOGS_ITEM, 1, RuBlocks.BRIMWOOD_PRESSURE_PLATE, 16);
        createCarpentryRecipe(exporterForRegionsUnexplored, RuTags.BRIMWOOD_LOGS_ITEM, 1, RuBlocks.BRIMWOOD_SIGN, 12);
        createCarpentryRecipe(exporterForRegionsUnexplored, RuTags.BRIMWOOD_LOGS_ITEM, 1, RuBlocks.BRIMWOOD_SLAB, 8);
        createCarpentryRecipe(exporterForRegionsUnexplored, RuTags.BRIMWOOD_LOGS_ITEM, 1, RuBlocks.BRIMWOOD_STAIRS, 4);
        createCarpentryRecipe(exporterForRegionsUnexplored, RuTags.BRIMWOOD_LOGS_ITEM, 1, RuBlocks.BRIMWOOD_TRAPDOOR, 8);

        createCarpentryRecipe(exporterForRegionsUnexplored, Pair.of(RuBlocks.COBALT_PLANKS, 1), RuBlocks.COBALT_BUTTON, 4);
        createCarpentryRecipe(exporterForRegionsUnexplored, Pair.of(RuBlocks.COBALT_PLANKS, 2), RuBlocks.COBALT_DOOR, 2);
        createCarpentryRecipe(exporterForRegionsUnexplored, Pair.of(RuBlocks.COBALT_PLANKS, 1), RuBlocks.COBALT_FENCE_GATE, 1);
        createCarpentryRecipe(exporterForRegionsUnexplored, Pair.of(RuBlocks.COBALT_PLANKS, 1), RuBlocks.COBALT_FENCE, 1);
        createCarpentryRecipe(exporterForRegionsUnexplored, Pair.of(RuBlocks.COBALT_PLANKS, 1), RuBlocks.COBALT_PRESSURE_PLATE, 4);
        createCarpentryRecipe(exporterForRegionsUnexplored, Pair.of(RuBlocks.COBALT_PLANKS, 1), RuBlocks.COBALT_SIGN, 3);
        createCarpentryRecipe(exporterForRegionsUnexplored, Pair.of(RuBlocks.COBALT_PLANKS, 1), RuBlocks.COBALT_SLAB, 2);
        createCarpentryRecipe(exporterForRegionsUnexplored, Pair.of(RuBlocks.COBALT_PLANKS, 1), RuBlocks.COBALT_STAIRS, 1);
        createCarpentryRecipe(exporterForRegionsUnexplored, Pair.of(RuBlocks.COBALT_PLANKS, 1), RuBlocks.COBALT_TRAPDOOR, 2);

        createCarpentryRecipe(exporterForRegionsUnexplored, RuTags.COBALT_LOGS_ITEM, 1, RuBlocks.COBALT_PLANKS, 4);
        createCarpentryRecipe(exporterForRegionsUnexplored, RuTags.COBALT_LOGS_ITEM, 1, RuBlocks.COBALT_BUTTON, 16);
        createCarpentryRecipe(exporterForRegionsUnexplored, RuTags.COBALT_LOGS_ITEM, 1, RuBlocks.COBALT_DOOR, 4);
        createCarpentryRecipe(exporterForRegionsUnexplored, RuTags.COBALT_LOGS_ITEM, 1, RuBlocks.COBALT_FENCE_GATE, 4);
        createCarpentryRecipe(exporterForRegionsUnexplored, RuTags.COBALT_LOGS_ITEM, 1, RuBlocks.COBALT_FENCE, 4);
        createCarpentryRecipe(exporterForRegionsUnexplored, RuTags.COBALT_LOGS_ITEM, 1, RuBlocks.COBALT_PRESSURE_PLATE, 16);
        createCarpentryRecipe(exporterForRegionsUnexplored, RuTags.COBALT_LOGS_ITEM, 1, RuBlocks.COBALT_SIGN, 12);
        createCarpentryRecipe(exporterForRegionsUnexplored, RuTags.COBALT_LOGS_ITEM, 1, RuBlocks.COBALT_SLAB, 8);
        createCarpentryRecipe(exporterForRegionsUnexplored, RuTags.COBALT_LOGS_ITEM, 1, RuBlocks.COBALT_STAIRS, 4);
        createCarpentryRecipe(exporterForRegionsUnexplored, RuTags.COBALT_LOGS_ITEM, 1, RuBlocks.COBALT_TRAPDOOR, 8);

        createCarpentryRecipe(exporterForRegionsUnexplored, Pair.of(RuBlocks.CYPRESS_PLANKS, 2), RuItems.CYPRESS_BOAT, 1);
        createCarpentryRecipe(exporterForRegionsUnexplored, Pair.of(RuBlocks.CYPRESS_PLANKS, 1), RuBlocks.CYPRESS_BUTTON, 4);
        createCarpentryRecipe(exporterForRegionsUnexplored, Pair.of(RuBlocks.CYPRESS_PLANKS, 2), RuBlocks.CYPRESS_DOOR, 2);
        createCarpentryRecipe(exporterForRegionsUnexplored, Pair.of(RuBlocks.CYPRESS_PLANKS, 1), RuBlocks.CYPRESS_FENCE_GATE, 1);
        createCarpentryRecipe(exporterForRegionsUnexplored, Pair.of(RuBlocks.CYPRESS_PLANKS, 1), RuBlocks.CYPRESS_FENCE, 1);
        createCarpentryRecipe(exporterForRegionsUnexplored, Pair.of(RuBlocks.CYPRESS_PLANKS, 1), RuBlocks.CYPRESS_PRESSURE_PLATE, 4);
        createCarpentryRecipe(exporterForRegionsUnexplored, Pair.of(RuBlocks.CYPRESS_PLANKS, 1), RuBlocks.CYPRESS_SIGN, 3);
        createCarpentryRecipe(exporterForRegionsUnexplored, Pair.of(RuBlocks.CYPRESS_PLANKS, 1), RuBlocks.CYPRESS_SLAB, 2);
        createCarpentryRecipe(exporterForRegionsUnexplored, Pair.of(RuBlocks.CYPRESS_PLANKS, 1), RuBlocks.CYPRESS_STAIRS, 1);
        createCarpentryRecipe(exporterForRegionsUnexplored, Pair.of(RuBlocks.CYPRESS_PLANKS, 1), RuBlocks.CYPRESS_TRAPDOOR, 2);

        createCarpentryRecipe(exporterForRegionsUnexplored, RuTags.CYPRESS_LOGS_ITEM, 1, RuBlocks.CYPRESS_PLANKS, 4);
        createCarpentryRecipe(exporterForRegionsUnexplored, RuTags.CYPRESS_LOGS_ITEM, 1, RuItems.CYPRESS_BOAT, 1);
        createCarpentryRecipe(exporterForRegionsUnexplored, RuTags.CYPRESS_LOGS_ITEM, 1, RuBlocks.CYPRESS_BUTTON, 16);
        createCarpentryRecipe(exporterForRegionsUnexplored, RuTags.CYPRESS_LOGS_ITEM, 1, RuBlocks.CYPRESS_DOOR, 4);
        createCarpentryRecipe(exporterForRegionsUnexplored, RuTags.CYPRESS_LOGS_ITEM, 1, RuBlocks.CYPRESS_FENCE_GATE, 4);
        createCarpentryRecipe(exporterForRegionsUnexplored, RuTags.CYPRESS_LOGS_ITEM, 1, RuBlocks.CYPRESS_FENCE, 4);
        createCarpentryRecipe(exporterForRegionsUnexplored, RuTags.CYPRESS_LOGS_ITEM, 1, RuBlocks.CYPRESS_PRESSURE_PLATE, 16);
        createCarpentryRecipe(exporterForRegionsUnexplored, RuTags.CYPRESS_LOGS_ITEM, 1, RuBlocks.CYPRESS_SIGN, 12);
        createCarpentryRecipe(exporterForRegionsUnexplored, RuTags.CYPRESS_LOGS_ITEM, 1, RuBlocks.CYPRESS_SLAB, 8);
        createCarpentryRecipe(exporterForRegionsUnexplored, RuTags.CYPRESS_LOGS_ITEM, 1, RuBlocks.CYPRESS_STAIRS, 4);
        createCarpentryRecipe(exporterForRegionsUnexplored, RuTags.CYPRESS_LOGS_ITEM, 1, RuBlocks.CYPRESS_TRAPDOOR, 8);

        createCarpentryRecipe(exporterForRegionsUnexplored, Pair.of(RuBlocks.DEAD_PLANKS, 2), RuItems.DEAD_BOAT, 1);
        createCarpentryRecipe(exporterForRegionsUnexplored, Pair.of(RuBlocks.DEAD_PLANKS, 1), RuBlocks.DEAD_BUTTON, 4);
        createCarpentryRecipe(exporterForRegionsUnexplored, Pair.of(RuBlocks.DEAD_PLANKS, 2), RuBlocks.DEAD_DOOR, 2);
        createCarpentryRecipe(exporterForRegionsUnexplored, Pair.of(RuBlocks.DEAD_PLANKS, 1), RuBlocks.DEAD_FENCE_GATE, 1);
        createCarpentryRecipe(exporterForRegionsUnexplored, Pair.of(RuBlocks.DEAD_PLANKS, 1), RuBlocks.DEAD_FENCE, 1);
        createCarpentryRecipe(exporterForRegionsUnexplored, Pair.of(RuBlocks.DEAD_PLANKS, 1), RuBlocks.DEAD_PRESSURE_PLATE, 4);
        createCarpentryRecipe(exporterForRegionsUnexplored, Pair.of(RuBlocks.DEAD_PLANKS, 1), RuBlocks.DEAD_SIGN, 3);
        createCarpentryRecipe(exporterForRegionsUnexplored, Pair.of(RuBlocks.DEAD_PLANKS, 1), RuBlocks.DEAD_SLAB, 2);
        createCarpentryRecipe(exporterForRegionsUnexplored, Pair.of(RuBlocks.DEAD_PLANKS, 1), RuBlocks.DEAD_STAIRS, 1);
        createCarpentryRecipe(exporterForRegionsUnexplored, Pair.of(RuBlocks.DEAD_PLANKS, 1), RuBlocks.DEAD_TRAPDOOR, 2);

        createCarpentryRecipe(exporterForRegionsUnexplored, RuTags.DEAD_LOGS_ITEM, 1, RuBlocks.DEAD_PLANKS, 4);
        createCarpentryRecipe(exporterForRegionsUnexplored, RuTags.DEAD_LOGS_ITEM, 1, RuItems.DEAD_BOAT, 1);
        createCarpentryRecipe(exporterForRegionsUnexplored, RuTags.DEAD_LOGS_ITEM, 1, RuBlocks.DEAD_BUTTON, 16);
        createCarpentryRecipe(exporterForRegionsUnexplored, RuTags.DEAD_LOGS_ITEM, 1, RuBlocks.DEAD_DOOR, 4);
        createCarpentryRecipe(exporterForRegionsUnexplored, RuTags.DEAD_LOGS_ITEM, 1, RuBlocks.DEAD_FENCE_GATE, 4);
        createCarpentryRecipe(exporterForRegionsUnexplored, RuTags.DEAD_LOGS_ITEM, 1, RuBlocks.DEAD_FENCE, 4);
        createCarpentryRecipe(exporterForRegionsUnexplored, RuTags.DEAD_LOGS_ITEM, 1, RuBlocks.DEAD_PRESSURE_PLATE, 16);
        createCarpentryRecipe(exporterForRegionsUnexplored, RuTags.DEAD_LOGS_ITEM, 1, RuBlocks.DEAD_SIGN, 12);
        createCarpentryRecipe(exporterForRegionsUnexplored, RuTags.DEAD_LOGS_ITEM, 1, RuBlocks.DEAD_SLAB, 8);
        createCarpentryRecipe(exporterForRegionsUnexplored, RuTags.DEAD_LOGS_ITEM, 1, RuBlocks.DEAD_STAIRS, 4);
        createCarpentryRecipe(exporterForRegionsUnexplored, RuTags.DEAD_LOGS_ITEM, 1, RuBlocks.DEAD_TRAPDOOR, 8);

        createCarpentryRecipe(exporterForRegionsUnexplored, Pair.of(RuBlocks.EUCALYPTUS_PLANKS, 2), RuItems.EUCALYPTUS_BOAT, 1);
        createCarpentryRecipe(exporterForRegionsUnexplored, Pair.of(RuBlocks.EUCALYPTUS_PLANKS, 1), RuBlocks.EUCALYPTUS_BUTTON, 4);
        createCarpentryRecipe(exporterForRegionsUnexplored, Pair.of(RuBlocks.EUCALYPTUS_PLANKS, 2), RuBlocks.EUCALYPTUS_DOOR, 2);
        createCarpentryRecipe(exporterForRegionsUnexplored, Pair.of(RuBlocks.EUCALYPTUS_PLANKS, 1), RuBlocks.EUCALYPTUS_FENCE_GATE, 1);
        createCarpentryRecipe(exporterForRegionsUnexplored, Pair.of(RuBlocks.EUCALYPTUS_PLANKS, 1), RuBlocks.EUCALYPTUS_FENCE, 1);
        createCarpentryRecipe(exporterForRegionsUnexplored, Pair.of(RuBlocks.EUCALYPTUS_PLANKS, 1), RuBlocks.EUCALYPTUS_PRESSURE_PLATE, 4);
        createCarpentryRecipe(exporterForRegionsUnexplored, Pair.of(RuBlocks.EUCALYPTUS_PLANKS, 1), RuBlocks.EUCALYPTUS_SIGN, 3);
        createCarpentryRecipe(exporterForRegionsUnexplored, Pair.of(RuBlocks.EUCALYPTUS_PLANKS, 1), RuBlocks.EUCALYPTUS_SLAB, 2);
        createCarpentryRecipe(exporterForRegionsUnexplored, Pair.of(RuBlocks.EUCALYPTUS_PLANKS, 1), RuBlocks.EUCALYPTUS_STAIRS, 1);
        createCarpentryRecipe(exporterForRegionsUnexplored, Pair.of(RuBlocks.EUCALYPTUS_PLANKS, 1), RuBlocks.EUCALYPTUS_TRAPDOOR, 2);

        createCarpentryRecipe(exporterForRegionsUnexplored, RuTags.EUCALYPTUS_LOGS_ITEM, 1, RuBlocks.EUCALYPTUS_PLANKS, 4);
        createCarpentryRecipe(exporterForRegionsUnexplored, RuTags.EUCALYPTUS_LOGS_ITEM, 1, RuItems.EUCALYPTUS_BOAT, 1);
        createCarpentryRecipe(exporterForRegionsUnexplored, RuTags.EUCALYPTUS_LOGS_ITEM, 1, RuBlocks.EUCALYPTUS_BUTTON, 16);
        createCarpentryRecipe(exporterForRegionsUnexplored, RuTags.EUCALYPTUS_LOGS_ITEM, 1, RuBlocks.EUCALYPTUS_DOOR, 4);
        createCarpentryRecipe(exporterForRegionsUnexplored, RuTags.EUCALYPTUS_LOGS_ITEM, 1, RuBlocks.EUCALYPTUS_FENCE_GATE, 4);
        createCarpentryRecipe(exporterForRegionsUnexplored, RuTags.EUCALYPTUS_LOGS_ITEM, 1, RuBlocks.EUCALYPTUS_FENCE, 4);
        createCarpentryRecipe(exporterForRegionsUnexplored, RuTags.EUCALYPTUS_LOGS_ITEM, 1, RuBlocks.EUCALYPTUS_PRESSURE_PLATE, 16);
        createCarpentryRecipe(exporterForRegionsUnexplored, RuTags.EUCALYPTUS_LOGS_ITEM, 1, RuBlocks.EUCALYPTUS_SIGN, 12);
        createCarpentryRecipe(exporterForRegionsUnexplored, RuTags.EUCALYPTUS_LOGS_ITEM, 1, RuBlocks.EUCALYPTUS_SLAB, 8);
        createCarpentryRecipe(exporterForRegionsUnexplored, RuTags.EUCALYPTUS_LOGS_ITEM, 1, RuBlocks.EUCALYPTUS_STAIRS, 4);
        createCarpentryRecipe(exporterForRegionsUnexplored, RuTags.EUCALYPTUS_LOGS_ITEM, 1, RuBlocks.EUCALYPTUS_TRAPDOOR, 8);

        createCarpentryRecipe(exporterForRegionsUnexplored, Pair.of(RuBlocks.GREEN_BIOSHROOM_PLANKS, 1), RuBlocks.GREEN_BIOSHROOM_BUTTON, 4);
        createCarpentryRecipe(exporterForRegionsUnexplored, Pair.of(RuBlocks.GREEN_BIOSHROOM_PLANKS, 2), RuBlocks.GREEN_BIOSHROOM_DOOR, 2);
        createCarpentryRecipe(exporterForRegionsUnexplored, Pair.of(RuBlocks.GREEN_BIOSHROOM_PLANKS, 1), RuBlocks.GREEN_BIOSHROOM_FENCE_GATE, 1);
        createCarpentryRecipe(exporterForRegionsUnexplored, Pair.of(RuBlocks.GREEN_BIOSHROOM_PLANKS, 1), RuBlocks.GREEN_BIOSHROOM_FENCE, 1);
        createCarpentryRecipe(exporterForRegionsUnexplored, Pair.of(RuBlocks.GREEN_BIOSHROOM_PLANKS, 1), RuBlocks.GREEN_BIOSHROOM_PRESSURE_PLATE, 4);
        createCarpentryRecipe(exporterForRegionsUnexplored, Pair.of(RuBlocks.GREEN_BIOSHROOM_PLANKS, 1), RuBlocks.GREEN_BIOSHROOM_SIGN, 3);
        createCarpentryRecipe(exporterForRegionsUnexplored, Pair.of(RuBlocks.GREEN_BIOSHROOM_PLANKS, 1), RuBlocks.GREEN_BIOSHROOM_SLAB, 2);
        createCarpentryRecipe(exporterForRegionsUnexplored, Pair.of(RuBlocks.GREEN_BIOSHROOM_PLANKS, 1), RuBlocks.GREEN_BIOSHROOM_STAIRS, 1);
        createCarpentryRecipe(exporterForRegionsUnexplored, Pair.of(RuBlocks.GREEN_BIOSHROOM_PLANKS, 1), RuBlocks.GREEN_BIOSHROOM_TRAPDOOR, 2);

        createCarpentryRecipe(exporterForRegionsUnexplored, RuTags.GREEN_BIOSHROOM_LOGS_ITEM, 1, RuBlocks.GREEN_BIOSHROOM_PLANKS, 4);
        createCarpentryRecipe(exporterForRegionsUnexplored, RuTags.GREEN_BIOSHROOM_LOGS_ITEM, 1, RuBlocks.GREEN_BIOSHROOM_BUTTON, 16);
        createCarpentryRecipe(exporterForRegionsUnexplored, RuTags.GREEN_BIOSHROOM_LOGS_ITEM, 1, RuBlocks.GREEN_BIOSHROOM_DOOR, 4);
        createCarpentryRecipe(exporterForRegionsUnexplored, RuTags.GREEN_BIOSHROOM_LOGS_ITEM, 1, RuBlocks.GREEN_BIOSHROOM_FENCE_GATE, 4);
        createCarpentryRecipe(exporterForRegionsUnexplored, RuTags.GREEN_BIOSHROOM_LOGS_ITEM, 1, RuBlocks.GREEN_BIOSHROOM_FENCE, 4);
        createCarpentryRecipe(exporterForRegionsUnexplored, RuTags.GREEN_BIOSHROOM_LOGS_ITEM, 1, RuBlocks.GREEN_BIOSHROOM_PRESSURE_PLATE, 16);
        createCarpentryRecipe(exporterForRegionsUnexplored, RuTags.GREEN_BIOSHROOM_LOGS_ITEM, 1, RuBlocks.GREEN_BIOSHROOM_SIGN, 12);
        createCarpentryRecipe(exporterForRegionsUnexplored, RuTags.GREEN_BIOSHROOM_LOGS_ITEM, 1, RuBlocks.GREEN_BIOSHROOM_SLAB, 8);
        createCarpentryRecipe(exporterForRegionsUnexplored, RuTags.GREEN_BIOSHROOM_LOGS_ITEM, 1, RuBlocks.GREEN_BIOSHROOM_STAIRS, 4);
        createCarpentryRecipe(exporterForRegionsUnexplored, RuTags.GREEN_BIOSHROOM_LOGS_ITEM, 1, RuBlocks.GREEN_BIOSHROOM_TRAPDOOR, 8);

        createCarpentryRecipe(exporterForRegionsUnexplored, Pair.of(RuBlocks.JOSHUA_PLANKS, 2), RuItems.JOSHUA_BOAT, 1);
        createCarpentryRecipe(exporterForRegionsUnexplored, Pair.of(RuBlocks.JOSHUA_PLANKS, 1), RuBlocks.JOSHUA_BUTTON, 4);
        createCarpentryRecipe(exporterForRegionsUnexplored, Pair.of(RuBlocks.JOSHUA_PLANKS, 2), RuBlocks.JOSHUA_DOOR, 2);
        createCarpentryRecipe(exporterForRegionsUnexplored, Pair.of(RuBlocks.JOSHUA_PLANKS, 1), RuBlocks.JOSHUA_FENCE_GATE, 1);
        createCarpentryRecipe(exporterForRegionsUnexplored, Pair.of(RuBlocks.JOSHUA_PLANKS, 1), RuBlocks.JOSHUA_FENCE, 1);
        createCarpentryRecipe(exporterForRegionsUnexplored, Pair.of(RuBlocks.JOSHUA_PLANKS, 1), RuBlocks.JOSHUA_PRESSURE_PLATE, 4);
        createCarpentryRecipe(exporterForRegionsUnexplored, Pair.of(RuBlocks.JOSHUA_PLANKS, 1), RuBlocks.JOSHUA_SIGN, 3);
        createCarpentryRecipe(exporterForRegionsUnexplored, Pair.of(RuBlocks.JOSHUA_PLANKS, 1), RuBlocks.JOSHUA_SLAB, 2);
        createCarpentryRecipe(exporterForRegionsUnexplored, Pair.of(RuBlocks.JOSHUA_PLANKS, 1), RuBlocks.JOSHUA_STAIRS, 1);
        createCarpentryRecipe(exporterForRegionsUnexplored, Pair.of(RuBlocks.JOSHUA_PLANKS, 1), RuBlocks.JOSHUA_TRAPDOOR, 2);

        createCarpentryRecipe(exporterForRegionsUnexplored, RuTags.JOSHUA_LOGS_ITEM, 1, RuBlocks.JOSHUA_PLANKS, 4);
        createCarpentryRecipe(exporterForRegionsUnexplored, RuTags.JOSHUA_LOGS_ITEM, 1, RuItems.JOSHUA_BOAT, 1);
        createCarpentryRecipe(exporterForRegionsUnexplored, RuTags.JOSHUA_LOGS_ITEM, 1, RuBlocks.JOSHUA_BUTTON, 16);
        createCarpentryRecipe(exporterForRegionsUnexplored, RuTags.JOSHUA_LOGS_ITEM, 1, RuBlocks.JOSHUA_DOOR, 4);
        createCarpentryRecipe(exporterForRegionsUnexplored, RuTags.JOSHUA_LOGS_ITEM, 1, RuBlocks.JOSHUA_FENCE_GATE, 4);
        createCarpentryRecipe(exporterForRegionsUnexplored, RuTags.JOSHUA_LOGS_ITEM, 1, RuBlocks.JOSHUA_FENCE, 4);
        createCarpentryRecipe(exporterForRegionsUnexplored, RuTags.JOSHUA_LOGS_ITEM, 1, RuBlocks.JOSHUA_PRESSURE_PLATE, 16);
        createCarpentryRecipe(exporterForRegionsUnexplored, RuTags.JOSHUA_LOGS_ITEM, 1, RuBlocks.JOSHUA_SIGN, 12);
        createCarpentryRecipe(exporterForRegionsUnexplored, RuTags.JOSHUA_LOGS_ITEM, 1, RuBlocks.JOSHUA_SLAB, 8);
        createCarpentryRecipe(exporterForRegionsUnexplored, RuTags.JOSHUA_LOGS_ITEM, 1, RuBlocks.JOSHUA_STAIRS, 4);
        createCarpentryRecipe(exporterForRegionsUnexplored, RuTags.JOSHUA_LOGS_ITEM, 1, RuBlocks.JOSHUA_TRAPDOOR, 8);

        createCarpentryRecipe(exporterForRegionsUnexplored, Pair.of(RuBlocks.KAPOK_PLANKS, 2), RuItems.KAPOK_BOAT, 1);
        createCarpentryRecipe(exporterForRegionsUnexplored, Pair.of(RuBlocks.KAPOK_PLANKS, 1), RuBlocks.KAPOK_BUTTON, 4);
        createCarpentryRecipe(exporterForRegionsUnexplored, Pair.of(RuBlocks.KAPOK_PLANKS, 2), RuBlocks.KAPOK_DOOR, 2);
        createCarpentryRecipe(exporterForRegionsUnexplored, Pair.of(RuBlocks.KAPOK_PLANKS, 1), RuBlocks.KAPOK_FENCE_GATE, 1);
        createCarpentryRecipe(exporterForRegionsUnexplored, Pair.of(RuBlocks.KAPOK_PLANKS, 1), RuBlocks.KAPOK_FENCE, 1);
        createCarpentryRecipe(exporterForRegionsUnexplored, Pair.of(RuBlocks.KAPOK_PLANKS, 1), RuBlocks.KAPOK_PRESSURE_PLATE, 4);
        createCarpentryRecipe(exporterForRegionsUnexplored, Pair.of(RuBlocks.KAPOK_PLANKS, 1), RuBlocks.KAPOK_SIGN, 3);
        createCarpentryRecipe(exporterForRegionsUnexplored, Pair.of(RuBlocks.KAPOK_PLANKS, 1), RuBlocks.KAPOK_SLAB, 2);
        createCarpentryRecipe(exporterForRegionsUnexplored, Pair.of(RuBlocks.KAPOK_PLANKS, 1), RuBlocks.KAPOK_STAIRS, 1);
        createCarpentryRecipe(exporterForRegionsUnexplored, Pair.of(RuBlocks.KAPOK_PLANKS, 1), RuBlocks.KAPOK_TRAPDOOR, 2);

        createCarpentryRecipe(exporterForRegionsUnexplored, RuTags.KAPOK_LOGS_ITEM, 1, RuBlocks.KAPOK_PLANKS, 4);
        createCarpentryRecipe(exporterForRegionsUnexplored, RuTags.KAPOK_LOGS_ITEM, 1, RuItems.KAPOK_BOAT, 1);
        createCarpentryRecipe(exporterForRegionsUnexplored, RuTags.KAPOK_LOGS_ITEM, 1, RuBlocks.KAPOK_BUTTON, 16);
        createCarpentryRecipe(exporterForRegionsUnexplored, RuTags.KAPOK_LOGS_ITEM, 1, RuBlocks.KAPOK_DOOR, 4);
        createCarpentryRecipe(exporterForRegionsUnexplored, RuTags.KAPOK_LOGS_ITEM, 1, RuBlocks.KAPOK_FENCE_GATE, 4);
        createCarpentryRecipe(exporterForRegionsUnexplored, RuTags.KAPOK_LOGS_ITEM, 1, RuBlocks.KAPOK_FENCE, 4);
        createCarpentryRecipe(exporterForRegionsUnexplored, RuTags.KAPOK_LOGS_ITEM, 1, RuBlocks.KAPOK_PRESSURE_PLATE, 16);
        createCarpentryRecipe(exporterForRegionsUnexplored, RuTags.KAPOK_LOGS_ITEM, 1, RuBlocks.KAPOK_SIGN, 12);
        createCarpentryRecipe(exporterForRegionsUnexplored, RuTags.KAPOK_LOGS_ITEM, 1, RuBlocks.KAPOK_SLAB, 8);
        createCarpentryRecipe(exporterForRegionsUnexplored, RuTags.KAPOK_LOGS_ITEM, 1, RuBlocks.KAPOK_STAIRS, 4);
        createCarpentryRecipe(exporterForRegionsUnexplored, RuTags.KAPOK_LOGS_ITEM, 1, RuBlocks.KAPOK_TRAPDOOR, 8);

        createCarpentryRecipe(exporterForRegionsUnexplored, Pair.of(RuBlocks.LARCH_PLANKS, 2), RuItems.LARCH_BOAT, 1);
        createCarpentryRecipe(exporterForRegionsUnexplored, Pair.of(RuBlocks.LARCH_PLANKS, 1), RuBlocks.LARCH_BUTTON, 4);
        createCarpentryRecipe(exporterForRegionsUnexplored, Pair.of(RuBlocks.LARCH_PLANKS, 2), RuBlocks.LARCH_DOOR, 2);
        createCarpentryRecipe(exporterForRegionsUnexplored, Pair.of(RuBlocks.LARCH_PLANKS, 1), RuBlocks.LARCH_FENCE_GATE, 1);
        createCarpentryRecipe(exporterForRegionsUnexplored, Pair.of(RuBlocks.LARCH_PLANKS, 1), RuBlocks.LARCH_FENCE, 1);
        createCarpentryRecipe(exporterForRegionsUnexplored, Pair.of(RuBlocks.LARCH_PLANKS, 1), RuBlocks.LARCH_PRESSURE_PLATE, 4);
        createCarpentryRecipe(exporterForRegionsUnexplored, Pair.of(RuBlocks.LARCH_PLANKS, 1), RuBlocks.LARCH_SIGN, 3);
        createCarpentryRecipe(exporterForRegionsUnexplored, Pair.of(RuBlocks.LARCH_PLANKS, 1), RuBlocks.LARCH_SLAB, 2);
        createCarpentryRecipe(exporterForRegionsUnexplored, Pair.of(RuBlocks.LARCH_PLANKS, 1), RuBlocks.LARCH_STAIRS, 1);
        createCarpentryRecipe(exporterForRegionsUnexplored, Pair.of(RuBlocks.LARCH_PLANKS, 1), RuBlocks.LARCH_TRAPDOOR, 2);

        createCarpentryRecipe(exporterForRegionsUnexplored, RuTags.LARCH_LOGS_ITEM, 1, RuBlocks.LARCH_PLANKS, 4);
        createCarpentryRecipe(exporterForRegionsUnexplored, RuTags.LARCH_LOGS_ITEM, 1, RuItems.LARCH_BOAT, 1);
        createCarpentryRecipe(exporterForRegionsUnexplored, RuTags.LARCH_LOGS_ITEM, 1, RuBlocks.LARCH_BUTTON, 16);
        createCarpentryRecipe(exporterForRegionsUnexplored, RuTags.LARCH_LOGS_ITEM, 1, RuBlocks.LARCH_DOOR, 4);
        createCarpentryRecipe(exporterForRegionsUnexplored, RuTags.LARCH_LOGS_ITEM, 1, RuBlocks.LARCH_FENCE_GATE, 4);
        createCarpentryRecipe(exporterForRegionsUnexplored, RuTags.LARCH_LOGS_ITEM, 1, RuBlocks.LARCH_FENCE, 4);
        createCarpentryRecipe(exporterForRegionsUnexplored, RuTags.LARCH_LOGS_ITEM, 1, RuBlocks.LARCH_PRESSURE_PLATE, 16);
        createCarpentryRecipe(exporterForRegionsUnexplored, RuTags.LARCH_LOGS_ITEM, 1, RuBlocks.LARCH_SIGN, 12);
        createCarpentryRecipe(exporterForRegionsUnexplored, RuTags.LARCH_LOGS_ITEM, 1, RuBlocks.LARCH_SLAB, 8);
        createCarpentryRecipe(exporterForRegionsUnexplored, RuTags.LARCH_LOGS_ITEM, 1, RuBlocks.LARCH_STAIRS, 4);
        createCarpentryRecipe(exporterForRegionsUnexplored, RuTags.LARCH_LOGS_ITEM, 1, RuBlocks.LARCH_TRAPDOOR, 8);

        createCarpentryRecipe(exporterForRegionsUnexplored, Pair.of(RuBlocks.MAGNOLIA_PLANKS, 2), RuItems.MAGNOLIA_BOAT, 1);
        createCarpentryRecipe(exporterForRegionsUnexplored, Pair.of(RuBlocks.MAGNOLIA_PLANKS, 1), RuBlocks.MAGNOLIA_BUTTON, 4);
        createCarpentryRecipe(exporterForRegionsUnexplored, Pair.of(RuBlocks.MAGNOLIA_PLANKS, 2), RuBlocks.MAGNOLIA_DOOR, 2);
        createCarpentryRecipe(exporterForRegionsUnexplored, Pair.of(RuBlocks.MAGNOLIA_PLANKS, 1), RuBlocks.MAGNOLIA_FENCE_GATE, 1);
        createCarpentryRecipe(exporterForRegionsUnexplored, Pair.of(RuBlocks.MAGNOLIA_PLANKS, 1), RuBlocks.MAGNOLIA_FENCE, 1);
        createCarpentryRecipe(exporterForRegionsUnexplored, Pair.of(RuBlocks.MAGNOLIA_PLANKS, 1), RuBlocks.MAGNOLIA_PRESSURE_PLATE, 4);
        createCarpentryRecipe(exporterForRegionsUnexplored, Pair.of(RuBlocks.MAGNOLIA_PLANKS, 1), RuBlocks.MAGNOLIA_SIGN, 3);
        createCarpentryRecipe(exporterForRegionsUnexplored, Pair.of(RuBlocks.MAGNOLIA_PLANKS, 1), RuBlocks.MAGNOLIA_SLAB, 2);
        createCarpentryRecipe(exporterForRegionsUnexplored, Pair.of(RuBlocks.MAGNOLIA_PLANKS, 1), RuBlocks.MAGNOLIA_STAIRS, 1);
        createCarpentryRecipe(exporterForRegionsUnexplored, Pair.of(RuBlocks.MAGNOLIA_PLANKS, 1), RuBlocks.MAGNOLIA_TRAPDOOR, 2);

        createCarpentryRecipe(exporterForRegionsUnexplored, RuTags.MAGNOLIA_LOGS_ITEM, 1, RuBlocks.MAGNOLIA_PLANKS, 4);
        createCarpentryRecipe(exporterForRegionsUnexplored, RuTags.MAGNOLIA_LOGS_ITEM, 1, RuItems.MAGNOLIA_BOAT, 1);
        createCarpentryRecipe(exporterForRegionsUnexplored, RuTags.MAGNOLIA_LOGS_ITEM, 1, RuBlocks.MAGNOLIA_BUTTON, 16);
        createCarpentryRecipe(exporterForRegionsUnexplored, RuTags.MAGNOLIA_LOGS_ITEM, 1, RuBlocks.MAGNOLIA_DOOR, 4);
        createCarpentryRecipe(exporterForRegionsUnexplored, RuTags.MAGNOLIA_LOGS_ITEM, 1, RuBlocks.MAGNOLIA_FENCE_GATE, 4);
        createCarpentryRecipe(exporterForRegionsUnexplored, RuTags.MAGNOLIA_LOGS_ITEM, 1, RuBlocks.MAGNOLIA_FENCE, 4);
        createCarpentryRecipe(exporterForRegionsUnexplored, RuTags.MAGNOLIA_LOGS_ITEM, 1, RuBlocks.MAGNOLIA_PRESSURE_PLATE, 16);
        createCarpentryRecipe(exporterForRegionsUnexplored, RuTags.MAGNOLIA_LOGS_ITEM, 1, RuBlocks.MAGNOLIA_SIGN, 12);
        createCarpentryRecipe(exporterForRegionsUnexplored, RuTags.MAGNOLIA_LOGS_ITEM, 1, RuBlocks.MAGNOLIA_SLAB, 8);
        createCarpentryRecipe(exporterForRegionsUnexplored, RuTags.MAGNOLIA_LOGS_ITEM, 1, RuBlocks.MAGNOLIA_STAIRS, 4);
        createCarpentryRecipe(exporterForRegionsUnexplored, RuTags.MAGNOLIA_LOGS_ITEM, 1, RuBlocks.MAGNOLIA_TRAPDOOR, 8);

        createCarpentryRecipe(exporterForRegionsUnexplored, Pair.of(RuBlocks.MAPLE_PLANKS, 2), RuItems.MAPLE_BOAT, 1);
        createCarpentryRecipe(exporterForRegionsUnexplored, Pair.of(RuBlocks.MAPLE_PLANKS, 1), RuBlocks.MAPLE_BUTTON, 4);
        createCarpentryRecipe(exporterForRegionsUnexplored, Pair.of(RuBlocks.MAPLE_PLANKS, 2), RuBlocks.MAPLE_DOOR, 2);
        createCarpentryRecipe(exporterForRegionsUnexplored, Pair.of(RuBlocks.MAPLE_PLANKS, 1), RuBlocks.MAPLE_FENCE_GATE, 1);
        createCarpentryRecipe(exporterForRegionsUnexplored, Pair.of(RuBlocks.MAPLE_PLANKS, 1), RuBlocks.MAPLE_FENCE, 1);
        createCarpentryRecipe(exporterForRegionsUnexplored, Pair.of(RuBlocks.MAPLE_PLANKS, 1), RuBlocks.MAPLE_PRESSURE_PLATE, 4);
        createCarpentryRecipe(exporterForRegionsUnexplored, Pair.of(RuBlocks.MAPLE_PLANKS, 1), RuBlocks.MAPLE_SIGN, 3);
        createCarpentryRecipe(exporterForRegionsUnexplored, Pair.of(RuBlocks.MAPLE_PLANKS, 1), RuBlocks.MAPLE_SLAB, 2);
        createCarpentryRecipe(exporterForRegionsUnexplored, Pair.of(RuBlocks.MAPLE_PLANKS, 1), RuBlocks.MAPLE_STAIRS, 1);
        createCarpentryRecipe(exporterForRegionsUnexplored, Pair.of(RuBlocks.MAPLE_PLANKS, 1), RuBlocks.MAPLE_TRAPDOOR, 2);

        createCarpentryRecipe(exporterForRegionsUnexplored, RuTags.MAPLE_LOGS_ITEM, 1, RuBlocks.MAPLE_PLANKS, 4);
        createCarpentryRecipe(exporterForRegionsUnexplored, RuTags.MAPLE_LOGS_ITEM, 1, RuItems.MAPLE_BOAT, 1);
        createCarpentryRecipe(exporterForRegionsUnexplored, RuTags.MAPLE_LOGS_ITEM, 1, RuBlocks.MAPLE_BUTTON, 16);
        createCarpentryRecipe(exporterForRegionsUnexplored, RuTags.MAPLE_LOGS_ITEM, 1, RuBlocks.MAPLE_DOOR, 4);
        createCarpentryRecipe(exporterForRegionsUnexplored, RuTags.MAPLE_LOGS_ITEM, 1, RuBlocks.MAPLE_FENCE_GATE, 4);
        createCarpentryRecipe(exporterForRegionsUnexplored, RuTags.MAPLE_LOGS_ITEM, 1, RuBlocks.MAPLE_FENCE, 4);
        createCarpentryRecipe(exporterForRegionsUnexplored, RuTags.MAPLE_LOGS_ITEM, 1, RuBlocks.MAPLE_PRESSURE_PLATE, 16);
        createCarpentryRecipe(exporterForRegionsUnexplored, RuTags.MAPLE_LOGS_ITEM, 1, RuBlocks.MAPLE_SIGN, 12);
        createCarpentryRecipe(exporterForRegionsUnexplored, RuTags.MAPLE_LOGS_ITEM, 1, RuBlocks.MAPLE_SLAB, 8);
        createCarpentryRecipe(exporterForRegionsUnexplored, RuTags.MAPLE_LOGS_ITEM, 1, RuBlocks.MAPLE_STAIRS, 4);
        createCarpentryRecipe(exporterForRegionsUnexplored, RuTags.MAPLE_LOGS_ITEM, 1, RuBlocks.MAPLE_TRAPDOOR, 8);

        createCarpentryRecipe(exporterForRegionsUnexplored, Pair.of(RuBlocks.MAUVE_PLANKS, 2), RuItems.MAUVE_BOAT, 1);
        createCarpentryRecipe(exporterForRegionsUnexplored, Pair.of(RuBlocks.MAUVE_PLANKS, 1), RuBlocks.MAUVE_BUTTON, 4);
        createCarpentryRecipe(exporterForRegionsUnexplored, Pair.of(RuBlocks.MAUVE_PLANKS, 2), RuBlocks.MAUVE_DOOR, 2);
        createCarpentryRecipe(exporterForRegionsUnexplored, Pair.of(RuBlocks.MAUVE_PLANKS, 1), RuBlocks.MAUVE_FENCE_GATE, 1);
        createCarpentryRecipe(exporterForRegionsUnexplored, Pair.of(RuBlocks.MAUVE_PLANKS, 1), RuBlocks.MAUVE_FENCE, 1);
        createCarpentryRecipe(exporterForRegionsUnexplored, Pair.of(RuBlocks.MAUVE_PLANKS, 1), RuBlocks.MAUVE_PRESSURE_PLATE, 4);
        createCarpentryRecipe(exporterForRegionsUnexplored, Pair.of(RuBlocks.MAUVE_PLANKS, 1), RuBlocks.MAUVE_SIGN, 3);
        createCarpentryRecipe(exporterForRegionsUnexplored, Pair.of(RuBlocks.MAUVE_PLANKS, 1), RuBlocks.MAUVE_SLAB, 2);
        createCarpentryRecipe(exporterForRegionsUnexplored, Pair.of(RuBlocks.MAUVE_PLANKS, 1), RuBlocks.MAUVE_STAIRS, 1);
        createCarpentryRecipe(exporterForRegionsUnexplored, Pair.of(RuBlocks.MAUVE_PLANKS, 1), RuBlocks.MAUVE_TRAPDOOR, 2);

        createCarpentryRecipe(exporterForRegionsUnexplored, RuTags.MAUVE_LOGS_ITEM, 1, RuBlocks.MAUVE_PLANKS, 4);
        createCarpentryRecipe(exporterForRegionsUnexplored, RuTags.MAUVE_LOGS_ITEM, 1, RuItems.MAUVE_BOAT, 1);
        createCarpentryRecipe(exporterForRegionsUnexplored, RuTags.MAUVE_LOGS_ITEM, 1, RuBlocks.MAUVE_BUTTON, 16);
        createCarpentryRecipe(exporterForRegionsUnexplored, RuTags.MAUVE_LOGS_ITEM, 1, RuBlocks.MAUVE_DOOR, 4);
        createCarpentryRecipe(exporterForRegionsUnexplored, RuTags.MAUVE_LOGS_ITEM, 1, RuBlocks.MAUVE_FENCE_GATE, 4);
        createCarpentryRecipe(exporterForRegionsUnexplored, RuTags.MAUVE_LOGS_ITEM, 1, RuBlocks.MAUVE_FENCE, 4);
        createCarpentryRecipe(exporterForRegionsUnexplored, RuTags.MAUVE_LOGS_ITEM, 1, RuBlocks.MAUVE_PRESSURE_PLATE, 16);
        createCarpentryRecipe(exporterForRegionsUnexplored, RuTags.MAUVE_LOGS_ITEM, 1, RuBlocks.MAUVE_SIGN, 12);
        createCarpentryRecipe(exporterForRegionsUnexplored, RuTags.MAUVE_LOGS_ITEM, 1, RuBlocks.MAUVE_SLAB, 8);
        createCarpentryRecipe(exporterForRegionsUnexplored, RuTags.MAUVE_LOGS_ITEM, 1, RuBlocks.MAUVE_STAIRS, 4);
        createCarpentryRecipe(exporterForRegionsUnexplored, RuTags.MAUVE_LOGS_ITEM, 1, RuBlocks.MAUVE_TRAPDOOR, 8);

        createCarpentryRecipe(exporterForRegionsUnexplored, Pair.of(RuBlocks.PALM_PLANKS, 2), RuItems.PALM_BOAT, 1);
        createCarpentryRecipe(exporterForRegionsUnexplored, Pair.of(RuBlocks.PALM_PLANKS, 1), RuBlocks.PALM_BUTTON, 4);
        createCarpentryRecipe(exporterForRegionsUnexplored, Pair.of(RuBlocks.PALM_PLANKS, 2), RuBlocks.PALM_DOOR, 2);
        createCarpentryRecipe(exporterForRegionsUnexplored, Pair.of(RuBlocks.PALM_PLANKS, 1), RuBlocks.PALM_FENCE_GATE, 1);
        createCarpentryRecipe(exporterForRegionsUnexplored, Pair.of(RuBlocks.PALM_PLANKS, 1), RuBlocks.PALM_FENCE, 1);
        createCarpentryRecipe(exporterForRegionsUnexplored, Pair.of(RuBlocks.PALM_PLANKS, 1), RuBlocks.PALM_PRESSURE_PLATE, 4);
        createCarpentryRecipe(exporterForRegionsUnexplored, Pair.of(RuBlocks.PALM_PLANKS, 1), RuBlocks.PALM_SIGN, 3);
        createCarpentryRecipe(exporterForRegionsUnexplored, Pair.of(RuBlocks.PALM_PLANKS, 1), RuBlocks.PALM_SLAB, 2);
        createCarpentryRecipe(exporterForRegionsUnexplored, Pair.of(RuBlocks.PALM_PLANKS, 1), RuBlocks.PALM_STAIRS, 1);
        createCarpentryRecipe(exporterForRegionsUnexplored, Pair.of(RuBlocks.PALM_PLANKS, 1), RuBlocks.PALM_TRAPDOOR, 2);

        createCarpentryRecipe(exporterForRegionsUnexplored, RuTags.PALM_LOGS_ITEM, 1, RuBlocks.PALM_PLANKS, 4);
        createCarpentryRecipe(exporterForRegionsUnexplored, RuTags.PALM_LOGS_ITEM, 1, RuItems.PALM_BOAT, 1);
        createCarpentryRecipe(exporterForRegionsUnexplored, RuTags.PALM_LOGS_ITEM, 1, RuBlocks.PALM_BUTTON, 16);
        createCarpentryRecipe(exporterForRegionsUnexplored, RuTags.PALM_LOGS_ITEM, 1, RuBlocks.PALM_DOOR, 4);
        createCarpentryRecipe(exporterForRegionsUnexplored, RuTags.PALM_LOGS_ITEM, 1, RuBlocks.PALM_FENCE_GATE, 4);
        createCarpentryRecipe(exporterForRegionsUnexplored, RuTags.PALM_LOGS_ITEM, 1, RuBlocks.PALM_FENCE, 4);
        createCarpentryRecipe(exporterForRegionsUnexplored, RuTags.PALM_LOGS_ITEM, 1, RuBlocks.PALM_PRESSURE_PLATE, 16);
        createCarpentryRecipe(exporterForRegionsUnexplored, RuTags.PALM_LOGS_ITEM, 1, RuBlocks.PALM_SIGN, 12);
        createCarpentryRecipe(exporterForRegionsUnexplored, RuTags.PALM_LOGS_ITEM, 1, RuBlocks.PALM_SLAB, 8);
        createCarpentryRecipe(exporterForRegionsUnexplored, RuTags.PALM_LOGS_ITEM, 1, RuBlocks.PALM_STAIRS, 4);
        createCarpentryRecipe(exporterForRegionsUnexplored, RuTags.PALM_LOGS_ITEM, 1, RuBlocks.PALM_TRAPDOOR, 8);

        createCarpentryRecipe(exporterForRegionsUnexplored, Pair.of(RuBlocks.PINE_PLANKS, 2), RuItems.PINE_BOAT, 1);
        createCarpentryRecipe(exporterForRegionsUnexplored, Pair.of(RuBlocks.PINE_PLANKS, 1), RuBlocks.PINE_BUTTON, 4);
        createCarpentryRecipe(exporterForRegionsUnexplored, Pair.of(RuBlocks.PINE_PLANKS, 2), RuBlocks.PINE_DOOR, 2);
        createCarpentryRecipe(exporterForRegionsUnexplored, Pair.of(RuBlocks.PINE_PLANKS, 1), RuBlocks.PINE_FENCE_GATE, 1);
        createCarpentryRecipe(exporterForRegionsUnexplored, Pair.of(RuBlocks.PINE_PLANKS, 1), RuBlocks.PINE_FENCE, 1);
        createCarpentryRecipe(exporterForRegionsUnexplored, Pair.of(RuBlocks.PINE_PLANKS, 1), RuBlocks.PINE_PRESSURE_PLATE, 4);
        createCarpentryRecipe(exporterForRegionsUnexplored, Pair.of(RuBlocks.PINE_PLANKS, 1), RuBlocks.PINE_SIGN, 3);
        createCarpentryRecipe(exporterForRegionsUnexplored, Pair.of(RuBlocks.PINE_PLANKS, 1), RuBlocks.PINE_SLAB, 2);
        createCarpentryRecipe(exporterForRegionsUnexplored, Pair.of(RuBlocks.PINE_PLANKS, 1), RuBlocks.PINE_STAIRS, 1);
        createCarpentryRecipe(exporterForRegionsUnexplored, Pair.of(RuBlocks.PINE_PLANKS, 1), RuBlocks.PINE_TRAPDOOR, 2);

        createCarpentryRecipe(exporterForRegionsUnexplored, RuTags.PINE_LOGS_ITEM, 1, RuBlocks.PINE_PLANKS, 4);
        createCarpentryRecipe(exporterForRegionsUnexplored, RuTags.PINE_LOGS_ITEM, 1, RuItems.PINE_BOAT, 1);
        createCarpentryRecipe(exporterForRegionsUnexplored, RuTags.PINE_LOGS_ITEM, 1, RuBlocks.PINE_BUTTON, 16);
        createCarpentryRecipe(exporterForRegionsUnexplored, RuTags.PINE_LOGS_ITEM, 1, RuBlocks.PINE_DOOR, 4);
        createCarpentryRecipe(exporterForRegionsUnexplored, RuTags.PINE_LOGS_ITEM, 1, RuBlocks.PINE_FENCE_GATE, 4);
        createCarpentryRecipe(exporterForRegionsUnexplored, RuTags.PINE_LOGS_ITEM, 1, RuBlocks.PINE_FENCE, 4);
        createCarpentryRecipe(exporterForRegionsUnexplored, RuTags.PINE_LOGS_ITEM, 1, RuBlocks.PINE_PRESSURE_PLATE, 16);
        createCarpentryRecipe(exporterForRegionsUnexplored, RuTags.PINE_LOGS_ITEM, 1, RuBlocks.PINE_SIGN, 12);
        createCarpentryRecipe(exporterForRegionsUnexplored, RuTags.PINE_LOGS_ITEM, 1, RuBlocks.PINE_SLAB, 8);
        createCarpentryRecipe(exporterForRegionsUnexplored, RuTags.PINE_LOGS_ITEM, 1, RuBlocks.PINE_STAIRS, 4);
        createCarpentryRecipe(exporterForRegionsUnexplored, RuTags.PINE_LOGS_ITEM, 1, RuBlocks.PINE_TRAPDOOR, 8);

        createCarpentryRecipe(exporterForRegionsUnexplored, Pair.of(RuBlocks.PINK_BIOSHROOM_PLANKS, 1), RuBlocks.PINK_BIOSHROOM_BUTTON, 4);
        createCarpentryRecipe(exporterForRegionsUnexplored, Pair.of(RuBlocks.PINK_BIOSHROOM_PLANKS, 2), RuBlocks.PINK_BIOSHROOM_DOOR, 2);
        createCarpentryRecipe(exporterForRegionsUnexplored, Pair.of(RuBlocks.PINK_BIOSHROOM_PLANKS, 1), RuBlocks.PINK_BIOSHROOM_FENCE_GATE, 1);
        createCarpentryRecipe(exporterForRegionsUnexplored, Pair.of(RuBlocks.PINK_BIOSHROOM_PLANKS, 1), RuBlocks.PINK_BIOSHROOM_FENCE, 1);
        createCarpentryRecipe(exporterForRegionsUnexplored, Pair.of(RuBlocks.PINK_BIOSHROOM_PLANKS, 1), RuBlocks.PINK_BIOSHROOM_PRESSURE_PLATE, 4);
        createCarpentryRecipe(exporterForRegionsUnexplored, Pair.of(RuBlocks.PINK_BIOSHROOM_PLANKS, 1), RuBlocks.PINK_BIOSHROOM_SIGN, 3);
        createCarpentryRecipe(exporterForRegionsUnexplored, Pair.of(RuBlocks.PINK_BIOSHROOM_PLANKS, 1), RuBlocks.PINK_BIOSHROOM_SLAB, 2);
        createCarpentryRecipe(exporterForRegionsUnexplored, Pair.of(RuBlocks.PINK_BIOSHROOM_PLANKS, 1), RuBlocks.PINK_BIOSHROOM_STAIRS, 1);
        createCarpentryRecipe(exporterForRegionsUnexplored, Pair.of(RuBlocks.PINK_BIOSHROOM_PLANKS, 1), RuBlocks.PINK_BIOSHROOM_TRAPDOOR, 2);

        createCarpentryRecipe(exporterForRegionsUnexplored, RuTags.PINK_BIOSHROOM_LOGS_ITEM, 1, RuBlocks.PINK_BIOSHROOM_PLANKS, 4);
        createCarpentryRecipe(exporterForRegionsUnexplored, RuTags.PINK_BIOSHROOM_LOGS_ITEM, 1, RuBlocks.PINK_BIOSHROOM_BUTTON, 16);
        createCarpentryRecipe(exporterForRegionsUnexplored, RuTags.PINK_BIOSHROOM_LOGS_ITEM, 1, RuBlocks.PINK_BIOSHROOM_DOOR, 4);
        createCarpentryRecipe(exporterForRegionsUnexplored, RuTags.PINK_BIOSHROOM_LOGS_ITEM, 1, RuBlocks.PINK_BIOSHROOM_FENCE_GATE, 4);
        createCarpentryRecipe(exporterForRegionsUnexplored, RuTags.PINK_BIOSHROOM_LOGS_ITEM, 1, RuBlocks.PINK_BIOSHROOM_FENCE, 4);
        createCarpentryRecipe(exporterForRegionsUnexplored, RuTags.PINK_BIOSHROOM_LOGS_ITEM, 1, RuBlocks.PINK_BIOSHROOM_PRESSURE_PLATE, 16);
        createCarpentryRecipe(exporterForRegionsUnexplored, RuTags.PINK_BIOSHROOM_LOGS_ITEM, 1, RuBlocks.PINK_BIOSHROOM_SIGN, 12);
        createCarpentryRecipe(exporterForRegionsUnexplored, RuTags.PINK_BIOSHROOM_LOGS_ITEM, 1, RuBlocks.PINK_BIOSHROOM_SLAB, 8);
        createCarpentryRecipe(exporterForRegionsUnexplored, RuTags.PINK_BIOSHROOM_LOGS_ITEM, 1, RuBlocks.PINK_BIOSHROOM_STAIRS, 4);
        createCarpentryRecipe(exporterForRegionsUnexplored, RuTags.PINK_BIOSHROOM_LOGS_ITEM, 1, RuBlocks.PINK_BIOSHROOM_TRAPDOOR, 8);

        createCarpentryRecipe(exporterForRegionsUnexplored, Pair.of(RuBlocks.REDWOOD_PLANKS, 2), RuItems.REDWOOD_BOAT, 1);
        createCarpentryRecipe(exporterForRegionsUnexplored, Pair.of(RuBlocks.REDWOOD_PLANKS, 1), RuBlocks.REDWOOD_BUTTON, 4);
        createCarpentryRecipe(exporterForRegionsUnexplored, Pair.of(RuBlocks.REDWOOD_PLANKS, 2), RuBlocks.REDWOOD_DOOR, 2);
        createCarpentryRecipe(exporterForRegionsUnexplored, Pair.of(RuBlocks.REDWOOD_PLANKS, 1), RuBlocks.REDWOOD_FENCE_GATE, 1);
        createCarpentryRecipe(exporterForRegionsUnexplored, Pair.of(RuBlocks.REDWOOD_PLANKS, 1), RuBlocks.REDWOOD_FENCE, 1);
        createCarpentryRecipe(exporterForRegionsUnexplored, Pair.of(RuBlocks.REDWOOD_PLANKS, 1), RuBlocks.REDWOOD_PRESSURE_PLATE, 4);
        createCarpentryRecipe(exporterForRegionsUnexplored, Pair.of(RuBlocks.REDWOOD_PLANKS, 1), RuBlocks.REDWOOD_SIGN, 3);
        createCarpentryRecipe(exporterForRegionsUnexplored, Pair.of(RuBlocks.REDWOOD_PLANKS, 1), RuBlocks.REDWOOD_SLAB, 2);
        createCarpentryRecipe(exporterForRegionsUnexplored, Pair.of(RuBlocks.REDWOOD_PLANKS, 1), RuBlocks.REDWOOD_STAIRS, 1);
        createCarpentryRecipe(exporterForRegionsUnexplored, Pair.of(RuBlocks.REDWOOD_PLANKS, 1), RuBlocks.REDWOOD_TRAPDOOR, 2);

        createCarpentryRecipe(exporterForRegionsUnexplored, RuTags.REDWOOD_LOGS_ITEM, 1, RuBlocks.REDWOOD_PLANKS, 4);
        createCarpentryRecipe(exporterForRegionsUnexplored, RuTags.REDWOOD_LOGS_ITEM, 1, RuItems.REDWOOD_BOAT, 1);
        createCarpentryRecipe(exporterForRegionsUnexplored, RuTags.REDWOOD_LOGS_ITEM, 1, RuBlocks.REDWOOD_BUTTON, 16);
        createCarpentryRecipe(exporterForRegionsUnexplored, RuTags.REDWOOD_LOGS_ITEM, 1, RuBlocks.REDWOOD_DOOR, 4);
        createCarpentryRecipe(exporterForRegionsUnexplored, RuTags.REDWOOD_LOGS_ITEM, 1, RuBlocks.REDWOOD_FENCE_GATE, 4);
        createCarpentryRecipe(exporterForRegionsUnexplored, RuTags.REDWOOD_LOGS_ITEM, 1, RuBlocks.REDWOOD_FENCE, 4);
        createCarpentryRecipe(exporterForRegionsUnexplored, RuTags.REDWOOD_LOGS_ITEM, 1, RuBlocks.REDWOOD_PRESSURE_PLATE, 16);
        createCarpentryRecipe(exporterForRegionsUnexplored, RuTags.REDWOOD_LOGS_ITEM, 1, RuBlocks.REDWOOD_SIGN, 12);
        createCarpentryRecipe(exporterForRegionsUnexplored, RuTags.REDWOOD_LOGS_ITEM, 1, RuBlocks.REDWOOD_SLAB, 8);
        createCarpentryRecipe(exporterForRegionsUnexplored, RuTags.REDWOOD_LOGS_ITEM, 1, RuBlocks.REDWOOD_STAIRS, 4);
        createCarpentryRecipe(exporterForRegionsUnexplored, RuTags.REDWOOD_LOGS_ITEM, 1, RuBlocks.REDWOOD_TRAPDOOR, 8);

        createCarpentryRecipe(exporterForRegionsUnexplored, Pair.of(RuBlocks.SOCOTRA_PLANKS, 2), RuItems.SOCOTRA_BOAT, 1);
        createCarpentryRecipe(exporterForRegionsUnexplored, Pair.of(RuBlocks.SOCOTRA_PLANKS, 1), RuBlocks.SOCOTRA_BUTTON, 4);
        createCarpentryRecipe(exporterForRegionsUnexplored, Pair.of(RuBlocks.SOCOTRA_PLANKS, 2), RuBlocks.SOCOTRA_DOOR, 2);
        createCarpentryRecipe(exporterForRegionsUnexplored, Pair.of(RuBlocks.SOCOTRA_PLANKS, 1), RuBlocks.SOCOTRA_FENCE_GATE, 1);
        createCarpentryRecipe(exporterForRegionsUnexplored, Pair.of(RuBlocks.SOCOTRA_PLANKS, 1), RuBlocks.SOCOTRA_FENCE, 1);
        createCarpentryRecipe(exporterForRegionsUnexplored, Pair.of(RuBlocks.SOCOTRA_PLANKS, 1), RuBlocks.SOCOTRA_PRESSURE_PLATE, 4);
        createCarpentryRecipe(exporterForRegionsUnexplored, Pair.of(RuBlocks.SOCOTRA_PLANKS, 1), RuBlocks.SOCOTRA_SIGN, 3);
        createCarpentryRecipe(exporterForRegionsUnexplored, Pair.of(RuBlocks.SOCOTRA_PLANKS, 1), RuBlocks.SOCOTRA_SLAB, 2);
        createCarpentryRecipe(exporterForRegionsUnexplored, Pair.of(RuBlocks.SOCOTRA_PLANKS, 1), RuBlocks.SOCOTRA_STAIRS, 1);
        createCarpentryRecipe(exporterForRegionsUnexplored, Pair.of(RuBlocks.SOCOTRA_PLANKS, 1), RuBlocks.SOCOTRA_TRAPDOOR, 2);

        createCarpentryRecipe(exporterForRegionsUnexplored, RuTags.SOCOTRA_LOGS_ITEM, 1, RuBlocks.SOCOTRA_PLANKS, 4);
        createCarpentryRecipe(exporterForRegionsUnexplored, RuTags.SOCOTRA_LOGS_ITEM, 1, RuItems.SOCOTRA_BOAT, 1);
        createCarpentryRecipe(exporterForRegionsUnexplored, RuTags.SOCOTRA_LOGS_ITEM, 1, RuBlocks.SOCOTRA_BUTTON, 16);
        createCarpentryRecipe(exporterForRegionsUnexplored, RuTags.SOCOTRA_LOGS_ITEM, 1, RuBlocks.SOCOTRA_DOOR, 4);
        createCarpentryRecipe(exporterForRegionsUnexplored, RuTags.SOCOTRA_LOGS_ITEM, 1, RuBlocks.SOCOTRA_FENCE_GATE, 4);
        createCarpentryRecipe(exporterForRegionsUnexplored, RuTags.SOCOTRA_LOGS_ITEM, 1, RuBlocks.SOCOTRA_FENCE, 4);
        createCarpentryRecipe(exporterForRegionsUnexplored, RuTags.SOCOTRA_LOGS_ITEM, 1, RuBlocks.SOCOTRA_PRESSURE_PLATE, 16);
        createCarpentryRecipe(exporterForRegionsUnexplored, RuTags.SOCOTRA_LOGS_ITEM, 1, RuBlocks.SOCOTRA_SIGN, 12);
        createCarpentryRecipe(exporterForRegionsUnexplored, RuTags.SOCOTRA_LOGS_ITEM, 1, RuBlocks.SOCOTRA_SLAB, 8);
        createCarpentryRecipe(exporterForRegionsUnexplored, RuTags.SOCOTRA_LOGS_ITEM, 1, RuBlocks.SOCOTRA_STAIRS, 4);
        createCarpentryRecipe(exporterForRegionsUnexplored, RuTags.SOCOTRA_LOGS_ITEM, 1, RuBlocks.SOCOTRA_TRAPDOOR, 8);

        createCarpentryRecipe(exporterForRegionsUnexplored, Pair.of(RuBlocks.WILLOW_PLANKS, 2), RuItems.WILLOW_BOAT, 1);
        createCarpentryRecipe(exporterForRegionsUnexplored, Pair.of(RuBlocks.WILLOW_PLANKS, 1), RuBlocks.WILLOW_BUTTON, 4);
        createCarpentryRecipe(exporterForRegionsUnexplored, Pair.of(RuBlocks.WILLOW_PLANKS, 2), RuBlocks.WILLOW_DOOR, 2);
        createCarpentryRecipe(exporterForRegionsUnexplored, Pair.of(RuBlocks.WILLOW_PLANKS, 1), RuBlocks.WILLOW_FENCE_GATE, 1);
        createCarpentryRecipe(exporterForRegionsUnexplored, Pair.of(RuBlocks.WILLOW_PLANKS, 1), RuBlocks.WILLOW_FENCE, 1);
        createCarpentryRecipe(exporterForRegionsUnexplored, Pair.of(RuBlocks.WILLOW_PLANKS, 1), RuBlocks.WILLOW_PRESSURE_PLATE, 4);
        createCarpentryRecipe(exporterForRegionsUnexplored, Pair.of(RuBlocks.WILLOW_PLANKS, 1), RuBlocks.WILLOW_SIGN, 3);
        createCarpentryRecipe(exporterForRegionsUnexplored, Pair.of(RuBlocks.WILLOW_PLANKS, 1), RuBlocks.WILLOW_SLAB, 2);
        createCarpentryRecipe(exporterForRegionsUnexplored, Pair.of(RuBlocks.WILLOW_PLANKS, 1), RuBlocks.WILLOW_STAIRS, 1);
        createCarpentryRecipe(exporterForRegionsUnexplored, Pair.of(RuBlocks.WILLOW_PLANKS, 1), RuBlocks.WILLOW_TRAPDOOR, 2);

        createCarpentryRecipe(exporterForRegionsUnexplored, RuTags.WILLOW_LOGS_ITEM, 1, RuBlocks.WILLOW_PLANKS, 4);
        createCarpentryRecipe(exporterForRegionsUnexplored, RuTags.WILLOW_LOGS_ITEM, 1, RuItems.WILLOW_BOAT, 1);
        createCarpentryRecipe(exporterForRegionsUnexplored, RuTags.WILLOW_LOGS_ITEM, 1, RuBlocks.WILLOW_BUTTON, 16);
        createCarpentryRecipe(exporterForRegionsUnexplored, RuTags.WILLOW_LOGS_ITEM, 1, RuBlocks.WILLOW_DOOR, 4);
        createCarpentryRecipe(exporterForRegionsUnexplored, RuTags.WILLOW_LOGS_ITEM, 1, RuBlocks.WILLOW_FENCE_GATE, 4);
        createCarpentryRecipe(exporterForRegionsUnexplored, RuTags.WILLOW_LOGS_ITEM, 1, RuBlocks.WILLOW_FENCE, 4);
        createCarpentryRecipe(exporterForRegionsUnexplored, RuTags.WILLOW_LOGS_ITEM, 1, RuBlocks.WILLOW_PRESSURE_PLATE, 16);
        createCarpentryRecipe(exporterForRegionsUnexplored, RuTags.WILLOW_LOGS_ITEM, 1, RuBlocks.WILLOW_SIGN, 12);
        createCarpentryRecipe(exporterForRegionsUnexplored, RuTags.WILLOW_LOGS_ITEM, 1, RuBlocks.WILLOW_SLAB, 8);
        createCarpentryRecipe(exporterForRegionsUnexplored, RuTags.WILLOW_LOGS_ITEM, 1, RuBlocks.WILLOW_STAIRS, 4);
        createCarpentryRecipe(exporterForRegionsUnexplored, RuTags.WILLOW_LOGS_ITEM, 1, RuBlocks.WILLOW_TRAPDOOR, 8);

        createCarpentryRecipe(exporterForRegionsUnexplored, Pair.of(RuBlocks.YELLOW_BIOSHROOM_PLANKS, 1), RuBlocks.YELLOW_BIOSHROOM_BUTTON, 4);
        createCarpentryRecipe(exporterForRegionsUnexplored, Pair.of(RuBlocks.YELLOW_BIOSHROOM_PLANKS, 2), RuBlocks.YELLOW_BIOSHROOM_DOOR, 2);
        createCarpentryRecipe(exporterForRegionsUnexplored, Pair.of(RuBlocks.YELLOW_BIOSHROOM_PLANKS, 1), RuBlocks.YELLOW_BIOSHROOM_FENCE_GATE, 1);
        createCarpentryRecipe(exporterForRegionsUnexplored, Pair.of(RuBlocks.YELLOW_BIOSHROOM_PLANKS, 1), RuBlocks.YELLOW_BIOSHROOM_FENCE, 1);
        createCarpentryRecipe(exporterForRegionsUnexplored, Pair.of(RuBlocks.YELLOW_BIOSHROOM_PLANKS, 1), RuBlocks.YELLOW_BIOSHROOM_PRESSURE_PLATE, 4);
        createCarpentryRecipe(exporterForRegionsUnexplored, Pair.of(RuBlocks.YELLOW_BIOSHROOM_PLANKS, 1), RuBlocks.YELLOW_BIOSHROOM_SIGN, 3);
        createCarpentryRecipe(exporterForRegionsUnexplored, Pair.of(RuBlocks.YELLOW_BIOSHROOM_PLANKS, 1), RuBlocks.YELLOW_BIOSHROOM_SLAB, 2);
        createCarpentryRecipe(exporterForRegionsUnexplored, Pair.of(RuBlocks.YELLOW_BIOSHROOM_PLANKS, 1), RuBlocks.YELLOW_BIOSHROOM_STAIRS, 1);
        createCarpentryRecipe(exporterForRegionsUnexplored, Pair.of(RuBlocks.YELLOW_BIOSHROOM_PLANKS, 1), RuBlocks.YELLOW_BIOSHROOM_TRAPDOOR, 2);

        createCarpentryRecipe(exporterForRegionsUnexplored, RuTags.YELLOW_BIOSHROOM_LOGS_ITEM, 1, RuBlocks.YELLOW_BIOSHROOM_PLANKS, 4);
        createCarpentryRecipe(exporterForRegionsUnexplored, RuTags.YELLOW_BIOSHROOM_LOGS_ITEM, 1, RuBlocks.YELLOW_BIOSHROOM_BUTTON, 16);
        createCarpentryRecipe(exporterForRegionsUnexplored, RuTags.YELLOW_BIOSHROOM_LOGS_ITEM, 1, RuBlocks.YELLOW_BIOSHROOM_DOOR, 4);
        createCarpentryRecipe(exporterForRegionsUnexplored, RuTags.YELLOW_BIOSHROOM_LOGS_ITEM, 1, RuBlocks.YELLOW_BIOSHROOM_FENCE_GATE, 4);
        createCarpentryRecipe(exporterForRegionsUnexplored, RuTags.YELLOW_BIOSHROOM_LOGS_ITEM, 1, RuBlocks.YELLOW_BIOSHROOM_FENCE, 4);
        createCarpentryRecipe(exporterForRegionsUnexplored, RuTags.YELLOW_BIOSHROOM_LOGS_ITEM, 1, RuBlocks.YELLOW_BIOSHROOM_PRESSURE_PLATE, 16);
        createCarpentryRecipe(exporterForRegionsUnexplored, RuTags.YELLOW_BIOSHROOM_LOGS_ITEM, 1, RuBlocks.YELLOW_BIOSHROOM_SIGN, 12);
        createCarpentryRecipe(exporterForRegionsUnexplored, RuTags.YELLOW_BIOSHROOM_LOGS_ITEM, 1, RuBlocks.YELLOW_BIOSHROOM_SLAB, 8);
        createCarpentryRecipe(exporterForRegionsUnexplored, RuTags.YELLOW_BIOSHROOM_LOGS_ITEM, 1, RuBlocks.YELLOW_BIOSHROOM_STAIRS, 4);
        createCarpentryRecipe(exporterForRegionsUnexplored, RuTags.YELLOW_BIOSHROOM_LOGS_ITEM, 1, RuBlocks.YELLOW_BIOSHROOM_TRAPDOOR, 8);

        createCarpentryRecipe(exporterForRegionsUnexplored, Pair.of(RuBlocks.RED_PAINTED_PLANKS, 1), RuBlocks.RED_PAINTED_SLAB, 2);
        createCarpentryRecipe(exporterForRegionsUnexplored, Pair.of(RuBlocks.RED_PAINTED_PLANKS, 1), RuBlocks.RED_PAINTED_STAIRS, 1);

        createCarpentryRecipe(exporterForRegionsUnexplored, Pair.of(RuBlocks.ORANGE_PAINTED_PLANKS, 1), RuBlocks.ORANGE_PAINTED_SLAB, 2);
        createCarpentryRecipe(exporterForRegionsUnexplored, Pair.of(RuBlocks.ORANGE_PAINTED_PLANKS, 1), RuBlocks.ORANGE_PAINTED_STAIRS, 1);

        createCarpentryRecipe(exporterForRegionsUnexplored, Pair.of(RuBlocks.YELLOW_PAINTED_PLANKS, 1), RuBlocks.YELLOW_PAINTED_SLAB, 2);
        createCarpentryRecipe(exporterForRegionsUnexplored, Pair.of(RuBlocks.YELLOW_PAINTED_PLANKS, 1), RuBlocks.YELLOW_PAINTED_STAIRS, 1);

        createCarpentryRecipe(exporterForRegionsUnexplored, Pair.of(RuBlocks.LIME_PAINTED_PLANKS, 1), RuBlocks.LIME_PAINTED_SLAB, 2);
        createCarpentryRecipe(exporterForRegionsUnexplored, Pair.of(RuBlocks.LIME_PAINTED_PLANKS, 1), RuBlocks.LIME_PAINTED_STAIRS, 1);

        createCarpentryRecipe(exporterForRegionsUnexplored, Pair.of(RuBlocks.GREEN_PAINTED_PLANKS, 1), RuBlocks.GREEN_PAINTED_SLAB, 2);
        createCarpentryRecipe(exporterForRegionsUnexplored, Pair.of(RuBlocks.GREEN_PAINTED_PLANKS, 1), RuBlocks.GREEN_PAINTED_STAIRS, 1);

        createCarpentryRecipe(exporterForRegionsUnexplored, Pair.of(RuBlocks.CYAN_PAINTED_PLANKS, 1), RuBlocks.CYAN_PAINTED_SLAB, 2);
        createCarpentryRecipe(exporterForRegionsUnexplored, Pair.of(RuBlocks.CYAN_PAINTED_PLANKS, 1), RuBlocks.CYAN_PAINTED_STAIRS, 1);

        createCarpentryRecipe(exporterForRegionsUnexplored, Pair.of(RuBlocks.LIGHT_BLUE_PAINTED_PLANKS, 1), RuBlocks.LIGHT_BLUE_PAINTED_SLAB, 2);
        createCarpentryRecipe(exporterForRegionsUnexplored, Pair.of(RuBlocks.LIGHT_BLUE_PAINTED_PLANKS, 1), RuBlocks.LIGHT_BLUE_PAINTED_STAIRS, 1);

        createCarpentryRecipe(exporterForRegionsUnexplored, Pair.of(RuBlocks.BLUE_PAINTED_PLANKS, 1), RuBlocks.BLUE_PAINTED_SLAB, 2);
        createCarpentryRecipe(exporterForRegionsUnexplored, Pair.of(RuBlocks.BLUE_PAINTED_PLANKS, 1), RuBlocks.BLUE_PAINTED_STAIRS, 1);

        createCarpentryRecipe(exporterForRegionsUnexplored, Pair.of(RuBlocks.PURPLE_PAINTED_PLANKS, 1), RuBlocks.PURPLE_PAINTED_SLAB, 2);
        createCarpentryRecipe(exporterForRegionsUnexplored, Pair.of(RuBlocks.PURPLE_PAINTED_PLANKS, 1), RuBlocks.PURPLE_PAINTED_STAIRS, 1);

        createCarpentryRecipe(exporterForRegionsUnexplored, Pair.of(RuBlocks.MAGENTA_PAINTED_PLANKS, 1), RuBlocks.MAGENTA_PAINTED_SLAB, 2);
        createCarpentryRecipe(exporterForRegionsUnexplored, Pair.of(RuBlocks.MAGENTA_PAINTED_PLANKS, 1), RuBlocks.MAGENTA_PAINTED_STAIRS, 1);

        createCarpentryRecipe(exporterForRegionsUnexplored, Pair.of(RuBlocks.PINK_PAINTED_PLANKS, 1), RuBlocks.PINK_PAINTED_SLAB, 2);
        createCarpentryRecipe(exporterForRegionsUnexplored, Pair.of(RuBlocks.PINK_PAINTED_PLANKS, 1), RuBlocks.PINK_PAINTED_STAIRS, 1);

        createCarpentryRecipe(exporterForRegionsUnexplored, Pair.of(RuBlocks.BROWN_PAINTED_PLANKS, 1), RuBlocks.BROWN_PAINTED_SLAB, 2);
        createCarpentryRecipe(exporterForRegionsUnexplored, Pair.of(RuBlocks.BROWN_PAINTED_PLANKS, 1), RuBlocks.BROWN_PAINTED_STAIRS, 1);

        createCarpentryRecipe(exporterForRegionsUnexplored, Pair.of(RuBlocks.WHITE_PAINTED_PLANKS, 1), RuBlocks.WHITE_PAINTED_SLAB, 2);
        createCarpentryRecipe(exporterForRegionsUnexplored, Pair.of(RuBlocks.WHITE_PAINTED_PLANKS, 1), RuBlocks.WHITE_PAINTED_STAIRS, 1);

        createCarpentryRecipe(exporterForRegionsUnexplored, Pair.of(RuBlocks.LIGHT_GRAY_PAINTED_PLANKS, 1), RuBlocks.LIGHT_GRAY_PAINTED_SLAB, 2);
        createCarpentryRecipe(exporterForRegionsUnexplored, Pair.of(RuBlocks.LIGHT_GRAY_PAINTED_PLANKS, 1), RuBlocks.LIGHT_GRAY_PAINTED_STAIRS, 1);

        createCarpentryRecipe(exporterForRegionsUnexplored, Pair.of(RuBlocks.GRAY_PAINTED_PLANKS, 1), RuBlocks.GRAY_PAINTED_SLAB, 2);
        createCarpentryRecipe(exporterForRegionsUnexplored, Pair.of(RuBlocks.GRAY_PAINTED_PLANKS, 1), RuBlocks.GRAY_PAINTED_STAIRS, 1);

        createCarpentryRecipe(exporterForRegionsUnexplored, Pair.of(RuBlocks.BLACK_PAINTED_PLANKS, 1), RuBlocks.BLACK_PAINTED_SLAB, 2);
        createCarpentryRecipe(exporterForRegionsUnexplored, Pair.of(RuBlocks.BLACK_PAINTED_PLANKS, 1), RuBlocks.BLACK_PAINTED_STAIRS, 1);
    }

    private void createBetterArcheologyRecipes(RecipeExporter exporter) {
        RecipeExporter exporterForBetterArcheology = withConditions(exporter, DefaultResourceConditions.allModsLoaded("betterarcheology"));

        createCarpentryRecipe(exporterForBetterArcheology, Pair.of(ModBlocks.ROTTEN_LOG, 1), ModBlocks.ROTTEN_PLANKS, 4);
        createCarpentryRecipe(exporterForBetterArcheology, Pair.of(ModBlocks.ROTTEN_LOG, 1), ModBlocks.ROTTEN_SLAB, 8);
        createCarpentryRecipe(exporterForBetterArcheology, Pair.of(ModBlocks.ROTTEN_LOG, 1), ModBlocks.ROTTEN_STAIRS, 4);
        createCarpentryRecipe(exporterForBetterArcheology, Pair.of(ModBlocks.ROTTEN_LOG, 1), ModBlocks.ROTTEN_FENCE, 4);
        createCarpentryRecipe(exporterForBetterArcheology, Pair.of(ModBlocks.ROTTEN_LOG, 1), ModBlocks.ROTTEN_FENCE_GATE, 4);
        createCarpentryRecipe(exporterForBetterArcheology, Pair.of(ModBlocks.ROTTEN_LOG, 1), ModBlocks.ROTTEN_TRAPDOOR, 8);
        createCarpentryRecipe(exporterForBetterArcheology, Pair.of(ModBlocks.ROTTEN_LOG, 1), ModBlocks.ROTTEN_DOOR, 4);
        createCarpentryRecipe(exporterForBetterArcheology, Pair.of(ModBlocks.ROTTEN_LOG, 1), ModBlocks.ROTTEN_PRESSURE_PLATE, 16);

        createCarpentryRecipe(exporterForBetterArcheology, Pair.of(ModBlocks.ROTTEN_PLANKS, 2), ModBlocks.ROTTEN_DOOR, 2);
        createCarpentryRecipe(exporterForBetterArcheology, Pair.of(ModBlocks.ROTTEN_PLANKS, 1), ModBlocks.ROTTEN_FENCE_GATE, 1);
        createCarpentryRecipe(exporterForBetterArcheology, Pair.of(ModBlocks.ROTTEN_PLANKS, 1), ModBlocks.ROTTEN_FENCE, 1);
        createCarpentryRecipe(exporterForBetterArcheology, Pair.of(ModBlocks.ROTTEN_PLANKS, 1), ModBlocks.ROTTEN_PRESSURE_PLATE, 4);
        createCarpentryRecipe(exporterForBetterArcheology, Pair.of(ModBlocks.ROTTEN_PLANKS, 1), ModBlocks.ROTTEN_SLAB, 2);
        createCarpentryRecipe(exporterForBetterArcheology, Pair.of(ModBlocks.ROTTEN_PLANKS, 1), ModBlocks.ROTTEN_STAIRS, 1);
        createCarpentryRecipe(exporterForBetterArcheology, Pair.of(ModBlocks.ROTTEN_PLANKS, 1), ModBlocks.ROTTEN_TRAPDOOR, 2);
    }

    private void createCarpentryRecipe(RecipeExporter exporter, Pair<Block, Integer> ingredientPair, ItemConvertible output,
                                       int outputCount) {
        Block input = ingredientPair.getFirst();
        Identifier blockId =  Registries.BLOCK.getId(input);
        String blockNamespace = blockId.getNamespace();
        String blockName = blockId.getPath();

        WoodcuttingRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, output, outputCount)
                .input(Ingredient.ofItems(input), ingredientPair.getSecond())
                .criterion(FabricRecipeProvider.hasItem(output), conditionsFromItem(output))
                .offerTo(exporter, new Identifier(blockNamespace + "_" + blockName + "_to_" + getRecipeName(output) + "_woodcutting"));
    }

    private void createCarpentryRecipe(RecipeExporter exporter, TagKey<Item> tag, Integer ingredientCount, ItemConvertible output,
                                       int outputCount) {
        Identifier tagId = tag.id();
        String tagNamespace = tagId.getNamespace();
        String tagPath = tagId.getPath();

        WoodcuttingRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, output, outputCount)
                .input(Ingredient.fromTag(tag), ingredientCount)
                .criterion(FabricRecipeProvider.hasItem(output), conditionsFromItem(output))
                .offerTo(exporter, new Identifier(tagNamespace + "_" + tagPath + "_to_" + getRecipeName(output) + "_woodcutting"));
    }
}
