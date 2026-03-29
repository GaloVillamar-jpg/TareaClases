/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espoch.tareaclases;

/**
 *
 * @author GALO VILLAMAR
 */
public class Receta {

    // Estos son atributos
    public int idReceta;
    public int idPaciente;
    public int idMedico;
    public int idMedicamento;
    public String dosis;

    // Estos son metodos
    public boolean esValida() {
        return true;
    }

    public void generarReceta() {
        System.out.println("Receta generada");
    }
}