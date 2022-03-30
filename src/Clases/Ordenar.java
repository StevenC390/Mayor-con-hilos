/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author Steven
 */
public class Ordenar implements Runnable{
    private int n;
    private int[] vector;
    private int i;
    private int f;
    private int mayor;

    public Ordenar() {
    }

    
    public Ordenar(int n, int[] vector, int i, int f) {
        this.n = n;
        this.vector = vector;
        this.i = i;
        this.f = f;
    }

    

    
    
    public void mayor(int[] vector, int i, int f){
	for(int j=i;j<=f;j++){
            if(vector[j]>mayor){
                this.mayor=vector[j];
            }
        }
    }
    

    @Override
    public void run() {
        mayor(vector,i,f);
        System.out.println("Terminado, mayor: " + this.mayor);
        
    }

    /**
     * @return the n
     */
    public int getN() {
        return n;
    }

    /**
     * @param n the n to set
     */
    public void setN(int n) {
        this.n = n;
    }

    /**
     * @return the vector
     */
    public int[] getVector() {
        return vector;
    }

    /**
     * @param vector the vector to set
     */
    public void setVector(int[] vector) {
        this.setVector(vector);
    }

    /**
     * @return the i
     */
    public int getI() {
        return i;
    }

    /**
     * @param i the i to set
     */
    public void setI(int i) {
        this.i = i;
    }

    /**
     * @return the f
     */
    public int getF() {
        return f;
    }

    /**
     * @param f the f to set
     */
    public void setF(int f) {
        this.f = f;
    }


    /**
     * @return the mayor
     */
    public int getMayor() {
        return mayor;
    }

    /**
     * @param mayor the mayor to set
     */
    public void setMayor(int mayor) {
        this.mayor = mayor;
    }
}
