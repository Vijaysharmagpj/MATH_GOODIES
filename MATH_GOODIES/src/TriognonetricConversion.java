/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HOME
 */
class TriognonetricConversion {
    
    float degree_sin_conversion(float theta) {
        return (float)Math.sin(Math.toRadians(theta));
    }

    float degree_cos_conversion(float theta) {
        return (float)Math.cos(Math.toRadians(theta));
    }

    float degree_tan_conversion(float theta) {
        return (float)Math.tan(Math.toRadians(theta));
    }

    float radian_sin_conversion(float theta) {
        return (float)Math.sin(theta);
    }

    float radian_cos_conversion(float theta) {
        return (float)Math.cos(theta);
    }

    float radian_tan_conversion(float theta) {
        return (float)Math.tan(theta);
    }
}
