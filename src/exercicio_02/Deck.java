package exercicio_02;

public class Deck {
    private ICard[] cards;


    public Deck(ICard[] cards) {
        this.cards = cards;

    }

    public ICard[] getDeck() {
        return cards;
    }

}
