/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import domain.Usuario;

/**
 *
 * @author jean.vieira
 */
public class Salvar {

    public static void main(String[] args) {

        Usuario usuario = new Usuario();

        usuario.setNome("Jaka");
        usuario.setEmail("jean@gmail.com");
        usuario.setCpf(1234568910);

        UsuarioDao userDao = new UsuarioDao();

        try {
            userDao.salvar(usuario);
            System.out.println("Salvo com sucesso!");
        } catch (Exception e) {
            System.out.println("Erro ao salvar!");
        }

    }

}
