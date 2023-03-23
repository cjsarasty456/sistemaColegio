/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package personagui;

import model.personaConsulta;
import view.agregarPersonaFrame;
import view.listarPersonasFrame;
/**
 *
 * @author caliche
 */
public class PersonaGUI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //se va verificar que registra
        listarPersonasFrame frame=new listarPersonasFrame();
        frame.setVisible(true);
    }
    
}
