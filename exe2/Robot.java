package exe2;

public class Robot extends NotAlive implements Effect{
    public int maxDistance;
    public int maxHeight;
    public boolean flag;

        public Robot(String name, int maxDistance, int maxHeight) {
        super(name);
        this.maxDistance = maxDistance;
        this.maxHeight = maxHeight;
        this.flag= true;
    }

    public String toString() {
        return String.format("name: %s, distance: %d" + "m, height: %d" + "m;", this.name, maxDistance, maxHeight);
    }

    @Override
    public void run(int distance) {
        if (maxDistance<distance){
            flag=false;

        }
        if(flag)
            System.out.println( name + " прошел "  + distance);

    }

    @Override
    public void jump(int height) {
        if (maxHeight<height)
        {
            flag=false;

        }
       if(flag)
            System.out.println(name + " прыгнул " + height);



    }







}
