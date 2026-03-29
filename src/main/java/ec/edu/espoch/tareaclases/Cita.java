/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espoch.tareaclases;

/**
 *
 * @author GALO VILLAMAR
 */
public class Cita {

    // Estos son atributos
    public int idCita;
    public int idPaciente;
    public int idMedico;
    public boolean citaConfirmada;

    // Estos son metodos
    public void confirmarCita() {
        citaConfirmada = true;
        System.out.println("Cita confirmada");
    }

    public void cancelarCita() {
        citaConfirmada = false;
        System.out.println("Cita cancelada");
    }

    public boolean medicoDisponible(int idMedico) {
        return true; // simplificado
    }
}