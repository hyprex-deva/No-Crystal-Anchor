package plugins.me.nocrystalanchor;

import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class nocrystalanchor extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        System.out.println("NoExpDam Plugin Starting....!!!");

        getServer().getPluginManager().registerEvents(this, this);

    }


    @EventHandler
    public void onPlayerInteract(PlayerInteractEvent pie) {
        Player player= pie.getPlayer();
        if(player.getWorld().getEnvironment()== World.Environment.NORMAL) {
            if (pie.getMaterial() == Material.RESPAWN_ANCHOR) {
                pie.setCancelled(true);
            }
            if (pie.getMaterial() == Material.END_CRYSTAL) {
                pie.setCancelled(true);
            }
        }
    }


}