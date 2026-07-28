package me.alpha432.oyvey.features.modules.movement;

import me.alpha432.oyvey.features.modules.Module;
import me.alpha432.oyvey.features.settings.Setting;
import net.minecraft.world.entity.ai.attributes.Attributes;

public class flightModule extends Module {
    private final Setting<Float> height = num("Height", 2f, 1f, 3f);

    public flightModule() {
        super("Step", "step..", Category.MOVEMENT);
    }

    private float prev;

    @Override
    public void onEnable() {
        if (nullCheck()) {
            prev = 0.6f;
            return;
        }
        prev = mc.player.getWalkingSpeed();
    }

    @Override
    public void onDisable() {
        if (nullCheck()) return;
        mc.player.getAttribute(Attributes.MOVEMENT_SPEED).setBaseValue(prev);
    }

    @Override
    public void onTick() {
        if (nullCheck()) return;
        mc.player.getAttribute(MOVEMENT_SPEED).setBaseValue(height.getValue());
    }
}
