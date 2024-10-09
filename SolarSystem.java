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
        Star sun = new Star("Sun", 1.989e33, 1.2e8,9e5);
        solarSystem = new ArrayList<>();
        Planet titania = new Planet("titania", 3e56, 2e4);
        Planet foxtrous = new Planet ("foxtrous", 3e6, 2e5);
        Planet sterno = new Planet("sterno", 2e4, 3e8);
        Planet palacios = new Planet("palacios", 235e23, 23e8);

        Moon moon = new Moon("The Moon", 1e6, 1e8, 2e2);
        Moon tetra = new Moon("tetra", 23e5, 2e4, 3e5);
        Moon jolo = new Moon("jolo", 2e5, 8e6, 3e6);
        Moon urelius = new Moon("urelius", 3e7, 2e8, 3e7);
        Moon yohn = new Moon("yohn", 2e7, 5e8, 3e8);
        Moon iodide = new Moon("iodide", 2e5, 6e3, 8e6);
        Moon grasp = new Moon("grasp", 2e5, 3e7, 8e7);
        Moon tedious = new Moon("tedious", 2e6, 6e7, 2e3);
    
        addMoonToPlanet(titania, moon);
        addMoonToPlanet(foxtrous, jolo);
        addMoonToPlanet(titania, tetra);
        addMoonToPlanet(foxtrous, jolo);
        addMoonToPlanet(sterno, iodide);
        addMoonToPlanet(palacios, tedious);
        addMoonToPlanet(palacios, grasp);
        addMoonToPlanet(palacios, urelius);
        addMoonToPlanet(palacios, yohn);
        sun.displayInfo();
        
        addPlanetToSystem(titania);
        addPlanetToSystem(foxtrous);
        addPlanetToSystem(sterno);
        addPlanetToSystem(palacios);

        for (Planet planet: solarSystem) {
            planet.displayInfo();
        }
    
    }
}
