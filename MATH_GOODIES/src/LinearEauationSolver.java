/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HOME
 */
public class LinearEauationSolver {
    private int a1,b1,c1,a2,b2,c2,p,q;
    private float x,y,r;
    String ans;

    
    LinearEauationSolver(int A1, int B1, int C1, int A2, int B2, int C2) {
        a1=A1;
        b1=B1;
        c1=C1;
        a2=A2;
        b2=B2;
        c2=C2;
    }
    String computeEquations() {
        if((a1==0) && (b1!=0) && (a2!=0) && (b2!=0)){
            y=(float)(c1)/(float)(b1);
            p=(b1*c2-b2*c1);
            q=a2*b1;
            x=(float)(p)/(float)(q);
            ans="Result : x = "+x+" and y = "+y;
        }
        else if((a2==0)  && (b1!=0) && (a1!=0) && (b2!=0)){
            y=(float)(c2)/(float)(b2);
            p=(b2*c1-b1*c2);
            q=a1*b2;
            x=(float)(p)/(float)(q);
            ans="Result : x = "+x+" and y = "+y;
        }
        else if((b1==0) && (a1!=0) && (a2!=0) && (b2!=0)){
            x=(float)(c1)/(float)(a1);
            p=(a1*c2-a2*c1);
            q=a1*b2;
            y=(float)(p)/(float)(q);
            ans="Result : x = "+x+" and y = "+y;
        }
        else if((b2==0) && (a1!=0) && (a2!=0) && (b1!=0)){
            x=(float)(c2)/(float)(a2);
            p=(a2*c1-a1*c2);
            q=a2*b1;
            y=(float)(p)/(float)(q);
            ans="Result : x = "+x+" and y = "+y;
        }
        else if((a1==0) && (b2==0) && (b1!=0) && (a2!=0)){
            y=(float)(c1)/(float)(b1);
            x=(float)(c2)/(float)(a2);
            ans="Result : x = "+x+" and y = "+y;
        }
        else if((a2==0) && (b1==0) && (b2!=0) && (a1!=0)){
            x=(float)(c1)/(float)(a1);
            y=(float)(c2)/(float)(b2);
            ans="Result : x = "+x+" and y = "+y;
        }
        /*else if(((a1==0) && (a2==0)) || ((b1==0) && (b2==0))){
            ans="Result : INVALID INPUT";
        }*/
        else if((a1!=0)&&(b1==0)&&(a2==0)&&(b2==0)){
            x=(float)(c1)/(float)(a1);
            ans="Result : x = "+x;
        }
        else if((b1!=0)&&(a1==0)&&(a2==0)&&(b2==0)){
            y=(float)(c1)/(float)(b1);
            ans="Result : y = "+y;
        }
        else if((a1==0)&&(b1==0)&&(a2!=0)&&(b2==0)){
            x=(float)(c2)/(float)(a2);
            ans="Result : x = "+x;
        }
        else if((a1==0)&&(b1==0)&&(a2==0)&&(b2!=0)){
            y=(float)(c2)/(float)(b2);
            ans="Result : y = "+y;
        }
        else{
            p=(b1*c2-b2*c1);q=(a2*b1-a1*b2);
            x = (float)(p)/(float)(q);
            r=(float)(c1)-(float)(a1)*x;
            y = r/(float)(b1);
            ans="Result : x = "+x+" and y = "+y;
        }
        return ans;
    }
}
