package laboratory8;

import java.util.ArrayList;

public class main {
    public static void main(String[] strg) {

        Cube cube = new Cube(5);
        Sphere sphere = new Sphere(5);
        Parallelepiped parallelepiped = new Parallelepiped(5, 3, 4);

        ArrayList<GeometricBody> geometricBodies = new ArrayList<GeometricBody>();

        geometricBodies.add(0, cube);
        geometricBodies.add(1, sphere);
        geometricBodies.add(2, parallelepiped);

        GeometricBodyController maxBody = new GeometricBodyController();
        System.out.println("The biggest surface: " + maxBody.maxSurface(geometricBodies).getName());
        System.out.println("The biggest volume: " + maxBody.maxVolume(geometricBodies).getName());
    }
}
