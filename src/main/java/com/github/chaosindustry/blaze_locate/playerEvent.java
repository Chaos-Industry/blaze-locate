package com.github.chaosindustry.blaze_locate;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;

public class playerEvent implements Listener {

    @EventHandler
    public void onPlayerClick(PlayerInteractEvent event){
        Player player = event.getPlayer();
        if(event.getClickedBlock()!=null){
            Bukkit.getLogger().info(event.getClickedBlock().toString());
            Bukkit.getLogger().info(event.getClickedBlock().getType().toString());
            if(event.getAction().toString().equalsIgnoreCase("RIGHT_CLICK_BLOCK")){
                if(player.getInventory().getItemInMainHand().getType().toString().equalsIgnoreCase("BLAZE_ROD")){
                    player.sendMessage(event.getClickedBlock().getLocation().toString());
                }
            }

        }else{
            Bukkit.getLogger().info("null");
        }
    }
}