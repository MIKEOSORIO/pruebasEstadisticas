
package tema2;

import javax.swing.JOptionPane;

public class frmPrincipal extends javax.swing.JFrame {

    public frmPrincipal() {
        initComponents();
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Opcion = new javax.swing.ButtonGroup();
        jMenu1 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenuErrores = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jmbiseccion = new javax.swing.JMenuItem();
        jmnewton = new javax.swing.JMenuItem();
        jmpuntofijo = new javax.swing.JMenuItem();
        jmsecante = new javax.swing.JMenuItem();

        jMenu1.setText("jMenu1");

        jMenu6.setText("jMenu6");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Métodos de solución de ecuaciones");

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));

        jLabel1.setBackground(new java.awt.Color(102, 0, 0));
        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Métodos Numericos ");

        jButton2.setText("Cancelar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(259, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2)
                .addGap(7, 7, 7))
        );

        jMenu3.setBackground(new java.awt.Color(0, 0, 255));
        jMenu3.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        jMenu3.setForeground(new java.awt.Color(204, 0, 204));
        jMenu3.setText("TEMA 1");
        jMenu3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jMenu3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu3ActionPerformed(evt);
            }
        });

        jMenuErrores.setText("Errores");
        jMenuErrores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuErroresActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuErrores);

        jMenuBar1.add(jMenu3);

        jMenu2.setForeground(new java.awt.Color(0, 51, 255));
        jMenu2.setText("TEMA 2");

        jmbiseccion.setText("M. Bisección");
        jmbiseccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmbiseccionActionPerformed(evt);
            }
        });
        jMenu2.add(jmbiseccion);

        jmnewton.setText("M.Newton");
        jmnewton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmnewtonActionPerformed(evt);
            }
        });
        jMenu2.add(jmnewton);

        jmpuntofijo.setText("M. Punto fijo");
        jmpuntofijo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmpuntofijoActionPerformed(evt);
            }
        });
        jMenu2.add(jmpuntofijo);

        jmsecante.setText("M. Secante");
        jmsecante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmsecanteActionPerformed(evt);
            }
        });
        jMenu2.add(jmsecante);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
       
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jmbiseccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmbiseccionActionPerformed
        // TODO add your handling code here:
        
        dlgBiseccion biseccion = 
        new dlgBiseccion(this,true);
        
        biseccion.setLocationRelativeTo(null);
        biseccion.setVisible(true);
    }//GEN-LAST:event_jmbiseccionActionPerformed

    private void jmnewtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmnewtonActionPerformed
        // TODO add your handling code here:
        dlgNewton n=new dlgNewton(this, true);
            n.setLocationRelativeTo(null);
        n.setVisible(true);
    }//GEN-LAST:event_jmnewtonActionPerformed

    private void jmpuntofijoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmpuntofijoActionPerformed
        // TODO add your handling code here:
        dlgPunto dig=new dlgPunto(this,true);
        dig.setLocationRelativeTo(null);
        dig.setVisible(true);
    }//GEN-LAST:event_jmpuntofijoActionPerformed

    private void jmsecanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmsecanteActionPerformed
        // TODO add your handling code here:
        dlgSecante s=new dlgSecante (this, true);
            s.setLocationRelativeTo(null);
            s.setVisible(true);
    }//GEN-LAST:event_jmsecanteActionPerformed

    private void jMenu3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu3ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jMenu3ActionPerformed

    private void jMenuErroresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuErroresActionPerformed
        // TODO add your handling code here:
        Ventana2 v2 = new Ventana2(this,true);
        v2.setVisible(true);
    }//GEN-LAST:event_jMenuErroresActionPerformed

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
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup Opcion;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuErrores;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenuItem jmbiseccion;
    private javax.swing.JMenuItem jmnewton;
    private javax.swing.JMenuItem jmpuntofijo;
    private javax.swing.JMenuItem jmsecante;
    // End of variables declaration//GEN-END:variables
}
