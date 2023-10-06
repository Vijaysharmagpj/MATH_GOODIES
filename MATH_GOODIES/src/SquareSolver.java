/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HOME
 */
class SquareSolver {
    private float side=0;
    private float area=0;
    private float perimeter=0;

    SquareSolver(float input_side) {
        side=input_side;
    }
    float computeParimeter() {
        perimeter=4*side;
        return perimeter;
    }

    float computeArea() {
        area=side*side;
        return area;
    }
}
