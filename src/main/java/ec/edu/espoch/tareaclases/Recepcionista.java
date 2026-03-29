/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espoch.tareaclases;

/**
 *
 * @author GALO VILLAMAR
 */
public class Recepcionista {

    // Estos son atrubutos
    public String idRecepcionista;
    public String nombre;

    // Estos son metodos
    public void registrarPaciente(String paciente) {
        System.out.println("Paciente registrado: " + paciente);
    }

    public void hacerCita(int idPaciente, int idMedico) {
        System.out.println("Cita creada");
    }

    public void seguroPaciente(int idPaciente) {
        System.out.println("Verificando seguro");
    }
}
