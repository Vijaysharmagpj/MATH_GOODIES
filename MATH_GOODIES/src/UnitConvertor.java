/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HOME
 */
public class UnitConvertor {
    private String Unit;
    private String from_unit;
    private String to_unit;
    private float value__of__from__unit;
    private float  value__of__to__unit;
    
    float convertUnit(String type_of_unit, String from__unit, String to__unit, float value_of_from_unit) {
        Unit=type_of_unit;
        from_unit=from__unit;
        to_unit=to__unit;
        value__of__from__unit=value_of_from_unit;
        if("Angle".equals(Unit)){
            if("Degree".equals(from_unit)){
                if("Degree".equals(to_unit)){
                    value__of__to__unit=1*value__of__from__unit;
                }
                else if("Gradian".equals(to_unit)){
                    value__of__to__unit=(float) (1.111111111111111*value__of__from__unit);
                }
                else if("Radian".equals(to_unit)){
                    value__of__to__unit=(float) (0.0174532925199433*value__of__from__unit);
                }
            }
            if("Gradian".equals(from_unit)){
                if("Degree".equals(to_unit)){
                    value__of__to__unit=(float) (0.9*value__of__from__unit);
                }
                else if("Gradian".equals(to_unit)){
                    value__of__to__unit=1*value__of__from__unit;
                }
                else if("Radian".equals(to_unit)){
                    value__of__to__unit=(float) (0.015707963267949*value__of__from__unit);
                }
            }
            if("Radian".equals(from_unit)){
                if("Degree".equals(to_unit)){
                    value__of__to__unit=(float) (57.29577951308233*value__of__from__unit);
                }
                else if("Gradian".equals(to_unit)){
                    value__of__to__unit=(float) (57.29577951308233*value__of__from__unit);
                }
                else if("Radian".equals(to_unit)){
                    value__of__to__unit=1*value__of__from__unit;
                }
            }   
        }
        if("Area".equals(Unit)){
            if("Arces".equals(from_unit)){
                if("Arces".equals(to_unit)){
                    value__of__to__unit=1*value__of__from__unit;
                }
                else if("Hectares".equals(to_unit)){
                    value__of__to__unit=(float) (0.40468564224*value__of__from__unit);
                }
                else if("Square Cenimeter".equals(to_unit)){
                    value__of__to__unit=(float) (40468564.224*value__of__from__unit);
                }
                else if("Square Feet".equals(to_unit)){
                    value__of__to__unit=43560*value__of__from__unit;
                }
                else if("Square Inch".equals(to_unit)){
                    value__of__to__unit=6272640*value__of__from__unit;
                }
                else if("Square Kilometer".equals(to_unit)){
                    value__of__to__unit=(float) (0.0040468564224*value__of__from__unit);
                }
                else if("Square Meter".equals(to_unit)){
                    value__of__to__unit=(float) (4046.8564224*value__of__from__unit);
                }
                else if("Square Mile".equals(to_unit)){
                    value__of__to__unit=(float) (0.0015625*value__of__from__unit);
                }
                else if("Square Milimeter".equals(to_unit)){
                    value__of__to__unit=(float) (4046856422.4*value__of__from__unit);
                }
            }
            if("Hectares".equals(from_unit)){
                if("Arces".equals(to_unit)){
                    value__of__to__unit=(float) (2.471053814671653*value__of__from__unit);
                }
                else if("Hectares".equals(to_unit)){
                    value__of__to__unit=1*value__of__from__unit;
                }
                else if("Square Cenimeter".equals(to_unit)){
                    value__of__to__unit=100000000*value__of__from__unit;
                }
                else if("Square Feet".equals(to_unit)){
                    value__of__to__unit=(float) (107639.1041670972*value__of__from__unit);
                }
                else if("Square Inch".equals(to_unit)){
                    value__of__to__unit=(float) (15500031.000062*value__of__from__unit);
                }
                else if("Square Kilometer".equals(to_unit)){
                    value__of__to__unit=(float) (0.01*value__of__from__unit);
                }
                else if("Square Meter".equals(to_unit)){
                    value__of__to__unit=10000*value__of__from__unit;
                }
                else if("Square Mile".equals(to_unit)){
                    value__of__to__unit=(float) (0.0038610215854245*value__of__from__unit);
                }
                else if("Square Milimeter".equals(to_unit)){
                    value__of__to__unit=(float) (1e10*value__of__from__unit);
                }
            }
            if("Square Cenimeter".equals(from_unit)){
                if("Arces".equals(to_unit)){
                    value__of__to__unit=(float) (2.471053814671653e-8*value__of__from__unit);
                }
                else if("Hectares".equals(to_unit)){
                    value__of__to__unit=(float) (0.00000001*value__of__from__unit);
                }
                else if("Square Cenimeter".equals(to_unit)){
                    value__of__to__unit=1*value__of__from__unit;
                }
                else if("Square Feet".equals(to_unit)){
                    value__of__to__unit=(float) (0.001076391041671*value__of__from__unit);
                }
                else if("Square Inch".equals(to_unit)){
                    value__of__to__unit=(float) (0.15500031000062*value__of__from__unit);
                }
                else if("Square Kilometer".equals(to_unit)){
                    value__of__to__unit=(float) (0.0000000001*value__of__from__unit);
                }
                else if("Square Meter".equals(to_unit)){
                    value__of__to__unit=(float) (0.0001*value__of__from__unit);
                }
                else if("Square Mile".equals(to_unit)){
                    value__of__to__unit=(float) (3.861021585424458e-11*value__of__from__unit);
                }
                else if("Square Milimeter".equals(to_unit)){
                    value__of__to__unit=100*value__of__from__unit;
                }
            }
            if("Square Feet".equals(from_unit)){
                if("Arces".equals(to_unit)){
                    value__of__to__unit=(float) (2.295684113865932e-5*value__of__from__unit);
                }
                else if("Hectares".equals(to_unit)){
                    value__of__to__unit=(float) (0.000009290304*value__of__from__unit);
                }
                else if("Square Cenimeter".equals(to_unit)){
                    value__of__to__unit=(float) (929.0304*value__of__from__unit);
                }
                else if("Square Feet".equals(to_unit)){
                    value__of__to__unit=1*value__of__from__unit;
                }
                else if("Square Inch".equals(to_unit)){
                    value__of__to__unit=144*value__of__from__unit;
                }
                else if("Square Kilometer".equals(to_unit)){
                    value__of__to__unit=(float) (0.00000009290304*value__of__from__unit);
                }
                else if("Square Meter".equals(to_unit)){
                    value__of__to__unit=(float) (0.09290304*value__of__from__unit);
                }
                else if("Square Mile".equals(to_unit)){
                    value__of__to__unit=(float) (3.587006427915519e-8*value__of__from__unit);
                }
                else if("Square Milimeter".equals(to_unit)){
                    value__of__to__unit=(float) (92903.04*value__of__from__unit);
                }
            }
            if("Square Inch".equals(from_unit)){
                if("Arces".equals(to_unit)){
                    value__of__to__unit=(float) (1.594225079073564e-7*value__of__from__unit);
                }
                else if("Hectares".equals(to_unit)){
                    value__of__to__unit=(float) (0.000000064516*value__of__from__unit);
                }
                else if("Square Cenimeter".equals(to_unit)){
                    value__of__to__unit=(float) (6.4516*value__of__from__unit);
                }
                else if("Square Feet".equals(to_unit)){
                    value__of__to__unit=(float) (0.0069444444444444*value__of__from__unit);
                }
                else if("Square Inch".equals(to_unit)){
                    value__of__to__unit=1*value__of__from__unit;
                }
                else if("Square Kilometer".equals(to_unit)){
                    value__of__to__unit=(float) (0.00000000064516*value__of__from__unit);
                }
                else if("Square Meter".equals(to_unit)){
                    value__of__to__unit=(float) (0.00064516*value__of__from__unit);
                }
                else if("Square Mile".equals(to_unit)){
                    value__of__to__unit=(float) (2.490976686052444e-10*value__of__from__unit);
                }
                else if("Square Milimeter".equals(to_unit)){
                    value__of__to__unit=(float) (645.16*value__of__from__unit);
                }
            }
            if("Square Kilometer".equals(from_unit)){
                if("Arces".equals(to_unit)){
                    value__of__to__unit=(float) (247.1053814671653*value__of__from__unit);
                }
                else if("Hectares".equals(to_unit)){
                    value__of__to__unit=100*value__of__from__unit;
                }
                else if("Square Cenimeter".equals(to_unit)){
                    value__of__to__unit=(float) (1e10*value__of__from__unit);
                }
                else if("Square Feet".equals(to_unit)){
                    value__of__to__unit=(float) (10763910.41670972*value__of__from__unit);
                }
                else if("Square Inch".equals(to_unit)){
                    value__of__to__unit=(float) (1550003100.0062*value__of__from__unit);
                }
                else if("Square Kilometer".equals(to_unit)){
                    value__of__to__unit=1*value__of__from__unit;
                }
                else if("Square Meter".equals(to_unit)){
                    value__of__to__unit=1000000*value__of__from__unit;
                }
                else if("Square Mile".equals(to_unit)){
                    value__of__to__unit=(float) (0.3861021585424458*value__of__from__unit);
                }
                else if("Square Milimeter".equals(to_unit)){
                    value__of__to__unit=(float) (1e12*value__of__from__unit);
                }
            }
            if("Square Meter".equals(from_unit)){
                if("Arces".equals(to_unit)){
                    value__of__to__unit=(float) (2.471053814671653e-4*value__of__from__unit);
                }
                else if("Hectares".equals(to_unit)){
                    value__of__to__unit=(float) (0.0001*value__of__from__unit);
                }
                else if("Square Cenimeter".equals(to_unit)){
                    value__of__to__unit=10000*value__of__from__unit;
                }
                else if("Square Feet".equals(to_unit)){
                    value__of__to__unit=(float) (10.76391041670972*value__of__from__unit);
                }
                else if("Square Inch".equals(to_unit)){
                    value__of__to__unit=(float) (1550.0031000062*value__of__from__unit);
                }
                else if("Square Kilometer".equals(to_unit)){
                    value__of__to__unit=(float) (0.000001*value__of__from__unit);
                }
                else if("Square Meter".equals(to_unit)){
                    value__of__to__unit=1*value__of__from__unit;
                }
                else if("Square Mile".equals(to_unit)){
                    value__of__to__unit=(float) (3.861021585424458e-7*value__of__from__unit);
                }
                else if("Square Milimeter".equals(to_unit)){
                    value__of__to__unit=1000000*value__of__from__unit;
                }
            }
            if("Square Mile".equals(from_unit)){
                if("Arces".equals(to_unit)){
                    value__of__to__unit=640*value__of__from__unit;
                }
                else if("Hectares".equals(to_unit)){
                    value__of__to__unit=(float) (258.9988110336*value__of__from__unit);
                }
                else if("Square Cenimeter".equals(to_unit)){
                    value__of__to__unit=(float) (25899881103.36*value__of__from__unit);
                }
                else if("Square Feet".equals(to_unit)){
                    value__of__to__unit=27878400*value__of__from__unit;
                }
                else if("Square Inch".equals(to_unit)){
                    value__of__to__unit=(float) (4.014489600e9*value__of__from__unit);
                }
                else if("Square Kilometer".equals(to_unit)){
                    value__of__to__unit=(float) (2.589988110336*value__of__from__unit);
                }
                else if("Square Meter".equals(to_unit)){
                    value__of__to__unit=(float) (2589988.110336*value__of__from__unit);
                }
                else if("Square Mile".equals(to_unit)){
                    value__of__to__unit=1*value__of__from__unit;
                }
                else if("Square Milimeter".equals(to_unit)){
                    value__of__to__unit=(float) (2.589988110336e12*value__of__from__unit);
                }
            }
            if("Square Milimeter".equals(from_unit)){
                if("Arces".equals(to_unit)){
                    value__of__to__unit=(float) (2.471053814671653e-10*value__of__from__unit);
                }
                else if("Hectares".equals(to_unit)){
                    value__of__to__unit=(float) (0.0000000001*value__of__from__unit);
                }
                else if("Square Cenimeter".equals(to_unit)){
                    value__of__to__unit=(float) (0.01*value__of__from__unit);
                }
                else if("Square Feet".equals(to_unit)){
                    value__of__to__unit=(float) (1.076391041670972e-5*value__of__from__unit);
                }
                else if("Square Inch".equals(to_unit)){
                    value__of__to__unit=(float) (0.0015500031000062*value__of__from__unit);
                }
                else if("Square Kilometer".equals(to_unit)){
                    value__of__to__unit=(float) (0.000000000001*value__of__from__unit);
                }
                else if("Square Meter".equals(to_unit)){
                    value__of__to__unit=(float) (0.000001*value__of__from__unit);
                }
                else if("Square Mile".equals(to_unit)){
                    value__of__to__unit=(float) (3.861021585424458e-13*value__of__from__unit);
                }
                else if("Square Milimeter".equals(to_unit)){
                    value__of__to__unit=1*value__of__from__unit;
                }
            }
        }
        if("Length".equals(Unit)){
            if("Centimeter".equals(from_unit)){
                if("Centimeter".equals(to_unit)){
                    value__of__to__unit=1*value__of__from__unit;
                }
                else if("Feet".equals(to_unit)){
                    value__of__to__unit=(float) (0.0328084*value__of__from__unit);
                }
                else if("Inch".equals(to_unit)){
                    value__of__to__unit=(float) (0.393701*value__of__from__unit);
                }
                else if("Kilometer".equals(to_unit)){
                    value__of__to__unit=(float) (0.00001*value__of__from__unit);
                }
                else if("Meter".equals(to_unit)){
                    value__of__to__unit=(float) (0.01*value__of__from__unit);
                }
                else if("Mile".equals(to_unit)){
                    value__of__to__unit=(float) (6.2137e-6*value__of__from__unit);
                }
                else if("Yard".equals(to_unit)){
                    value__of__to__unit=(float) (0.0109361*value__of__from__unit);
                }
            }
            if("Feet".equals(from_unit)){
                if("Centimeter".equals(to_unit)){
                    value__of__to__unit=(float) (30.48*value__of__from__unit);
                }
                else if("Feet".equals(to_unit)){
                    value__of__to__unit=1*value__of__from__unit;
                }
                else if("Inch".equals(to_unit)){
                    value__of__to__unit=12*value__of__from__unit;
                }
                else if("Kilometer".equals(to_unit)){
                    value__of__to__unit=(float) (0.0003048*value__of__from__unit);
                }
                else if("Meter".equals(to_unit)){
                    value__of__to__unit=(float) (0.3048*value__of__from__unit);
                }
                else if("Mile".equals(to_unit)){
                    value__of__to__unit=(float) (1.894e-4*value__of__from__unit);
                }
                else if("Yard".equals(to_unit)){
                    value__of__to__unit=(float) (0.33333*value__of__from__unit);
                }
            }
            if("Inch".equals(from_unit)){
                if("Centimeter".equals(to_unit)){
                    value__of__to__unit=(float) (2.54*value__of__from__unit);
                }
                else if("Feet".equals(to_unit)){
                    value__of__to__unit=(float) (0.08333*value__of__from__unit);
                }
                else if("Inch".equals(to_unit)){
                    value__of__to__unit=1*value__of__from__unit;
                }
                else if("Kilometer".equals(to_unit)){
                    value__of__to__unit=(float) (0.0000254*value__of__from__unit);
                }
                else if("Meter".equals(to_unit)){
                    value__of__to__unit=(float) (0.0254*value__of__from__unit);
                }
                else if("Mile".equals(to_unit)){
                    value__of__to__unit=(float) (1.578282828282828e-5*value__of__from__unit);
                }
                else if("Yard".equals(to_unit)){
                    value__of__to__unit=(float) (0.0277777777777778*value__of__from__unit);
                }
            }
            if("Kilometer".equals(from_unit)){
                if("Centimeter".equals(to_unit)){
                    value__of__to__unit=100000*value__of__from__unit;
                }
                else if("Feet".equals(to_unit)){
                    value__of__to__unit=(float) (3280.839895013123*value__of__from__unit);
                }
                else if("Inch".equals(to_unit)){
                    value__of__to__unit=(float) (39370.07874015748*value__of__from__unit);
                }
                else if("Kilometer".equals(to_unit)){
                    value__of__to__unit=1*value__of__from__unit;
                }
                else if("Meter".equals(to_unit)){
                    value__of__to__unit=1000*value__of__from__unit;
                }
                else if("Mile".equals(to_unit)){
                    value__of__to__unit=(float) (0.621371192237334*value__of__from__unit);
                }
                else if("Yard".equals(to_unit)){
                    value__of__to__unit=(float) (1093.613298337708*value__of__from__unit);
                }
            }
            if("Meter".equals(from_unit)){
                if("Centimeter".equals(to_unit)){
                    value__of__to__unit=100*value__of__from__unit;
                }
                else if("Feet".equals(to_unit)){
                    value__of__to__unit=(float) (3.280839895013123*value__of__from__unit);
                }
                else if("Inch".equals(to_unit)){
                    value__of__to__unit=(float) (39.37007874015748*value__of__from__unit);
                }
                else if("Kilometer".equals(to_unit)){
                    value__of__to__unit=(float) (0.001*value__of__from__unit);
                }
                else if("Meter".equals(to_unit)){
                    value__of__to__unit=1*value__of__from__unit;
                }
                else if("Mile".equals(to_unit)){
                    value__of__to__unit=(float) (6.21371192237334e-4*value__of__from__unit);
                }
                else if("Yard".equals(to_unit)){
                    value__of__to__unit=(float) (1.093613298337708*value__of__from__unit);
                }
            }
            if("Mile".equals(from_unit)){
                if("Centimeter".equals(to_unit)){
                    value__of__to__unit=(float) (160934.4*value__of__from__unit);
                }
                else if("Feet".equals(to_unit)){
                    value__of__to__unit=5280*value__of__from__unit;
                }
                else if("Inch".equals(to_unit)){
                    value__of__to__unit=63360*value__of__from__unit;
                }
                else if("Kilometer".equals(to_unit)){
                    value__of__to__unit=(float) (1.609344*value__of__from__unit);
                }
                else if("Meter".equals(to_unit)){
                    value__of__to__unit=(float) (1609.344*value__of__from__unit);
                }
                else if("Mile".equals(to_unit)){
                    value__of__to__unit=1*value__of__from__unit;
                }
                else if("Yard".equals(to_unit)){
                    value__of__to__unit=1760*value__of__from__unit;
                }
            }
            if("Yard".equals(from_unit)){
                if("Centimeter".equals(to_unit)){
                    value__of__to__unit=(float) (91.44*value__of__from__unit);
                }
                else if("Feet".equals(to_unit)){
                    value__of__to__unit=3*value__of__from__unit;
                }
                else if("Inch".equals(to_unit)){
                    value__of__to__unit=36*value__of__from__unit;
                }
                else if("Kilometer".equals(to_unit)){
                    value__of__to__unit=(float) (0.0009144*value__of__from__unit);
                }
                else if("Meter".equals(to_unit)){
                    value__of__to__unit=(float) (0.9144*value__of__from__unit);
                }
                else if("Mile".equals(to_unit)){
                    value__of__to__unit=(float) (5.681818181818182e-4*value__of__from__unit);
                }
                else if("Yard".equals(to_unit)){
                    value__of__to__unit=1*value__of__from__unit;
                }
            }
        }
        if("Temperature".equals(Unit)){
            if("Degrees Celsius".equals(from_unit)){
                if("Degrees Celsius".equals(to_unit)){
                    value__of__to__unit=1*value__of__from__unit;
                }
                else if("Degrees Fahrenheit".equals(to_unit)){
                    value__of__to__unit=(float) (33.8*value__of__from__unit);
                }
                else if("Kelvin".equals(to_unit)){
                    value__of__to__unit=(float) (274.15*value__of__from__unit);
                }
            }
            if("Degrees Fahrenheit".equals(from_unit)){
                if("Degrees Celsius".equals(to_unit)){
                    value__of__to__unit=(float) (-17.22222222222222*value__of__from__unit);
                }
                else if("Degrees Fahrenheit".equals(to_unit)){
                    value__of__to__unit=1*value__of__from__unit;
                }
                else if("Kelvin".equals(to_unit)){
                    value__of__to__unit=(float) (255.9277777777778*value__of__from__unit);
                }
            }
            if("Kelvin".equals(from_unit)){
                if("Degrees Celsius".equals(to_unit)){
                    value__of__to__unit=(float) (-272.15*value__of__from__unit);
                }
                else if("Degrees Fahrenheit".equals(to_unit)){
                    value__of__to__unit=(float) (-457.87*value__of__from__unit);
                }
                else if("Kelvin".equals(to_unit)){
                    value__of__to__unit=1*value__of__from__unit;
                }
            }   
        }
        if("Time".equals(Unit)){
            if("Day".equals(from_unit)){
                if("Day".equals(to_unit)){
                    value__of__to__unit=1*value__of__from__unit;
                }
                else if("Hours".equals(to_unit)){
                    value__of__to__unit=24*value__of__from__unit;
                }
                else if("Microsecond".equals(to_unit)){
                    value__of__to__unit=(float) (8.64e10*value__of__from__unit);
                }
                if("Millisecond".equals(to_unit)){
                    value__of__to__unit=86400000*value__of__from__unit;
                }
                else if("Minute".equals(to_unit)){
                    value__of__to__unit=1440*value__of__from__unit;
                }
                else if("Second".equals(to_unit)){
                    value__of__to__unit=86400*value__of__from__unit;
                }
                else if("Week".equals(to_unit)){
                    value__of__to__unit=(float) (0.1428571428571429*value__of__from__unit);
                }
            }
            if("Hours".equals(from_unit)){
                if("Day".equals(to_unit)){
                    value__of__to__unit=(float) (0.0416666666666667*value__of__from__unit);
                }
                else if("Hours".equals(to_unit)){
                    value__of__to__unit=1*value__of__from__unit;
                }
                else if("Microsecond".equals(to_unit)){
                    value__of__to__unit=(float) (3.6e9*value__of__from__unit);
                }
                if("Millisecond".equals(to_unit)){
                    value__of__to__unit=3600000*value__of__from__unit;
                }
                else if("Minute".equals(to_unit)){
                    value__of__to__unit=60*value__of__from__unit;
                }
                else if("Second".equals(to_unit)){
                    value__of__to__unit=3600*value__of__from__unit;
                }
                else if("Week".equals(to_unit)){
                    value__of__to__unit=(float) (0.005952380952381*value__of__from__unit);
                }
            }
            if("Microsecond".equals(from_unit)){
                if("Day".equals(to_unit)){
                    value__of__to__unit=(float) (1.157407407407407e-11*value__of__from__unit);
                }
                else if("Hours".equals(to_unit)){
                    value__of__to__unit=(float) (2.777777777777778e-10*value__of__from__unit);
                }
                else if("Microsecond".equals(to_unit)){
                    value__of__to__unit=1*value__of__from__unit;
                }
                if("Millisecond".equals(to_unit)){
                    value__of__to__unit=(float) (0.001*value__of__from__unit);
                }
                else if("Minute".equals(to_unit)){
                    value__of__to__unit=(float) (1.666666666666667e-8*value__of__from__unit);
                }
                else if("Second".equals(to_unit)){
                    value__of__to__unit=(float) (0.000001*value__of__from__unit);
                }
                else if("Week".equals(to_unit)){
                    value__of__to__unit=(float) (1.653439153439153e-12*value__of__from__unit);
                }
            }
            if("Millisecond".equals(from_unit)){
                if("Day".equals(to_unit)){
                    value__of__to__unit=(float) (1.157407407407407e-8*value__of__from__unit);
                }
                else if("Hours".equals(to_unit)){
                    value__of__to__unit=(float) (2.777777777777778e-7*value__of__from__unit);
                }
                else if("Microsecond".equals(to_unit)){
                    value__of__to__unit=1000*value__of__from__unit;
                }
                if("Millisecond".equals(to_unit)){
                    value__of__to__unit=1*value__of__from__unit;
                }
                else if("Minute".equals(to_unit)){
                    value__of__to__unit=(float) (1.666666666666667e-5*value__of__from__unit);
                }
                else if("Second".equals(to_unit)){
                    value__of__to__unit=(float) (0.001*value__of__from__unit);
                }
                else if("Week".equals(to_unit)){
                    value__of__to__unit=(float) (1.653439153439153e-9*value__of__from__unit);
                }
            }
            if("Minute".equals(from_unit)){
                if("Day".equals(to_unit)){
                    value__of__to__unit=(float) (6.944444444444444e-4*value__of__from__unit);
                }
                else if("Hours".equals(to_unit)){
                    value__of__to__unit=(float) (0.0166666666666667*value__of__from__unit);
                }
                else if("Microsecond".equals(to_unit)){
                    value__of__to__unit=60000000*value__of__from__unit;
                }
                if("Millisecond".equals(to_unit)){
                    value__of__to__unit=60000*value__of__from__unit;
                }
                else if("Minute".equals(to_unit)){
                    value__of__to__unit=1*value__of__from__unit;
                }
                else if("Second".equals(to_unit)){
                    value__of__to__unit=60*value__of__from__unit;
                }
                else if("Week".equals(to_unit)){
                    value__of__to__unit=(float) (9.920634920634921e-5*value__of__from__unit);
                }
            }
            if("Second".equals(from_unit)){
                if("Day".equals(to_unit)){
                    value__of__to__unit=(float) (1.157407407407407e-5*value__of__from__unit);
                }
                else if("Hours".equals(to_unit)){
                    value__of__to__unit=(float) (2.777777777777778e-4*value__of__from__unit);
                }
                else if("Microsecond".equals(to_unit)){
                    value__of__to__unit=1000000*value__of__from__unit;
                }
                if("Millisecond".equals(to_unit)){
                    value__of__to__unit=1000*value__of__from__unit;
                }
                else if("Minute".equals(to_unit)){
                    value__of__to__unit=(float) (0.0166666666666667*value__of__from__unit);
                }
                else if("Second".equals(to_unit)){
                    value__of__to__unit=(float) (274.15*value__of__from__unit);
                }
                else if("Week".equals(to_unit)){
                    value__of__to__unit=(float) (1.653439153439153e-6*value__of__from__unit);
                }
            }
            if("Week".equals(from_unit)){
                if("Day".equals(to_unit)){
                    value__of__to__unit=7*value__of__from__unit;
                }
                else if("Hours".equals(to_unit)){
                    value__of__to__unit=168*value__of__from__unit;
                }
                else if("Microsecond".equals(to_unit)){
                    value__of__to__unit=(float) (6.048e11*value__of__from__unit);
                }
                if("Millisecond".equals(to_unit)){
                    value__of__to__unit=604800000*value__of__from__unit;
                }
                else if("Minute".equals(to_unit)){
                    value__of__to__unit=10080*value__of__from__unit;
                }
                else if("Second".equals(to_unit)){
                    value__of__to__unit=604800*value__of__from__unit;
                }
                else if("Week".equals(to_unit)){
                    value__of__to__unit=1*value__of__from__unit;
                }
            }
        }
        if("Volume".equals(Unit)){
            if("Cubic Centimeter".equals(from_unit)){
                if("Cubic Centimeter".equals(to_unit)){
                    value__of__to__unit=1*value__of__from__unit;
                }
                else if("Cubic Feet".equals(to_unit)){
                    value__of__to__unit=(float) (3.531466672148859e-5*value__of__from__unit);
                }
                else if("Cubic Inch".equals(to_unit)){
                    value__of__to__unit=(float) (0.0610237440947323*value__of__from__unit);
                }
                if("Cubic Yard".equals(to_unit)){
                    value__of__to__unit=(float) (1.307950619314392e-6*value__of__from__unit);
                }
                else if("Liter".equals(to_unit)){
                    value__of__to__unit=(float) (0.001*value__of__from__unit);
                }
            }
            if("Cubic Feet".equals(from_unit)){
                if("Cubic Centimeter".equals(to_unit)){
                    value__of__to__unit=(float) (28316.846592*value__of__from__unit);
                }
                else if("Cubic Feet".equals(to_unit)){
                    value__of__to__unit=1*value__of__from__unit;
                }
                else if("Cubic Inch".equals(to_unit)){
                    value__of__to__unit=1728*value__of__from__unit;
                }
                if("Cubic Yard".equals(to_unit)){
                    value__of__to__unit=(float) (0.037037037037037*value__of__from__unit);
                }
                else if("Liter".equals(to_unit)){
                    value__of__to__unit=(float) (28.316846592*value__of__from__unit);
                }
            }
            if("Cubic Inch".equals(from_unit)){
                if("Cubic Centimeter".equals(to_unit)){
                    value__of__to__unit=1*value__of__from__unit;
                }
                else if("Cubic Feet".equals(to_unit)){
                    value__of__to__unit=(float) (5.787037037037037e-4*value__of__from__unit);
                }
                else if("Cubic Inch".equals(to_unit)){
                    value__of__to__unit=1*value__of__from__unit;
                }
                if("Cubic Yard".equals(to_unit)){
                    value__of__to__unit=(float) (2.143347050754458e-5*value__of__from__unit);
                }
                else if("Liter".equals(to_unit)){
                    value__of__to__unit=(float) (0.016387064*value__of__from__unit);
                }
            }
            if("Cubic Yard".equals(from_unit)){
                if("Cubic Centimeter".equals(to_unit)){
                    value__of__to__unit=(float) (764554.857984*value__of__from__unit);
                }
                else if("Cubic Feet".equals(to_unit)){
                    value__of__to__unit=27*value__of__from__unit;
                }
                else if("Cubic Inch".equals(to_unit)){
                    value__of__to__unit=46656*value__of__from__unit;
                }
                if("Cubic Yard".equals(to_unit)){
                    value__of__to__unit=1*value__of__from__unit;
                }
                else if("Liter".equals(to_unit)){
                    value__of__to__unit=(float) (764.554857984*value__of__from__unit);
                }
            }
            if("Liter".equals(from_unit)){
                if("Cubic Centimeter".equals(to_unit)){
                    value__of__to__unit=1000*value__of__from__unit;
                }
                else if("Cubic Feet".equals(to_unit)){
                    value__of__to__unit=(float) (0.0353146667214886*value__of__from__unit);
                }
                else if("Cubic Inch".equals(to_unit)){
                    value__of__to__unit=(float) (61.02374409473228*value__of__from__unit);
                }
                if("Cubic Yard".equals(to_unit)){
                    value__of__to__unit=(float) (0.0013079506193144*value__of__from__unit);
                }
                else if("Liter".equals(to_unit)){
                    value__of__to__unit=1*value__of__from__unit;
                }
            }
        }
        if("Weight".equals(Unit)){
            if("Gram".equals(from_unit)){
                if("Gram".equals(to_unit)){
                    value__of__to__unit=1*value__of__from__unit;
                }
                else if("Killogram".equals(to_unit)){
                    value__of__to__unit=(float) (0.001*value__of__from__unit);
                }
                else if("Milligram".equals(to_unit)){
                    value__of__to__unit=1000*value__of__from__unit;
                }
                if("Pounds".equals(to_unit)){
                    value__of__to__unit=(float) (0.00220462*value__of__from__unit);
                }
                else if("Stones".equals(to_unit)){
                    value__of__to__unit=(float) (0.000157473*value__of__from__unit);
                }
                else if("Tonne".equals(to_unit)){
                    value__of__to__unit=(float) (0.000001*value__of__from__unit);
                }
            }
            if("Killogram".equals(from_unit)){
                if("Gram".equals(to_unit)){
                    value__of__to__unit=1000*value__of__from__unit;
                }
                else if("Killogram".equals(to_unit)){
                    value__of__to__unit=(float) (3.531466672148859e-5*value__of__from__unit);
                }
                else if("Milligram".equals(to_unit)){
                    value__of__to__unit=(float) (1e6*value__of__from__unit);
                }
                if("Pounds".equals(to_unit)){
                    value__of__to__unit=(float) (2.20462*value__of__from__unit);
                }
                else if("Stones".equals(to_unit)){
                    value__of__to__unit=(float) (0.157473*value__of__from__unit);
                }
                else if("Tonne".equals(to_unit)){
                    value__of__to__unit=(float) (0.001*value__of__from__unit);
                }
            }
            if("Milligram".equals(from_unit)){
                if("Gram".equals(to_unit)){
                    value__of__to__unit=(float) (0.001*value__of__from__unit);
                }
                else if("Killogram".equals(to_unit)){
                    value__of__to__unit=(float) (1e-6*value__of__from__unit);
                }
                else if("Milligram".equals(to_unit)){
                    value__of__to__unit=1*value__of__from__unit;
                }
                if("Pounds".equals(to_unit)){
                    value__of__to__unit=(float) (2.2046e-6*value__of__from__unit);
                }
                else if("Stones".equals(to_unit)){
                    value__of__to__unit=(float) (1.5747e-7*value__of__from__unit);
                }
                else if("Tonne".equals(to_unit)){
                    value__of__to__unit=(float) (0.000000001*value__of__from__unit);
                }
            }
            if("Pounds".equals(from_unit)){
                if("Gram".equals(to_unit)){
                    value__of__to__unit=(float) (453.592*value__of__from__unit);
                }
                else if("Killogram".equals(to_unit)){
                    value__of__to__unit=(float) (0.453592*value__of__from__unit);
                }
                else if("Milligram".equals(to_unit)){
                    value__of__to__unit=453592*value__of__from__unit;
                }
                if("Pounds".equals(to_unit)){
                    value__of__to__unit=1*value__of__from__unit;
                }
                else if("Stones".equals(to_unit)){
                    value__of__to__unit=(float) (0.0714286*value__of__from__unit);
                }
                else if("Tonne".equals(to_unit)){
                    value__of__to__unit=(float) (0.00045359237*value__of__from__unit);
                }
            }
            if("Stones".equals(from_unit)){
                if("Gram".equals(to_unit)){
                    value__of__to__unit=(float) (6350.29*value__of__from__unit);
                }
                else if("Killogram".equals(to_unit)){
                    value__of__to__unit=(float) (6.35029*value__of__from__unit);
                }
                else if("Milligram".equals(to_unit)){
                    value__of__to__unit=(float) (6.35e+6*value__of__from__unit);
                }
                if("Pounds".equals(to_unit)){
                    value__of__to__unit=14*value__of__from__unit;
                }
                else if("Stones".equals(to_unit)){
                    value__of__to__unit=1*value__of__from__unit;
                }
                else if("Tonne".equals(to_unit)){
                    value__of__to__unit=(float) (0.00635029318*value__of__from__unit);
                }
            }
            if("Tonne".equals(from_unit)){
                if("Gram".equals(to_unit)){
                    value__of__to__unit=1000000*value__of__from__unit;
                }
                else if("Killogram".equals(to_unit)){
                    value__of__to__unit=1000*value__of__from__unit;
                }
                else if("Milligram".equals(to_unit)){
                    value__of__to__unit=1000000000*value__of__from__unit;
                }
                if("Pounds".equals(to_unit)){
                    value__of__to__unit=(float) (2204.623*value__of__from__unit);
                }
                else if("Stones".equals(to_unit)){
                    value__of__to__unit=(float) (157.473*value__of__from__unit);
                }
                else if("Tonne".equals(to_unit)){
                    value__of__to__unit=1*value__of__from__unit;
                }
            }
        }
        return value__of__to__unit;
    }
}
