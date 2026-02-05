package com.github.gtexpert.gtmt.api;

import com.github.gtexpert.gtmt.Tags;
import com.github.gtexpert.gtmt.api.util.ModLog;
import com.github.gtexpert.gtmt.integration.ae.AEConfigHolder;
import com.github.gtexpert.gtmt.integration.eio.EnderIOConfigHolder;
import com.github.gtexpert.gtmt.modules.Modules;

public class ModValues {

    public static final String MODID = Tags.MODID;

    public static int ae2VoltageTier = voltageTier(AEConfigHolder.voltageTier, Modules.MODULE_AE) ?
            AEConfigHolder.voltageTier : 3;
    public static int eioVoltageTier = voltageTier(EnderIOConfigHolder.voltageTier, Modules.MODULE_EIO) ?
            EnderIOConfigHolder.voltageTier : 3;

    private static boolean voltageTier(int voltage, String mod) {
        String greaterMsg = "Base Voltage must be greater than %d! Set to default value.";
        String lessMsg = "Base Voltage must be less than %d! Set to default value.";

        if (voltage == 0) {
            ModLog.logger.error("{}", String.format(greaterMsg, 0));
            return false;
        }

        switch (mod) {
            case Modules.MODULE_AE -> {
                if (voltage < 2) {
                    ModLog.logger.error("[" + Modules.MODULE_AE + "] {}", String.format(greaterMsg, 2));
                } else if (voltage > 10) {
                    ModLog.logger.error("[" + Modules.MODULE_AE + "] {}", String.format(lessMsg, 10));
                } else {
                    return true;
                }
            }
            case Modules.MODULE_EIO -> {
                if (voltage < 1) {
                    ModLog.logger.error("[" + Modules.MODULE_EIO + "] {}", String.format(greaterMsg, 1));
                } else if (voltage > 8) {
                    ModLog.logger.error("[" + Modules.MODULE_EIO + "] {}", String.format(lessMsg, 8));
                } else {
                    return true;
                }
            }
            default -> ModLog.logger.error("Unknown mod: {}", mod);
        }
        return false;
    }
}
