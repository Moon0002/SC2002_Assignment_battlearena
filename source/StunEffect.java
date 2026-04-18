// blocks the affected combatant from acting for 2 turns (the turn it's applied + the next)
// canAct() in Combatant checks for this by name — "Stun" must match exactly
public class StunEffect implements StatusEffect {
    private int duration;
    private static final String EFFECT_NAME = "Stun";

    public StunEffect() {
        this.duration = 2;
    }

    @Override
    public int getDuration() { return duration; }

    @Override
    public void decrementDuration() {
        if (duration > 0) duration--;
    }

    @Override
    public boolean isExpired() { return duration <= 0; }

    @Override
    public void apply(Combatant combatant) {
        // passive — canAct() handles the block, nothing to apply here
    }

    @Override
    public void remove(Combatant combatant) {
        // nothing to clean up
    }

    @Override
    public String getName() { return EFFECT_NAME; }
}
