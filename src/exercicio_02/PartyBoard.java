package exercicio_02;

public class PartyBoard implements IBoard{
    private Player[] players;
    private Deck[] decks;

    public PartyBoard(Deck deckOne,
                      Deck deckTwo,
                      Deck deckThree,
                      Deck deckFour,
                      Deck deckFive,
                      Player playerOne,
                      Player playerTwo,
                      Player playerThree,
                      Player playerFour,
                      Player playerFive) {

        this.players = new Player[5]
        this.decks = new Deck[5];
        this.players[0] = playerOne;
        this.players[1] = playerTwo;
        this.players[2] = playerThree;
        this.players[3] = playerFour;
        this.players[4] = playerFive;

        if (deckOne.getDeck().length == 80){
            deckInsert(deckOne, 0);
        }
        if (deckTwo.getDeck().length == 80){
            deckInsert(deckTwo, 1);
        }
        if (deckThree.getDeck().length == 80){
            deckInsert(deckTwo, 2);
        }
        if (deckFour.getDeck().length == 80){
            deckInsert(deckTwo, 3);
        }
        if (deckFive.getDeck().length == 80){
            deckInsert(deckTwo, 4);
        }
    }
    @Override
    public void deckInsert(Deck deck, int id) {
        this.decks[id] = deck;
    }

    @Override
    public boolean checkCard(ICard card, int id) {
        int cardAttack = 0;
        if (card instanceof AttackCard) {
            cardAttack++;
            for (int i = 0; i < decks.length; i++) {
                for (ICard cardList : decks[i].getDeck()) {
                    if (cardList instanceof AttackCard) {
                        cardAttack++;
                    }
                    if (cardAttack > 34) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    @Override
    public boolean playerWin(Player player) {
        int playersDead = 0;
        for (Player playerList : players){
            if ( (playerList.getId() != player.getId()) && (!playerList.isAlive())){
                playersDead++;
            }
        }
        if (playersDead == players.length - 1){
            return true;
        } else {
            return false;
        }
    }
}
