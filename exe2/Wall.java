package exe2;

public class Wall implements Item{

    private final int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public void item(Humanoid humanoid) {
humanoid.jump(height);
    }
}
