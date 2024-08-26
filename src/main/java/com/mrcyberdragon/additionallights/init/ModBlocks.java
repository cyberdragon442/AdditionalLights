package com.mrcyberdragon.additionallights.init;

import com.mrcyberdragon.additionallights.AdditionalLights;
import com.mrcyberdragon.additionallights.block.*;
import com.mrh0.createaddition.energy.NodeMovementBehaviour;
import com.simibubi.create.AllMovementBehaviours;
import com.simibubi.create.foundation.data.SharedProperties;
import com.tterrag.registrate.util.entry.BlockEntry;
import static com.simibubi.create.foundation.data.ModelGen.customItemModel;

public class ModBlocks {

    static {
        AdditionalLights.REGISTRATE.setCreativeTab(ModCreativeTab.ADDITIONAL_LIGHTS_TAB);
    }

    public static final BlockEntry<SmallLightWithReflector> SMALL_LIGHT_WITH_REFLECTOR = AdditionalLights.REGISTRATE.block("small_light_with_reflector",  SmallLightWithReflector::new)
            .initialProperties(SharedProperties::stone)
            .onRegister(AllMovementBehaviours.movementBehaviour(new NodeMovementBehaviour()))
            .item()
            .transform(customItemModel())
            .register();
    public static final BlockEntry<SmallCageLight> SMALL_CAGE_LIGHT = AdditionalLights.REGISTRATE.block("small_cage_light",  SmallCageLight::new)
            .initialProperties(SharedProperties::stone)
            .onRegister(AllMovementBehaviours.movementBehaviour(new NodeMovementBehaviour()))
            .item()
            .transform(customItemModel())
            .register();
    public static final BlockEntry<SmallTubeLight> SMALL_TUBE_LIGHT = AdditionalLights.REGISTRATE.block("small_tube_light",  SmallTubeLight::new)
            .initialProperties(SharedProperties::stone)
            .onRegister(AllMovementBehaviours.movementBehaviour(new NodeMovementBehaviour()))
            .item()
            .transform(customItemModel())
            .register();
    public static final BlockEntry<SkinnyTubeLight> SKINNY_TUBE_LIGHT = AdditionalLights.REGISTRATE.block("skinny_tube_light",  SkinnyTubeLight::new)
            .initialProperties(SharedProperties::stone)
            .onRegister(AllMovementBehaviours.movementBehaviour(new NodeMovementBehaviour()))
            .item()
            .transform(customItemModel())
            .register();
    public static final BlockEntry<SmallHeadlight> SMALL_HEADLIGHT = AdditionalLights.REGISTRATE.block("pyle_headlight",  SmallHeadlight::new)
            .initialProperties(SharedProperties::stone)
            .onRegister(AllMovementBehaviours.movementBehaviour(new NodeMovementBehaviour()))
            .item()
            .transform(customItemModel())
            .register();
    public static final BlockEntry<SmallArmoredLight> SMALL_ARMORED_LIGHT = AdditionalLights.REGISTRATE.block("small_armored_light",  SmallArmoredLight::new)
            .initialProperties(SharedProperties::stone)
            .onRegister(AllMovementBehaviours.movementBehaviour(new NodeMovementBehaviour()))
            .item()
            .transform(customItemModel())
            .register();
    public static void register() {

    }
}
