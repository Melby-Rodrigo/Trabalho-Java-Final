/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import com.sun.jdi.connect.spi.Connection;
import controller.MenuController;
import dao.Conexao;
import dao.UsuarioDAO;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.EventListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JMenu;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;
import model.Usuario;
import model.Produto;


/**
 *
 * @author digom
 */
public class MenuView extends javax.swing.JFrame {
    
    private final MenuController controller;
    
    public MenuView() throws SQLException {
        initComponents();
        this.controller = new MenuController(this);
        inicializaProdutos();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldPesquisa = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jtbmenu = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jTextFieldProduto = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldQuantidade = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldMarca = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldValor = new javax.swing.JTextField();
        jButtonInsertProduto = new javax.swing.JButton();
        jButtonExcluirProduto = new javax.swing.JButton();
        jButtonAlterarProduto = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(845, 549));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        jLabel1.setText("Menu de Cadastros");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(25, 25, 25))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 0, 230, 20));

        jLabel7.setText("Pesquisar:");

        jTextFieldPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPesquisaActionPerformed(evt);
            }
        });

        jButton2.setText("Pesquisar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Limpar Filtro");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel7)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jTextFieldPesquisa, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 10, 120, 120));

        jtbmenu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "Produto", "Quantidade", "Valor", "Marca"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
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
        jtbmenu.setRequestFocusEnabled(false);
        jtbmenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtbmenuMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jtbmenu);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 40, 550, -1));

        jTextFieldProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldProdutoActionPerformed(evt);
            }
        });

        jLabel2.setText("Produto:");

        jLabel4.setText("Quantidade:");

        jLabel5.setText("Marca:");

        jLabel6.setText("Valor:");

        jButtonInsertProduto.setBackground(new java.awt.Color(102, 255, 102));
        jButtonInsertProduto.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jButtonInsertProduto.setText("Inserir");
        jButtonInsertProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInsertProdutoActionPerformed(evt);
            }
        });

        jButtonExcluirProduto.setBackground(new java.awt.Color(255, 51, 51));
        jButtonExcluirProduto.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jButtonExcluirProduto.setText("Excluir");
        jButtonExcluirProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirProdutoActionPerformed(evt);
            }
        });

        jButtonAlterarProduto.setBackground(new java.awt.Color(255, 255, 51));
        jButtonAlterarProduto.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jButtonAlterarProduto.setText("Alterar");
        jButtonAlterarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAlterarProdutoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTextFieldProduto)
            .addComponent(jTextFieldQuantidade, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jTextFieldMarca)
            .addComponent(jTextFieldValor)
            .addComponent(jButtonInsertProduto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButtonExcluirProduto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel2)
                    .addComponent(jLabel6))
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jButtonAlterarProduto, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonInsertProduto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonExcluirProduto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonAlterarProduto)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 140, 120, 330));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagens/produtos.jpg"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2836, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 54, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 0, -1, -1));

        jButton1.setText("jButton1");
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 80, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldProdutoActionPerformed
        
    }//GEN-LAST:event_jTextFieldProdutoActionPerformed

    private void jButtonInsertProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInsertProdutoActionPerformed
        
       
        String produto = jTextFieldProduto.getText().trim();
        String quantidade = jTextFieldQuantidade.getText().trim();
        String marca = jTextFieldMarca.getText().trim();
        String valor = jTextFieldValor.getText().trim();
        
        Produto novoProduto = this.controller.registrarProduto(produto, quantidade, valor, marca);

        if (novoProduto != null) {
            DefaultTableModel val = (DefaultTableModel) jtbmenu.getModel();
            val.addRow(new String[]{String.valueOf(novoProduto.getId()), produto, quantidade, valor, marca});
        } else {
            JOptionPane.showMessageDialog(this, "Erro ao cadstrar produto!");
        }

        jTextFieldProduto.setText("");
        jTextFieldQuantidade.setText("");
        jTextFieldValor.setText("");
        jTextFieldMarca.setText("");
        jTextFieldProduto.requestFocus();   
    }//GEN-LAST:event_jButtonInsertProdutoActionPerformed

    private void jButtonExcluirProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirProdutoActionPerformed
        int row = jtbmenu.getSelectedRow();
        
        if (row != -1) {
            int id = Integer.parseInt((String) jtbmenu.getValueAt(row, 0));
            int success = this.controller.excluirProduto(id);
            if (success > 0) {
                ((DefaultTableModel)jtbmenu.getModel()).removeRow(jtbmenu.getSelectedRow()); 
            } else {
                JOptionPane.showMessageDialog(this, "Erro ao deletar produto!");
            }
        }
        
    }//GEN-LAST:event_jButtonExcluirProdutoActionPerformed

    private void jButtonAlterarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAlterarProdutoActionPerformed
        int row = jtbmenu.getSelectedRow();
        if (row != -1) {
            int id = Integer.parseInt((String) jtbmenu.getValueAt(row, 0));
            
            String produto = jTextFieldProduto.getText().trim();
            String quantidade = jTextFieldQuantidade.getText().trim();
            String marca = jTextFieldMarca.getText().trim();
            String valor = jTextFieldValor.getText().trim();
            
            if (produto == "" || quantidade == "" || marca == "" || valor == "") {
                JOptionPane.showMessageDialog(this, "Erro ao atualizar o produto! Preencha as novas informações!");
            } else {
                Produto produtoAtualizado = this.controller.atualizarProduto(id, produto, quantidade, valor, marca);
                
                if (produtoAtualizado == null) {
                    JOptionPane.showMessageDialog(this, "Erro ao atualizar o produto! Preencha as novas informações!");
                } else {
                    DefaultTableModel val = (DefaultTableModel) jtbmenu.getModel();

                    val.removeRow(jtbmenu.getSelectedRow()); 
                    val.addRow(new String[]{String.valueOf(produtoAtualizado.getId()), produtoAtualizado.produto, String.valueOf(produtoAtualizado.quantidade), String.valueOf(produtoAtualizado.valor), produtoAtualizado.marca});
                }
            }
        }
    }//GEN-LAST:event_jButtonAlterarProdutoActionPerformed

    private void jtbmenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtbmenuMouseClicked
  
    }//GEN-LAST:event_jtbmenuMouseClicked

    private void jTextFieldPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPesquisaActionPerformed

    }//GEN-LAST:event_jTextFieldPesquisaActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        DefaultTableModel val = (DefaultTableModel) jtbmenu.getModel();
        limpaMenu();
        
        if (!jTextFieldPesquisa.getText().trim().equals("")) {
            ArrayList<Produto> produtos = controller.buscarProdutos(jTextFieldPesquisa.getText().trim());
            if (!produtos.isEmpty()) {
                for (Produto produto : produtos) {
                    val.addRow(new String[]{String.valueOf(produto.getId()), produto.getProduto(), String.valueOf(produto.getQuantidade()), String.valueOf(produto.getValor()), produto.getMarca()});
                }
            } 
        } 
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        limpaMenu();
        inicializaProdutos();
    }//GEN-LAST:event_jButton3ActionPerformed
     
    private void limpaMenu() {
        DefaultTableModel val = (DefaultTableModel) jtbmenu.getModel();
            int rowCount = val.getRowCount();
            if (rowCount == 1) {
                val.removeRow(0);
            } else {
               for (int i = 0; i < rowCount; i++) {
                    val.removeRow(0);
                } 
            } 
    }
    
    private void inicializaProdutos() {
        ArrayList<Produto> produtos = this.controller.listarProdutos();
        DefaultTableModel val = (DefaultTableModel) jtbmenu.getModel();
        
        for (Produto produto : produtos) {
            val.addRow(new String[]{String.valueOf(produto.getId()), produto.getProduto(), String.valueOf(produto.getQuantidade()), String.valueOf(produto.getValor()), produto.getMarca()});
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new MenuView().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(MenuView.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButtonAlterarProduto;
    private javax.swing.JButton jButtonExcluirProduto;
    private javax.swing.JButton jButtonInsertProduto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField jTextFieldMarca;
    private javax.swing.JTextField jTextFieldPesquisa;
    private javax.swing.JTextField jTextFieldProduto;
    private javax.swing.JTextField jTextFieldQuantidade;
    private javax.swing.JTextField jTextFieldValor;
    private javax.swing.JTable jtbmenu;
    // End of variables declaration//GEN-END:variables
}
