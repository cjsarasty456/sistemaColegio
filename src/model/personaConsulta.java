/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author caliche
 */
public class personaConsulta {
    //dentro de la clase consulta se va incluir
    // las consultas necesarias de persona

    public static ArrayList<persona> listaPersona = new ArrayList<>();

    //método para agregar persona
    public static boolean agregarPersona(
            String Identificacion,
            String Nombre,
            String Apellido,
            int Edad
    ) {
        try {
            persona persona = new persona();
            persona.setIdentificacion(Identificacion);
            persona.setNombre(Nombre);
            persona.setApellido(Apellido);
            persona.setEdad(Edad);
            listaPersona.add(persona);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean modificarPersona(
            int indice,
            String Identificacion,
            String Nombre,
            String Apellido,
            int Edad
    ) {
        try {

            persona persona = new persona();
            persona.setIdentificacion(Identificacion);
            persona.setNombre(Nombre);
            persona.setApellido(Apellido);
            persona.setEdad(Edad);
            listaPersona.set(indice, persona);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    //método eliminar un registro
    public static boolean eliminarPersona(int indice) {
        try {
            listaPersona.remove(indice);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    //método para consultar un registro
    public static persona consultaPersona(int indice) {
        return listaPersona.get(indice);
    }

    //método para consultar la lista personas
    public static ArrayList consultaListaPersonas() {
        return listaPersona;
    }
}
