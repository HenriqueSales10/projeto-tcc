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
import model.bean.Alunos;

/**
 *
 * @author henri
 */
public class AlunosDAO {
    public void create(Alunos al){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
       
        try{
        stmt = (PreparedStatement) con.prepareStatement("INSERT INTO alunos(matricula,nome,sobrenome,turma,telefonePais,emailPais)VALUES(?,?,?,?,?,?)");
         stmt.setString(1,al.getMatricula());
        stmt.setString(2,al.getNome());
        stmt.setString(3,al.getSobrenome());
        stmt.setString(4,al.getTurma());
        stmt.setString(5,al.getTelefonePais());
        stmt.setString(6,al.getEmailPais());
        
       
        
        stmt.executeUpdate();
         ImageIcon icon = new ImageIcon("C:\\Users\\henri\\Desktop\\imagens tcc\\certo.png");
       JOptionPane.showMessageDialog(null, "Anotação cadastrada com sucesso", "Cadastro de aluno", 0, icon);
    }catch (SQLException ex) {
         ImageIcon icon = new ImageIcon("C:\\Users\\henri\\Desktop\\imagens tcc\\close.png");
       JOptionPane.showMessageDialog(null, "Erro ao cadastrar aluno", "Exclusão da aluno", 0, icon);
    }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    
    public List<Alunos> read(){
         Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Alunos> alunos = new ArrayList<>();
        try {
            stmt = (PreparedStatement) con.prepareStatement("SELECT * FROM alunos");
            rs = stmt.executeQuery();
            
            while (rs.next()){
                Alunos aluno = new Alunos();
                aluno.setMatricula(rs.getString("matricula"));
                aluno.setNome(rs.getString("nome"));
                aluno.setSobrenome(rs.getString("sobrenome"));
                aluno.setTurma(rs.getString("turma"));
                aluno.setTelefonePais(rs.getString("telefonePais"));
                aluno.setEmailPais(rs.getString("emailPais"));
                
                
                alunos.add(aluno);
            }
        } catch (SQLException ex) {
            Logger.getLogger(AlunosDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
             ConnectionFactory.closeConnection(con, stmt);
        
        }
    return alunos;
}
    public void update(Alunos al){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
       
        try{
        stmt = (PreparedStatement) con.prepareStatement("UPDATE alunos SET nome = ?, sobrenome = ?, turma = ?, telefonePais = ?, emailPais = ? WHERE matricula = ?");
         stmt.setString(1,al.getNome());
         stmt.setString(2,al.getSobrenome());
        stmt.setString(3,al.getTurma());
        stmt.setString(4,al.getTelefonePais());
        stmt.setString(5,al.getEmailPais());
         stmt.setString(6,al.getMatricula());
        
        
        stmt.executeUpdate();
         ImageIcon icon = new ImageIcon("C:\\Users\\henri\\Desktop\\imagens tcc\\certo.png");
       JOptionPane.showMessageDialog(null, "Anotação atualizada com sucesso", "Atualização da aluno", 0, icon);
    }catch (SQLException ex) {
         ImageIcon icon = new ImageIcon("C:\\Users\\henri\\Desktop\\imagens tcc\\close.png");
       JOptionPane.showMessageDialog(null, "Erro ao atualizar aluno", "Erro na atualização da aluno", 0, icon);
    }finally{
             ConnectionFactory.closeConnection(con, stmt);
            
        }
    }

      public List<Alunos> readForMatricula(String matricula){
         Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Alunos> alunos = new ArrayList<>();
        try {
            stmt = (PreparedStatement) con.prepareStatement("SELECT * FROM alunos WHERE matricula = ?");
            stmt.setString(1, matricula);
            rs = stmt.executeQuery();
            
            while (rs.next()){
                Alunos aluno = new Alunos();
                aluno.setMatricula(rs.getString("matricula"));
                aluno.setNome(rs.getString("nome"));
                aluno.setSobrenome(rs.getString("sobrenome"));
                aluno.setTurma(rs.getString("turma"));
                aluno.setTelefonePais(rs.getString("telefonePais"));
                aluno.setEmailPais(rs.getString("emailPais"));
              
            }
        } catch (SQLException ex) {
            Logger.getLogger(AlunosDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            ConnectionFactory.closeConnection(con, (com.mysql.jdbc.PreparedStatement) stmt, rs);
        
        }
    return alunos;
}
      public List<Alunos> readForTurma(String turma){
         Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Alunos> alunos = new ArrayList<>();
        try {
            stmt = (PreparedStatement) con.prepareStatement("SELECT * FROM alunos WHERE turma = ?");
            stmt.setString(1, turma);
            rs = stmt.executeQuery();
            
            while (rs.next()){
                Alunos aluno = new Alunos();
                aluno.setMatricula(rs.getString("matricula"));
                aluno.setNome(rs.getString("nome"));
                aluno.setSobrenome(rs.getString("sobrenome"));
                aluno.setTurma(rs.getString("turma"));
                aluno.setTelefonePais(rs.getString("telefonePais"));
                aluno.setEmailPais(rs.getString("emailPais"));
              
                alunos.add(aluno);
            }
        } catch (SQLException ex) {
            Logger.getLogger(AlunosDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            ConnectionFactory.closeConnection(con, (com.mysql.jdbc.PreparedStatement) stmt, rs);
        
        }
    return alunos;
}
      public void delete(Alunos an){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
       
        try{
        stmt = (PreparedStatement) con.prepareStatement("DELETE FROM alunos WHERE matricula = ?");
        stmt.setString(1,an.getMatricula());
        
        stmt.executeUpdate();
         ImageIcon icon = new ImageIcon("C:\\Users\\henri\\Desktop\\imagens tcc\\certo.png");
       JOptionPane.showMessageDialog(null, "Cadastro de aluno excluido com sucesso", "Exclusão de aluno", 0, icon);
    }catch (SQLException ex) {
         ImageIcon icon = new ImageIcon("C:\\Users\\henri\\Desktop\\imagens tcc\\close.png");
       JOptionPane.showMessageDialog(null, "Erro ao excluir cadastro de aluno", "Exclusão de aluno", 0, icon);
    }finally{
            ConnectionFactory.closeConnection(con, (com.mysql.jdbc.PreparedStatement) stmt);
            
        }
    }
}
