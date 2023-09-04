package exe2;

public class Treadmill implements Item{

    private final int distance;

    public Treadmill(int distance) {
        this.distance = distance;
    }

    @Override
    public void item(Humanoid humanoid) {
humanoid.run(distance);
    }
}
