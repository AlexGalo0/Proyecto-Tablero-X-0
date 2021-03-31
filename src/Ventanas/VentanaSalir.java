
package Ventanas;

public class VentanaSalir extends javax.swing.JDialog{

  
    public VentanaSalir(boolean modal) {   
        initComponents();   
        setModal(true);
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        botonSi = new javax.swing.JButton();
        botonNo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("¿Esta seguro de salir?");

        botonSi.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        botonSi.setText("Si");
        botonSi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonSiMouseClicked(evt);
            }
        });
        botonSi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSiActionPerformed(evt);
            }
        });

        botonNo.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        botonNo.setText("No");
        botonNo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonNoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(botonSi, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 133, Short.MAX_VALUE)
                .addComponent(botonNo, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(147, 147, 147))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonSi)
                    .addComponent(botonNo))
                .addGap(50, 50, 50))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonSiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonSiMouseClicked
     System.exit(0);
    }//GEN-LAST:event_botonSiMouseClicked

    private void botonNoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonNoMouseClicked
       dispose();
    }//GEN-LAST:event_botonNoMouseClicked

    private void botonSiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonSiActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonNo;
    public javax.swing.JButton botonSi;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
