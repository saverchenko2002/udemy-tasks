package task_47;

import java.util.ArrayList;
import java.util.List;

public class Monster implements ISaveable {
    private String name;
    private int hitPoints;
    private int strength;

    public Monster(String name, int hitPoints, int strength) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
    }

    @Override
    public List<String> write() {
        List<String> variablesToStore = new ArrayList<>();
        variablesToStore.add(this.name);
        variablesToStore.add(Integer.valueOf(this.hitPoints).toString());
        variablesToStore.add(Integer.valueOf(this.strength).toString());
        return variablesToStore;
    }

    @Override
    public void read(List<String> storage) {
        if (storage != null && storage.size() > 0) {
            this.name = storage.get(0);
            this.hitPoints = Integer.parseInt(storage.get(1));
            this.strength = Integer.parseInt(storage.get(2));
        }
    }

    @Override
    public String toString() {
        return "Monster{" +
                "name='" + name + '\'' +
                ", hitPoints=" + hitPoints +
                ", strength=" + strength +
                '}';
    }

    public String getName() {
        return name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public int getStrength() {
        return strength;
    }
}
