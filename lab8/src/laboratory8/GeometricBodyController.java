package laboratory8;

import java.util.ArrayList;

public class GeometricBodyController {

    public GeometricBody maxSurface(ArrayList<GeometricBody> geometricBodies){
        GeometricBody max = null;
        for(GeometricBody geometricBody : geometricBodies){
            if(max == null || geometricBody.getSurface() > max.getSurface()){
                max = geometricBody;
            }
        }return max;
    }

    public GeometricBody maxVolume(ArrayList<GeometricBody> geometricBodies){
        GeometricBody max = null;
        for(GeometricBody geometricBody : geometricBodies){
            if(max == null || geometricBody.getVolume() > max.getVolume()){
                max = geometricBody;
            }
        } return max;
    }
}
