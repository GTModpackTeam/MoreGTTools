package com.github.gtexpert.gtmoretools.integration.bbw.tools;

import static gregtech.api.unification.material.info.MaterialFlags.*;

import gregtech.api.GregTechAPI;
import gregtech.api.recipes.ModHandler;
import gregtech.api.unification.material.Material;
import gregtech.api.unification.material.Materials;
import gregtech.api.unification.material.properties.PropertyKey;
import gregtech.api.unification.ore.OrePrefix;
import gregtech.api.unification.stack.UnificationEntry;
import gregtech.common.ConfigHolder;

public class BBWToolRecipeHandler {

    public static void registerRecipes() {
        for (Material material : GregTechAPI.materialManager.getRegisteredMaterials()) {
            if (!material.hasProperty(PropertyKey.TOOL)) continue;

            // Flint uses gem instead of plate/ingot
            if (material == Materials.Flint) {
                processFlintWandRecipe();
                continue;
            }

            if (!material.hasFlag(GENERATE_PLATE)) continue;

            processWandRecipe(material);
        }
    }

    private static void processWandRecipe(Material material) {
        if (ConfigHolder.recipes.hardToolArmorRecipes) {
            ModHandler.addShapedRecipe(String.format("wand_%s", material.getName()),
                    BBWToolItems.WAND.get(material),
                    " fP", " Sh", "S  ",
                    'P', new UnificationEntry(OrePrefix.plate, material),
                    'S', new UnificationEntry(OrePrefix.stick, Materials.Wood));
        } else {
            ModHandler.addShapedRecipe(String.format("wand_%s", material.getName()),
                    BBWToolItems.WAND.get(material),
                    "  I", " S ", "S  ",
                    'I', new UnificationEntry(OrePrefix.ingot, material),
                    'S', new UnificationEntry(OrePrefix.stick, Materials.Wood));
        }
    }

    private static void processFlintWandRecipe() {
        if (ConfigHolder.recipes.hardToolArmorRecipes) {
            ModHandler.addShapedRecipe("wand_flint",
                    BBWToolItems.WAND.get(Materials.Flint),
                    " fF", " Sh", "S  ",
                    'F', new UnificationEntry(OrePrefix.gem, Materials.Flint),
                    'S', new UnificationEntry(OrePrefix.stick, Materials.Wood));
        } else {
            ModHandler.addShapedRecipe("wand_flint",
                    BBWToolItems.WAND.get(Materials.Flint),
                    "  F", " S ", "S  ",
                    'F', new UnificationEntry(OrePrefix.gem, Materials.Flint),
                    'S', new UnificationEntry(OrePrefix.stick, Materials.Wood));
        }
    }
}
