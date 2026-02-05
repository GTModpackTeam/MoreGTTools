package com.github.gtexpert.gtmt.integration.chisel;

import net.minecraftforge.common.config.Config;

import com.github.gtexpert.gtmt.api.ModValues;
import com.github.gtexpert.gtmt.modules.Modules;

@Config.LangKey(ModValues.MODID + ".config.integration.chisel")
@Config(modid = ModValues.MODID,
        name = ModValues.MODID + "/integration/" + Modules.MODULE_CHISEL,
        category = "Chisel")
public class ChiselConfigHolder {

    @Config.Comment({ "Change LED for Project:RED recipes to GT recipe standards.", "Default: false" })
    public static boolean hardLedRecipes = false;
}
