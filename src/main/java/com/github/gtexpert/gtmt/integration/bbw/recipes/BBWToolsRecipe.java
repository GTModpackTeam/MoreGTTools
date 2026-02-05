package com.github.gtexpert.gtmt.integration.bbw.recipes;

import gregtech.api.recipes.ModHandler;
import gregtech.common.ConfigHolder;

import com.github.gtexpert.gtmt.api.util.Mods;

public class BBWToolsRecipe {

    public static void init() {
        if (ConfigHolder.recipes.hardToolArmorRecipes) {
            // Remove original BBW mod recipes
            ModHandler.removeRecipeByName(Mods.BetterBuildersWands.getResource("recipewandstone"));
            ModHandler.removeRecipeByName(Mods.BetterBuildersWands.getResource("recipewandiron"));
            ModHandler.removeRecipeByName(Mods.BetterBuildersWands.getResource("recipewanddiamond"));
        }
    }
}
