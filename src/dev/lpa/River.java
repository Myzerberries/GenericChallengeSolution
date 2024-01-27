package dev.lpa;

public class River extends Line{

    private String name;

    public River(String name) {
        this.name = name;
    }

    public River(String name, double[][] locations) {
        super(locations);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setLocations(String stringLocation) {
        super.setLocations(stringLocation);
    }

    @Override
    public void render() {
        System.out.println("Render " + getName() + " as LINE"  + " ("+ super.locations()+")");
    }
}
