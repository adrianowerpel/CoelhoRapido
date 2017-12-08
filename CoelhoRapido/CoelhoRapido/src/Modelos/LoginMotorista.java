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
public class LoginMotorista extends Login{
    
    private String cnh_login;

    public LoginMotorista() {
    }

    public LoginMotorista(String cnh_login, int id, String senha) {
        super(id, senha);
        this.cnh_login = cnh_login;
    }

    public String getCnh_login() {
        return cnh_login;
    }

    public void setCnh_login(String cnh_login) {
        this.cnh_login = cnh_login;
    }   
}
