package com.github.gtexpert.gtmt.integration.eio;

import net.minecraft.item.crafting.IRecipe;
import net.minecraftforge.event.RegistryEvent;

import com.github.gtexpert.gtmt.api.ModValues;
import com.github.gtexpert.gtmt.api.modules.TModule;
import com.github.gtexpert.gtmt.api.util.Mods;
import com.github.gtexpert.gtmt.integration.IntegrationSubmodule;
import com.github.gtexpert.gtmt.integration.eio.recipes.EIOMaterialsRecipe;
import com.github.gtexpert.gtmt.integration.eio.recipes.EIOToolsRecipe;
import com.github.gtexpert.gtmt.modules.Modules;

@TModule(
         moduleID = Modules.MODULE_EIO,
         containerID = ModValues.MODID,
         modDependencies = Mods.Names.ENDER_IO,
         name = "GTMoreTools EnderIO Integration",
         description = "EnderIO Integration Module")
public class EnderIOModule extends IntegrationSubmodule {

    @Override
    public void registerRecipesLowest(RegistryEvent.Register<IRecipe> event) {
        EIOMaterialsRecipe.init();
        EIOToolsRecipe.init();
    }
}
