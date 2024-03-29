package io.rensatopc.github.rensato_whistle.registers.tab;

import io.rensatopc.github.rensato_whistle.main.WhistleMod;
import io.rensatopc.github.rensato_whistle.registers.WhistleModItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class WhistleModTabs {
    public static final DeferredRegister<CreativeModeTab> MOD_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, WhistleMod.MOD_ID);
    public static final RegistryObject<CreativeModeTab> MAIN_TAB = MOD_TABS.register("whistle_main", () -> WhistleModMainTab.get());
}
