
import java.util.Stack;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HOME
 */
public class ArithmeticCalculator {
    private String inputExpression;
    private float result;
    
    ArithmeticCalculator(String s1) {
        inputExpression=s1;
        boolean f=validate();
    }
    
    boolean validate(){
        int l=inputExpression.length()-1;
        if(inputExpression.contains("++")||inputExpression.contains("+-")||inputExpression.contains("+*")||inputExpression.contains("+/")||inputExpression.contains("+.")||
                inputExpression.contains("-+")||inputExpression.contains("--")||inputExpression.contains("-*")||inputExpression.contains("-/")||inputExpression.contains("-.")||
                inputExpression.contains("*+")||inputExpression.contains("*-")||inputExpression.contains("**")||inputExpression.contains("*/")||inputExpression.contains("*.")||
                inputExpression.contains(".+")||inputExpression.contains(".-")||inputExpression.contains(".*")||inputExpression.contains("./")||inputExpression.contains("..")||
                inputExpression.contains("/+")||inputExpression.contains("/-")||inputExpression.contains("/*")||inputExpression.contains("//")||inputExpression.contains("/.")||
                (inputExpression.charAt(0)=='*')||(inputExpression.charAt(0)=='/')||(inputExpression.charAt(l)=='+')||(inputExpression.charAt(l)=='-')||(inputExpression.charAt(l)=='*')||
                (inputExpression.charAt(l)=='/')||(inputExpression.charAt(l)=='.')
                )
        {
            return false;
            
        }
        return true;	
    }
    
    float computeExpression() {
        /* Create stacks for operators and operands */

        Stack<Integer> op  = new Stack<Integer>();

        Stack<Double> val = new Stack<Double>();

        /* Create temporary stacks for operators and operands */

        Stack<Integer> optmp  = new Stack<Integer>();

        Stack<Double> valtmp = new Stack<Double>();
        inputExpression = "0" + inputExpression;

        inputExpression = inputExpression.replaceAll("-","+-");

        /* Store operands and operators in respective stacks */

        String temp = "";

        for (int i = 0;i < inputExpression.length();i++)

        {

            char ch = inputExpression.charAt(i);
            

            if (ch == '-') {

                temp = "-" + temp;
                
            }

            else if (ch != '+' &&  ch != '*' && ch != '/') {
                temp = temp + ch;
                
            }

            else

            {
                
                val.push(Double.parseDouble(temp));

                op.push((int)ch);

                temp = "";

            }

        }

        val.push(Double.parseDouble(temp));
        /* Create char array of operators as per precedence */

        /* -ve sign is already taken care of while storing */

        char operators[] = {'/','*','+'};

        /* Evaluation of expression */

        for (int i = 0; i < 3; i++)

        {

            boolean it = false;

            while (!op.isEmpty())

            {

                int optr = op.pop();

                double v1 = val.pop();

                double v2 = val.pop();

                if (optr == operators[i])
                {
                    /* if operator matches evaluate and store in temporary stack */

                    if (i == 0)

                    {

                        valtmp.push(v2 / v1);

                        it = true;

                        break;

                    }

                    else if (i == 1)

                    {

                        valtmp.push(v2 * v1);

                        it = true;

                        break;

                    }

                    else if (i == 2)

                    {

                        valtmp.push(v2 + v1);

                        it = true;

                        break;

                    }                                        

                }

                else

                {

                    valtmp.push(v1);

                    val.push(v2);

                    optmp.push(optr);

                }                

            }    

            /* Push back all elements from temporary stacks to main stacks */            

            while (!valtmp.isEmpty()) {
                val.push(valtmp.pop());
            }

            while (!optmp.isEmpty()) {
                op.push(optmp.pop());
            }

            /* Iterate again for same operator */

            if (it) {
                i--;
            }  
            

        }
        result = (float) +val.pop(); 
        return result;
    }    
}
