class Character {
    private String Name; 
    private String Food;
    private String Color;
    // private String Playing; -> Error. 
    // String Playing; -> Run 
    public String Playing; 

    public void setName(String name) {
        Name = name;
    }

    public void setFood(String food) {
        Food = food;
    }

    public void setColor(String color) {
        Color = color;
    }

    public String getName() {
        return Name;
    }

    public String getFood() {
        return Food;
    }

    public String getColor() {
        return Color;
    }
}

class Player extends Character {
    public void walk() {
        System.out.println("Player is walking."); 
 }
    
    public void talk() {
        System.out.println("Player is talking"); 
    }
}

class NonPlayer extends Character {
    public void talk() {
        System.out.println("NPC is talking."); 
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        // Create Player Object.
        Player char1 = new Player(); 
        char1.setName("Hajime");
        char1.setFood("Chocolate Moji");
        char1.setColor("Majenta");
        char1.walk(); 
        char1.Playing = "Uma Musume Pretty Derby";
        char1.talk();

        //Create NonPlayer Object. 
        NonPlayer npc1 = new NonPlayer();
        npc1.setName("Doukai");
        npc1.setFood("Kimchi"); 
        npc1.setColor("Green");
        npc1.Playing = "Warframe"; 
        npc1.talk(); 

        // Output. 
        System.out.println(char1.Playing);
        System.out.println(npc1.Playing);
        System.out.printf("I am %s, I love to eat %s and I like %s.\n", npc1.getName(), npc1.getFood(), npc1.getColor());  
        System.out.printf("I am %s, I love to eat %s and I like %s.\n", char1.getName(), char1.getFood(), char1.getColor()); 
    }
}
