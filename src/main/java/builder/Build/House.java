package builder.Build;
public class House {
    private String walls;
    private String roof;
    private boolean hasGarage;
    private boolean hasSwimmingPool;
    private boolean hasFancyStatues;
    private boolean hasGarden;
    
    @Override
    public String toString() {
        return "House [walls=" + walls + ", roof=" + roof + ", hasGarage=" + hasGarage + ", hasSwimmingPool="
                + hasSwimmingPool + ", hasFancyStatues=" + hasFancyStatues + ", hasGarden=" + hasGarden + "]";
    }
    // Getters y setters
    public void setWalls(String walls) { this.walls = walls; }
    public void setRoof(String roof) { this.roof = roof; }
    public void setHasGarage(boolean hasGarage) { this.hasGarage = hasGarage; }
    public void setHasSwimmingPool(boolean hasSwimmingPool) { this.hasSwimmingPool = hasSwimmingPool; }
    public void setHasFancyStatues(boolean hasFancyStatues) { this.hasFancyStatues = hasFancyStatues; }
    public void setHasGarden(boolean hasGarden) { this.hasGarden = hasGarden; }

    public static BuilderHouse createHouse(){
        return new BuilderHouse(new House());
    }

    public static class BuilderHouse implements HouseBuilder{
        private House h;
        public BuilderHouse(House h){
            this.h = h;
        }
        @Override
        public HouseBuilder buildWalls(String type) {
            this.h.setWalls(type);
            return this;
        }
        @Override
        public HouseBuilder buildRoof(String type) {
            this.h.setRoof(type);
            return this;
        }
        @Override
        public HouseBuilder buildGarage(boolean hasGarage) {
            this.h.setHasGarage(hasGarage);
            return this;
        }
        @Override
        public HouseBuilder buildSwimmingPool(boolean hasSwimmingPool) {
            this.h.setHasSwimmingPool(hasSwimmingPool);
            return this;
        }
        @Override
        public HouseBuilder buildFancyStatues(boolean hasFancyStatues) {
           this.h.setHasFancyStatues(hasFancyStatues);
           return this;
        }
        @Override
        public HouseBuilder buildGarden(boolean hasGarden) {
            this.h.setHasGarden(hasGarden);
            return this;
        }
        @Override
        public House build() {
           return this.h;
        }
    }

    
} 

