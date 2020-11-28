/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import model.bean.Alunos;
import model.dao.AlunosDAO2;

/**
 *
 * @author RojeruSan
 */
public class PainelCadastro2 extends javax.swing.JPanel {

    private String matriculaa;
    private String nomee;
    private String sobrenomee;
    private String turmaa;
   
    
    /**
     * Creates new form pnlHome
     */
    public PainelCadastro2() {
        initComponents();
        setBackground(new Color(255,255,255));
        jTable.getTableHeader().setFont(new Font("Tahoma", Font.BOLD, 16));
        jTable.getTableHeader().setOpaque(false);
        jTable.getTableHeader().setBackground(new Color(0,0,0));
        jTable.getTableHeader().setForeground(new Color(255,255,255));
        jTable.setRowHeight(25);
         DefaultTableModel modelo = (DefaultTableModel) jTable.getModel();
        jTable.setRowSorter(new TableRowSorter(modelo));
        readjTable();
       
    }

    public void readjTable(){
        DefaultTableModel modelo = (DefaultTableModel) jTable.getModel();
        modelo.setNumRows(0);
        AlunosDAO2 andao = new AlunosDAO2();
        for(Alunos al: andao.read()){
            modelo.addRow(new Object[]{
                al.getMatricula(),
                al.getNome(),
                al.getSobrenome(),
                al.getTurma(),
                al.getTelefonePais(),
                al.getEmailPais()
               
                    
            });
        }
    }
  public void readjTableForMat(String matricula){
        DefaultTableModel modelo = (DefaultTableModel) jTable.getModel();
        modelo.setNumRows(0);
        AlunosDAO2 aldao = new AlunosDAO2();
        for(Alunos al: aldao.readForMatricula(matricula)){
            modelo.addRow(new Object[]{
                al.getMatricula(),
                al.getNome(),
                al.getSobrenome(),
                al.getTurma(),
                al.getTelefonePais(),
                al.getEmailPais(),
                        
                    });
        }
    }
  public void readjTableForTurma(String turma){
        DefaultTableModel modelo = (DefaultTableModel) jTable.getModel();
        modelo.setNumRows(0);
        AlunosDAO2 andao = new AlunosDAO2();
        for(Alunos al: andao.readForTurma(turma)){
            modelo.addRow(new Object[]{
                al.getMatricula(),
                al.getNome(),
                al.getSobrenome(),
                al.getTurma(),
                 al.getTelefonePais(),
                 al.getEmailPais()
                
                    
                 
                        
                    });
        }
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblMatricula = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        lblSobrenome = new javax.swing.JLabel();
        lblTurma = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        nome = new javax.swing.JTextField();
        sobrenome = new javax.swing.JTextField();
        txtBuscarTurma = new javax.swing.JComboBox<>();
        btnExcluir = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnCadastrar = new javax.swing.JButton();
        matricula = new javax.swing.JFormattedTextField();
        turma = new javax.swing.JComboBox<>();
        jButton5 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        lblMensagem = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        txtTelefone = new javax.swing.JFormattedTextField();
        txtBusca = new javax.swing.JFormattedTextField();
        btnBuscar = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(1620, 950));
        setMinimumSize(new java.awt.Dimension(1620, 950));
        setPreferredSize(new java.awt.Dimension(1620, 950));

        lblMatricula.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblMatricula.setText("Matrícula");

        lblNome.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblNome.setText("Nome *");

        lblSobrenome.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblSobrenome.setText("Sobrenome *");

        lblTurma.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblTurma.setText("Turma");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setText("Telefone dos pais");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setText("Email dos pais");

