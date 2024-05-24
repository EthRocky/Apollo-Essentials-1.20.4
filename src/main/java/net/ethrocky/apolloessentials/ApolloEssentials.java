package net.ethrocky.apolloessentials;

import net.ethrocky.apolloessentials.util.ModRegistries;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ApolloEssentials implements ModInitializer {

	public static final String MOD_ID = "apollo-essentials";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModRegistries.registerModStuffs();

		LOGGER.info("Hello Mr. Stark");
	}
}