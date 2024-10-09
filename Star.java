public class Star extends CelestrialBody {
    double luminosity;
    String name;
    double mass;
    double radius;

    public Star(String name, double mass, double radius, double luminosity) {
        this.name = name;
        this.mass = mass;
        this.radius = radius;
        this.luminosity = luminosity;
    }
    public void displayInfo() {
        System.out.printf("Star's name: %s\n Mass: %s\n Radius: %s\nLumionsity: %e", name, mass, radius, luminosity);
    }
}
