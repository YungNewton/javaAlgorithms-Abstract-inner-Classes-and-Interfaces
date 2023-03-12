import java.util.ArrayList;
import java.util.List;

public class Monster implements ISaveable{
    private String name;
    private int hitPoints;
    private int strength;

    public Monster(String name, int hitPoints, int strength) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
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

    @Override
    public List<String> write() {
        List<String> it = new ArrayList<>();
        it.add(0,name);
        it.add(1,""+hitPoints);
        it.add(2,""+strength);
        return it;
    }

    @Override
    public void read(List<String> thing) {
        if (thing!=null&&thing.size()>0){
            name=thing.get(0);
            hitPoints=Integer.parseInt(thing.get(1));
            strength=Integer.parseInt(thing.get(2));
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
}

