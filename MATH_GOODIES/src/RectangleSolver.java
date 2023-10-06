/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HOME
 */
public class RectangleSolver {
    private float length=0;
    private float width=0;
    private float area=0;
    private float perimeter=0;

    RectangleSolver(float input_length, float input_width) {
        length=input_length;
        width=input_width;
    }
    float computeParimeter() {
        perimeter=2*(length+width);
        return perimeter;
    }

    float computeArea() {
        area=length*width;
        return area;
    }
}
