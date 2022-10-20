/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package formularios;

import Controller.Controller;
import View.JFLogin;

/**
 *
 * @author DIM SENA
 */
public class Formularios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFLogin ejecutar = new JFLogin();
        Controller sd = new Controller(ejecutar);
    }
}
