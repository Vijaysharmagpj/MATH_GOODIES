/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HOME
 */
public class ParallelogramSolver {
    
    private float side_b;
    private float side_c;
    private float height_h;
    private float perimeter=0;
    private float area=0;

    ParallelogramSolver(float input_sideB, float input_sideC, float input_heightH) {
        side_b=input_sideB;
        side_c=input_sideC;
        height_h=input_heightH;
    }

    float computeParimeter() {
        perimeter=2*(side_b+side_c);
        return perimeter;
    }

    float computeArea() {
        area=(side_b*height_h);
        return area;
    }
}
