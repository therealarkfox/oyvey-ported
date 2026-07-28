
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
            float modifier = 1.0f;
            return;
        }
        this.getAbilities(flying); {
          modifier *= 1.1f;
      }
    }

    @Override
    public void onDisable() {
        if (nullCheck()) return;
        this.getAbilities(flying); {
          modifier = 1.0f;
      }
    }
}
