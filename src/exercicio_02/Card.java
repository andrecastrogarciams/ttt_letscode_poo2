package exercicio_02;

public abstract class Card {
    protected String name;
    protected CardType cardType;
    protected int cost;

    public Card(String name, CardType cardType, int cost) {
        this.name = name;
        this.cardType = cardType;
        this.cost = cost;
    }

}
