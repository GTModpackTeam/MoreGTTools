package com.github.gtexpert.gtmt.integration.chisel.loaders;

import com.github.gtexpert.gtmt.api.util.ModUtility;
import com.github.gtexpert.gtmt.api.util.Mods;

public class ChiselOreDictionaryLoader {

    public static void init() {
        // craftChisel
        ModUtility.registerOre(
                "craftChisel",
                Mods.Chisel.getItem("chisel_iron"),
                Mods.Chisel.getItem("chisel_diamond"),
                Mods.Chisel.getItem("chisel_hitech"));
    }
}
