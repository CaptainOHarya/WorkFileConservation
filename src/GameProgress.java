import java.io.Serializable;

public class GameProgress implements Serializable {
    private static final long serialVersionUID = 1L;

    private int health;
    private int magic;
    private int weapons;
    private int lvl;
    private double distance;



    public GameProgress(int health, int magic, int weapons, int lvl, double distance) {
        super();
        this.health = health;
        this.magic = magic;
        this.weapons = weapons;
        this.lvl = lvl;
        this.distance = distance;
    }

    @Override
    public String toString() {
        return "GameProgress {" +
            "health=" + health +
            ", magic=" + magic +
            ", weapons=" + weapons +
            ", lvl=" + lvl +
            ", distance=" + distance +
            '}';
    }
}
