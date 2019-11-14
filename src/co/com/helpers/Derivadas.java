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
public class Derivadas {
    private String derivar(String funcion, String derivaConRespectoA) {

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

    public String derivarEnesimasVeces(String funcion,String derivaConRespectoA,int nSima) {
        String derivada = funcion;
        for(int i = 1; i<= nSima;i++){
            derivada = derivar(derivada, derivaConRespectoA);
        }
        
        return derivada;
    }
}
