import java.lang.Math;

public class Moon implements Orbitable {
    public final double distanceFromPlanet;
    private final double distanceFromStar;
    private final double GRAVITATIONAL_CONST;
    private final double mass;
    String name;

    public Moon(String name, double distanceFromPlanet, double distanceFromStar, double mass) {
        this.distanceFromPlanet = distanceFromPlanet;
        this.GRAVITATIONAL_CONST = 6.674e-11;
        this.distanceFromStar = distanceFromStar;
        this.mass = mass;
        this.name = name;
    }

    @Override
    public double calculateOrbitalPeriod() {
        return 2 * Math.PI * Math.sqrt(Math.pow(distanceFromStar, 3) / (GRAVITATIONAL_CONST * mass));      
    }

    @Override
    public double calculateOrbitalSpeed() {
        return Math.sqrt(GRAVITATIONAL_CONST * mass / (distanceFromStar / 1000));
    }
}
