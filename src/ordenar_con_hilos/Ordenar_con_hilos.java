/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ordenar_con_hilos;

import Clases.Ordenar;

/**
 *
 * @author Steven
 */
public class Ordenar_con_hilos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] ordeneme = {16,5,5,8,7,1,3,8,4,57,5,7,5,1,5,4,53,21,5,21,5,35,45,45,68,4,568,5,46,4,12,3,854,5,46,84,8,4,65,4,84,684,586878,5468468,48463,5489468,78546,84,5154,68486,7};
        System.out.println(sacarmayor(ordeneme, 0,ordeneme.length-1));
        
    }
    public static int sacarmayor(int vector[],int i,int f){
        int mayor=0;
	if(i<f){
            Ordenar este1 = new Ordenar(vector.length, vector, i, (i+f)/2);
            Ordenar este2 = new Ordenar(vector.length, vector, ((i+f)/2)+1, f);
            
            este1.run();
            este2.run();
            if(este1.getMayor()>este2.getMayor()){
                mayor=este1.getMayor();
            }else{
                mayor=este2.getMayor();
            }
	}
        return mayor;
    }
    
}
