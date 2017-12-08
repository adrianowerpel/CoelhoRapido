/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database.dao;

import Modelos.Administrador;
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
public class AdministradorDAO implements IDAO<Administrador, Integer>{

    @Override
    public void Salvar(Administrador p) throws SQLException, ClassNotFoundException {
    
        Connection c = ConnectionFactory.getConnection();
        
        String sql = "INSERT INTO administrador(nome_admin,codigo,endereco,sexo) VALUE (?,?,?,?)";
        
        PreparedStatement pst = c.prepareStatement(sql);
        
        pst.setString(1,p.getNome());
        pst.setString(2,p.getCodigo());
        pst.setString(3,p.getEndereco());
        pst.setString(4,p.getSexo());
        
        pst.execute();
        
    }

    @Override
    public void Alterar(Administrador p) throws SQLException, ClassNotFoundException {
    
        Connection c = ConnectionFactory.getConnection();
        
        String sql = "UPDATE administrador set nome_admin = ?, cnh = ?, endereco = ?, sexo = ? WHERE id_admin = ?";
        
        PreparedStatement pst = c.prepareStatement(sql);
        
        pst.setString(1,p.getNome());
        pst.setString(2,p.getCodigo());
        pst.setString(3,p.getEndereco());
        pst.setString(4,p.getSexo());
        pst.setInt(5,p.getId());
        
        pst.execute();
    
    }

    @Override
    public void Apagar(Administrador p) throws SQLException, ClassNotFoundException {
    
        Connection c = ConnectionFactory.getConnection();
        
        String sql = "DELETE FROM administrador WHERE id_admin = ?";
        
        PreparedStatement pst = c.prepareStatement(sql);
        
        pst.setInt(1, p.getId());
        
        pst.execute();
    
    }

    @Override
    public Administrador BuscarPelaChave(Integer p) throws SQLException, ClassNotFoundException {
    
        Connection c = ConnectionFactory.getConnection();
        
        String sql = "SELECT * FROM administrador WHERE id_admin = ?";
        
        PreparedStatement pst = c.prepareStatement(sql);
        
        pst.setInt(1, p);
        
        ResultSet rs = pst.executeQuery();
        
        Administrador admin = null;
        
        if(rs.next())
        {
            admin = new Administrador();
            admin.setCodigo(rs.getString("codigo"));
            admin.setId(rs.getInt("id_cliente"));
            admin.setNome(rs.getString("nome_admin"));
            admin.setEndereco(rs.getString("endereco"));
            admin.setSexo(rs.getString("sexo"));
            
        }
        
        return admin;
    
    }

    @Override
    public ArrayList<Administrador> BuscarTodos() throws SQLException, ClassNotFoundException {
    
        Connection c = ConnectionFactory.getConnection();
        
        String sql = "SELECT * FROM administrador";
        
        PreparedStatement pst = c.prepareStatement(sql);
        
        ResultSet rs = pst.executeQuery();
        
        Administrador admin = null;
        ArrayList<Administrador> lista = new ArrayList<>();
        
        while(rs.next())
        {
            admin = new Administrador();
            admin.setCodigo(rs.getString("codigo"));
            admin.setId(rs.getInt("id_cliente"));
            admin.setNome(rs.getString("nome_admin"));
            admin.setEndereco(rs.getString("endereco"));
            admin.setSexo(rs.getString("sexo"));
            
            lista.add(admin);
        }
        
        return lista; 
    
    }

    @Override
    public int Quantidade() throws SQLException, ClassNotFoundException {
    
        Connection c = ConnectionFactory.getConnection();
        
        String sql = "SELECT COUNT(*) FROM administrador";
        
        PreparedStatement pst = c.prepareStatement(sql);
        
        ResultSet rs = pst.executeQuery();
        
        rs.next();
        
        return rs.getInt("COUNT(*)");
    
    }
    
    
    
}
