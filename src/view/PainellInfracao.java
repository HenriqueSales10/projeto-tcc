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
import model.bean.Anotacao;
import model.dao.AlunosDAO;
import model.dao.AnotacaoDAO;

/**
 *
 * @author RojeruSan
 */
public class PainellInfracao extends javax.swing.JPanel {

    private String matriculaa;
    private String nomee;
    private String sobrenomee;
    private String turmaa;
   
    
    /**
     * Creates new form pnlHome
     */
    public PainellInfracao() {
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
        AnotacaoDAO andao = new AnotacaoDAO();
        for(Anotacao an: andao.read()){
            modelo.addRow(new Object[]{
                an.getMatricula(),
                an.getNome(),
                an.getSobrenome(),
                an.getTurma(),
                an.getTipoInfracao(),
                an.getTipoInfracao2(),
                an.getTipoInfracao3(),
                an.getObservacao(),
                    
            });
        }
    }
 public void readjTableForMat(String matricula){
        DefaultTableModel modelo = (DefaultTableModel) jTable.getModel();
        modelo.setNumRows(0);
        AnotacaoDAO andao = new AnotacaoDAO();
        for(Anotacao an: andao.readForMatricula(matricula)){
            modelo.addRow(new Object[]{
                an.getMatricula(),
                an.getNome(),
                an.getSobrenome(),
                an.getTurma(),
                an.getTipoInfracao(),
                an.getTipoInfracao2(),
                an.getTipoInfracao3(),
                an.getObservacao()
                        
                    });
        }
    }
  public void readjTableForTurma(String turma){
        DefaultTableModel modelo = (DefaultTableModel) jTable.getModel();
        modelo.setNumRows(0);
        AnotacaoDAO andao = new AnotacaoDAO();
        for(Anotacao an: andao.readForTurma(turma)){
            modelo.addRow(new Object[]{
                an.getMatricula(),
                an.getNome(),
                an.getSobrenome(),
                an.getTurma(),
                 an.getTipoInfracao(),
                 an.getTipoInfracao2(),
                 an.getTipoInfracao3(),
                 an.getObservacao()
                    
                 
                        
                    });
        }
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        lblMatricula = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        lblSobrenome = new javax.swing.JLabel();
        lblTurma = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtBuscarMat = new javax.swing.JFormattedTextField();
        nome = new javax.swing.JTextField();
        sobrenome = new javax.swing.JTextField();
        txtBuscarTurma = new javax.swing.JComboBox<>();
        infracao2 = new javax.swing.JComboBox<>();
        infracao3 = new javax.swing.JComboBox<>();
        infracao1 = new javax.swing.JComboBox<>();
        btnExcluir = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnCadastrar = new javax.swing.JButton();
        matricula = new javax.swing.JFormattedTextField();
        jButton4 = new javax.swing.JButton();
        turma = new javax.swing.JComboBox<>();
        jButton5 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jScrollPane5 = new javax.swing.JScrollPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        observacao = new javax.swing.JTextArea();
        lblMensagem = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(1620, 950));
        setMinimumSize(new java.awt.Dimension(1620, 950));
        setPreferredSize(new java.awt.Dimension(1620, 950));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel7.setText("Observações");

        lblMatricula.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblMatricula.setText("Matrícula");

        lblNome.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblNome.setText("Nome *");

        lblSobrenome.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblSobrenome.setText("Sobrenome *");

        lblTurma.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblTurma.setText("Turma");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setText("Infracao 1");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setText("Infração 2");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel5.setText("Infração 3");

