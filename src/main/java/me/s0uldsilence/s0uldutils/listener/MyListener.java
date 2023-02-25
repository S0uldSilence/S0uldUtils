package me.s0uldsilence.s0uldutils.listener;
import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class MyListener implements Listener{
    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        event.joinMessage("Welcome to the server, " + event.getPlayer().getName() + "!");
    }

}
