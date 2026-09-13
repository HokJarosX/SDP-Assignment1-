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

    static class MilkTeaBuilder implements DrinkBuilder{
        private String milk = "Classic";
        private boolean caneSugar;
        private boolean decoration;
        private int volume = 300;

        public DrinkBuilder milk(String milk){
            this.milk = milk;
            return this;
        }

        public DrinkBuilder caneSugar(boolean caneSugar){
            this.caneSugar = caneSugar;
            return this;
        }

        public DrinkBuilder decoration(boolean decoration){
            this.decoration = decoration;
            return this;
        }

        public DrinkBuilder volume(int volume){
            this.volume = volume;
            return this;
        }

        public Drink build(){
            return new Drink("MilkTea", milk, caneSugar, decoration, volume);
        }
    }

    static class CoffeBuilder implements DrinkBuilder{
        private String milk = "Classic";
        private boolean caneSugar;
        private boolean decoration;
        private int volume = 300;

        public DrinkBuilder milk(String milk){
            this.milk = milk;
            return this;
        }

        public DrinkBuilder caneSugar(boolean caneSugar){
            this.caneSugar = caneSugar;
            return this;
        }

        public DrinkBuilder decoration(boolean decoration){
            this.decoration = decoration;
            return this;
        }

        public DrinkBuilder volume(int volume){
            this.volume = volume;
            return this;
        }

        public Drink build(){
            return new Drink("Коффе", milk, caneSugar, decoration, volume);
        }
    }

}
