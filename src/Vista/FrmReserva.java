
package Vista;

import Controlador.Ctrl_CampoDeportivo;
import Controlador.Ctrl_Cliente;
import Formatos.Mensajes;
import Modelo.CampoDeportivo;
import Modelo.Cliente;
import conexion.Conexion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class FrmReserva extends javax.swing.JInternalFrame {
 Cliente cli = new Cliente();
     Ctrl_Cliente controlcli = new Ctrl_Cliente();
     
     
     CampoDeportivo cpd = new CampoDeportivo();
     Ctrl_CampoDeportivo controlcpd = new Ctrl_CampoDeportivo();
    public FrmReserva() {

        initComponents();
        this.setTitle("Nueva Reserva");
        CargarComboCampoDeportivo();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jButton_GUARDAR = new javax.swing.JButton();
        jPanel14 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        txt_cliente_buscar = new javax.swing.JTextField();
        jButton_busca_cliente = new javax.swing.JButton();
        jtxtTelefonoCliente = new javax.swing.JTextField();
        jtxtNombreCliente = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jtxtPrecioMinutoCampo = new javax.swing.JTextField();
        jtxtDescripcionCampo = new javax.swing.JTextField();
        cbxTipo1 = new javax.swing.JComboBox<>();
        cbxNombreCampo = new javax.swing.JComboBox<>();
        jtxtUbicacionCampo = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jtxtHF = new javax.swing.JTextField();
        jtxtDuracion = new javax.swing.JTextField();
        jtxtHI = new javax.swing.JTextField();
        jDateChooserReserva = new com.toedter.calendar.JDateChooser();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jPanel3.setBackground(new java.awt.Color(0, 51, 51));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("RESERVA");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 40, -1, -1));

        jPanel2.setBackground(new java.awt.Color(86, 66, 56));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton_GUARDAR.setBackground(new java.awt.Color(0, 51, 0));
        jButton_GUARDAR.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton_GUARDAR.setForeground(new java.awt.Color(255, 255, 255));
        jButton_GUARDAR.setText("GUARDAR");
        jButton_GUARDAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_GUARDARActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jButton_GUARDAR, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(jButton_GUARDAR, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        jPanel2.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, 280, 90));

        jPanel14.setBackground(new java.awt.Color(249, 225, 201));
        jPanel14.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Descuento:");
        jPanel14.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Iva:");
        jPanel14.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Total a pagar:");
        jPanel14.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Efectivo:");
        jPanel14.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("Cambio:");
        jPanel14.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, -1, -1));

        jTextField1.setBorder(javax.swing.BorderFactory.createTitledBorder("Descuento"));
        jPanel14.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, 180, 50));

        jTextField2.setBorder(javax.swing.BorderFactory.createTitledBorder("Subtotal"));
        jPanel14.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, 180, 50));

        jPanel2.add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 280, 350));

        jPanel3.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 110, 330, 500));

        jPanel1.setBackground(new java.awt.Color(169, 152, 119));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Datos Cliente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(242, 232, 208));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_cliente_buscar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txt_cliente_buscar.setBorder(javax.swing.BorderFactory.createTitledBorder("DNI"));
        jPanel4.add(txt_cliente_buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 190, 60));

        jButton_busca_cliente.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton_busca_cliente.setText("Buscar");
        jButton_busca_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_busca_clienteActionPerformed(evt);
            }
        });
        jPanel4.add(jButton_busca_cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 170, 40));

        jtxtTelefonoCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Teléfono"));
        jPanel4.add(jtxtTelefonoCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 190, 60));

        jtxtNombreCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Nombre"));
        jPanel4.add(jtxtNombreCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 190, 60));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 230, 450));

        jPanel3.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 250, 500));

        jPanel7.setBackground(new java.awt.Color(169, 152, 119));
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Datos Campo Deportivo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel8.setBackground(new java.awt.Color(238, 232, 209));
        jPanel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtxtPrecioMinutoCampo.setBorder(javax.swing.BorderFactory.createTitledBorder("Precio por Minuto"));
        jPanel8.add(jtxtPrecioMinutoCampo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 210, 60));

        jtxtDescripcionCampo.setBorder(javax.swing.BorderFactory.createTitledBorder("Descripción"));
        jPanel8.add(jtxtDescripcionCampo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 210, 60));

        cbxTipo1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Seleccion-", "Futbol", "Voley", "Básquet" }));
        cbxTipo1.setBorder(javax.swing.BorderFactory.createTitledBorder("Tipo de Campo"));
        jPanel8.add(cbxTipo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, 210, 60));

        cbxNombreCampo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Seleccione-", "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbxNombreCampo.setBorder(javax.swing.BorderFactory.createTitledBorder("Nombre"));
        cbxNombreCampo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxNombreCampoItemStateChanged(evt);
            }
        });
        cbxNombreCampo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxNombreCampoActionPerformed(evt);
            }
        });
        jPanel8.add(cbxNombreCampo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 210, 70));

        jtxtUbicacionCampo.setBorder(javax.swing.BorderFactory.createTitledBorder("Ubicacion"));
        jPanel8.add(jtxtUbicacionCampo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 210, 60));

        jPanel7.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 270, 440));

        jPanel3.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 110, 290, 500));

        jPanel5.setBackground(new java.awt.Color(169, 152, 119));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Datos de Reserva");
        jPanel5.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 136, -1));

        jPanel6.setBackground(new java.awt.Color(238, 232, 209));
        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtxtHF.setBorder(javax.swing.BorderFactory.createTitledBorder("Hora Fin"));
        jPanel6.add(jtxtHF, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 220, 60));

        jtxtDuracion.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jtxtDuracion.setBorder(javax.swing.BorderFactory.createTitledBorder("Duración"));
        jPanel6.add(jtxtDuracion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 220, 60));

        jtxtHI.setBorder(javax.swing.BorderFactory.createTitledBorder("Hora Inicio"));
        jPanel6.add(jtxtHI, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 220, 60));

        jDateChooserReserva.setBorder(javax.swing.BorderFactory.createTitledBorder("Fecha"));
        jDateChooserReserva.setDateFormatString("yyyy/MM/dd");
        jPanel6.add(jDateChooserReserva, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 220, 90));

        jPanel5.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 260, 440));

        jPanel3.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 110, 280, 500));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 1284, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 640, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_GUARDARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_GUARDARActionPerformed
  
    }//GEN-LAST:event_jButton_GUARDARActionPerformed

    private void jButton_busca_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_busca_clienteActionPerformed
        
        int DNI =Integer.parseInt(txt_cliente_buscar.getText().trim());
        cli=controlcli.ConsultarRegistro(DNI);
        jtxtNombreCliente.setText(cli.getNombre());
        jtxtTelefonoCliente.setText(cli.getTelefono());
      
    }//GEN-LAST:event_jButton_busca_clienteActionPerformed

    private void cbxNombreCampoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxNombreCampoActionPerformed
     
        String nombre = (String) cbxNombreCampo.getSelectedItem();
        cpd=controlcpd.ConsultarCampoReserva(nombre);
        if(cbxNombreCampo.getSelectedItem()=="---Seleccione el campo---"){
        jtxtUbicacionCampo.setText("");
        jtxtDescripcionCampo.setText("");
        jtxtPrecioMinutoCampo.setText("");
        }else if (cbxNombreCampo.getSelectedIndex()>-1){
       
        jtxtUbicacionCampo.setText(cpd.getUbicacion());
        jtxtDescripcionCampo.setText(cpd.getDescripcion());
        jtxtPrecioMinutoCampo.setText(String.valueOf(cpd.getPrecioMinuto()));
        }
        
        

    }//GEN-LAST:event_cbxNombreCampoActionPerformed

    private void cbxNombreCampoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxNombreCampoItemStateChanged
    }//GEN-LAST:event_cbxNombreCampoItemStateChanged

    
    
 private void CargarComboCampoDeportivo  () {
        Connection cn = Conexion.conectar();
        String sql = "select nombre from campo_deportivo where indicador='S';";
        Statement st;
        try {
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            cbxNombreCampo.removeAllItems();
            cbxNombreCampo.addItem("---Seleccione el campo---");
            while (rs.next()) {
                cbxNombreCampo.addItem(rs.getString("nombre"));
            }
            cn.close();
        } catch (SQLException e) {
            System.out.println("¡Error al cargar campos, !" + e);
        }
    }
    
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JComboBox<String> cbxNombreCampo;
    public javax.swing.JComboBox<String> cbxTipo1;
    private javax.swing.JButton jButton_GUARDAR;
    public javax.swing.JButton jButton_busca_cliente;
    private com.toedter.calendar.JDateChooser jDateChooserReserva;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    public javax.swing.JTextField jtxtDescripcionCampo;
    public javax.swing.JTextField jtxtDuracion;
    public javax.swing.JTextField jtxtHF;
    public javax.swing.JTextField jtxtHI;
    public javax.swing.JTextField jtxtNombreCliente;
    public javax.swing.JTextField jtxtPrecioMinutoCampo;
    public javax.swing.JTextField jtxtTelefonoCliente;
    public javax.swing.JTextField jtxtUbicacionCampo;
    public javax.swing.JTextField txt_cliente_buscar;
    // End of variables declaration//GEN-END:variables


  


 
   
}