/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.Address;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;

/**
 *
 * @author RojeruSan
 */
public class PainelEmail extends javax.swing.JPanel {
    
    private String remetente;
    private String destinatario;
    private String nome;
    private String senha;
    private String assunto;
    private String mensagem;
    
    
    
    
 public PainelEmail() {
        initComponents();
 }
    /**
     * Creates new form pnlHome
     */
   
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        ServidorSMTP = new javax.swing.JTextField();
        lblRemetente = new javax.swing.JLabel();
        txtRemetente = new javax.swing.JTextField();
        txtNome = new javax.swing.JTextField();
        lblNome = new javax.swing.JLabel();
        lblAssunto = new javax.swing.JLabel();
        txtAssunto = new javax.swing.JTextField();
        txtSenha = new javax.swing.JPasswordField();
        lblSenha = new javax.swing.JLabel();
        lblDestinatario = new javax.swing.JLabel();
        txtDestinatario = new javax.swing.JTextField();
        Porta = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtMensagem = new javax.swing.JTextArea();
        BotaoEnviar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        lblMensagem = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(1620, 950));
        setMinimumSize(new java.awt.Dimension(1620, 950));
        setPreferredSize(new java.awt.Dimension(1620, 950));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Endereço de SMTP");

        ServidorSMTP.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ServidorSMTP.setForeground(new java.awt.Color(255, 255, 255));
        ServidorSMTP.setText("smtp.gmail.com");
        ServidorSMTP.setBorder(null);
        ServidorSMTP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ServidorSMTPActionPerformed(evt);
            }
        });

        lblRemetente.setBackground(new java.awt.Color(255, 255, 255));
        lblRemetente.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblRemetente.setText("Remetente *");

        txtRemetente.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtRemetente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtRemetenteKeyPressed(evt);
            }
        });

        txtNome.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        lblNome.setBackground(new java.awt.Color(255, 255, 255));
        lblNome.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblNome.setText("Nome *");

        lblAssunto.setBackground(new java.awt.Color(255, 255, 255));
        lblAssunto.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblAssunto.setText("Assunto *");

        txtAssunto.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        txtSenha.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSenhaActionPerformed(evt);
            }
        });

        lblSenha.setBackground(new java.awt.Color(255, 255, 255));
        lblSenha.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblSenha.setText("Senha *");

        lblDestinatario.setBackground(new java.awt.Color(255, 255, 255));
        lblDestinatario.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblDestinatario.setText("Destinatário *");

        txtDestinatario.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        Porta.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Porta.setForeground(new java.awt.Color(255, 255, 255));
        Porta.setText("465");
        Porta.setBorder(null);

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Porta:");

        txtMensagem.setColumns(20);
        txtMensagem.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        txtMensagem.setRows(5);
        jScrollPane1.setViewportView(txtMensagem);

        BotaoEnviar.setBackground(new java.awt.Color(255, 255, 255));
        BotaoEnviar.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        BotaoEnviar.setText("Enviar");
        BotaoEnviar.setMaximumSize(new java.awt.Dimension(107, 31));
        BotaoEnviar.setMinimumSize(new java.awt.Dimension(107, 31));
        BotaoEnviar.setPreferredSize(new java.awt.Dimension(107, 31));
        BotaoEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoEnviarActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 40)); // NOI18N
        jLabel8.setText("Envio de e-mail aos pais");

        lblMensagem.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        lblMensagem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(568, 568, 568)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 493, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(328, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(679, 679, 679)
                        .addComponent(ServidorSMTP, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblAssunto)
                                .addGap(46, 46, 46)
                                .addComponent(txtAssunto, javax.swing.GroupLayout.PREFERRED_SIZE, 818, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(211, 211, 211)
                                .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblNome)
                                    .addComponent(txtRemetente, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblRemetente))
                                .addGap(211, 211, 211)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblDestinatario)
                                    .addComponent(txtDestinatario, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblSenha)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jScrollPane1)
                                .addComponent(lblMensagem, javax.swing.GroupLayout.PREFERRED_SIZE, 968, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(412, 412, 412)
                                .addComponent(BotaoEnviar, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(241, 241, 241)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(Porta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLabel8)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Porta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ServidorSMTP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblRemetente, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblDestinatario, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtRemetente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDestinatario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNome, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtAssunto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblAssunto, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblMensagem, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BotaoEnviar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(274, 274, 274))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtRemetenteKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRemetenteKeyPressed

    }//GEN-LAST:event_txtRemetenteKeyPressed

    private void txtSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSenhaActionPerformed
