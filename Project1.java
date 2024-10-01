/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bouvier.project1;

import javax.swing.JOptionPane;

/**
 *
 * @author Project1, Federico Nicolás
 */
public class Project1 {

    public static void main(String[] args) {
        String nom, ape;
        nom = JOptionPane.showInputDialog("Por favor, ingrese su nombre:");
        ape = JOptionPane.showInputDialog("Ahora, escribe tu apellido:");
        JOptionPane.showMessageDialog(null, "Bienvenido "+nom+" "+ape+".");
    }
}
