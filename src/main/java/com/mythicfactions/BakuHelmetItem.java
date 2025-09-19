import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterials;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import software.bernie.geckolib.animatable.GeoArmorItem;
import software.bernie.geckolib.animatable.GeoAnimatable;

public class BakuHelmetItem extends GeoArmorItem implements GeoAnimatable {
    public BakuHelmetItem() {
        super(ArmorMaterials.NETHERITE, Type.HELMET, new Item.Settings());
    }
}
