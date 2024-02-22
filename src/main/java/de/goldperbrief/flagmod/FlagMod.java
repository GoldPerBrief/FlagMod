package de.goldperbrief.flagmod;

import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.ModInitializer;
import org.quiltmc.qsl.block.extensions.api.QuiltBlockSettings;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FlagMod implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod name as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger("Flag Mod");
	public static final Block FLAG_BLOCK = new Block(QuiltBlockSettings.create().strength(4.0f));

	@Override
	public void onInitialize(ModContainer mod) {
		LOGGER.info("Hello Quilt world from {}!", mod.metadata().name());
		Registry.register(Registries.BLOCK, new Identifier("flag_mod", "flag_block"), FLAG_BLOCK);
		Registry.register(Registries.ITEM, new Identifier("flag_mod", "flag_block"), new BlockItem(FLAG_BLOCK, new Item.Settings()));
	}
}
