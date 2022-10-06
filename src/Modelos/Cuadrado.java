/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

import java.awt.Color;

/**
 *
 * @author pipet
 */
public class Cuadrado extends FiguraEstandar{
    private int lado;


    public Cuadrado(int direccion,int x, int y, Color borde, Color colorRelleno,int lado) {
        super(direccion,x, y, borde, colorRelleno);
        this.lado = lado;
    }

    /**
     * @return the lado
     */
    public int getLado() {
        return lado;
    }

    /**
     * @param lado the lado to set
     */
    public void setLado(int lado) {
        this.lado = lado;
    }

    
    
}
