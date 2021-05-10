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
import model.bean.Anuncios;
import model.dao.AnunciosDAO;

/**
 *
 * @author henri
 */
public class CadastroAnuncios extends javax.swing.JFrame {

    
    private String nomee;
    private String clientee;
    private String dataInicioo;
    private String dataFinall;
    private double investimentoDiaa;
   

    /**
     * Creates new form CadastroAnuncios
     */
    public CadastroAnuncios() {
        initComponents();
        setBackground(new Color(255, 255, 255));
        jTable1.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 15));
        jTable1.getTableHeader().setOpaque(false);
        jTable1.getTableHeader().setBackground(new Color(0, 0, 0));
        jTable1.getTableHeader().setForeground(new Color(255, 255, 255));
        jTable1.setRowHeight(25);
        DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
        jTable1.setRowSorter(new TableRowSorter(modelo));
        readjTable1();

    }

    public void readjTable1() {
        DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
        modelo.setNumRows(0);
        AnunciosDAO ldao = new AnunciosDAO();
        for (Anuncios l : ldao.read()) {
            modelo.addRow(new Object[]{
                l.getNome(),
                l.getCliente(),
                l.getDataInicio(),
                l.getDataFinal(),
                l.getInvestimentoDia()});

               
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblNome = new javax.swing.JLabel();
        txtCliente = new javax.swing.JTextField();
        lblInicio = new javax.swing.JLabel();
        txtDataInicio = new javax.swing.JFormattedTextField();
        lblCliente = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblFim = new javax.swing.JLabel();
        txtDataFim = new javax.swing.JFormattedTextField();
        lblInvestimento = new javax.swing.JLabel();
        txtInvestimento = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        txtNome = new javax.swing.JTextField();
        lblMensagem = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1280, 720));
        setMinimumSize(new java.awt.Dimension(1280, 720));
        setPreferredSize(new java.awt.Dimension(1280, 720));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblNome.setBackground(new java.awt.Color(0, 0, 0));
        lblNome.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblNome.setText("Nome ");
        jPanel1.add(lblNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 200, -1, -1));

        txtCliente.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(txtCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 240, 200, -1));

        lblInicio.setBackground(new java.awt.Color(0, 0, 0));
        lblInicio.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblInicio.setText("Data de início ");
        jPanel1.add(lblInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 300, -1, -1));

        try {
            txtDataInicio.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtDataInicio.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(txtDataInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 340, 140, 29));

        lblCliente.setBackground(new java.awt.Color(0, 0, 0));
        lblCliente.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblCliente.setText("Cliente");
        jPanel1.add(lblCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 200, -1, -1));

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 40)); // NOI18N
        jLabel3.setText("Cadastro de anúncios");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(401, 95, -1, -1));

        lblFim.setBackground(new java.awt.Color(0, 0, 0));
        lblFim.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblFim.setText("Data de fim");
        jPanel1.add(lblFim, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 300, 140, -1));

        try {
            txtDataFim.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtDataFim.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(txtDataFim, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 340, 134, 29));

        lblInvestimento.setBackground(new java.awt.Color(0, 0, 0));
        lblInvestimento.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblInvestimento.setText("Investimento por dia  ");
        jPanel1.add(lblInvestimento, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 300, -1, -1));

        txtInvestimento.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtInvestimento.setText("0");
        jPanel1.add(txtInvestimento, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 340, 150, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Cliente", "Data início", "Data final", "Valor por dia"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 480, 1150, 140));

        jButton1.setText("Cadastrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 420, 120, 40));

        txtNome.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(txtNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 240, 200, -1));

        lblMensagem.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblMensagem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lblMensagem, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 380, 570, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 720, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        nomee = txtNome.getText();
        clientee = txtCliente.getText();
        dataInicioo = txtDataInicio.getText();
        dataFinall = txtDataFim.getText();
        investimentoDiaa = Double.parseDouble (txtInvestimento.getText());

       

        if (nomee.isEmpty()) {
            lblNome.setText("Nome *");
            lblNome.setForeground(Color.red);
        } else {
            lblNome.setText("Nome *");
            lblNome.setForeground(Color.black);
        }

        if (clientee.isEmpty()) {
            lblCliente.setText("Cliente *");
            lblCliente.setForeground(Color.red);
        } else {
            lblCliente.setText("Cliente *");
            lblCliente.setForeground(Color.black);
        }

        if (dataInicioo.isEmpty()) {
            lblInicio.setText("Data de início *");
            lblInicio.setForeground(Color.red);
        } else {
            lblInicio.setText("Data de início *");
            lblInicio.setForeground(Color.black);
        }
        
         if (dataFinall.isEmpty()) {
            lblFim.setText("Data de fim *");
            lblFim.setForeground(Color.red);
        } else {
            lblFim.setText("Data de fim *");
            lblFim.setForeground(Color.black);
        }
         
          if (investimentoDiaa == 0) {
            lblInvestimento.setText("Investimento por dia *");
            lblInvestimento.setForeground(Color.red);
        } else {
            lblInvestimento.setText("Investimento por dia *");
            lblInvestimento.setForeground(Color.black);
        }

        if (dataFinall.isEmpty() || nomee.isEmpty() || clientee.isEmpty() || dataInicioo.isEmpty() || investimentoDiaa == 0) {
            lblMensagem.setForeground(Color.red);
            lblMensagem.setText("Campos obrigatórios não preenchidos");
        }
        else{
            Anuncios an = new Anuncios();
            AnunciosDAO dao = new AnunciosDAO();
            an.setNome(txtNome.getText());
            an.setCliente(txtCliente.getText());
            an.setDataInicio(txtDataInicio.getText());
            an.setDataFinal(txtDataFim.getText());
            an.setInvestimentoDia (Double.parseDouble(txtInvestimento.getText()));
           

            dao.create(an);
            txtNome.setText("");
            txtCliente.setText("");
            txtDataInicio.setText("");
            txtDataFim.setText("");
            txtInvestimento.setText("");
            

            readjTable1();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws InstantiationException {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LoginNovo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginNovo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginNovo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginNovo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroAnuncios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblCliente;
    private javax.swing.JLabel lblFim;
    private javax.swing.JLabel lblInicio;
    private javax.swing.JLabel lblInvestimento;
    private javax.swing.JLabel lblMensagem;
    private javax.swing.JLabel lblNome;
    private javax.swing.JTextField txtCliente;
    private javax.swing.JFormattedTextField txtDataFim;
    private javax.swing.JFormattedTextField txtDataInicio;
    private javax.swing.JTextField txtInvestimento;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables
}
