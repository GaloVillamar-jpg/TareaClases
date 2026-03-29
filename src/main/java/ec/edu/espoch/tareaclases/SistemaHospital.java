/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espoch.tareaclases;

/**
 *
 * @author GALO VILLAMAR
 */
public class SistemaHospital {

    // Estos son atributos
    public Paciente[] pacientes;
    public Medico[] medicos;
    public Cita[] citas;
    public ExamenLaboratorio[] examenes;

    // Estos son metodos
    public Paciente obtenerPaciente(int idPaciente) {

        for (Paciente paciente : pacientes) {
            if (paciente != null && paciente.idPaciente == idPaciente) {
                return paciente;
            }
        }
        return null;
    }

    public Medico obtenerMedico(int idMedico) {

        for (Medico medico : medicos) {
            if (medico != null && medico.idMedico == idMedico) {
                return medico;
            }
        }
        return null;
    }

    public void registrarTransaccion(String transaccion) {
        System.out.println("Transacción: " + transaccion);
    }
}