        try {
            txtBuscarMat.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtBuscarMat.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtBuscarMat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarMatActionPerformed(evt);
            }
        });

        nome.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        nome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                nomeKeyPressed(evt);
            }
        });

        sobrenome.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        txtBuscarTurma.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtBuscarTurma.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "INF101", "INF102", "INF201", "INF202", "INF301", "INF302" }));

        infracao2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        infracao2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nenhuma", "Desrespeito aos professores", "Não uso do uniforme", "Uso de boné em sala de aula", "Chegada tardia", "Outro" }));

        infracao3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        infracao3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nenhuma", "Desrespeito aos professores", "Não uso do uniforme", "Uso de boné em sala de aula", "Chegada tardia", "Outro" }));

        infracao1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        infracao1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nenhuma", "Desrespeito aos professores", "Não uso do uniforme", "Uso de boné em sala de aula", "Chegada tardia", "Outro" }));

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

        jButton4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton4.setText("Buscar aluno pela matrícula");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
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
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Matrícula", "Nome", "Sobrenome", "Turma", "Infração 1", "Infração 2", "Infração 3", "Observação"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, true
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
        jLabel9.setText("Anotações");

        observacao.setColumns(20);
        observacao.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        observacao.setRows(5);
        jScrollPane3.setViewportView(observacao);

        jScrollPane5.setViewportView(jScrollPane3);

        jScrollPane4.setViewportView(jScrollPane5);

        lblMensagem.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        lblMensagem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(700, 700, 700)
                .addComponent(jLabel9))
            .addGroup(layout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addComponent(lblMatricula)
                .addGap(254, 254, 254)
                .addComponent(lblTurma)
                .addGap(271, 271, 271)
                .addComponent(lblNome)
                .addGap(348, 348, 348)
                .addComponent(jLabel7))
            .addGroup(layout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(matricula, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblSobrenome)
                            .addComponent(sobrenome, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(infracao3, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(104, 104, 104)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(turma, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(infracao1, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(94, 94, 94)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(infracao2, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(lblMensagem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(74, 74, 74)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(560, 560, 560)
                .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(320, 320, 320)
                .addComponent(txtBuscarMat, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64)
                .addComponent(txtBuscarTurma, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1580, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLabel9)
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblMatricula)
                    .addComponent(lblTurma, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNome)
                    .addComponent(jLabel7))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(turma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(21, 21, 21)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(infracao1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(21, 21, 21)
                                .addComponent(jLabel4)
                                .addGap(12, 12, 12)
                                .addComponent(infracao2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(matricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(21, 21, 21)
                                .addComponent(lblSobrenome)
                                .addGap(12, 12, 12)
                                .addComponent(sobrenome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(21, 21, 21)
                                .addComponent(jLabel5)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(infracao3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblMensagem, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtBuscarTurma, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtBuscarMat, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(30, 30, 30)
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
        
        
        Anotacao an = new Anotacao();
        AnotacaoDAO dao = new AnotacaoDAO();
        an.setMatricula(matricula.getText());
        an.setNome(nome.getText());
        an.setSobrenome(sobrenome.getText());
        an.setTurma((String) turma.getSelectedItem());
        an.setTipoInfracao(infracao1.getSelectedItem().toString());
        an.setTipoInfracao2(infracao2.getSelectedItem().toString());
        an.setTipoInfracao3(infracao3.getSelectedItem().toString());
        an.setObservacao(observacao.getText());

        dao.create(an);
        matricula.setText("");
        nome.setText("");
        sobrenome.setText("");
        turma.setSelectedItem("");
        infracao1.setSelectedItem("");
        infracao2.setSelectedItem("");
        infracao3.setSelectedItem("");
        observacao.setText("");
        readjTable();
          }
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
 if( jTable.getSelectedRow() != -1){
            Anotacao an = new Anotacao();
            AnotacaoDAO dao = new AnotacaoDAO();

            an.setNome(nome.getText());
            an.setSobrenome(sobrenome.getText());
            an.setTurma((String) turma.getSelectedItem());
            an.setTipoInfracao((String) infracao1.getSelectedItem());
            an.setTipoInfracao2((String) infracao2.getSelectedItem());
            an.setTipoInfracao3((String) infracao3.getSelectedItem());
            an.setObservacao(observacao.getText());
            an.setMatricula(jTable.getValueAt(jTable.getSelectedRow(), 0).toString());

            dao.update(an);
            matricula.setText("");
            nome.setText("");
            sobrenome.setText("");
            turma.setSelectedItem("");
            infracao1.setSelectedItem("");
            infracao2.setSelectedItem("");
            infracao3.setSelectedItem("");
            observacao.setText("");

            readjTable();
 }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
 Anotacao an = new Anotacao();
        AnotacaoDAO andao = new AnotacaoDAO();

        an.setMatricula(jTable.getValueAt(jTable.getSelectedRow(), 0).toString());
        andao.delete(an);
        matricula.setText("");
        nome.setText("");
        sobrenome.setText("");
        turma.setSelectedItem("");
        infracao1.setSelectedItem("");
        infracao2.setSelectedItem("");
        infracao3.setSelectedItem("");
        observacao.setText("");

        readjTable();
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
readjTableForMat(txtBuscarMat.getText());
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

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
            infracao1.setSelectedItem(jTable.getValueAt(jTable.getSelectedRow(), 4).toString());
            infracao2.setSelectedItem(jTable.getValueAt(jTable.getSelectedRow(), 5).toString());
            infracao3.setSelectedItem(jTable.getValueAt(jTable.getSelectedRow(), 6).toString());
            observacao.setText(jTable.getValueAt(jTable.getSelectedRow(), 7).toString());

        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jTableMouseClicked

    private void jTableKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTableKeyReleased
if( jTable.getSelectedRow() != -1){
            matricula.setText(jTable.getValueAt(jTable.getSelectedRow(), 0).toString());
            nome.setText(jTable.getValueAt(jTable.getSelectedRow(), 1).toString());
            sobrenome.setText(jTable.getValueAt(jTable.getSelectedRow(), 2).toString());
            turma.setSelectedItem(jTable.getValueAt(jTable.getSelectedRow(), 3).toString());
            infracao1.setSelectedItem(jTable.getValueAt(jTable.getSelectedRow(), 4).toString());
            infracao2.setSelectedItem(jTable.getValueAt(jTable.getSelectedRow(), 5).toString());
            infracao3.setSelectedItem(jTable.getValueAt(jTable.getSelectedRow(), 6).toString());
            observacao.setText(jTable.getValueAt(jTable.getSelectedRow(), 7).toString());
}
        // TODO add your handling code here:
    }//GEN-LAST:event_jTableKeyReleased

    private void txtBuscarMatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarMatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarMatActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JComboBox<String> infracao1;
    private javax.swing.JComboBox<String> infracao2;
    private javax.swing.JComboBox<String> infracao3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTable jTable;
    private javax.swing.JLabel lblMatricula;
    private javax.swing.JLabel lblMensagem;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblSobrenome;
    private javax.swing.JLabel lblTurma;
    private javax.swing.JFormattedTextField matricula;
    private javax.swing.JTextField nome;
    private javax.swing.JTextArea observacao;
    private javax.swing.JTextField sobrenome;
    private javax.swing.JComboBox<String> turma;
    private javax.swing.JFormattedTextField txtBuscarMat;
    private javax.swing.JComboBox<String> txtBuscarTurma;
    // End of variables declaration//GEN-END:variables

    private void setFrameIcon(ImageIcon imageIcon) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
