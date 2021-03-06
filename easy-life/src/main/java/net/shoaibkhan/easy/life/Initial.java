package net.shoaibkhan.easy.life;

import org.lwjgl.glfw.GLFW;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;
import net.minecraft.client.options.KeyBinding;
import net.minecraft.client.util.InputUtil;

@Environment(EnvType.CLIENT)
public class Initial implements ModInitializer {
    public static ClientMod clientMod;
    public static KeyBinding kb,coord,CONFIG_KEY;

    @Override
    public void onInitialize() {
        System.out.println("Mod is initializing!!");
        

        kb = KeyBindingHelper.registerKeyBinding(new KeyBinding("Health n Hunger", InputUtil.Type.KEYSYM, GLFW.GLFW_KEY_R, "Easy Life"));
        coord = KeyBindingHelper.registerKeyBinding(new KeyBinding("Co-ordinates", InputUtil.Type.KEYSYM, GLFW.GLFW_KEY_F6, "Easy Life"));
        CONFIG_KEY = KeyBindingHelper.registerKeyBinding(new KeyBinding("Configuration", InputUtil.Type.KEYSYM, GLFW.GLFW_KEY_J, "Easy Life"));

        clientMod = new ClientMod(kb,coord,CONFIG_KEY);
    }
    
}
