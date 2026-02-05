package com.github.gtexpert.gtmt.integration.ae;

import net.minecraftforge.common.config.Config;

import com.github.gtexpert.gtmt.api.ModValues;
import com.github.gtexpert.gtmt.modules.Modules;

@Config.LangKey(ModValues.MODID + ".config.integration.ae")
@Config(modid = ModValues.MODID,
        name = ModValues.MODID + "/integration/" + Modules.MODULE_AE,
        category = "Applied Energistics 2")
public class AEConfigHolder {

    @Config.Comment({ "The voltage at which AE can be started.",
            "The material is also adjusted to each voltage.", "Default: 3 (HV)" })
    @Config.RangeInt(min = 2, max = 10)
    public static int voltageTier = 3;
}
