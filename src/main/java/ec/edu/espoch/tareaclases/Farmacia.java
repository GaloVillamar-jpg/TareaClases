/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espoch.tareaclases;

/**
 *
 * @author GALO VILLAMAR
 */
public class Farmacia {

    // Estos son atributos
    public int idFarmacia;
    public String medicamento;
    public String receta;

    // Estos son metodos
    public boolean entregarMedicamento(int idReceta) {
        System.out.println("Medicamento entregado");
        return true;
    }

    public boolean procesarReceta(int idReceta) {
        System.out.println("Receta procesada");
        return true;
    }
}
