/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

/**
 *
 * @author aluno
 */
public class TelaInicial extends javax.swing.JFrame {

    /**
     * Creates new form TelaInicial
     */
    public TelaInicial() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PnlPrincipal = new javax.swing.JPanel();
        LblPrincipal = new javax.swing.JLabel();
        BtnCadastro = new javax.swing.JButton();
        BtnRealizarPedido = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        BtnSair = new javax.swing.JButton();
        MnPrincipal = new javax.swing.JMenuBar();
        MnAcessos = new javax.swing.JMenu();
        MnMotorista = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        MnAdministrador = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PnlPrincipal.setBackground(new java.awt.Color(204, 204, 204));

        LblPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        LblPrincipal.setFont(new java.awt.Font("Constantia", 1, 24)); // NOI18N
        LblPrincipal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LblPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/logo.png"))); // NOI18N
        LblPrincipal.setText("Coelho Rapido");

        javax.swing.GroupLayout PnlPrincipalLayout = new javax.swing.GroupLayout(PnlPrincipal);
        PnlPrincipal.setLayout(PnlPrincipalLayout);
        PnlPrincipalLayout.setHorizontalGroup(
            PnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LblPrincipal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PnlPrincipalLayout.setVerticalGroup(
            PnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LblPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        BtnCadastro.setFont(new java.awt.Font("Constantia", 1, 14)); // NOI18N
        BtnCadastro.setText("Cadastrar");
        BtnCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AbrirCadastroCliente(evt);
            }
        });

        BtnRealizarPedido.setFont(new java.awt.Font("Constantia", 1, 14)); // NOI18N
        BtnRealizarPedido.setText("Entrar");
        BtnRealizarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AbrirLoginCliente(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/entrega.png"))); // NOI18N

        BtnSair.setFont(new java.awt.Font("Constantia", 1, 14)); // NOI18N
        BtnSair.setText("Sair");
        BtnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SairDoSistema(evt);
            }
        });

        MnAcessos.setBorder(null);
        MnAcessos.setText("Acessos");

        MnMotorista.setText("Motorista");
        MnMotorista.setContentAreaFilled(false);
        MnMotorista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AbrirLoginMotorista(evt);
            }
        });
        MnAcessos.add(MnMotorista);
        MnAcessos.add(jSeparator1);

        MnAdministrador.setText("Administrador");
        MnAdministrador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AbrirLoginAdministrador(evt);
            }
        });
        MnAcessos.add(MnAdministrador);

        MnPrincipal.add(MnAcessos);

        setJMenuBar(MnPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PnlPrincipal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BtnSair, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(BtnCadastro)
                                .addGap(30, 30, 30)
                                .addComponent(BtnRealizarPedido)
                                .addGap(114, 114, 114)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PnlPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnRealizarPedido)
                    .addComponent(BtnCadastro))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addComponent(BtnSair)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void AbrirLoginMotorista(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AbrirLoginMotorista
        
        TelaLoginMotorista tlm = new TelaLoginMotorista(this, true);
        tlm.setVisible(true);
        
    }//GEN-LAST:event_AbrirLoginMotorista

    private void AbrirLoginAdministrador(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AbrirLoginAdministrador
        TelaLoginAdministrador tla = new TelaLoginAdministrador(this, true);
        tla.setVisible(true);
    }//GEN-LAST:event_AbrirLoginAdministrador

    private void AbrirLoginCliente(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AbrirLoginCliente
        TelaLogin tl = new TelaLogin(this, true);
        tl.setVisible(true);
    }//GEN-LAST:event_AbrirLoginCliente

    private void AbrirCadastroCliente(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AbrirCadastroCliente
        TelaCadastroCliente tcc = new TelaCadastroCliente(this, true);
        tcc.setVisible(true);
    }//GEN-LAST:event_AbrirCadastroCliente

    private void SairDoSistema(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SairDoSistema
        
        System.exit(0);
        
    }//GEN-LAST:event_SairDoSistema

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
            javax.swing.UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaInicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCadastro;
    private javax.swing.JButton BtnRealizarPedido;
    private javax.swing.JButton BtnSair;
    private javax.swing.JLabel LblPrincipal;
    private javax.swing.JMenu MnAcessos;
    private javax.swing.JMenuItem MnAdministrador;
    private javax.swing.JMenuItem MnMotorista;
    private javax.swing.JMenuBar MnPrincipal;
    private javax.swing.JPanel PnlPrincipal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
