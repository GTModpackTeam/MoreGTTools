package com.github.gtexpert.gtmt.integration.eio;

import net.minecraftforge.common.config.Config;

import com.github.gtexpert.gtmt.api.ModValues;
import com.github.gtexpert.gtmt.modules.Modules;

@Config.LangKey(ModValues.MODID + ".config.integration.eio")
@Config(modid = ModValues.MODID,
        name = ModValues.MODID + "/integration/" + Modules.MODULE_EIO,
        category = "Ender IO")
public class EnderIOConfigHolder {

    @Config.Comment({ "The voltage at which EIO can be started.",
            "The material is also adjusted to each voltage.", "Default: 3 (HV)" })
    @Config.RangeInt(min = 1, max = 8)
    public static int voltageTier = 3;
}
