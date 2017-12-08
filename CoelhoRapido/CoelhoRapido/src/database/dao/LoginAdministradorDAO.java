/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database.dao;

import Modelos.LoginAdministrador;
import database.connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author patricia
 */
public class LoginAdministradorDAO implements IDAO<LoginAdministrador, Integer>{

    @Override
    public void Salvar(LoginAdministrador p) throws SQLException, ClassNotFoundException {
    
        Connection c = ConnectionFactory.getConnection();
        
        String sql = "INSERT INTO login(cod_login,senha) VALUE (?,?)";
        
        PreparedStatement pst = c.prepareStatement(sql);
        
        pst.setString(1,p.getCod_admin());
        pst.setString(2,p.getSenha());
        
        pst.execute();
    
    }

    @Override
    public void Alterar(LoginAdministrador p) throws SQLException, ClassNotFoundException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Apagar(LoginAdministrador p) throws SQLException, ClassNotFoundException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public LoginAdministrador BuscarPelaChave(Integer p) throws SQLException, ClassNotFoundException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<LoginAdministrador> BuscarTodos() throws SQLException, ClassNotFoundException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int Quantidade() throws SQLException, ClassNotFoundException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public LoginAdministrador BuscarLogin(String login,String senha) throws SQLException,ClassNotFoundException
    {
        Connection c = ConnectionFactory.getConnection();
        
        String sql = "SELECT * FROM login WHERE cod_login = ? AND senha = ?";
        
        PreparedStatement pst = c.prepareStatement(sql);
        
        pst.setString(1,login);
        pst.setString(2,senha);
        
        ResultSet rs = pst.executeQuery();
        
        LoginAdministrador la = null;
        
        if(rs.next())
        {
            la = new LoginAdministrador();
            la.setCod_admin(rs.getString("cnh_login"));
            la.setId(rs.getInt("id_login"));
            la.setSenha(rs.getString("senha"));
        }
        
        return la;
    }
    
}
