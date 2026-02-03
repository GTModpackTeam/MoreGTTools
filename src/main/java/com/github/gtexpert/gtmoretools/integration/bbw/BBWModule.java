package com.github.gtexpert.gtmoretools.integration.bbw;

import java.util.Collections;
import java.util.List;

import net.minecraft.item.Item;
import net.minecraft.item.crafting.IRecipe;
import net.minecraftforge.client.event.ColorHandlerEvent;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.registries.IForgeRegistry;

import org.jetbrains.annotations.NotNull;

import gregtech.api.items.toolitem.IGTTool;

import com.github.gtexpert.gtmoretools.api.ModValues;
import com.github.gtexpert.gtmoretools.api.modules.TModule;
import com.github.gtexpert.gtmoretools.api.util.Mods;
import com.github.gtexpert.gtmoretools.integration.IntegrationSubmodule;
import com.github.gtexpert.gtmoretools.integration.bbw.recipes.BBWToolsRecipe;
import com.github.gtexpert.gtmoretools.integration.bbw.tools.BBWToolItems;
import com.github.gtexpert.gtmoretools.integration.bbw.tools.BBWToolRecipeHandler;
import com.github.gtexpert.gtmoretools.modules.Modules;

@TModule(
         moduleID = Modules.MODULE_BBW,
         containerID = ModValues.MODID,
         modDependencies = Mods.Names.BETTER_BUILDERS_WANDS,
         name = "GTMoreTools Better Builder's Wands Integration",
         description = "Better Builder's Wands Integration Module")
public class BBWModule extends IntegrationSubmodule {

    @NotNull
    @Override
    public List<Class<?>> getEventBusSubscribers() {
        return Collections.singletonList(BBWModule.class);
    }

    @Override
    public void preInit(FMLPreInitializationEvent event) {
        BBWToolItems.init();
    }

    @SubscribeEvent
    public static void onRegisterItems(RegistryEvent.Register<Item> event) {
        IForgeRegistry<Item> registry = event.getRegistry();
        for (IGTTool tool : BBWToolItems.getAllTools()) {
            registry.register(tool.get());
        }
    }

    @SubscribeEvent
    @SideOnly(Side.CLIENT)
    public static void onRegisterModels(ModelRegistryEvent event) {
        BBWToolItems.registerModels();
    }

    @SubscribeEvent
    @SideOnly(Side.CLIENT)
    public static void onRegisterColors(ColorHandlerEvent.Item event) {
        BBWToolItems.registerColors(event.getItemColors());
    }

    @Override
    public void registerRecipesNormal(RegistryEvent.Register<IRecipe> event) {
        BBWToolItems.registerOreDict();
    }

    @Override
    public void registerRecipesLowest(RegistryEvent.Register<IRecipe> event) {
        BBWToolsRecipe.init();
        BBWToolRecipeHandler.registerRecipes();
    }
}
