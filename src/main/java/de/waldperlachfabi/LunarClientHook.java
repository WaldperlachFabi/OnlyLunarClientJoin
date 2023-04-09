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
		Bukkit.getConsoleSender().sendMessage("Das Plugin wurde §aAktiviert§r!");
		Bukkit.getConsoleSender().sendMessage("___.             __      __        .__       .___                   .__                .__    ___________     ___.   .__ ");
		Bukkit.getConsoleSender().sendMessage("\\_ |__ ___.__.  /  \\    /  \\_____  |  |    __| _/_____   ___________|  | _____    ____ |  |__ \\_   _____/____ \\_ |__ |__|");
		Bukkit.getConsoleSender().sendMessage(" | __ <   |  |  \\   \\/\\/   /\\__  \\ |  |   / __ |\\____ \\_/ __ \\_  __ \\  | \\__  \\ _/ ___\\|  |  \\ |    __) \\__  \\ | __ \\|  |");
		Bukkit.getConsoleSender().sendMessage(" | \\_\\ \\___  |   \\        /  / __ \\|  |__/ /_/ ||  |_> >  ___/|  | \\/  |__/ __ \\\\  \\___|   Y  \\|     \\   / __ \\| \\_\\ \\  |");
		Bukkit.getConsoleSender().sendMessage(" |___  / ____|    \\__/\\  /  (____  /____/\\____ ||   __/ \\___  >__|  |____(____  /\\___  >___|  /\\___  /  (____  /___  /__|");
		Bukkit.getConsoleSender().sendMessage("     \\/\\/              \\/        \\/           \\/|__|        \\/                \\/     \\/     \\/     \\/        \\/    \\/    ");

	}


	@EventHandler
	public void onJoin(@NonNull PlayerJoinEvent e) {
		Bukkit.getScheduler().runTaskLater(this, () -> {
			if (!LunarClientAPI.getInstance().isRunningLunarClient(e.getPlayer())) {
				e.getPlayer().kick(Component.text("You have to use LunarClient"));
			}
		}, 60L);

	}
	@Override
	public void onDisable() {
		Bukkit.getConsoleSender().sendMessage("Das Plugin wurde §cDeaktiviert§r!");
		Bukkit.getConsoleSender().sendMessage("___.             __      __        .__       .___                   .__                .__    ___________     ___.   .__ ");
		Bukkit.getConsoleSender().sendMessage("\\_ |__ ___.__.  /  \\    /  \\_____  |  |    __| _/_____   ___________|  | _____    ____ |  |__ \\_   _____/____ \\_ |__ |__|");
		Bukkit.getConsoleSender().sendMessage(" | __ <   |  |  \\   \\/\\/   /\\__  \\ |  |   / __ |\\____ \\_/ __ \\_  __ \\  | \\__  \\ _/ ___\\|  |  \\ |    __) \\__  \\ | __ \\|  |");
		Bukkit.getConsoleSender().sendMessage(" | \\_\\ \\___  |   \\        /  / __ \\|  |__/ /_/ ||  |_> >  ___/|  | \\/  |__/ __ \\\\  \\___|   Y  \\|     \\   / __ \\| \\_\\ \\  |");
		Bukkit.getConsoleSender().sendMessage(" |___  / ____|    \\__/\\  /  (____  /____/\\____ ||   __/ \\___  >__|  |____(____  /\\___  >___|  /\\___  /  (____  /___  /__|");
		Bukkit.getConsoleSender().sendMessage("     \\/\\/              \\/        \\/           \\/|__|        \\/                \\/     \\/     \\/     \\/        \\/    \\/    ");

	}
}
