package com.github.gtexpert.gtmoretools.modules;

import com.github.gtexpert.gtmoretools.api.ModValues;
import com.github.gtexpert.gtmoretools.api.modules.IModuleContainer;

public class Modules implements IModuleContainer {

    public static final String MODULE_CORE = "core";
    public static final String MODULE_TOOLS = "tools";
    public static final String MODULE_INTEGRATION = "integration";

    @Override
    public String getID() {
        return ModValues.MODID;
    }
}
