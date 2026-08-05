/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */


public class Restaurante extends javax.swing.JFrame {
   
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Restaurante.class.getName());
  
   
    public Restaurante() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        PLRestaurante = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        TXrestaurante = new javax.swing.JTextPane();
        PLadmin = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tx = new javax.swing.JTextPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        txusuarios = new javax.swing.JTextPane();
        jScrollPane4 = new javax.swing.JScrollPane();
        txRestaurante = new javax.swing.JTextPane();
        entrada = new javax.swing.JButton();
        jPasswordField1 = new javax.swing.JPasswordField();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PLRestaurante.setBackground(new java.awt.Color(0, 102, 102));

        TXrestaurante.setEditable(false);
        TXrestaurante.setBackground(new java.awt.Color(0, 102, 102));
        TXrestaurante.setBorder(null);
        TXrestaurante.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 48)); // NOI18N
        TXrestaurante.setText("Restaurante");
        jScrollPane3.setViewportView(TXrestaurante);

        tx.setFont(new java.awt.Font("Segoe UI", 2, 36)); // NOI18N
        tx.setText("Usuario");
        jScrollPane2.setViewportView(tx);

        jScrollPane1.setViewportView(txusuarios);

        txRestaurante.setEditable(false);
        txRestaurante.setFont(new java.awt.Font("Segoe UI", 2, 36)); // NOI18N
        txRestaurante.setText("Contraseña");
        txRestaurante.setToolTipText("");
        jScrollPane4.setViewportView(txRestaurante);

        entrada.setFont(new java.awt.Font("Segoe UI", 2, 36)); // NOI18N
        entrada.setText("entrada ");
        entrada.addActionListener(this::entradaActionPerformed);

        jPasswordField1.setText("jPasswordField1");
        jPasswordField1.addActionListener(this::jPasswordField1ActionPerformed);

        javax.swing.GroupLayout PLadminLayout = new javax.swing.GroupLayout(PLadmin);
        PLadmin.setLayout(PLadminLayout);
        PLadminLayout.setHorizontalGroup(
            PLadminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PLadminLayout.createSequentialGroup()
                .addGroup(PLadminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PLadminLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(PLadminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(PLadminLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(PLadminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(PLadminLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(entrada, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(79, Short.MAX_VALUE))
        );
        PLadminLayout.setVerticalGroup(
            PLadminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PLadminLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(entrada, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(83, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout PLRestauranteLayout = new javax.swing.GroupLayout(PLRestaurante);
        PLRestaurante.setLayout(PLRestauranteLayout);
        PLRestauranteLayout.setHorizontalGroup(
            PLRestauranteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PLRestauranteLayout.createSequentialGroup()
                .addGap(313, 313, 313)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(299, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PLRestauranteLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(PLadmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(252, 252, 252))
        );
        PLRestauranteLayout.setVerticalGroup(
            PLRestauranteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PLRestauranteLayout.createSequentialGroup()
                .addContainerGap(61, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(PLadmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(231, 231, 231))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PLRestaurante, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PLRestaurante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void entradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entradaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_entradaActionPerformed

    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField1ActionPerformed


    public static void main(String args[]) {
        
    
       
    
     
    }
   
  
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PLRestaurante;
    private javax.swing.JPanel PLadmin;
    private javax.swing.JTextPane TXrestaurante;
    private javax.swing.JButton entrada;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextPane tx;
    private javax.swing.JTextPane txRestaurante;
    private javax.swing.JTextPane txusuarios;
    // End of variables declaration//GEN-END:variables

    private static class Uusuarios {

        public Uusuarios() {
        }
    }
}
