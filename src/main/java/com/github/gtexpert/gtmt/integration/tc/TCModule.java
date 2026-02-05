package com.github.gtexpert.gtmt.integration.tc;

import net.minecraft.item.crafting.IRecipe;
import net.minecraftforge.event.RegistryEvent;

import com.github.gtexpert.gtmt.api.ModValues;
import com.github.gtexpert.gtmt.api.modules.TModule;
import com.github.gtexpert.gtmt.api.util.Mods;
import com.github.gtexpert.gtmt.integration.IntegrationSubmodule;
import com.github.gtexpert.gtmt.integration.tc.recipes.TCToolsRecipe;
import com.github.gtexpert.gtmt.modules.Modules;

@TModule(
         moduleID = Modules.MODULE_TC,
         containerID = ModValues.MODID,
         modDependencies = Mods.Names.THAUMIC_ENERGISTICS,
         name = "GTMoreTools Thaumcraft Integration",
         description = "Thaumcraft Integration Module")
public class TCModule extends IntegrationSubmodule {

    @Override
    public void registerRecipesLowest(RegistryEvent.Register<IRecipe> event) {
        TCToolsRecipe.init();
    }
}
