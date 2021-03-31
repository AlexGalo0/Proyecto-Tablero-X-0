package Ventanas;

import Excepciones.*;


 
public class VentanaInicial extends javax.swing.JFrame {
    public static String turn= "";
    private String usuario1;
    private String usuario2;
    private boolean seraVisibleBotonGuardar = false;
    private boolean seraVisibleBotonComenzar = false;

    public VentanaInicial() throws ExcepcionDatoVacio, ExcepcionMismosNombres {

        initComponents();
        setLocationRelativeTo(null);

    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel = new javax.swing.JPanel();
        Titulo = new javax.swing.JLabel();
        etiquetaUsuario1 = new javax.swing.JLabel();
        etiquetaUsuario2 = new javax.swing.JLabel();
        CampodeTextoUsuario1 = new javax.swing.JTextField();
        CampodeTextoUsuario2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        botonGuardar = new javax.swing.JButton();
        etiquetaMuestra1 = new javax.swing.JLabel();
        etiquetaMuestra2 = new javax.swing.JLabel();
        botonComenzar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Titulo.setFont(new java.awt.Font("Arial", 0, 48)); // NOI18N
        Titulo.setForeground(new java.awt.Color(255, 255, 255));
        Titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titulo.setText("Bienvenido a X-0!");
        Titulo.setToolTipText("");
        Panel.add(Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 835, -1));

        etiquetaUsuario1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        etiquetaUsuario1.setForeground(new java.awt.Color(255, 255, 255));
        etiquetaUsuario1.setText("Ingrese el nombre del Primer Jugador: ");
        Panel.add(etiquetaUsuario1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, -1, 61));

        etiquetaUsuario2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        etiquetaUsuario2.setForeground(new java.awt.Color(255, 255, 255));
        etiquetaUsuario2.setText("Ingrese el nombre del Segundo Jugador: ");
        Panel.add(etiquetaUsuario2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, -1, -1));

        CampodeTextoUsuario1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        CampodeTextoUsuario1.setText("Jugador 1");
        CampodeTextoUsuario1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampodeTextoUsuario1ActionPerformed(evt);
            }
        });
        Panel.add(CampodeTextoUsuario1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 140, 426, 38));

        CampodeTextoUsuario2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        CampodeTextoUsuario2.setText("Jugador 2");
        Panel.add(CampodeTextoUsuario2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 210, 426, 41));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Tablero XO.gif"))); // NOI18N
        Panel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 330, -1, 210));

        botonGuardar.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        botonGuardar.setText("Guardar");
        botonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGuardarActionPerformed(evt);
            }
        });
        Panel.add(botonGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 350, -1, 43));

        etiquetaMuestra1.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        etiquetaMuestra1.setForeground(new java.awt.Color(255, 255, 255));
        Panel.add(etiquetaMuestra1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 260, 610, 42));

        etiquetaMuestra2.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        etiquetaMuestra2.setForeground(new java.awt.Color(255, 255, 255));
        Panel.add(etiquetaMuestra2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 300, 620, 42));

        botonComenzar.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        botonComenzar.setText("Comenzar Juego");
        botonComenzar.setVisible(false);
        botonComenzar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonComenzarActionPerformed(evt);
            }
        });
        Panel.add(botonComenzar, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 420, 259, 71));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        Panel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 970, 560));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGuardarActionPerformed

        try {
            botonGuardar.setVisible(true);

            usuario1 = CampodeTextoUsuario1.getText();
            if (usuario1.trim().isEmpty()) {

                throw new ExcepcionDatoVacio();

            } else {
                seraVisibleBotonGuardar = true;
                
            }

            usuario2 = CampodeTextoUsuario2.getText();
            if (usuario2.trim().isEmpty()) {
                CampodeTextoUsuario2.setEnabled(true);
                throw new ExcepcionDatoVacio();
            } else {
                seraVisibleBotonGuardar = true;
                

            }

            if (usuario1.equalsIgnoreCase(usuario2)) {
                CampodeTextoUsuario1.setEnabled(true);
                CampodeTextoUsuario2.setEnabled(true);
                seraVisibleBotonComenzar = false;
                throw new ExcepcionMismosNombres();
            } else {
                seraVisibleBotonComenzar = true;
            }

        } catch (ExcepcionDatoVacio e) {
            VentanaExcepcionNombreVacio ventana = new VentanaExcepcionNombreVacio(this, true);
            ventana.setLocationRelativeTo(null);
            ventana.setVisible(true);

        } catch (ExcepcionMismosNombres e) {
            VentanaExcepcionMismoNombre ventana = new VentanaExcepcionMismoNombre(this, true);
            ventana.setLocationRelativeTo(null);
            ventana.setVisible(true);
        }
        
         
      
         int aleatorio = (int) Math.floor(Math.random() * 2 + 1);
        if (seraVisibleBotonGuardar && seraVisibleBotonComenzar) {
            CampodeTextoUsuario1.setEnabled(false);
            CampodeTextoUsuario2.setEnabled(false);
            botonGuardar.setVisible(false);
            botonComenzar.setVisible(true);
           
   
        if (aleatorio == 1) {
            turn = "usuario1";
        etiquetaMuestra1.setText(usuario1 + ", jugara de primero, su ficha sera: X");
        etiquetaMuestra2.setText(usuario2 + ", jugara de segundo, su ficha sera: O");
        }else if(aleatorio == 2){
            turn = "usuario2";
        etiquetaMuestra1.setText(usuario2 + ", jugara de primero, su ficha sera: O");
        etiquetaMuestra2.setText(usuario1 + ", jugara de segundo, su ficha sera: X");

        }
        }


    }//GEN-LAST:event_botonGuardarActionPerformed


    private void botonComenzarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonComenzarActionPerformed
        VentanaPrincipal ventanaPrincipal = new VentanaPrincipal(usuario1, usuario2);
        ventanaPrincipal.setVisible(true);

        dispose();
    }//GEN-LAST:event_botonComenzarActionPerformed

    private void CampodeTextoUsuario1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampodeTextoUsuario1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampodeTextoUsuario1ActionPerformed

    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CampodeTextoUsuario1;
    private javax.swing.JTextField CampodeTextoUsuario2;
    private javax.swing.JPanel Panel;
    private javax.swing.JLabel Titulo;
    private javax.swing.JButton botonComenzar;
    private javax.swing.JButton botonGuardar;
    private javax.swing.JLabel etiquetaMuestra1;
    private javax.swing.JLabel etiquetaMuestra2;
    private javax.swing.JLabel etiquetaUsuario1;
    private javax.swing.JLabel etiquetaUsuario2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
