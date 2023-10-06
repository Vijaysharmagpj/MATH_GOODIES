/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HOME
 */
class RhombusSolver {
    private float side_S;
    private float diagonal_p;
    private float diagonal_q;
    private float perimeter=0;
    private float area=0;

    RhombusSolver(float input_sideS, float input_diagonalP, float input_diagonalQ) {
        side_S=input_sideS;
        diagonal_p=input_diagonalP;
        diagonal_q=input_diagonalQ;
    }
    
    float computeParimeter() {
        perimeter=4*side_S;
        return perimeter;
    }

    float computeArea() {
        area=(diagonal_p*diagonal_p)/2;
        return area;
    }
}
