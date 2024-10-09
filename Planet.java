import java.util.ArrayList;
import java.lang.Math;

public class Planet extends CelestrialBody implements Orbitable {
    double distanceFromStar;
    ArrayList<Moon> moons;
    ArrayList<String> moonNames;
    double GRAVITATIONAL_CONST;
    double mass;

    public Planet(String planetName, double starMass, double distanceFromStar) {
        moons = new ArrayList<>();
        moonNames = new ArrayList<>();
        GRAVITATIONAL_CONST = 6.674e-11;
        name = planetName;
        mass = starMass;
        this.distanceFromStar = distanceFromStar;
    }
    public double getOrbitalSpeed() {
        return calculateOrbitalSpeed();
    }
    public double getOrbitalPeriod() {
        return calculateOrbitalPeriod();
    }

    @Override
    public double calculateOrbitalSpeed() {
        return Math.sqrt(GRAVITATIONAL_CONST*mass / (distanceFromStar / 1000));
    }

    @Override
    public double calculateOrbitalPeriod() {
        return 2 * Math.PI * Math.sqrt(Math.pow(distanceFromStar, 3) / (GRAVITATIONAL_CONST * mass));
    }

    public ArrayList<String> getMoonNames() {
        for (Moon moon: moons) {
            moonNames.add(moon.name);
        }
        return moonNames;
    }

    @Override
    public void displayInfo() {
        System.out.printf("Planet's name: %s\nMass: %e\nRadius: %e\nMoons: %s\n", name, mass, radius, getMoonNames());
        System.out.println("Oribtal Speed: " + getOrbitalSpeed());
        System.out.println("Oribtal Period: " + getOrbitalPeriod());
    }

}
