/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

/**
 *
 * @author patricia
 */
public class Pedido {
    
    private int id;
    private String descricao,cidadeAtual,veiculo,status,dataPedido;
    private double valorPedido;
    private Cliente cliente;
    private CidadeEntrega cidade;
    private Motorista motorista;

    public Pedido() {
    }

    public Pedido(int id, String descricao, String cidadeAtual, String veiculo, String status, String dataPedido, double valorPedido, Cliente cliente, CidadeEntrega cidade, Motorista motorista) {
        this.id = id;
        this.descricao = descricao;
        this.cidadeAtual = cidadeAtual;
        this.veiculo = veiculo;
        this.status = status;
        this.dataPedido = dataPedido;
        this.valorPedido = valorPedido;
        this.cliente = cliente;
        this.cidade = cidade;
        this.motorista = motorista;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getCidadeAtual() {
        return cidadeAtual;
    }

    public void setCidadeAtual(String cidadeAtual) {
        this.cidadeAtual = cidadeAtual;
    }

    public String getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(String veiculo) {
        this.veiculo = veiculo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDataPedido() {
        return dataPedido;
    }

    public void setDataPedido(String dataPedido) {
        this.dataPedido = dataPedido;
    }

    public double getValorPedido() {
        return valorPedido;
    }

    public void setValorPedido(double valorPedido) {
        this.valorPedido = valorPedido;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public CidadeEntrega getCidade() {
        return cidade;
    }

    public void setCidade(CidadeEntrega cidade) {
        this.cidade = cidade;
    }

    public Motorista getMotorista() {
        return motorista;
    }

    public void setMotorista(Motorista motorista) {
        this.motorista = motorista;
    }
    
    
}
