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
import model.bean.Atrasados;

/**
 *
 * @author henri
 */
public class AtrasadosDAO {
   public void create(Atrasados a){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
       
        try{
        stmt = (PreparedStatement) con.prepareStatement("INSERT INTO alunosatrasados(nomeAtrasado,sobrenomeAtrasado,turmaAtrasado,dataAtrasado,horaAtrasado)VALUES(?,?,?,?,?)");
        stmt.setString(1,a.getNomeAtrasado());
        stmt.setString(2,a.getSobrenomeAtrasado());
        stmt.setString(3,a.getTurmaAtrasado());
        stmt.setString(4,a.getDataAtrasado());
        stmt.setString(5,a.getHoraAtrasado());
       
        
        stmt.executeUpdate();
        ImageIcon icon = new ImageIcon("C:\\Users\\henri\\Desktop\\imagens tcc\\certo.png");
       JOptionPane.showMessageDialog(null, "Registro de chegada tardia concluído com sucesso", "Registro de chegada tardia", 0, icon);
    }catch (SQLException ex) {
        ImageIcon icon = new ImageIcon("C:\\Users\\henri\\Desktop\\imagens tcc\\close.png");
       JOptionPane.showMessageDialog(null, "Erro ao registrar chegada tardia, insira todas as informações corretamente", "Erro ao registrar chegada tardia", 0, icon);
    }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
     public List<Atrasados> read(){
         Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Atrasados> alunos = new ArrayList<>();
        try {
            stmt = (PreparedStatement) con.prepareStatement("SELECT * FROM alunosatrasados");
            rs = stmt.executeQuery();
            
            while (rs.next()){
                Atrasados aluno = new Atrasados();
                
                aluno.setNomeAtrasado(rs.getString("nomeAtrasado"));
                aluno.setSobrenomeAtrasado(rs.getString("sobrenomeAtrasado"));
                aluno.setTurmaAtrasado(rs.getString("turmaAtrasado"));
                aluno.setDataAtrasado(rs.getString("dataAtrasado"));
                aluno.setHoraAtrasado(rs.getString("horaAtrasado"));
                alunos.add(aluno);
            }
        } catch (SQLException ex) {
            Logger.getLogger(LiberarDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        
        }
    return alunos;
}
     public List<Atrasados> readForTurma(String turma){
         Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Atrasados> alunos = new ArrayList<>();
        try {
            stmt = (PreparedStatement) con.prepareStatement("SELECT * FROM alunosatrasados WHERE turmaAtrasado = ?");
            stmt.setString(1, turma);
            rs = stmt.executeQuery();
            
            while (rs.next()){
                Atrasados aluno = new Atrasados();
                aluno.setNomeAtrasado(rs.getString("nomeAtrasado"));
                aluno.setSobrenomeAtrasado(rs.getString("sobrenomeAtrasado"));
                aluno.setTurmaAtrasado(rs.getString("turmaAtrasado"));
                aluno.setDataAtrasado(rs.getString("dataAtrasado"));
                aluno.setHoraAtrasado(rs.getString("horaAtrasado"));
                alunos.add(aluno);
            }
        } catch (SQLException ex) {
            Logger.getLogger(LiberarDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        
        }
    return alunos;
}
      public void delete(Atrasados l){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
       
        try{
        stmt = (PreparedStatement) con.prepareStatement("DELETE FROM alunosatrasados WHERE nomeAtrasado = ?");
        stmt.setString(1,l.getNomeAtrasado());
        
        stmt.executeUpdate();
        ImageIcon icon = new ImageIcon("C:\\Users\\henri\\Desktop\\imagens tcc\\certo.png");
       JOptionPane.showMessageDialog(null, "Registro de chegada tardia excluído com sucesso", "Exclusão de chegada tardia", 0, icon);
    }catch (SQLException ex) {
        ImageIcon icon = new ImageIcon("C:\\Users\\henri\\Desktop\\imagens tcc\\close.png");
       JOptionPane.showMessageDialog(null, "Erro ao excluir registro de chegada tardia", "Erro na exclusão da chegada tardia", 0, icon);
    }finally{
            ConnectionFactory.closeConnection(con, stmt);
            
        }
    } 
       public List<Atrasados> readForSobrenome(String sobrenomeAtrasado){
         Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Atrasados> alunos = new ArrayList<>();
        try {
            stmt = (PreparedStatement) con.prepareStatement("SELECT * FROM alunosatrasados WHERE UPPER (sobrenomeAtrasado) = ?");
            stmt.setString(1, sobrenomeAtrasado);
            rs = stmt.executeQuery();
            
            while (rs.next()){
                Atrasados aluno = new Atrasados();
                aluno.setNomeAtrasado(rs.getString("nomeAtrasado"));
                aluno.setSobrenomeAtrasado(rs.getString("sobrenomeAtrasado"));
                aluno.setTurmaAtrasado(rs.getString("turmaAtrasado"));
                aluno.setDataAtrasado(rs.getString("dataAtrasado"));
                aluno.setHoraAtrasado(rs.getString("horaAtrasado"));
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
