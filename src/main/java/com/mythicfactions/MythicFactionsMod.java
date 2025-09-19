import net.fabricmc.api.ModInitializer;
import net.minecraft.util.Identifier;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;

public class MythicFactionsMod implements ModInitializer {
    public static final String MODID = "mythicfactions";
    public static final BakuHelmetItem BAKU_HELMET = new BakuHelmetItem();

    @Override
    public void onInitialize() {
        Registry.register(Registries.ITEM, new Identifier(MODID, "baku_helmet"), BAKU_HELMET);
    }
}
