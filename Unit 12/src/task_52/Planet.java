package task_52;

public class Planet extends HeavenlyBody {
    public Planet(String name, double orbitalPeriod) {
        super(name, orbitalPeriod, BodyTypes.PLANET);
    }

    @Override
    public boolean addSatellite(HeavenlyBody heavenlyBody) {
        if (heavenlyBody.getKey().getBodyType().equals(BodyTypes.MOON)) {
            return super.addSatellite(heavenlyBody);
        }
        return false;
    }
}
