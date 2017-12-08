/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

/**
 *
 * @author aluno
 */
public class CidadeEntrega {
    
    private int id;
    private String nome,tempoEntrega;
    private double distancia,valorEntrega;

    public CidadeEntrega() {
    }

    public CidadeEntrega(int id, String nome, String tempoEntrega, double distancia, double valorEntrega) {
        this.id = id;
        this.nome = nome;
        this.tempoEntrega = tempoEntrega;
        this.distancia = distancia;
        this.valorEntrega = valorEntrega;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTempoEntrega() {
        return tempoEntrega;
    }

    public void setTempoEntrega(String tempoEntrega) {
        this.tempoEntrega = tempoEntrega;
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public double getValorEntrega() {
        return valorEntrega;
    }

    public void setValorEntrega(double valorEntrega) {
        this.valorEntrega = valorEntrega;
    }

      
}
