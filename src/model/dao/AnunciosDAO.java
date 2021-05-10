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
import model.bean.Anuncios;

/**
 *
 * @author henri
 */
public class AnunciosDAO {

    public void create(Anuncios an) {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;

        try {
            stmt = (PreparedStatement) con.prepareStatement("INSERT INTO anuncios(nome,cliente,dataInicio,dataFinal,investimentoDia)VALUES(?,?,?,?,?)");
            stmt.setString(1, an.getNome());
            stmt.setString(2, an.getCliente());
            stmt.setString(3, an.getDataInicio());
            stmt.setString(4, an.getDataFinal());
            stmt.setDouble(5, an.getInvestimentoDia());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Anúncio cadastrado com sucesso", "Cadastro de anúncio", 0, null);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar anúncio", "Erro no cadastro", 0, null);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }

    public List<Anuncios> read() {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Anuncios> anuncios = new ArrayList<>();
        try {
            stmt = (PreparedStatement) con.prepareStatement("SELECT * FROM anuncios");
            rs = stmt.executeQuery();

            while (rs.next()) {
                Anuncios anuncio = new Anuncios();

                anuncio.setNome(rs.getString("nome"));
                anuncio.setCliente(rs.getString("cliente"));
                anuncio.setDataInicio(rs.getString("dataInicio"));
                anuncio.setDataFinal(rs.getString("dataFinal"));
                anuncio.setInvestimentoDia(rs.getDouble("investimentoDia"));

                anuncios.add(anuncio);
            }
        } catch (SQLException ex) {
            Logger.getLogger(AnunciosDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);

        }
        return anuncios;
    }

    public List<Anuncios> readForData(String dataBusca) {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Anuncios> anuncios = new ArrayList<>();
        try {
            stmt = (PreparedStatement) con.prepareStatement("SELECT * FROM anuncios WHERE dataBusca BETWEEN ? AND ?");
            stmt.setString(1, dataBusca);
            rs = stmt.executeQuery();

            while (rs.next()) {
                Anuncios anuncio = new Anuncios();
                anuncio.setNome(rs.getString("nome"));
                anuncio.setCliente(rs.getString("cliente"));
                anuncio.setDataInicio(rs.getString("dataInicio"));
                anuncio.setDataFinal(rs.getString("dataFinal"));
                anuncio.setInvestimentoDia(rs.getInt("investimentoDia"));

            }
        } catch (SQLException ex) {
            Logger.getLogger(AnunciosDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, (com.mysql.jdbc.PreparedStatement) stmt, rs);

        }
        return anuncios;
    }

    public List<Anuncios> readForCliente(String cliente) {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Anuncios> anuncios = new ArrayList<>();
        try {
            stmt = (PreparedStatement) con.prepareStatement("SELECT * FROM anuncios WHERE cliente = ?");
            stmt.setString(1, cliente);
            rs = stmt.executeQuery();

            while (rs.next()) {
                Anuncios anuncio = new Anuncios();
                anuncio.setNome(rs.getString("nome"));
                anuncio.setCliente(rs.getString("cliente"));
                anuncio.setDataInicio(rs.getString("dataInicio"));
                anuncio.setDataFinal(rs.getString("dataFinal"));
                anuncio.setInvestimentoDia(rs.getInt("investimentoDia"));

                anuncios.add(anuncio);
            }
        } catch (SQLException ex) {
            Logger.getLogger(AnunciosDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, (com.mysql.jdbc.PreparedStatement) stmt, rs);

        }
        return anuncios;
    }

}
