import net.fabricmc.api.ClientModInitializer;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class MythicFactionsClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        GeoArmorRenderer.register(BakuHelmetItem.class, () -> new BakuHelmetRenderer());
    }
}
