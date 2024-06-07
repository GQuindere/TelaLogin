package br.com.estacio.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

@SuppressWarnings("serial")
public class MainFrame extends JFrame {

    public MainFrame() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/imgs/so.jpg")));
        setTitle("StockProX ON");
        setExtendedState(JFrame.MAXIMIZED_BOTH); // Maximiza a janela
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Centraliza a janela

        // Painel principal
        JPanel panel = new JPanel();
        panel.setBackground(new Color(192, 192, 192));
        panel.setLayout(new BorderLayout());

        // Barra de ferramentas
        JToolBar toolBar = new JToolBar();

        
        
        
        // Botão Cadastrar com menu suspenso
        JButton cadastrarButton = new JButton("Cadastrar");
        JPopupMenu cadastrarMenu = new JPopupMenu();
        JMenuItem cadastrarLojaItem = new JMenuItem("Cadastrar Loja");
        JMenuItem cadastrarProdutoItem = new JMenuItem("Cadastrar Produto");
        cadastrarMenu.add(cadastrarLojaItem);
        cadastrarMenu.add(cadastrarProdutoItem);
        cadastrarButton.addActionListener(e -> cadastrarMenu.show(cadastrarButton, cadastrarButton.getWidth() / 2, cadastrarButton.getHeight() / 2));
        toolBar.add(cadastrarButton);

        // Botão Consultar com menu suspenso
        JButton consultarButton = new JButton("Consultar");
        JPopupMenu consultarMenu = new JPopupMenu();
        JMenuItem consultarLojaItem = new JMenuItem("Consultar Loja");
        JMenuItem consultarProdutoItem = new JMenuItem("Consultar Produto");
        consultarMenu.add(consultarLojaItem);
        consultarMenu.add(consultarProdutoItem);
        consultarButton.addActionListener(e -> consultarMenu.show(consultarButton, consultarButton.getWidth() / 2, consultarButton.getHeight() / 2));
        toolBar.add(consultarButton);

        // Botão Relatórios
        JButton relatoriosButton = new JButton("Relatórios");
        relatoriosButton.addActionListener(e -> JOptionPane.showMessageDialog(null, "Relatórios selecionado"));
        toolBar.add(relatoriosButton);

        // Adiciona a barra de ferramentas ao painel
        panel.add(toolBar, BorderLayout.NORTH);

        // Área de trabalho principal
        JLabel label = new JLabel("");
        label.setIcon(new ImageIcon(getClass().getResource("/imgs/so.jpg")));
        label.setHorizontalAlignment(SwingConstants.CENTER);
        label.setFont(new Font("Arial", Font.BOLD, 24));
        panel.add(label, BorderLayout.CENTER);

        // Adiciona o painel ao frame
        getContentPane().add(panel);
        
        // ActionListener para o item do menu "Cadastrar Loja"
        cadastrarLojaItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Código para abrir a janela de cadastro de loja
                new CadastroLojaFrame().setVisible(true);
            }
        });

        // ActionListener para o item do menu "Cadastrar Produto"
        cadastrarProdutoItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Código para abrir a janela de cadastro de produto
                new CadastroProdutoFrame().setVisible(true);
            	
            }
        });

        // ActionListener para o item do menu "Consultar Loja"
        consultarLojaItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Código para abrir a janela de consulta de loja
                JOptionPane.showMessageDialog(null, "Abrir janela de consulta de loja");
            }
        });

        // ActionListener para o item do menu "Consultar Produto"
        consultarProdutoItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Código para abrir a janela de consulta de produto
                JOptionPane.showMessageDialog(null, "Abrir janela de consulta de produto");
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new MainFrame().setVisible(true));
    }
}
