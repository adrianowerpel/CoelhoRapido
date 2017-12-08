/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database.dao;

import Modelos.LoginMotorista;
import Modelos.Motorista;
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
public class MotoristaDAO implements IDAO<Motorista, Integer>{

    @Override
    public void Salvar(Motorista p) throws SQLException, ClassNotFoundException {
    
        Connection c = ConnectionFactory.getConnection();
        
        String sql = "INSERT INTO motorista(nome_mot,cnh,categoria,endereco,sexo,data_nasc,status_mot) VALUES (?,?,?,?,?,?,?)";
        
        PreparedStatement pst = c.prepareStatement(sql);
        
        pst.setString(1, p.getNome());
        pst.setString(2, p.getCnh());
        pst.setString(3, p.getCategoria());
        pst.setString(4, p.getEndereco());
        pst.setString(5, p.getSexo());
        pst.setString(6, p.getDataNasc());
        pst.setString(7, p.getStatus());
        
        pst.execute();    
    }

    @Override
    public void Alterar(Motorista p) throws SQLException, ClassNotFoundException {
    
        Connection c = ConnectionFactory.getConnection();
        
        String sql = "UPDATE motorista SET nome_mot = ?, cnh = ?, categoria = ?, endereco = ?, sexo = ?,data_nasc = ?, status_mot = ? WHERE id_motorista = ?";
        
        PreparedStatement pst = c.prepareStatement(sql);
        
        pst.setString(1, p.getNome());
        pst.setString(2, p.getCnh());
        pst.setString(3, p.getCategoria());
        pst.setString(4, p.getEndereco());
        pst.setString(5, p.getSexo());
        pst.setString(6, p.getDataNasc());
        pst.setString(7, p.getStatus());
        pst.setInt(8, p.getId());
    
        pst.execute();
    }

    @Override
    public void Apagar(Motorista p) throws SQLException, ClassNotFoundException {
    
    Connection c = ConnectionFactory.getConnection();
    
    String sql = "DELETE FROM motorista WHERE id_motorista = ?";
    
    PreparedStatement pst = c.prepareStatement(sql);
    
    pst.setInt(1, p.getId());
    
    pst.execute();
    }

    @Override
    public Motorista BuscarPelaChave(Integer p) throws SQLException, ClassNotFoundException {
    
        Connection c = ConnectionFactory.getConnection();
        
        String sql = "SELECT * FROM motorista WHERE id_motorista = ?";
        
        PreparedStatement pst = c.prepareStatement(sql);
        
        pst.setInt(1, p);
        
        ResultSet rs = pst.executeQuery();
        
        Motorista mot = null;
        
        if(rs.next())
        {
            mot = new Motorista(rs.getString("cnh"), rs.getString("categoria"),rs.getString("status_mot"),rs.getInt("id_motorista"), rs.getString("nome_mot"), rs.getString("endereco"), rs.getString("sexo"),rs.getString("data_nasc"));
        }
        
        return mot;
    
    }

    @Override
    public ArrayList<Motorista> BuscarTodos() throws SQLException, ClassNotFoundException {
    
        Connection c = ConnectionFactory.getConnection();
        
        String sql = "SELECT * FROM motorista";
        
        PreparedStatement pst = c.prepareStatement(sql);
        
        ResultSet rs = pst.executeQuery();
        
        Motorista mot = null;
        ArrayList<Motorista> lista = new ArrayList<>();
        
        while(rs.next())
        {
            mot = new Motorista();
            mot.setCnh(rs.getString("cnh"));
            mot.setCategoria(rs.getString("categoria"));
            mot.setStatus(rs.getString("status_mot"));
            mot.setId(rs.getInt("id_motorista"));
            mot.setNome(rs.getString("nome_mot"));
            mot.setEndereco(rs.getString("endereco"));
            mot.setSexo(rs.getString("sexo"));
            mot.setDataNasc(rs.getString("data_nasc"));
            
            lista.add(mot);
        }
        
        return lista;
    
    }

    @Override
    public int Quantidade() throws SQLException, ClassNotFoundException {
    
        Connection c = ConnectionFactory.getConnection();
        
        String sql = "SELECT COUNT(*) FROM motorista";
        
        PreparedStatement pst = c.prepareStatement(sql);
        
        ResultSet rs = pst.executeQuery();
        
        rs.next();
        
        return rs.getInt("COUNT(*)");
    
    }
    
    public ArrayList<Motorista> BuscarNomeCNH(String nome, String cnh) throws SQLException, ClassNotFoundException
    {
        Connection c = ConnectionFactory.getConnection();
        
        String sql = "SELECT * FROM motorista WHERE nome_mot LIKE ? AND cnh LIKE ?";
        
        PreparedStatement pst = c.prepareStatement(sql);
        
        pst.setString(1,"%"+nome+"%");
        pst.setString(2,"%"+cnh+"%");
        
        ResultSet rs = pst.executeQuery();
        
        Motorista mot = null;
        ArrayList<Motorista> lista = new ArrayList<>();
        
        while(rs.next())
        {
            mot = new Motorista();
            mot.setCnh(rs.getString("cnh"));
            mot.setCategoria(rs.getString("categoria"));
            mot.setStatus(rs.getString("status_mot"));
            mot.setId(rs.getInt("id_motorista"));
            mot.setNome(rs.getString("nome_mot"));
            mot.setEndereco(rs.getString("endereco"));
            mot.setSexo(rs.getString("sexo"));
            mot.setDataNasc(rs.getString("data_nasc"));
            
            lista.add(mot);
        }
        
        return lista;
    } 
    
    public Motorista BuscarCNH(String cnh) throws SQLException, ClassNotFoundException
    {
        Connection c = ConnectionFactory.getConnection();
        
        String sql = "SELECT * FROM motorista WHERE cnh = ?";
        
        PreparedStatement pst = c.prepareStatement(sql);
        
        pst.setString(1,cnh);
        
        ResultSet rs = pst.executeQuery();
        
        Motorista mot = null;
                
        if(rs.next())
        {
            mot = new Motorista();
            mot.setCnh(rs.getString("cnh"));
            mot.setCategoria(rs.getString("categoria"));
            mot.setStatus(rs.getString("status_mot"));
            mot.setId(rs.getInt("id_motorista"));
            mot.setNome(rs.getString("nome_mot"));
            mot.setEndereco(rs.getString("endereco"));
            mot.setSexo(rs.getString("sexo"));            
            mot.setDataNasc(rs.getString("data_nasc"));            
        }
        
        return mot;
    } 
}
