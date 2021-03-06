/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoconexion;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;





/**
 *
 * @author leoth
 */
public class ClientesMenu extends javax.swing.JFrame {

    /**
     * Creates new form ClientesMenu
     */
    public ClientesMenu() {
        initComponents();
        this.setLocationRelativeTo(null);
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
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        Consulta1BTN = new javax.swing.JButton();
        Consulta2BTN = new javax.swing.JButton();
        Consultar3BTN = new javax.swing.JButton();
        Consulta4BTN = new javax.swing.JButton();
        Consulta5BTN = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        RazonSocialTXT = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        FechaPedidoTXT = new javax.swing.JTextField();
        VolverBTN = new javax.swing.JButton();
        Actualizar = new javax.swing.JButton();
        IdComboBox = new javax.swing.JComboBox<>();
        RegistrarClienteBTN = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(220, 214, 155));

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Menu Clientes");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(382, 382, 382))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel1)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(0, 0, 204));

        Consulta1BTN.setBackground(new java.awt.Color(255, 255, 255));
        Consulta1BTN.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        Consulta1BTN.setText("Consulta 1");
        Consulta1BTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Consulta1BTNActionPerformed(evt);
            }
        });

        Consulta2BTN.setBackground(new java.awt.Color(255, 255, 255));
        Consulta2BTN.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        Consulta2BTN.setText("Consulta 2");
        Consulta2BTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Consulta2BTNActionPerformed(evt);
            }
        });

        Consultar3BTN.setBackground(new java.awt.Color(255, 255, 255));
        Consultar3BTN.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        Consultar3BTN.setText("Consulta 3");
        Consultar3BTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Consultar3BTNActionPerformed(evt);
            }
        });

        Consulta4BTN.setBackground(new java.awt.Color(255, 255, 255));
        Consulta4BTN.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        Consulta4BTN.setText("Consulta 4");
        Consulta4BTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Consulta4BTNActionPerformed(evt);
            }
        });

        Consulta5BTN.setBackground(new java.awt.Color(255, 255, 255));
        Consulta5BTN.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        Consulta5BTN.setText("Consulta 5");
        Consulta5BTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Consulta5BTNActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Id Usuario");

        jLabel3.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Razon Social");

        jLabel4.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Fecha Pedido");

        FechaPedidoTXT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FechaPedidoTXTActionPerformed(evt);
            }
        });

        VolverBTN.setBackground(new java.awt.Color(255, 51, 51));
        VolverBTN.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        VolverBTN.setForeground(new java.awt.Color(255, 255, 255));
        VolverBTN.setText("Volver");
        VolverBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VolverBTNActionPerformed(evt);
            }
        });

        Actualizar.setText("Actualizar");
        Actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActualizarActionPerformed(evt);
            }
        });

        RegistrarClienteBTN.setBackground(new java.awt.Color(51, 204, 0));
        RegistrarClienteBTN.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        RegistrarClienteBTN.setForeground(new java.awt.Color(255, 255, 255));
        RegistrarClienteBTN.setText("Registrar Cliente");
        RegistrarClienteBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistrarClienteBTNActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Formato de fecha");

        jLabel6.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("YYYY-MM-DD");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(509, 509, 509)
                        .addComponent(VolverBTN))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(249, 249, 249)
                        .addComponent(Actualizar))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(100, 100, 100)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(IdComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel5))
                                        .addGap(92, 92, 92)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(RazonSocialTXT, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
                                            .addComponent(FechaPedidoTXT)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(17, 17, 17)
                                                .addComponent(jLabel6))))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(204, 204, 204)
                                .addComponent(RegistrarClienteBTN)))
                        .addGap(353, 353, 353)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Consulta5BTN)
                            .addComponent(Consulta2BTN)
                            .addComponent(Consulta1BTN)
                            .addComponent(Consultar3BTN)
                            .addComponent(Consulta4BTN))))
                .addContainerGap(238, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addComponent(Consulta1BTN)
                        .addGap(68, 68, 68)
                        .addComponent(Consulta2BTN)
                        .addGap(70, 70, 70)
                        .addComponent(Consultar3BTN)
                        .addGap(15, 15, 15))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(Actualizar)
                        .addGap(71, 71, 71)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(IdComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2))
                                .addGap(41, 41, 41)
                                .addComponent(RazonSocialTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(28, 28, 28)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(FechaPedidoTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addComponent(Consulta4BTN)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(Consulta5BTN))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(RegistrarClienteBTN)))
                .addGap(117, 117, 117)
                .addComponent(VolverBTN)
                .addContainerGap(76, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

 
  Conexion con = new Conexion();
  
  public void llenarComboBox(){
    PreparedStatement pst = null;
    ResultSet rst = null;
    
    String busquedaCombo = "SELECT idusuario FROM usuarios";
   
        try{
            
            pst = con.conexion.prepareStatement(busquedaCombo);
            rst = pst.executeQuery();
            
            while(rst.next()){
                String idusuarioStr = rst.getString("idusuario");
                IdComboBox.addItem(idusuarioStr);
            }
            
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        } 
  }
  
  
    
    private void VolverBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolverBTNActionPerformed
        
         MenuPrincipal menu = new MenuPrincipal();
            menu.setVisible(true);
            menu.pack();
            menu.setLocationRelativeTo(null);
            menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.dispose();
    }//GEN-LAST:event_VolverBTNActionPerformed

    private void ActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ActualizarActionPerformed
        con.ConectarmeV2();
        llenarComboBox();
    }//GEN-LAST:event_ActualizarActionPerformed

    private void FechaPedidoTXTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FechaPedidoTXTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FechaPedidoTXTActionPerformed

    private void RegistrarClienteBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrarClienteBTNActionPerformed
       
        con.ConectarmeV2();
        String IdUsuario = IdComboBox.getSelectedItem().toString();
        
        con.Ingreso(String.format("INSERT INTO cliente VALUES('%s','%s',%d);"+"",(this.FechaPedidoTXT.getText()),(this.RazonSocialTXT.getText()),(Integer.parseInt(IdUsuario))));
        
        this.FechaPedidoTXT.setText(" ");
        this.RazonSocialTXT.setText(" ");
        
        //JOptionPane.showMessageDialog(null, "Cliente Ingresado Correctamente!");

        
    }//GEN-LAST:event_RegistrarClienteBTNActionPerformed

    private void Consulta1BTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Consulta1BTNActionPerformed
        con.ConectarmeV2();
        
        Consulta1_Clientes c1 = new Consulta1_Clientes();
        c1.setVisible(true);
        c1.pack();
        c1.setLocationRelativeTo(null);
        c1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
        
        
        
    PreparedStatement pst;
    ResultSet rst = null;
    
    String consulta = "SELECT *\n" +