        nome.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        nome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                nomeKeyPressed(evt);
            }
        });

        sobrenome.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        txtBuscarTurma.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtBuscarTurma.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "INF101", "INF102", "INF201", "INF202", "INF301", "INF302" }));

        btnExcluir.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.setMaximumSize(new java.awt.Dimension(107, 31));
        btnExcluir.setMinimumSize(new java.awt.Dimension(107, 31));
        btnExcluir.setPreferredSize(new java.awt.Dimension(107, 31));
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnEditar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.setMaximumSize(new java.awt.Dimension(107, 31));
        btnEditar.setMinimumSize(new java.awt.Dimension(107, 31));
        btnEditar.setPreferredSize(new java.awt.Dimension(107, 31));
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        btnEditar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                btnEditarKeyReleased(evt);
            }
        });

        btnCadastrar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        try {
            matricula.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        matricula.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        matricula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                matriculaKeyPressed(evt);
            }
        });

        turma.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        turma.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "INF101", "INF102", "INF201", "INF202", "INF301", "INF302" }));

        jButton5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton5.setText("Buscar aluno pela turma");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jTable.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null}
            },
            new String [] {
                "Matrícula", "Nome", "Sobrenome", "Turma", "Telefone dos pais", "Email dos pais"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable.setSelectionBackground(new java.awt.Color(0, 0, 0));
        jTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableMouseClicked(evt);
            }
        });
        jTable.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTableKeyReleased(evt);
            }
        });
        jScrollPane2.setViewportView(jTable);

        jScrollPane1.setViewportView(jScrollPane2);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 40)); // NOI18N
        jLabel9.setText("Dados dos alunos");

        lblMensagem.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblMensagem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        txtEmail.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });

        try {
            txtTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtTelefone.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        try {
            txtBusca.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtBusca.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        btnBuscar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnBuscar.setText("Buscar aluno pela matrícula");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(700, 700, 700)
                        .addComponent(jLabel9))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(310, 310, 310)
                        .addComponent(lblMensagem, javax.swing.GroupLayout.PREFERRED_SIZE, 946, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(560, 560, 560)
                        .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(310, 310, 310)
                        .addComponent(txtBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(btnBuscar)
                        .addGap(71, 71, 71)
                        .addComponent(txtBuscarTurma, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1580, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(308, 308, 308)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(matricula, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(104, 104, 104)
                                .addComponent(turma, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblMatricula)
                                .addGap(254, 254, 254)
                                .addComponent(lblTurma)))
                        .addGap(202, 202, 202)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNome)
                            .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(308, 308, 308)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(sobrenome, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(104, 104, 104)
                                .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblSobrenome)
                                .addGap(209, 209, 209)
                                .addComponent(jLabel3)))
                        .addGap(135, 135, 135)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLabel9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblMatricula)
                            .addComponent(lblTurma, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(matricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(turma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblSobrenome)
                        .addComponent(jLabel3))
                    .addComponent(jLabel4))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(sobrenome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30)
                .addComponent(lblMensagem, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(txtBuscarTurma, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(32, 32, 32)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void matriculaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_matriculaKeyPressed
if(evt.getKeyCode() == evt.VK_ENTER){
            nome.requestFocus();
        }
    }//GEN-LAST:event_matriculaKeyPressed

    private void nomeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nomeKeyPressed
 if(evt.getKeyCode() == evt.VK_ENTER){
            sobrenome.requestFocus();
        }
    }//GEN-LAST:event_nomeKeyPressed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
      matriculaa = matricula.getText();
      nomee = nome.getText();
      sobrenomee = sobrenome.getText();
      turmaa  = (String) turma.getSelectedItem();
        
      if (matriculaa.isEmpty()){
          lblMatricula.setText("Matrícula");
          lblMatricula.setForeground(Color.red);
      } else{
          lblMatricula.setText("Matrícula");
          lblMatricula.setForeground(Color.black);
      }
        
       if (nomee.isEmpty()){
          lblNome.setText("Nome *");
          lblNome.setForeground(Color.red);
      } else{
          lblNome.setText("Nome *");
          lblNome.setForeground(Color.black);
      }
       
        if (sobrenomee.isEmpty()){
          lblSobrenome.setText("Sobrenome *");
          lblSobrenome.setForeground(Color.red);
      } else{
          lblSobrenome.setText("Sobrenome *");
          lblSobrenome.setForeground(Color.black);
      }
        
        if (turmaa.isEmpty()){
          lblTurma.setText("Turma *");
          lblTurma.setForeground(Color.red);
      } else{
          lblTurma.setText("Turma *");
          lblTurma.setForeground(Color.black);
      } 
        
          if (matriculaa.isEmpty() || nomee.isEmpty() || sobrenomee.isEmpty() || turmaa.isEmpty()){
              lblMensagem.setForeground(Color.red);
              lblMensagem.setText("Campos obrigatórios não preenchidos");
          }
        else{
        
        
        Alunos al = new Alunos();
        AlunosDAO2 dao = new AlunosDAO2();
        al.setMatricula(matricula.getText());
        al.setNome(nome.getText());
        al.setSobrenome(sobrenome.getText());
        al.setTurma((String) turma.getSelectedItem());
        al.setTelefonePais(txtTelefone.getText());
        al.setEmailPais(txtEmail.getText());
        

        dao.create(al);
        matricula.setText("");
        nome.setText("");
        sobrenome.setText("");
        turma.setSelectedItem("");
        txtTelefone.setText("");
        txtEmail.setText("");
       
        readjTable();
          }
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
 if( jTable.getSelectedRow() != -1){
            Alunos al = new Alunos();
            AlunosDAO2 dao = new AlunosDAO2();

            al.setNome(nome.getText());
            al.setSobrenome(sobrenome.getText());
            al.setTurma((String) turma.getSelectedItem());
            al.setTelefonePais((String) txtTelefone.getText());
            al.setEmailPais((String) txtEmail.getText());
            al.setMatricula((String)jTable.getValueAt(jTable.getSelectedRow(),0));
          

            dao.update(al);
            matricula.setText("");
            nome.setText("");
            sobrenome.setText("");
            turma.setSelectedItem("");
            txtTelefone.setText("");
            txtEmail.setText("");
 

            readjTable();
 }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
 Alunos an = new Alunos();
        AlunosDAO2 andao = new AlunosDAO2();

        an.setMatricula(jTable.getValueAt(jTable.getSelectedRow(), 0).toString());
        andao.delete(an);
        matricula.setText("");
        nome.setText("");
        sobrenome.setText("");
        turma.setSelectedItem("");
        txtTelefone.setText("");
        txtEmail.setText("");
       
        readjTable();
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
readjTableForTurma((String) txtBuscarTurma.getSelectedItem());
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableMouseClicked
 if( jTable.getSelectedRow() != -1){
            matricula.setText(jTable.getValueAt(jTable.getSelectedRow(), 0).toString());
            nome.setText(jTable.getValueAt(jTable.getSelectedRow(), 1).toString());
            sobrenome.setText(jTable.getValueAt(jTable.getSelectedRow(), 2).toString());
            turma.setSelectedItem(jTable.getValueAt(jTable.getSelectedRow(), 3).toString());
            txtTelefone.setText(jTable.getValueAt(jTable.getSelectedRow(), 4).toString());
            txtEmail.setText(jTable.getValueAt(jTable.getSelectedRow(), 5).toString());
           

        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jTableMouseClicked

    private void jTableKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTableKeyReleased
if( jTable.getSelectedRow() != -1){
            matricula.setText(jTable.getValueAt(jTable.getSelectedRow(), 0).toString());
            nome.setText(jTable.getValueAt(jTable.getSelectedRow(), 1).toString());
            sobrenome.setText(jTable.getValueAt(jTable.getSelectedRow(), 2).toString());
            turma.setSelectedItem(jTable.getValueAt(jTable.getSelectedRow(), 3).toString());
            txtTelefone.setText(jTable.getValueAt(jTable.getSelectedRow(), 4).toString());
            txtEmail.setText(jTable.getValueAt(jTable.getSelectedRow(), 5).toString());
           
}
        // TODO add your handling code here:
    }//GEN-LAST:event_jTableKeyReleased

    private void btnEditarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnEditarKeyReleased
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btnEditarKeyReleased

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
        readjTableForMat(txtBusca.getText());
    }//GEN-LAST:event_btnBuscarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable;
    private javax.swing.JLabel lblMatricula;
    private javax.swing.JLabel lblMensagem;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblSobrenome;
    private javax.swing.JLabel lblTurma;
    private javax.swing.JFormattedTextField matricula;
    private javax.swing.JTextField nome;
    private javax.swing.JTextField sobrenome;
    private javax.swing.JComboBox<String> turma;
    private javax.swing.JFormattedTextField txtBusca;
    private javax.swing.JComboBox<String> txtBuscarTurma;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JFormattedTextField txtTelefone;
    // End of variables declaration//GEN-END:variables

    private void setFrameIcon(ImageIcon imageIcon) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
