/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebajava3;
import interfaces3.Interfaz3;
import javax.swing.JFrame;
/**********************************************************************
  *Mariane Muñoz Gonzalez
 * Fecha 10 de Noviembre 2017
 * @author LC22
 * Programa PruebaJava3
 * Responsabilidad Clase Principal
 * 
 ***************************************************S********************/
public class PruebaJava3 {

  
    public static void main(String[] args) {
       
        Interfaz3 ventana = new Interfaz3();
        
        ventana.setVisible(true);
        ventana.setBounds(0, 0, 400, 400);
        ventana.setTitle("Tercera Evaluacion Sumativa");
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
    }
    
}
