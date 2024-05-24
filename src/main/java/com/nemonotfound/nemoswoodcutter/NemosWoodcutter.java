package com.nemonotfound.nemoswoodcutter;

import com.nemonotfound.nemoswoodcutter.recipe.ModRecipeSerializer;
import com.nemonotfound.nemoswoodcutter.recipe.ModRecipeTypes;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NemosWoodcutter implements ModInitializer {

	public static final String MOD_ID = "nemos-woodcutter";
    public static final Logger log = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		log.info("Thank you for using Nemo's Woodcutter!");

		ModRecipeTypes.registerRecipeTypes();
		ModRecipeSerializer.registerRecipeSerializer();
	}
}