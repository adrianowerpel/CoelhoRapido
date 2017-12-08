/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database.dao;

import Modelos.LoginCliente;
import database.connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author aluno
 */
public class LoginClienteDAO implements IDAO<LoginCliente, Integer>{

    @Override
    public void Salvar(LoginCliente p) throws SQLException, ClassNotFoundException {
        
        Connection c = ConnectionFactory.getConnection();
        
        String sql = "INSERT INTO login(cpf_login,senha) VALUE (?,?)";
        
        PreparedStatement pst = c.prepareStatement(sql);
        
        pst.setString(1,p.getCpf_login());
        pst.setString(2,p.getSenha());
        
        pst.execute();
    }

    @Override
    public void Alterar(LoginCliente p) throws SQLException, ClassNotFoundException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Apagar(LoginCliente p) throws SQLException, ClassNotFoundException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public LoginCliente BuscarPelaChave(Integer p) throws SQLException, ClassNotFoundException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<LoginCliente> BuscarTodos() throws SQLException, ClassNotFoundException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int Quantidade() throws SQLException, ClassNotFoundException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public LoginCliente BuscarLogin(String login, String senha) throws SQLException, ClassNotFoundException
    {
        Connection c = ConnectionFactory.getConnection();
        
        String sql = "SELECT * FROM login WHERE cpf_login = ? AND senha = ?";
        
        PreparedStatement pst = c.prepareStatement(sql);
        
        pst.setString(1,login);
        pst.setString(2,senha);
        
        ResultSet rs = pst.executeQuery();
        
        LoginCliente cliente = null;
        
        if(rs.next())
        {
            cliente = new LoginCliente();
            cliente.setCpf_login(rs.getString("cpf_login"));
            cliente.setId(rs.getInt("id_login"));
            cliente.setSenha(rs.getString("senha"));
        }
        
        return cliente;
    }
}

