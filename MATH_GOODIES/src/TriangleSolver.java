/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HOME
 */
public class TriangleSolver {
    private float sideA=0;
    private float sideB=0;
    private float sideC=0;
    private float perimeter=0;
    private float area=0;
    private String type=null;
    private String status=null;
    private float array[] = new float[3];

    TriangleSolver(float input_sideA, float input_sideB, float input_sideC) {
        sideA=input_sideA;
        sideB=input_sideB;
        sideC=input_sideC;
        array[0]=sideA;
        array[1]=sideB;
        array[2]=sideC;
        int n=3;
        float swap=0;
        for (int c = 0; c < ( n - 1 ); c++) {
             for (int d = 0; d < n - c - 1; d++) {
                 if(array[d]>array[d+1]){
                     swap       = array[d];
                     array[d]   = array[d+1];
                     array[d+1] = swap;
                 }
             }
        }
    }

    

    String Triangle_inequality_theorem() {
        if(((array[0]+array[1])>array[2]) && ((array[1]+array[2])>array[0]) && ((array[0]+array[2])>array[1])){
            status="Successfully, able to create a triangle" ;
        }
        
        else if(((array[0]+array[1])<array[2])){
            status="Triangle Can Not Be Formed Because  "+ array[0]+"+"+array[1]+" ! >"+array[2] ;
        }
        
        else if(((array[1]+array[2])<array[0])){
            status="Triangle Can Not Be Formed Because  "+ array[1]+"+"+array[2]+" ! >"+array[0] ;
        }
        
        else if(((array[0]+array[2])<array[1])){
            status="Triangle Can Not Be Formed Because  "+ array[0]+"+"+array[2]+" ! >"+array[1] ;
        }
        
        else if(((array[0]+array[1])==array[2])){
            status="Triangle Can Not Be Formed Because  "+ array[0]+"+"+array[1]+" ! >"+array[2] ;
        }
        
        else if(((array[1]+array[2])==array[0])){
            status="Triangle Can Not Be Formed Because  "+ array[1]+"+"+array[2]+" ! >"+array[0] ;
        }
        
        else if(((array[0]+array[2])==array[1])){
            status="Triangle Can Not Be Formed Because  "+ array[0]+"+"+array[2]+" ! >"+array[1] ;
        }
        
        //else {
  //          status="Triangle Can Not Be Formed Because  "+ array[0]+"+"+array[1]+"<"+array[2] ;
    //    }
        
        return status;
    }

    float computeParimeter() {
        perimeter=sideA+sideB+sideC;
        return perimeter;
    }

    float computeArea() {
        double s=0;  // s->semiperimeter
        s=(sideA+sideB+sideC)/2;
        area=(float) Math.sqrt(s*(s-sideA)*(s-sideB)*(s-sideC));
        return area;
    }

    String computeType() {
        if((sideA==sideB) && (sideB==sideC)){
            type="Equilateral Triangle ";
        }
        
        else if((sideA==sideB) || (sideB==sideC) || (sideC==sideA)){
            type="Isosceles Triangle ";
        }
        
        else{
            type="Scalene Triangle ";
        }
        
        return type;
    }
}
