package telas;


import telas.TelaCliente;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author JOAOPEDROKROTHBORBA
 */
public class main extends javax.swing.JFrame {

    public main() {
    initComponents();

    setExtendedState(javax.swing.JFrame.MAXIMIZED_BOTH);
}
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        MenuCliente = new javax.swing.JMenuItem();
        MenuProduto = new javax.swing.JMenuItem();
        painelBotoes = new javax.swing.JPanel();
        btnNovo = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        desktopPrincipal = new javax.swing.JDesktopPane();
        jToolBar2 = new javax.swing.JToolBar();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuCadastro = new javax.swing.JMenu();
        itemCliente = new javax.swing.JMenuItem();
        itemProdutos = new javax.swing.JMenuItem();
        itemServico = new javax.swing.JMenuItem();
        jMenuConsultas = new javax.swing.JMenu();
        jMenuProduto2 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem4 = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jMenuServico2 = new javax.swing.JMenuItem();
        jMenuRelatorios = new javax.swing.JMenu();
        jMenuAjuda = new javax.swing.JMenu();
        jMenuFinalizar = new javax.swing.JMenu();

        MenuCliente.setText("Cadastrar Cliente");
        jPopupMenu1.add(MenuCliente);

        MenuProduto.setText("Cadastrar Produto");
        MenuProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuProdutoActionPerformed(evt);
            }
        });
        jPopupMenu1.add(MenuProduto);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        painelBotoes.setBackground(new java.awt.Color(0, 0, 0));

        btnNovo.setIcon(new javax.swing.ImageIcon("C:\\Users\\JOAOPEDROKROTHBORBA\\Downloads\\Icones\\32 x 32\\cliente.png")); // NOI18N
        btnNovo.setText("Novo");
        btnNovo.setToolTipText("Criar novo Usuário");
        btnNovo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnNovo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        btnSalvar.setIcon(new javax.swing.ImageIcon("C:\\Users\\JOAOPEDROKROTHBORBA\\Downloads\\Icones\\32 x 32\\caracteristicas.png")); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.setToolTipText("Salvar Informações ");
        btnSalvar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSalvar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        btnExcluir.setIcon(new javax.swing.ImageIcon("C:\\Users\\JOAOPEDROKROTHBORBA\\Downloads\\Icones\\32 x 32\\erro.png")); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.setToolTipText("Excluir Registro");
        btnExcluir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnExcluir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelBotoesLayout = new javax.swing.GroupLayout(painelBotoes);
        painelBotoes.setLayout(painelBotoesLayout);
        painelBotoesLayout.setHorizontalGroup(
            painelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelBotoesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnNovo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSalvar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnExcluir)
                .addContainerGap(603, Short.MAX_VALUE))
        );
        painelBotoesLayout.setVerticalGroup(
            painelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelBotoesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNovo)
                    .addComponent(btnExcluir)
                    .addComponent(btnSalvar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        desktopPrincipal.setBackground(new java.awt.Color(51, 51, 51));
        desktopPrincipal.setComponentPopupMenu(jPopupMenu1);

        jToolBar2.setRollover(true);

        desktopPrincipal.setLayer(jToolBar2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout desktopPrincipalLayout = new javax.swing.GroupLayout(desktopPrincipal);
        desktopPrincipal.setLayout(desktopPrincipalLayout);
        desktopPrincipalLayout.setHorizontalGroup(
            desktopPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar2, javax.swing.GroupLayout.DEFAULT_SIZE, 837, Short.MAX_VALUE)
        );
        desktopPrincipalLayout.setVerticalGroup(
            desktopPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, desktopPrincipalLayout.createSequentialGroup()
                .addContainerGap(787, Short.MAX_VALUE)
                .addComponent(jToolBar2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jMenuCadastro.setText("Cadastro");

        itemCliente.setIcon(new javax.swing.ImageIcon("C:\\Users\\JOAOPEDROKROTHBORBA\\Downloads\\Icones\\32 x 32\\cliente.png")); // NOI18N
        itemCliente.setText("Cliente");
        itemCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemClienteActionPerformed(evt);
            }
        });
        jMenuCadastro.add(itemCliente);

        itemProdutos.setIcon(new javax.swing.ImageIcon("C:\\Users\\JOAOPEDROKROTHBORBA\\Downloads\\Icones\\32 x 32\\pendrive.png")); // NOI18N
        itemProdutos.setText("Produto");
        itemProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemProdutosActionPerformed(evt);
            }
        });
        jMenuCadastro.add(itemProdutos);

        itemServico.setIcon(new javax.swing.ImageIcon("C:\\Users\\JOAOPEDROKROTHBORBA\\Downloads\\Icones\\32 x 32\\cartao.png")); // NOI18N
        itemServico.setText("Servico");
        jMenuCadastro.add(itemServico);

        jMenuBar1.add(jMenuCadastro);

        jMenuConsultas.setText("Consultas");

        jMenuProduto2.setIcon(new javax.swing.ImageIcon("C:\\Users\\JOAOPEDROKROTHBORBA\\Downloads\\Icones\\32 x 32\\lupa.png")); // NOI18N
        jMenuProduto2.setText("Clientes");
        jMenuProduto2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuProduto2ActionPerformed(evt);
            }
        });
        jMenuConsultas.add(jMenuProduto2);
        jMenuConsultas.add(jSeparator1);

        jMenuItem4.setIcon(new javax.swing.ImageIcon("C:\\Users\\JOAOPEDROKROTHBORBA\\Downloads\\Icones\\32 x 32\\caixa(1).png")); // NOI18N
        jMenuItem4.setText("Produto");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenuConsultas.add(jMenuItem4);
        jMenuConsultas.add(jSeparator2);

        jMenuServico2.setIcon(new javax.swing.ImageIcon("C:\\Users\\JOAOPEDROKROTHBORBA\\Downloads\\Icones\\32 x 32\\cubos.png")); // NOI18N
        jMenuServico2.setText("Sevico");
        jMenuConsultas.add(jMenuServico2);

        jMenuBar1.add(jMenuConsultas);

        jMenuRelatorios.setText("Relatorios");
        jMenuBar1.add(jMenuRelatorios);

        jMenuAjuda.setText("Ajuda");
        jMenuBar1.add(jMenuAjuda);

        jMenuFinalizar.setText("Finalizar");
        jMenuBar1.add(jMenuFinalizar);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelBotoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(desktopPrincipal)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(painelBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(desktopPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuProduto2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuProduto2ActionPerformed
        
    }//GEN-LAST:event_jMenuProduto2ActionPerformed

    private void MenuProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MenuProdutoActionPerformed

    private void itemClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemClienteActionPerformed
 
        TelaCliente tela = new TelaCliente();

    desktopPrincipal.add(tela);

    tela.setVisible(true);

        
    }//GEN-LAST:event_itemClienteActionPerformed

    private void itemProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemProdutosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemProdutosActionPerformed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem4ActionPerformed

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
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new main().setVisible(true);
            }
        });
    
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem MenuCliente;
    private javax.swing.JMenuItem MenuProduto;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JDesktopPane desktopPrincipal;
    private javax.swing.JMenuItem itemCliente;
    private javax.swing.JMenuItem itemProdutos;
    private javax.swing.JMenuItem itemServico;
    private javax.swing.JMenu jMenuAjuda;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuCadastro;
    private javax.swing.JMenu jMenuConsultas;
    private javax.swing.JMenu jMenuFinalizar;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuProduto2;
    private javax.swing.JMenu jMenuRelatorios;
    private javax.swing.JMenuItem jMenuServico2;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JToolBar jToolBar2;
    private javax.swing.JPanel painelBotoes;
    // End of variables declaration//GEN-END:variables
}

