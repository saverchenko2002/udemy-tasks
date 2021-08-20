package task_52;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        Moon moon1 = new Moon("deimos", 120.0);
        Moon moon2 = new Moon("deimos", 120.0);
        HeavenlyBody m1 = new Planet("Earth", 365.0);
        System.out.println(m1.addSatellite(moon1));
        System.out.println(m1.addSatellite(moon2));
        System.out.println(m1.getSatellites().toString());

        System.out.println(moon1.equals(moon2));
        System.out.println(moon1.getKey().hashCode()+":" + moon2.getKey().hashCode());

    }
}
