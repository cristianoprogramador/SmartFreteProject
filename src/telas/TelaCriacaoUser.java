package telas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import cadastro.ConexaoUsuario;
import cadastro.CriacaoUsuario;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class TelaCriacaoUser extends JFrame {

	private JPanel contentPane;
	private JTextField txt_newuser;
	private JTextField txt_newpassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCriacaoUser frame = new TelaCriacaoUser();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TelaCriacaoUser() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 362, 426);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Usuario");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1.setBounds(40, 112, 81, 14);
		contentPane.add(lblNewLabel_1);
		
		txt_newuser = new JTextField();
		txt_newuser.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txt_newuser.setColumns(10);
		txt_newuser.setBounds(168, 104, 128, 29);
		contentPane.add(txt_newuser);
		
		JLabel lblNewLabel_1_1 = new JLabel("Senha");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1_1.setBounds(40, 172, 81, 14);
		contentPane.add(lblNewLabel_1_1);
		
		txt_newpassword = new JTextField();
		txt_newpassword.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txt_newpassword.setColumns(10);
		txt_newpassword.setBounds(168, 164, 128, 29);
		contentPane.add(txt_newpassword);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Divis\u00E3o");
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1_1_1.setBounds(40, 233, 103, 14);
		contentPane.add(lblNewLabel_1_1_1);
		
		JComboBox txt_division = new JComboBox();
		txt_division.setModel(new DefaultComboBoxModel(new String[] {"Usuario"}));
		txt_division.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txt_division.setBounds(168, 223, 128, 33);
		contentPane.add(txt_division);
		
		JLabel lblCadastroDeUsuario = new JLabel("Cadastro de Usuario:");
		lblCadastroDeUsuario.setHorizontalAlignment(SwingConstants.CENTER);
		lblCadastroDeUsuario.setFont(new Font("Tahoma", Font.BOLD, 23));
		lblCadastroDeUsuario.setBounds(31, 34, 290, 59);
		contentPane.add(lblCadastroDeUsuario);
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				String username,password,division;
				
				username = txt_newuser.getText();
				password = txt_newpassword.getText();
				division = txt_division.getSelectedItem().toString();
				
				CriacaoUsuario objusuario = new CriacaoUsuario();
				objusuario.setUsername(username);
				objusuario.setPassword(password);
				objusuario.setDivision(division);
					
				ConexaoUsuario objusuariocon = new ConexaoUsuario();
				ResultSet rsusuariocon = objusuariocon.criacaoUsuario(objusuario);
				
				
					JOptionPane.showMessageDialog(null, "Usuario Cadastrado");
					dispose();
				
			}
				
			
		});
		btnSalvar.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnSalvar.setBounds(192, 300, 111, 22);
		contentPane.add(btnSalvar);
		
		JButton btnLogin_3_1 = new JButton("Sair");
		btnLogin_3_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnLogin_3_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnLogin_3_1.setBounds(192, 333, 111, 22);
		contentPane.add(btnLogin_3_1);
	}
}
