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
public class Motorista extends Pessoa{
    
    private String cnh,categoria,status;

    public Motorista() {
    }

    public Motorista(String cnh, String categoria, String status, int id, String nome, String endereco, String sexo, String dataNasc) {
        super(id, nome, endereco, sexo, dataNasc);
        this.cnh = cnh;
        this.categoria = categoria;
        this.status = status;
    }

    public String getCnh() {
        return cnh;
    }

    public void setCnh(String cnh) {
        this.cnh = cnh;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

      
}
