package deadlyhunter.bloodarsenalreawakened.common.potion;

import deadlyhunter.bloodarsenalreawakened.common.BloodArsenalReawakened;
import net.minecraft.potion.Effect;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModEffects
{
    public static final DeferredRegister<Effect> EFFECTS = DeferredRegister.create(ForgeRegistries.POTIONS, BloodArsenalReawakened.MOD_ID);

    public static final RegistryObject<Effect> BLEEDING = EFFECTS.register("bleeding", BleedingEffect::new);
}
