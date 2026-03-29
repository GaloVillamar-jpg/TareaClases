/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espoch.tareaclases;

/**
 *
 * @author GALO VILLAMAR
 */
public class Paciente {

    // Estos son atributos
    public int idPaciente;
    public String nombrePaciente;
    public int fechaNacimiento;
    public String historialMedico;
    public String salud;
    public String alergia;
    public boolean seguroActivo;

    // Estos son metodos
    public void registrarse() {
        System.out.println("Paciente registrado");
    }

    public boolean alergias(String medicamento) {
        return alergia.contains(medicamento);
    }

    public void estado(String nuevoEstado) {
        salud = nuevoEstado;
    }
}
