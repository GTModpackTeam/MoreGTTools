package com.github.gtexpert.gtmt.integration.eio.recipes;

import static gregtech.api.GTValues.VA;
import static gregtech.api.unification.ore.OrePrefix.*;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

import gregtech.api.recipes.ModHandler;
import gregtech.api.recipes.RecipeMaps;
import gregtech.api.recipes.category.RecipeCategories;
import gregtech.api.unification.OreDictUnifier;
import gregtech.api.unification.material.Materials;

import com.github.gtexpert.gtmt.api.ModValues;
import com.github.gtexpert.gtmt.api.unification.material.ModMaterials;
import com.github.gtexpert.gtmt.loaders.recipe.handlers.ModImplosionRecipeHandler;

import crazypants.enderio.base.init.ModObject;

public class EIOMaterialsRecipe {

    public static void init() {
        // Soul Sand Dust
        RecipeMaps.MACERATOR_RECIPES.recipeBuilder()
                .inputs(new ItemStack(Blocks.SOUL_SAND))
                .outputs(OreDictUnifier.get(dust, ModMaterials.SoulSand))
                .category(RecipeCategories.MACERATOR_RECYCLING)
                .duration(25).EUt(2)
                .buildAndRegister();

        // Chorus fruit Dust
        RecipeMaps.MACERATOR_RECIPES.recipeBuilder()
                .inputs(new ItemStack(Items.CHORUS_FRUIT))
                .outputs(OreDictUnifier.get(dust, ModMaterials.ChorusFruit))
                .category(RecipeCategories.MACERATOR_RECYCLING)
                .duration(25).EUt(2)
                .buildAndRegister();

        // Electrical Steel
        RecipeMaps.MIXER_RECIPES.recipeBuilder()
                .input(dust, Materials.Steel, 1)
                .input(dust, Materials.Coal, 1)
                .input(dust, Materials.Silicon, 1)
                .output(dust, ModMaterials.ElectricalSteel, 3)
                .duration(40).EUt(VA[ModValues.eioVoltageTier])
                .buildAndRegister();

        // Energetic Alloy
        RecipeMaps.MIXER_RECIPES.recipeBuilder()
                .input(dust, Materials.Redstone, 1)
                .input(dust, Materials.Gold, 1)
                .input(dust, Materials.Glowstone, 1)
                .output(dust, ModMaterials.EnergeticAlloy, 3)
                .duration(40).EUt(VA[ModValues.eioVoltageTier])
                .buildAndRegister();

        // Vibrant Alloy
        RecipeMaps.MIXER_RECIPES.recipeBuilder()
                .input(dust, ModMaterials.EnergeticAlloy, 1)
                .input(dust, Materials.EnderPearl, 1)
                .output(dust, ModMaterials.VibrantAlloy, 2)
                .duration(40).EUt(VA[ModValues.eioVoltageTier])
                .buildAndRegister();

        // Redstone Alloy
        RecipeMaps.MIXER_RECIPES.recipeBuilder()
                .input(dust, Materials.RedAlloy, 1)
                .input(dust, Materials.Silicon, 1)
                .output(dust, ModMaterials.RedstoneAlloy, 2)
                .duration(40).EUt(VA[ModValues.eioVoltageTier])
                .buildAndRegister();

        // Conductive Iron
        RecipeMaps.MIXER_RECIPES.recipeBuilder()
                .input(dust, Materials.Iron, 1)
                .input(dust, ModMaterials.RedstoneAlloy, 1)
                .output(dust, ModMaterials.ConductiveIron, 2)
                .duration(40).EUt(VA[ModValues.eioVoltageTier])
                .buildAndRegister();

        // Pulsating Iron
        RecipeMaps.MIXER_RECIPES.recipeBuilder()
                .input(dust, Materials.Iron, 1)
                .input(dust, Materials.EnderPearl, 1)
                .output(dust, ModMaterials.PulsatingIron, 2)
                .duration(40).EUt(VA[ModValues.eioVoltageTier])
                .buildAndRegister();

        // Dark Steel
        RecipeMaps.MIXER_RECIPES.recipeBuilder()
                .input(dust, Materials.Iron, 1)
                .input(dust, Materials.Coal, 1)
                .input(dust, Materials.Obsidian, 1)
                .output(dust, ModMaterials.DarkSteel, 3)
                .duration(40).EUt(VA[ModValues.eioVoltageTier])
                .buildAndRegister();

        // Soularium
        RecipeMaps.MIXER_RECIPES.recipeBuilder()
                .input(dust, Materials.Gold, 1)
                .input(dust, Materials.Ash, 1)
                .input(dust, ModMaterials.SoulSand, 1)
                .output(dust, ModMaterials.Soularium, 3)
                .duration(40).EUt(VA[ModValues.eioVoltageTier])
                .buildAndRegister();

        // End Steel
        RecipeMaps.MIXER_RECIPES.recipeBuilder()
                .input(dust, Materials.Endstone, 1)
                .input(dust, ModMaterials.DarkSteel, 1)
                .input(dust, Materials.Obsidian, 1)
                .output(dust, ModMaterials.EndSteel, 3)
                .duration(40).EUt(VA[ModValues.eioVoltageTier + 1])
                .buildAndRegister();

        // Iron Alloy
        RecipeMaps.MIXER_RECIPES.recipeBuilder()
                .input(dust, Materials.Platinum, 1)
                .input(dust, Materials.Iron, 1)
                .input(dust, Materials.Aluminium, 1)
                .output(dust, ModMaterials.ConstructionAlloy, 3)
                .duration(40).EUt(VA[ModValues.eioVoltageTier + 1])
                .buildAndRegister();

        // Crystalline Alloy
        RecipeMaps.MIXER_RECIPES.recipeBuilder()
                // .input(ModObject.itemMaterial.getItemNN(), 1, 34)
                .input(dust, Materials.Gold, 1)
                .input(dust, Materials.Platinum, 1)
                .input(dust, Materials.Emerald, 1)
                .input(dust, ModMaterials.VibrantAlloy, 1)
                .output(dust, ModMaterials.CrystallineAlloy, 4)
                .duration(40).EUt(VA[ModValues.eioVoltageTier + 1])
                .buildAndRegister();

        // Melodic Alloy
        RecipeMaps.MIXER_RECIPES.recipeBuilder()
                .input(dust, ModMaterials.EndSteel, 1)
                .input(dust, ModMaterials.ChorusFruit, 1)
                .output(dust, ModMaterials.MelodicAlloy, 2)
                .duration(40).EUt(VA[ModValues.eioVoltageTier + 1])
                .buildAndRegister();

        // Stellar Alloy
        RecipeMaps.MIXER_RECIPES.recipeBuilder()
                .input(dust, Materials.NetherStar, 1)
                .input(dust, ModMaterials.MelodicAlloy, 1)
                .input(dust, Materials.Clay, 1)
                .output(dust, ModMaterials.StellarAlloy, 3)
                .duration(40).EUt(VA[ModValues.eioVoltageTier + 3])
                .buildAndRegister();

        // Crystalline Pink Slime
        RecipeMaps.MIXER_RECIPES.recipeBuilder()
                .input(dust, ModMaterials.MelodicAlloy, 1)
                .input(dust, Materials.RawRubber, 2)
                .output(dust, ModMaterials.CrystallinePinkSlime, 2)
                .duration(40).EUt(VA[ModValues.eioVoltageTier + 1])
                .buildAndRegister();

        // Energetic Silver
        RecipeMaps.MIXER_RECIPES.recipeBuilder()
                .input(dust, Materials.Silver, 1)
                .input(dust, Materials.Redstone, 1)
                .input(dust, Materials.Glowstone, 1)
                .output(dust, ModMaterials.EnergeticSilver, 3)
                .duration(40).EUt(VA[ModValues.eioVoltageTier + 1])
                .buildAndRegister();

        // Vivid Alloy
        RecipeMaps.MIXER_RECIPES.recipeBuilder()
                .input(dust, ModMaterials.EnergeticSilver, 1)
                .input(dust, Materials.EnderPearl, 1)
                .output(dust, ModMaterials.VividAlloy, 2)
                .duration(40).EUt(VA[ModValues.eioVoltageTier + 1])
                .buildAndRegister();

        // Pulsating Crystal
        RecipeMaps.AUTOCLAVE_RECIPES.recipeBuilder()
                .input("itemPulsatingPowder")
                .fluidInputs(Materials.DistilledWater.getFluid(50))
                .output(ModObject.itemMaterial.getItemNN(), 1, 14)
                .duration(600).EUt(24)
                .buildAndRegister();
        RecipeMaps.AUTOCLAVE_RECIPES.recipeBuilder()
                .input("itemPulsatingPowder")
                .fluidInputs(Materials.Water.getFluid(250))
                .chancedOutput(new ItemStack(ModObject.itemMaterial.getItemNN(), 1, 14), 7000, 1000)
                .duration(1200).EUt(24)
                .buildAndRegister();
        ModImplosionRecipeHandler.add("itemPulsatingPowder", new ItemStack(ModObject.itemMaterial.getItemNN(), 3, 14));

        // Vibrant Crystal
        RecipeMaps.AUTOCLAVE_RECIPES.recipeBuilder()
                .input("itemVibrantPowder")
                .fluidInputs(Materials.DistilledWater.getFluid(50))
                .output(ModObject.itemMaterial.getItemNN(), 1, 15)
                .duration(600).EUt(24)
                .buildAndRegister();
        RecipeMaps.AUTOCLAVE_RECIPES.recipeBuilder()
                .input("itemVibrantPowder")
                .fluidInputs(Materials.Water.getFluid(250))
                .chancedOutput(new ItemStack(ModObject.itemMaterial.getItemNN(), 1, 15), 7000, 1000)
                .duration(1200).EUt(24)
                .buildAndRegister();
        ModImplosionRecipeHandler.add("itemVibrantPowder", new ItemStack(ModObject.itemMaterial.getItemNN(), 3, 15));

        // Ender Crystal
        RecipeMaps.AUTOCLAVE_RECIPES.recipeBuilder()
                .input("itemEnderCrystalPowder")
                .fluidInputs(Materials.DistilledWater.getFluid(50))
                .output(ModObject.itemMaterial.getItemNN(), 1, 16)
                .duration(600).EUt(24)
                .buildAndRegister();
        RecipeMaps.AUTOCLAVE_RECIPES.recipeBuilder()
                .input("itemEnderCrystalPowder")
                .fluidInputs(Materials.Water.getFluid(250))
                .chancedOutput(new ItemStack(ModObject.itemMaterial.getItemNN(), 1, 16), 7000, 1000)
                .duration(1200).EUt(24)
                .buildAndRegister();
        ModImplosionRecipeHandler.add("itemEnderCrystalPowder",
                new ItemStack(ModObject.itemMaterial.getItemNN(), 3, 16));

        // Weather Crystal
        ModHandler.addShapedRecipe(true, "weather_crystal",
                new ItemStack(ModObject.itemMaterial.getItemNN(), 1, 18),
                " P ", "VEV", " P ",
                'P', new ItemStack(ModObject.itemMaterial.getItemNN(), 1, 14),
                'V', new ItemStack(ModObject.itemMaterial.getItemNN(), 1, 15),
                'E', new ItemStack(ModObject.itemMaterial.getItemNN(), 1, 16));

        // Prescient Crystal
        RecipeMaps.AUTOCLAVE_RECIPES.recipeBuilder()
                .input("itemPrecientPowder")
                .fluidInputs(Materials.DistilledWater.getFluid(50))
                .output(ModObject.itemMaterial.getItemNN(), 1, 19)
                .duration(600).EUt(24)
                .buildAndRegister();
        RecipeMaps.AUTOCLAVE_RECIPES.recipeBuilder()
                .input("itemPrecientPowder")
                .fluidInputs(Materials.Water.getFluid(250))
                .chancedOutput(new ItemStack(ModObject.itemMaterial.getItemNN(), 1, 19), 7000, 1000)
                .duration(1200).EUt(24)
                .buildAndRegister();
        ModImplosionRecipeHandler.add("itemPrecientPowder", new ItemStack(ModObject.itemMaterial.getItemNN(), 3, 19));
    }
}
