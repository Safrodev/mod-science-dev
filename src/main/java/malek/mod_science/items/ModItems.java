package malek.mod_science.items;

import malek.mod_science.blocks.ModBlocks;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.registry.Registry;
import org.dimdev.matrix.Matrix;
import org.dimdev.matrix.Registrar;
import org.dimdev.matrix.RegistryEntry;

import static malek.mod_science.ModScience.MOD_ID;

@Registrar(element = Item.class, modid = MOD_ID)
public final class ModItems extends Thread{
    public static final Registry<Item> REGISTRY = Registry.ITEM;

    static FabricItemSettings defaultItem = new FabricItemSettings();

    @RegistryEntry("test")
    public static final Item test = new Item(defaultItem);

    private static Item create(Item item) {
        if (item instanceof BlockItem) {
            ((BlockItem) item).appendBlocks(Item.BLOCK_ITEMS, item);
        }

        return item;
    }


    public void run() {
        init();
    }

    public void init() {
        Matrix.register(ModItems.class, Registry.ITEM);
    }
}
