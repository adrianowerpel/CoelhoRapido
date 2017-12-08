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
public class Cliente extends Pessoa{
    
    private String cpf;

    public Cliente() {
    }

    public Cliente(String cpf, int id, String nome, String endereco, String sexo, String dataNasc) {
        super(id, nome, endereco, sexo, dataNasc);
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

      
}
