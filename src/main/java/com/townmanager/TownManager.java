package com.townmanager;

import com.townprotection.TownProtection;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class TownManager extends JavaPlugin {

    private TownProtection api = (TownProtection) Bukkit.getServer().getPluginManager().getPlugin("TownProtection");
    @Override
    public void onEnable() {
        // Plugin startup logic
        // First Commit
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
