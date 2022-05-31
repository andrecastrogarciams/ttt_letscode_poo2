package exercicio_02;

public class Player {
    private int life;
    private boolean isAlive;
    private int id;


    public Player(int id) {
        this.life = 30;
        this.isAlive = true;
        this.id = id;
    }


    public int getLife() {
        return life;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public int getId() {
        return id;
    }
}
