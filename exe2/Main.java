package exe2;

public class Main {
    public static void main(String[] args) {



        Humanoid [] humanoid = {
                new Human(" Иван", 2000, 2),
                new Cat(" Кот_Борис", 1200, 2),
                new Robot("Терминатор", 4000, 1)
        };

        Item[] items = {
                new Treadmill(3000),
                new Wall(1),


        };

        for (Humanoid humanoid1 : humanoid) {
            for (Item item1 : items) {

                item1.item(humanoid1);
            }            
        }
        
        


    }
 



}








