/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import Modelos.CidadeEntrega;
import Modelos.Cliente;
import Modelos.Pedido;
import database.dao.CidadeEntregaDAO;
import database.dao.ClienteDAO;
import database.dao.PedidosDAO;
import java.awt.HeadlessException;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author aluno
 */
public class TelaRealizarPedido extends javax.swing.JDialog {
    
    private Pedido pedido;
    private CidadeEntrega cidade;
    public String cpf;

    public CidadeEntrega getCidade() {
        return cidade;
    }

    public void setCidade(CidadeEntrega cidade) {
        this.cidade = cidade;
        
        TxtTempoEntrega.setText(cidade.getNome());
        TxtValor.setText(String.valueOf(cidade.getValorEntrega()));
        
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }
    
    
    
    
    
    /**
     * Creates new form TelaRealizarPedido
     */
    public TelaRealizarPedido(java.awt.Frame parent, boolean modal, String cpf) {
        super(parent, modal);
        this.cpf = cpf;
        initComponents();
    }
  
    private void PreencherCombo()
    {
        try {
            ArrayList<CidadeEntrega> lista = new CidadeEntregaDAO().BuscarTodos();
            
            DefaultComboBoxModel<String> dcbm = (DefaultComboBoxModel<String>) CbCidadeDestino.getModel();
            
            dcbm.removeAllElements();
            
            for(CidadeEntrega c: lista)
            {
                dcbm.addElement(c.getNome());
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(TelaRealizarPedido.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TelaRealizarPedido.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        jPanel1 = new javax.swing.JPanel();
        TxtCPF = new javax.swing.JTextField();
        LblCidadeDestino = new javax.swing.JLabel();
        LblVeiculo = new javax.swing.JLabel();
        CbVeiculo = new javax.swing.JComboBox<>();
        LblCPF = new javax.swing.JLabel();
        BtnPesquisar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        TxtValor = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        TxtTempoEntrega = new javax.swing.JTextField();
        CbCidadeDestino = new javax.swing.JComboBox<>();
        LblDistancia = new javax.swing.JLabel();
        TxtDistancia = new javax.swing.JTextField();
        LblData = new javax.swing.JLabel();
        LblMostrarData = new javax.swing.JLabel();
        TxtDescricao = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TblPedidos = new javax.swing.JTable();
        BtnContratar = new javax.swing.JButton();
        BtnCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                AoAbrirJanela(evt);
            }
        });

        PnlPrincipal.setBackground(new java.awt.Color(204, 204, 204));

        LblPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        LblPrincipal.setFont(new java.awt.Font("Constantia", 1, 24)); // NOI18N
        LblPrincipal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LblPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/logo.png"))); // NOI18N
        LblPrincipal.setText("Area do Cliente");

        javax.swing.GroupLayout PnlPrincipalLayout = new javax.swing.GroupLayout(PnlPrincipal);
        PnlPrincipal.setLayout(PnlPrincipalLayout);
        PnlPrincipalLayout.setHorizontalGroup(
            PnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LblPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 678, Short.MAX_VALUE)
        );
        PnlPrincipalLayout.setVerticalGroup(
            PnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnlPrincipalLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(LblPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Realizar Consulta", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Constantia", 1, 14))); // NOI18N

        TxtCPF.setEnabled(false);

        LblCidadeDestino.setFont(new java.awt.Font("Constantia", 1, 14)); // NOI18N
        LblCidadeDestino.setText("Cidade Destino:");

        LblVeiculo.setFont(new java.awt.Font("Constantia", 1, 14)); // NOI18N
        LblVeiculo.setText("Porte da Carga");

        CbVeiculo.setFont(new java.awt.Font("Constantia", 1, 14)); // NOI18N
        CbVeiculo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Pequeno - Moto", "Medio - Carro", "Grande - Caminhão" }));

        LblCPF.setFont(new java.awt.Font("Constantia", 1, 14)); // NOI18N
        LblCPF.setText("CPF:");

        BtnPesquisar.setFont(new java.awt.Font("Constantia", 1, 14)); // NOI18N
        BtnPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/search.png"))); // NOI18N
        BtnPesquisar.setText("Pesquisar Frete");
        BtnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PesquisarEntrega(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Constantia", 1, 14)); // NOI18N
        jLabel1.setText("Valor:");

        jLabel2.setFont(new java.awt.Font("Constantia", 1, 14)); // NOI18N
        jLabel2.setText("Tempo de Entrega:");

        CbCidadeDestino.setFont(new java.awt.Font("Constantia", 1, 14)); // NOI18N
        CbCidadeDestino.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Belo Horizonte", "Bicas", "Conselheiro Lafaete", "Contagem", "São João Del Rei", "Varginha" }));

        LblDistancia.setFont(new java.awt.Font("Constantia", 1, 14)); // NOI18N
        LblDistancia.setText("Distancia:");

        LblData.setFont(new java.awt.Font("Constantia", 1, 14)); // NOI18N
        LblData.setText("Data:");

        LblMostrarData.setText("0");

        jLabel3.setFont(new java.awt.Font("Constantia", 1, 14)); // NOI18N
        jLabel3.setText("Descrição do Produto:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(220, 220, 220)
                                .addComponent(BtnPesquisar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(LblDistancia)
                                .addGap(18, 18, 18)
                                .addComponent(TxtDistancia, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(TxtTempoEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)))
                        .addComponent(TxtValor, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3)
                                .addComponent(LblCPF, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addComponent(LblCidadeDestino, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(LblVeiculo, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(TxtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(LblData)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(LblMostrarData)
                                .addGap(100, 100, 100))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TxtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CbCidadeDestino, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CbVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LblCPF)
                            .addComponent(TxtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(LblData)
                        .addComponent(LblMostrarData)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(TxtDescricao)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LblCidadeDestino)
                            .addComponent(CbCidadeDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CbVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LblVeiculo))
                        .addGap(15, 15, 15)
                        .addComponent(BtnPesquisar)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TxtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(TxtTempoEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LblDistancia)
                            .addComponent(TxtDistancia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        TblPedidos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Cidade Destino", "Veiculo", "Valor", "Data do Pedido", "Tempo de Entrega", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(TblPedidos);

        BtnContratar.setFont(new java.awt.Font("Constantia", 1, 14)); // NOI18N
        BtnContratar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/check.png"))); // NOI18N
        BtnContratar.setText("Contratar");
        BtnContratar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ContratarFrete(evt);
            }
        });

        BtnCancelar.setFont(new java.awt.Font("Constantia", 1, 14)); // NOI18N
        BtnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/back.png"))); // NOI18N
        BtnCancelar.setText("Cancelar");
        BtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FecharJanela(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PnlPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BtnContratar, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BtnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PnlPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnContratar)
                    .addComponent(BtnCancelar))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    private void AoAbrirJanela(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_AoAbrirJanela

        PreencherTable(true);
        PreencherCombo();
        TelaLogin c = new TelaLogin(cpf);
        TxtCPF.setText(cpf);
        SimpleDateFormat data = new SimpleDateFormat("dd/MM/yyyy");
        LblMostrarData.setText(data.format(new Date()));
        
    }//GEN-LAST:event_AoAbrirJanela

    private void PesquisarEntrega(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PesquisarEntrega
        
            CidadeEntrega lista;
        
        try {            
                lista = new CidadeEntregaDAO().BuscarNome(CbCidadeDestino.getSelectedItem().toString());
                
                    String tempo = lista.getTempoEntrega();
                    Double valor = lista.getValorEntrega();
                    Double distancia = lista.getDistancia();
                    
                    if(CbVeiculo.getSelectedIndex() == 1)
                    {
                        TxtValor.setText(String.valueOf(valor));
                        TxtTempoEntrega.setText(tempo);
                        TxtDistancia.setText(String.valueOf(distancia));
                    }
                    else if(CbVeiculo.getSelectedIndex() == 2)
                    {
                        valor = valor +(valor * 0.25);
                        TxtValor.setText(String.valueOf(valor));
                        TxtTempoEntrega.setText(tempo);
                        TxtDistancia.setText(String.valueOf(distancia));
                    }
                    else if(CbVeiculo.getSelectedIndex() == 3)
                    {
                        valor = valor +(valor * 0.50);
                        TxtValor.setText(String.valueOf(valor));
                        TxtTempoEntrega.setText(tempo);
                        TxtDistancia.setText(String.valueOf(distancia));
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null, "Escolha um veiculo para entrega!");
                    }               
            } 
        
        catch (SQLException ex) {
            Logger.getLogger(TelaRealizarPedido.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TelaRealizarPedido.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_PesquisarEntrega
        
    private void ContratarFrete(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ContratarFrete
      
        Pedido pedido;
        
        try {
            Cliente c = new ClienteDAO().BuscarCPF(TxtCPF.getText());
            CidadeEntrega cd = new CidadeEntregaDAO().BuscarNome(CbCidadeDestino.getSelectedItem().toString());
        
        pedido = new Pedido(0,TxtDescricao.getText(),"Juiz de Fora",CbVeiculo.getSelectedItem().toString(),"Pendente",LblMostrarData.getText(),Double.parseDouble(TxtValor.getText()),c,cd,null);
        
            if(this.pedido == null)
            {
            
                new PedidosDAO().Salvar((Pedido)pedido);
            }
            
            JOptionPane.showMessageDialog(null, "Pedido Salvo Com Sucesso!");
            
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        
        PreencherTable(true);
        
    }//GEN-LAST:event_ContratarFrete

    private void FecharJanela(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FecharJanela
        
        this.dispose();
        
    }//GEN-LAST:event_FecharJanela

    ArrayList<Pedido> lista;
    
    public void PreencherTable(boolean todos) throws HeadlessException{
        
        try {
            new PedidosDAO().BuscarPorCPF(cpf);
           
            if(todos)
            {
                lista = new PedidosDAO().BuscarPorCPF(cpf);
            }
            
            DefaultTableModel dftm = (DefaultTableModel) TblPedidos.getModel();
            
            while(dftm.getRowCount() >= 1)
            {
                dftm.removeRow(dftm.getRowCount()-1);
            }
            
            for(Pedido p: lista)
            {
                String[] linha = {p.getCidade().getNome(),p.getVeiculo(),p.getValorPedido()+"",p.getDataPedido(),p.getCidade().getTempoEntrega(),p.getStatus()};
                dftm.addRow(linha);
            }
            
        } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null,"Erro ao salvar!"+ex);
        } catch (ClassNotFoundException ex) {
                JOptionPane.showMessageDialog(null,"Erro do Driver");
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
            java.util.logging.Logger.getLogger(TelaRealizarPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaRealizarPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaRealizarPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaRealizarPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                TelaRealizarPedido dialog = new TelaRealizarPedido(new javax.swing.JFrame(), true, null);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCancelar;
    private javax.swing.JButton BtnContratar;
    private javax.swing.JButton BtnPesquisar;
    private javax.swing.JComboBox<String> CbCidadeDestino;
    private javax.swing.JComboBox<String> CbVeiculo;
    private javax.swing.JLabel LblCPF;
    private javax.swing.JLabel LblCidadeDestino;
    private javax.swing.JLabel LblData;
    private javax.swing.JLabel LblDistancia;
    private javax.swing.JLabel LblMostrarData;
    private javax.swing.JLabel LblPrincipal;
    private javax.swing.JLabel LblVeiculo;
    private javax.swing.JPanel PnlPrincipal;
    private javax.swing.JTable TblPedidos;
    private javax.swing.JTextField TxtCPF;
    private javax.swing.JTextField TxtDescricao;
    private javax.swing.JTextField TxtDistancia;
    private javax.swing.JTextField TxtTempoEntrega;
    private javax.swing.JTextField TxtValor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
