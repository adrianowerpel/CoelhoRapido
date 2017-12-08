/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database.dao;

import Modelos.Cliente;
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
public class ClienteDAO implements IDAO<Cliente, Integer>{

    @Override
    public void Salvar(Cliente p) throws SQLException, ClassNotFoundException {
        
        Connection c = ConnectionFactory.getConnection();
        
        String sql = "INSERT INTO cliente(nome_cli,cpf,endereco,sexo,data_nasc) VALUE (?,?,?,?,?)";
        
        PreparedStatement pst = c.prepareStatement(sql);
        
        pst.setString(1,p.getNome());
        pst.setString(2,p.getCpf());
        pst.setString(3,p.getEndereco());
        pst.setString(4,p.getSexo());
        pst.setString(5,p.getDataNasc());
        
        pst.execute();
    }

    @Override
    public void Alterar(Cliente p) throws SQLException, ClassNotFoundException {
    
        Connection c = ConnectionFactory.getConnection();
        
        String sql = "UPDATE cliente set nome_cli = ?, cpf = ?, endereco = ?, sexo = ?,data_nasc = ? WHERE id_cliente = ?";
        
        PreparedStatement pst = c.prepareStatement(sql);
        
        pst.setString(1,p.getNome());
        pst.setString(2,p.getCpf());
        pst.setString(3,p.getEndereco());
        pst.setString(4,p.getSexo());
        pst.setString(5,p.getDataNasc());
        pst.setInt(6,p.getId());
        
        pst.execute();        
    }

    @Override
    public void Apagar(Cliente p) throws SQLException, ClassNotFoundException {
    
        Connection c = ConnectionFactory.getConnection();
        
        String sql = "DELETE FROM cliente WHERE id_cliente = ?";
        
        PreparedStatement pst = c.prepareStatement(sql);
        
        pst.setInt(1, p.getId());
        
        pst.execute();    
    }

    @Override
    public Cliente BuscarPelaChave(Integer p) throws SQLException, ClassNotFoundException {
    
        Connection c = ConnectionFactory.getConnection();
        
        String sql = "SELECT * FROM cliente WHERE id_cliente = ?";
        
        PreparedStatement pst = c.prepareStatement(sql);
        
        pst.setInt(1, p);
        
        ResultSet rs = pst.executeQuery();
        
        Cliente cliente = null;
        
        if(rs.next())
        {
            cliente = new Cliente(rs.getString("cpf"), rs.getInt("id_cliente"),rs.getString("nome_cli") , rs.getString("endereco"), rs.getString("sexo"),rs.getString("data_nasc"));
            
        }
        
        return cliente;
    
    }

    @Override
    public ArrayList<Cliente> BuscarTodos() throws SQLException, ClassNotFoundException {
        
        Connection c = ConnectionFactory.getConnection();
        
        String sql = "SELECT * FROM cliente";
        
        PreparedStatement pst = c.prepareStatement(sql);
        
        ResultSet rs = pst.executeQuery();
        
        Cliente cliente = null;
        ArrayList<Cliente> lista = new ArrayList<>();
        
        while(rs.next())
        {
            cliente = new Cliente();
            cliente.setCpf(rs.getString("cpf"));
            cliente.setId(rs.getInt("id_cliente"));
            cliente.setNome(rs.getString("nome_cli"));
            cliente.setEndereco(rs.getString("endereco"));
            cliente.setSexo(rs.getString("sexo"));
            
            lista.add(cliente);
        }
        
        return lista;    
    }

    @Override
    public int Quantidade() throws SQLException, ClassNotFoundException {
    
        Connection c = ConnectionFactory.getConnection();
        
        String sql = "SELECT COUNT(*) FROM cliente";
        
        PreparedStatement pst = c.prepareStatement(sql);
        
        ResultSet rs = pst.executeQuery();
        
        rs.next();
        
        return rs.getInt("COUNT(*)");
    
    }
    
    public ArrayList<Cliente> BuscarNomeCPF(String nome, String cpf) throws SQLException, ClassNotFoundException
    {
        Connection c = ConnectionFactory.getConnection();
        
        String sql = "SELECT * FROM cliente WHERE nome_cli LIKE ? AND cpf LIKE ?";
        
        PreparedStatement pst = c.prepareStatement(sql);
        
        pst.setString(1,"%"+nome+"%");
        pst.setString(2,"%"+cpf+"%");
        
        ResultSet rs = pst.executeQuery();
        
        Cliente cliente = null;
        ArrayList<Cliente> lista = new ArrayList<>();
        
        while(rs.next())
        {
            cliente = new Cliente();
            cliente.setCpf(rs.getString("cpf"));
            cliente.setId(rs.getInt("id_cliente"));
            cliente.setNome(rs.getString("nome_cli"));
            cliente.setEndereco(rs.getString("endereco"));
            cliente.setSexo(rs.getString("sexo"));
            
            lista.add(cliente);
        }
        
        return lista;
    } 
    
    public Cliente BuscarCPF(String cpf) throws SQLException, ClassNotFoundException {
    
        Connection c = ConnectionFactory.getConnection();
        
        String sql = "SELECT * FROM cliente WHERE cpf = ?";
        
        PreparedStatement pst = c.prepareStatement(sql);
        
        pst.setString(1, cpf);
        
        ResultSet rs = pst.executeQuery();
        
        Cliente cliente = null;
        
        if(rs.next())
        {
            cliente = new Cliente(rs.getString("cpf"), rs.getInt("id_cliente"),rs.getString("nome_cli") , rs.getString("endereco"), rs.getString("sexo"),rs.getString("data_nasc"));
            
        }
        
        return cliente;
    
    }
}
