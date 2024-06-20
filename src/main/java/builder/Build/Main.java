package builder.Build;

public class Main {
    public static void main(String[] args) {

        House houseCustomize = House.createHouse()
                               .buildGarage(true)
                               .buildRoof("huh?")
                               .buildWalls("madera xd")
                               .build();
        System.out.println(houseCustomize);


        HouseBuilder houseDirector = House.createHouse();
        DirectorHouse director = new DirectorHouse(houseDirector);
        System.out.println("Casa de lujo\n" + director.createLuxuryHouse());
    }   

    
}
