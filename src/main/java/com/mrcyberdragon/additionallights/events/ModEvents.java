package com.mrcyberdragon.additionallights.events;

import com.mrcyberdragon.additionallights.block.*;
import com.mrcyberdragon.additionallights.init.ModBlocks;
import com.mrcyberdragon.additionallights.init.ModItems;
import com.mrh0.createaddition.blocks.connector.SmallLightConnectorBlock;
import com.mrh0.createaddition.blocks.connector.SmallLightConnectorBlockEntity;
import com.mrh0.createaddition.index.CABlocks;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber
public class ModEvents {

    @SubscribeEvent
    public static void interact(PlayerInteractEvent.RightClickBlock event) {
        try {
            if(event.getLevel().isClientSide()) return;
            BlockState state = event.getLevel().getBlockState(event.getPos());
            BlockEntity entity = event.getLevel().getBlockEntity(event.getPos());
            if(event.getItemStack().getItem()==ModItems.YET_ANOTHER_SCREWDRIVER.get()&&(entity instanceof SmallLightConnectorBlockEntity||entity instanceof SmallLightWithReflectorEntity||entity instanceof SmallCageLightEntity||entity instanceof SmallTubeLightEntity||entity instanceof SkinnyTubeLightEntity||entity instanceof SmallHeadlightEntity||entity instanceof SmallArmoredLightEntity||entity instanceof SmallEdisonBulbEntity||entity instanceof SmallGreenSconceEntity)){
                event.getEntity().swing(event.getHand(), true);
                if(state.is(CABlocks.SMALL_LIGHT_CONNECTOR.get())){
                    event.getLevel().setBlock(event.getPos(), ModBlocks.SMALL_LIGHT_WITH_REFLECTOR.getDefaultState()
                            .setValue(SmallLightWithReflector.FACING, state.getValue(SmallLightConnectorBlock.FACING))
                            .setValue(SmallLightWithReflector.MODE, state.getValue(SmallLightConnectorBlock.MODE))
                            .setValue(SmallLightWithReflector.POWERED, state.getValue(SmallLightConnectorBlock.POWERED)), 3);
                }
                if(state.is(ModBlocks.SMALL_LIGHT_WITH_REFLECTOR.get())){
                    event.getLevel().setBlock(event.getPos(), ModBlocks.SMALL_CAGE_LIGHT.getDefaultState()
                            .setValue(SmallCageLight.FACING, state.getValue(SmallLightWithReflector.FACING))
                            .setValue(SmallCageLight.MODE, state.getValue(SmallLightWithReflector.MODE))
                            .setValue(SmallCageLight.POWERED, state.getValue(SmallLightWithReflector.POWERED)), 3);
                }
                if(state.is(ModBlocks.SMALL_CAGE_LIGHT.get())){
                    event.getLevel().setBlock(event.getPos(), ModBlocks.SMALL_HEADLIGHT.getDefaultState()
                            .setValue(SmallHeadlight.FACING, state.getValue(SmallCageLight.FACING))
                            .setValue(SmallHeadlight.MODE, state.getValue(SmallCageLight.MODE))
                            .setValue(SmallHeadlight.POWERED, state.getValue(SmallCageLight.POWERED)), 3);
                }
                if(state.is(ModBlocks.SMALL_HEADLIGHT.get())){
                    event.getLevel().setBlock(event.getPos(), ModBlocks.SMALL_TUBE_LIGHT.getDefaultState()
                            .setValue(SmallTubeLight.FACING, state.getValue(SmallHeadlight.FACING))
                            .setValue(SmallTubeLight.MODE, state.getValue(SmallHeadlight.MODE))
                            .setValue(SmallTubeLight.POWERED, state.getValue(SmallHeadlight.POWERED)), 3);
                }
                if(state.is(ModBlocks.SMALL_TUBE_LIGHT.get())){
                    event.getLevel().setBlock(event.getPos(), ModBlocks.SKINNY_TUBE_LIGHT.getDefaultState()
                            .setValue(SkinnyTubeLight.FACING, state.getValue(SmallTubeLight.FACING))
                            .setValue(SkinnyTubeLight.MODE, state.getValue(SmallTubeLight.MODE))
                            .setValue(SkinnyTubeLight.POWERED, state.getValue(SmallTubeLight.POWERED)), 3);
                }
                if(state.is(ModBlocks.SKINNY_TUBE_LIGHT.get())){
                    event.getLevel().setBlock(event.getPos(), ModBlocks.SMALL_EDISON_BULB.getDefaultState()
                            .setValue(SmallEdisonBulb.FACING, state.getValue(SkinnyTubeLight.FACING))
                            .setValue(SmallEdisonBulb.MODE, state.getValue(SkinnyTubeLight.MODE))
                            .setValue(SmallEdisonBulb.POWERED, state.getValue(SkinnyTubeLight.POWERED)), 3);
                }
                if(state.is(ModBlocks.SMALL_EDISON_BULB.get())){
                    event.getLevel().setBlock(event.getPos(), ModBlocks.SMALL_ARMORED_LIGHT.getDefaultState()
                            .setValue(SmallArmoredLight.FACING, state.getValue(SmallEdisonBulb.FACING))
                            .setValue(SmallArmoredLight.MODE, state.getValue(SmallEdisonBulb.MODE))
                            .setValue(SmallArmoredLight.POWERED, state.getValue(SmallEdisonBulb.POWERED)), 3);
                }
                if(state.is(ModBlocks.SMALL_ARMORED_LIGHT.get())){
                    event.getLevel().setBlock(event.getPos(), ModBlocks.SMALL_GREEN_SCONCE.getDefaultState()
                            .setValue(SmallGreenSconce.FACING, state.getValue(SmallArmoredLight.FACING))
                            .setValue(SmallGreenSconce.MODE, state.getValue(SmallArmoredLight.MODE))
                            .setValue(SmallGreenSconce.POWERED, state.getValue(SmallArmoredLight.POWERED)), 3);
                }
                if(state.is(ModBlocks.SMALL_GREEN_SCONCE.get())){
                    event.getLevel().setBlock(event.getPos(), CABlocks.SMALL_LIGHT_CONNECTOR.getDefaultState()
                            .setValue(SmallLightConnectorBlock.FACING, state.getValue(SmallGreenSconce.FACING))
                            .setValue(SmallLightConnectorBlock.MODE, state.getValue(SmallGreenSconce.MODE))
                            .setValue(SmallLightConnectorBlock.POWERED, state.getValue(SmallGreenSconce.POWERED)), 3);
                }
                event.setCanceled(true);
            }
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }
}
