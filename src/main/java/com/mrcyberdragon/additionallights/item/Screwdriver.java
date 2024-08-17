package com.mrcyberdragon.additionallights.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

public class Screwdriver extends Item {

    public Screwdriver(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public int getMaxDamage(ItemStack stack) {
        return 238;
    }
}
