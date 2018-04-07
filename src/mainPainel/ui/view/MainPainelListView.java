package br.ufg.inf.swpersistente.mainPainel.ui.view;

import javax.swing.*;
import java.util.ArrayList;

/**
 * Created by aluno on 27/03/18.
 */
public class MainPainelListView extends JFrame {

    private static final int WIDTH = 400;
    private static final int HEIGHT = 560;

    private JPanel mainPanel;
    private JLabel mainLabel;
    private JButton btnBoleto;
    private JButton btnUnd1;
    private JButton btnUnd2;

    public MainPainelListView() {
        setSize(WIDTH, HEIGHT);
        setContentPane(mainPanel);
        setLocationRelativeTo(null);
    }

    public JButton getBtnBoleto() {
        return btnBoleto;
    }

    public JLabel getMainLabel() {
        return mainLabel;
    }

}
