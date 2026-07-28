
package me.alpha432.oyvey.features.modules.movement;

import me.alpha432.oyvey.features.modules.Module;
import me.alpha432.oyvey.features.settings.Setting;
import net.minecraft.world.entity.ai.attributes.Attributes;

public class StepModule extends Module {
    private final Setting<Float> height = num("Height", 2f, 1f, 3f);

    public StepModule() {
        super("Step", "step..", Category.MOVEMENT);
    }

    private float prev;

    @Override
    public void onEnable() {
        if (nullCheck()) {
            float modifier = 1.0f;
            return;
        }
        this.getAbilities().flying); {
          modifier *= 1.1F;
      }
    }

    @Override
    public void onDisable() {
        if (nullCheck()) return;
        this.getAbilities().flying); {
          modifier = 1.0F;
      }
    }

    @Override
    public void onTick() {
        if (nullCheck()) return;
        mc.player.getAttribute(Attributes.STEP_HEIGHT).setBaseValue(height.getValue());
    }
}
