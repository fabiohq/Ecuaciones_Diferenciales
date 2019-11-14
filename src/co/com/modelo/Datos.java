/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.modelo;

import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author FABIO
 */
public class Datos {

    private double poblacionInicial = 400000;
    private double poblacionFinal = 450000;
    private int tiempo = 3;
    private int aumentoPoblacion = 2;// indica que la poblacion se duplicará
    private int cantidadAnios = 10;//dato solicitado en la pregunta B: que población habrá en 10 años?
    private double pt = 0;
    private double k = 0;
    private double poblacion = 0;
    private double ln = 0;
    private double t = 0; //almacena la respuesta de la pregunta A
    private double poblacionAumentada = 0;
    private double paumendivpini = 0;// almacena la divicion entre poblacion aumentada y poblacion inicial
    private double lnpaumendivpini = 0;// almacena el logaritmo natural de la divicion entre poblacion aumentada y poblacion inicial
    private double kXt = 0;// Almacena el resultado de la multiplicacion k y t del punto B
    private double respuestaEulerkXt; //Almacena la respuesta del Euler de K por t
    private double respuestaB = 0;//respuesta final punto B
    
    
    DefaultCategoryDataset datosGrafica = new DefaultCategoryDataset();
    
    
    //METODOS GET AND SET
    public double getPoblacionInicial() {
        return poblacionInicial;
    }

    public void setPoblacionInicial(double poblacionInicial) {
        this.poblacionInicial = poblacionInicial;
    }

    public double getPoblacionFinal() {
        return poblacionFinal;
    }

    public void setPoblacionFinal(double poblacionFinal) {
        this.poblacionFinal = poblacionFinal;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    public int getAumentoPoblacion() {
        return aumentoPoblacion;
    }

    public void setAumentoPoblacion(int aumentoPoblacion) {
        this.aumentoPoblacion = aumentoPoblacion;
    }

    public int getCantidadAnios() {
        return cantidadAnios;
    }

    public void setCantidadAnios(int cantidadAnios) {
        this.cantidadAnios = cantidadAnios;
    }

    public double getPt() {
        return pt;
    }

    public void setPt(double pt) {
        this.pt = pt;
    }

    public double getK() {
        return k;
    }

    public void setK(double k) {
        this.k = k;
    }

    public double getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(double poblacion) {
        this.poblacion = poblacion;
    }

    public double getLn() {
        return ln;
    }

    public void setLn(double ln) {
        this.ln = ln;
    }

    public double getT() {
        return t;
    }

    public void setT(double t) {
        this.t = t;
    }

    public double getPoblacionAumentada() {
        return poblacionAumentada;
    }

    public void setPoblacionAumentada(double poblacionAumentada) {
        this.poblacionAumentada = poblacionAumentada;
    }

    public double getPaumendivpini() {
        return paumendivpini;
    }

    public void setPaumendivpini(double paumendivpini) {
        this.paumendivpini = paumendivpini;
    }

    public double getLnpaumendivpini() {
        return lnpaumendivpini;
    }

    public void setLnpaumendivpini(double lnpaumendivpini) {
        this.lnpaumendivpini = lnpaumendivpini;
    }

    public double getkXt() {
        return kXt;
    }

    public void setkXt(double kXt) {
        this.kXt = kXt;
    }

    public double getRespuestaEulerkXt() {
        return respuestaEulerkXt;
    }

    public void setRespuestaEulerkXt(double respuestaEulerkXt) {
        this.respuestaEulerkXt = respuestaEulerkXt;
    }

    public double getRespuestaB() {
        return respuestaB;
    }

    public void setRespuestaB(double respuestaB) {
        this.respuestaB = respuestaB;
    } 

    public DefaultCategoryDataset getDatosGrafica() {
        return datosGrafica;
    }

    public void setDatosGrafica(DefaultCategoryDataset datosGrafica) {
        this.datosGrafica = datosGrafica;
    }
    
}
