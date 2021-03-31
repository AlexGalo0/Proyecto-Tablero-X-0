
package Ventanas;


public class VentanasIntegrantesyAño extends javax.swing.JFrame {

   
    public VentanasIntegrantesyAño(boolean modal) {    
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Creador1 = new javax.swing.JLabel();
        Creador2 = new javax.swing.JLabel();
        Clase = new javax.swing.JLabel();
        Titulo = new javax.swing.JLabel();
        Año = new javax.swing.JLabel();
        botonCerrar = new javax.swing.JButton();
        botonSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        Creador1.setFont(new java.awt.Font("Arial", 0, 30)); // NOI18N
        Creador1.setText("Alex Galo Soto");

        Creador2.setFont(new java.awt.Font("Arial", 0, 30)); // NOI18N
        Creador2.setText("Jackeline Padilla");

        Clase.setFont(new java.awt.Font("Arial", 0, 30)); // NOI18N
        Clase.setText("   Programación II");

        Titulo.setFont(new java.awt.Font("Arial", 0, 48)); // NOI18N
        Titulo.setText("Tablero X-0");

        Año.setFont(new java.awt.Font("Arial", 0, 30)); // NOI18N
        Año.setText("Año: 2020");

        botonCerrar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        botonCerrar.setText("Cerrar");
        botonCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCerrarActionPerformed(evt);
            }
        });

        botonSalir.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        botonSalir.setText("Salir");
        botonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 234, Short.MAX_VALUE)
                        .addComponent(Titulo)
                        .addGap(225, 225, 225))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Creador1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Clase, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(Creador2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Año)
                        .addGap(50, 50, 50))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addComponent(botonCerrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(175, 175, 175))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Titulo)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Creador1)
                    .addComponent(Clase))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Creador2)
                    .addComponent(Año))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonCerrar)
                    .addComponent(botonSalir))
                .addGap(56, 56, 56))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCerrarActionPerformed
        dispose();
    }//GEN-LAST:event_botonCerrarActionPerformed

    private void botonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSalirActionPerformed
        VentanaSalir ventana2= new VentanaSalir (true);
        ventana2.setVisible(true);
    }//GEN-LAST:event_botonSalirActionPerformed

   
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Año;
    private javax.swing.JLabel Clase;
    private javax.swing.JLabel Creador1;
    private javax.swing.JLabel Creador2;
    private javax.swing.JLabel Titulo;
    private javax.swing.JButton botonCerrar;
    private javax.swing.JButton botonSalir;
    // End of variables declaration//GEN-END:variables
}
