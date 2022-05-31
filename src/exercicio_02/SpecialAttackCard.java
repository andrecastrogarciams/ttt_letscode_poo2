package exercicio_02;

public class SpecialAttackCard extends AttackCard {
    SpecialEffects specialEffects;

    public SpecialAttackCard(String name, CardType cardType, int cost, int attackPoints, int defensePoints, SpecialEffects specialEffects) {
        super(name, cardType, cost, attackPoints, defensePoints);
        this.specialEffects = specialEffects;
    }

    void int getEffects(SpecialEffects specialEffects){
        System.out.println(specialEffects.getNameSpecialEffect());
    }

    @Override
    public int getAttackPoints() {
        return super.getAttackPoints();
    }

    @Override
    public int getDefensePoints() {
        return super.getDefensePoints();
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public CardType getType() {
        return super.getType();
    }

    @Override
    public int getCost() {
        return super.getCost();
    }
}
