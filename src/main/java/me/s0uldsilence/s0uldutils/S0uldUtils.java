package me.s0uldsilence.s0uldutils;

import me.s0uldsilence.s0uldutils.command.CommandKit;
import me.s0uldsilence.s0uldutils.listener.MyListener;
import org.bukkit.plugin.java.JavaPlugin;

public final class S0uldUtils extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        this.getCommand("kit1").setExecutor(new CommandKit());
        getServer().getPluginManager().registerEvents(new MyListener(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
