
package Ventanas;

import java.io.Writer;
import javax.swing.table.DefaultTableModel;


public class VentanaMostrarResultados extends javax.swing.JDialog {
    
    private DefaultTableModel modeloTabla= new DefaultTableModel() ; 
    private String usuario1,usuario2 ; 
    private int vecesGano1,vecesGano2,vecesEmpate ; 

  
    public VentanaMostrarResultados(java.awt.Frame parent, boolean modal,String usuario1,String usuario2,int vecesGano1,int vecesGano2,int vecesEmpate ) {
        super(parent, modal);
       
        this.usuario1=usuario1 ; 
        this.usuario2=usuario2 ; 
        this.vecesGano1= vecesGano1 ; 
        this.vecesGano2= vecesGano2 ; 
        this.vecesEmpate= vecesEmpate ; 
                   
        cargarDatosTabla();
        initComponents();  
        setLocationRelativeTo(null) ; 
        
    }
    
    private void cargarDatosTabla() {
        modeloTabla.addColumn("Puntos de "+usuario1);
        modeloTabla.addColumn("Puntos de "+usuario2);
        modeloTabla.addColumn("Numero de Empates ");
        String[] fila= {String.valueOf(vecesGano1),String.valueOf(vecesGano2),String.valueOf(vecesEmpate)} ;
        modeloTabla.addRow(fila);
        
            }

    
     
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        botonRegresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jLabel1.setText("Tabla de Resultados");

        jTable2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jTable2.setModel(modeloTabla);
        jTable2.setRowHeight(20);
        jScrollPane2.setViewportView(jTable2);

        botonRegresar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        botonRegresar.setText("Regresar");
        botonRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(46, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botonRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(213, 213, 213))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addComponent(botonRegresar)
                .addGap(34, 34, 34))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegresarActionPerformed
        dispose();
    }//GEN-LAST:event_botonRegresarActionPerformed

 
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonRegresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    // End of variables declaration//GEN-END:variables

    private Writer String(int vecesGano1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
