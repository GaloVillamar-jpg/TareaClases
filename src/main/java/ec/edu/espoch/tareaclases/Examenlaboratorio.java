/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espoch.tareaclases;

/**
 *
 * @author GALO VILLAMAR
 */
public class ExamenLaboratorio {

    // Estos son atributos
    public int idExamen;
    public int idPaciente;
    public String tipoExamen;
    public boolean muestra;
    public String resultado;
    public boolean terminado;

    // Estos son metodos
    public boolean procesarExamen() {
        terminado = true;
        return true;
    }

    public void subirResultado(String resultado) {
        this.resultado = resultado;
    }

    public boolean estaListo() {
        return terminado;
    }
}
