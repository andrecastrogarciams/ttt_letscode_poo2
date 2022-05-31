package exercicio_02;

public class AttackCard extends Card implements  ICard{
    int attackPoints;
    int defensePoints;

    public AttackCard(String name, CardType cardType, int cost, int attackPoints, int defensePoints) {
        super(name, cardType, cost);
        this.attackPoints = attackPoints;
        this.defensePoints = defensePoints;
    }

    public int getAttackPoints() {
        return attackPoints;
    }

    public int getDefensePoints() {
        return defensePoints;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public CardType getType() {
        return this.cardType;
    }

    @Override
    public int getCost() {
        return this.cost;
    }
}
