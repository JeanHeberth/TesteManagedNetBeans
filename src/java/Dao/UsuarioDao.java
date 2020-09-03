/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import domain.Usuario;
import factory.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author jean.vieira
 */
public class UsuarioDao {
    
    /* Método para salvar no DB */
	
	public void salvar(Usuario user) throws SQLException {
		
		StringBuilder sql = new StringBuilder();
		sql.append("INSERT INTO USUARIO (email) VALUES (? ) ");
		
                
                Connection conexao = (Connection) Conexao.conectar();
		
		PreparedStatement comando = conexao.prepareStatement(sql.toString());
		comando.setString(1, user.getEmail());
		comando.executeUpdate();
				
	}
    
}
