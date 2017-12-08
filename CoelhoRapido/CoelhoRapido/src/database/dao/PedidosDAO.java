/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database.dao;

import Modelos.CidadeEntrega;
import Modelos.Cliente;
import Modelos.Motorista;
import Modelos.Pedido;
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
public class PedidosDAO implements IDAO<Pedido, Integer>{

    @Override
    public void Salvar(Pedido p) throws SQLException, ClassNotFoundException {
    
        Connection c = ConnectionFactory.getConnection();
        
        String sql = "INSERT INTO pedidos(descricao,cpf_cliente,cidade_id,cidade_atual,veiculo,data_pedido,valor_pedido,status) VALUE (?,?,?,?,?,?,?,?)";
        
        PreparedStatement pst = c.prepareStatement(sql);
        
        pst.setString(1, p.getDescricao());
        pst.setString(2, p.getCliente().getCpf());
        pst.setInt(3, p.getCidade().getId());
        pst.setString(4, p.getCidadeAtual());
        pst.setString(5, p.getVeiculo());
        pst.setString(6, p.getDataPedido());
        pst.setDouble(7, p.getValorPedido());
        pst.setString(8, p.getStatus());
        
        pst.execute();
    
    }

    @Override
    public void Alterar(Pedido p) throws SQLException, ClassNotFoundException {
        
        Connection c = ConnectionFactory.getConnection();
        
        String sql = "UPDATE pedidos SET cnh_motorista = ?, cidade_atual = ?, status = ? WHERE id_pedido = ?";
        
        PreparedStatement pst = c.prepareStatement(sql);
        
        pst.setString(1, p.getMotorista().getCnh());
        pst.setString(2, p.getCidadeAtual());
        pst.setString(3, p.getStatus());
        pst.setInt(4, p.getId());
    
        pst.execute();
    
    }

    @Override
    public void Apagar(Pedido p) throws SQLException, ClassNotFoundException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Pedido BuscarPelaChave(Integer p) throws SQLException, ClassNotFoundException {
        
        Connection c = ConnectionFactory.getConnection();
        
        String sql = "SELECT * FROM pedidos inner join cliente on pedidos.cpf_cliente = cliente.cpf inner join cidade_entrega on pedidos.cidade_id = cidade_entrega.id_cidade inner join motorista on pedidos.cnh_motorista = motorista.cnh WHERE id_pedido = ?";
        
        PreparedStatement pst = c.prepareStatement(sql);
        
        pst.setInt(1, p);
        
        ResultSet rs = pst.executeQuery();
        
        Pedido pedido = null;
        
        if(rs.next())
        {   
            Cliente cli = new Cliente();
            cli.setCpf(rs.getString("cpf"));
            cli.setId(rs.getInt("id_cliente"));
            cli.setNome(rs.getString("nome_cli"));
            cli.setEndereco(rs.getString("endereco"));
            cli.setSexo(rs.getString("sexo"));
            cli.setDataNasc(rs.getString("data_nasc"));
            
            CidadeEntrega cidade = new CidadeEntrega();
            cidade.setId(rs.getInt("id_cidade"));
            cidade.setNome(rs.getString("nome_cid"));
            cidade.setDistancia(rs.getDouble("distancia"));
            cidade.setTempoEntrega(rs.getString("tempo_entrega"));
            cidade.setValorEntrega(rs.getDouble("valor_entrega"));
            
            Motorista mot = new Motorista();
            mot.setCnh(rs.getString("cnh"));
            mot.setCategoria(rs.getString("categoria"));
            mot.setStatus(rs.getString("status"));
            mot.setStatus(rs.getString("status"));
            mot.setId(rs.getInt("id_motorista"));
            mot.setNome(rs.getString("nome_mot"));
            mot.setEndereco(rs.getString("endereco"));
            mot.setSexo(rs.getString("sexo"));
            mot.setDataNasc(rs.getString("data_nasc"));
            
            pedido = new Pedido();
            pedido.setId(rs.getInt("id_pedido"));
            pedido.setDescricao(rs.getString("descricao"));
            pedido.setCidadeAtual(rs.getString("cidade_atual"));
            pedido.setVeiculo(rs.getString("veiculo"));
            pedido.setStatus(rs.getString("status"));
            pedido.setDataPedido(rs.getString("data_pedido"));
            pedido.setValorPedido(rs.getDouble("valor_pedido"));
            pedido.setCliente(cli);
            pedido.setCidade(cidade);
            pedido.setMotorista(mot);
        }
        
        return pedido;    
    }

