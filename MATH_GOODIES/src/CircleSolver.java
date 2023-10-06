/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HOME
 */
public class CircleSolver {
    private float radius;
    private float diameter=0;
    private float perimeter=0;
    private float area;
    double pi=3.141592653589793;
    
    float computeParimeter(float input, String i) {
        if("diameter".equals(i)){
            diameter=input;
            perimeter=(float) (pi*diameter);
        }
        if("radius".equals(i)){
            radius=input;
            perimeter=(float) (2*pi*radius);
        }
        return perimeter;
    }

    float computeArea(float input, String i) {
        if("diameter".equals(i)){
            diameter=input;
            area=(float) ((pi*diameter*diameter)/4);
        }
        if("radius".equals(i)){
            radius=input;
            area=(float) (pi*radius*radius);
        }
        return area;
    }
}
