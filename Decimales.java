/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decimales;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

/**
 *
 * @author MelviSaavedra
 */
public class Decimales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Numeros Financieros
            BigDecimal a = new BigDecimal(""+1770.00);
            BigDecimal b = new BigDecimal(""+3.3169671);
            System.out.println("a ="+a);
            System.out.println("b ="+b);
           //HALF_DOWN Redondea hacia arriba solo si el decimal es > a 0.5
            BigDecimal resultadoDivision = a.divide(b,2,RoundingMode.HALF_DOWN);  
            System.out.print("Resultado Division : "+ resultadoDivision + "\n");
            
            BigDecimal resultadoSuma = a.add(b);  
            resultadoSuma = resultadoSuma.setScale(2, RoundingMode.HALF_DOWN);     
            System.out.print("Resultado Suma: "+resultadoSuma);
            
            
    }
    
}
