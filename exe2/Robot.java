package exe2;

public class Robot extends NotAlive implements Effect{
    public int maxDistance;
    public int maxHeight;
    public boolean flag = true;

    public Robot(String name) {
        super(name);
    }

    public Robot(String name, int maxDistance, int maxHeight, boolean flag) {
        super(name);
        this.maxDistance = maxDistance;
        this.maxHeight = maxHeight;

    }

    public String toString() {
        return String.format("name: %s, distance: %d" + "m, height: %d" + "m;", this.name, maxDistance, maxHeight);
    }

    @Override
    public void run(int distance) {
        if (maxDistance<distance){
            flag=false;
            System.out.println(" дистанция не пройдена ");
        }
        else
            System.out.println( name + " прошел "  + distance);

    }

    @Override
    public void jump(int height) {
        if (maxHeight<height)
        {
            flag=false;
            System.out.println(" не прыгнул ");
        }
        else
            System.out.println(name + " прыгнул " + height);
    }

}
