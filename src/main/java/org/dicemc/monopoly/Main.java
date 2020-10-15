package org.dicemc.monopoly;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
    @Override
    public void onEnable() {
        getLogger().info("[Monopoly] Enabled!");
    }

    @Override
    public void onDisable() {
        getLogger().info("[Monopoly] Disabled!");
    }
}
