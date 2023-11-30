package Guis;
import javax.swing.*;
import java.awt.*;

public class GuiTeams extends JFrame {
    private JComboBox<String> paisComboBox;
    private JLabel banderaLabel;
    private JLabel rankingLabel;
    private JButton playersButton;
    private JButton salirButton;

    public GuiTeams() {
        setTitle("FIFA Ranking");
        setSize(400, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        paisComboBox = new JComboBox<>();
        banderaLabel = new JLabel();
        rankingLabel = new JLabel();
        playersButton = new JButton("Jugadores");
        salirButton = new JButton("Salir");

        setLayout(new FlowLayout());
        add(paisComboBox);
        add(banderaLabel);
        add(rankingLabel);
        add(playersButton);
        add(salirButton);
        paisComboBox.addItem("Chile");
        paisComboBox.addItem("Australia");
        paisComboBox.addItem("Alemania");
        paisComboBox.addItem("Camerún");

        playersButton.addActionListener(e -> openPlayersWindow());
        salirButton.addActionListener(e -> System.exit(0));
    }

    public void openPlayersWindow() {
        String paisSeleccionado = (String) paisComboBox.getSelectedItem();
        GuiPlayers guiPlayers = new GuiPlayers(paisSeleccionado);
        guiPlayers.setVisible(true);
    }
}


