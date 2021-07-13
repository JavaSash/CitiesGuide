public class City {
    private String name;
    private String region;
    private String district;
    private int population;
    private String foundation;

    public City(String name, String region, String district, String population, String foundation) {
        this.name = name;
        this.region = region;
        this.district = district;
        this.population = Integer.parseInt(population);
        this.foundation = foundation;
    }

    @Override
    public String toString() {
        return "City{name='" + name +
                "', region='" + region +
                "', district='" + district +
                "', population=" + population +
                ", foundation='" + foundation +
                "'}\n";
    }
}