public interface DrinkBuilder {
    DrinkBuilder milk(String milk);
    DrinkBuilder caneSugar(boolean caneSugar);
    DrinkBuilder decoration(boolean decoration);
    DrinkBuilder volume(int volume);
    Drink build();
}
