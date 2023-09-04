package exe2;
public abstract class Humanoid implements Effect{
    public String name;


    public abstract void run(int distance);
    public abstract void jump(int height);

    public Humanoid(String name) {
        this.name = name;
    }

}
