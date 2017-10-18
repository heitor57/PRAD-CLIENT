/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package layout;

import dao.ClientesDAO;
import java.util.List;
import javabeans.Clientes;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author Suporte
 */
public class Cliente extends javax.swing.JDialog {
    ClientesDAO dao;
    /**
     * Creates new form Cliente
     */
    public Cliente(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
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

        txtcodigo = new javax.swing.JTextField();
        jToolBar1 = new javax.swing.JToolBar();
        btnovo = new javax.swing.JButton();
        btsalvar = new javax.swing.JButton();
        btatualizar = new javax.swing.JButton();
        btpesquisar = new javax.swing.JButton();
        btexcluir = new javax.swing.JButton();
        btsair = new javax.swing.JButton();
        txtnome = new javax.swing.JTextField();
        txttelefone = new javax.swing.JFormattedTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelacliente = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        btbuscar = new javax.swing.JButton();
        txtnomebusca = new javax.swing.JTextField();
        txtemail1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Tela Cliente");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        txtcodigo.setEditable(false);
        txtcodigo.setBorder(javax.swing.BorderFactory.createTitledBorder("Codigo"));
        txtcodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcodigoActionPerformed(evt);
            }
        });

        jToolBar1.setRollover(true);

        btnovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/novo.jpg"))); // NOI18N
        btnovo.setFocusable(false);
        btnovo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnovo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnovoActionPerformed(evt);
            }
        });
        jToolBar1.add(btnovo);

        btsalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/salvar.gif"))); // NOI18N
        btsalvar.setFocusable(false);
        btsalvar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btsalvar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btsalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btsalvarActionPerformed(evt);
            }
        });
        jToolBar1.add(btsalvar);

        btatualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/atualiza.jpg"))); // NOI18N
        btatualizar.setFocusable(false);
        btatualizar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btatualizar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btatualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btatualizarActionPerformed(evt);
            }
        });
        jToolBar1.add(btatualizar);

        btpesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Buscar.jpg"))); // NOI18N
        btpesquisar.setFocusable(false);
        btpesquisar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btpesquisar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(btpesquisar);

        btexcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/DEL.jpg"))); // NOI18N
        btexcluir.setFocusable(false);
        btexcluir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btexcluir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(btexcluir);

        btsair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/sair.gif"))); // NOI18N
        btsair.setFocusable(false);
        btsair.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btsair.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btsair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btsairActionPerformed(evt);
            }
        });
        jToolBar1.add(btsair);

        txtnome.setBorder(javax.swing.BorderFactory.createTitledBorder("Nome"));

        txttelefone.setBorder(javax.swing.BorderFactory.createTitledBorder("Telefone"));
        try {
            txttelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        tabelacliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Nome", "Email", "Telefone"
            }
        ));
        tabelacliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaclienteMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelacliente);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Consulta"));

        btbuscar.setText("Buscar");
        btbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btbuscarActionPerformed(evt);
            }
        });

        txtnomebusca.setBorder(javax.swing.BorderFactory.createTitledBorder("Nome"));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtnomebusca, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(btbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtnomebusca)
                    .addComponent(btbuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        txtemail1.setBorder(javax.swing.BorderFactory.createTitledBorder("Email"));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txttelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtnome, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 175, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtemail1, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtcodigo)
                    .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtnome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txttelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(txtemail1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtcodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcodigoActionPerformed

    private void btsairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btsairActionPerformed
        Sair();
    }//GEN-LAST:event_btsairActionPerformed

    private void btsalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btsalvarActionPerformed
        Salvar();
    }//GEN-LAST:event_btsalvarActionPerformed

    private void btnovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnovoActionPerformed
        Novo();
    }//GEN-LAST:event_btnovoActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        Listar();
    }//GEN-LAST:event_formWindowActivated

    private void btatualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btatualizarActionPerformed
        Atualizar();
    }//GEN-LAST:event_btatualizarActionPerformed

    private void tabelaclienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaclienteMouseClicked
        txtcodigo.setText(tabelacliente.getValueAt(tabelacliente.getSelectedRow(),0).toString());
        txtnome.setText(tabelacliente.getValueAt(tabelacliente.getSelectedRow(),1).toString());
        txtemail1.setText(tabelacliente.getValueAt(tabelacliente.getSelectedRow(),2).toString());
        txttelefone.setText(tabelacliente.getValueAt(tabelacliente.getSelectedRow(),3).toString());
    }//GEN-LAST:event_tabelaclienteMouseClicked

    private void btbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btbuscarActionPerformed
        Buscar();
    }//GEN-LAST:event_btbuscarActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btatualizar;
    private javax.swing.JButton btbuscar;
    private javax.swing.JButton btexcluir;
    private javax.swing.JButton btnovo;
    private javax.swing.JButton btpesquisar;
    private javax.swing.JButton btsair;
    private javax.swing.JButton btsalvar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JTable tabelacliente;
    private javax.swing.JTextField txtcodigo;
    private javax.swing.JTextField txtemail1;
    private javax.swing.JTextField txtnome;
    private javax.swing.JTextField txtnomebusca;
    private javax.swing.JFormattedTextField txttelefone;
    // End of variables declaration//GEN-END:variables

    void Sair(){
        setVisible(false);
    }
    void Novo(){
        txtnome.setText(null);
        txtemail1.setText(null);
        txttelefone.setText(null);
        txtnome.requestFocus();
        btnovo.setEnabled(false);
        btsalvar.setEnabled(true);
        btatualizar.setEnabled(true);
        btexcluir.setEnabled(true);
    }
    void Salvar(){
        try{
            Clientes obj = new Clientes();
            obj.setNome(txtnome.getText());
            obj.setEmail(txtemail1.getText());
            obj.setTelefone(txttelefone.getText());
            
            dao = new ClientesDAO();
            dao.cadastrarCliente(obj);
            
            JOptionPane.showMessageDialog(null,"Cadastro realizado com sucesso");
        } catch(Exception e){
            JOptionPane.showMessageDialog(null,"Erro ao cadastrar o cliente");
            JOptionPane.showMessageDialog(null,e.toString());
        }
        //txtcodigo.setText("");
        //txtnome.setText("");
        //txttelefone.setText("");
        //txtemail.setText("");
        
    }
    public void Listar(){
        try{
            ClientesDAO dao = new ClientesDAO();
            List<Clientes> listarclientes = dao.listarClientes();
            DefaultTableModel modelo = (DefaultTableModel) tabelacliente.getModel();
            modelo.setNumRows(0);
            
            for(Clientes lc : listarclientes){
                
                modelo.addRow(new Object[]{
                        lc.getId(),
                        lc.getNome(),
                        lc.getEmail(),  
                        lc.getTelefone()
                        });
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
    }
    
     void Atualizar(){
        try{
            Clientes obj = new Clientes();
            obj.setNome(txtnome.getText());
            obj.setEmail(txtemail1.getText());
            obj.setTelefone(txttelefone.getText());
            obj.setId(Integer.parseInt(txtcodigo.getText()));
            
            dao = new ClientesDAO();
            dao.alterarCliente(obj);
            
            JOptionPane.showMessageDialog(null,"Dados alterados com sucesso");
            
        } catch(Exception e){
            JOptionPane.showMessageDialog(null,"Erro ao alterar o cliente");
            JOptionPane.showMessageDialog(null,e.toString());
        }
        //txtcodigo.setText("");
        //txtnome.setText("");
        //txttelefone.setText("");
        //txtemail.setText("");
        
    }
    void Buscar(){
        try{
            ClientesDAO dao = new ClientesDAO();
            List<Clientes> listarclientes = dao.listarClientesPorNome(txtnomebusca.getText());
            DefaultTableModel modelo = (DefaultTableModel) tabelacliente.getModel();
            modelo.setNumRows(0);
            
            for(Clientes lc : listarclientes){
                txtcodigo.setText(String.valueOf((lc.getId())));
                txtnome.setText(lc.getNome());
                txtemail1.setText(lc.getEmail());
                txttelefone.setText(lc.getTelefone());
                modelo.addRow(new Object[]{
                        lc.getId(),
                        lc.getNome(),
                        lc.getEmail(),  
                        lc.getTelefone()
                        });
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
    }
}
