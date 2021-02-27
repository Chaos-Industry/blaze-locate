package com.github.chaosindustry.blaze_locate;

import org.bukkit.plugin.java.JavaPlugin;

public final class BLAZE_LOCATE extends JavaPlugin {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new playerEvent(), this);
        getLogger().info("BLAZE_LOCATEが有効になりました");
    }

    @Override
    public void onDisable() {
        getLogger().info("BLAZE_LOCATEが無効になりました");
    }
}
