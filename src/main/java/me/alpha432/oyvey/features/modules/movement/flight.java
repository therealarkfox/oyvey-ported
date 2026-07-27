package me.alpha432.oyvey.features.modules.movement;

import me.alpha432.oyvey.features.modules.Module;

public class ReverseStepModule extends Module {
    public ReverseStepModule() {
        super("flight", "flight flall but not", Category.MOVEMENT);
    }

    @Override
        var player = MinecraftClient.getInstance().player;
        if (player == null)
            return;
        player.getAbilities().allowFlying = this.enabled;
    }
}
