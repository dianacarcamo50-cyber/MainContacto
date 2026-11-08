/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Controlador;

import Modelo.Contacto;
import Vista.VentanaContacto;
import javax.swing.SwingUtilities;

/**
 * @author Garme
 */
public class MainContacto {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            VentanaContacto ventana = new VentanaContacto();
            ventana.setVisible(true);
        });
    }
}