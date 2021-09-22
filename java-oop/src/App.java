class Character {
    String Name; 
    String Food;
    String Color;

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

public class App {
    public static void main(String[] args) throws Exception {
        Character char1 = new Character();
        char1.setName("Hajime");
        char1.setFood("Chocolate Moji");
        char1.setColor("Majenta");
        System.out.printf("I am %s, I love to eat %s and I like %s.", char1.getName(), char1.getFood(), char1.getColor()); 
    }
}
