/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espoch.tareaclases;

/**
 *
 * @author GALO VILLAMAR
 */
public class Medicamentos {

    // Estos son atributos
    public int idMedicamento;
    public String nombreMedicamento;
    public int disponible;

    // Estos son metodos
    public boolean hayStock(int cantidad) {
        return disponible >= cantidad;
    }

    public boolean reducirStock(int cantidad) {
        if (disponible >= cantidad) {
            disponible -= cantidad;
            return true;
        }
        return false;
    }
}
