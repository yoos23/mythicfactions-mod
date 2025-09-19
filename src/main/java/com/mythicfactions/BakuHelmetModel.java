import net.minecraft.util.Identifier;
import software.bernie.geckolib.model.GeoModel;

public class BakuHelmetModel extends GeoModel<BakuHelmetItem> {
    @Override
    public Identifier getModelResource(BakuHelmetItem object) {
        return new Identifier("mythicfactions:baku_helmet.geo.json");
    }

    @Override
    public Identifier getTextureResource(BakuHelmetItem object) {
        return new Identifier("mythicfactions:textures/armor/baku_helmet.png");
    }

    @Override
    public Identifier getAnimationResource(BakuHelmetItem animatable) {
        return new Identifier("mythicfactions:animations/baku_helmet.animation.json");
    }
}
