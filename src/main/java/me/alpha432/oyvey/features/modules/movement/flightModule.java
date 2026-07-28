
package me.alpha432.oyvey.features.modules.movement;

import me.alpha432.oyvey.features.modules.Module;
import me.alpha432.oyvey.features.settings.Setting;
import net.minecraft.world.entity.ai.attributes.Attributes;

public class flightModule extends Module {
    private final Setting<Float> height = num("Height", 2f, 1f, 3f);

    public flightModule() {
        super("Flight", "flight..", Category.MOVEMENT);
    }

    private float prev;

    @Override
    public void onEnable() {
        if (nullCheck()) {
            return;
        }
        mc.player.getAbilities().flying = this.enabled;
    }

    @Override
    public void onDisable() {
        if (nullCheck()) return;
        mc.player.getAbilities().flying = this.disabled;
    }
}
