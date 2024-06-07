package br.com.estacio.gui;

import javax.swing.*;
import java.awt.*;

@SuppressWarnings("serial")
public class CadastroLojaFrame extends JFrame {
    private JTextField nomeField;
    private JButton salvarButton;
    private JTabbedPane tabbedPane;

    public CadastroLojaFrame() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/imgs/so.jpg")));
        setTitle("Tela de Cadastro");
        setSize(529, 397);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null); // Centraliza a janela

        tabbedPane = new JTabbedPane();

        JPanel cadastroPanel = new JPanel();
        cadastroPanel.setLayout(null); // Usando layout absoluto

        JLabel nomeLabel = new JLabel("Nome Da Loja:");
        nomeLabel.setBounds(50, 50, 100, 25);
        cadastroPanel.add(nomeLabel);

        nomeField = new JTextField();
        nomeField.setBounds(150, 50, 200, 25);
        cadastroPanel.add(nomeField);

        salvarButton = new JButton("Salvar");
        salvarButton.setBounds(50, 150, 100, 25);
        cadastroPanel.add(salvarButton);

        tabbedPane.addTab("Cadastro", cadastroPanel);
        tabbedPane.setEnabledAt(0, true);
        getContentPane().add(tabbedPane, BorderLayout.CENTER);

        // Ação do botão salvar
        salvarButton.addActionListener(e -> {
            // Código para salvar os dados
            String nome = nomeField.getText();
            JOptionPane.showMessageDialog(null, "Cadastro realizado para a loja: " + nome);
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new CadastroProdutoFrame().setVisible(true));
    }
}
