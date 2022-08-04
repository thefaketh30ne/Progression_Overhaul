package com.th30ne.progression_overhaul.block;

import com.th30ne.progression_overhaul.progression_overhaul;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, progression_overhaul.MOD_ID);


    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}