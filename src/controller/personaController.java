/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.ArrayList;
import model.persona;
import model.personaConsulta;

/**
 *
 * @author caliche
 */
public class personaController {

    public boolean guardarPersona(
            int indice,
            String identifiacion,
            String nombre,
            String apellido,
            int edad
    ) {
        if (indice >= 0) {
            //actualizar
            return personaConsulta.modificarPersona(
                    indice,
                    identifiacion,
                    nombre,
                    apellido,
                    edad);
        } else {
            //agregar
            return personaConsulta.agregarPersona(
                    identifiacion,
                    nombre,
                    apellido,
                    edad);
        }
    }

    public void eliminarPersona(int indice) {
        personaConsulta.eliminarPersona(indice);
    }

    public persona consultarPersona(int indice) {
        return personaConsulta.consultaPersona(indice);
    }

    public ArrayList consultarListaPersona() {
        return personaConsulta.consultaListaPersonas();
    }

}
