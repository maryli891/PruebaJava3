/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces3;

import javax.swing.*;
import java.awt.*;

import bd.ConexionBD;
import java.sql.Connection;
import java.awt.event.*;
/***********************************************************************
 * Mariane Muñoz Gonzalez
 * Fecha 10 de Noviembre 2017
 * @author LC22
 * Programa Interfaz3
 * Responsabilidad Interfaz grafica
 ***********************************************************************/
public class Interfaz3 extends JFrame  
{
 JPanel panel;
 JLabel label;
 JTextField text;
 JButton boton1;
 JButton boton2;
 
 ConexionBD con;
 
 public Interfaz3()
 {
   panel = new JPanel();
  label = new JLabel();
  text = new JTextField (20);
  boton1 = new JButton();
  boton2 = new JButton();
  
  this.add(panel);
  panel.add(label);
  panel.add(text);
  panel.add(boton1);
  panel.add(boton2);
  
  label.setText("Base de Datos");
  boton1.setText("Conectar");
  boton2.setText("Desconectar");
  panel.setBackground(Color.GREEN);
     
 }
 
 
 
 
 
 
 
}

