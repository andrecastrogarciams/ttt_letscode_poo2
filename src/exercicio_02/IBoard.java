package exercicio_02;

public interface IBoard {
    void deckInsert(Deck deck, int id);
    boolean checkCard(ICard card, int id);
    boolean playerWin(Player player);
}
