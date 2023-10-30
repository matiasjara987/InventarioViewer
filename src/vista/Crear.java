package vista;

import diseño.TextField;
import javax.swing.JTextField;



public class Crear extends javax.swing.JFrame {

    public Crear() {
        initComponents();
         this.setLocationRelativeTo(this);
         rsscalelabel.RSScaleLabel.setScaleLabel(boximg, "src/img/box_1.png");
     JTextField field = new TextField(15);
     this.OCULTO.setVisible(false);
     this.OCULTOC.setVisible(false);
     
    this.setVisible(true);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        creacuenta = new javax.swing.JLabel();
        header1 = new javax.swing.JLabel();
        fieldemail = new diseño.JERoundTextField();
        fieldNombre = new diseño.JERoundTextField();
        fieldrut = new diseño.JERoundTextField();
        btn_sig = new diseño.Boton();
        btn_atras = new diseño.Boton();
        fieldApellido1 = new diseño.JERoundTextField();
        jLabel1 = new javax.swing.JLabel();
        fieldusername = new diseño.JERoundTextField();
        fieldApellido2 = new diseño.JERoundTextField();
        dieldpass1 = new diseño.JERoundPassField();
        lbl_crearcontra = new javax.swing.JLabel();
        lbl_confirmarpass = new javax.swing.JLabel();
        ConfirmarPass = new diseño.JERoundPassField();
        VER = new javax.swing.JLabel();
        OCULTO = new javax.swing.JLabel();
        OCULTOC = new javax.swing.JLabel();
        VERC = new javax.swing.JLabel();
        boximg = new javax.swing.JLabel();
        bgfont = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setForeground(new java.awt.Color(255, 255, 255));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        creacuenta.setBackground(new java.awt.Color(255, 255, 255));
        creacuenta.setFont(new java.awt.Font("Poppins", 1, 25)); // NOI18N
        creacuenta.setForeground(new java.awt.Color(0, 0, 0));
        creacuenta.setText("Crear Cuenta");

        header1.setBackground(new java.awt.Color(255, 255, 255));
        header1.setFont(new java.awt.Font("Poppins Light", 0, 12)); // NOI18N
        header1.setForeground(new java.awt.Color(0, 0, 0));
        header1.setText("Bienvenido a Tu Inventario Viewer");

        fieldemail.setBackground(new java.awt.Color(217, 217, 217));
        fieldemail.setForeground(new java.awt.Color(0, 0, 0));
        fieldemail.setText("Correo electrónico");
        fieldemail.setFont(new java.awt.Font("Poppins Light", 0, 14)); // NOI18N
        fieldemail.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/mail.png"))); // NOI18N
        fieldemail.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fieldemailMouseClicked(evt);
            }
        });
        fieldemail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldemailActionPerformed(evt);
            }
        });

        fieldNombre.setBackground(new java.awt.Color(217, 217, 217));
        fieldNombre.setForeground(new java.awt.Color(0, 0, 0));
        fieldNombre.setText("Nombre");
        fieldNombre.setFont(new java.awt.Font("Poppins Light", 0, 14)); // NOI18N
        fieldNombre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/user.png"))); // NOI18N
        fieldNombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fieldNombreMouseClicked(evt);
            }
        });
        fieldNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldNombreActionPerformed(evt);
            }
        });

        fieldrut.setBackground(new java.awt.Color(217, 217, 217));
        fieldrut.setForeground(new java.awt.Color(0, 0, 0));
        fieldrut.setText("RUT");
        fieldrut.setFont(new java.awt.Font("Poppins Light", 0, 14)); // NOI18N
        fieldrut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/carnet.png"))); // NOI18N
        fieldrut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fieldrutMouseClicked(evt);
            }
        });
        fieldrut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldrutActionPerformed(evt);
            }
        });

        btn_sig.setBackground(new java.awt.Color(255, 184, 29));
        btn_sig.setForeground(new java.awt.Color(255, 184, 29));
        btn_sig.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/siguiente.png"))); // NOI18N
        btn_sig.setRadius(100);
        btn_sig.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sigActionPerformed(evt);
            }
        });

        btn_atras.setBackground(new java.awt.Color(255, 184, 29));
        btn_atras.setForeground(new java.awt.Color(255, 184, 29));
        btn_atras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/atras.png"))); // NOI18N
        btn_atras.setRadius(100);
        btn_atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_atrasActionPerformed(evt);
            }
        });

        fieldApellido1.setBackground(new java.awt.Color(217, 217, 217));
        fieldApellido1.setForeground(new java.awt.Color(0, 0, 0));
        fieldApellido1.setText("Apellidos");
        fieldApellido1.setFont(new java.awt.Font("Poppins Light", 0, 14)); // NOI18N
        fieldApellido1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/user.png"))); // NOI18N
        fieldApellido1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fieldApellido1MouseClicked(evt);
            }
        });
        fieldApellido1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldApellido1ActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Poppins SemiBold", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Datos Personales");

        fieldusername.setBackground(new java.awt.Color(217, 217, 217));
        fieldusername.setForeground(new java.awt.Color(0, 0, 0));
        fieldusername.setText("Username");
        fieldusername.setFont(new java.awt.Font("Poppins Light", 0, 14)); // NOI18N
        fieldusername.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/user.png"))); // NOI18N
        fieldusername.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fieldusernameMouseClicked(evt);
            }
        });
        fieldusername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldusernameActionPerformed(evt);
            }
        });

        fieldApellido2.setBackground(new java.awt.Color(217, 217, 217));
        fieldApellido2.setForeground(new java.awt.Color(0, 0, 0));
        fieldApellido2.setText("Apellidos");
        fieldApellido2.setFont(new java.awt.Font("Poppins Light", 0, 14)); // NOI18N
        fieldApellido2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/user.png"))); // NOI18N
        fieldApellido2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fieldApellido2MouseClicked(evt);
            }
        });
        fieldApellido2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldApellido2ActionPerformed(evt);
            }
        });

        dieldpass1.setBackground(new java.awt.Color(204, 204, 204));
        dieldpass1.setForeground(new java.awt.Color(0, 0, 0));
        dieldpass1.setFont(new java.awt.Font("Poppins Light", 0, 14)); // NOI18N
        dieldpass1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/password.png"))); // NOI18N
        dieldpass1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dieldpass1MouseClicked(evt);
            }
        });
        dieldpass1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dieldpass1ActionPerformed(evt);
            }
        });

        lbl_crearcontra.setFont(new java.awt.Font("Poppins Light", 0, 14)); // NOI18N
        lbl_crearcontra.setForeground(new java.awt.Color(0, 0, 0));
        lbl_crearcontra.setText("Crear Contraseña");

        lbl_confirmarpass.setFont(new java.awt.Font("Poppins Light", 0, 14)); // NOI18N
        lbl_confirmarpass.setForeground(new java.awt.Color(0, 0, 0));
        lbl_confirmarpass.setText("Confirmar Contraseña");

        ConfirmarPass.setBackground(new java.awt.Color(204, 204, 204));
        ConfirmarPass.setForeground(new java.awt.Color(0, 0, 0));
        ConfirmarPass.setFont(new java.awt.Font("Poppins Light", 0, 14)); // NOI18N
        ConfirmarPass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/password.png"))); // NOI18N
        ConfirmarPass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ConfirmarPassMouseClicked(evt);
            }
        });
        ConfirmarPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmarPassActionPerformed(evt);
            }
        });

        VER.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ver.png"))); // NOI18N
        VER.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                VERMouseClicked(evt);
            }
        });

        OCULTO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/oculto.png"))); // NOI18N
        OCULTO.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                OCULTOMouseClicked(evt);
            }
        });

        OCULTOC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/oculto.png"))); // NOI18N
        OCULTOC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                OCULTOCMouseClicked(evt);
            }
        });

        VERC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ver.png"))); // NOI18N
        VERC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                VERCMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(creacuenta)
                                .addGap(13, 13, 13))
                            .addComponent(header1, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(fieldApellido1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(fieldApellido2, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(fieldNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(fieldrut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(fieldemail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(fieldusername, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(38, 38, 38))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(38, 38, 38)
                                        .addComponent(jLabel1))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(79, 79, 79)
                                        .addComponent(btn_atras, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(146, 146, 146)
                                        .addComponent(btn_sig, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(29, 29, 29)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lbl_crearcontra)
                                            .addComponent(lbl_confirmarpass)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(6, 6, 6)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(ConfirmarPass, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(dieldpass1, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(OCULTO)
                                                    .addComponent(VER)
                                                    .addComponent(OCULTOC)
                                                    .addComponent(VERC))))))
                                .addGap(0, 76, Short.MAX_VALUE)))
                        .addGap(69, 69, 69)))
                .addGap(102, 102, 102))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(creacuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(header1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fieldApellido2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(fieldApellido1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fieldrut, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fieldemail, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(fieldusername, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(lbl_crearcontra)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(dieldpass1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(OCULTO)
                        .addComponent(VER)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbl_confirmarpass)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(ConfirmarPass, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_sig, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_atras, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(OCULTOC)
                    .addComponent(VERC))
                .addGap(36, 36, 36))
        );

        bg.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 0, 460, 510));

        boximg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/box_1.png"))); // NOI18N
        boximg.setText("jLabel1");
        boximg.setPreferredSize(new java.awt.Dimension(400, 400));
        bg.add(boximg, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, -1, -1));

        bgfont.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bg.jpg"))); // NOI18N
        bgfont.setText("jLabel1");
        bg.add(bgfont, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 510, 510));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, 508, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fieldemailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldemailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldemailActionPerformed

    private void fieldNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldNombreActionPerformed
        
    }//GEN-LAST:event_fieldNombreActionPerformed

    private void fieldrutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldrutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldrutActionPerformed

    private void btn_sigActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sigActionPerformed
       Confirmar cr = new Confirmar();
       cr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_sigActionPerformed

    private void fieldNombreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fieldNombreMouseClicked
        fieldNombre.setText("");
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldNombreMouseClicked

    private void fieldrutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fieldrutMouseClicked
        fieldrut.setText("");
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldrutMouseClicked

    private void fieldemailMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fieldemailMouseClicked
        fieldemail.setText("");
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldemailMouseClicked

    private void btn_atrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_atrasActionPerformed
    Logeo log = new Logeo();
    log.setVisible(true);
    this.dispose();
 // TODO add your handling code here:
    }//GEN-LAST:event_btn_atrasActionPerformed

    private void fieldApellido1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fieldApellido1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldApellido1MouseClicked

    private void fieldApellido1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldApellido1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldApellido1ActionPerformed

    private void fieldusernameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fieldusernameMouseClicked
        fieldusername.setText("");
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldusernameMouseClicked

    private void fieldusernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldusernameActionPerformed

    }//GEN-LAST:event_fieldusernameActionPerformed

    private void fieldApellido2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fieldApellido2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldApellido2MouseClicked

    private void fieldApellido2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldApellido2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldApellido2ActionPerformed

    private void dieldpass1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dieldpass1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_dieldpass1MouseClicked

    private void dieldpass1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dieldpass1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dieldpass1ActionPerformed

    private void ConfirmarPassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ConfirmarPassMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_ConfirmarPassMouseClicked

    private void ConfirmarPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmarPassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ConfirmarPassActionPerformed

    private void VERMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VERMouseClicked
    OCULTO.setVisible(true);
    VER.setVisible(false);
     dieldpass1.setEchoChar((char)0);
        
        // TODO add your handling code here:
    }//GEN-LAST:event_VERMouseClicked

    private void OCULTOMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OCULTOMouseClicked
        OCULTO.setVisible(false);
    VER.setVisible(true);
     dieldpass1.setEchoChar('*');
        // TODO add your handling code here:
    }//GEN-LAST:event_OCULTOMouseClicked

    private void OCULTOCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OCULTOCMouseClicked
 OCULTOC.setVisible(false);
    VERC.setVisible(true);
     ConfirmarPass.setEchoChar('*');
        // TODO add your handling code here:
    }//GEN-LAST:event_OCULTOCMouseClicked

    private void VERCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VERCMouseClicked
       OCULTOC.setVisible(true);
    VERC.setVisible(false);
     ConfirmarPass.setEchoChar((char)0);
        // TODO add your handling code here:
    }//GEN-LAST:event_VERCMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private diseño.JERoundPassField ConfirmarPass;
    private javax.swing.JLabel OCULTO;
    private javax.swing.JLabel OCULTOC;
    private javax.swing.JLabel VER;
    private javax.swing.JLabel VERC;
    private javax.swing.JPanel bg;
    private javax.swing.JLabel bgfont;
    private javax.swing.JLabel boximg;
    private diseño.Boton btn_atras;
    private diseño.Boton btn_sig;
    private javax.swing.JLabel creacuenta;
    private diseño.JERoundPassField dieldpass1;
    private diseño.JERoundTextField fieldApellido1;
    private diseño.JERoundTextField fieldApellido2;
    private diseño.JERoundTextField fieldNombre;
    private diseño.JERoundTextField fieldemail;
    private diseño.JERoundTextField fieldrut;
    private diseño.JERoundTextField fieldusername;
    private javax.swing.JLabel header1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_confirmarpass;
    private javax.swing.JLabel lbl_crearcontra;
    // End of variables declaration//GEN-END:variables
}
