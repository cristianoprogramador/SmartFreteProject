package cadastro;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class ConexaoUsuario {
	
	Connection conn;
	
	public ResultSet autenticacaoUsuario(CriacaoUsuario objusuario) {
		conn = new BD().java_db();
		
		try {
			String sql = "SELECT * FROM loginsenha WHERE username = ? and password = ? and division = ? ";
			
			PreparedStatement pstm = conn.prepareStatement(sql);
			pstm.setString(1, objusuario.getUsername());
			pstm.setString(2, objusuario.getPassword());
			pstm.setString(3, objusuario.getDivision());
			
			ResultSet rs = pstm.executeQuery();
			return rs;
			
		} catch (SQLException erro) {
			JOptionPane.showMessageDialog(null,"ConexaoUsuario: " + erro);
			return null;
		}

	}
	
	public ResultSet criacaoUsuario(CriacaoUsuario objusuario) {
		conn = new BD().java_db();
		
		try {
			String sql = "INSERT INTO loginsenha (username,password,division)VALUES(?,?,?)";
			
			PreparedStatement pstm = conn.prepareStatement(sql);
			pstm.setString(1, objusuario.getUsername());
			pstm.setString(2, objusuario.getPassword());
			pstm.setString(3, objusuario.getDivision());
			
			int adicionou = pstm.executeUpdate();
			JOptionPane.showMessageDialog(null, "Usuario Cadastrado");
			

			
		} catch (SQLException erro) {
			JOptionPane.showMessageDialog(null,"ConexaoUsuario: " + erro);
			
		}
		return null;

	}

}
