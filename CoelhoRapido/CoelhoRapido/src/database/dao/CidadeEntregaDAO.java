/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database.dao;

import Modelos.CidadeEntrega;
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
public class CidadeEntregaDAO implements IDAO<CidadeEntrega, Integer>{

    @Override
    public void Salvar(CidadeEntrega p) throws SQLException, ClassNotFoundException {
    
        Connection c = ConnectionFactory.getConnection();
        
        String sql = "INSERT INTO cidade_entrega(nome_cid,distancia,tempo_entrega,valor_entrega) VALUE (?,?,?,?)";
        
        PreparedStatement pst = c.prepareStatement(sql);
        
        pst.setString(1,p.getNome());
        pst.setDouble(2,p.getDistancia());
        pst.setString(3,p.getTempoEntrega());
        pst.setDouble(4,p.getValorEntrega());
        
        pst.execute();
    
    }

    @Override
    public void Alterar(CidadeEntrega p) throws SQLException, ClassNotFoundException {
    
        Connection c = ConnectionFactory.getConnection();
        
        String sql = "UPDATE cidade_entrega set nome_cid = ?, distancia = ?, tempo_entrega = ?, valor_entrega = ? WHERE id_cidade = ?";
        
        PreparedStatement pst = c.prepareStatement(sql);
        
        pst.setString(1,p.getNome());
        pst.setDouble(2,p.getDistancia());
        pst.setString(3,p.getTempoEntrega());
        pst.setDouble(4,p.getValorEntrega());
        pst.setInt(5,p.getId());
        
        pst.execute();
    
    }

    @Override
    public void Apagar(CidadeEntrega p) throws SQLException, ClassNotFoundException {
    
        Connection c = ConnectionFactory.getConnection();
        
        String sql = "DELETE FROM cidade_entrega WHERE id_cidade = ?";
        
        PreparedStatement pst = c.prepareStatement(sql);
        
        pst.setInt(1, p.getId());
        
        pst.execute();
    
    }

    @Override
    public CidadeEntrega BuscarPelaChave(Integer p) throws SQLException, ClassNotFoundException {
    
        Connection c = ConnectionFactory.getConnection();
        
        String sql = "SELECT * FROM cidade_entrega WHERE id_cidade = ?";
        
        PreparedStatement pst = c.prepareStatement(sql);
        
        pst.setInt(1, p);
        
        ResultSet rs = pst.executeQuery();
        
        CidadeEntrega cd = null;
        
        if(rs.next())
        {
            cd = new CidadeEntrega();
            cd.setId(rs.getInt("id_cidade"));
            cd.setNome(rs.getString("nome_cid"));
            cd.setTempoEntrega(rs.getString("tempo_entrega"));
            cd.setDistancia(rs.getDouble("distancia"));
            cd.setValorEntrega(rs.getDouble("valor_entrega"));
            
        }
        
        return cd;
    
    }

    @Override
    public ArrayList<CidadeEntrega> BuscarTodos() throws SQLException, ClassNotFoundException {
    
        Connection c = ConnectionFactory.getConnection();
        
        String sql = "SELECT * FROM cidade_entrega";
        
        PreparedStatement pst = c.prepareStatement(sql);
        
        ResultSet rs = pst.executeQuery();
        
        CidadeEntrega cd = null;
        ArrayList<CidadeEntrega> lista = new ArrayList<>();
        
        while(rs.next())
        {
            cd = new CidadeEntrega();
            cd.setId(rs.getInt("id_cidade"));
            cd.setNome(rs.getString("nome_cid"));
            cd.setTempoEntrega(rs.getString("tempo_entrega"));
            cd.setDistancia(rs.getDouble("distancia"));
            cd.setValorEntrega(rs.getDouble("valor_entrega"));
            
            lista.add(cd);
        }
        
        return lista;
    
    }

    @Override
    public int Quantidade() throws SQLException, ClassNotFoundException {
    
        Connection c = ConnectionFactory.getConnection();
        
        String sql = "SELECT COUNT(*) FROM cidade_entrega";
        
        PreparedStatement pst = c.prepareStatement(sql);
        
        ResultSet rs = pst.executeQuery();
        
        rs.next();
        
        return rs.getInt("COUNT(*)");
    
    }
    
    public CidadeEntrega BuscarNome(String nome) throws SQLException, ClassNotFoundException
    {
        Connection c = ConnectionFactory.getConnection();
        
        String sql = "SELECT * FROM cidade_entrega WHERE nome_cid LIKE ?";
        
        PreparedStatement pst = c.prepareStatement(sql);
        
        pst.setString(1,"%"+nome+"%");
        
        ResultSet rs = pst.executeQuery();
        
        CidadeEntrega cd = null;
        
        if(rs.next())
        {
            cd = new CidadeEntrega();
            cd.setId(rs.getInt("id_cidade"));
            cd.setNome(rs.getString("nome_cid"));
            cd.setTempoEntrega(rs.getString("tempo_entrega"));
            cd.setDistancia(rs.getDouble("distancia"));
            cd.setValorEntrega(rs.getDouble("valor_entrega"));
        }
        
        return cd;
    }    
}
