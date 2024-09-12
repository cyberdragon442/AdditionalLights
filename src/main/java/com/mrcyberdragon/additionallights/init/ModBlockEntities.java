package com.mrcyberdragon.additionallights.init;

import com.mrcyberdragon.additionallights.AdditionalLights;
import com.mrcyberdragon.additionallights.block.*;
import com.mrh0.createaddition.blocks.connector.base.ConnectorRenderer;
import com.tterrag.registrate.util.entry.BlockEntityEntry;

public class ModBlockEntities {

    public static final BlockEntityEntry<SmallLightWithReflectorEntity> SMALL_LIGHT_WITH_REFLECTOR = AdditionalLights.REGISTRATE
            .blockEntity("small_light_with_reflector", SmallLightWithReflectorEntity::new)
            .validBlocks(ModBlocks.SMALL_LIGHT_WITH_REFLECTOR)
            .renderer(() -> ConnectorRenderer::new)
            .register();
    public static final BlockEntityEntry<SmallCageLightEntity> SMALL_CAGE_LIGHT = AdditionalLights.REGISTRATE
            .blockEntity("small_cage_light", SmallCageLightEntity::new)
            .validBlocks(ModBlocks.SMALL_CAGE_LIGHT)
            .renderer(() -> ConnectorRenderer::new)
            .register();
    public static final BlockEntityEntry<SmallTubeLightEntity> SMALL_TUBE_LIGHT = AdditionalLights.REGISTRATE
            .blockEntity("small_tube_light", SmallTubeLightEntity::new)
            .validBlocks(ModBlocks.SMALL_TUBE_LIGHT)
            .renderer(() -> ConnectorRenderer::new)
            .register();
    public static final BlockEntityEntry<SkinnyTubeLightEntity> SKINNY_TUBE_LIGHT = AdditionalLights.REGISTRATE
            .blockEntity("skinny_tube_light", SkinnyTubeLightEntity::new)
            .validBlocks(ModBlocks.SKINNY_TUBE_LIGHT)
            .renderer(() -> ConnectorRenderer::new)
            .register();
    public static final BlockEntityEntry<SmallHeadlightEntity> SMALL_HEADLIGHT = AdditionalLights.REGISTRATE
            .blockEntity("small_headlight", SmallHeadlightEntity::new)
            .validBlocks(ModBlocks.SMALL_HEADLIGHT)
            .renderer(() -> ConnectorRenderer::new)
            .register();
    public static final BlockEntityEntry<SmallArmoredLightEntity> SMALL_ARMORED_LIGHT = AdditionalLights.REGISTRATE
            .blockEntity("small_armored_light", SmallArmoredLightEntity::new)
            .validBlocks(ModBlocks.SMALL_ARMORED_LIGHT)
            .renderer(() -> ConnectorRenderer::new)
            .register();
    public static final BlockEntityEntry<SmallGreenSconceEntity> SMALL_GREEN_SCONCE = AdditionalLights.REGISTRATE
            .blockEntity("small_green_sconce", SmallGreenSconceEntity::new)
            .validBlocks(ModBlocks.SMALL_GREEN_SCONCE)
            .renderer(() -> ConnectorRenderer::new)
            .register();
    public static final BlockEntityEntry<SmallEdisonBulbEntity> SMALL_EDISON_BULB = AdditionalLights.REGISTRATE
            .blockEntity("small_edison_bulb", SmallEdisonBulbEntity::new)
            .validBlocks(ModBlocks.SMALL_EDISON_BULB)
            .renderer(() -> ConnectorRenderer::new)
            .register();

    public static void register() {}
}
