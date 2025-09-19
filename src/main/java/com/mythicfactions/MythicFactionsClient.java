package com.mythicfactions;

import net.fabricmc.api.ClientModInitializer;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class MythicFactionsClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        GeoArmorRenderer.registerRenderer(BakuHelmetItem.class, BakuHelmetRenderer::new);
    }
}
