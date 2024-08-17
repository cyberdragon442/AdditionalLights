package com.mrcyberdragon.additionallights.init;

import com.mrcyberdragon.additionallights.AdditionalLights;
import com.mrcyberdragon.additionallights.item.Screwdriver;
import com.tterrag.registrate.util.entry.ItemEntry;

public class ModItems {

    static {
        AdditionalLights.REGISTRATE.setCreativeTab(ModCreativeTab.ADDITIONAL_LIGHTS_TAB);
    }

    public static final ItemEntry<Screwdriver> YET_ANOTHER_SCREWDRIVER = AdditionalLights.REGISTRATE.item("yet_another_screwdriver", Screwdriver::new)
            .register();

    public static void register() {

    }
}