public void EmailSimples() throws UnsupportedEncodingException {

        Properties props = new Properties();
        /** Parâmetros de conexão com servidor Gmail */
        props.put("mail.smtp.host", ServidorSMTP.getText());
        props.put("mail.smtp.socketFactory.port", Porta.getText());
        props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.port", Porta.getText());

        Session session = Session.getDefaultInstance(props,
                new javax.mail.Authenticator() {

                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(txtRemetente.getText(), txtSenha.getText());
                    }
                });

        /** Ativa Debug para sessão */
        session.setDebug(true);

        try {

            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(txtRemetente.getText(), txtDestinatario.getText())); //Remetente

            Address[] toUser = InternetAddress //Destinatário(s)
                    .parse(txtDestinatario.getText());

            message.setRecipients(Message.RecipientType.TO, toUser);
            message.setSubject(txtAssunto.getText());//Assunto
            message.setText(txtMensagem.getText());
            /**Método para enviar a mensagem criada*/
            Transport.send(message);

            System.out.println("Feito!!!");
            JOptionPane.showMessageDialog(null, "Email Enviado com Sucesso");

        } catch (MessagingException e) {
            JOptionPane.showMessageDialog(null, "Houve um erro no Envio !");
            throw new RuntimeException(e);

        }
    }

   
    private void BotaoEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoEnviarActionPerformed
        remetente = txtRemetente.getText();
        destinatario = txtDestinatario.getText();
        nome = txtDestinatario.getText();
        senha = new String (txtSenha.getPassword());
        assunto = txtAssunto.getText();
        mensagem = txtMensagem.getText();
        
        
        
         if (remetente.isEmpty()){
          lblRemetente.setText("Remetente");
          lblRemetente.setForeground(Color.red);
      } else{
          lblRemetente.setText("Remetente");
          lblRemetente.setForeground(Color.black);
      }
        
       if (destinatario.isEmpty()){
          lblDestinatario.setText("Destinatário *");
          lblDestinatario.setForeground(Color.red);
      } else{
          lblDestinatario.setText("Destinatário *");
          lblDestinatario.setForeground(Color.black);
      }
       
        if (nome.isEmpty()){
          lblNome.setText("Nome *");
          lblNome.setForeground(Color.red);
      } else{
          lblNome.setText("Nome *");
          lblNome.setForeground(Color.black);
      }
        
         if (senha.isEmpty()){
          lblSenha.setText("Senha *");
          lblSenha.setForeground(Color.red);
      } else{
          lblSenha.setText("Senha *");
          lblSenha.setForeground(Color.black);
      }
         
          if (assunto.isEmpty()){
          lblAssunto.setText("Assunto *");
          lblAssunto.setForeground(Color.red);
      } else{
          lblAssunto.setText("Assunto *");
          lblAssunto.setForeground(Color.black);
      }
          
           if (remetente.isEmpty() || destinatario.isEmpty() || nome.isEmpty() || senha.isEmpty() || assunto.isEmpty()){
              lblMensagem.setForeground(Color.red);
              lblMensagem.setText("Campos obrigatórios não preenchidos");
          }
        else{
        
        try {
            EmailSimples();
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(PainelEmail.class.getName()).log(Level.SEVERE, null, ex);
        }
           }
    }//GEN-LAST:event_BotaoEnviarActionPerformed

    private void ServidorSMTPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ServidorSMTPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ServidorSMTPActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoEnviar;
    private javax.swing.JTextField Porta;
    private javax.swing.JTextField ServidorSMTP;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAssunto;
    private javax.swing.JLabel lblDestinatario;
    private javax.swing.JLabel lblMensagem;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblRemetente;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JTextField txtAssunto;
    private javax.swing.JTextField txtDestinatario;
    private javax.swing.JTextArea txtMensagem;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtRemetente;
    private javax.swing.JPasswordField txtSenha;
    // End of variables declaration//GEN-END:variables

   
}
