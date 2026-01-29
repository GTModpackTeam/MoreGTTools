package com.github.gtexpert.gtmoretools.integration.chisel.metatileentities;

import static com.github.gtexpert.gtmoretools.api.util.ModUtility.id;
import static gregtech.api.GTValues.*;
import static gregtech.common.metatileentities.MetaTileEntities.registerMetaTileEntity;

import gregtech.api.util.GTUtility;

import com.github.gtexpert.gtmoretools.client.ModTextures;
import com.github.gtexpert.gtmoretools.integration.chisel.ChiselRecipeMaps;

public class ChiselMetaTileEntities {

    public static MetaTileEntityAutoChisel[] AUTO_CHISEL = new MetaTileEntityAutoChisel[3];

    public static void init() {
        // Auto Chisel 11001~11003
        AUTO_CHISEL[0] = registerMetaTileEntity(11001,
                new MetaTileEntityAutoChisel(id("auto_chisel.lv"), ChiselRecipeMaps.AUTO_CHISEL_RECIPES,
                        ModTextures.AUTO_CHISEL_OVERLAY, LV, true, GTUtility.defaultTankSizeFunction));
        AUTO_CHISEL[1] = registerMetaTileEntity(11002,
                new MetaTileEntityAutoChisel(id("auto_chisel.mv"), ChiselRecipeMaps.AUTO_CHISEL_RECIPES,
                        ModTextures.AUTO_CHISEL_OVERLAY, MV, true, GTUtility.defaultTankSizeFunction));
        AUTO_CHISEL[2] = registerMetaTileEntity(11003,
                new MetaTileEntityAutoChisel(id("auto_chisel.hv"), ChiselRecipeMaps.AUTO_CHISEL_RECIPES,
                        ModTextures.AUTO_CHISEL_OVERLAY, HV, true, GTUtility.defaultTankSizeFunction));
    }
}
