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
public class LoginCliente extends Login{
    
    private String cpf_login;

    public LoginCliente() {
    }

    public LoginCliente(String cpf_login, int id, String senha) {
        super(id, senha);
        this.cpf_login = cpf_login;
    }

    public String getCpf_login() {
        return cpf_login;
    }

    public void setCpf_login(String cpf_login) {
        this.cpf_login = cpf_login;
    }

      
}
