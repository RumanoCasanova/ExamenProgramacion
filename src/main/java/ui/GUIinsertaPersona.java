package ui;

import entities.Persona;

import javax.swing.*;

public class GUIinsertaPersona extends JFrame {
    private JTextPane textPane1;
    private JTextField inputNombre;
    private JTextField inputTelefono;
    private JButton añadirButton;
    public GUIinsertaPersona (Persona persona){
        setSize(400,400);
        textPane1.setText(String.valueOf(persona.getNombre()));
        inputNombre.setText(String.valueOf(persona.getNombre()));
        inputTelefono.setText(String.valueOf(persona.getTelefono()));
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
}
