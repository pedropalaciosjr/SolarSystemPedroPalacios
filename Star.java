public class Star extends CelestialBody {
    double luminosity;

    public void displayInfo() {
        System.out.printf("Star's name: %s\n Mass: %s\n Radius: %s\nLumionsity: %d", name, mass, radius, luminosity);
    }
}
