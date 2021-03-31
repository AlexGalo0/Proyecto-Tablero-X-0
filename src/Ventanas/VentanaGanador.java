
package Ventanas;


public class VentanaGanador extends javax.swing.JDialog{
    private String usuario ; 

    public VentanaGanador(java.awt.Frame parent, boolean modal,String usuario) {
       super(parent, modal);
        this.usuario=usuario ; 
        initComponents();
        setModal(false);
        setLocationRelativeTo(null);
       
        
    }

   
   
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        etiquetaFelicitaciones = new javax.swing.JLabel();
        botonJugarDeNuevo = new javax.swing.JButton();
        botonSalir = new javax.swing.JButton();
        etiquetaGanaste = new javax.swing.JLabel();
        etiquetaGanador = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        etiquetaFelicitaciones.setFont(new java.awt.Font("Arial Rounded MT Bold", 2, 30)); // NOI18N
        etiquetaFelicitaciones.setForeground(new java.awt.Color(204, 0, 0));
        etiquetaFelicitaciones.setText("FELICITACIONES");
        etiquetaFelicitaciones.setText("Felicitaciones "+usuario);
        jPanel2.add(etiquetaFelicitaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 420, -1));

        botonJugarDeNuevo.setText("Jugar de Nuevo");
        botonJugarDeNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonJugarDeNuevoActionPerformed(evt);
            }
        });
        jPanel2.add(botonJugarDeNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 130, -1, 30));

        botonSalir.setText("Salir");
        botonSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonSalirMouseClicked(evt);
            }
        });
        jPanel2.add(botonSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 180, 120, 30));

        etiquetaGanaste.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 1, 24)); // NOI18N
        etiquetaGanaste.setForeground(new java.awt.Color(255, 255, 255));
        etiquetaGanaste.setText("GANASTE!");
        jPanel2.add(etiquetaGanaste, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 166, 130, 50));

        etiquetaGanador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Ganador.gif"))); // NOI18N
        jPanel2.add(etiquetaGanador, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 428, 230));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonJugarDeNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonJugarDeNuevoActionPerformed
        dispose();
    }//GEN-LAST:event_botonJugarDeNuevoActionPerformed

    private void botonSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonSalirMouseClicked
        
        VentanaSalir ventana2= new VentanaSalir (true);
        ventana2.setVisible(true);
    }//GEN-LAST:event_botonSalirMouseClicked

  
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonJugarDeNuevo;
    private javax.swing.JButton botonSalir;
    private javax.swing.JLabel etiquetaFelicitaciones;
    private javax.swing.JLabel etiquetaGanador;
    private javax.swing.JLabel etiquetaGanaste;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
