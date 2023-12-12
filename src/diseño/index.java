package diseño;

import java.awt.BorderLayout;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelo.Facturas;
import modelo.FacturasDAO;
import logeo.Logeo;

public class index extends javax.swing.JFrame {

    FacturasDAO fd = new FacturasDAO();
    DefaultTableModel modelo = new DefaultTableModel();
    Facturas factura = new Facturas();

    public index() {
        initComponents();
        try {
            llenarjtable(tablaventas);
        } catch (Exception ex) {
            Logger.getLogger(index.class.getName()).log(Level.SEVERE, null, ex);
        }

        //permite ajustar la imagen de tamaño para que corresponda con el label
        rsscalelabel.RSScaleLabel.setScaleLabel(btajuste, "src/images/ajuste.png");
        rsscalelabel.RSScaleLabel.setScaleLabel(btmenu, "src/images/menu.png");
        rsscalelabel.RSScaleLabel.setScaleLabel(btcampana, "src/images/campana.png");
        rsscalelabel.RSScaleLabel.setScaleLabel(btexit, "src/images/exit.png");

    }

    public void llenarjtable(JTable fact) throws Exception {
        try{
        ArrayList<Object> nombre = new ArrayList<>();
        nombre.removeAll(nombre);
        nombre.add("N° Venta");
        nombre.add("Fecha");
        nombre.add("Monto");

        for (Object columna : nombre) {
            modelo.addColumn(columna);
        }

        for (Facturas valores : fd.listar()) {
            modelo.addRow(new Object[]{valores.getId(), valores.getFecha(), valores.getMonto()});
        }
        fact.setModel(modelo);
        }catch(Exception e){
            System.out.println("Ocurrio un error"+ e.getMessage());
        }
        }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        secmainmenu = new javax.swing.JPanel();
        btgenerarventa = new javax.swing.JLabel();
        bthome = new javax.swing.JLabel();
        btinventario = new javax.swing.JLabel();
        btventas = new javax.swing.JLabel();
        fotter = new javax.swing.JPanel();
        btajuste = new javax.swing.JLabel();
        contenidoh = new javax.swing.JPanel();
        fondopng = new javax.swing.JLabel();
        lbventas = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaventas = new javax.swing.JTable();
        header = new javax.swing.JPanel();
        lbltitulo = new javax.swing.JLabel();
        btmenu = new javax.swing.JLabel();
        btexit = new javax.swing.JLabel();
        btcampana = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1390, 750));
        setMinimumSize(new java.awt.Dimension(1390, 750));
        setResizable(false);

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setMaximumSize(new java.awt.Dimension(1390, 750));
        bg.setMinimumSize(new java.awt.Dimension(1390, 750));
        bg.setPreferredSize(new java.awt.Dimension(1390, 750));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        secmainmenu.setBackground(new java.awt.Color(224, 224, 224));
        secmainmenu.setDoubleBuffered(false);
        secmainmenu.setEnabled(false);
        secmainmenu.setMaximumSize(new java.awt.Dimension(290, 750));
        secmainmenu.setMinimumSize(new java.awt.Dimension(290, 750));
        secmainmenu.setPreferredSize(new java.awt.Dimension(299, 750));

        btgenerarventa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btgenerarventa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/generarventa.png"))); // NOI18N
        btgenerarventa.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btgenerarventa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btgenerarventaMouseClicked(evt);
            }
        });

        bthome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bthome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/home.png"))); // NOI18N
        bthome.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bthome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bthomeMouseClicked(evt);
            }
        });

        btinventario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btinventario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/inventario.png"))); // NOI18N
        btinventario.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btinventario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btinventarioMouseClicked(evt);
            }
        });

        btventas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btventas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ventas.png"))); // NOI18N
        btventas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btventas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btventasMouseClicked(evt);
            }
        });

        fotter.setBackground(new java.awt.Color(171, 171, 171));

        btajuste.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btajuste.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ajuste.png"))); // NOI18N
        btajuste.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btajuste.setIconTextGap(0);
        btajuste.setMaximumSize(new java.awt.Dimension(100, 300));
        btajuste.setMinimumSize(new java.awt.Dimension(100, 512));
        btajuste.setPreferredSize(new java.awt.Dimension(100, 512));

        javax.swing.GroupLayout fotterLayout = new javax.swing.GroupLayout(fotter);
        fotter.setLayout(fotterLayout);
        fotterLayout.setHorizontalGroup(
            fotterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fotterLayout.createSequentialGroup()
                .addContainerGap(209, Short.MAX_VALUE)
                .addComponent(btajuste, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        fotterLayout.setVerticalGroup(
            fotterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fotterLayout.createSequentialGroup()
                .addComponent(btajuste, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout secmainmenuLayout = new javax.swing.GroupLayout(secmainmenu);
        secmainmenu.setLayout(secmainmenuLayout);
        secmainmenuLayout.setHorizontalGroup(
            secmainmenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, secmainmenuLayout.createSequentialGroup()
                .addGroup(secmainmenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, secmainmenuLayout.createSequentialGroup()
                        .addGroup(secmainmenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(secmainmenuLayout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(btgenerarventa))
                            .addGroup(secmainmenuLayout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addGroup(secmainmenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btinventario)
                                    .addComponent(bthome)
                                    .addComponent(btventas))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(secmainmenuLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(fotter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        secmainmenuLayout.setVerticalGroup(
            secmainmenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(secmainmenuLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(btgenerarventa)
                .addGap(26, 26, 26)
                .addComponent(bthome)
                .addGap(18, 18, 18)
                .addComponent(btinventario)
                .addGap(18, 18, 18)
                .addComponent(btventas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 387, Short.MAX_VALUE)
                .addComponent(fotter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        bg.add(secmainmenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 290, 770));

        contenidoh.setBackground(new java.awt.Color(255, 255, 255));
        contenidoh.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        contenidoh.setMaximumSize(new java.awt.Dimension(1100, 750));
        contenidoh.setMinimumSize(new java.awt.Dimension(1100, 750));

        fondopng.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fondo home.png"))); // NOI18N

        lbventas.setBackground(new java.awt.Color(0, 0, 0));
        lbventas.setFont(new java.awt.Font("Poppins Light", 1, 24)); // NOI18N
        lbventas.setForeground(new java.awt.Color(0, 0, 0));
        lbventas.setText("Ventas");

        tablaventas.setForeground(new java.awt.Color(0, 0, 0));
        tablaventas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "N° venta", "Fecha", "Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaventas);

        javax.swing.GroupLayout contenidohLayout = new javax.swing.GroupLayout(contenidoh);
        contenidoh.setLayout(contenidohLayout);
        contenidohLayout.setHorizontalGroup(
            contenidohLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenidohLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(fondopng))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenidohLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbventas)
                .addGap(500, 500, 500))
            .addGroup(contenidohLayout.createSequentialGroup()
                .addGap(136, 136, 136)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 793, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        contenidohLayout.setVerticalGroup(
            contenidohLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenidohLayout.createSequentialGroup()
                .addComponent(fondopng)
                .addGap(18, 18, 18)
                .addComponent(lbventas)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 107, Short.MAX_VALUE))
        );

        bg.add(contenidoh, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 50, 1100, 750));

        header.setBackground(new java.awt.Color(255, 255, 255));
        header.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                headerMouseClicked(evt);
            }
        });

        lbltitulo.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        lbltitulo.setForeground(new java.awt.Color(0, 0, 0));
        lbltitulo.setText("TuInventarioViewer");

        btmenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/menu.png"))); // NOI18N

        btexit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/exit.png"))); // NOI18N

        btcampana.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/campana.png"))); // NOI18N

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btmenu, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(415, 415, 415)
                .addComponent(lbltitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 263, Short.MAX_VALUE)
                .addComponent(btcampana, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77)
                .addComponent(btexit, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53))
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addComponent(lbltitulo)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(headerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btcampana, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btexit, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btmenu, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        bg.add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 0, 1100, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, 1390, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btgenerarventaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btgenerarventaMouseClicked
        generarVenta p1 = new generarVenta();
        MostrarPanel(p1);
    }//GEN-LAST:event_btgenerarventaMouseClicked

    private void btinventarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btinventarioMouseClicked
        inventario p2 = new inventario();
        MostrarPanel(p2);
    }//GEN-LAST:event_btinventarioMouseClicked

    private void bthomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bthomeMouseClicked

        index in = new index();
        in.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_bthomeMouseClicked

    private void btventasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btventasMouseClicked
        ventas p3 = new ventas();
        MostrarPanel(p3);
    }//GEN-LAST:event_btventasMouseClicked

    private void headerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMouseClicked
        Logeo log = new Logeo();
        log.setVisible(true);
        this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_headerMouseClicked

    private void MostrarPanel(JPanel p) {

        p.setSize(1100, 750);
        p.setLocation(0, 0);
        contenidoh.removeAll();
        contenidoh.add(p, BorderLayout.CENTER);
        contenidoh.revalidate();
        contenidoh.repaint();
    }

    void listartabla() {

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JLabel btajuste;
    private javax.swing.JLabel btcampana;
    private javax.swing.JLabel btexit;
    private javax.swing.JLabel btgenerarventa;
    private javax.swing.JLabel bthome;
    private javax.swing.JLabel btinventario;
    private javax.swing.JLabel btmenu;
    private javax.swing.JLabel btventas;
    private javax.swing.JPanel contenidoh;
    private javax.swing.JLabel fondopng;
    private javax.swing.JPanel fotter;
    private javax.swing.JPanel header;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbltitulo;
    private javax.swing.JLabel lbventas;
    private javax.swing.JPanel secmainmenu;
    private javax.swing.JTable tablaventas;
    // End of variables declaration//GEN-END:variables

}
