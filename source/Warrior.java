import java.util.List;

public class Warrior extends Combatant {
    private static final int WARRIOR_HP  = 260;
    private static final int WARRIOR_ATK = 40;
    private static final int WARRIOR_DEF = 20;
    private static final int WARRIOR_SPD = 30;

    public Warrior() {
        super("Warrior", WARRIOR_HP, WARRIOR_ATK, WARRIOR_DEF, WARRIOR_SPD);
    }

    @Override
    public Action getAction(List<Combatant> availableTargets) {
        // player actions are chosen in GameManager.processPlayerTurn() via CLIHandler
        return null;
    }
}
