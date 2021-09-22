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
        System.out.println("Hello, World!");
    }
}
