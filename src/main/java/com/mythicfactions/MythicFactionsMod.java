package com.mythicfactions;

import net.fabricmc.api.ModInitializer;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import software.bernie.geckolib.GeckoLib;

public class MythicFactionsMod implements ModInitializer {

    public static final String MODID = "mythicfactions";

    public static final BakuHelmetItem BAKU_HELMET = new BakuHelmetItem();

    @Override
    public void onInitialize() {
        GeckoLib.initialize();

        Registry.register(Registries.ITEM, new Identifier(MODID, "baku_helmet"), BAKU_HELMET);
    }
}
