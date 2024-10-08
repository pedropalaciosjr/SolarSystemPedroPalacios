import java.util.ArrayList;
import java.lang.Math;

public class Planet extends CelestrialBody implements Orbitable {
    double distanceFromStar;
    ArrayList<Moon> moons;
    double GRAVITATIONAL_CONST;
    double starMass;

    public Planet(double starMass, double distanceFromStar) {
        moons = new ArrayList<>();
        mass = starMass;
        radius = distanceFromStar;
        GRAVITATIONAL_CONST = 6.674e-11;
    }

    @Override
    public double calculateOrbitalSpeed() {
        return Math.sqrt(GRAVITATIONAL_CONST*starMass / (distanceFromStar / 1000));
    }

    @Override
    public double calculateOrbitalPeriod() {
        return 2 * Math.PI * Math.sqrt(Math.pow(distanceFromStar, 3) / (GRAVITATIONAL_CONST * starMass));
    }

    @Override
    public void displayInfo() {
        System.out.printf("Planet's name: %s\nMass: %e\nRadius: %e\nMoons: %s\n", name, mass, radius, moons.toString());
    }

}
