/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import model.bean.Alunos;
import model.dao.AlunosDAO;

/**
 *
 * @author RojeruSan
 */
public class PnlCadastro extends javax.swing.JPanel {

  private String matriculaa;
    private String nomee;
    private String sobrenomee;
    private String turmaa;

    /**
     * Creates new form pnlHome
     */
    public PnlCadastro() {
        initComponents();
       
        
        
        
        
        setBackground(new Color(255, 255, 255));
        jTable1.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 15));
        jTable1.getTableHeader().setOpaque(false);
        jTable1.getTableHeader().setBackground(new Color(0, 0, 0));
        jTable1.getTableHeader().setForeground(new Color(255, 255, 255));
        jTable1.setSelectionBackground(new java.awt.Color(0, 0, 0));
        jTable1.setRowHeight(25);

        DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
        jTable1.setRowSorter(new TableRowSorter(modelo));
        readjTable();
    }

    public void readjTable() {
        DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
        modelo.setNumRows(0);
        AlunosDAO adao = new AlunosDAO();
        for (Alunos a : adao.read()) {
            modelo.addRow(new Object[]{
                a.getMatricula(),
                a.getNome(),
                a.getSobrenome(),
                a.getTurma(),
                a.getTelefonePais(),
                a.getEmailPais(),});
        }
    }

    public void readjTableForMat(String matricula){
        DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
        modelo.setNumRows(0);
        AlunosDAO aldao = new AlunosDAO();
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

    public void readjTableForTurma(String turma) {
        DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
        modelo.setNumRows(0);
        AlunosDAO adao = new AlunosDAO();
        for (Alunos a : adao.readForTurma(turma)) {
            modelo.addRow(new Object[]{
                a.getMatricula(),
                a.getNome(),
                a.getSobrenome(),
                a.getTurma(),
                a.getTelefonePais(),
                a.getEmailPais()

            });
        }
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblMatricula = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        lblSobrenome = new javax.swing.JLabel();
        lblTurma = new javax.swing.JLabel();
        lblTelefone = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        txtMatricula = new javax.swing.JFormattedTextField();
        txtSobrenome = new javax.swing.JTextField();
        txtNome = new javax.swing.JTextField();
        txtTurma = new javax.swing.JComboBox<>();
        txtTelefone = new javax.swing.JFormattedTextField();
        txtEmail = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        txtBuscaTurma = new javax.swing.JComboBox<>();
        btnListarPelaTurma = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        lblMensagem = new javax.swing.JLabel();
        txtBusca = new javax.swing.JFormattedTextField();
        btnBuscar1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(1620, 950));
        setMinimumSize(new java.awt.Dimension(1620, 950));
        setPreferredSize(new java.awt.Dimension(1620, 950));

        lblMatricula.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblMatricula.setText("Matrícula *");

        lblNome.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblNome.setText("Nome *");

        lblSobrenome.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblSobrenome.setText("Sobrenome *");

        lblTurma.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblTurma.setText("Turma *");

        lblTelefone.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblTelefone.setText("Telefone dos Pais *");

        lblEmail.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblEmail.setText("Email dos Pais*");

        try {
            txtMatricula.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtMatricula.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtMatricula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtMatriculaKeyPressed(evt);
            }
        });

        txtSobrenome.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtSobrenome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSobrenomeActionPerformed(evt);
            }
        });
        txtSobrenome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSobrenomeKeyPressed(evt);
            }
        });

        txtNome.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        txtTurma.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtTurma.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "INF101", "INF102", "INF201", "INF202", "INF301", "INF302" }));
        txtTurma.setBorder(null);
        txtTurma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTurmaActionPerformed(evt);
            }
        });
        txtTurma.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtTurmaKeyPressed(evt);
            }
        });

        try {
            txtTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) ##### - ####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtTelefone.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtTelefone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtTelefoneKeyPressed(evt);
            }
        });

        txtEmail.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setText("Cadastrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton2.setText("Excluir");
        jButton2.setMaximumSize(new java.awt.Dimension(107, 31));
        jButton2.setMinimumSize(new java.awt.Dimension(107, 31));
        jButton2.setPreferredSize(new java.awt.Dimension(107, 31));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton3.setText("Editar");
        jButton3.setMaximumSize(new java.awt.Dimension(107, 31));
        jButton3.setMinimumSize(new java.awt.Dimension(107, 31));
        jButton3.setPreferredSize(new java.awt.Dimension(107, 31));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        txtBuscaTurma.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtBuscaTurma.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "INF101", "INF102", "INF201", "INF202", "INF301", "INF302" }));

        btnListarPelaTurma.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnListarPelaTurma.setText("Listar alunos por turma");
        btnListarPelaTurma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarPelaTurmaActionPerformed(evt);
            }
        });

        jScrollPane3.setBorder(null);

        jScrollPane5.setBorder(null);
        jScrollPane5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jTable1.setFont(new java.awt.Font("Tahoma", 0, 18));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Matricula", "Nome", "Sobrenome", "Turma", "Telefone dos pais", "Email dos Pais"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setFocusable(false);
        jTable1.setIntercellSpacing(new java.awt.Dimension(0, 0));
        jTable1.setRowHeight(25);
        jTable1.setSelectionBackground(new java.awt.Color(0, 0, 0));
        jTable1.getTableHeader().setReorderingAllowed(false);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jTable1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTable1KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTable1KeyReleased(evt);
            }
        });
        jScrollPane5.setViewportView(jTable1);

        jScrollPane3.setViewportView(jScrollPane5);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 40)); // NOI18N
        jLabel5.setText("Dados dos alunos");
        jLabel5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        lblMensagem.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        lblMensagem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        try {
            txtBusca.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtBusca.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        btnBuscar1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnBuscar1.setText("Buscar aluno pela matrícula");
        btnBuscar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(290, 290, 290)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(160, 160, 160)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(93, 93, 93)
                                .addComponent(jButton1)
                                .addGap(93, 93, 93)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblMensagem, javax.swing.GroupLayout.PREFERRED_SIZE, 670, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(80, 80, 80)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtBuscaTurma, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(13, 13, 13)
                                .addComponent(btnListarPelaTurma, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(13, 13, 13)
                                .addComponent(btnBuscar1, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 1356, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(290, 290, 290)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTurma, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTurma))
                        .addGap(241, 241, 241)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTelefone)
                            .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(59, 59, 59)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 114, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(290, 290, 290)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblMatricula)
                            .addComponent(txtMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(99, 99, 99)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNome)
                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(59, 59, 59)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSobrenome, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblSobrenome)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(570, 570, 570)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 437, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLabel5)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblMatricula)
                    .addComponent(lblNome)
                    .addComponent(lblSobrenome))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(txtMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSobrenome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTurma)
                            .addComponent(lblEmail)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblTelefone)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTurma, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblMensagem, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtBuscaTurma, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnListarPelaTurma))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtBusca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBuscar1))))
                .addGap(9, 9, 9)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtSobrenomeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSobrenomeKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == evt.VK_ENTER) {

            txtNome.requestFocus();
        }
    }//GEN-LAST:event_txtSobrenomeKeyPressed

    private void txtTurmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTurmaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTurmaActionPerformed

    private void txtTurmaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTurmaKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == evt.VK_ENTER) {

            txtTelefone.requestFocus();
        }
    }//GEN-LAST:event_txtTurmaKeyPressed

    private void txtTelefoneKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefoneKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == evt.VK_ENTER) {

            txtEmail.requestFocus();
        }
    }//GEN-LAST:event_txtTelefoneKeyPressed

    private void btnListarPelaTurmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarPelaTurmaActionPerformed
        // TODO add your handling code here:
        readjTableForTurma((String) txtBuscaTurma.getSelectedItem());
    }//GEN-LAST:event_btnListarPelaTurmaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      matriculaa = txtMatricula.getText();
      nomee = txtNome.getText();
      sobrenomee = txtSobrenome.getText();
      turmaa  = (String) txtTurma.getSelectedItem();
        
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
        AlunosDAO dao = new AlunosDAO();
        al.setMatricula(txtMatricula.getText());
        al.setNome(txtNome.getText());
        al.setSobrenome(txtSobrenome.getText());
        al.setTurma((String) txtTurma.getSelectedItem());
        al.setTelefonePais(txtTelefone.getText());
        al.setEmailPais(txtEmail.getText());
        

        dao.create(al);
        txtMatricula.setText("");
        txtNome.setText("");
        txtSobrenome.setText("");
        txtTurma.setSelectedItem("");
        txtTelefone.setText("");
        txtEmail.setText("");
       
        readjTable();
          }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if( jTable1.getSelectedRow() != -1){
            Alunos al = new Alunos();
            AlunosDAO dao = new AlunosDAO();

            al.setNome(txtNome.getText());
            al.setSobrenome(txtSobrenome.getText());
            al.setTurma((String) txtTurma.getSelectedItem());
            al.setTelefonePais((String) txtTelefone.getText());
            al.setEmailPais((String) txtEmail.getText());
            al.setMatricula((String)jTable1.getValueAt(jTable1.getSelectedRow(),0));
          

            dao.update(al);
            txtMatricula.setText("");
            txtNome.setText("");
            txtSobrenome.setText("");
            txtTurma.setSelectedItem("");
            txtTelefone.setText("");
            txtEmail.setText("");
 

            readjTable();
 }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Alunos a = new Alunos();
        AlunosDAO dao = new AlunosDAO();

        a.setMatricula(jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString());
        dao.delete(a);
        txtMatricula.setText("");
        txtSobrenome.setText("");
        txtNome.setText("");
        txtTurma.setSelectedItem("");
        txtTelefone.setText("");
        txtEmail.setText("");

        readjTable();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTable1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable1KeyReleased
