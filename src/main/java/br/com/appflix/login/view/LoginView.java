package br.com.appflix.login.view;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.MatteBorder;

import br.com.appflix.login.controller.LoginController;

public class LoginView {

	private JFrame frameLogin;
	private JTextField textFieldLogin_Username;
	private JPasswordField passwordFieldLogin_Password;
	private JButton btnLogin_LoginView;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginView window = new LoginView();
					window.frameLogin.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public LoginView() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frameLogin = new JFrame();
		frameLogin.setTitle(" · Login");
		frameLogin.setResizable(false);
		frameLogin.getContentPane().setBackground(new Color(240, 240, 240));
		frameLogin.getContentPane().setLayout(null);
		frameLogin.setBounds(100, 100, 375, 280);
		frameLogin.setLocationRelativeTo(null);
		frameLogin.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frameLogin.setUndecorated(true);

		JPanel panelLogin_Full = new JPanel();
		panelLogin_Full.setBackground(new Color(57, 62, 70));
		panelLogin_Full.setBounds(0, 0, 375, 280);
		frameLogin.getContentPane().add(panelLogin_Full);
		panelLogin_Full.setLayout(null);

		JPanel panelLogin_UserPassword = new JPanel();
		panelLogin_UserPassword.setBackground(new Color(57, 62, 70));
		panelLogin_UserPassword.setBounds(72, 46, 230, 123);
		panelLogin_UserPassword.setLayout(null);
		panelLogin_Full.add(panelLogin_UserPassword);

		JLabel lblLogin_Username = new JLabel("USUÁRIO");
		lblLogin_Username.setBounds(13, 11, 77, 23);
		lblLogin_Username.setForeground(new Color(177, 187, 194));
		lblLogin_Username.setFont(new Font("Microsoft New Tai Lue", Font.BOLD, 13));
		panelLogin_UserPassword.add(lblLogin_Username);

		textFieldLogin_Username = new JTextField();
		textFieldLogin_Username.setForeground(new Color(177, 187, 194));
		textFieldLogin_Username.setBounds(13, 33, 203, 23);
		textFieldLogin_Username.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));
		textFieldLogin_Username.setColumns(10);
		textFieldLogin_Username.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(177, 187, 194)));
		textFieldLogin_Username.setBackground(new Color(57, 62, 70));
		panelLogin_UserPassword.add(textFieldLogin_Username);

		JLabel lblLogin_Password = new JLabel("SENHA");
		lblLogin_Password.setBounds(13, 67, 77, 23);
		lblLogin_Password.setForeground(new Color(177, 187, 194));
		lblLogin_Password.setFont(new Font("Microsoft New Tai Lue", Font.BOLD, 13));
		panelLogin_UserPassword.add(lblLogin_Password);

		passwordFieldLogin_Password = new JPasswordField();
		passwordFieldLogin_Password.setForeground(new Color(177, 187, 194));
		passwordFieldLogin_Password.setBounds(13, 88, 203, 23);
		passwordFieldLogin_Password.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));
		passwordFieldLogin_Password.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(177, 187, 194)));
		passwordFieldLogin_Password.setBackground(new Color(57, 62, 70));
		panelLogin_UserPassword.add(passwordFieldLogin_Password);

		btnLogin_LoginView = new JButton("Login");
		btnLogin_LoginView.setForeground(new Color(177, 187, 194));
		btnLogin_LoginView.setBounds(85, 186, 171, 23);
		btnLogin_LoginView.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String username = textFieldLogin_Username.getText();
				String password = new String(passwordFieldLogin_Password.getPassword());

				LoginController loginController = new LoginController();
				if (loginController.authenticate(username, password)) {
					System.out.println("Logado com sucesso!");
				} else {
					JOptionPane.showMessageDialog(frameLogin, "Usuário ou senha inválidos!", "Erro",
							JOptionPane.ERROR_MESSAGE);
					System.out.println("Usuário ou senha inválidos!");
					clearFieldsLogin();
				}
			}

		});
		btnLogin_LoginView.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 11));
		btnLogin_LoginView.setBackground(new Color(57, 62, 70));
		btnLogin_LoginView.setFocusable(false);
		panelLogin_Full.add(btnLogin_LoginView);

		Panel panelLogin_Copyright = 	new Panel();
		panelLogin_Copyright.setBounds(112, 225, 151, 20);
		panelLogin_Copyright.setLayout(null);
		panelLogin_Full.add(panelLogin_Copyright);

		JLabel LabelLogin_C = new JLabel("©");
		LabelLogin_C.setForeground(new Color(177, 187, 194));
		LabelLogin_C.setFont(new Font("Tahoma", Font.PLAIN, 9));
		LabelLogin_C.setBounds(0, 3, 10, 14);
		panelLogin_Copyright.add(LabelLogin_C);

		JLabel LabelLogin_Copyright = new JLabel("Copyright");
		LabelLogin_Copyright.setForeground(new Color(177, 187, 194));
		LabelLogin_Copyright.setFont(new Font("Microsoft YaHei", Font.PLAIN, 9));
		LabelLogin_Copyright.setBounds(10, 3, 44, 14);
		panelLogin_Copyright.add(LabelLogin_Copyright);

		JLabel LabelLogin_AllRightsReserved = new JLabel("All rights reserved");
		LabelLogin_AllRightsReserved.setForeground(new Color(177, 187, 194));
		LabelLogin_AllRightsReserved.setFont(new Font("Microsoft YaHei", Font.PLAIN, 10));
		LabelLogin_AllRightsReserved.setBounds(57, 3, 95, 14);
		panelLogin_Copyright.add(LabelLogin_AllRightsReserved);

		JLabel LabelLogin_Year = new JLabel("2024");
		LabelLogin_Year.setForeground(new Color(177, 187, 194));
		LabelLogin_Year.setBounds(175, 246, 25, 14);
		LabelLogin_Year.setFont(new Font("Microsoft YaHei", Font.PLAIN, 9));
		panelLogin_Full.add(LabelLogin_Year);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblNewLabel.setIcon(new ImageIcon(LoginView.class.getResource("/resources/img/on-off-button.png")));
		lblNewLabel.setBounds(263, 186, 25, 23);
		panelLogin_Full.add(lblNewLabel);
	}

	public void clearFieldsLogin() {
		textFieldLogin_Username.setText("");
		passwordFieldLogin_Password.setText("");
		textFieldLogin_Username.requestFocusInWindow();
	}
}
