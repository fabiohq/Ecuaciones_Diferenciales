/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.helpers;

import javax.swing.JOptionPane;
import org.lsmp.djep.djep.DJep;
import org.nfunk.jep.Node;

/**
 *
 * @author FABIO
 */
public class Utilidades {

    public static final double EULER = 2.71828;
    public static double factorial(double n) {
        double aux = 1;
        for (int i = 1; i <= n; i++) {
            aux += i;
        }
        return aux;
    }

    public static double euler(double n) {
        //int n =10;
        double s = 0;
        double t;
        for (double i = 0; i < n; i++) {
            if(n<1){
                i++;
            }
            t = 1 / factorial(i);
            s += t;
        }
        return s;
    }

    public static double logNatural(double n) {
        double ln = (Math.log10(n) / Math.log10(EULER));
        //  System.out.println("==> Logaritmo natural de "+n +" = "+ln);
        return ln;
    }

    private static String derivar(String funcion, String derivaConRespectoA) {

        String derivada = null;
        DJep derivar = new DJep();
        derivar.addStandardFunctions();//Permite agregar funciones estandar como seno, coseno, tangente
        derivar.addStandardConstants();//Permite añadir constantes como euler y pi
        derivar.addComplex();//Permite añadir numero complejos por si las derivadas los contienen
        derivar.setAllowUndeclared(true);//Permite añadir variables que no son declarables
        derivar.setAllowAssignment(true);//Permite asignaciones
        derivar.setImplicitMul(true);//Añadir reglas de la matematicas como primero una multiplicacion que una suma
        derivar.addStandardDiffRules();//Añadir reglas de las diferenciacion o derivadas

        try {
            Node node = derivar.parse(funcion.trim());//
            Node diff = derivar.differentiate(node, derivaConRespectoA);//se deriva con respecto a 
            Node sim = derivar.simplify(diff);//Se simplifica la derivada
            derivada = derivar.toString(sim);//Se retorna cadena de resultado ya simplificada
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR DE SINTAXIS", "ERROR", 2);
        }
        return derivada;
    }

    public static String derivarEnesimasVeces(String funcion, String derivaConRespectoA, int nSima) {
        String derivada = funcion;
        for (int i = 1; i <= nSima; i++) {
            derivada = derivar(derivada, derivaConRespectoA);
        }

        return derivada;
    }

//    public static void main(String[] g) {
//        //logNatural(1.125);
//        double i =  euler(10);
//        System.out.println("==> "+i);
//    }

    public static long fact(double x) {
        long prod = 1;
        for (int i = 0; i <= x; i++) {
            prod = prod * i;
        }
        return prod;
    }

    public static double euler_(double n) {
        double e = 0;
        for (double i = 0; i <= n; i++) {
            e = e + 1 / (double) (fact(i));
        }
        return e;
    }
}
