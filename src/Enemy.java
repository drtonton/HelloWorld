/**
 * Created by noellemachin on 2/2/16.
 */
public class Enemy {
    public String name;
    public int health;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public boolean isKillable() {
        return isKillable;
    }

    public void setKillable(boolean killable) {
        isKillable = killable;
    }

    public boolean isKillable;
}
