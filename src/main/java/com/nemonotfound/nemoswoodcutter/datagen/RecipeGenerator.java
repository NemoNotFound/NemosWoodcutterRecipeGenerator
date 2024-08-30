//package com.nemonotfound.nemoswoodcutter.datagen;
//
//import biomesoplenty.api.block.BOPBlocks;
//import biomesoplenty.api.item.BOPItems;
//import biomesoplenty.init.ModTags;
//import com.mojang.datafixers.util.Pair;
//import com.nemonotfound.nemosmossyblocks.block.ModBlocks;
//import com.nemonotfound.nemosmossyblocks.item.ModItems;
//import com.nemonotfound.nemosmossyblocks.registry.tag.ModItemTags;
//import com.pnku.mblv.init.MblvItemInit;
//import com.pnku.mcmv.init.McmvItemInit;
//import io.github.lieonlion.lolmct.init.MctItemInit;
//import io.github.lieonlion.mcv.init.McvItemInit;
//import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
//import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
//import net.fabricmc.fabric.api.resource.conditions.v1.ResourceConditions;
//import net.minecraft.block.Block;
//import net.minecraft.block.Blocks;
//import net.minecraft.data.server.recipe.RecipeExporter;
//import net.minecraft.item.Item;
//import net.minecraft.recipe.Ingredient;
//import net.minecraft.recipe.book.RecipeCategory;
//import net.minecraft.registry.Registries;
//import net.minecraft.registry.RegistryWrapper;
//import net.minecraft.registry.tag.ItemTags;
//import net.minecraft.registry.tag.TagKey;
//import net.minecraft.util.Identifier;
//
//import java.util.concurrent.CompletableFuture;
//
//public class RecipeGenerator extends FabricRecipeProvider {
//
//    public RecipeGenerator(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
//        super(output, registriesFuture);
//    }
//
//    @Override
//    public void generate(RecipeExporter exporter) {
//        createMoreBarrelVariantsRecipes(exporter);
//        createMoreChestVariantsRecipes(exporter);
//        createMoreCraftingTablesRecipes(exporter);
//        createMoreComposterVariantsRecipes(exporter);
//        createNemosMossyBlocksRecipes(exporter);
//    }
//
//    private void createNemosMossyBlocksRecipes(RecipeExporter exporter) {
//        RecipeExporter exporterWithCondition = withConditions(exporter, ResourceConditions.allModsLoaded("nemos-mossy-blocks"));
//
//        createCarpentryRecipe(exporterWithCondition, ModItemTags.MOSSY_OAK_WOOD, 1, ModItems.MOSSY_OAK_PLANKS, 4);
//        createCarpentryRecipe(exporterWithCondition, ModItemTags.MOSSY_OAK_WOOD, 1, ModItems.MOSSY_OAK_BUTTON, 16);
//        createCarpentryRecipe(exporterWithCondition, ModItemTags.MOSSY_OAK_WOOD, 1, ModItems.MOSSY_OAK_DOOR, 4);
//        createCarpentryRecipe(exporterWithCondition, ModItemTags.MOSSY_OAK_WOOD, 1, ModItems.MOSSY_OAK_FENCE_GATE, 4);
//        createCarpentryRecipe(exporterWithCondition, ModItemTags.MOSSY_OAK_WOOD, 1, ModItems.MOSSY_OAK_FENCE, 4);
//        createCarpentryRecipe(exporterWithCondition, ModItemTags.MOSSY_OAK_WOOD, 1, ModItems.MOSSY_OAK_PRESSURE_PLATE, 16);
//        createCarpentryRecipe(exporterWithCondition, ModItemTags.MOSSY_OAK_WOOD, 1, ModItems.MOSSY_OAK_SLAB, 8);
//        createCarpentryRecipe(exporterWithCondition, ModItemTags.MOSSY_OAK_WOOD, 1, ModItems.MOSSY_OAK_STAIRS, 4);
//        createCarpentryRecipe(exporterWithCondition, ModItemTags.MOSSY_OAK_WOOD, 1, ModItems.MOSSY_OAK_TRAPDOOR, 8);
//
//        createCarpentryRecipe(exporterWithCondition, Pair.of(ModBlocks.MOSSY_OAK_PLANKS, 1), ModItems.MOSSY_OAK_BUTTON, 4);
//        createCarpentryRecipe(exporterWithCondition, Pair.of(ModBlocks.MOSSY_OAK_PLANKS, 2), ModItems.MOSSY_OAK_DOOR, 2);
//        createCarpentryRecipe(exporterWithCondition, Pair.of(ModBlocks.MOSSY_OAK_PLANKS, 1), ModItems.MOSSY_OAK_FENCE_GATE, 1);
//        createCarpentryRecipe(exporterWithCondition, Pair.of(ModBlocks.MOSSY_OAK_PLANKS, 1), ModItems.MOSSY_OAK_FENCE, 1);
//        createCarpentryRecipe(exporterWithCondition, Pair.of(ModBlocks.MOSSY_OAK_PLANKS, 1), ModItems.MOSSY_OAK_PRESSURE_PLATE, 4);
//        createCarpentryRecipe(exporterWithCondition, Pair.of(ModBlocks.MOSSY_OAK_PLANKS, 1), ModItems.MOSSY_OAK_SLAB, 2);
//        createCarpentryRecipe(exporterWithCondition, Pair.of(ModBlocks.MOSSY_OAK_PLANKS, 1), ModItems.MOSSY_OAK_STAIRS, 1);
//        createCarpentryRecipe(exporterWithCondition, Pair.of(ModBlocks.MOSSY_OAK_PLANKS, 1), ModItems.MOSSY_OAK_TRAPDOOR, 2);
//
//        createCarpentryRecipe(exporterWithCondition, ModItemTags.MOSSY_SPRUCE_WOOD, 1, ModItems.MOSSY_SPRUCE_PLANKS, 4);
//        createCarpentryRecipe(exporterWithCondition, ModItemTags.MOSSY_SPRUCE_WOOD, 1, ModItems.MOSSY_SPRUCE_BUTTON, 16);
//        createCarpentryRecipe(exporterWithCondition, ModItemTags.MOSSY_SPRUCE_WOOD, 1, ModItems.MOSSY_SPRUCE_DOOR, 4);
//        createCarpentryRecipe(exporterWithCondition, ModItemTags.MOSSY_SPRUCE_WOOD, 1, ModItems.MOSSY_SPRUCE_FENCE_GATE, 4);
//        createCarpentryRecipe(exporterWithCondition, ModItemTags.MOSSY_SPRUCE_WOOD, 1, ModItems.MOSSY_SPRUCE_FENCE, 4);
//        createCarpentryRecipe(exporterWithCondition, ModItemTags.MOSSY_SPRUCE_WOOD, 1, ModItems.MOSSY_SPRUCE_PRESSURE_PLATE, 16);
//        createCarpentryRecipe(exporterWithCondition, ModItemTags.MOSSY_SPRUCE_WOOD, 1, ModItems.MOSSY_SPRUCE_SLAB, 8);
//        createCarpentryRecipe(exporterWithCondition, ModItemTags.MOSSY_SPRUCE_WOOD, 1, ModItems.MOSSY_SPRUCE_STAIRS, 4);
//        createCarpentryRecipe(exporterWithCondition, ModItemTags.MOSSY_SPRUCE_WOOD, 1, ModItems.MOSSY_SPRUCE_TRAPDOOR, 8);
//
//        createCarpentryRecipe(exporterWithCondition, Pair.of(ModBlocks.MOSSY_SPRUCE_PLANKS, 1), ModItems.MOSSY_SPRUCE_BUTTON, 4);
//        createCarpentryRecipe(exporterWithCondition, Pair.of(ModBlocks.MOSSY_SPRUCE_PLANKS, 2), ModItems.MOSSY_SPRUCE_DOOR, 2);
//        createCarpentryRecipe(exporterWithCondition, Pair.of(ModBlocks.MOSSY_SPRUCE_PLANKS, 1), ModItems.MOSSY_SPRUCE_FENCE_GATE, 1);
//        createCarpentryRecipe(exporterWithCondition, Pair.of(ModBlocks.MOSSY_SPRUCE_PLANKS, 1), ModItems.MOSSY_SPRUCE_FENCE, 1);
//        createCarpentryRecipe(exporterWithCondition, Pair.of(ModBlocks.MOSSY_SPRUCE_PLANKS, 1), ModItems.MOSSY_SPRUCE_PRESSURE_PLATE, 4);
//        createCarpentryRecipe(exporterWithCondition, Pair.of(ModBlocks.MOSSY_SPRUCE_PLANKS, 1), ModItems.MOSSY_SPRUCE_SLAB, 2);
//        createCarpentryRecipe(exporterWithCondition, Pair.of(ModBlocks.MOSSY_SPRUCE_PLANKS, 1), ModItems.MOSSY_SPRUCE_STAIRS, 1);
//        createCarpentryRecipe(exporterWithCondition, Pair.of(ModBlocks.MOSSY_SPRUCE_PLANKS, 1), ModItems.MOSSY_SPRUCE_TRAPDOOR, 2);
//
//        createCarpentryRecipe(exporterWithCondition, ModItemTags.MOSSY_BIRCH_WOOD, 1, ModItems.MOSSY_BIRCH_PLANKS, 4);
//        createCarpentryRecipe(exporterWithCondition, ModItemTags.MOSSY_BIRCH_WOOD, 1, ModItems.MOSSY_BIRCH_BUTTON, 16);
//        createCarpentryRecipe(exporterWithCondition, ModItemTags.MOSSY_BIRCH_WOOD, 1, ModItems.MOSSY_BIRCH_DOOR, 4);
//        createCarpentryRecipe(exporterWithCondition, ModItemTags.MOSSY_BIRCH_WOOD, 1, ModItems.MOSSY_BIRCH_FENCE_GATE, 4);
//        createCarpentryRecipe(exporterWithCondition, ModItemTags.MOSSY_BIRCH_WOOD, 1, ModItems.MOSSY_BIRCH_FENCE, 4);
//        createCarpentryRecipe(exporterWithCondition, ModItemTags.MOSSY_BIRCH_WOOD, 1, ModItems.MOSSY_BIRCH_PRESSURE_PLATE, 16);
//        createCarpentryRecipe(exporterWithCondition, ModItemTags.MOSSY_BIRCH_WOOD, 1, ModItems.MOSSY_BIRCH_SLAB, 8);
//        createCarpentryRecipe(exporterWithCondition, ModItemTags.MOSSY_BIRCH_WOOD, 1, ModItems.MOSSY_BIRCH_STAIRS, 4);
//        createCarpentryRecipe(exporterWithCondition, ModItemTags.MOSSY_BIRCH_WOOD, 1, ModItems.MOSSY_BIRCH_TRAPDOOR, 8);
//
//        createCarpentryRecipe(exporterWithCondition, Pair.of(ModBlocks.MOSSY_BIRCH_PLANKS, 1), ModItems.MOSSY_BIRCH_BUTTON, 4);
//        createCarpentryRecipe(exporterWithCondition, Pair.of(ModBlocks.MOSSY_BIRCH_PLANKS, 2), ModItems.MOSSY_BIRCH_DOOR, 2);
//        createCarpentryRecipe(exporterWithCondition, Pair.of(ModBlocks.MOSSY_BIRCH_PLANKS, 1), ModItems.MOSSY_BIRCH_FENCE_GATE, 1);
//        createCarpentryRecipe(exporterWithCondition, Pair.of(ModBlocks.MOSSY_BIRCH_PLANKS, 1), ModItems.MOSSY_BIRCH_FENCE, 1);
//        createCarpentryRecipe(exporterWithCondition, Pair.of(ModBlocks.MOSSY_BIRCH_PLANKS, 1), ModItems.MOSSY_BIRCH_PRESSURE_PLATE, 4);
//        createCarpentryRecipe(exporterWithCondition, Pair.of(ModBlocks.MOSSY_BIRCH_PLANKS, 1), ModItems.MOSSY_BIRCH_SLAB, 2);
//        createCarpentryRecipe(exporterWithCondition, Pair.of(ModBlocks.MOSSY_BIRCH_PLANKS, 1), ModItems.MOSSY_BIRCH_STAIRS, 1);
//        createCarpentryRecipe(exporterWithCondition, Pair.of(ModBlocks.MOSSY_BIRCH_PLANKS, 1), ModItems.MOSSY_BIRCH_TRAPDOOR, 2);
//
//        createCarpentryRecipe(exporterWithCondition, ModItemTags.MOSSY_JUNGLE_WOOD, 1, ModItems.MOSSY_JUNGLE_PLANKS, 4);
//        createCarpentryRecipe(exporterWithCondition, ModItemTags.MOSSY_JUNGLE_WOOD, 1, ModItems.MOSSY_JUNGLE_BUTTON, 16);
//        createCarpentryRecipe(exporterWithCondition, ModItemTags.MOSSY_JUNGLE_WOOD, 1, ModItems.MOSSY_JUNGLE_DOOR, 4);
//        createCarpentryRecipe(exporterWithCondition, ModItemTags.MOSSY_JUNGLE_WOOD, 1, ModItems.MOSSY_JUNGLE_FENCE_GATE, 4);
//        createCarpentryRecipe(exporterWithCondition, ModItemTags.MOSSY_JUNGLE_WOOD, 1, ModItems.MOSSY_JUNGLE_FENCE, 4);
//        createCarpentryRecipe(exporterWithCondition, ModItemTags.MOSSY_JUNGLE_WOOD, 1, ModItems.MOSSY_JUNGLE_PRESSURE_PLATE, 16);
//        createCarpentryRecipe(exporterWithCondition, ModItemTags.MOSSY_JUNGLE_WOOD, 1, ModItems.MOSSY_JUNGLE_SLAB, 8);
//        createCarpentryRecipe(exporterWithCondition, ModItemTags.MOSSY_JUNGLE_WOOD, 1, ModItems.MOSSY_JUNGLE_STAIRS, 4);
//        createCarpentryRecipe(exporterWithCondition, ModItemTags.MOSSY_JUNGLE_WOOD, 1, ModItems.MOSSY_JUNGLE_TRAPDOOR, 8);
//
//        createCarpentryRecipe(exporterWithCondition, Pair.of(ModBlocks.MOSSY_JUNGLE_PLANKS, 1), ModItems.MOSSY_JUNGLE_BUTTON, 4);
//        createCarpentryRecipe(exporterWithCondition, Pair.of(ModBlocks.MOSSY_JUNGLE_PLANKS, 2), ModItems.MOSSY_JUNGLE_DOOR, 2);
//        createCarpentryRecipe(exporterWithCondition, Pair.of(ModBlocks.MOSSY_JUNGLE_PLANKS, 1), ModItems.MOSSY_JUNGLE_FENCE_GATE, 1);
//        createCarpentryRecipe(exporterWithCondition, Pair.of(ModBlocks.MOSSY_JUNGLE_PLANKS, 1), ModItems.MOSSY_JUNGLE_FENCE, 1);
//        createCarpentryRecipe(exporterWithCondition, Pair.of(ModBlocks.MOSSY_JUNGLE_PLANKS, 1), ModItems.MOSSY_JUNGLE_PRESSURE_PLATE, 4);
//        createCarpentryRecipe(exporterWithCondition, Pair.of(ModBlocks.MOSSY_JUNGLE_PLANKS, 1), ModItems.MOSSY_JUNGLE_SLAB, 2);
//        createCarpentryRecipe(exporterWithCondition, Pair.of(ModBlocks.MOSSY_JUNGLE_PLANKS, 1), ModItems.MOSSY_JUNGLE_STAIRS, 1);
//        createCarpentryRecipe(exporterWithCondition, Pair.of(ModBlocks.MOSSY_JUNGLE_PLANKS, 1), ModItems.MOSSY_JUNGLE_TRAPDOOR, 2);
//
//        createCarpentryRecipe(exporterWithCondition, ModItemTags.MOSSY_ACACIA_WOOD, 1, ModItems.MOSSY_ACACIA_PLANKS, 4);
//        createCarpentryRecipe(exporterWithCondition, ModItemTags.MOSSY_ACACIA_WOOD, 1, ModItems.MOSSY_ACACIA_BUTTON, 16);
//        createCarpentryRecipe(exporterWithCondition, ModItemTags.MOSSY_ACACIA_WOOD, 1, ModItems.MOSSY_ACACIA_DOOR, 4);
//        createCarpentryRecipe(exporterWithCondition, ModItemTags.MOSSY_ACACIA_WOOD, 1, ModItems.MOSSY_ACACIA_FENCE_GATE, 4);
//        createCarpentryRecipe(exporterWithCondition, ModItemTags.MOSSY_ACACIA_WOOD, 1, ModItems.MOSSY_ACACIA_FENCE, 4);
//        createCarpentryRecipe(exporterWithCondition, ModItemTags.MOSSY_ACACIA_WOOD, 1, ModItems.MOSSY_ACACIA_PRESSURE_PLATE, 16);
//        createCarpentryRecipe(exporterWithCondition, ModItemTags.MOSSY_ACACIA_WOOD, 1, ModItems.MOSSY_ACACIA_SLAB, 8);
//        createCarpentryRecipe(exporterWithCondition, ModItemTags.MOSSY_ACACIA_WOOD, 1, ModItems.MOSSY_ACACIA_STAIRS, 4);
//        createCarpentryRecipe(exporterWithCondition, ModItemTags.MOSSY_ACACIA_WOOD, 1, ModItems.MOSSY_ACACIA_TRAPDOOR, 8);
//
//        createCarpentryRecipe(exporterWithCondition, Pair.of(ModBlocks.MOSSY_ACACIA_PLANKS, 1), ModItems.MOSSY_ACACIA_BUTTON, 4);
//        createCarpentryRecipe(exporterWithCondition, Pair.of(ModBlocks.MOSSY_ACACIA_PLANKS, 2), ModItems.MOSSY_ACACIA_DOOR, 2);
//        createCarpentryRecipe(exporterWithCondition, Pair.of(ModBlocks.MOSSY_ACACIA_PLANKS, 1), ModItems.MOSSY_ACACIA_FENCE_GATE, 1);
//        createCarpentryRecipe(exporterWithCondition, Pair.of(ModBlocks.MOSSY_ACACIA_PLANKS, 1), ModItems.MOSSY_ACACIA_FENCE, 1);
//        createCarpentryRecipe(exporterWithCondition, Pair.of(ModBlocks.MOSSY_ACACIA_PLANKS, 1), ModItems.MOSSY_ACACIA_PRESSURE_PLATE, 4);
//        createCarpentryRecipe(exporterWithCondition, Pair.of(ModBlocks.MOSSY_ACACIA_PLANKS, 1), ModItems.MOSSY_ACACIA_SLAB, 2);
//        createCarpentryRecipe(exporterWithCondition, Pair.of(ModBlocks.MOSSY_ACACIA_PLANKS, 1), ModItems.MOSSY_ACACIA_STAIRS, 1);
//        createCarpentryRecipe(exporterWithCondition, Pair.of(ModBlocks.MOSSY_ACACIA_PLANKS, 1), ModItems.MOSSY_ACACIA_TRAPDOOR, 2);
//
//        createCarpentryRecipe(exporterWithCondition, ModItemTags.MOSSY_DARK_OAK_WOOD, 1, ModItems.MOSSY_DARK_OAK_PLANKS, 4);
//        createCarpentryRecipe(exporterWithCondition, ModItemTags.MOSSY_DARK_OAK_WOOD, 1, ModItems.MOSSY_DARK_OAK_BUTTON, 16);
//        createCarpentryRecipe(exporterWithCondition, ModItemTags.MOSSY_DARK_OAK_WOOD, 1, ModItems.MOSSY_DARK_OAK_DOOR, 4);
//        createCarpentryRecipe(exporterWithCondition, ModItemTags.MOSSY_DARK_OAK_WOOD, 1, ModItems.MOSSY_DARK_OAK_FENCE_GATE, 4);
//        createCarpentryRecipe(exporterWithCondition, ModItemTags.MOSSY_DARK_OAK_WOOD, 1, ModItems.MOSSY_DARK_OAK_FENCE, 4);
//        createCarpentryRecipe(exporterWithCondition, ModItemTags.MOSSY_DARK_OAK_WOOD, 1, ModItems.MOSSY_DARK_OAK_PRESSURE_PLATE, 16);
//        createCarpentryRecipe(exporterWithCondition, ModItemTags.MOSSY_DARK_OAK_WOOD, 1, ModItems.MOSSY_DARK_OAK_SLAB, 8);
//        createCarpentryRecipe(exporterWithCondition, ModItemTags.MOSSY_DARK_OAK_WOOD, 1, ModItems.MOSSY_DARK_OAK_STAIRS, 4);
//        createCarpentryRecipe(exporterWithCondition, ModItemTags.MOSSY_DARK_OAK_WOOD, 1, ModItems.MOSSY_DARK_OAK_TRAPDOOR, 8);
//
//        createCarpentryRecipe(exporterWithCondition, Pair.of(ModBlocks.MOSSY_DARK_OAK_PLANKS, 1), ModItems.MOSSY_DARK_OAK_BUTTON, 4);
//        createCarpentryRecipe(exporterWithCondition, Pair.of(ModBlocks.MOSSY_DARK_OAK_PLANKS, 2), ModItems.MOSSY_DARK_OAK_DOOR, 2);
//        createCarpentryRecipe(exporterWithCondition, Pair.of(ModBlocks.MOSSY_DARK_OAK_PLANKS, 1), ModItems.MOSSY_DARK_OAK_FENCE_GATE, 1);
//        createCarpentryRecipe(exporterWithCondition, Pair.of(ModBlocks.MOSSY_DARK_OAK_PLANKS, 1), ModItems.MOSSY_DARK_OAK_FENCE, 1);
//        createCarpentryRecipe(exporterWithCondition, Pair.of(ModBlocks.MOSSY_DARK_OAK_PLANKS, 1), ModItems.MOSSY_DARK_OAK_PRESSURE_PLATE, 4);
//        createCarpentryRecipe(exporterWithCondition, Pair.of(ModBlocks.MOSSY_DARK_OAK_PLANKS, 1), ModItems.MOSSY_DARK_OAK_SLAB, 2);
//        createCarpentryRecipe(exporterWithCondition, Pair.of(ModBlocks.MOSSY_DARK_OAK_PLANKS, 1), ModItems.MOSSY_DARK_OAK_STAIRS, 1);
//        createCarpentryRecipe(exporterWithCondition, Pair.of(ModBlocks.MOSSY_DARK_OAK_PLANKS, 1), ModItems.MOSSY_DARK_OAK_TRAPDOOR, 2);
//
//        createCarpentryRecipe(exporterWithCondition, ModItemTags.MOSSY_MANGROVE_WOOD, 1, ModItems.MOSSY_MANGROVE_PLANKS, 4);
//        createCarpentryRecipe(exporterWithCondition, ModItemTags.MOSSY_MANGROVE_WOOD, 1, ModItems.MOSSY_MANGROVE_BUTTON, 16);
//        createCarpentryRecipe(exporterWithCondition, ModItemTags.MOSSY_MANGROVE_WOOD, 1, ModItems.MOSSY_MANGROVE_DOOR, 4);
//        createCarpentryRecipe(exporterWithCondition, ModItemTags.MOSSY_MANGROVE_WOOD, 1, ModItems.MOSSY_MANGROVE_FENCE_GATE, 4);
//        createCarpentryRecipe(exporterWithCondition, ModItemTags.MOSSY_MANGROVE_WOOD, 1, ModItems.MOSSY_MANGROVE_FENCE, 4);
//        createCarpentryRecipe(exporterWithCondition, ModItemTags.MOSSY_MANGROVE_WOOD, 1, ModItems.MOSSY_MANGROVE_PRESSURE_PLATE, 16);
//        createCarpentryRecipe(exporterWithCondition, ModItemTags.MOSSY_MANGROVE_WOOD, 1, ModItems.MOSSY_MANGROVE_SLAB, 8);
//        createCarpentryRecipe(exporterWithCondition, ModItemTags.MOSSY_MANGROVE_WOOD, 1, ModItems.MOSSY_MANGROVE_STAIRS, 4);
//        createCarpentryRecipe(exporterWithCondition, ModItemTags.MOSSY_MANGROVE_WOOD, 1, ModItems.MOSSY_MANGROVE_TRAPDOOR, 8);
//
//        createCarpentryRecipe(exporterWithCondition, Pair.of(ModBlocks.MOSSY_MANGROVE_PLANKS, 1), ModItems.MOSSY_MANGROVE_BUTTON, 4);
//        createCarpentryRecipe(exporterWithCondition, Pair.of(ModBlocks.MOSSY_MANGROVE_PLANKS, 2), ModItems.MOSSY_MANGROVE_DOOR, 2);
//        createCarpentryRecipe(exporterWithCondition, Pair.of(ModBlocks.MOSSY_MANGROVE_PLANKS, 1), ModItems.MOSSY_MANGROVE_FENCE_GATE, 1);
//        createCarpentryRecipe(exporterWithCondition, Pair.of(ModBlocks.MOSSY_MANGROVE_PLANKS, 1), ModItems.MOSSY_MANGROVE_FENCE, 1);
//        createCarpentryRecipe(exporterWithCondition, Pair.of(ModBlocks.MOSSY_MANGROVE_PLANKS, 1), ModItems.MOSSY_MANGROVE_PRESSURE_PLATE, 4);
//        createCarpentryRecipe(exporterWithCondition, Pair.of(ModBlocks.MOSSY_MANGROVE_PLANKS, 1), ModItems.MOSSY_MANGROVE_SLAB, 2);
//        createCarpentryRecipe(exporterWithCondition, Pair.of(ModBlocks.MOSSY_MANGROVE_PLANKS, 1), ModItems.MOSSY_MANGROVE_STAIRS, 1);
//        createCarpentryRecipe(exporterWithCondition, Pair.of(ModBlocks.MOSSY_MANGROVE_PLANKS, 1), ModItems.MOSSY_MANGROVE_TRAPDOOR, 2);
//
//        createCarpentryRecipe(exporterWithCondition, ModItemTags.MOSSY_CHERRY_WOOD, 1, ModItems.MOSSY_CHERRY_PLANKS, 4);
//        createCarpentryRecipe(exporterWithCondition, ModItemTags.MOSSY_CHERRY_WOOD, 1, ModItems.MOSSY_CHERRY_BUTTON, 16);
//        createCarpentryRecipe(exporterWithCondition, ModItemTags.MOSSY_CHERRY_WOOD, 1, ModItems.MOSSY_CHERRY_DOOR, 4);
//        createCarpentryRecipe(exporterWithCondition, ModItemTags.MOSSY_CHERRY_WOOD, 1, ModItems.MOSSY_CHERRY_FENCE_GATE, 4);
//        createCarpentryRecipe(exporterWithCondition, ModItemTags.MOSSY_CHERRY_WOOD, 1, ModItems.MOSSY_CHERRY_FENCE, 4);
//        createCarpentryRecipe(exporterWithCondition, ModItemTags.MOSSY_CHERRY_WOOD, 1, ModItems.MOSSY_CHERRY_PRESSURE_PLATE, 16);
//        createCarpentryRecipe(exporterWithCondition, ModItemTags.MOSSY_CHERRY_WOOD, 1, ModItems.MOSSY_CHERRY_SLAB, 8);
//        createCarpentryRecipe(exporterWithCondition, ModItemTags.MOSSY_CHERRY_WOOD, 1, ModItems.MOSSY_CHERRY_STAIRS, 4);
//        createCarpentryRecipe(exporterWithCondition, ModItemTags.MOSSY_CHERRY_WOOD, 1, ModItems.MOSSY_CHERRY_TRAPDOOR, 8);
//
//        createCarpentryRecipe(exporterWithCondition, Pair.of(ModBlocks.MOSSY_CHERRY_PLANKS, 1), ModItems.MOSSY_CHERRY_BUTTON, 4);
//        createCarpentryRecipe(exporterWithCondition, Pair.of(ModBlocks.MOSSY_CHERRY_PLANKS, 2), ModItems.MOSSY_CHERRY_DOOR, 2);
//        createCarpentryRecipe(exporterWithCondition, Pair.of(ModBlocks.MOSSY_CHERRY_PLANKS, 1), ModItems.MOSSY_CHERRY_FENCE_GATE, 1);
//        createCarpentryRecipe(exporterWithCondition, Pair.of(ModBlocks.MOSSY_CHERRY_PLANKS, 1), ModItems.MOSSY_CHERRY_FENCE, 1);
//        createCarpentryRecipe(exporterWithCondition, Pair.of(ModBlocks.MOSSY_CHERRY_PLANKS, 1), ModItems.MOSSY_CHERRY_PRESSURE_PLATE, 4);
//        createCarpentryRecipe(exporterWithCondition, Pair.of(ModBlocks.MOSSY_CHERRY_PLANKS, 1), ModItems.MOSSY_CHERRY_SLAB, 2);
//        createCarpentryRecipe(exporterWithCondition, Pair.of(ModBlocks.MOSSY_CHERRY_PLANKS, 1), ModItems.MOSSY_CHERRY_STAIRS, 1);
//        createCarpentryRecipe(exporterWithCondition, Pair.of(ModBlocks.MOSSY_CHERRY_PLANKS, 1), ModItems.MOSSY_CHERRY_TRAPDOOR, 2);
//
//        createCarpentryRecipe(exporterWithCondition, Pair.of(ModBlocks.MOSSY_BAMBOO_BLOCK, 1), ModItems.MOSSY_BAMBOO_PLANKS, 4);
//        createCarpentryRecipe(exporterWithCondition, Pair.of(ModBlocks.MOSSY_BAMBOO_BLOCK, 1), ModItems.MOSSY_BAMBOO_MOSAIC, 4);
//        createCarpentryRecipe(exporterWithCondition, Pair.of(ModBlocks.MOSSY_BAMBOO_BLOCK, 1), ModItems.MOSSY_BAMBOO_BUTTON, 16);
//        createCarpentryRecipe(exporterWithCondition, Pair.of(ModBlocks.MOSSY_BAMBOO_BLOCK, 1), ModItems.MOSSY_BAMBOO_DOOR, 4);
//        createCarpentryRecipe(exporterWithCondition, Pair.of(ModBlocks.MOSSY_BAMBOO_BLOCK, 1), ModItems.MOSSY_BAMBOO_FENCE_GATE, 4);
//        createCarpentryRecipe(exporterWithCondition, Pair.of(ModBlocks.MOSSY_BAMBOO_BLOCK, 1), ModItems.MOSSY_BAMBOO_FENCE, 4);
//        createCarpentryRecipe(exporterWithCondition, Pair.of(ModBlocks.MOSSY_BAMBOO_BLOCK, 1), ModItems.MOSSY_BAMBOO_PRESSURE_PLATE, 16);
//        createCarpentryRecipe(exporterWithCondition, Pair.of(ModBlocks.MOSSY_BAMBOO_BLOCK, 1), ModItems.MOSSY_BAMBOO_SLAB, 8);
//        createCarpentryRecipe(exporterWithCondition, Pair.of(ModBlocks.MOSSY_BAMBOO_BLOCK, 1), ModItems.MOSSY_BAMBOO_MOSAIC_SLAB, 8);
//        createCarpentryRecipe(exporterWithCondition, Pair.of(ModBlocks.MOSSY_BAMBOO_BLOCK, 1), ModItems.MOSSY_BAMBOO_STAIRS, 4);
//        createCarpentryRecipe(exporterWithCondition, Pair.of(ModBlocks.MOSSY_BAMBOO_BLOCK, 1), ModItems.MOSSY_BAMBOO_MOSAIC_STAIRS, 4);
//        createCarpentryRecipe(exporterWithCondition, Pair.of(ModBlocks.MOSSY_BAMBOO_BLOCK, 1), ModItems.MOSSY_BAMBOO_TRAPDOOR, 8);
//
//        createCarpentryRecipe(exporterWithCondition, Pair.of(ModBlocks.MOSSY_BAMBOO_PLANKS, 1), ModItems.MOSSY_BAMBOO_MOSAIC, 1);
//        createCarpentryRecipe(exporterWithCondition, Pair.of(ModBlocks.MOSSY_BAMBOO_PLANKS, 1), ModItems.MOSSY_BAMBOO_BUTTON, 4);
//        createCarpentryRecipe(exporterWithCondition, Pair.of(ModBlocks.MOSSY_BAMBOO_PLANKS, 2), ModItems.MOSSY_BAMBOO_DOOR, 2);
//        createCarpentryRecipe(exporterWithCondition, Pair.of(ModBlocks.MOSSY_BAMBOO_PLANKS, 1), ModItems.MOSSY_BAMBOO_FENCE_GATE, 1);
//        createCarpentryRecipe(exporterWithCondition, Pair.of(ModBlocks.MOSSY_BAMBOO_PLANKS, 1), ModItems.MOSSY_BAMBOO_FENCE, 1);
//        createCarpentryRecipe(exporterWithCondition, Pair.of(ModBlocks.MOSSY_BAMBOO_PLANKS, 1), ModItems.MOSSY_BAMBOO_PRESSURE_PLATE, 4);
//        createCarpentryRecipe(exporterWithCondition, Pair.of(ModBlocks.MOSSY_BAMBOO_PLANKS, 1), ModItems.MOSSY_BAMBOO_SLAB, 2);
//        createCarpentryRecipe(exporterWithCondition, Pair.of(ModBlocks.MOSSY_BAMBOO_PLANKS, 1), ModItems.MOSSY_BAMBOO_MOSAIC_SLAB, 2);
//        createCarpentryRecipe(exporterWithCondition, Pair.of(ModBlocks.MOSSY_BAMBOO_PLANKS, 1), ModItems.MOSSY_BAMBOO_STAIRS, 1);
//        createCarpentryRecipe(exporterWithCondition, Pair.of(ModBlocks.MOSSY_BAMBOO_PLANKS, 1), ModItems.MOSSY_BAMBOO_MOSAIC_STAIRS, 1);
//        createCarpentryRecipe(exporterWithCondition, Pair.of(ModBlocks.MOSSY_BAMBOO_PLANKS, 1), ModItems.MOSSY_BAMBOO_TRAPDOOR, 2);
//
//        createCarpentryRecipe(exporterWithCondition, Pair.of(ModBlocks.MOSSY_BAMBOO_MOSAIC, 1), ModItems.MOSSY_BAMBOO_MOSAIC_SLAB, 2);
//        createCarpentryRecipe(exporterWithCondition, Pair.of(ModBlocks.MOSSY_BAMBOO_MOSAIC, 1), ModItems.MOSSY_BAMBOO_MOSAIC_STAIRS, 1);
//
//        createCarpentryRecipe(exporterWithCondition, ModItemTags.MOSSY_CRIMSON_WOOD, 1, ModItems.MOSSY_CRIMSON_PLANKS, 4);
//        createCarpentryRecipe(exporterWithCondition, ModItemTags.MOSSY_CRIMSON_WOOD, 1, ModItems.MOSSY_CRIMSON_BUTTON, 16);
//        createCarpentryRecipe(exporterWithCondition, ModItemTags.MOSSY_CRIMSON_WOOD, 1, ModItems.MOSSY_CRIMSON_DOOR, 4);
//        createCarpentryRecipe(exporterWithCondition, ModItemTags.MOSSY_CRIMSON_WOOD, 1, ModItems.MOSSY_CRIMSON_FENCE_GATE, 4);
//        createCarpentryRecipe(exporterWithCondition, ModItemTags.MOSSY_CRIMSON_WOOD, 1, ModItems.MOSSY_CRIMSON_FENCE, 4);
//        createCarpentryRecipe(exporterWithCondition, ModItemTags.MOSSY_CRIMSON_WOOD, 1, ModItems.MOSSY_CRIMSON_PRESSURE_PLATE, 16);
//        createCarpentryRecipe(exporterWithCondition, ModItemTags.MOSSY_CRIMSON_WOOD, 1, ModItems.MOSSY_CRIMSON_SLAB, 8);
//        createCarpentryRecipe(exporterWithCondition, ModItemTags.MOSSY_CRIMSON_WOOD, 1, ModItems.MOSSY_CRIMSON_STAIRS, 4);
//        createCarpentryRecipe(exporterWithCondition, ModItemTags.MOSSY_CRIMSON_WOOD, 1, ModItems.MOSSY_CRIMSON_TRAPDOOR, 8);
//
//        createCarpentryRecipe(exporterWithCondition, Pair.of(ModBlocks.MOSSY_CRIMSON_PLANKS, 1), ModItems.MOSSY_CRIMSON_BUTTON, 4);
//        createCarpentryRecipe(exporterWithCondition, Pair.of(ModBlocks.MOSSY_CRIMSON_PLANKS, 2), ModItems.MOSSY_CRIMSON_DOOR, 2);
//        createCarpentryRecipe(exporterWithCondition, Pair.of(ModBlocks.MOSSY_CRIMSON_PLANKS, 1), ModItems.MOSSY_CRIMSON_FENCE_GATE, 1);
//        createCarpentryRecipe(exporterWithCondition, Pair.of(ModBlocks.MOSSY_CRIMSON_PLANKS, 1), ModItems.MOSSY_CRIMSON_FENCE, 1);
//        createCarpentryRecipe(exporterWithCondition, Pair.of(ModBlocks.MOSSY_CRIMSON_PLANKS, 1), ModItems.MOSSY_CRIMSON_PRESSURE_PLATE, 4);
//        createCarpentryRecipe(exporterWithCondition, Pair.of(ModBlocks.MOSSY_CRIMSON_PLANKS, 1), ModItems.MOSSY_CRIMSON_SLAB, 2);
//        createCarpentryRecipe(exporterWithCondition, Pair.of(ModBlocks.MOSSY_CRIMSON_PLANKS, 1), ModItems.MOSSY_CRIMSON_STAIRS, 1);
//        createCarpentryRecipe(exporterWithCondition, Pair.of(ModBlocks.MOSSY_CRIMSON_PLANKS, 1), ModItems.MOSSY_CRIMSON_TRAPDOOR, 2);
//
//        createCarpentryRecipe(exporterWithCondition, ModItemTags.MOSSY_WARPED_WOOD, 1, ModItems.MOSSY_WARPED_PLANKS, 4);
//        createCarpentryRecipe(exporterWithCondition, ModItemTags.MOSSY_WARPED_WOOD, 1, ModItems.MOSSY_WARPED_BUTTON, 16);
//        createCarpentryRecipe(exporterWithCondition, ModItemTags.MOSSY_WARPED_WOOD, 1, ModItems.MOSSY_WARPED_DOOR, 4);
//        createCarpentryRecipe(exporterWithCondition, ModItemTags.MOSSY_WARPED_WOOD, 1, ModItems.MOSSY_WARPED_FENCE_GATE, 4);
//        createCarpentryRecipe(exporterWithCondition, ModItemTags.MOSSY_WARPED_WOOD, 1, ModItems.MOSSY_WARPED_FENCE, 4);
//        createCarpentryRecipe(exporterWithCondition, ModItemTags.MOSSY_WARPED_WOOD, 1, ModItems.MOSSY_WARPED_PRESSURE_PLATE, 16);
//        createCarpentryRecipe(exporterWithCondition, ModItemTags.MOSSY_WARPED_WOOD, 1, ModItems.MOSSY_WARPED_SLAB, 8);
//        createCarpentryRecipe(exporterWithCondition, ModItemTags.MOSSY_WARPED_WOOD, 1, ModItems.MOSSY_WARPED_STAIRS, 4);
//        createCarpentryRecipe(exporterWithCondition, ModItemTags.MOSSY_WARPED_WOOD, 1, ModItems.MOSSY_WARPED_TRAPDOOR, 8);
//
//        createCarpentryRecipe(exporterWithCondition, Pair.of(ModBlocks.MOSSY_WARPED_PLANKS, 1), ModItems.MOSSY_WARPED_BUTTON, 4);
//        createCarpentryRecipe(exporterWithCondition, Pair.of(ModBlocks.MOSSY_WARPED_PLANKS, 2), ModItems.MOSSY_WARPED_DOOR, 2);
//        createCarpentryRecipe(exporterWithCondition, Pair.of(ModBlocks.MOSSY_WARPED_PLANKS, 1), ModItems.MOSSY_WARPED_FENCE_GATE, 1);
//        createCarpentryRecipe(exporterWithCondition, Pair.of(ModBlocks.MOSSY_WARPED_PLANKS, 1), ModItems.MOSSY_WARPED_FENCE, 1);
//        createCarpentryRecipe(exporterWithCondition, Pair.of(ModBlocks.MOSSY_WARPED_PLANKS, 1), ModItems.MOSSY_WARPED_PRESSURE_PLATE, 4);
//        createCarpentryRecipe(exporterWithCondition, Pair.of(ModBlocks.MOSSY_WARPED_PLANKS, 1), ModItems.MOSSY_WARPED_SLAB, 2);
//        createCarpentryRecipe(exporterWithCondition, Pair.of(ModBlocks.MOSSY_WARPED_PLANKS, 1), ModItems.MOSSY_WARPED_STAIRS, 1);
//        createCarpentryRecipe(exporterWithCondition, Pair.of(ModBlocks.MOSSY_WARPED_PLANKS, 1), ModItems.MOSSY_WARPED_TRAPDOOR, 2);
//    }
//
//    private void createMoreComposterVariantsRecipes(RecipeExporter exporter) {
//        RecipeExporter exporterWithCondition = withConditions(exporter, ResourceConditions.allModsLoaded("lolmcmv"));
//        createCarpentryRecipe(exporterWithCondition, ItemTags.ACACIA_LOGS, 1, McmvItemInit.ACACIA_COMPOSTER_I, 4);
//        createCarpentryRecipe(exporterWithCondition, Pair.of(Blocks.ACACIA_PLANKS, 1), McmvItemInit.ACACIA_COMPOSTER_I, 1);
//        createCarpentryRecipe(exporterWithCondition, ItemTags.BAMBOO_BLOCKS, 1, McmvItemInit.BAMBOO_COMPOSTER_I, 4);
//        createCarpentryRecipe(exporterWithCondition, Pair.of(Blocks.BAMBOO_PLANKS, 1), McmvItemInit.BAMBOO_COMPOSTER_I, 1);
//        createCarpentryRecipe(exporterWithCondition, ItemTags.BIRCH_LOGS, 1, McmvItemInit.BIRCH_COMPOSTER_I, 4);
//        createCarpentryRecipe(exporterWithCondition, Pair.of(Blocks.BIRCH_PLANKS, 1), McmvItemInit.BIRCH_COMPOSTER_I, 1);
//        createCarpentryRecipe(exporterWithCondition, ItemTags.CHERRY_LOGS, 1, McmvItemInit.CHERRY_COMPOSTER_I, 4);
//        createCarpentryRecipe(exporterWithCondition, Pair.of(Blocks.CHERRY_PLANKS, 1), McmvItemInit.CHERRY_COMPOSTER_I, 1);
//        createCarpentryRecipe(exporterWithCondition, ItemTags.CRIMSON_STEMS, 1, McmvItemInit.CRIMSON_COMPOSTER_I, 4);
//        createCarpentryRecipe(exporterWithCondition, Pair.of(Blocks.CRIMSON_PLANKS, 1), McmvItemInit.CRIMSON_COMPOSTER_I, 1);
//        createCarpentryRecipe(exporterWithCondition, ItemTags.DARK_OAK_LOGS, 1, McmvItemInit.DARK_OAK_COMPOSTER_I, 4);
//        createCarpentryRecipe(exporterWithCondition, Pair.of(Blocks.DARK_OAK_PLANKS, 1), McmvItemInit.DARK_OAK_COMPOSTER_I, 1);
//        createCarpentryRecipe(exporterWithCondition, ItemTags.JUNGLE_LOGS, 1, McmvItemInit.JUNGLE_COMPOSTER_I, 4);
//        createCarpentryRecipe(exporterWithCondition, Pair.of(Blocks.JUNGLE_PLANKS, 1), McmvItemInit.JUNGLE_COMPOSTER_I, 1);
//        createCarpentryRecipe(exporterWithCondition, ItemTags.MANGROVE_LOGS, 1, McmvItemInit.MANGROVE_COMPOSTER_I, 4);
//        createCarpentryRecipe(exporterWithCondition, Pair.of(Blocks.MANGROVE_PLANKS, 1), McmvItemInit.MANGROVE_COMPOSTER_I, 1);
//        createCarpentryRecipe(exporterWithCondition, ItemTags.OAK_LOGS, 1, McmvItemInit.OAK_COMPOSTER_I, 4);
//        createCarpentryRecipe(exporterWithCondition, Pair.of(Blocks.OAK_PLANKS, 1), McmvItemInit.OAK_COMPOSTER_I, 1);
//        createCarpentryRecipe(exporterWithCondition, ItemTags.SPRUCE_LOGS, 1, McmvItemInit.SPRUCE_COMPOSTER_I, 4);
//        createCarpentryRecipe(exporterWithCondition, Pair.of(Blocks.SPRUCE_PLANKS, 1), McmvItemInit.SPRUCE_COMPOSTER_I, 1);
//        createCarpentryRecipe(exporterWithCondition, ItemTags.WARPED_STEMS, 1, McmvItemInit.WARPED_COMPOSTER_I, 4);
//        createCarpentryRecipe(exporterWithCondition, Pair.of(Blocks.WARPED_PLANKS, 1), McmvItemInit.WARPED_COMPOSTER_I, 1);
//    }
//
//    private void createMoreCraftingTablesRecipes(RecipeExporter exporter) {
//        RecipeExporter exporterWithCondition = withConditions(exporter, ResourceConditions.allModsLoaded("lolmct"));
//        createCarpentryRecipe(exporterWithCondition, ItemTags.ACACIA_LOGS, 1, MctItemInit.ACACIA_TABLE_I, 4);
//        createCarpentryRecipe(exporterWithCondition, Pair.of(Blocks.ACACIA_PLANKS, 1), MctItemInit.ACACIA_TABLE_I, 1);
//        createCarpentryRecipe(exporterWithCondition, ItemTags.BAMBOO_BLOCKS, 1, MctItemInit.BAMBOO_TABLE_I, 4);
//        createCarpentryRecipe(exporterWithCondition, Pair.of(Blocks.BAMBOO_PLANKS, 1), MctItemInit.BAMBOO_TABLE_I, 1);
//        createCarpentryRecipe(exporterWithCondition, ItemTags.BIRCH_LOGS, 1, MctItemInit.BIRCH_TABLE_I, 4);
//        createCarpentryRecipe(exporterWithCondition, Pair.of(Blocks.BIRCH_PLANKS, 1), MctItemInit.BIRCH_TABLE_I, 1);
//        createCarpentryRecipe(exporterWithCondition, ItemTags.CHERRY_LOGS, 1, MctItemInit.CHERRY_TABLE_I, 4);
//        createCarpentryRecipe(exporterWithCondition, Pair.of(Blocks.CHERRY_PLANKS, 1), MctItemInit.CHERRY_TABLE_I, 1);
//        createCarpentryRecipe(exporterWithCondition, ItemTags.CRIMSON_STEMS, 1, MctItemInit.CRIMSON_TABLE_I, 4);
//        createCarpentryRecipe(exporterWithCondition, Pair.of(Blocks.CRIMSON_PLANKS, 1), MctItemInit.CRIMSON_TABLE_I, 1);
//        createCarpentryRecipe(exporterWithCondition, ItemTags.DARK_OAK_LOGS, 1, MctItemInit.DARK_OAK_TABLE_I, 4);
//        createCarpentryRecipe(exporterWithCondition, Pair.of(Blocks.DARK_OAK_PLANKS, 1), MctItemInit.DARK_OAK_TABLE_I, 1);
//        createCarpentryRecipe(exporterWithCondition, ItemTags.JUNGLE_LOGS, 1, MctItemInit.JUNGLE_TABLE_I, 4);
//        createCarpentryRecipe(exporterWithCondition, Pair.of(Blocks.JUNGLE_PLANKS, 1), MctItemInit.JUNGLE_TABLE_I, 1);
//        createCarpentryRecipe(exporterWithCondition, ItemTags.MANGROVE_LOGS, 1, MctItemInit.MANGROVE_TABLE_I, 4);
//        createCarpentryRecipe(exporterWithCondition, Pair.of(Blocks.MANGROVE_PLANKS, 1), MctItemInit.MANGROVE_TABLE_I, 1);
//        createCarpentryRecipe(exporterWithCondition, ItemTags.SPRUCE_LOGS, 1, MctItemInit.SPRUCE_TABLE_I, 4);
//        createCarpentryRecipe(exporterWithCondition, Pair.of(Blocks.SPRUCE_PLANKS, 1), MctItemInit.SPRUCE_TABLE_I, 1);
//        createCarpentryRecipe(exporterWithCondition, ItemTags.WARPED_STEMS, 1, MctItemInit.WARPED_TABLE_I, 4);
//        createCarpentryRecipe(exporterWithCondition, Pair.of(Blocks.WARPED_PLANKS, 1), MctItemInit.WARPED_TABLE_I, 1);
//    }
//
//    private void createMoreChestVariantsRecipes(RecipeExporter exporter) {
//        RecipeExporter exporterWithCondition = withConditions(exporter, ResourceConditions.allModsLoaded("lolmcv"));
//        createCarpentryRecipe(exporterWithCondition, ItemTags.ACACIA_LOGS, 1, McvItemInit.ACACIA_CHEST_I, 1);
//        createCarpentryRecipe(exporterWithCondition, Pair.of(Blocks.ACACIA_PLANKS, 4), McvItemInit.ACACIA_CHEST_I, 1);
//        createCarpentryRecipe(exporterWithCondition, ItemTags.BAMBOO_BLOCKS, 1, McvItemInit.BAMBOO_CHEST_I, 1);
//        createCarpentryRecipe(exporterWithCondition, Pair.of(Blocks.BAMBOO_PLANKS, 4), McvItemInit.BAMBOO_CHEST_I, 1);
//        createCarpentryRecipe(exporterWithCondition, ItemTags.BIRCH_LOGS, 1, McvItemInit.BIRCH_CHEST_I, 1);
//        createCarpentryRecipe(exporterWithCondition, Pair.of(Blocks.BIRCH_PLANKS, 4), McvItemInit.BIRCH_CHEST_I, 1);
//        createCarpentryRecipe(exporterWithCondition, ItemTags.CHERRY_LOGS, 1, McvItemInit.CHERRY_CHEST_I, 1);
//        createCarpentryRecipe(exporterWithCondition, Pair.of(Blocks.CHERRY_PLANKS, 4), McvItemInit.CHERRY_CHEST_I, 1);
//        createCarpentryRecipe(exporterWithCondition, ItemTags.CRIMSON_STEMS, 1, McvItemInit.CRIMSON_CHEST_I, 1);
//        createCarpentryRecipe(exporterWithCondition, Pair.of(Blocks.CRIMSON_PLANKS, 4), McvItemInit.CRIMSON_CHEST_I, 1);
//        createCarpentryRecipe(exporterWithCondition, ItemTags.DARK_OAK_LOGS, 1, McvItemInit.DARK_OAK_CHEST_I, 1);
//        createCarpentryRecipe(exporterWithCondition, Pair.of(Blocks.DARK_OAK_PLANKS, 4), McvItemInit.DARK_OAK_CHEST_I, 1);
//        createCarpentryRecipe(exporterWithCondition, ItemTags.JUNGLE_LOGS, 1, McvItemInit.JUNGLE_CHEST_I, 1);
//        createCarpentryRecipe(exporterWithCondition, Pair.of(Blocks.JUNGLE_PLANKS, 4), McvItemInit.JUNGLE_CHEST_I, 1);
//        createCarpentryRecipe(exporterWithCondition, ItemTags.MANGROVE_LOGS, 1, McvItemInit.MANGROVE_CHEST_I, 1);
//        createCarpentryRecipe(exporterWithCondition, Pair.of(Blocks.MANGROVE_PLANKS, 4), McvItemInit.MANGROVE_CHEST_I, 1);
//        createCarpentryRecipe(exporterWithCondition, ItemTags.OAK_LOGS, 1, McvItemInit.OAK_CHEST_I, 1);
//        createCarpentryRecipe(exporterWithCondition, Pair.of(Blocks.OAK_PLANKS, 4), McvItemInit.OAK_CHEST_I, 1);
//        createCarpentryRecipe(exporterWithCondition, ItemTags.SPRUCE_LOGS, 1, McvItemInit.SPRUCE_CHEST_I, 1);
//        createCarpentryRecipe(exporterWithCondition, Pair.of(Blocks.SPRUCE_PLANKS, 4), McvItemInit.SPRUCE_CHEST_I, 1);
//        createCarpentryRecipe(exporterWithCondition, ItemTags.WARPED_STEMS, 1, McvItemInit.WARPED_CHEST_I, 1);
//        createCarpentryRecipe(exporterWithCondition, Pair.of(Blocks.WARPED_PLANKS, 4), McvItemInit.WARPED_CHEST_I, 1);
//    }
//
//    private void createMoreBarrelVariantsRecipes(RecipeExporter exporter) {
//        RecipeExporter exporterWithCondition = withConditions(exporter, ResourceConditions.allModsLoaded("lolmblv"));
//        createCarpentryRecipe(exporterWithCondition, ItemTags.ACACIA_LOGS, 1, MblvItemInit.ACACIA_BARREL_I, 1);
//        createCarpentryRecipe(exporterWithCondition, Pair.of(Blocks.ACACIA_PLANKS, 4), MblvItemInit.ACACIA_BARREL_I, 1);
//        createCarpentryRecipe(exporterWithCondition, ItemTags.BAMBOO_BLOCKS, 1, MblvItemInit.BAMBOO_BARREL_I, 1);
//        createCarpentryRecipe(exporterWithCondition, Pair.of(Blocks.BAMBOO_PLANKS, 4), MblvItemInit.BAMBOO_BARREL_I, 1);
//        createCarpentryRecipe(exporterWithCondition, ItemTags.BIRCH_LOGS, 1, MblvItemInit.BIRCH_BARREL_I, 1);
//        createCarpentryRecipe(exporterWithCondition, Pair.of(Blocks.BIRCH_PLANKS, 4), MblvItemInit.BIRCH_BARREL_I, 1);
//        createCarpentryRecipe(exporterWithCondition, ItemTags.CHERRY_LOGS, 1, MblvItemInit.CHERRY_BARREL_I, 1);
//        createCarpentryRecipe(exporterWithCondition, Pair.of(Blocks.CHERRY_PLANKS, 4), MblvItemInit.CHERRY_BARREL_I, 1);
//        createCarpentryRecipe(exporterWithCondition, ItemTags.CRIMSON_STEMS, 1, MblvItemInit.CRIMSON_BARREL_I, 1);
//        createCarpentryRecipe(exporterWithCondition, Pair.of(Blocks.CRIMSON_PLANKS, 4), MblvItemInit.CRIMSON_BARREL_I, 1);
//        createCarpentryRecipe(exporterWithCondition, ItemTags.DARK_OAK_LOGS, 1, MblvItemInit.DARK_OAK_BARREL_I, 1);
//        createCarpentryRecipe(exporterWithCondition, Pair.of(Blocks.DARK_OAK_PLANKS, 4), MblvItemInit.DARK_OAK_BARREL_I, 1);
//        createCarpentryRecipe(exporterWithCondition, ItemTags.JUNGLE_LOGS, 1, MblvItemInit.JUNGLE_BARREL_I, 1);
//        createCarpentryRecipe(exporterWithCondition, Pair.of(Blocks.JUNGLE_PLANKS, 4), MblvItemInit.JUNGLE_BARREL_I, 1);
//        createCarpentryRecipe(exporterWithCondition, ItemTags.MANGROVE_LOGS, 1, MblvItemInit.MANGROVE_BARREL_I, 1);
//        createCarpentryRecipe(exporterWithCondition, Pair.of(Blocks.MANGROVE_PLANKS, 4), MblvItemInit.MANGROVE_BARREL_I, 1);
//        createCarpentryRecipe(exporterWithCondition, ItemTags.OAK_LOGS, 1, MblvItemInit.OAK_BARREL_I, 1);
//        createCarpentryRecipe(exporterWithCondition, Pair.of(Blocks.OAK_PLANKS, 4), MblvItemInit.OAK_BARREL_I, 1);
//        createCarpentryRecipe(exporterWithCondition, ItemTags.WARPED_STEMS, 1, MblvItemInit.WARPED_BARREL_I, 1);
//        createCarpentryRecipe(exporterWithCondition, Pair.of(Blocks.WARPED_PLANKS, 4), MblvItemInit.WARPED_BARREL_I, 1);
//    }
//}
