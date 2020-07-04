package view;

import conexão.CandidatoDAO;
import java.awt.Image;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import model.Candidato;
import model.Sonumero;

public class Votacao extends javax.swing.JFrame {

    public Votacao() {
        initComponents();
        txtNum.setDocument(new Sonumero());
        DefaultTableModel modelo = (DefaultTableModel) jtVotos.getModel();
        jtVotos.setRowSorter(new TableRowSorter(modelo));
        readTable();
    }

    public void readTable() {
        DefaultTableModel modelo = (DefaultTableModel) jtVotos.getModel();
        modelo.setNumRows(0);
        CandidatoDAO cdao = new CandidatoDAO();

        for (Candidato p : cdao.listar()) {
            modelo.addRow(new Object[]{
                p.getName(),
                p.getSetor(),
                p.getNumber(),
                p.getCaminho(),
                p.getVoto()
            });
        }
    }
    public void readTableBusca(int desc) {
        DefaultTableModel modelo = (DefaultTableModel) jtVotos.getModel();
        modelo.setNumRows(0);
        CandidatoDAO cdao = new CandidatoDAO();

        for (Candidato p : cdao.listarum(desc)) {
            modelo.addRow(new Object[]{
                p.getName(),
                p.getSetor(),
                p.getNumber(),
                p.getVoto(),
                p.getCaminho()
            });

            if (modelo.getRowCount() != 0) {
                    

                        p.setName(p.getName());
                        p.setSetor(p.getName());
                        p.setNumber(p.getNumber());
                        int a = 1 + p.getVoto();
                        p.setVoto(a);


                        cdao.votoCandidato(p);
            }
        }
        readTable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtVotos = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jBResultado = new javax.swing.JButton();
        txtNum = new javax.swing.JTextField();
        txtSenha = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jlImagem = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("CSIRC");

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel1.setText("Escolha seu candidato e digite apenas o número!");

        jtVotos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Candidatos", "Setor", "Número", "Imagem"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtVotos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtVotosKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jtVotos);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setText("Votar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jBResultado.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jBResultado.setText("Resultado");
        jBResultado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBResultadoActionPerformed(evt);
            }
        });

        jLabel2.setText("Senha:");

        jlImagem.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jlImagem.setMaximumSize(new java.awt.Dimension(150, 200));
        jlImagem.setMinimumSize(new java.awt.Dimension(150, 200));
        jlImagem.setPreferredSize(new java.awt.Dimension(150, 200));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jBResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtNum, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton1)))
                        .addGap(135, 135, 135)
                        .addComponent(jlImagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButton1)
                                    .addComponent(txtNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jBResultado)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jlImagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(4, 4, 4)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBResultadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBResultadoActionPerformed
        if (txtSenha.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, ("Por favor preencha o campo Senha!"));
            txtSenha.requestFocusInWindow();
        } else {
        if (txtSenha.getText().equals("000")) {
            ResultadoT r1 = new ResultadoT();
            r1.setLocationRelativeTo(null);
            r1.setVisible(true);
            this.dispose();
        }else readTable();}
    }//GEN-LAST:event_jBResultadoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (txtNum.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha seu voto! ");
            txtNum.requestFocusInWindow();            
        }else{
                    
                    readTableBusca(Integer.parseInt(txtNum.getText()));

                    txtNum.setText("");
                    txtNum.requestFocusInWindow();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jtVotosKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtVotosKeyReleased


            
            if (jtVotos.getSelectedRow() != -1) {
            String p = jtVotos.getValueAt(jtVotos.getSelectedRow(), 3).toString();
            
            ImageIcon imagem = new ImageIcon(p);
            jlImagem.setIcon(new ImageIcon(imagem.getImage().getScaledInstance(jlImagem.getWidth(), jlImagem.getHeight(), Image.SCALE_DEFAULT)));

            }
    }//GEN-LAST:event_jtVotosKeyReleased

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBResultado;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jlImagem;
    private javax.swing.JTable jtVotos;
    private javax.swing.JTextField txtNum;
    private javax.swing.JPasswordField txtSenha;
    // End of variables declaration//GEN-END:variables
}
