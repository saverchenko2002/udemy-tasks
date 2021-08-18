package task_47;

import java.util.ArrayList;
import java.util.List;

public class Player implements ISaveable {
    private String name;
    private String weapon;

    private int hitPoints;
    private int strength;

    public Player(String name, int hitPoints, int strength) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
        weapon = "Sword";
    }

    @Override
    public List<String> write() {
        List<String> variablesToStore = new ArrayList<>();
        variablesToStore.add(this.name);
        variablesToStore.add(Integer.valueOf(this.hitPoints).toString());
        variablesToStore.add(Integer.valueOf(this.strength).toString());
        variablesToStore.add(this.weapon);
        return variablesToStore;
    }

    @Override
    public void read(List<String> storage) {
        if (storage != null && storage.size() > 0) {
            this.name = storage.get(0);
            this.hitPoints = Integer.parseInt(storage.get(1));
            this.strength = Integer.parseInt(storage.get(2));
            this.weapon = storage.get(3);
        }
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", hitPoints=" + hitPoints +
                ", strength=" + strength +
                ", weapon='" + weapon + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }
}
