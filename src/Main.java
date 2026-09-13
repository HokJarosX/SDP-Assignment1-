public class Main {
    public static void main(String[] args){
        Drink order1 = new Drink.MilkTeaBuilder()
                .milk("Classic")
                .caneSugar(true)
                .build();

        Drink order2 = new DrinkDirector().signatureDrink(new Drink.MilkTeaBuilder());
        Drink order3 = new DrinkDirector().signatureDrink(new Drink.CoffeBuilder());

        System.out.println(order1);
        System.out.println(order2);
        System.out.println(order3);
    }
}
