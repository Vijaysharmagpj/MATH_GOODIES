/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HOME
 */
public class BaseConvertor {
    private String from_unit;
    private String to_unit;
    private int value__of__from__unit;
    String str;

    String convertUnit(String from__unit, String to__unit, String value_of_from_unit) {
        from_unit=from__unit;
        to_unit=to__unit;
        String convertedNum = "";str=value_of_from_unit;
        value__of__from__unit=Integer.parseInt(value_of_from_unit);
        if("Decimal".equals(from_unit)){
            int base=0;
            if("Binary".equals(to_unit)){
                    base=2;
                    char[] array = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A',
                'B', 'C', 'D', 'E', 'F' };
                    do {
                        convertedNum += array[value__of__from__unit % base];
                        value__of__from__unit = value__of__from__unit / base;
                    } while (value__of__from__unit != 0);
                    convertedNum = new StringBuilder(convertedNum).reverse().toString();
                }
            else if("Decimal".equals(to_unit)){
                    base=10;
                    char[] array = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A',
                'B', 'C', 'D', 'E', 'F' };
                    
                    do {
                        convertedNum += array[value__of__from__unit % base];
                        value__of__from__unit = value__of__from__unit / base;
                    } while (value__of__from__unit != 0);
                    convertedNum = new StringBuilder(convertedNum).reverse().toString();
                }
            else if("Hexadecimal".equals(to_unit)){
                    base=16;
                    char[] array = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A',
                'B', 'C', 'D', 'E', 'F' };
                    do {
                        convertedNum += array[value__of__from__unit % base];
                        value__of__from__unit = value__of__from__unit / base;
                    } while (value__of__from__unit != 0);
                    convertedNum = new StringBuilder(convertedNum).reverse().toString();
                }
            else if("Octal".equals(to_unit)){
                    base=8;
                    char[] array = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A',
                'B', 'C', 'D', 'E', 'F' };
                    do {
                        convertedNum += array[value__of__from__unit % base];
                        value__of__from__unit = value__of__from__unit / base;
                    } while (value__of__from__unit != 0);
                    convertedNum = new StringBuilder(convertedNum).reverse().toString();
                }
        }
        
        else if("Hexadecimal".equals(from_unit)){
            int decimal;System.out.println(value__of__from__unit);
            int  hexadecimal=Integer.parseInt(String.valueOf(value__of__from__unit),16);
            if("Decimal".equals(to_unit)){
                String hexNumber =str;//String.valueOf(value__of__from__unit);
                decimal = Integer.parseInt(hexNumber, 16);
                convertedNum=String.valueOf(decimal);
            }
            else if("Binary".equals(to_unit)){
                String binary= Integer.toBinaryString(hexadecimal);
                convertedNum=binary;
            }
            else if("Octal".equals(to_unit)){
                String hexNumber =String.valueOf(value__of__from__unit);
                decimal = Integer.parseInt(hexNumber, 16);
                String octal = Integer.toOctalString(decimal);
                convertedNum=octal;
            }
            else{
                convertedNum=String.valueOf(value__of__from__unit);
            }
        } 
        else if("Binary".equals(from_unit)){
            if("Decimal".equals(to_unit)){
                String strBinaryNumber=String.valueOf(value__of__from__unit);
                 int decimalNumber = Integer.parseInt(strBinaryNumber,2);
                 convertedNum=String.valueOf(decimalNumber);
            }
            else if("Hexadecimal".equals(to_unit)){
                String strBinaryNumber=String.valueOf(value__of__from__unit);
                 int decimalNumber = Integer.parseInt(strBinaryNumber,2);
                 String hexa = Integer.toHexString(decimalNumber);
                 convertedNum=String.valueOf(hexa);
            }
            else if("Octal".equals(to_unit)){
                String strBinaryNumber=String.valueOf(value__of__from__unit);
                 int decimalNumber = Integer.parseInt(strBinaryNumber,2);
                 String hexa = Integer.toOctalString(decimalNumber);
                 convertedNum=String.valueOf(hexa);
            }
            else{
                convertedNum=String.valueOf(value__of__from__unit);
            }
        }
        else if("Octal".equals(from_unit)){
            if("Decimal".equals(to_unit)){
                String strBinaryNumber=String.valueOf(value__of__from__unit);
                 int decimalNumber = Integer.parseInt(strBinaryNumber,8);
                 convertedNum=String.valueOf(decimalNumber);
            }
            else if("Hexadecimal".equals(to_unit)){
                String strBinaryNumber=String.valueOf(value__of__from__unit);
                 int decimalNumber = Integer.parseInt(strBinaryNumber,8);
                 String hexa = Integer.toHexString(decimalNumber);
                 convertedNum=String.valueOf(hexa);
            }
            else if("Binary".equals(to_unit)){
                String strBinaryNumber=String.valueOf(value__of__from__unit);
                 int decimalNumber = Integer.parseInt(strBinaryNumber,8);
                 String binary = Integer.toBinaryString(decimalNumber);
                 convertedNum=String.valueOf(binary);
            }
            else{
                convertedNum=String.valueOf(value__of__from__unit);
            }
        }
        return convertedNum;
    
    }
    
}
