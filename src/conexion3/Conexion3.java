/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion3;
import interfaces3.Interfaz3;
import javax.swing.JFrame;
/**********************************************************************
 *
 *Mariane Muñoz Gonzalez
 * Fecha 10 de Noviembre 2017
 * @author LC22
 * Programa Conexion3
 * Responsabilidad Clase Principal
 * 
 *************************************************************************/
public class Conexion3
{
 
  public static void main(String[] args) 
    {
        Interfaz3 w = new Interfaz3();
        w.setVisible(true);
        w.setBounds(0, 0, 400, 400);
        w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }  
    
}
