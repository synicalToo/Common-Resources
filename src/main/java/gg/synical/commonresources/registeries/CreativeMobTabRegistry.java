package gg.synical.commonresources.registeries;

import gg.synical.commonresources.CommonResources;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class CreativeMobTabRegistry {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, CommonResources.MODID);

    public static final List<Supplier<? extends ItemLike>> MAIN_ITEM_TAB = new ArrayList<>();

    public static final RegistryObject<CreativeModeTab> COMMON_RESOURCES_TAB = CREATIVE_MODE_TABS.register("common_resources_tab", () -> CreativeModeTab.builder()
            .title(Component.translatable("Common Resources"))
            .icon(ItemRegistry.NETHERITE_GEAR.get()::getDefaultInstance)
            .displayItems(((itemDisplayParameters, output) -> {
                MAIN_ITEM_TAB.forEach(itemLike -> output.accept(itemLike.get()));
            }))
            .build()
    );

    public static <T extends Item> RegistryObject<T> addItemToTab(RegistryObject<T> itemLike) {
        MAIN_ITEM_TAB.add(itemLike);
        return itemLike;
    }
}
