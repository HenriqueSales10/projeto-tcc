/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import com.mysql.jdbc.PreparedStatement;
import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import model.bean.Liberar;


/**
 *
 * @author henri
 */
public class LiberarDAO {
      public void create(Liberar l){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
       
        try{
        stmt = (PreparedStatement) con.prepareStatement("INSERT INTO alunosliberados(nome,sobrenome,turma,dataa,horaa)VALUES(?,?,?,?,?)");
        stmt.setString(1,l.getNome());
        stmt.setString(2,l.getSobrenome());
        stmt.setString(3,l.getTurma());
        stmt.setString(4,l.getDataa());
        stmt.setString(5,l.getHoraa());
       
        
        stmt.executeUpdate();
        ImageIcon icon = new ImageIcon("C:\\Users\\henri\\Desktop\\imagens tcc\\certo.png");
       JOptionPane.showMessageDialog(null, "Aluno liberado com sucesso", "Liberação do aluno", 0, icon);
    }catch (SQLException ex) {
        ImageIcon icon = new ImageIcon("C:\\Users\\henri\\Desktop\\imagens tcc\\close.png");
       JOptionPane.showMessageDialog(null, "Erro ao liberar aluno, insira todas as informações corretamente", "Erro ao liberar aluno", 0, icon);
    }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
     public List<Liberar> read(){
         Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Liberar> alunos = new ArrayList<>();
        try {
            stmt = (PreparedStatement) con.prepareStatement("SELECT * FROM alunosliberados");
            rs = stmt.executeQuery();
            
            while (rs.next()){
                Liberar aluno = new Liberar();
                
                aluno.setNome(rs.getString("nome"));
                aluno.setSobrenome(rs.getString("sobrenome"));
                aluno.setTurma(rs.getString("turma"));
                aluno.setDataa(rs.getString("dataa"));
                aluno.setHoraa(rs.getString("horaa"));
                alunos.add(aluno);
            }
        } catch (SQLException ex) {
            Logger.getLogger(LiberarDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        
        }
    return alunos;
}
     public List<Liberar> readForTurma(String turma){
         Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Liberar> alunos = new ArrayList<>();
        try {
            stmt = (PreparedStatement) con.prepareStatement("SELECT * FROM alunosliberados WHERE turma = ?");
            stmt.setString(1, turma);
            rs = stmt.executeQuery();
            
            while (rs.next()){
                Liberar aluno = new Liberar();
                aluno.setNome(rs.getString("nome"));
                aluno.setSobrenome(rs.getString("sobrenome"));
                aluno.setTurma(rs.getString("turma"));
                aluno.setDataa(rs.getString("dataa"));
                aluno.setHoraa(rs.getString("horaa"));
                alunos.add(aluno);
            }
        } catch (SQLException ex) {
            Logger.getLogger(LiberarDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        
        }
    return alunos;
}
      public void delete(Liberar l){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
       
        try{
        stmt = (PreparedStatement) con.prepareStatement("DELETE FROM alunosliberados WHERE nome = ?");
        stmt.setString(1,l.getNome());
        
        stmt.executeUpdate();
        ImageIcon icon = new ImageIcon("C:\\Users\\henri\\Desktop\\imagens tcc\\certo.png");
       JOptionPane.showMessageDialog(null, "Liberação excluída com sucesso", "Exclusão de liberação", 0, icon);
    }catch (SQLException ex) {
        ImageIcon icon = new ImageIcon("C:\\Users\\henri\\Desktop\\imagens tcc\\close.png");
       JOptionPane.showMessageDialog(null, "Erro ao excluir liberação", "Erro na exclusão da liberação", 0, icon);
    }finally{
            ConnectionFactory.closeConnection(con, stmt);
            
        }
    }
      
      public List<Liberar> readForSobrenome(String sobrenome){
         Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Liberar> alunos = new ArrayList<>();
        try {
            stmt = (PreparedStatement) con.prepareStatement("SELECT * FROM alunosliberados WHERE UPPER (sobrenome) = ?");
            stmt.setString(1, sobrenome);
            rs = stmt.executeQuery();
            
            while (rs.next()){
                Liberar aluno = new Liberar();
                aluno.setNome(rs.getString("nome"));
                aluno.setSobrenome(rs.getString("sobrenome"));
                aluno.setTurma(rs.getString("turma"));
                aluno.setDataa(rs.getString("dataa"));
                aluno.setHoraa(rs.getString("horaa"));
                alunos.add(aluno);
            }
        } catch (SQLException ex) {
            Logger.getLogger(LiberarDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        
        }
    return alunos;
}
}
