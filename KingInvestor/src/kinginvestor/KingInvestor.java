/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package kinginvestor;

/**
 *
 * @author srodgro
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;

public class KingInvestor extends JFrame {

    /**
     * Constructor de la clase. Inicializa la ventana y la interfaz de usuario.
     */
    JPanel panel = new JPanel();

    public KingInvestor() {
        // Crea un panel y añade un botón
        JButton startButton = new JButton("Start Game");
        panel.add(startButton);

        // Asigna un evento de clic al botón
        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Inicia el juego aquí
                startGame();
            }
        });

        add(panel);

        setTitle("King Investor");
        setSize(300, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    /**
     * Método para iniciar el juego.
     */
    private void startGame() {
        // Crea una tienda de ropa
        Business clothingStore = new Business("retail", "Fashion Avenue", 10000);

        // Muestra información sobre la tienda en la interfaz gráfica de usuario
        JLabel businessInfoLabel = new JLabel("Type: " + clothingStore.getType()
                + " Location: " + clothingStore.getLocation()
                + " Capital: " + clothingStore.getName());
        panel.add(businessInfoLabel);
    }

    public static void main(String[] args) {
        new KingInvestor();
    }
}
