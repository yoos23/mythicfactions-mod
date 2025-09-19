import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterials;
import net.minecraft.item.Item;
import software.bernie.geckolib.animatable.GeoAnimatable;
import software.bernie.geckolib.item.GeoArmorItem;

public class BakuHelmetItem extends GeoArmorItem implements GeoAnimatable {
    public BakuHelmetItem() {
        super(ArmorMaterials.NETHERITE, ArmorItem.Type.HELMET, new Item.Settings());
    }

    @Override
    public double getTick(Object object) {
        return 0;
    }
}
