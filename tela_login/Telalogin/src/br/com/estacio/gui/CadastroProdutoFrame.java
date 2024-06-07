package br.com.estacio.gui;

import javax.swing.*;
import java.awt.*;

@SuppressWarnings("serial")
public class CadastroProdutoFrame extends JFrame {
    private JTextField nomeField;
    private JTextField enderecoField;
    private JButton salvarButton;
    private JTabbedPane tabbedPane;

    public CadastroProdutoFrame() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/imgs/so.jpg")));
        setTitle("Tela de Cadastro");
        setSize(529, 397);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null); // Centraliza a janela

        tabbedPane = new JTabbedPane();

        JPanel cadastroPanel = new JPanel();
        cadastroPanel.setLayout(null); // Usando layout absoluto

        JLabel nomeLabel = new JLabel("Nome Produto:");
        nomeLabel.setBounds(50, 50, 100, 25);
        cadastroPanel.add(nomeLabel);

        nomeField = new JTextField();
        nomeField.setBounds(150, 50, 200, 25);
        cadastroPanel.add(nomeField);

        JLabel enderecoLabel = new JLabel("Quantidade:");
        enderecoLabel.setBounds(50, 100, 100, 25);
        cadastroPanel.add(enderecoLabel);

        enderecoField = new JTextField();
        enderecoField.setBounds(150, 100, 200, 25);
        cadastroPanel.add(enderecoField);

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
            String endereco = enderecoField.getText();
            JOptionPane.showMessageDialog(null, "Cadastro realizado para: " + nome + ", " + endereco);
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new CadastroProdutoFrame().setVisible(true));
    }
}
