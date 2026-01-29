package com.github.gtexpert.gtmoretools.integration;

import java.util.Collections;
import java.util.List;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.jetbrains.annotations.NotNull;

import com.github.gtexpert.gtmoretools.api.ModValues;
import com.github.gtexpert.gtmoretools.api.modules.TModule;
import com.github.gtexpert.gtmoretools.modules.BaseModule;
import com.github.gtexpert.gtmoretools.modules.Modules;

@TModule(
         moduleID = Modules.MODULE_INTEGRATION,
         containerID = ModValues.MODID,
         name = "GTExpert Mod Integration",
         description = "General GTExpert Integration Module. Disabling this disables all integration modules.")
public class IntegrationModule extends BaseModule {

    public static final Logger logger = LogManager.getLogger("GTExpert Mod Integration");

    @NotNull
    @Override
    public Logger getLogger() {
        return logger;
    }

    @NotNull
    @Override
    public List<Class<?>> getEventBusSubscribers() {
        return Collections.singletonList(IntegrationModule.class);
    }

    @Override
    public void init(FMLInitializationEvent event) {
        super.init(event);
    }
}
