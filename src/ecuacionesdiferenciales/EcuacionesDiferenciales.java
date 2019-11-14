/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ecuacionesdiferenciales;

import co.com.helpers.Utilidades;

/**
 *
 * @author FABIO
 */
public class EcuacionesDiferenciales {

    public static double t = 0; //almacena la respuesta de la pregunta A

    /**
     * @param args the command line arguments
     */
    /*public static void main(String[] args) {
        //calcularPoblacion();
        crecimeintoPoblacional();
    }
     */
    public static void calcularPoblacion() {
        //Formula p(tiempo)= poblacionInicial(e)^(k(tiempo))
        System.out.println("La poblacion de una determinada colonia de bacterias es de 1000. Si el numero de bacterias"
                + "\nse duplica despues de 1 hora calcular"
                + "\na) El valor de la constante K"
                + "\nb) La poblacion cuando ha transcurrido una hora y media (Desde el inicio"
                + "\nc) En que momento la poblacion es de cuatro mil (4000) bacterias?)");
        int poblacion0 = 1000;
        int numeroVacterias;
        double tiempo = 1;//Horas
        int resultado;
        int poblacion1 = poblacion0 * 2;
        String poblacion = "Bacterias";

        System.out.println("Tiempo: t = " + tiempo + " Hora");
        System.out.println("Poblacion Inicial: p(0) = " + poblacion0 + " " + poblacion);
        System.out.println("Publacion transcurrido " + tiempo + " Hora: p(" + tiempo + ") = " + poblacion1 + " " + poblacion);
        System.out.println("Formula\np(t) = P0e^(k*t)\nReemplazamos valores en la formula");
        System.out.println("p(" + tiempo + ") = " + poblacion0 + "e^(k*" + tiempo + ") = " + poblacion1 + " " + poblacion);
        System.out.println("Despejamos e^k");
        System.out.println("Nos queda que e^k = " + poblacion1 + "/" + poblacion0 + "; e^k = " + poblacion1 / poblacion0);
        System.out.println("Despejamos K pasando Eular como logaritmo natural al otro lado de la igualdad");
        System.out.println("k = ln" + poblacion1 / poblacion0);
        System.out.println("Respuesta a: El valor de k es ln" + poblacion1 / poblacion0);

        tiempo = tiempo + (tiempo / 2);
        System.out.println("\nPregunta b) La poblacion cuando ha transcurrido una hora y media (Desde el inicio");
        System.out.println("Reemplazamos valores en la formula p(t)= " + poblacion0 + "e^((ln" + poblacion1 / poblacion0 + ")*t)");
        System.out.println("Como el enunciado b nos dice que en hora y media, tenemos que tiempo es = " + tiempo);
        System.out.println("Reemplazamos valores en la formula p(" + tiempo + ")= " + poblacion0 + "e^((ln" + poblacion1 / poblacion0 + ")*" + tiempo + ")");
        double ln = Utilidades.logNatural(poblacion1 / poblacion0);
        System.out.println("Logaritmo natural de " + poblacion1 / poblacion0 + " = " + ln);
        double exponente = ln * tiempo;
        System.out.println("rsultado de Logaritmo natural * tiempo = " + exponente);
        double euler = Utilidades.euler(exponente);
        System.out.println("Euler de " + exponente + " = " + euler);//Tiempo 4:58 https://www.youtube.com/watch?v=sKOHbx4UPTI
        System.out.println("P(" + tiempo + ") = " + euler * poblacion0);
    }

