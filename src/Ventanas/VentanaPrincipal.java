package Ventanas;


/*     
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class VentanaPrincipal extends javax.swing.JFrame {

    String turno = VentanaInicial.turn;

    @SuppressWarnings("empty-statement")
   
   
    public void escribirFichero() throws IOException {
        PrintWriter pw =null;
       try {
           String fila= String.valueOf(vecesGano1);
           File ruta = new File("historial.txt");
           FileWriter fw = new FileWriter(ruta.getAbsoluteFile(), true);
           pw=new PrintWriter(fw);
           pw.println(usuario1+" " +usuario2 );
          pw.println(String.valueOf(vecesGano1)+"          " +String.valueOf(vecesGano2));
                } catch (FileNotFoundException Ex) {
                    Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, Ex);
                }finally{
           pw.close();
       }     

    }

    private boolean casilla[][] = new boolean[3][3];
    /*
    el private boolean casilla lo que hace es que inicializa todo el tablero en bool
    para lo que sirve es, que si la casilla esta en true, por ejemplo
    casilla [0][0]==true , entonces se pueda esscribir sobre ella, en este caso
    seria añadir la imagen, si casilla[0][0]==false, entonces no se podra escribir 
    o en este casi añadir la imagen.
     */

 /*
    Creamos el String turno= "usuario 1" para que se visualize que turno es, dado que si
    usuario1, dibuja x, si es usuario 2 dibuja 0, esto con los metodos dibujarX(); y
    dibujarO() ; 
     */
    private int matriz[][] = new int[3][3];

    /*
    Esta matriz lo que servira es para comprobar el ganador, haciendo una matriz de 
    3x3, la cual ayuda a verificar si hay un ganador por medio de que a cada usuario se le
    asigne un numero y se verifique si en las posicones que se encuentra cumplen las condiciones
    para que haya un ganador, para esto sirve el metodo comprobar(); y comprobarGanador();
  
     */
    private String usuario1;
    private String usuario2;
    private int vecesGano1 = 0, vecesGano2 = 0, vecesEmpate = 0;
     
    public VentanaPrincipal(String usuario1, String usuario2) {
        this.usuario1 = usuario1;
        this.usuario2 = usuario2;

        initComponents();
        setSize(700, 700); //Le damos el tamaño a la pantalla
        setLocationRelativeTo(null); //Hacemos que quede en el centro
        llenarCasillas(); //Hacemos que en todas las casillas se pueda jugar al principio
        //ya que si es true el JButton, se puede escribir sobre el.
        
    }

    private void llenarCasillas() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                casilla[i][j] = true;
            }
        }
    }

    public void llenarMatriz() { //Inicializamos la matriz en 0 , esto es para poder determinar el ganador
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = 0;
            }
        }
    }
       private void comprobarGanador() throws IOException {
        boolean ganador1 = false;
        boolean ganador2 = false;
        int casillasEmpate = 0;
        //Comprobar si el ganador es el usuario  1
        ganador1 = comprobar(1);
        //comprobar si el gnador es el usuario 2
        ganador2 = comprobar(2);

        if (ganador1 == true) {
            vecesGano1 = vecesGano1 + 2;
            VentanaGanador ventanaGanador = new VentanaGanador(this, true, usuario1);
            ventanaGanador.setVisible(true);
            escribirFichero();
            reiniciarJuego();

        } else {
            if (ganador2 == true) {
                vecesGano2 = vecesGano2 + 2;
                VentanaGanador ventanaGanador = new VentanaGanador(this, true, usuario2);
                ventanaGanador.setVisible(true);
                escribirFichero();
                reiniciarJuego();

                //Se busca comprobar empate
            } else { //Comprobar si el tableto esta lleno
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        if (matriz[i][j] != 0) {
                            casillasEmpate++;
                        }
                    }
                }
            }

            if (casillasEmpate == 9) { //Comprueba si la casilla esta llena en los 9 espacios
                vecesGano1++;
                vecesGano2++;

                VentanaEmpate ventanaEmpate = new VentanaEmpate(this, true);
                ventanaEmpate.setVisible(true);
                escribirFichero();
                reiniciarJuego();
               
            } else {
                casillasEmpate = 0;
            }

        }
    }

 

    private boolean comprobar(int num) throws IOException {
       boolean ganador = false;
        /*
        Comprueba cada uno de los casos posibles, 
        1)si las 3 filas tienen el mismo numero
        si las 3 columnas tienen el mismo numero
        las 2 diagonales
       
         */
        if (matriz[0][0] == num && matriz[0][1] == num && matriz[0][2] == num) {
            ganador = true;
        } else if (matriz[1][0] == num && matriz[1][1] == num && matriz[1][2] == num) {
            ganador = true;
        } else if (matriz[2][0] == num && matriz[2][1] == num && matriz[2][2] == num) {
            ganador = true;
        } else if (matriz[0][0] == num && matriz[1][0] == num && matriz[2][0] == num) {
            ganador = true;
        } else if (matriz[0][1] == num && matriz[1][1] == num && matriz[2][1] == num) {
            ganador = true;
        } else if (matriz[0][2] == num && matriz[1][2] == num && matriz[2][2] == num) {
            ganador = true;
        } else if (matriz[0][0] == num && matriz[1][0] == num && matriz[2][0] == num) {
            ganador = true;
        } else if (matriz[0][0] == num && matriz[1][1] == num && matriz[2][2] == num) {
            ganador = true;
        } else if (matriz[0][2] == num && matriz[1][1] == num && matriz[2][0] == num) {
            ganador = true;
        }
        if (ganador==true){
            
        

            
        }
                return ganador;
    }

    public void reiniciarJuego() {

        llenarCasillas();
        llenarMatriz();
        botonArribaIzquierda.setIcon(null);
        botonArribaCentro.setIcon(null);
        botonArribaDerecha.setIcon(null);
        botonCentroIzquierda.setIcon(null);
        botonCentro.setIcon(null);
        botonCentroDerecha.setIcon(null);
        botonAbajoIzquierda.setIcon(null);
        botonAbajoCentro.setIcon(null);
        botonAbajoDerecha.setIcon(null);

    }

    //Metodo para dibujar la X cuando se presione sobre el boton
    private void dibujarX(JButton boton) {
        boton.setIcon(new ImageIcon(getClass().getResource("/Imagenes/x.png")));
    }
    //Metodo para dibujar la O cuando se presione sobre el boton

    private void dibujarO(JButton boton) {
        boton.setIcon(new ImageIcon(getClass().getResource("/Imagenes/o.jpg")));
    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Panel = new javax.swing.JPanel();
        botonArribaIzquierda = new javax.swing.JButton();
        botonArribaCentro = new javax.swing.JButton();
        botonArribaDerecha = new javax.swing.JButton();
        botonCentroIzquierda = new javax.swing.JButton();
        botonCentro = new javax.swing.JButton();
        botonCentroDerecha = new javax.swing.JButton();
        botonAbajoIzquierda = new javax.swing.JButton();
        botonAbajoCentro = new javax.swing.JButton();
        botonAbajoDerecha = new javax.swing.JButton();
        BarraMenu = new javax.swing.JMenuBar();
        MenuJuego = new javax.swing.JMenu();
        ComenzarDeNuevo = new javax.swing.JMenuItem();
        MostrarResultados = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        Salir = new javax.swing.JMenuItem();
        menuAyuda = new javax.swing.JMenu();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Panel.setLayout(new java.awt.GridLayout(3, 3));

        botonArribaIzquierda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonArribaIzquierdaActionPerformed(evt);
            }
        });
        Panel.add(botonArribaIzquierda);

        botonArribaCentro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonArribaCentroActionPerformed(evt);
            }
        });
        Panel.add(botonArribaCentro);

        botonArribaDerecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonArribaDerechaActionPerformed(evt);
            }
        });
        Panel.add(botonArribaDerecha);

        botonCentroIzquierda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCentroIzquierdaActionPerformed(evt);
            }
        });
        Panel.add(botonCentroIzquierda);

        botonCentro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCentroActionPerformed(evt);
            }
        });
        Panel.add(botonCentro);

        botonCentroDerecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCentroDerechaActionPerformed(evt);
            }
        });
        Panel.add(botonCentroDerecha);

        botonAbajoIzquierda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAbajoIzquierdaActionPerformed(evt);
            }
        });
        Panel.add(botonAbajoIzquierda);

        botonAbajoCentro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAbajoCentroActionPerformed(evt);
            }
        });
        Panel.add(botonAbajoCentro);

        botonAbajoDerecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAbajoDerechaActionPerformed(evt);
            }
        });
        Panel.add(botonAbajoDerecha);

        MenuJuego.setText("Juego");
        MenuJuego.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N

        ComenzarDeNuevo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        ComenzarDeNuevo.setText("Comenzar de Nuevo");
        ComenzarDeNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComenzarDeNuevoActionPerformed(evt);
            }
        });
        MenuJuego.add(ComenzarDeNuevo);

        MostrarResultados.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        MostrarResultados.setText("Mostrar Tabla de Resultados");
        MostrarResultados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MostrarResultadosActionPerformed(evt);
            }
        });
        MenuJuego.add(MostrarResultados);
        MenuJuego.add(jSeparator1);

        Salir.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Salir.setText("Salir");
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });
        MenuJuego.add(Salir);

        BarraMenu.add(MenuJuego);

        menuAyuda.setText("Ayuda");
        menuAyuda.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        menuAyuda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuAyudaMouseClicked(evt);
            }
        });
        BarraMenu.add(menuAyuda);

        setJMenuBar(BarraMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel, javax.swing.GroupLayout.DEFAULT_SIZE, 453, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel, javax.swing.GroupLayout.DEFAULT_SIZE, 435, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ComenzarDeNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComenzarDeNuevoActionPerformed

        VentanaReiniciar ventana = new VentanaReiniciar(this);
        ventana.setVisible(true);


    }//GEN-LAST:event_ComenzarDeNuevoActionPerformed

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        VentanaSalir ventana = new VentanaSalir(true);
        ventana.setVisible(true);

    }//GEN-LAST:event_SalirActionPerformed

    private void botonArribaDerechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonArribaDerechaActionPerformed
        //Los comentarios de este metodo aplican para todos los botones del J
        if (casilla[0][2] == true) {//Verificamos si aun no se ha dado click sobre el boton
            if (turno.equals("usuario1")) {//Verificamos el turno 
                dibujarX(botonArribaDerecha);
                matriz[0][2] = 1;
                turno = "usuario2";
            } else {
                dibujarO(botonArribaDerecha);
                matriz[0][2] = 2;
                turno = "usuario1";
            }
            casilla[0][2] = false; //Esto se hace para que no se pueda sobreescribir 
            //el boton
            try {            
                comprobarGanador();   //Siempre al presionar un boton 
            } catch (IOException ex) {
                Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
             
        }
    }//GEN-LAST:event_botonArribaDerechaActionPerformed

    private void botonArribaIzquierdaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonArribaIzquierdaActionPerformed
        if (casilla[0][0] == true) {
            if (turno.equals("usuario1")) {
                dibujarX(botonArribaIzquierda);
                matriz[0][0] = 1;
                turno = "usuario 2";
            } else {
                dibujarO(botonArribaIzquierda);
                matriz[0][0] = 2;
                turno = "usuario1"; //Turno del Usuario 2
            }

            casilla[0][0] = false;
            try {
                comprobarGanador();
            } catch (IOException ex) {
                Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_botonArribaIzquierdaActionPerformed

    private void botonArribaCentroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonArribaCentroActionPerformed
        if (casilla[0][1] == true) {
            if (turno.equals("usuario1")) {
                dibujarX(botonArribaCentro);
                matriz[0][1] = 1;
                turno = "usuario2";
            } else {
                dibujarO(botonArribaCentro);
                matriz[0][1] = 2;
                turno = "usuario1";
            }
            casilla[0][1] = false;
            try {
                comprobarGanador();
            } catch (IOException ex) {
                Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }//GEN-LAST:event_botonArribaCentroActionPerformed

    private void botonCentroIzquierdaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCentroIzquierdaActionPerformed
        if (casilla[1][0] == true) {
            if (turno.equals("usuario1")) {
                dibujarX(botonCentroIzquierda);
                matriz[1][0] = 1;
                turno = "usuario2";
            } else {
                dibujarO(botonCentroIzquierda);
                matriz[1][0] = 2;
                turno = "usuario1";
            }
            casilla[1][0] = false;
            try {
                comprobarGanador();
            } catch (IOException ex) {
                Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_botonCentroIzquierdaActionPerformed

    private void botonCentroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCentroActionPerformed
        if (casilla[1][1] == true) {
            if (turno.equals("usuario1")) {
                dibujarX(botonCentro);
                matriz[1][1] = 1;
                turno = "usuario2";
            } else {
                dibujarO(botonCentro);
                matriz[1][1] = 2;
                turno = "usuario1";
            }
            casilla[1][1] = false;
            try {
                comprobarGanador();
            } catch (IOException ex) {
                Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_botonCentroActionPerformed

    private void botonCentroDerechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCentroDerechaActionPerformed
        if (casilla[1][2] == true) {
            if (turno.equals("usuario1")) {
                dibujarX(botonCentroDerecha);
                matriz[1][2] = 1;
                turno = "usuario2";
            } else {
                dibujarO(botonCentroDerecha);
                matriz[1][2] = 2;
                turno = "usuario1";
            }
            casilla[1][2] = false;
            try {
                comprobarGanador();
            } catch (IOException ex) {
                Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_botonCentroDerechaActionPerformed

    private void botonAbajoIzquierdaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAbajoIzquierdaActionPerformed
        if (casilla[2][0] == true) {
            if (turno.equals("usuario1")) {
                dibujarX(botonAbajoIzquierda);
                matriz[2][0] = 1;
                turno = "usuario2";
            } else {
                dibujarO(botonAbajoIzquierda);
                matriz[2][0] = 2;
                turno = "usuario1";
            }
            casilla[2][0] = false;
            try {
                comprobarGanador();
            } catch (IOException ex) {
                Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_botonAbajoIzquierdaActionPerformed

    private void botonAbajoCentroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAbajoCentroActionPerformed
        if (casilla[2][1] == true) {
            if (turno.equals("usuario1")) {
                dibujarX(botonAbajoCentro);
                matriz[2][1] = 1;
                turno = "usuario2";
            } else {
                dibujarO(botonAbajoCentro);
                matriz[2][1] = 2;
                turno = "usuario1";
            }
            casilla[2][1] = false;
            try {
                comprobarGanador();
            } catch (IOException ex) {
                Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_botonAbajoCentroActionPerformed

    private void botonAbajoDerechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAbajoDerechaActionPerformed
        if (casilla[2][2] == true) {
            if (turno.equals("usuario1")) {
                dibujarX(botonAbajoDerecha);
                matriz[2][2] = 1;
                turno = "usuario2";
            } else {
                dibujarO(botonAbajoDerecha);
                matriz[2][2] = 2;
                turno = "usuario1";
            }
            casilla[2][2] = false;
            try {
                comprobarGanador();
            } catch (IOException ex) {
                Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_botonAbajoDerechaActionPerformed

    private void MostrarResultadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MostrarResultadosActionPerformed
        VentanaMostrarResultados ventanaMR = new VentanaMostrarResultados(this, true, usuario1, usuario2, vecesGano1, vecesGano2, vecesEmpate);
        ventanaMR.setVisible(true);
    }//GEN-LAST:event_MostrarResultadosActionPerformed

    private void menuAyudaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuAyudaMouseClicked
        VentanasIntegrantesyAño ventanita = new VentanasIntegrantesyAño(true);
        ventanita.setVisible(true);
        ventanita.setLocationRelativeTo(null);
    }//GEN-LAST:event_menuAyudaMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar BarraMenu;
    private javax.swing.JMenuItem ComenzarDeNuevo;
    private javax.swing.JMenu MenuJuego;
    private javax.swing.JMenuItem MostrarResultados;
    private javax.swing.JPanel Panel;
    private javax.swing.JMenuItem Salir;
    private javax.swing.JButton botonAbajoCentro;
    private javax.swing.JButton botonAbajoDerecha;
    private javax.swing.JButton botonAbajoIzquierda;
    private javax.swing.JButton botonArribaCentro;
    private javax.swing.JButton botonArribaDerecha;
    private javax.swing.JButton botonArribaIzquierda;
    private javax.swing.JButton botonCentro;
    private javax.swing.JButton botonCentroDerecha;
    private javax.swing.JButton botonCentroIzquierda;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JMenu menuAyuda;
    // End of variables declaration//GEN-END:variables

