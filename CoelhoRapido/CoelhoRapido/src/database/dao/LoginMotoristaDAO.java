/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database.dao;

import Modelos.LoginMotorista;
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
public class LoginMotoristaDAO implements IDAO<LoginMotorista, Integer>{

    @Override
    public void Salvar(LoginMotorista p) throws SQLException, ClassNotFoundException {
    
        Connection c = ConnectionFactory.getConnection();
        
        String sql = "INSERT INTO login(cnh_login,senha) VALUE (?,?)";
        
        PreparedStatement pst = c.prepareStatement(sql);
        
        pst.setString(1,p.getCnh_login());
        pst.setString(2,p.getSenha());
        
        pst.execute();
    
    }

    @Override
    public void Alterar(LoginMotorista p) throws SQLException, ClassNotFoundException {
    
        Connection c = ConnectionFactory.getConnection();
        
        String sql = "UPDATE login SET  cnh_login = ?,senha = ? WHERE id_login = ?";
        
        PreparedStatement pst = c.prepareStatement(sql);
        
        pst.setString(1, p.getCnh_login());
        pst.setString(2, p.getSenha());
        pst.setInt(3, p.getId());
    
        pst.execute();
    
    }

    @Override
    public void Apagar(LoginMotorista p) throws SQLException, ClassNotFoundException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public LoginMotorista BuscarPelaChave(Integer p) throws SQLException, ClassNotFoundException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<LoginMotorista> BuscarTodos() throws SQLException, ClassNotFoundException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int Quantidade() throws SQLException, ClassNotFoundException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public LoginMotorista BuscarLogin(String login, String senha) throws SQLException, ClassNotFoundException
    {
        Connection c = ConnectionFactory.getConnection();
        
        String sql = "SELECT * FROM login WHERE cnh_login = ? AND senha = ?";
        
        PreparedStatement pst = c.prepareStatement(sql);
        
        pst.setString(1,login);
        pst.setString(2,senha);
        
        ResultSet rs = pst.executeQuery();
        
        LoginMotorista lm = null;
        
        if(rs.next())
        {
            lm = new LoginMotorista();
            lm.setCnh_login(rs.getString("cnh_login"));
            lm.setId(rs.getInt("id_login"));
            lm.setSenha(rs.getString("senha"));
        }
        
        return lm;
    }
    
}
