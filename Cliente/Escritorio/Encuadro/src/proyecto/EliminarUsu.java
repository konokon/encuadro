/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

import java.awt.Image;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JList;
import javax.swing.JOptionPane;
import proyecto.clases.Global;

/**
 *
 * @author SysAdmin
 */
public class EliminarUsu extends javax.swing.JFrame {
    private DefaultListModel modelListaElim = new DefaultListModel();
    public int indexSeleccionado = -1;
    int idUsu;
    ProcesandoPeticion prc = new ProcesandoPeticion();
    
    /**
     * Creates new form EliminarUsu
     */
    public EliminarUsu() {       
        Image ico = new ImageIcon(Global.directorioLocal + "\\museo.png").getImage();
        setIconImage(ico);
        this.setLocationRelativeTo(null);
        prc.setLocationRelativeTo(null);
        prc.setVisible(true);
        initComponents();
        DeshabilitarForm();
        ListaElim.setModel(modelListaElim);
        CargarLista(ListaElim);        
        //SetLook();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        ListaElim = new javax.swing.JList();
        LabNombre = new javax.swing.JLabel();
        LabApellido = new javax.swing.JLabel();
        LabCedula = new javax.swing.JLabel();
        LabEmail = new javax.swing.JLabel();
        LabNick = new javax.swing.JLabel();
        LabIdUsu = new javax.swing.JLabel();
        BotEliminar = new javax.swing.JButton();
        LabNombre2 = new javax.swing.JLabel();
        LabApellido2 = new javax.swing.JLabel();
        LabCedula2 = new javax.swing.JLabel();
        LabEmail2 = new javax.swing.JLabel();
        LabNick2 = new javax.swing.JLabel();
        LabIdUsu2 = new javax.swing.JLabel();
        BotCancelar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        LabTipoUsu2 = new javax.swing.JLabel();
        LabTipoUsu = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Eliminar Usuario");
        setAlwaysOnTop(true);
        setResizable(false);

        ListaElim.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        ListaElim.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                ListaElimValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(ListaElim);

        LabNombre.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        LabNombre.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        LabNombre.setText("Nombre:");

        LabApellido.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        LabApellido.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        LabApellido.setText("Apellido:");

        LabCedula.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        LabCedula.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        LabCedula.setText("Cédula:");

        LabEmail.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        LabEmail.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        LabEmail.setText("E-mail:");

        LabNick.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        LabNick.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        LabNick.setText("Nick:");

        LabIdUsu.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        LabIdUsu.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        LabIdUsu.setText("Id:");

        BotEliminar.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        BotEliminar.setText("Eliminar");
        BotEliminar.setToolTipText("Eliminar el usuario seleccionado");
        BotEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotEliminarActionPerformed(evt);
            }
        });

        LabNombre2.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        LabNombre2.setText("-");

        LabApellido2.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        LabApellido2.setText("-");

        LabCedula2.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        LabCedula2.setText("-");

        LabEmail2.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        LabEmail2.setText("-");

        LabNick2.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        LabNick2.setText("-");

        LabIdUsu2.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        LabIdUsu2.setText("-");

        BotCancelar.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        BotCancelar.setText("Cancelar");
        BotCancelar.setToolTipText("Cerrar ventana actual");
        BotCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotCancelarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel1.setText("Selecciona un usuario de la lista para ver sus datos y poder eliminarlo.");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Eliminar Usuario");

        LabTipoUsu2.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        LabTipoUsu2.setText("-");

        LabTipoUsu.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        LabTipoUsu.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        LabTipoUsu.setText("Tipo:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 389, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(BotEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BotCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(LabNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(LabTipoUsu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(LabApellido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(LabIdUsu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(LabCedula, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(LabEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(LabNick, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(LabApellido2, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
                                    .addComponent(LabCedula2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(LabEmail2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(LabNick2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(LabIdUsu2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(LabTipoUsu2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(LabNombre2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LabNombre)
                            .addComponent(LabNombre2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LabApellido)
                            .addComponent(LabApellido2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LabCedula)
                            .addComponent(LabCedula2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LabEmail)
                            .addComponent(LabEmail2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LabNick)
                            .addComponent(LabNick2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LabIdUsu)
                            .addComponent(LabIdUsu2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LabTipoUsu2)
                            .addComponent(LabTipoUsu))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BotCancelar)
                            .addComponent(BotEliminar)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotEliminarActionPerformed
        if(Integer.parseInt(LabIdUsu2.getText()) == Global.IDUsu){
            JOptionPane.showMessageDialog(rootPane, "No puedes eliminar tu propio usuario");
        }else{
            if(JOptionPane.showConfirmDialog(rootPane, "¿Seguro desea eliminar este usuario?") == JOptionPane.YES_OPTION) {
                prc.setVisible(true);
                if(borrarUsuario(idUsu) == 0){
                    prc.dispose();
                    JOptionPane.showMessageDialog(rootPane, "Usuario eliminado con éxito.");
                    DeshabilitarForm();
                    DefaultListModel listModel = (DefaultListModel)ListaElim.getModel();
                    listModel.removeElementAt(indexSeleccionado);
                }else{
                    prc.dispose();
                    JOptionPane.showMessageDialog(rootPane, "No fue posible eliminar el usuario.\nPor favor inténtalo de nuevo.");
                }
            }
        }
    }//GEN-LAST:event_BotEliminarActionPerformed

    private void ListaElimValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_ListaElimValueChanged
        int c = 0;
        String x = null;
        indexSeleccionado = -1;
        indexSeleccionado = ListaElim.getSelectedIndex();
        
        String data = null;
        data = getDataUsuario((String) modelListaElim.get(indexSeleccionado));
        String[] games1 = null;
        games1 = data.split("=>");
        
        for (int r=0; r<games1.length; r++){
            x = games1[r];
            c++;
            if(c == 1) {
                LabNombre2.setText(x);
            }
            else{
                if (c == 2) {
                    LabApellido2.setText(x);
                }
                else{
                    if ( c == 3 ) {
                        LabCedula2.setText(x);
                    }
                    else{
                        if ( c == 4 ) {
                            LabEmail2.setText(x);
                        }
                        else{
                            if (c == 5) {
                                if("1".equals(x)){
                                    LabTipoUsu2.setText("Administrador");
                                }else{
                                    LabTipoUsu2.setText("Empleado");
                                }
                            }
                            else{
                                if (c == 6) {
                                    LabNick2.setText(x);
                                }
                                else{
                                    if( c == 8 ){
                                        LabIdUsu2.setText(x);
                                        idUsu = Integer.parseInt(x);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }   
        data = null;
        HabilitarForm();
         // TODO add your handling code here:
    }//GEN-LAST:event_ListaElimValueChanged

    private void BotCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotCancelarActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_BotCancelarActionPerformed

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
            java.util.logging.Logger.getLogger(EliminarUsu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EliminarUsu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EliminarUsu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EliminarUsu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EliminarUsu().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotCancelar;
    private javax.swing.JButton BotEliminar;
    private javax.swing.JLabel LabApellido;
    private javax.swing.JLabel LabApellido2;
    private javax.swing.JLabel LabCedula;
    private javax.swing.JLabel LabCedula2;
    private javax.swing.JLabel LabEmail;
    private javax.swing.JLabel LabEmail2;
    private javax.swing.JLabel LabIdUsu;
    private javax.swing.JLabel LabIdUsu2;
    private javax.swing.JLabel LabNick;
    private javax.swing.JLabel LabNick2;
    private javax.swing.JLabel LabNombre;
    private javax.swing.JLabel LabNombre2;
    private javax.swing.JLabel LabTipoUsu;
    private javax.swing.JLabel LabTipoUsu2;
    private javax.swing.JList ListaElim;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    private static String getUsuarios() {
        _109._2._0._10.server_php.Comision service = new _109._2._0._10.server_php.Comision();
        _109._2._0._10.server_php.ComisionPortType port = service.getComisionPort();
        return port.getUsuarios();
    }

    private static String getDataUsuario(java.lang.String nick) {
        _109._2._0._10.server_php.Comision service = new _109._2._0._10.server_php.Comision();
        _109._2._0._10.server_php.ComisionPortType port = service.getComisionPort();
        return port.getDataUsuario(nick);
    }

    private static int borrarUsuario(int idUsuario) {
        _109._2._0._10.server_php.Comision service = new _109._2._0._10.server_php.Comision();
        _109._2._0._10.server_php.ComisionPortType port = service.getComisionPort();
        return port.borrarUsuario(idUsuario);
    }

    /**
     * Carga en el form los datos de los usuarios existentes en el sistema
     * @param lista 
     */
    private void CargarLista(JList lista){
        String e = null;
        String list = null;
        list = getUsuarios();
        String[] games = list.split("=>");
        DefaultListModel listModel = (DefaultListModel)lista.getModel();
        
        for (int i=0;i<games.length;i++){
            e = games[i];
            listModel.addElement(e);
        }
        prc.dispose();
    }
    
    /**
     * Habilita las labels del formulario
     */
    private void HabilitarForm(){
        LabNombre.setEnabled(true);
        LabNombre2.setEnabled(true);
        LabApellido.setEnabled(true);
        LabApellido2.setEnabled(true);
        LabCedula.setEnabled(true);
        LabCedula2.setEnabled(true);
        LabNick.setEnabled(true);
        LabNick2.setEnabled(true);
        LabEmail.setEnabled(true);
        LabEmail2.setEnabled(true);
        LabIdUsu.setEnabled(true);
        LabIdUsu2.setEnabled(true);
        LabTipoUsu.setEnabled(true);
        LabTipoUsu2.setEnabled(true);
        BotEliminar.setEnabled(true);
    }
    
    /**
     * Desabilita las labels del formulario y resetea el texto de las mismas
     */
    private void DeshabilitarForm(){
        LabNombre2.setText("-");
        LabApellido2.setText("-");
        LabCedula2.setText("-");
        LabEmail2.setText("-");
        LabNick2.setText("-");
        LabIdUsu2.setText("-");
        LabTipoUsu2.setText("-");
        LabNombre.setEnabled(false);        
        LabNombre2.setEnabled(false);
        LabApellido.setEnabled(false);
        LabApellido2.setEnabled(false);
        LabCedula.setEnabled(false);
        LabCedula2.setEnabled(false);
        LabEmail.setEnabled(false);
        LabEmail2.setEnabled(false);
        LabNick.setEnabled(false);
        LabNick2.setEnabled(false);
        LabIdUsu.setEnabled(false);
        LabIdUsu2.setEnabled(false);
        LabTipoUsu.setEnabled(false);
        LabTipoUsu2.setEnabled(false);
        BotEliminar.setEnabled(false);
    }
}
