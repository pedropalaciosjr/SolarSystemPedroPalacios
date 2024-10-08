import java.util.ArrayList;

public class SolarSystem {
    static ArrayList<Planet> solarSystem;

    public static void addPlanetToSystem(Planet planet) {
        solarSystem.add(planet);
    }
    public static void addMoonToPlanet(Planet planet, Moon moon) {
        planet.moons.add(moon);
    }

    public static void main(String[] args) {
        solarSystem = new ArrayList<>();
        Planet earth = new Planet(5e9, 3e23);
        Moon moon = new Moon(1e6, 1e8, 2e2);
        addMoonToPlanet(earth, moon);
        earth.displayInfo();
        addPlanetToSystem(earth);


    }
}
