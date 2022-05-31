package exercicio_02;

public class VersusBoard implements IBoard{

    private Player[] players;
    private Deck[] decks;

    public VersusBoard(Deck deckOne, Deck deckTwo, Player playerOne, Player playerTwo) {
        this.players = new Player[2]
        this.decks = new Deck[2];
        this.players[0] = playerOne;
        this.players[1] = playerTwo;

        if (deckOne.getDeck().length == 50){
            deckInsert(deckOne, 0);
        }
        if (deckTwo.getDeck().length == 50){
            deckInsert(deckTwo, 1);
        }
    }

    @Override
    public void deckInsert(Deck deck, int id) {
        this.decks[id] = deck;
    }

    @Override
    public boolean checkCard(ICard card, int id) {
        int cardAttack = 0;
        int cardSpecialAttack = 0;
        if (card instanceof AttackCard){
            cardAttack++;
        } else {
            cardSpecialAttack++;
        }
        for (ICard cardList : decks[id].getDeck()){
            if (cardList instanceof AttackCard) {
                cardAttack++;
            } else {
                cardSpecialAttack++;
            }
            if (cardAttack >5 || cardSpecialAttack > 2) {
                return false;
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
