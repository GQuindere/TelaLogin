package br.com.estacio.gui;

import javax.swing.*;
import java.awt.EventQueue;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

@SuppressWarnings({ "unused", "serial" })
public class LoginFrame extends JFrame {
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JButton loginButton;
    private JLabel lblNewLabel;

 
    public LoginFrame() {
    	setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/imgs/so.jpg")));
        setTitle("StockProX");
        setSize(656, 411);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Centralizar a janela

        JPanel panel = new JPanel();
        panel.setBackground(new Color(192, 192, 192));
        panel.setLayout(null);

        JLabel label_1 = new JLabel("Usuário:");
        label_1.setBounds(199, 220, 178, 20);
        panel.add(label_1);
        
                JLabel label = new JLabel("Senha:");
                label.setBounds(199, 262, 178, 20);
                panel.add(label);
        usernameField = new JTextField();
        usernameField.setBounds(199, 240, 178, 20);
        usernameField.setHorizontalAlignment(SwingConstants.LEFT);
        panel.add(usernameField);
        passwordField = new JPasswordField();
        passwordField.setBounds(199, 283, 178, 20);
        panel.add(passwordField);

        loginButton = new JButton("Login");
        loginButton.setBounds(199, 314, 178, 20);
        panel.add(loginButton);

        getContentPane().add(panel, BorderLayout.CENTER);
        
        lblNewLabel = new JLabel("");
        lblNewLabel.setBackground(Color.WHITE);
        lblNewLabel.setVerticalAlignment(SwingConstants.TOP);
        lblNewLabel.setIcon(new ImageIcon(getClass().getResource("/imgs/so.jpg")));
        lblNewLabel.setBounds(100, 0, 651, 566);
        panel.add(lblNewLabel);

        // Ação do botão login
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Validação de login 
                String username = usernameField.getText();
                String password = new String(passwordField.getPassword());
                if ("antonio".equals(username) && "0000".equals(password)) {
                    JOptionPane.showMessageDialog(null, "Login bem-sucedido");
                    new MainFrame().setVisible(true); // Abre a tela principal
                    dispose(); // Fecha a tela de login
                } else {
                    JOptionPane.showMessageDialog(null, "Usuário ou senha incorretos");
                }
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new LoginFrame().setVisible(true);
            }
        });
    }
}
