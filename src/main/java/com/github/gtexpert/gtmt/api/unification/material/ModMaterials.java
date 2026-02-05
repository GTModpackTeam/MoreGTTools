package com.github.gtexpert.gtmt.api.unification.material;

import gregtech.api.unification.material.Material;

import com.github.gtexpert.gtmt.api.unification.material.ingredients.EIOFirstDegreeMaterials;
import com.github.gtexpert.gtmt.api.unification.material.ingredients.TCFirstDegreeMaterials;
import com.github.gtexpert.gtmt.api.util.Mods;

public class ModMaterials {

    // Element Materials

    // First Degree Materials
    public static Material SoulSand;
    public static Material ChorusFruit;
    public static Material ElectricalSteel;
    public static Material EnergeticAlloy;
    public static Material VibrantAlloy;
    public static Material RedstoneAlloy;
    public static Material ConductiveIron;
    public static Material PulsatingIron;
    public static Material DarkSteel;
    public static Material Soularium;
    public static Material EndSteel;
    public static Material ConstructionAlloy;
    public static Material CrystallineAlloy;
    public static Material MelodicAlloy;
    public static Material StellarAlloy;
    public static Material CrystallinePinkSlime;
    public static Material EnergeticSilver;
    public static Material VividAlloy;
    public static Material ChargedCertusQuartz;
    public static Material Fluix;
    public static Material FluixAlloy;
    public static Material Thaumium;
    public static Material VoidMetal;

    // Second Degree Materials

    // Third Degree Materials

    // Organic Chemistry Materials

    // Unknown Composition Materials

    public static void registerMaterialsHigh() {}

    public static void registerMaterialsLow() {}

    public static void registerMaterialsLowest() {
        if (Mods.EnderIO.isModLoaded()) {
            EIOFirstDegreeMaterials.init(); // 24101 - 24150
        }
        if (Mods.Thaumcraft.isModLoaded()) {
            TCFirstDegreeMaterials.init(); // 24191 - 24199
        }
    }
}
