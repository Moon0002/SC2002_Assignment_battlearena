import java.util.List;

public class ShieldBash implements Action {
    @Override
    public void execute(Combatant source, List<Combatant> targets) {
        if (source == null || targets == null || targets.isEmpty()) return;

        Combatant target = targets.get(0);
        if (target == null || !target.isAlive()) return;

        // same damage formula as BasicAttack
        int damage = Math.max(0, source.getAttack() - target.getDefense());
        target.takeDamage(damage);

        // stun only applies if the target survived the hit
        if (target.isAlive()) {
            target.addStatusEffect(new StunEffect());
        }
    }
}
