
package model.dao;

import com.mysql.jdbc.PreparedStatement;
import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.bean.Usuario;
import principalGuarita.TelaPrincipalGuarita;
import view.FrmSplash;
import viewGuarita.FrmSplashGuarita;



public class UsuarioDAO {

public boolean checkLogin(String usuario, String senha){
         Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        boolean check = false;
       
        try {
            stmt = (PreparedStatement) con.prepareStatement("SELECT * FROM usuario WHERE usuario = ? and senha = ?");
            stmt.setString(1, usuario);
            stmt.setString(2, senha);
            rs = stmt.executeQuery();
            
            if (rs.next()){
               check = true;
                String perfil=rs.getString(4);
               //Tratamento do perfil
//                if(perfil.equals("guarita")){
//                    new TelaPrincipal().setVisible(true);
//                }
            if(perfil.equals("guarita")){
                new FrmSplashGuarita().setVisible(true);
               
            
                
                
            } if (perfil.equals("coordenador")){
            new FrmSplash().setVisible(true);    
               
               
            }
                          
            }
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        
        }
    return check;
}    
}