    @Override
    public ArrayList<Pedido> BuscarTodos() throws SQLException, ClassNotFoundException {
    
        Connection c = ConnectionFactory.getConnection();
        
        String sql = "SELECT * FROM pedidos inner join cliente on pedidos.cpf_cliente = cliente.cpf inner join cidade_entrega on pedidos.cidade_id = cidade_entrega.id_cidade inner join motorista on pedidos.cnh_motorista = motorista.cnh";
        
        PreparedStatement pst = c.prepareStatement(sql);
        
        ResultSet rs = pst.executeQuery();
        
        Pedido pedido = null;
        ArrayList<Pedido> lista = new ArrayList<>();
        
        while(rs.next())
        {            
            Cliente cli = new Cliente();
            cli.setCpf(rs.getString("cpf"));
            cli.setId(rs.getInt("id_cliente"));
            cli.setNome(rs.getString("nome_cli"));
            cli.setEndereco(rs.getString("endereco"));
            cli.setSexo(rs.getString("sexo"));
            cli.setDataNasc(rs.getString("data_nasc"));
            
            CidadeEntrega cidade = new CidadeEntrega();
            cidade.setId(rs.getInt("id_cidade"));
            cidade.setNome(rs.getString("nome_cid"));
            cidade.setDistancia(rs.getDouble("distancia"));
            cidade.setTempoEntrega(rs.getString("tempo_entrega"));
            cidade.setValorEntrega(rs.getDouble("valor_entrega"));
            
            Motorista mot = new Motorista();
            mot.setCnh(rs.getString("cnh"));
            mot.setCategoria(rs.getString("categoria"));
            mot.setStatus(rs.getString("status"));
            mot.setStatus(rs.getString("status"));
            mot.setId(rs.getInt("id_motorista"));
            mot.setNome(rs.getString("nome_mot"));
            mot.setEndereco(rs.getString("endereco"));
            mot.setSexo(rs.getString("sexo"));
            mot.setDataNasc(rs.getString("data_nasc"));
            
            pedido = new Pedido();
            pedido.setId(rs.getInt("id_pedido"));
            pedido.setDescricao(rs.getString("descricao"));
            pedido.setCidadeAtual(rs.getString("cidade_atual"));
            pedido.setVeiculo(rs.getString("veiculo"));
            pedido.setStatus(rs.getString("status"));
            pedido.setDataPedido(rs.getString("data_pedido"));
            pedido.setValorPedido(rs.getDouble("valor_pedido"));
            pedido.setCliente(cli);
            pedido.setCidade(cidade);
            pedido.setMotorista(mot);
            
            lista.add(pedido);
        }
        
        return lista; 
    
    }

