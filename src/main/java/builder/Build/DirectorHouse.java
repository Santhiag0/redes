
package builder.Build;

/**
 * DirectorHouse
 */
public class DirectorHouse {
    private HouseBuilder house;

    public DirectorHouse(HouseBuilder house) {
        this.house = house;
    }

    public House createLuxuryHouse(){
        return this.house.buildGarden(true)
                         .buildFancyStatues(true)
                         .buildWalls("Diamont")
                         .buildFancyStatues(true)
                         .build();
    }


    
}