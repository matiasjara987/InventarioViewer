
package diseño;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Conexion;
import modelo.Producto;
import modelo.ProductoDAO;

public class inventario extends javax.swing.JPanel {
    
    DefaultTableModel modelo = new DefaultTableModel();
    ProductoDAO dao= new ProductoDAO ();
    Producto p  = new Producto(); 
    int id;
    
    
    public inventario() {
        initComponents();
      // Conexion dao = new Conexion ();
        modelo= new DefaultTableModel();
        listar();
    }
    
    void listar (){
       List <Producto> lista=dao.listar();    
        modelo =(DefaultTableModel)tablainventario.getModel();
        String[] datos=new String[5];
        for (int i = 0; i < lista.size(); i++){
            
            datos[0]= String.valueOf(lista.get(i).getIdproducto());
            datos[1]= lista.get(i).getNombre();
            datos[2]= String.valueOf(lista.get(i).getPrecio());
            datos[3]= String.valueOf(lista.get(i).getId_clasificacion());
            datos[4]= String.valueOf(lista.get(i).getStock());        
            modelo.addRow(datos);
        }
        tablainventario.setModel(modelo);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        linea = new javax.swing.JPanel();
        lbinventario = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablainventario = new javax.swing.JTable();
        btagregar = new javax.swing.JButton();
        cuadroagregar = new javax.swing.JPanel();
        lbnombre = new javax.swing.JLabel();
        tfnombre = new javax.swing.JTextField();
        lbtipo = new javax.swing.JLabel();
        tftipo = new javax.swing.JTextField();
        lbstock = new javax.swing.JLabel();
        tfstock = new javax.swing.JTextField();
        tfcodigo = new javax.swing.JTextField();
        lbcodigo = new javax.swing.JLabel();
        lbprecio = new javax.swing.JLabel();
        tfprecio = new javax.swing.JTextField();
        btnuevo = new javax.swing.JButton();
        bteliminar = new javax.swing.JButton();
        btactualizar = new javax.swing.JButton();
        lbagregarproducto = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(1100, 750));
        setMinimumSize(new java.awt.Dimension(1100, 750));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setMaximumSize(new java.awt.Dimension(1100, 750));

        linea.setBackground(new java.awt.Color(255, 205, 93));
        linea.setMaximumSize(new java.awt.Dimension(1100, 35));
        linea.setMinimumSize(new java.awt.Dimension(1100, 35));

        lbinventario.setBackground(new java.awt.Color(0, 0, 0));
        lbinventario.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbinventario.setForeground(new java.awt.Color(0, 0, 0));
        lbinventario.setText("Inventario");

