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
}

public class App {
    public static void main(String[] args) throws Exception {
        Player char1 = new Player(); 
        char1.setName("Hajime");
        char1.setFood("Chocolate Moji");
        char1.setColor("Majenta");
        char1.walk(); 
        char1.Playing = "Uma Musume Pretty Derby"; 
        System.out.println(char1.Playing); 
        System.out.printf("I am %s, I love to eat %s and I like %s.", char1.getName(), char1.getFood(), char1.getColor()); 
    }
}
