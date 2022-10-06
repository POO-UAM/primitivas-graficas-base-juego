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
public abstract class FiguraEstandar extends FiguraGeometrica{
    private int x;
    private int y;

    public FiguraEstandar(int direccion,int x, int y, Color borde, Color colorRelleno) {
        super(direccion,borde, colorRelleno);
        this.x = x;
        this.y = y;
    }

    public void moverDE(int distancia){
        this.x=this.x+distancia;
    }
    public void moverIZ(int distancia){
        this.x=this.x-distancia;
    }
    public void moverAR(int distancia){
        this.y=this.y-distancia;
    }
    public void moverAB(int distancia){
        this.y=this.y+distancia;
    }
    

    /**
     * @return the x
     */
    public int getX() {
        return x;
    }

    /**
     * @param x the x to set
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * @return the y
     */
    public int getY() {
        return y;
    }

    /**
     * @param y the y to set
     */
    public void setY(int y) {
        this.y = y;
    }
}
