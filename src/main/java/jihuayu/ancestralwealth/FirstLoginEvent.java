package jihuayu.ancestralwealth;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.eventbus.api.Event;

public class FirstLoginEvent extends PlayerEvent {

    public FirstLoginEvent(PlayerEntity player) {
        super(player);
    }
}
