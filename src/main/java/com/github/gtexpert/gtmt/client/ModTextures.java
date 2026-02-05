package com.github.gtexpert.gtmt.client;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.relauncher.Side;

import gregtech.client.renderer.texture.cube.*;

import com.github.gtexpert.gtmt.api.ModValues;

@Mod.EventBusSubscriber(modid = ModValues.MODID, value = Side.CLIENT)
public class ModTextures {

    // Chisel
    public static OrientedOverlayRenderer AUTO_CHISEL_OVERLAY = new OrientedOverlayRenderer("machines/auto_chisel");
}
