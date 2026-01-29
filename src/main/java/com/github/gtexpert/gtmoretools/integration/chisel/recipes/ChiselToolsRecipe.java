package com.github.gtexpert.gtmoretools.integration.chisel.recipes;

import gregtech.api.recipes.ModHandler;

import com.github.gtexpert.gtmoretools.api.util.Mods;
import com.github.gtexpert.gtmoretools.integration.chisel.ChiselConfigHolder;

public class ChiselToolsRecipe {

    public static void init() {
        if (ChiselConfigHolder.hardToolRecipes) {
            // Remove original Chisel mod recipes - replaced by GregTech-style chisel
            ModHandler.removeRecipeByName(Mods.Chisel.getResource("chisel_iron"));
            ModHandler.removeRecipeByName(Mods.Chisel.getResource("chisel_diamond"));
            ModHandler.removeRecipeByName(Mods.Chisel.getResource("chisel_hitech"));
        }
    }
}
