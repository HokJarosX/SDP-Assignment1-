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
        private String milk;
        private boolean caneSugar;
        private boolean decoration;
        private int volume;

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
    }

    static class CoffeBuilder implements DrinkBuilder{
        private String milk;
        private boolean caneSugar;
        private boolean decoration;
        private int volume;

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
    }

}
