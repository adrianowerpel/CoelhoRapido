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
public class LoginAdministrador extends Login{
    
    private String cod_admin;

    public LoginAdministrador() {
    }

    public LoginAdministrador(String cod_admin, int id, String senha) {
        super(id, senha);
        this.cod_admin = cod_admin;
    }

    public String getCod_admin() {
        return cod_admin;
    }

    public void setCod_admin(String cod_admin) {
        this.cod_admin = cod_admin;
    }    
}
