package com.nemonotfound.nemoswoodcutter;

import com.nemonotfound.nemoswoodcutter.datagen.BiomesOPlentyRecipeProvider;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class NemosWoodcutterDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

		pack.addProvider(BiomesOPlentyRecipeProvider::new);
	}
}
