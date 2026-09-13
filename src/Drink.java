public class Drink {
    private final String type;
    private final String milk;
    private final boolean caneSugar;
    private final boolean decoration;
    private final int volume;

    private Drink(String type, String milk, boolean caneSugar, boolean decoration, int volume){
        this.type = type;
        this.milk = milk;
        this.caneSugar = caneSugar;
        this.decoration = decoration;
        this.volume = volume;
    }
}
