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
import model.bean.Anotacao;

/**
 *
 * @author henri
 */
public class AnotacaoDAO {
    public void create(Anotacao an){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
       
        try{
        stmt = (PreparedStatement) con.prepareStatement("INSERT INTO anotacao(matricula,nome,sobrenome,turma,tipoInfracao,tipoInfracao2,tipoInfracao3,observacao)VALUES(?,?,?,?,?,?,?,?)");
         stmt.setString(1,an.getMatricula());
        stmt.setString(2,an.getNome());
        stmt.setString(3,an.getSobrenome());
        stmt.setString(4,an.getTurma());
        stmt.setString(5,an.getTipoInfracao());
        stmt.setString(6,an.getTipoInfracao2());
        stmt.setString(7,an.getTipoInfracao3());
        stmt.setString(8,an.getObservacao());
       
        
        stmt.executeUpdate();
         ImageIcon icon = new ImageIcon("C:\\Users\\henri\\Desktop\\imagens tcc\\certo.png");
       JOptionPane.showMessageDialog(null, "Anotação cadastrada com sucesso", "Cadastro de anotação", 0, icon);
    }catch (SQLException ex) {
         ImageIcon icon = new ImageIcon("C:\\Users\\henri\\Desktop\\imagens tcc\\close.png");
       JOptionPane.showMessageDialog(null, "Erro ao cadastrar anotação", "Exclusão da anotação", 0, icon);
    }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    
    public List<Anotacao> read(){
         Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Anotacao> anotacao = new ArrayList<>();
        try {
            stmt = (PreparedStatement) con.prepareStatement("SELECT * FROM anotacao");
            rs = stmt.executeQuery();
            
            while (rs.next()){
                Anotacao aluno = new Anotacao();
                aluno.setMatricula(rs.getString("matricula"));
                aluno.setNome(rs.getString("nome"));
                aluno.setSobrenome(rs.getString("sobrenome"));
                aluno.setTurma(rs.getString("turma"));
                aluno.setTipoInfracao(rs.getString("tipoInfracao"));
                aluno.setTipoInfracao2(rs.getString("tipoInfracao2"));
                aluno.setTipoInfracao3(rs.getString("tipoInfracao3"));
                aluno.setObservacao(rs.getString("observacao"));
                
                anotacao.add(aluno);
            }
        } catch (SQLException ex) {
            Logger.getLogger(AlunosDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        
        }
    return anotacao;
}
    public void update(Anotacao an){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
       
        try{
        stmt = (PreparedStatement) con.prepareStatement("UPDATE anotacao SET nome = ?,sobrenome = ?, turma = ?, tipoInfracao = ?, tipoInfracao2 = ?, tipoInfracao3 = ?, observacao = ? WHERE matricula = ?");
         stmt.setString(1,an.getNome());
         stmt.setString(2,an.getSobrenome());
        stmt.setString(3,an.getTurma());
        stmt.setString(4,an.getTipoInfracao());
        stmt.setString(5,an.getTipoInfracao2());
        stmt.setString(6,an.getTipoInfracao3());
        stmt.setString(7,an.getObservacao());
         stmt.setString(8,an.getMatricula());
        
        
        stmt.executeUpdate();
         ImageIcon icon = new ImageIcon("C:\\Users\\henri\\Desktop\\imagens tcc\\certo.png");
       JOptionPane.showMessageDialog(null, "Anotação atualizada com sucesso", "Atualização da anotação", 0, icon);
    }catch (SQLException ex) {
         ImageIcon icon = new ImageIcon("C:\\Users\\henri\\Desktop\\imagens tcc\\close.png");
       JOptionPane.showMessageDialog(null, "Erro ao atualizar anotação", "Erro na atualização da anotação", 0, icon);
    }finally{
            ConnectionFactory.closeConnection(con, stmt);
            
        }
    }

      public List<Anotacao> readForMatricula(String matricula){
         Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Anotacao> anotacao = new ArrayList<>();
        try {
            stmt = (PreparedStatement) con.prepareStatement("SELECT * FROM anotacao WHERE matricula = ?");
            stmt.setString(1, matricula);
            rs = stmt.executeQuery();
            
            while (rs.next()){
                Anotacao anotacoes = new Anotacao();
                anotacoes.setMatricula(rs.getString("matricula"));
                anotacoes.setNome(rs.getString("nome"));
                anotacoes.setSobrenome(rs.getString("sobrenome"));
                anotacoes.setTurma(rs.getString("turma"));
                anotacoes.setTipoInfracao(rs.getString("tipoInfracao"));
                anotacoes.setTipoInfracao2(rs.getString("tipoInfracao2"));
                anotacoes.setTipoInfracao3(rs.getString("tipoInfracao3"));
                anotacoes.setObservacao(rs.getString("observacao"));
                anotacao.add(anotacoes);
            }
        } catch (SQLException ex) {
            Logger.getLogger(AlunosDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        
        }
    return anotacao;
}
      public List<Anotacao> readForTurma(String turma){
         Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Anotacao> anotacao = new ArrayList<>();
        try {
            stmt = (PreparedStatement) con.prepareStatement("SELECT * FROM anotacao WHERE turma = ?");
            stmt.setString(1, turma);
            rs = stmt.executeQuery();
            
            while (rs.next()){
                Anotacao anotacoes = new Anotacao();
                anotacoes.setMatricula(rs.getString("matricula"));
                anotacoes.setNome(rs.getString("nome"));
                anotacoes.setSobrenome(rs.getString("sobrenome"));
                anotacoes.setTurma(rs.getString("turma"));
                anotacoes.setTipoInfracao(rs.getString("tipoInfracao"));
                anotacoes.setTipoInfracao2(rs.getString("tipoInfracao2"));
                anotacoes.setTipoInfracao3(rs.getString("tipoInfracao3"));
               anotacoes.setObservacao(rs.getString("observacao"));
                anotacao.add(anotacoes);
            }
        } catch (SQLException ex) {
            Logger.getLogger(AlunosDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        
        }
    return anotacao;
}
      public void delete(Anotacao an){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
       
        try{
        stmt = (PreparedStatement) con.prepareStatement("DELETE FROM anotacao WHERE matricula = ?");
        stmt.setString(1,an.getMatricula());
        
        stmt.executeUpdate();
         ImageIcon icon = new ImageIcon("C:\\Users\\henri\\Desktop\\imagens tcc\\certo.png");
       JOptionPane.showMessageDialog(null, "Cadastro de anotação excluída com sucesso", "Exclusão de anotação", 0, icon);
    }catch (SQLException ex) {
         ImageIcon icon = new ImageIcon("C:\\Users\\henri\\Desktop\\imagens tcc\\close.png");
       JOptionPane.showMessageDialog(null, "Erro ao excluir cadastro de anotação", "Exclusão de anotação", 0, icon);
    }finally{
            ConnectionFactory.closeConnection(con, stmt);
            
        }
    }
}
