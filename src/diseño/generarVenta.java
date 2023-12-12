
package diseño;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.*;


public class generarVenta extends javax.swing.JPanel {
FacturasDAO fdao= new FacturasDAO ();
ProductoDAO dao= new ProductoDAO ();
Producto p =new Producto();
Facturas f = new Facturas();
Detalle d =new Detalle ();
DefaultTableModel modelo = new DefaultTableModel();
double tpagar;
double precio;
int cant;
int idp;


    public generarVenta() {
        initComponents();
        Calendar calendar = new GregorianCalendar();
        tffecha.setText(""+calendar.get(Calendar.DAY_OF_MONTH)+"-"+(calendar.get(Calendar.MONTH)+1)+"-"+calendar.get(Calendar.YEAR));
   }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        linea = new javax.swing.JPanel();
        linea2 = new javax.swing.JPanel();
        lbfecha = new javax.swing.JLabel();
        tffecha = new javax.swing.JTextField();
        lbcodigo = new javax.swing.JLabel();
        tfcodigo = new javax.swing.JTextField();
        btregistrar = new javax.swing.JButton();
        linea3 = new javax.swing.JPanel();
        linea4 = new javax.swing.JPanel();
        btcancelar = new javax.swing.JButton();
        btgenerar = new javax.swing.JButton();
        lbtotal = new javax.swing.JLabel();
        tftotal = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaventa = new javax.swing.JTable();
        lbcantidad = new javax.swing.JLabel();
        lbventa2 = new javax.swing.JLabel();
        tfstock = new javax.swing.JTextField();
        opcioncantidad = new javax.swing.JSpinner();
        tfprecio = new javax.swing.JTextField();
        lbprecio = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(1100, 750));
        setMinimumSize(new java.awt.Dimension(1100, 750));
        setPreferredSize(new java.awt.Dimension(1100, 750));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setMaximumSize(new java.awt.Dimension(1100, 750));
        bg.setMinimumSize(new java.awt.Dimension(1100, 750));
        bg.setPreferredSize(new java.awt.Dimension(1100, 750));

        linea.setBackground(new java.awt.Color(255, 205, 93));
        linea.setMaximumSize(new java.awt.Dimension(1100, 35));
        linea.setMinimumSize(new java.awt.Dimension(1100, 35));
        linea.setPreferredSize(new java.awt.Dimension(1100, 35));

        javax.swing.GroupLayout lineaLayout = new javax.swing.GroupLayout(linea);
        linea.setLayout(lineaLayout);
        lineaLayout.setHorizontalGroup(
            lineaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        lineaLayout.setVerticalGroup(
            lineaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        linea2.setBackground(new java.awt.Color(255, 205, 93));
        linea2.setMaximumSize(new java.awt.Dimension(1100, 35));
        linea2.setMinimumSize(new java.awt.Dimension(1100, 35));
        linea2.setPreferredSize(new java.awt.Dimension(1100, 35));

        javax.swing.GroupLayout linea2Layout = new javax.swing.GroupLayout(linea2);
        linea2.setLayout(linea2Layout);
        linea2Layout.setHorizontalGroup(
            linea2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        linea2Layout.setVerticalGroup(
            linea2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        lbfecha.setBackground(new java.awt.Color(0, 0, 0));
        lbfecha.setFont(new java.awt.Font("Poppins Light", 0, 18)); // NOI18N
        lbfecha.setForeground(new java.awt.Color(0, 0, 0));
        lbfecha.setText("Fecha");

        tffecha.setEditable(false);
        tffecha.setBackground(new java.awt.Color(255, 255, 255));
        tffecha.setFont(new java.awt.Font("sansserif", 2, 18)); // NOI18N
        tffecha.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tffecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tffechaActionPerformed(evt);
            }
        });

        lbcodigo.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lbcodigo.setForeground(new java.awt.Color(0, 0, 0));
        lbcodigo.setText("Código");

        tfcodigo.setBackground(new java.awt.Color(255, 225, 157));
        tfcodigo.setFont(new java.awt.Font("sansserif", 0, 36)); // NOI18N
        tfcodigo.setForeground(new java.awt.Color(0, 0, 0));
        tfcodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfcodigoActionPerformed(evt);
            }
        });

        btregistrar.setBackground(new java.awt.Color(237, 237, 237));
        btregistrar.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btregistrar.setForeground(new java.awt.Color(0, 0, 0));
        btregistrar.setText("Registrar");
        btregistrar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btregistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btregistrarActionPerformed(evt);
            }
        });

        linea3.setBackground(new java.awt.Color(255, 205, 93));
        linea3.setMaximumSize(new java.awt.Dimension(1100, 35));
        linea3.setMinimumSize(new java.awt.Dimension(1100, 35));

        javax.swing.GroupLayout linea3Layout = new javax.swing.GroupLayout(linea3);
        linea3.setLayout(linea3Layout);
        linea3Layout.setHorizontalGroup(
            linea3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1100, Short.MAX_VALUE)
        );
        linea3Layout.setVerticalGroup(
            linea3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        linea4.setBackground(new java.awt.Color(255, 205, 93));
        linea4.setMaximumSize(new java.awt.Dimension(1100, 35));
        linea4.setMinimumSize(new java.awt.Dimension(1100, 35));

        btcancelar.setBackground(new java.awt.Color(237, 237, 237));
        btcancelar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btcancelar.setForeground(new java.awt.Color(0, 0, 0));
        btcancelar.setText("Cancelar");
        btcancelar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btcancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btcancelarActionPerformed(evt);
            }
        });

        btgenerar.setBackground(new java.awt.Color(237, 237, 237));
        btgenerar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btgenerar.setForeground(new java.awt.Color(0, 0, 0));
        btgenerar.setText("Generar");
        btgenerar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btgenerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btgenerarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout linea4Layout = new javax.swing.GroupLayout(linea4);
        linea4.setLayout(linea4Layout);
        linea4Layout.setHorizontalGroup(
            linea4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, linea4Layout.createSequentialGroup()
                .addContainerGap(683, Short.MAX_VALUE)
                .addComponent(btcancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addComponent(btgenerar, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69))
        );
        linea4Layout.setVerticalGroup(
            linea4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(linea4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(linea4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btgenerar, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                    .addComponent(btcancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(71, Short.MAX_VALUE))
        );

        lbtotal.setBackground(new java.awt.Color(0, 0, 0));
        lbtotal.setFont(new java.awt.Font("Poppins Light", 0, 36)); // NOI18N
        lbtotal.setForeground(new java.awt.Color(0, 0, 0));
        lbtotal.setText("TOTAL A PAGAR:");

        tftotal.setEditable(false);
        tftotal.setBackground(new java.awt.Color(217, 217, 217));
        tftotal.setFont(new java.awt.Font("sansserif", 1, 36)); // NOI18N
        tftotal.setForeground(new java.awt.Color(0, 0, 0));
        tftotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tftotalActionPerformed(evt);
            }
        });

        tablaventa.setBackground(new java.awt.Color(255, 255, 255));
        tablaventa.setForeground(new java.awt.Color(0, 0, 0));
        tablaventa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "N° venta", "Codigo", "Nombre", "Cantidad", "Precio ", "Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaventa);

        lbcantidad.setBackground(new java.awt.Color(0, 0, 0));
        lbcantidad.setFont(new java.awt.Font("Poppins Light", 0, 18)); // NOI18N
        lbcantidad.setForeground(new java.awt.Color(0, 0, 0));
        lbcantidad.setText("Cantidad");

        lbventa2.setBackground(new java.awt.Color(0, 0, 0));
        lbventa2.setFont(new java.awt.Font("Poppins Light", 0, 18)); // NOI18N
        lbventa2.setForeground(new java.awt.Color(0, 0, 0));
        lbventa2.setText("Stock");

        tfstock.setEditable(false);
        tfstock.setBackground(new java.awt.Color(217, 217, 217));
        tfstock.setForeground(new java.awt.Color(255, 204, 51));
        tfstock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfstockActionPerformed(evt);
            }
        });

        opcioncantidad.setModel(new javax.swing.SpinnerNumberModel(1L, null, 50L, 1L));
        opcioncantidad.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
                opcioncantidadAncestorMoved(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        tfprecio.setEditable(false);
        tfprecio.setBackground(new java.awt.Color(217, 217, 217));
        tfprecio.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        tfprecio.setForeground(new java.awt.Color(102, 102, 102));
        tfprecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfprecioActionPerformed(evt);
            }
        });

        lbprecio.setBackground(new java.awt.Color(0, 0, 0));
        lbprecio.setFont(new java.awt.Font("Poppins Light", 0, 24)); // NOI18N
        lbprecio.setForeground(new java.awt.Color(0, 0, 0));
        lbprecio.setText("Precio");

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(linea, javax.swing.GroupLayout.DEFAULT_SIZE, 1106, Short.MAX_VALUE)
            .addComponent(linea2, javax.swing.GroupLayout.DEFAULT_SIZE, 1106, Short.MAX_VALUE)
            .addGroup(bgLayout.createSequentialGroup()
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(linea4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(bgLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbprecio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tfprecio, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(74, 74, 74)
                        .addComponent(lbtotal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tftotal, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(67, 67, 67))
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(bgLayout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addComponent(lbfecha)
                                .addGap(18, 18, 18)
                                .addComponent(tffecha, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(bgLayout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1017, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(bgLayout.createSequentialGroup()
                                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(bgLayout.createSequentialGroup()
                                                .addComponent(lbcodigo)
                                                .addGap(33, 33, 33)
                                                .addComponent(tfcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 466, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(bgLayout.createSequentialGroup()
                                                .addComponent(lbcantidad)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(opcioncantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(btregistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(bgLayout.createSequentialGroup()
                                                .addComponent(lbventa2)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(tfstock, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                            .addComponent(linea3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addComponent(linea, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tffecha, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbfecha))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(linea2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tfcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbcodigo))
                    .addComponent(btregistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(opcioncantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbcantidad)
                    .addComponent(lbventa2)
                    .addComponent(tfstock, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(linea3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbtotal)
                    .addComponent(tftotal, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(lbprecio)
                        .addComponent(tfprecio, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(linea4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 750));
    }// </editor-fold>//GEN-END:initComponents

    private void tffechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tffechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tffechaActionPerformed

    private void tfcodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfcodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfcodigoActionPerformed

    private void btregistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btregistrarActionPerformed
        buscarProducto();
        registrarProducto();
        opcioncantidad.setValue(1);
        
    }//GEN-LAST:event_btregistrarActionPerformed
  
    
    private void tftotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tftotalActionPerformed
    }//GEN-LAST:event_tftotalActionPerformed

    private void btcancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btcancelarActionPerformed

      tfcodigo.setText("");

              tfprecio.setText("");
              tfstock.setText("");             
              tftotal.setText("");
          
     modelo =(DefaultTableModel)tablaventa.getModel();
    int filas = tablaventa.getRowCount();
    for (int a = 0; filas > a; a++) {
        modelo.removeRow(0);
    }
        
    
    }//GEN-LAST:event_btcancelarActionPerformed

    private void btgenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btgenerarActionPerformed
        
        guardarFactura();
        guardarDetalle();
        actualizarStock();
    }//GEN-LAST:event_btgenerarActionPerformed

    private void tfstockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfstockActionPerformed
    }//GEN-LAST:event_tfstockActionPerformed

    private void tfprecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfprecioActionPerformed
        
    }//GEN-LAST:event_tfprecioActionPerformed

    private void opcioncantidadAncestorMoved(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_opcioncantidadAncestorMoved
       
    }//GEN-LAST:event_opcioncantidadAncestorMoved

  //metodos
    void buscarProducto(){
        int id = Integer.parseInt(tfcodigo.getText());
        if(tfcodigo.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Debe ingresar el codigo del producto");
            
        }else{
            p =dao.listarid(id);
            if(p.getIdproducto()!=0){
              tfprecio.setText(""+p.getPrecio());
              tfstock.setText(""+p.getStock());
              
            }else{
               JOptionPane.showMessageDialog(this, "producto no registrado"); 
               tfcodigo.requestFocus();
            }
        }
    }
    
    void registrarProducto(){
        double total;
        modelo =(DefaultTableModel)tablaventa.getModel();
        int item=0;
        item=item+1;
        idp=p.getIdproducto();
        String nombre=p.getNombre();
        precio = Double.parseDouble(tfprecio.getText());
        cant= Integer.parseInt(opcioncantidad.getValue().toString());
        int stock=Integer.parseInt(tfstock.getText());
        total = cant*precio;
        ArrayList lista = new ArrayList();
        if(stock>0){
            lista.add(item);
            lista.add(idp);
            lista.add(nombre);
            lista.add(cant);
            lista.add(precio);
            lista.add(total);
            Object[]ob =new Object[6];
            ob[0]=lista.get(0);
            ob[1]=lista.get(1);
            ob[2]=lista.get(2);
            ob[3]=lista.get(3);
            ob[4]=lista.get(4);
            ob[5]=lista.get(5);
            modelo.addRow(ob);
            tablaventa.setModel(modelo);
            calcularTotal();
        }else{
           JOptionPane.showMessageDialog(this, "stock producto agotado"); 
        }
    }
    
    void calcularTotal(){
        tpagar=0;
        for (int i = 0; i < tablaventa.getRowCount(); i++) {
            cant=Integer.parseInt(tablaventa.getValueAt(i, 3).toString());
            precio=Double.parseDouble(tablaventa.getValueAt(i, 4).toString());
            tpagar = tpagar+(cant*precio);
        }
        tftotal.setText(""+tpagar);
    }
    
    
    
    void guardarFactura(){
        
        String fecha= tffecha.getText();
        int idu=1;
        double monto=tpagar;
        f.setFecha(fecha);
        f.setIdusuario(idu);
        f.setMonto(monto);
        
        fdao.GuardarF(f);
        
    }
    void guardarDetalle(){
       String idf=fdao.idFactura();
       int idfactura = Integer.parseInt(idf);
        for (int i = 0; i < tablaventa.getRowCount(); i++) {
            int idp=Integer.parseInt(tablaventa.getValueAt(i, 1).toString());
            int cant=Integer.parseInt(tablaventa.getValueAt(i, 3).toString());
            double pre=Double.parseDouble(tablaventa.getValueAt(i, 4).toString());
            d.setIdFactura(idfactura);
            d.setIdProducto(idp);
            d.setCantidad(cant);
            d.setPreciofac(precio);
            fdao.GuardarDetalle(d);
            
            JOptionPane.showMessageDialog(this, "Venta generada con exito");
        }
    }
    void actualizarStock() {
        for (int i = 0; i < modelo.getRowCount(); i++) {
            Producto pr  = new Producto();
            idp  = Integer.parseInt(tablaventa.getValueAt(i, 1).toString());
            cant = Integer.parseInt(tablaventa.getValueAt(i, 3).toString());
            pr = dao.listarid(idp);
            int sa = pr.getStock() - cant;
            dao.ActualizarStock(sa, idp);
        }
        
        
  
    
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JButton btcancelar;
    private javax.swing.JButton btgenerar;
    private javax.swing.JButton btregistrar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbcantidad;
    private javax.swing.JLabel lbcodigo;
    private javax.swing.JLabel lbfecha;
    private javax.swing.JLabel lbprecio;
    private javax.swing.JLabel lbtotal;
    private javax.swing.JLabel lbventa2;
    private javax.swing.JPanel linea;
    private javax.swing.JPanel linea2;
    private javax.swing.JPanel linea3;
    private javax.swing.JPanel linea4;
    private javax.swing.JSpinner opcioncantidad;
    private javax.swing.JTable tablaventa;
    private javax.swing.JTextField tfcodigo;
    private javax.swing.JTextField tffecha;
    private javax.swing.JTextField tfprecio;
    private javax.swing.JTextField tfstock;
    private javax.swing.JTextField tftotal;
    // End of variables declaration//GEN-END:variables
}