if( jTable1.getSelectedRow() != -1){
            txtMatricula.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString());
            txtSobrenome.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 1).toString());
            txtNome.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 2).toString());
            txtTurma.setSelectedItem(jTable1.getValueAt(jTable1.getSelectedRow(), 3).toString());
            txtTelefone.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 4).toString());
            txtEmail.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 5).toString());
           
}
    }//GEN-LAST:event_jTable1KeyReleased

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        if (jTable1.getSelectedRow() != -1) {

            txtMatricula.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString());
            txtSobrenome.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 1).toString());
            txtNome.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 2).toString());
            txtTurma.setSelectedItem(jTable1.getValueAt(jTable1.getSelectedRow(), 3).toString());
            txtTelefone.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 4).toString());
            txtEmail.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 5).toString());

        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void jTable1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable1KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable1KeyPressed

    private void txtSobrenomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSobrenomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSobrenomeActionPerformed

    private void txtMatriculaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMatriculaKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER) {

            txtSobrenome.requestFocus();
        }
    }//GEN-LAST:event_txtMatriculaKeyPressed

    private void btnBuscar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscar1ActionPerformed
        // TODO add your handling code here:
        readjTableForMat(txtBusca.getText());
    }//GEN-LAST:event_btnBuscar1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar1;
    private javax.swing.JButton btnListarPelaTurma;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblMatricula;
    private javax.swing.JLabel lblMensagem;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblSobrenome;
    private javax.swing.JLabel lblTelefone;
    private javax.swing.JLabel lblTurma;
    private javax.swing.JFormattedTextField txtBusca;
    private javax.swing.JComboBox<String> txtBuscaTurma;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JFormattedTextField txtMatricula;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtSobrenome;
    private javax.swing.JFormattedTextField txtTelefone;
    private javax.swing.JComboBox<String> txtTurma;
    // End of variables declaration//GEN-END:variables

    private void setFrameIcon(ImageIcon imageIcon) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
