package br.ufg.inf.swpersistente.mainPainel.ui.controller;

import br.ufg.inf.swconcorrente.decriptador.ui.controller.DecriptadorController;
import br.ufg.inf.swconcorrente.jogodavelha.ui.controller.JogoDaVelhaController;
import br.ufg.inf.swconcorrente.mainPainel.ui.view.MainPainelListView;

import javax.swing.*;

/**
 * Created by aluno on 27/03/18.
 */
public class MainPanelController {

    private MainPainelListView view;
    private JLabel mainLabel;
    private JButton btnBoleto;

    public MainPanelController() {
        setActions();
    }

    private void setActions() {
        initComponents();
        initButtons();
        initListeners();
    }

    public void showMainPainel() {
        view.setVisible(true);
    }

    private void initComponents() {
        view = new MainPainelListView();

        mainLabel =     view.getMainLabel();
        btnBoleto =     view.getBtnBoleto();
        btnDecript =    view.getBtnDecript();
        btnEncript =    view.getBtnEncript();
    }

    private void initButtons() {
        // TODO: ESTILIZAR OS BOTÕES NA ENTRADA
    }

    private void initListeners() {
        btnBoleto.addActionListener(actionEvent -> {
            new JogoDaVelhaController().showJogoDaVelha();
        });
    }

}
