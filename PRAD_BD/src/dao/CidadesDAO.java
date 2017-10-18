/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javabeans.Cidades;
import jdbc.ConectionFactory;

/**
 *
 * @author Suporte
 */
public class CidadesDAO {
    private Connection conecta;
    public CidadesDAO(){
        this.conecta = new ConectionFactory().conecta();
    }
    public List<Cidades> listarCidades(){
        try{
            List<Cidades> lista = new ArrayList<Cidades>();
            String Sql = "select * from cidade";
            PreparedStatement stmt = conecta.prepareStatement(Sql);
            ResultSet rs = stmt.executeQuery();
            while(rs.next()){
                Cidades c = new Cidades();
                c.setId(rs.getInt("cid_codigo"));
                c.setNome(rs.getString("cid_nome"));
                c.setUf(rs.getString("cid_uf"));
                lista.add(c);
            }
        
            return lista;
        }catch(SQLException erro){
            throw new RuntimeException(erro);
        }
    }
    public void cadastrarCidade(Cidades obj)
    {
        try{
            String cmdsql = "insert into cidade(cid_nome, cid_uf) values (?,?)";
            PreparedStatement stmt = conecta.prepareStatement(cmdsql);
            stmt.setString(1, obj.getNome());
            stmt.setString(2, obj.getUf());
            stmt.execute();
            
            stmt.close();
            
        }catch(SQLException erro){
           throw new RuntimeException(erro); 
        }
    }
    public void alterarCidade(Cidades obj)
    {
        try{
            String cmdsql = "update cidade set cid_nome=?, cid_uf=? where cid_codigo=?";
            PreparedStatement stmt = conecta.prepareStatement(cmdsql);
            stmt.setString(1, obj.getNome());
            stmt.setString(2, obj.getUf());
            stmt.setInt(3, obj.getId());
            stmt.execute();
            
            stmt.close();
            
        }catch(SQLException erro){
           throw new RuntimeException(erro); 
        }
    }
}
