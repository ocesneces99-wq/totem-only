package com.example.totemonlyfswap;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.minecraft.client.Minecraft;
import net.minecraft.world.item.Items;

public class TotemOnlyFSwapClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        // Runs before vanilla's handleKeybinds() in the same tick.
        ClientTickEvents.START_CLIENT_TICK.register(TotemOnlyFSwapClient::onTick);
    }

    private static void onTick(Minecraft mc) {
        // Only act in-world with no screen open. Inventory screens stay 100% vanilla.
        if (mc.player == null || mc.screen != null) {
            return;
        }

        // Selected hotbar item is a totem: leave vanilla behavior alone.
        if (mc.player.getMainHandItem().is(Items.TOTEM_OF_UNDYING)) {
            return;
        }

        // Not a totem: discard queued swap-key presses so vanilla never sees them.
        while (mc.options.keySwapOffhand.consumeClick()) {
            // intentionally empty
        }
    }
}
