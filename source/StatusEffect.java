public interface StatusEffect {
    int getDuration();
    void decrementDuration();
    boolean isExpired();
    void apply(Combatant combatant);
    void remove(Combatant combatant);
    String getName();
}
