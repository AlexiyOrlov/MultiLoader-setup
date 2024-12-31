package dev.buildtool.fabric;

import dev.buildtool.CommonClass;
import net.fabricmc.api.ModInitializer;

public class TestModFabric implements ModInitializer {
    
    @Override
    public void onInitialize() {
        CommonClass.run();
    }
}
