package telas;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.Locale;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import cadastro.BD;
import cadastro.ConexaoUsuario;
import cadastro.CriacaoUsuario;

public class TelaLogin extends JFrame {

	private JPanel contentPane;
	private JTextField txt_username;
	private JTextField txt_password;
	Connection conn = null;
	PreparedStatement pst = null;
	ResultSet rs = null;

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaLogin frame = new TelaLogin();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public TelaLogin() {
		conn = BD.java_db();

		Calendar cal = Calendar.getInstance();
		int month = cal.get(Calendar.MONTH);
		int year = cal.get(Calendar.YEAR);
		int day = cal.get(Calendar.DAY_OF_MONTH);
		int second = cal.get(Calendar.SECOND);
		int minute = cal.get(Calendar.MINUTE);
		int hour = cal.get(Calendar.HOUR);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 915, 661);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("Tela de Login para SmartFrete:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 23));
		lblNewLabel.setBounds(44, 152, 602, 59);
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Usuario");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1.setBounds(22, 230, 81, 14);
		contentPane.add(lblNewLabel_1);

		txt_username = new JTextField();
		txt_username.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txt_username.setColumns(10);
		txt_username.setBounds(114, 222, 128, 29);
		contentPane.add(txt_username);

		JLabel lblNewLabel_1_1 = new JLabel("Senha:");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1_1.setBounds(22, 270, 81, 14);
		contentPane.add(lblNewLabel_1_1);

		txt_password = new JTextField();
		txt_password.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txt_password.setColumns(10);
		txt_password.setBounds(114, 262, 128, 29);
		contentPane.add(txt_password);

		JLabel lblNewLabel_1_1_1 = new JLabel("Divis\u00E3o");
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1_1_1.setBounds(22, 312, 103, 14);
		contentPane.add(lblNewLabel_1_1_1);

		JComboBox txt_combobox = new JComboBox();
		txt_combobox.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txt_combobox.setModel(new DefaultComboBoxModel(new String[] { "Admin", "Usuario" }));
		txt_combobox.setBounds(114, 302, 128, 33);
		contentPane.add(txt_combobox);

		JButton btnLogin = new JButton("Login");
		btnLogin.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				try {
					
					String username, password, division;
					
					username = txt_username.getText();
					password = txt_password.getText();
					division = txt_combobox.getSelectedItem().toString();
					
					CriacaoUsuario objusuario = new CriacaoUsuario();
					objusuario.setUsername(username);
					objusuario.setPassword(password);
					objusuario.setDivision(division);

					ConexaoUsuario objusuariocon = new ConexaoUsuario();
					ResultSet rsusuariocon = objusuariocon.autenticacaoUsuario(objusuario);
					
					if (rsusuariocon.next()) {
						JOptionPane.showMessageDialog(null, "Login realizado com sucesso!");
						TelaCotacao j = new TelaCotacao();
						j.setVisible(true);
						dispose();
					}else {
						JOptionPane.showMessageDialog(null, "Usuario ou Senha Inválida");
					}

				} catch (SQLException erro) {
					JOptionPane.showMessageDialog(null, "ERROLOGIN" + erro);

				} 

			}
		});
		btnLogin.setBounds(131, 385, 111, 22);
		contentPane.add(btnLogin);
				
				JButton btnNovoUsuario = new JButton("Novo Usuario");
				btnNovoUsuario.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						TelaCriacaoUser j = new TelaCriacaoUser();
						j.setVisible(true);
						
						
					}
				});
				btnNovoUsuario.setFont(new Font("Tahoma", Font.PLAIN, 12));
				btnNovoUsuario.setBounds(131, 418, 111, 22);
				contentPane.add(btnNovoUsuario);
						
						JButton btnLogin_3_1 = new JButton("Sair");
						btnLogin_3_1.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								
								if (JOptionPane.showConfirmDialog(contentPane, "Tem certeza que deseja sair?", "SmartFrete System",
										JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION){
										System.exit(0);
									}
							}
						});
						btnLogin_3_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
						btnLogin_3_1.setBounds(131, 451, 111, 22);
						contentPane.add(btnLogin_3_1);
				
						JLabel lblNewLabel_2 = new JLabel("New label");
						lblNewLabel_2.setIcon(new ImageIcon(TelaLogin.class.getResource(
								"/images/120253-entenda-as-diferencas-entre-transportadoras-e-agenciadores-de-frete.jpg")));
						lblNewLabel_2.setBounds(0, 0, 899, 622);
						contentPane.add(lblNewLabel_2);

	}
}
