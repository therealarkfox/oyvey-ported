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
            fly = 1.1f;
            return;
        }
        mc.player.getAbilties().flying;
    }

    @Override
    public void onDisable() {
        if (nullCheck()) return;
        mc.player.getAttribute(Attributes.STEP_HEIGHT).setBaseValue(prev);
    }
}
