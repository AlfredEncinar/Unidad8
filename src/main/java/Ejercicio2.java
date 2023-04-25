//Realizar una “calculadora” en la que se introduzcan dos números.
// Además dispondrá de dos botones, uno de suma y otro de resta.
// Al pulsarlos se presentará el resultado correspondiente a esa operación.

import javax.swing.*;


public class Ejercicio2 {

    public static void main(String[] args) {

        // Crear la ventana y los componentes
        JFrame ventana = new JFrame("Calculadora");
        JLabel etiquetaNumero1 = new JLabel("Introduce el primer número:");
        JLabel etiquetaNumero2 = new JLabel("Introduce el segundo número:");
        JTextField campoNumero1 = new JTextField(10);
        JTextField campoNumero2 = new JTextField(10);
        JButton botonSumar = new JButton("Sumar");
        JButton botonRestar = new JButton("Restar");
        JLabel etiquetaResultado = new JLabel("El resultado es:");
        JTextField campoResultado = new JTextField(10);

        // Añadir los componentes a la ventana
        ventana.getContentPane().setLayout(new BoxLayout(ventana.getContentPane(), BoxLayout.Y_AXIS));
        ventana.getContentPane().add(etiquetaNumero1);
        ventana.getContentPane().add(campoNumero1);
        ventana.getContentPane().add(etiquetaNumero2);
        ventana.getContentPane().add(campoNumero2);
        ventana.getContentPane().add(botonSumar);
        ventana.getContentPane().add(botonRestar);
        ventana.getContentPane().add(etiquetaResultado);
        ventana.getContentPane().add(campoResultado);

        // Configurar la acción del botón Sumar
        botonSumar.addActionListener(e -> {
            try {
                double numero1 = Double.parseDouble(campoNumero1.getText());
                double numero2 = Double.parseDouble(campoNumero2.getText());
                double resultado = numero1 + numero2;
                campoResultado.setText(Double.toString(resultado));
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(ventana, "Los valores introducidos no son numéricos", "Error", JOptionPane.ERROR_MESSAGE);
            }
        });

        // Configurar la acción del botón Restar
        botonRestar.addActionListener(e -> {
            try {
                double numero1 = Double.parseDouble(campoNumero1.getText());
                double numero2 = Double.parseDouble(campoNumero2.getText());
                double resultado = numero1 - numero2;
                campoResultado.setText(Double.toString(resultado));
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(ventana, "Los valores introducidos no son numéricos", "Error", JOptionPane.ERROR_MESSAGE);
            }
        });

        // Configurar la ventana y mostrarla
        ventana.pack();
        ventana.setLocationRelativeTo(null);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setVisible(true);


    }

}
