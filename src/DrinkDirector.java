public class DrinkDirector {
    public Drink signatureDrink(DrinkBuilder builder){
        return builder
                .volume(500)
                .milk("Coconut")
                .caneSugar(true)
                .decoration(true)
                .build();
    }

    public Drink standartDrink(DrinkBuilder builder){
        return builder
                .volume(300)
                .milk("Classic")
                .caneSugar(false)
                .decoration(false)
                .build();
    }
}