"FROM public.usuarios u INNER JOIN public.cliente c on u.idusuario = c.usuarios_idusuario";
    
  
    
     DefaultTableModel dftable = (DefaultTableModel) c1.TablaConsulta1.getModel();
           
           int cantfila = c1.TablaConsulta1.getRowCount();
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
          
           
           Object[] obj ={Id, Contrasena, Nombre, Apellido, FechaNacimiento, Calle, Pais, Ciudad, Correo, IdRol, FechaPedido, RazonSocial};
           dftable.addRow(obj);
       }
    
    }catch(SQLException ex){
        JOptionPane.showMessageDialog(null, ex);
    }
        
    }//GEN-LAST:event_Consulta1BTNActionPerformed

    private void Consulta2BTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Consulta2BTNActionPerformed
        Consulta2_Clientes consu2 = new Consulta2_Clientes();
        consu2.setVisible(true);
        consu2.pack();
        consu2.setLocationRelativeTo(null);
        consu2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
        
    }//GEN-LAST:event_Consulta2BTNActionPerformed

    private void Consultar3BTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Consultar3BTNActionPerformed
        con.ConectarmeV2();
        Consulta3_Clientes c3 = new Consulta3_Clientes();
        c3.setVisible(true);
        c3.pack();
        c3.setLocationRelativeTo(null);
        c3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
        
        
         PreparedStatement pst;
         ResultSet rst = null;
    
    String consulta = "SELECT * \n" +
    "FROM public.solicitudes s INNER JOIN public.cliente c on c.usuarios_idusuario = s.cliente_idusuario \n" +
    "WHERE s.estadosolicitud = 'Proceso'";
    
  
    
     DefaultTableModel tablita = (DefaultTableModel) c3.TablaConsulta3.getModel();
           
           int cantfila = c3.TablaConsulta3.getRowCount();
           for(int i = cantfila - 1; i>=0; i--){
               tablita.removeRow(i);
           }
           
           try{
                pst = con.conexion.prepareStatement(consulta);
                rst = pst.executeQuery();
       
       while(rst.next()){
           
            String IdSolicitud = rst.getString("idsolicitud");
            int Presupuesto = rst.getInt("presupuesto");
            String EstadoSolicitud = rst.getString("estadosolicitud");
            int IdCliente = rst.getInt("cliente_idusuario");
            int IdProyecto = rst.getInt("ps_proyectosoftware_id");
            String FechaPedido = rst.getString("fechapedido");
            String Razonsocial = rst.getString("razonsocial");
            
           Object[] obj ={IdSolicitud, Presupuesto, EstadoSolicitud, IdCliente, IdProyecto, FechaPedido, Razonsocial};
           tablita.addRow(obj);
       }
    
    }catch(SQLException ex){
        JOptionPane.showMessageDialog(null, ex);
    }
           
           
           
        
        
    }//GEN-LAST:event_Consultar3BTNActionPerformed

    private void Consulta4BTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Consulta4BTNActionPerformed
        con.ConectarmeV2();
        
        Consulta4_Clientes c4 = new Consulta4_Clientes();
        c4.setVisible(true);
        c4.pack();
        c4.setLocationRelativeTo(null);
        c4.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
        
        
        PreparedStatement pst;
        ResultSet rst = null;
    
    String consulta = "SELECT u.idusuario,u.nombre, u.pais,u.ciudad\n" +
    "FROM public.cliente c INNER JOIN public.solicitudes s on c.usuarios_idusuario = s.cliente_idusuario\n" +
    "INNER JOIN public.proyectosoftware p on s.ps_proyectosoftware_id = p.proyectosoftware_id \n" +
    "INNER JOIN public.usuarios u on u.idusuario = c.usuarios_idusuario\n" +
    "WHERE p.estadoproyecto = 'On Track'";
   
     DefaultTableModel tablita4 = (DefaultTableModel) c4.TablaConsulta4.getModel();
     
     int cantfila = c4.TablaConsulta4.getRowCount();
           for(int i = cantfila - 1; i>=0; i--){
               tablita4.removeRow(i);
           }
           
           try{
                pst = con.conexion.prepareStatement(consulta);
                rst = pst.executeQuery();
       
       while(rst.next()){
           
            int IdSolicitud = rst.getInt("idusuario");
            String Nombre = rst.getString("nombre");
            String Pais = rst.getString("pais");
            String Ciudad = rst.getString("ciudad");
           
           Object[] obj ={IdSolicitud, Nombre, Pais, Ciudad};
           tablita4.addRow(obj);
       }
    
    }catch(SQLException ex){
        JOptionPane.showMessageDialog(null, ex);
    }
    }//GEN-LAST:event_Consulta4BTNActionPerformed

    
    private void Consulta5BTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Consulta5BTNActionPerformed
        con.ConectarmeV2();
        Consulta5_Clientes c5 = new Consulta5_Clientes();
        c5.setVisible(true);
        c5.pack();
        c5.setLocationRelativeTo(null);
        c5.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
        
        PreparedStatement pst;
        ResultSet rst = null;
        
        String consulta = "SELECT c.usuarios_idusuario , count(*) as cantidad\n" +
    "FROM public.cliente c INNER JOIN public.solicitudes s on c.usuarios_idusuario = s.cliente_idusuario\n" +
    "INNER JOIN public.proyectosoftware p on s.ps_proyectosoftware_id = p.proyectosoftware_id \n" +
    "GROUP BY  c.usuarios_idusuario";
   
     DefaultTableModel tablita5 = (DefaultTableModel) c5.TablaConsulta5.getModel();
     
     int cantfila = c5.TablaConsulta5.getRowCount();
           for(int i = cantfila - 1; i>=0; i--){
               tablita5.removeRow(i);
           }
           
           try{
                pst = con.conexion.prepareStatement(consulta);
                rst = pst.executeQuery();
       
       while(rst.next()){
           
            int IdUsuarios = rst.getInt("usuarios_idusuario");
            int Cant = rst.getInt("cantidad");
           
           Object[] obj ={IdUsuarios, Cant};
           tablita5.addRow(obj);
       }
    
    }catch(SQLException ex){
        JOptionPane.showMessageDialog(null, ex);
    }
        
    }//GEN-LAST:event_Consulta5BTNActionPerformed

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
            java.util.logging.Logger.getLogger(ClientesMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClientesMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClientesMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClientesMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClientesMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Actualizar;
    private javax.swing.JButton Consulta1BTN;
    private javax.swing.JButton Consulta2BTN;
    private javax.swing.JButton Consulta4BTN;
    private javax.swing.JButton Consulta5BTN;
    private javax.swing.JButton Consultar3BTN;
    private javax.swing.JTextField FechaPedidoTXT;
    private javax.swing.JComboBox<String> IdComboBox;
    private javax.swing.JTextField RazonSocialTXT;
    private javax.swing.JButton RegistrarClienteBTN;
    private javax.swing.JButton VolverBTN;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