        javax.swing.GroupLayout lineaLayout = new javax.swing.GroupLayout(linea);
        linea.setLayout(lineaLayout);
        lineaLayout.setHorizontalGroup(
            lineaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lineaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbinventario)
                .addGap(480, 480, 480))
        );
        lineaLayout.setVerticalGroup(
            lineaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lineaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbinventario)
                .addContainerGap(7, Short.MAX_VALUE))
        );

        tablainventario.setBackground(new java.awt.Color(255, 255, 255));
        tablainventario.setForeground(new java.awt.Color(0, 0, 0));
        tablainventario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Nombre", "Precio", "Tipo", "Stock "
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablainventario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablainventarioMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablainventario);

        btagregar.setBackground(new java.awt.Color(237, 237, 237));
        btagregar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btagregar.setForeground(new java.awt.Color(0, 0, 0));
        btagregar.setText("Agregar");
        btagregar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btagregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btagregarActionPerformed(evt);
            }
        });

        cuadroagregar.setBackground(new java.awt.Color(244, 215, 150));
        cuadroagregar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        cuadroagregar.setMaximumSize(new java.awt.Dimension(612, 258));
        cuadroagregar.setMinimumSize(new java.awt.Dimension(612, 258));

        lbnombre.setBackground(new java.awt.Color(0, 0, 0));
        lbnombre.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbnombre.setForeground(new java.awt.Color(0, 0, 0));
        lbnombre.setText("Nombre");

        tfnombre.setBackground(new java.awt.Color(255, 255, 255));
        tfnombre.setForeground(new java.awt.Color(0, 0, 0));

        lbtipo.setBackground(new java.awt.Color(0, 0, 0));
        lbtipo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbtipo.setForeground(new java.awt.Color(0, 0, 0));
        lbtipo.setText("Tipo");

        tftipo.setBackground(new java.awt.Color(255, 255, 255));
        tftipo.setForeground(new java.awt.Color(0, 0, 0));

        lbstock.setBackground(new java.awt.Color(0, 0, 0));
        lbstock.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbstock.setForeground(new java.awt.Color(0, 0, 0));
        lbstock.setText("Stock");

        tfstock.setBackground(new java.awt.Color(255, 255, 255));
        tfstock.setForeground(new java.awt.Color(0, 0, 0));

        tfcodigo.setBackground(new java.awt.Color(255, 255, 255));
        tfcodigo.setForeground(new java.awt.Color(0, 0, 0));

        lbcodigo.setBackground(new java.awt.Color(0, 0, 0));
        lbcodigo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbcodigo.setForeground(new java.awt.Color(0, 0, 0));
        lbcodigo.setText("Codigo");

        lbprecio.setBackground(new java.awt.Color(0, 0, 0));
        lbprecio.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbprecio.setForeground(new java.awt.Color(0, 0, 0));
        lbprecio.setText("Precio");

        tfprecio.setBackground(new java.awt.Color(255, 255, 255));
        tfprecio.setForeground(new java.awt.Color(0, 0, 0));
        tfprecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfprecioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout cuadroagregarLayout = new javax.swing.GroupLayout(cuadroagregar);
        cuadroagregar.setLayout(cuadroagregarLayout);
        cuadroagregarLayout.setHorizontalGroup(
            cuadroagregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cuadroagregarLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(cuadroagregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbprecio)
                    .addGroup(cuadroagregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(cuadroagregarLayout.createSequentialGroup()
                            .addComponent(lbcodigo)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tfcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(cuadroagregarLayout.createSequentialGroup()
                            .addGroup(cuadroagregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lbnombre)
                                .addComponent(lbtipo)
                                .addComponent(lbstock))
                            .addGap(41, 41, 41)
                            .addGroup(cuadroagregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tfstock, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tftipo, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tfnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tfprecio, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        cuadroagregarLayout.setVerticalGroup(
            cuadroagregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cuadroagregarLayout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addGroup(cuadroagregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbcodigo)
                    .addComponent(tfcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(cuadroagregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbnombre)
                    .addComponent(tfnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(cuadroagregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbprecio)
                    .addComponent(tfprecio, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(cuadroagregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbtipo)
                    .addComponent(tftipo, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(cuadroagregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbstock)
                    .addComponent(tfstock, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
        );

        btnuevo.setBackground(new java.awt.Color(237, 237, 237));
        btnuevo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnuevo.setForeground(new java.awt.Color(0, 0, 0));
        btnuevo.setText("Nuevo");
        btnuevo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnuevoActionPerformed(evt);
            }
        });

        bteliminar.setBackground(new java.awt.Color(237, 237, 237));
        bteliminar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        bteliminar.setForeground(new java.awt.Color(0, 0, 0));
        bteliminar.setText("Eliminar");
        bteliminar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bteliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bteliminarActionPerformed(evt);
            }
        });

        btactualizar.setBackground(new java.awt.Color(237, 237, 237));
        btactualizar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btactualizar.setForeground(new java.awt.Color(0, 0, 0));
        btactualizar.setText("Actualizar");
        btactualizar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btactualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btactualizarActionPerformed(evt);
            }
        });

        lbagregarproducto.setBackground(new java.awt.Color(0, 0, 0));
        lbagregarproducto.setFont(new java.awt.Font("Poppins Light", 1, 18)); // NOI18N
        lbagregarproducto.setForeground(new java.awt.Color(0, 0, 0));
        lbagregarproducto.setText("Agregar Producto");

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(linea, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(bgLayout.createSequentialGroup()
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 935, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(bgLayout.createSequentialGroup()
                                .addComponent(cuadroagregar, javax.swing.GroupLayout.PREFERRED_SIZE, 573, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(51, 51, 51)
                                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(bteliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btagregar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(35, 35, 35)
                                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnuevo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btactualizar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGap(271, 271, 271)
                        .addComponent(lbagregarproducto)))
                .addContainerGap(127, Short.MAX_VALUE))
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addComponent(linea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(lbagregarproducto)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bgLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cuadroagregar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btagregar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btactualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(64, 64, 64)
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bteliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(76, Short.MAX_VALUE))
        );

        add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 750));
    }// </editor-fold>//GEN-END:initComponents

    private void btagregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btagregarActionPerformed

        agregar();
        limpiarTabla();
        listar();
        nuevo();
    }//GEN-LAST:event_btagregarActionPerformed

    private void btnuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnuevoActionPerformed
        nuevo();
    }//GEN-LAST:event_btnuevoActionPerformed

    private void bteliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bteliminarActionPerformed
        eliminar();
        limpiarTabla();
        listar();
        nuevo();
    }//GEN-LAST:event_bteliminarActionPerformed

    private void btactualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btactualizarActionPerformed
        actualizar();
        limpiarTabla();
        listar();
    }//GEN-LAST:event_btactualizarActionPerformed

    private void tfprecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfprecioActionPerformed
        
    }//GEN-LAST:event_tfprecioActionPerformed

    private void tablainventarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablainventarioMouseClicked
        
        int fila =tablainventario.getSelectedRow();
        if(fila==-1){
            JOptionPane.showMessageDialog(this, "Debe seleccionar una fila");
            
        }else{
            
            id =Integer.parseInt(tablainventario.getValueAt(fila, 0).toString());
            String nombre =tablainventario.getValueAt(fila, 1).toString();
            double precio=Double.parseDouble(tablainventario.getValueAt(fila, 2).toString());
            int idclasi =Integer.parseInt(tablainventario.getValueAt(fila, 3).toString());
            int stock=Integer.parseInt(tablainventario.getValueAt(fila, 4).toString());
           tfcodigo.setText(Integer.toString(id));
           tfnombre.setText(nombre);
           tfprecio.setText(Double.toString(precio));
           tftipo.setText(Integer.toString(idclasi));
           tfstock.setText(Integer.toString(stock));
        }
    }//GEN-LAST:event_tablainventarioMouseClicked
  
    // METODOS
    
    void agregar(){
        Producto p = new Producto();
        //validar para que ningun campo este vacio 
        if (!tfcodigo.getText().trim().equals("") && !tfnombre.getText().trim().equals("")
                && !tftipo.getText().trim().equals("") && !tfprecio.getText().trim().equals("")
                && !tfstock.getText().trim().equals("")) {
            p.setIdproducto(Integer.parseInt(tfcodigo.getText()));
            p.setNombre(tfnombre.getText());
            p.setId_clasificacion(Integer.parseInt(tftipo.getText()));
            p.setPrecio(Double.parseDouble(tfprecio.getText()));
            p.setStock(Integer.parseInt(tfstock.getText()));
            dao.add(p);
            JOptionPane.showMessageDialog(this, "Producto agregado con exito");

        } else {
            JOptionPane.showMessageDialog(null, "Error al agregar");
        } //fin else
    }   
    //falta que funcione
    void actualizar (){
       int fila = tablainventario.getSelectedRow();
       if (fila ==-1){
           JOptionPane.showMessageDialog(this, "Debes seleccionar una fila");
       }else{
           String nombre = tfnombre.getText();
        String precio = tfprecio.getText();
        String idclasi = tftipo.getText();
        String stock = tfstock.getText();
        Object [] ob = new Object[5];
        ob[0]= nombre;
        ob[1]= precio;
        ob[2]= idclasi;
        ob[3]= stock;
        ob[4]= id;
        dao.actualizar(ob);
        
        
       }
        
    }
    
    void eliminar (){  
        int fila = tablainventario.getSelectedRow();
       if (fila ==-1){
           JOptionPane.showMessageDialog(this, "Debes seleccionar una fila");
       }else{
           dao.eliminar(id);
    }
    }
    
    void nuevo() {
        tfcodigo.setText("");
        tfnombre.setText("");
        tftipo.setText("");
        tfprecio.setText("");
        tfstock.setText("");

    }

    
    void limpiarTabla(){
        for (int i = 0; i < tablainventario.getRowCount(); i++){
            modelo.removeRow(i);
            i= i-1;
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JButton btactualizar;
    private javax.swing.JButton btagregar;
    private javax.swing.JButton bteliminar;
    private javax.swing.JButton btnuevo;
    private javax.swing.JPanel cuadroagregar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbagregarproducto;
    private javax.swing.JLabel lbcodigo;
    private javax.swing.JLabel lbinventario;
    private javax.swing.JLabel lbnombre;
    private javax.swing.JLabel lbprecio;
    private javax.swing.JLabel lbstock;
    private javax.swing.JLabel lbtipo;
    private javax.swing.JPanel linea;
    private javax.swing.JTable tablainventario;
    private javax.swing.JTextField tfcodigo;
    private javax.swing.JTextField tfnombre;
    private javax.swing.JTextField tfprecio;
    private javax.swing.JTextField tfstock;
    private javax.swing.JTextField tftipo;
    // End of variables declaration//GEN-END:variables
}