    @Override
    public int Quantidade() throws SQLException, ClassNotFoundException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public ArrayList<Pedido> BuscarPorCPF(String cpf) throws SQLException, ClassNotFoundException {
    
        Connection c = ConnectionFactory.getConnection();
        
        String sql = "SELECT * FROM pedidos inner join cliente on pedidos.cpf_cliente = cliente.cpf inner join cidade_entrega on pedidos.cidade_id = cidade_entrega.id_cidade WHERE cpf_cliente = ?";
        
        PreparedStatement pst = c.prepareStatement(sql);
        
        pst.setString(1, cpf);
        
        ResultSet rs = pst.executeQuery();
        
        Pedido pedido = null;
        ArrayList<Pedido> lista = new ArrayList<>();
        
        while(rs.next())
        {            
            Cliente cli = new Cliente();
            cli.setCpf(rs.getString("cpf"));
            cli.setId(rs.getInt("id_cliente"));
            cli.setNome(rs.getString("nome_cli"));
            cli.setEndereco(rs.getString("endereco"));
            cli.setSexo(rs.getString("sexo"));
            
            CidadeEntrega cidade = new CidadeEntrega();
            cidade.setId(rs.getInt("id_cidade"));
            cidade.setNome(rs.getString("nome_cid"));
            cidade.setDistancia(rs.getDouble("distancia"));
            cidade.setTempoEntrega(rs.getString("tempo_entrega"));
            cidade.setValorEntrega(rs.getDouble("valor_entrega"));
            
            pedido = new Pedido();
            pedido.setId(rs.getInt("id_pedido"));
            pedido.setDescricao(rs.getString("descricao"));
            pedido.setCidadeAtual(rs.getString("cidade_atual"));
            pedido.setVeiculo(rs.getString("veiculo"));
            pedido.setStatus(rs.getString("status"));
            pedido.setDataPedido(rs.getString("data_pedido"));
            pedido.setValorPedido(rs.getDouble("valor_pedido"));
            pedido.setCliente(cli);
            pedido.setCidade(cidade);
            
            lista.add(pedido);
        }
        
        return lista; 
    
    }
    
    public ArrayList<Pedido> BuscarPendentes() throws SQLException, ClassNotFoundException {
    
        Connection c = ConnectionFactory.getConnection();
        
        String sql = "SELECT * FROM pedidos inner join cliente on pedidos.cpf_cliente = cliente.cpf inner join cidade_entrega on pedidos.cidade_id = cidade_entrega.id_cidade";
        
        PreparedStatement pst = c.prepareStatement(sql);
        
        ResultSet rs = pst.executeQuery();
        
        Pedido pedido = null;
        ArrayList<Pedido> lista = new ArrayList<>();
        
        while(rs.next())
        {            
            Cliente cli = new Cliente();
            cli.setCpf(rs.getString("cpf"));
            cli.setId(rs.getInt("id_cliente"));
            cli.setNome(rs.getString("nome_cli"));
            cli.setEndereco(rs.getString("endereco"));
            cli.setSexo(rs.getString("sexo"));
            cli.setDataNasc(rs.getString("data_nasc"));
            
            CidadeEntrega cidade = new CidadeEntrega();
            cidade.setId(rs.getInt("id_cidade"));
            cidade.setNome(rs.getString("nome_cid"));
            cidade.setDistancia(rs.getDouble("distancia"));
            cidade.setTempoEntrega(rs.getString("tempo_entrega"));
            cidade.setValorEntrega(rs.getDouble("valor_entrega"));
            
            pedido = new Pedido();
            pedido.setId(rs.getInt("id_pedido"));
            pedido.setDescricao(rs.getString("descricao"));
            pedido.setCidadeAtual(rs.getString("cidade_atual"));
            pedido.setVeiculo(rs.getString("veiculo"));
            pedido.setStatus(rs.getString("status"));
            pedido.setDataPedido(rs.getString("data_pedido"));
            pedido.setValorPedido(rs.getDouble("valor_pedido"));
            pedido.setCliente(cli);
            pedido.setCidade(cidade);
            
            lista.add(pedido);
        }
        
        return lista; 
    
    }
    
