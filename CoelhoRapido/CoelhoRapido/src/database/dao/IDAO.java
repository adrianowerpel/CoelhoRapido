/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database.dao;

import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author aluno
 */
public interface IDAO<C,K> {
    
    public void Salvar(C p) throws SQLException, ClassNotFoundException;
    public void Alterar(C p) throws SQLException, ClassNotFoundException;
    public void Apagar(C p) throws SQLException, ClassNotFoundException;
    public C BuscarPelaChave(K p) throws SQLException, ClassNotFoundException;
    public ArrayList<C> BuscarTodos() throws SQLException, ClassNotFoundException;
    public int Quantidade() throws SQLException, ClassNotFoundException;
    
}
