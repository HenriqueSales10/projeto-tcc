/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Color;
import java.awt.Font;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import model.bean.Atrasados;
import model.bean.Liberar;
import model.dao.AtrasadosDAO;
import model.dao.LiberarDAO;
/**
 *
 * @author henri
 */
public class PainelAtrasadoGuarita extends javax.swing.JPanel {
 private String nomee;
    private String sobrenomee;
    private String turmaa;
    private String dataa;
    private String horaa;
    /**
     * Creates new form PainelLiberar
     */
    public PainelAtrasadoGuarita() {
        initComponents();
         setBackground(new Color(255,255,255));
        jTable1.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 15));
        jTable1.getTableHeader().setOpaque(false);
        jTable1.getTableHeader().setBackground(new Color(0,0,0));
        jTable1.getTableHeader().setForeground(new Color(255,255,255));
        jTable1.setRowHeight(25);
        DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
        jTable1.setRowSorter(new TableRowSorter(modelo));
        readjTable1();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblNome = new javax.swing.JLabel();
        txtNomeAtrasado = new javax.swing.JTextField();
        lblSobrenome = new javax.swing.JLabel();
        txtSobrenomeAtrasado = new javax.swing.JTextField();
        lblTurma = new javax.swing.JLabel();
        txtTurmaAtrasado = new javax.swing.JComboBox<>();
        txtBuscaTurma = new javax.swing.JComboBox<>();
        btnListarTurma = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        lblData = new javax.swing.JLabel();
        txtDataAtrasado = new javax.swing.JFormattedTextField();
        txtHoraAtrasado = new javax.swing.JFormattedTextField();
        lblHora = new javax.swing.JLabel();
        lblMensagem = new javax.swing.JLabel();
        txtSobrenome1 = new javax.swing.JTextField();
        btnListarTurma1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setMaximumSize(new java.awt.Dimension(1680, 940));
        setMinimumSize(new java.awt.Dimension(1680, 940));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(1620, 950));
        jPanel1.setMinimumSize(new java.awt.Dimension(1620, 950));
        jPanel1.setPreferredSize(new java.awt.Dimension(1620, 950));

        lblNome.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblNome.setText("Nome ");

        txtNomeAtrasado.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        lblSobrenome.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblSobrenome.setText("Sobrenome");

        txtSobrenomeAtrasado.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtSobrenomeAtrasado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSobrenomeAtrasadoActionPerformed(evt);
            }
        });

        lblTurma.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblTurma.setText("Turma");

        txtTurmaAtrasado.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtTurmaAtrasado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "INF101", "INF102", "INF201", "INF202", "INF301", "INF302" }));
        txtTurmaAtrasado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTurmaAtrasadoActionPerformed(evt);
            }
        });

        txtBuscaTurma.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtBuscaTurma.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "INF101", "INF102", "INF201", "INF202", "INF301", "INF302" }));

        btnListarTurma.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnListarTurma.setText("Listar alunos atrasados por turma");
        btnListarTurma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarTurmaActionPerformed(evt);
            }
        });

        jTable1.setFont(new java.awt.Font("Tahoma", 0, 18));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome ", "Sobrenome", "Turma", "Data ", "Hora"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, true
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
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTable1KeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jScrollPane2.setViewportView(jScrollPane1);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 40)); // NOI18N
        jLabel3.setText("Registro de chegada tardia");

        lblData.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblData.setText("Data ");

        try {
            txtDataAtrasado.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtDataAtrasado.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        try {
            txtHoraAtrasado.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtHoraAtrasado.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        lblHora.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblHora.setText("Hora ");

        lblMensagem.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblMensagem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        txtSobrenome1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtSobrenome1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSobrenome1ActionPerformed(evt);
            }
        });

        btnListarTurma1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnListarTurma1.setText("Listar alunos atrasados por sobrenome");
        btnListarTurma1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarTurma1ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton3.setText("Apagar");
        jButton3.setMaximumSize(new java.awt.Dimension(107, 31));
        jButton3.setMinimumSize(new java.awt.Dimension(107, 31));
        jButton3.setPreferredSize(new java.awt.Dimension(107, 31));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setText("Registrar");
        jButton1.setMaximumSize(new java.awt.Dimension(107, 31));
        jButton1.setMinimumSize(new java.awt.Dimension(107, 31));
        jButton1.setPreferredSize(new java.awt.Dimension(107, 31));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(520, 520, 520)
                .addComponent(jLabel3))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(520, 520, 520)
                .addComponent(lblNome)
                .addGap(178, 178, 178)
                .addComponent(lblSobrenome)
                .addGap(155, 155, 155)
                .addComponent(lblTurma))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(520, 520, 520)
                .addComponent(txtNomeAtrasado, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(txtSobrenomeAtrasado, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75)
                .addComponent(txtTurmaAtrasado, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(520, 520, 520)
                .addComponent(lblData)
                .addGap(190, 190, 190)
                .addComponent(lblHora))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(520, 520, 520)
                .addComponent(txtDataAtrasado, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(114, 114, 114)
                .addComponent(txtHoraAtrasado, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(520, 520, 520)
                .addComponent(txtSobrenome1, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addComponent(btnListarTurma1))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(520, 520, 520)
                .addComponent(lblMensagem, javax.swing.GroupLayout.PREFERRED_SIZE, 654, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(520, 520, 520)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 654, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(682, 682, 682)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBuscaTurma, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnListarTurma)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNome)
                    .addComponent(lblSobrenome)
                    .addComponent(lblTurma))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNomeAtrasado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSobrenomeAtrasado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTurmaAtrasado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblData)
                    .addComponent(lblHora))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtDataAtrasado, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtHoraAtrasado, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(txtBuscaTurma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnListarTurma))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(txtSobrenome1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnListarTurma1))
                .addGap(33, 33, 33)
                .addComponent(lblMensagem, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1681, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents
public void readjTableForTurma(String turma){
        DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
        modelo.setNumRows(0);
        AtrasadosDAO ldao = new AtrasadosDAO();
        for(Atrasados l: ldao.readForTurma(turma)){
            modelo.addRow(new Object[]{
               
                l.getNomeAtrasado(),
                l.getSobrenomeAtrasado(),
                l.getTurmaAtrasado(),
                l.getDataAtrasado(),
                l.getHoraAtrasado(),
               
                        
                    });
        }
    }

public void readjTableForSobrenome(String sobrenomeAtrasado){
        DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
        modelo.setNumRows(0);
        AtrasadosDAO ldao = new AtrasadosDAO();
        for(Atrasados l: ldao.readForSobrenome(sobrenomeAtrasado)){
            modelo.addRow(new Object[]{
               
                l.getNomeAtrasado(),
                l.getSobrenomeAtrasado(),
                l.getTurmaAtrasado(),
                l.getDataAtrasado(),
                l.getHoraAtrasado(),
               
                        
                    });
        }
    }
public void readjTable1(){
        DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
        modelo.setNumRows(0);
        AtrasadosDAO ldao = new AtrasadosDAO();
        for(Atrasados l: ldao.read()){
            modelo.addRow(new Object[]{
                l.getNomeAtrasado(),
                l.getSobrenomeAtrasado(),
                l.getTurmaAtrasado(),
                l.getDataAtrasado(),
                l.getHoraAtrasado(),
                
                        
                    });
        }
    }
    private void txtSobrenomeAtrasadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSobrenomeAtrasadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSobrenomeAtrasadoActionPerformed

    private void btnListarTurmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarTurmaActionPerformed
        // TODO add your handling code here:
        readjTableForTurma(txtBuscaTurma.getSelectedItem().toString());
    }//GEN-LAST:event_btnListarTurmaActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        if( jTable1.getSelectedRow() != -1){

            txtNomeAtrasado.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString());
            txtSobrenomeAtrasado.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 1).toString());
            txtTurmaAtrasado.setSelectedItem(jTable1.getValueAt(jTable1.getSelectedRow(), 2).toString());
            txtDataAtrasado.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 3).toString());
            txtHoraAtrasado.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 4).toString());

        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void jTable1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable1KeyReleased
        // TODO add your handling code here:
        if( jTable1.getSelectedRow() != -1){

            txtNomeAtrasado.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString());
            txtSobrenomeAtrasado.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 1).toString());
            txtTurmaAtrasado.setSelectedItem(jTable1.getValueAt(jTable1.getSelectedRow(), 2).toString());
            txtDataAtrasado.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 3).toString());
            txtHoraAtrasado.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 4).toString());

        }
    }//GEN-LAST:event_jTable1KeyReleased

    private void txtTurmaAtrasadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTurmaAtrasadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTurmaAtrasadoActionPerformed

    private void txtSobrenome1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSobrenome1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSobrenome1ActionPerformed

    private void btnListarTurma1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarTurma1ActionPerformed
        // TODO add your handling code here:
        readjTableForSobrenome(txtSobrenome1.getText());
    }//GEN-LAST:event_btnListarTurma1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        Atrasados l = new Atrasados();
        AtrasadosDAO dao = new AtrasadosDAO();

        l.setNomeAtrasado(jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString());
        dao.delete(l);

        txtNomeAtrasado.setText("");
        txtSobrenomeAtrasado.setText("");
        txtTurmaAtrasado.setSelectedItem("");
        txtDataAtrasado.setText("");
        txtHoraAtrasado.setText("");

        readjTable1();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        nomee = txtNomeAtrasado.getText();
        sobrenomee = txtSobrenomeAtrasado.getText();
        turmaa  = (String) txtTurmaAtrasado.getSelectedItem();
        dataa = txtDataAtrasado.getText();

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

        if (nomee.isEmpty() || sobrenomee.isEmpty()){
            lblMensagem.setForeground(Color.red);
            lblMensagem.setText("Campos obrigatórios não preenchidos");
        }
        else{

            Atrasados l = new Atrasados();
            AtrasadosDAO dao = new AtrasadosDAO();

            l.setNomeAtrasado(txtNomeAtrasado.getText());
            l.setSobrenomeAtrasado(txtSobrenomeAtrasado.getText());
            l.setTurmaAtrasado((String) txtTurmaAtrasado.getSelectedItem());
            l.setDataAtrasado(txtDataAtrasado.getText());
            l.setHoraAtrasado(txtHoraAtrasado.getText());

            dao.create(l);
            txtNomeAtrasado.setText("");
            txtSobrenomeAtrasado.setText("");
            txtTurmaAtrasado.setSelectedItem("");
            txtDataAtrasado.setText("");
            txtHoraAtrasado.setText("");
            readjTable1();
        }
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnListarTurma;
    private javax.swing.JButton btnListarTurma1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblData;
    private javax.swing.JLabel lblHora;
    private javax.swing.JLabel lblMensagem;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblSobrenome;
    private javax.swing.JLabel lblTurma;
    private javax.swing.JComboBox<String> txtBuscaTurma;
    private javax.swing.JFormattedTextField txtDataAtrasado;
    private javax.swing.JFormattedTextField txtHoraAtrasado;
    private javax.swing.JTextField txtNomeAtrasado;
    private javax.swing.JTextField txtSobrenome1;
    private javax.swing.JTextField txtSobrenomeAtrasado;
    private javax.swing.JComboBox<String> txtTurmaAtrasado;
    // End of variables declaration//GEN-END:variables
}
