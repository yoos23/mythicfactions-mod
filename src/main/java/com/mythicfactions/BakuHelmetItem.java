package com.mythicfactions;

import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterials;
import software.bernie.geckolib.item.GeoArmorItem;

public class BakuHelmetItem extends GeoArmorItem {
    public BakuHelmetItem() {
        super(ArmorMaterials.NETHERITE, ArmorItem.Type.HELMET, new Settings());
    }
}