    public Pedido BuscarPendentePelaChave(Integer p) throws SQLException, ClassNotFoundException {
        
        Connection c = ConnectionFactory.getConnection();
        
        String sql = "SELECT * FROM pedidos inner join cliente on pedidos.cpf_cliente = cliente.cpf inner join cidade_entrega on pedidos.cidade_id = cidade_entrega.id_cidade WHERE id_pedido = ?";
        
        PreparedStatement pst = c.prepareStatement(sql);
        
        pst.setInt(1, p);
        
        ResultSet rs = pst.executeQuery();
        
        Pedido pedido = null;
        
        if(rs.next())
        {   
            Cliente cli = new Cliente();
            cli.setCpf(rs.getString("cpf"));
            cli.setId(rs.getInt("id_cliente"));
            cli.setNome(rs.getString("nome_cli"));
            cli.setEndereco(rs.getString("endereco"));
            cli.setSexo(rs.getString("sexo"));
            cli.setDataNasc(rs.getString("data_nasc"));
            
            CidadeEntrega cidade = new CidadeEntrega();
            cidade.setId(rs.getInt("id_cidade"));
            cidade.setNome(rs.getString("nome_cid"));
            cidade.setDistancia(rs.getDouble("distancia"));
            cidade.setTempoEntrega(rs.getString("tempo_entrega"));
            cidade.setValorEntrega(rs.getDouble("valor_entrega"));
            
            pedido = new Pedido();
            pedido.setId(rs.getInt("id_pedido"));
            pedido.setDescricao(rs.getString("descricao"));
            pedido.setCidadeAtual(rs.getString("cidade_atual"));
            pedido.setVeiculo(rs.getString("veiculo"));
            pedido.setStatus(rs.getString("status"));
            pedido.setDataPedido(rs.getString("data_pedido"));
            pedido.setValorPedido(rs.getDouble("valor_pedido"));
            pedido.setCliente(cli);
            pedido.setCidade(cidade);
        }
        
        return pedido;    
    }
    
     public ArrayList<Pedido> BuscarPedidoCNH(String p) throws SQLException, ClassNotFoundException {
        
        Connection c = ConnectionFactory.getConnection();
        
        String sql = "SELECT * FROM pedidos inner join cliente on pedidos.cpf_cliente = cliente.cpf inner join cidade_entrega on pedidos.cidade_id = cidade_entrega.id_cidade inner join motorista on pedidos.cnh_motorista = motorista.cnh WHERE cnh_motorista = ?";
        
        PreparedStatement pst = c.prepareStatement(sql);
        
        pst.setString(1, p);
        
        ResultSet rs = pst.executeQuery();
        
        Pedido pedido = null;
        ArrayList<Pedido> lista = new ArrayList<>();
        
        while(rs.next())
        {            
            Cliente cli = new Cliente();
            cli.setCpf(rs.getString("cpf"));
            cli.setId(rs.getInt("id_cliente"));
            cli.setNome(rs.getString("nome_cli"));
            cli.setEndereco(rs.getString("endereco"));
            cli.setSexo(rs.getString("sexo"));
            cli.setDataNasc(rs.getString("data_nasc"));
            
            CidadeEntrega cidade = new CidadeEntrega();
            cidade.setId(rs.getInt("id_cidade"));
            cidade.setNome(rs.getString("nome_cid"));
            cidade.setDistancia(rs.getDouble("distancia"));
            cidade.setTempoEntrega(rs.getString("tempo_entrega"));
            cidade.setValorEntrega(rs.getDouble("valor_entrega"));
            
            Motorista mot = new Motorista();
            mot.setCnh(rs.getString("cnh"));
            mot.setCategoria(rs.getString("categoria"));
            mot.setStatus(rs.getString("status"));
            mot.setStatus(rs.getString("status"));
            mot.setId(rs.getInt("id_motorista"));
            mot.setNome(rs.getString("nome_mot"));
            mot.setEndereco(rs.getString("endereco"));
            mot.setSexo(rs.getString("sexo"));
            mot.setDataNasc(rs.getString("data_nasc"));
            
            pedido = new Pedido();
            pedido.setId(rs.getInt("id_pedido"));
            pedido.setDescricao(rs.getString("descricao"));
            pedido.setCidadeAtual(rs.getString("cidade_atual"));
            pedido.setVeiculo(rs.getString("veiculo"));
            pedido.setStatus(rs.getString("status"));
            pedido.setDataPedido(rs.getString("data_pedido"));
            pedido.setValorPedido(rs.getDouble("valor_pedido"));
            pedido.setCliente(cli);
            pedido.setCidade(cidade);
            pedido.setMotorista(mot);
            
            lista.add(pedido);
        }
        
        return lista;    
    }
}
