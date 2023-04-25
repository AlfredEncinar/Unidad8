//Realiza un programa para calcular el área
// de un triángulo según su base y su altura.
// La interfaz debe ser como la que se muestra a continuación
// y responder de un modo análogo
//Crea además test en JUnit para comprobar que
// todo funciona correctamente.
//  Recuerda lo que vimos en entornos de
//  desarrollo a la hora de diseñar test.

import javax.swing.*;


public class Ejercicio1 {

    public static void main(String[] args) {

        // Crear la ventana y los componentes
        JFrame ventana = new JFrame("Calcular Área");
        JLabel etiquetaBase = new JLabel("Introduce la base del triángulo:");
        JLabel etiquetaAltura = new JLabel("Introduce la altura del triángulo:");
        JTextField campoBase = new JTextField(10);
        JTextField campoAltura = new JTextField(10);
        JButton botonCalcular = new JButton("Calcular");

        // Añadir los componentes a la ventana
        ventana.getContentPane().setLayout(new BoxLayout(ventana.getContentPane(), BoxLayout.Y_AXIS));
        ventana.getContentPane().add(etiquetaBase);
        ventana.getContentPane().add(campoBase);
        ventana.getContentPane().add(etiquetaAltura);
        ventana.getContentPane().add(campoAltura);
        ventana.getContentPane().add(botonCalcular);

        // Configurar la acción del botón Calcular
        botonCalcular.addActionListener(e -> {
            double base = Double.parseDouble(campoBase.getText());
            double altura = Double.parseDouble(campoAltura.getText());
            double area = base * altura / 2.0;
            JOptionPane.showMessageDialog(ventana, "El área del triángulo es " + area, "Resultado", JOptionPane.INFORMATION_MESSAGE);
        });

        // Configurar la ventana y mostrarla
        ventana.pack();
        ventana.setLocationRelativeTo(null);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setVisible(true);


    }

}


