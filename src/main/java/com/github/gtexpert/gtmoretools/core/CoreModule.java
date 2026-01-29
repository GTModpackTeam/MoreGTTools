package com.github.gtexpert.gtmoretools.core;

import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLConstructionEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.jetbrains.annotations.NotNull;

import com.github.gtexpert.gtmoretools.Tags;
import com.github.gtexpert.gtmoretools.api.ModValues;
import com.github.gtexpert.gtmoretools.api.modules.IModule;
import com.github.gtexpert.gtmoretools.api.modules.TModule;
import com.github.gtexpert.gtmoretools.common.CommonProxy;
import com.github.gtexpert.gtmoretools.modules.Modules;

@TModule(
         moduleID = Modules.MODULE_CORE,
         containerID = ModValues.MODID,
         name = "GTMoreTools Core",
         description = "Core of GTMoreTools",
         coreModule = true)
public class CoreModule implements IModule {

    public static final Logger logger = LogManager.getLogger(Tags.MODNAME + " Core");
    @SidedProxy(modId = ModValues.MODID,
                clientSide = "com.github.gtexpert.gtmoretools.client.ClientProxy",
                serverSide = "com.github.gtexpert.gtmoretools.common.CommonProxy")
    public static CommonProxy proxy;

    @Override
    public @NotNull Logger getLogger() {
        return logger;
    }

    @Override
    public void construction(FMLConstructionEvent event) {}

    @Override
    public void preInit(FMLPreInitializationEvent event) {
        proxy.preInit(event);

        logger.info("Hello World!");
    }
}
