package com.github.gtexpert.gtmoretools.integration;

import java.util.Collections;
import java.util.Set;

import net.minecraft.util.ResourceLocation;

import org.apache.logging.log4j.Logger;
import org.jetbrains.annotations.NotNull;

import com.github.gtexpert.gtmoretools.api.util.ModUtility;
import com.github.gtexpert.gtmoretools.modules.BaseModule;
import com.github.gtexpert.gtmoretools.modules.Modules;

/**
 * Abstract class meant to be used by mod-specific compatibility modules.
 * Implements some shared skeleton code that should be shared by other modules.
 */
public abstract class IntegrationSubmodule extends BaseModule {

    private static final Set<ResourceLocation> DEPENDENCY_UID = Collections.singleton(
            ModUtility.id(Modules.MODULE_INTEGRATION));

    @NotNull
    @Override
    public Logger getLogger() {
        return IntegrationModule.logger;
    }

    @NotNull
    @Override
    public Set<ResourceLocation> getDependencyUids() {
        return DEPENDENCY_UID;
    }
}
