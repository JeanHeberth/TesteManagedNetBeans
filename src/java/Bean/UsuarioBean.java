/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bean;

import Dao.UsuarioDao;
import domain.Usuario;
import java.sql.SQLException;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author jean.vieira
 */
@ManagedBean
@ViewScoped
public class UsuarioBean {
    
    private Usuario usuario;

	/**
	 * @return the usuario
	 */
	public Usuario getUsuario() {
		return usuario;
	}

	/**
	 * @param usuario the usuario to set
	 */
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public void novo() throws SQLException {
		UsuarioDao userDao = new UsuarioDao();
		userDao.salvar(usuario);
	}
    
}
