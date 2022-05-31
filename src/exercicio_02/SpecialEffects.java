package exercicio_02;

public enum SpecialEffects {
    DEATHTOUCH(1, "Death touch"),
    DOUBLE_STRIKE(2, "Double Strike"),
    FIRST_STRIKE(3, "First Strike"),
    FLASH(4, "Flash"),
    HASTE(5, "Haste"),
    HEXPROOF(6, "Hexproof"),
    MENACE(7, "Menace");

    private int valueSpecialEffect;
    private String nameSpecialEffect;

    SpecialEffects(int valueSpecialEffect, String nameSpecialEffect) {
        this.valueSpecialEffect = valueSpecialEffect;
        this.nameSpecialEffect = nameSpecialEffect;
    }

    public int getValueSpecialEffect() {
        return valueSpecialEffect;
    }

    public String getNameSpecialEffect() {
        return nameSpecialEffect;
    }
}
