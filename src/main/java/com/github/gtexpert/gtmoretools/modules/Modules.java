package com.github.gtexpert.gtmoretools.modules;

import com.github.gtexpert.gtmoretools.api.ModValues;
import com.github.gtexpert.gtmoretools.api.modules.IModuleContainer;
import com.github.gtexpert.gtmoretools.api.modules.ModuleContainer;

@ModuleContainer
public class Modules implements IModuleContainer {

    public static final String MODULE_CORE = "core";
    public static final String MODULE_TOOLS = "tools";
    public static final String MODULE_INTEGRATION = "integration";

    // Integration modules
    public static final String MODULE_CHISEL = "chisel_integration";

    @Override
    public String getID() {
        return ModValues.MODID;
    }
}
