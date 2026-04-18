import java.util.List;

public class SmokeBomb implements Item {
    private static final String ITEM_NAME = "Smoke Bomb";

    @Override
    public void use(Combatant user, List<Combatant> targets) {
        if (user == null) return;
        // applies DamageZeroEffect , GameManager's useItem() handles the display via CLIHandler
        user.addStatusEffect(new DamageZeroEffect());
    }

    @Override
    public String getName() { return ITEM_NAME; }

    @Override
    public boolean isConsumable() { return true; }
}
