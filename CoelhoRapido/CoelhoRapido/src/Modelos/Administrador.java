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
public class Administrador extends Pessoa{
    
    private String codigo;

    public Administrador() {
    }

    public Administrador(String codigo, int id, String nome, String endereco, String sexo, String dataNasc) {
        super(id, nome, endereco, sexo, dataNasc);
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

       
}