    public static String crecimeintoPoblacional(
            double poblacionInicial,
            int tiempo,
            double poblacionFinal,
            int aumentoPoblacion,
            int cantidadAnios) {
        /*
        El crecimiento de una ciudad es proporcional al número de habitantes que hay en un instante cualquiera
        si la poblacion inicial es de 400.000; y al cabo de 3 años es de 450.000
        A: cuanto tardará en duplicarse?
        B: que población habrá en 10 años?
         */

        //LA ECUACION DIFERENCIAL DP/DT = KP =>ESTÁ DADA POR LA ECUACION P(T) = P0e^(KT)
        /**
         * DATOS PROPORCIONADOS O CONOCIDOS p0 = 400.000 PARA T = 3 AÑOS, LA
         * POBLACION SE INCREMENTA EN 450.000 HABITANTES EN TONCES P=450.000
         *
         * PRIMERO CALCULAMOS LA CONSTANTE K EN LA SOLUCION DE LA ECUACION
         * DIFERENCIAL P(T) = P0e^(KT)
         *
         * P(T) = 450.000 = 400.000e^[(K)3] NOS QUEDA 450.000/400.000 = e^[(K)3]
         * 9/9=e^[(K)3] NECESITAMOS DESPEJAR K APLICANDO LN LN(9/8) =
         * LN(e^[(K)3]) Se cancela EULER con LN y queda LN(1.125) = 3K 0.1177830
         * = 3K DESPEJAMOS K NOS QUEDA 0.1177830/3 = K 0.03926 = K LA FORMULA
         * P(T) = P0e^(KT) NOS QUEDA LA ED DE LA SIGUIENTE MANERA P(T) =
         * 400.000e^0.03926t
         *
         * INICIAMOS RESPUESTA A: cuanto tardará en duplicarse? como la
         * poblacion inicial es 400.000 el doble es 800.000 LA FORMULA P(T) =
         * P0e^(KT) NOS QUEDA 800.000 = 400.000e^0.03926t PASAMOS EL 400.000 A
         * DIVIDIR Y NOS QUEDA 800.000/400.000 = e^0.03926t 2 = e^0.03926t
         * APLICAMOS LN PARA REDUYCIR EULER LN(2) = LN(e^0.03926t) 0.6931471 =
         * 0.03926t DESPEJAMOS T NOS QUEDA 0.6931471 / 0.03926 = t 17.65530056 =
         * t RESPUESTA A: EL TIEMPO QUE SE TARDARÁ EN DUPLICAR LA POBLACION ES
         * DE 17.65530056 AÑOS
         *
         * INICIAMOS RESPUESTA B: que población habrá en 10 años? LA FORMULA
         * P(T) = P0e^(KT) NOS QUEDA P(T) = 400.000e^0.03926t
         *
         * DATOS CONOCIDOS P = 400.000e^0.03926t T = 10 AÑOS LA ECUACION NOS
         * QUEDA P = 400.000e^0.03926(10) P = 400.000e^0.3926 P =
         * 400.000(1.4808) P = 592.330 RESPUESTA B: LA POBLACION EN 10 AÑOS SERA
         * APROXIMADAMENTE 592.300 HANITANTES
         *
         * UNA FORMA DE VALIDA ES QUE EN 10 AÑOS VA ALCANZAR MENOS POBLACION QUE
         * EN 17.655 AÑOS EL 17.655 ES LA RESPUESTA DEL PUNTO A
         */
        /*
        double poblacionInicial = 400000;
        int tiempo = 3;
        double poblacionFinal = 450000;
        int aumentoPoblacion = 2;// indica que la poblacion se duplicará
        int cantidadAnios = 10;//dato solicitado en la pregunta B: que población habrá en 10 años?
         */
        double pt = 0;
        double k = 0;
        double poblacion = 0;
        double ln = 0;
        //double t = 0; //almacena la respuesta de la pregunta A
        double poblacionAumentada = 0;
        double paumendivpini = 0;// almacena la divicion entre poblacion aumentada y poblacion inicial
        double lnpaumendivpini = 0;// almacena el logaritmo natural de la divicion entre poblacion aumentada y poblacion inicial
        double kXt = 0;// Almacena el resultado de la multiplicacion k y t del punto B
        double respuestaEulerkXt; //Almacena la respuesta del Euler de K por t
        double respuestaB = 0;//respuesta final punto B
        String mensaje = null;
        //PROCESO CALCULAR CONSTANTE K DE LA FORMULA P(T) = P0e^(KT)
        //pt = poblacionInicial*(Math.pow(Utilidades.EULER, (k*tiempo)));
        poblacion = poblacionFinal / poblacionInicial;
        ln = Utilidades.logNatural(poblacion);
        k = ln / tiempo;

        //P(T) = 400.000e^0.03926t
        //donde pt debe ser igual a la poblacion final o sea 450000
        pt = poblacionInicial * (Math.pow(Utilidades.EULER, (k * tiempo)));

        //respuesta A
        poblacionAumentada = poblacionInicial * aumentoPoblacion;
        //FORMULA P(T) = P0e^(KT) NOS QUEDA
        //800.000 = 400.000e^0.03926t
        paumendivpini = poblacionAumentada / poblacionInicial;
        lnpaumendivpini = Utilidades.logNatural(paumendivpini);
        t = (lnpaumendivpini / k);
        //Si la poblacion final es menor que la inicial es por que decrece por lo tanto modificamos las conversiones
        //para mostrar un mensaje claro al cliente
        if (poblacionInicial > poblacionFinal) {
            mensaje = "Si en " + tiempo + " año(s)|la población paso de " + (int) poblacionInicial + " a " + (int) poblacionFinal + ""
                    + "|en menos de un año| la poblacion decrecio a la mitad";
        } else if ((poblacionFinal / 2) == poblacionInicial) {//Si se duplica en un año modificamos el mensaje
            mensaje = "En solo " + tiempo + " año(s)|la población se duplico"
                    + "|pasando de " + "|" + (int) poblacionInicial + " a " + (int) poblacionFinal;
        } else if (t < 1) {//realizamos conversiones en caso que el tiempo sea menor a uno
            t = (12 / 1) * t;
            mensaje = "Si en " + tiempo + " año(s)|la población paso de " + (int) poblacionInicial + " a " + (int) poblacionFinal + ""
                    + "|en " + (int) t + " meses " + "| se duplico";
        } else {
            mensaje = "Si en " + tiempo + " año(s)|la población paso de " + (int) poblacionInicial + " a " + (int) poblacionFinal + ""
                    + "|en " + (int) t + " años " + "|posible mente se habrá dublicado";
        }
        System.out.println(mensaje);

        /*respuesta B
         * LA FORMULA P(T) = P0e^(KT) NOS QUEDA
         * P(T) = 400.000e^0.03926t     
         */
        kXt = k * cantidadAnios;
        respuestaEulerkXt = Utilidades.euler(kXt);
        respuestaB = respuestaEulerkXt * poblacionInicial;
        if (poblacionFinal > 0) {
            mensaje = mensaje + "|y en " + cantidadAnios + " años|la poblacion sera aproximandamente de " + (poblacionInicial + respuestaB);
            System.out.println("==> La poblacion en " + cantidadAnios + " Años sera aproximadamente de " + (poblacionInicial + respuestaB));
        }
        return mensaje;
    }

}
