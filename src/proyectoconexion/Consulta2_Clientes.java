/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoconexion;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author leoth
 */
public class Consulta2_Clientes extends javax.swing.JFrame {

    /**
     * Creates new form Consulta2_Clientes
     */
    public Consulta2_Clientes() {
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

        jPanel1 = new javax.swing.JPanel();
        VolverBTN = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaConsulta2 = new javax.swing.JTable();
        ConsultarBTN = new javax.swing.JButton();
        IdClienteTXT = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 204));

        VolverBTN.setBackground(new java.awt.Color(255, 0, 0));
        VolverBTN.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        VolverBTN.setForeground(new java.awt.Color(255, 255, 255));
        VolverBTN.setText("Volver");
        VolverBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VolverBTNActionPerformed(evt);
            }
        });

        TablaConsulta2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "idusario", "contrasena", "nombre", "apellido", "fechanacimiento", "calle", "pais", "ciudad", "correoelectronico", "roles_idrol", "fechapedido", "razonsocial"
            }
        ));
        jScrollPane1.setViewportView(TablaConsulta2);

        ConsultarBTN.setBackground(new java.awt.Color(51, 153, 0));
        ConsultarBTN.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        ConsultarBTN.setForeground(new java.awt.Color(255, 255, 255));
        ConsultarBTN.setText("Consultar");
        ConsultarBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsultarBTNActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Dado un ID de Cliente, Mostrar toda su informacion");

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Ingrese Id Cliente");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(VolverBTN)
                .addGap(466, 466, 466))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(231, 231, 231)
                        .addComponent(jLabel2)
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ConsultarBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(IdClienteTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(279, 279, 279)
                        .addComponent(jLabel1)))
                .addContainerGap(306, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(IdClienteTXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(ConsultarBTN)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(127, 127, 127)
                .addComponent(VolverBTN)
                .addGap(77, 77, 77))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    Conexion con = new Conexion();
    
    private void VolverBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolverBTNActionPerformed
        ClientesMenu cm = new ClientesMenu();
        cm.setVisible(true);
        cm.pack();
        cm.setLocationRelativeTo(null);
        cm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_VolverBTNActionPerformed

    private void ConsultarBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsultarBTNActionPerformed
       con.ConectarmeV2();
       PreparedStatement pst;
       ResultSet rst = null;
       
       String IdCliente = IdClienteTXT.getText();
       
       String consulta = "SELECT *\n" +
        "FROM public.usuarios u INNER JOIN public.cliente c on u.idusuario = c.usuarios_idusuario\n" +
        "WHERE u.idusuario = " + IdCliente;
       
       
        DefaultTableModel dftable = (DefaultTableModel) TablaConsulta2.getModel();
                 
            int cantfila = TablaConsulta2.getRowCount();
            for(int i = cantfila - 1; i>=0; i--){
               dftable.removeRow(i);
            }
            
             try{
                pst = con.conexion.prepareStatement(consulta);
                rst = pst.executeQuery();
                
                while(rst.next()){
                    int Id = rst.getInt("idusuario");
                    String Contrasena = rst.getString("contrasena");
                    String Nombre = rst.getString("nombre");
                    String Apellido = rst.getString("apellido");
                    String FechaNacimiento = rst.getString("fechanacimiento");
                    String Calle = rst.getString("calle");
                    String Pais = rst.getString("pais");
                    String Ciudad = rst.getString("ciudad");
                    String Correo = rst.getString("correoelectronico");
                    String IdRol = rst.getString("roles_idrol");
                    String FechaPedido = rst.getString("fechapedido");
                    String RazonSocial = rst.getString("razonsocial");
                  
                    Object[] obj = {Id, Contrasena, Nombre, Apellido, FechaNacimiento, Calle, Pais, Ciudad, Correo, IdRol, FechaPedido,RazonSocial};
                    dftable.addRow(obj);
                            
                }
                
            }catch(SQLException ex){
                JOptionPane.showMessageDialog(null, ex);
            }
       
       
       
       
       
    }//GEN-LAST:event_ConsultarBTNActionPerformed

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
            java.util.logging.Logger.getLogger(Consulta2_Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Consulta2_Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Consulta2_Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Consulta2_Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Consulta2_Clientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ConsultarBTN;
    private javax.swing.JTextField IdClienteTXT;
    private javax.swing.JTable TablaConsulta2;
    private javax.swing.JButton VolverBTN;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}