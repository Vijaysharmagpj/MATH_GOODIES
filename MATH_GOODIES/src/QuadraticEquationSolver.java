/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HOME
 */
public class QuadraticEquationSolver {
    private int a,b,c;
    private float root1,root2;
    private float sum_Of_Roots,product_Of_Roots;
    private int discriminant; 
    private String nature_Of_Roots;
    private double [] roots = new double[2];

    QuadraticEquationSolver(int A, int B, int C) {
        a=A;
        b=B;
        c=C;
        discriminant=((b*b)-(4*a*c));
    }
    double[] computeRoots() {
        root1=(float) ((((-1)*b)+Math.sqrt(discriminant))/(2*a));
        root2=(float) ((((-1)*b)-Math.sqrt(discriminant))/(2*a));
        roots[0]=root1;
        roots[1]=root2;
        return roots;
    }

    double sumOfRoots() {
        sum_Of_Roots=(-b)/a;
        return sum_Of_Roots;
    }

    double productOfRoots() {
        product_Of_Roots=c/a;
        return product_Of_Roots;
    }

    String natureOfRoots() {
        if(discriminant>0){nature_Of_Roots="roots are real";}
	if(discriminant<0){nature_Of_Roots="roots are imaginary";}
	if(discriminant==0){nature_Of_Roots="only one distinct root";}
        return nature_Of_Roots;
    }

    String compute_imaginary_roots() {
        String str=null;
        if(discriminant<0){
            int d1=(-1)*discriminant;
            float d2=(float) Math.sqrt(d1);
            float p=(float)((-1)*(float)(b))/(float)(2*a);
            float q=(float)(d2/(float)(2*a));
            str="Roots : Root1 = "+p+" + "+q+"(i)"+" and Root2 = "+p+" - "+q+"(i)";
        }
        return str;
    }
}
