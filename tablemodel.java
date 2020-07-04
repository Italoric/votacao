package view;

import conexão.CandidatoDAO;
import java.awt.Image;
import java.io.File;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import model.Candidato;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import model.Sonumero;

public class tablemodel extends javax.swing.JFrame {

    public tablemodel() {

        initComponents();
        txtNumero.setDocument(new Sonumero());
        DefaultTableModel modelo = (DefaultTableModel) jtCandidatos.getModel();
        jtCandidatos.setRowSorter(new TableRowSorter(modelo));
        readTable();
    }

    public void readTable() {
        DefaultTableModel modelo = (DefaultTableModel) jtCandidatos.getModel();
        modelo.setNumRows(0);
        CandidatoDAO cdao = new CandidatoDAO();

        for (Candidato p : cdao.listar()) {
            modelo.addRow(new Object[]{
                p.getName(),
                p.getSetor(),
                p.getNumber(),
                p.getCaminho()
            });
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtCandidato = new javax.swing.JTextField();
        txtSetor = new javax.swing.JTextField();
        txtNumero = new javax.swing.JTextField();
        jBAdd = new javax.swing.JButton();
        jBExcluir = new javax.swing.JButton();
        jBAlterar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtCandidatos = new javax.swing.JTable();
        jbVotacao = new javax.swing.JButton();
        jlImagem = new javax.swing.JLabel();
        txtCaminho = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("CSIRC");

        jLabel1.setText("Candidato:");

        jLabel2.setText("Setor:");

        jLabel3.setText("Número:");

        txtNumero.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        jBAdd.setText("Adicionar");
        jBAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAddActionPerformed(evt);
            }
        });

        jBExcluir.setText("Excluir");
        jBExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBExcluirActionPerformed(evt);
            }
        });

        jBAlterar.setText("Alterar");
        jBAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAlterarActionPerformed(evt);
            }
        });

        jtCandidatos.setModel(new javax.swing.table.DefaultTableModel(
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
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtCandidatos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtCandidatosKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jtCandidatos);

        jbVotacao.setText("votação");
        jbVotacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbVotacaoActionPerformed(evt);
            }
        });

        jlImagem.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlImagem.setText("Adicionar Imagem");
        jlImagem.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jlImagem.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jlImagem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlImagemMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCandidato, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(61, 61, 61)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtSetor, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jBAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(57, 57, 57)
                                .addComponent(jBExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(56, 56, 56)
                                .addComponent(jBAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbVotacao, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(txtCaminho))
                .addGap(18, 18, 18)
                .addComponent(jlImagem, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCandidato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSetor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBAdd)
                    .addComponent(jBExcluir)
                    .addComponent(jBAlterar)
                    .addComponent(jbVotacao))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(txtCaminho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlImagem, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void jBAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAddActionPerformed

        if (txtCandidato.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, ("Por favaor preencha o campo Candidato!"));
            txtCandidato.requestFocusInWindow();
        } else {
            if (txtSetor.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, ("Por favaor preencha o campo setor!"));
                txtSetor.requestFocusInWindow();
            } else {
                if (txtNumero.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, ("Por favaor preencha o campo número!"));
                    txtNumero.requestFocusInWindow();
                } else {

                    CandidatoDAO candao = new CandidatoDAO();
                    Candidato p = new Candidato();

                    p.setName(txtCandidato.getText());
                    p.setSetor(txtSetor.getText());
                    p.setCaminho(txtCaminho.getText());
                    p.setNumber(Integer.parseInt(txtNumero.getText()));
                    p.setVoto(0);

                    candao.inserirCandidato(p);
                    readTable();

                    txtCandidato.setText("");
                    txtSetor.setText("");
                    txtCaminho.setText("");
                    txtNumero.setText("");
                    jlImagem.setIcon(null);
                    txtCandidato.requestFocusInWindow();

                }
            }
        }
    }//GEN-LAST:event_jBAddActionPerformed

    private void jBExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBExcluirActionPerformed
                    if (jtCandidatos.getSelectedRow() != -1) {
                    CandidatoDAO candao = new CandidatoDAO();
                    Candidato p = new Candidato();

                    p.setNumber((int)jtCandidatos.getValueAt(jtCandidatos.getSelectedRow(), 2));

                    candao.excluirCandidato(p);

                    txtCandidato.setText("");
                    txtSetor.setText("");
                    txtCaminho.setText("");
                    txtNumero.setText("");
                    jlImagem.setIcon(null);
                    txtCandidato.requestFocusInWindow();

                    readTable();
                    }

    }//GEN-LAST:event_jBExcluirActionPerformed

    private void jBAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAlterarActionPerformed

        if (txtCandidato.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, ("Por favaor preencha o campo Candidato!"));
            txtCandidato.requestFocusInWindow();
        } else {
            if (txtSetor.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, ("Por favaor preencha o campo setor!"));
                txtSetor.requestFocusInWindow();
            } else {
                if (txtNumero.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, ("Por favaor preencha o campo Número!"));
                    txtNumero.requestFocusInWindow();
                } else {

                    if (jtCandidatos.getSelectedRow() != -1) {

                        CandidatoDAO candao = new CandidatoDAO();
                        Candidato p = new Candidato();

                        p.setName(txtCandidato.getText());
                        p.setSetor(txtSetor.getText());
                        p.setCaminho(txtCaminho.getText());
                        p.setNumber(Integer.parseInt(txtNumero.getText()));
                        p.setVoto(0);
                        //((int)jtCandidatos.setValueAt(txtNumero.getText(), 0));

                        candao.alterarCandidato(p);

                        txtCandidato.setText("");
                        txtSetor.setText("");
                        txtCaminho.setText("");
                        txtNumero.setText("");
                        jlImagem.setIcon(null);
                        txtCandidato.requestFocusInWindow();

                        readTable();

                    }
                }
            }
        }
    }//GEN-LAST:event_jBAlterarActionPerformed

    private void jbVotacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbVotacaoActionPerformed
        Votacao v1 = new Votacao();
        v1.setLocationRelativeTo(null);
        v1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jbVotacaoActionPerformed

    private void jtCandidatosKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtCandidatosKeyReleased
        if (jtCandidatos.getSelectedRow() != -1) {

            txtCandidato.setText(jtCandidatos.getValueAt(jtCandidatos.getSelectedRow(), 0).toString());
            txtSetor.setText(jtCandidatos.getValueAt(jtCandidatos.getSelectedRow(), 1).toString());
            txtNumero.setText(jtCandidatos.getValueAt(jtCandidatos.getSelectedRow(), 2).toString());
            txtCaminho.setText(jtCandidatos.getValueAt(jtCandidatos.getSelectedRow(), 3).toString());
            String t = txtCaminho.getText();
            ImageIcon imagem = new ImageIcon(t);
            jlImagem.setIcon(new ImageIcon(imagem.getImage().getScaledInstance(jlImagem.getWidth(), jlImagem.getHeight(), Image.SCALE_DEFAULT)));

        }
    }//GEN-LAST:event_jtCandidatosKeyReleased

    private void jlImagemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlImagemMouseClicked
        JFileChooser arquivo = new JFileChooser();
        arquivo.setDialogTitle("Selecione uma imagem!");
        arquivo.setFileSelectionMode(JFileChooser.FILES_ONLY);
        
        int opt = arquivo.showOpenDialog(this);
        if (opt == JFileChooser.APPROVE_OPTION) {
            File file = new File("CAMINHO");
            file = arquivo.getSelectedFile();
            
            String filename = file.getAbsolutePath();
            txtCaminho.setText(filename);
            
            ImageIcon imagem = new ImageIcon(arquivo.getSelectedFile().getPath());
            jlImagem.setIcon(new ImageIcon(imagem.getImage().getScaledInstance(jlImagem.getWidth(), jlImagem.getHeight(), Image.SCALE_DEFAULT)));
        }
    }//GEN-LAST:event_jlImagemMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAdd;
    private javax.swing.JButton jBAlterar;
    private javax.swing.JButton jBExcluir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbVotacao;
    private javax.swing.JLabel jlImagem;
    private javax.swing.JTable jtCandidatos;
    private javax.swing.JTextField txtCaminho;
    private javax.swing.JTextField txtCandidato;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JTextField txtSetor;
    // End of variables declaration//GEN-END:variables
}
