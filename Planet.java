import java.util.ArrayList;
import java.lang.Math;

public class Planet extends CelestrialBody implements Orbitable {
    double distanceFromStar;
    ArrayList<Moon> moons;
    double GRAVITATIONAL_CONST;

    public Planet(double mass, double distanceFromStar) {
        super.
        this.starMass = starMass;
        this.distanceFromStar = distanceFromStar;
        GRAVITATIONAL_CONST = 6.674e-11;
    }

    public double calculateOrbitalSpeed() {
        return Math.sqrt(GRAVITATIONAL_CONST*starMass / (distanceFromStar / 1000));
    }
    
    public double calculateOrbitalPeriod() {
        return 2 * Math.PI * Math.sqrt(Math.pow(distanceFromStar, 3) / (GRAVITATIONAL_CONST * starMass));
    }

    public void displayInfo() {
        System.out.printf("Planet's name: %s\nMass: %d\nRadius: %d\nMoons: %d\nOrbital Info: %s")
    }
}
