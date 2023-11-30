package Guis;
import javax.swing.*;
import java.awt.*;

public class GuiPlayers extends JFrame {
    private JLabel numeroLabel;
    private JLabel nombreLabel;
    private JLabel posicionLabel;
    private JButton volverButton;

    public GuiPlayers(String pais) {
        setTitle("Jugadores de " + pais);
        setSize(400, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        numeroLabel = new JLabel();
        nombreLabel = new JLabel();
        posicionLabel = new JLabel();
        volverButton = new JButton("Volver");

        setLayout(new FlowLayout());
        add(numeroLabel);
        add(nombreLabel);
        add(posicionLabel);
        add(volverButton);

        volverButton.addActionListener(e -> this.dispose());
    }
}
