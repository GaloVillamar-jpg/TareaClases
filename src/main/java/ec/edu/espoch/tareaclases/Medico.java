/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espoch.tareaclases;

/**
 *
 * @author GALO VILLAMAR
 */
public class Medico {

    // Estos son atributos
    public int idMedico;
    public String nombreMedico;
    public String especialidad;
    public boolean desocupado;

    // Estos son metodos
    public void revisarPaciente(int idPaciente) {
        System.out.println("Revisando paciente");
    }

    public void tratamiento(int idPaciente) {
        System.out.println("Tratamiento aplicado");
    }

    public void examenLaboratorio(int idPaciente) {
        System.out.println("Examen solicitado");
    }
}
