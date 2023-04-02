package de.waldperlachfabi;

import com.lunarclient.bukkitapi.LunarClientAPI;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;

import lombok.NonNull;
import net.kyori.adventure.text.Component;

public class LunarClientHook extends JavaPlugin implements Listener {

	@Override
	public void onEnable() {
		Bukkit.getServer().getPluginManager().registerEvents(this, this);
	}


	@EventHandler
	public void onJoin(@NonNull PlayerJoinEvent e) {
		Bukkit.getScheduler().runTaskLater(this, () -> {
			if (!LunarClientAPI.getInstance().isRunningLunarClient(e.getPlayer())) {
				e.getPlayer().kick(Component.text("You have to use LunarClient"));
			}
		}, 60L);

	}

}
