package logeo;

import diseño.TextField;
import diseño.index;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import modelo.Conexion;
import modelo.Encoder;
import modelo.Usuario;
import modelo.UsuarioDao;

public class Logeo extends javax.swing.JFrame {

    private Conexion con = new Conexion();
    private UsuarioDao ud = new UsuarioDao();
    private Encoder enc = new Encoder();

    public Logeo() {
        initComponents();
        this.setLocationRelativeTo(this);
        rsscalelabel.RSScaleLabel.setScaleLabel(boximg, "src/img/box_1.png");
        JTextField field = new TextField(15);
        this.OCULTAR.setVisible(false);
        this.add(field);
        this.setVisible(true);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        boximg = new javax.swing.JLabel();
        txtLOGIN = new javax.swing.JLabel();
        bgfont = new javax.swing.JLabel();
        header = new javax.swing.JLabel();
        fielduser = new diseño.JERoundTextField();
        boton1 = new diseño.Boton();
        header1 = new javax.swing.JLabel();
        btn_login = new diseño.Boton();
        dieldpass = new diseño.JERoundPassField();
        VER = new javax.swing.JLabel();
        OCULTAR = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setForeground(new java.awt.Color(255, 255, 255));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        boximg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/box_1.png"))); // NOI18N
        boximg.setText("jLabel1");
        boximg.setPreferredSize(new java.awt.Dimension(400, 400));
        bg.add(boximg, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 50, -1, -1));

        txtLOGIN.setBackground(new java.awt.Color(255, 255, 255));
        txtLOGIN.setFont(new java.awt.Font("Poppins", 1, 25)); // NOI18N
        txtLOGIN.setForeground(new java.awt.Color(0, 0, 0));
        txtLOGIN.setText("LOGIN");
        bg.add(txtLOGIN, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, -1, -1));

        bgfont.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bg.jpg"))); // NOI18N
        bgfont.setText("jLabel1");
        bg.add(bgfont, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 0, 560, 510));

        header.setBackground(new java.awt.Color(255, 255, 255));
        header.setFont(new java.awt.Font("Poppins Light", 0, 16)); // NOI18N
        header.setForeground(new java.awt.Color(0, 0, 0));
        header.setText("No tienes usuario? Puedes");
        bg.add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, -1, -1));

        fielduser.setBackground(new java.awt.Color(217, 217, 217));
        fielduser.setForeground(new java.awt.Color(0, 0, 0));
        fielduser.setText("Username");
        fielduser.setFont(new java.awt.Font("Poppins Light", 0, 12)); // NOI18N
        fielduser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/user.png"))); // NOI18N
        fielduser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fielduserMouseClicked(evt);
            }
        });
        fielduser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fielduserActionPerformed(evt);
            }
        });
        bg.add(fielduser, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 280, 40));

        boton1.setForeground(new java.awt.Color(255, 255, 255));
        boton1.setText("Crear Cuenta");
        boton1.setFont(new java.awt.Font("Poppins Light", 0, 15)); // NOI18N
        boton1.setPreferredSize(new java.awt.Dimension(82, 33));
        boton1.setRadius(20);
        boton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton1ActionPerformed(evt);
            }
        });
        bg.add(boton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 330, 140, 30));

        header1.setBackground(new java.awt.Color(255, 255, 255));
        header1.setFont(new java.awt.Font("Poppins Light", 0, 12)); // NOI18N
        header1.setForeground(new java.awt.Color(0, 0, 0));
        header1.setText("Bienvenido a Tu Inventario Viewer");
        bg.add(header1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, -1, -1));

        btn_login.setForeground(new java.awt.Color(255, 255, 255));
        btn_login.setText("Login");
        btn_login.setFont(new java.awt.Font("Poppins SemiBold", 0, 15)); // NOI18N
        btn_login.setPreferredSize(new java.awt.Dimension(82, 33));
        btn_login.setRadius(20);
        btn_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_loginActionPerformed(evt);
            }
        });
        bg.add(btn_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 283, 90, 40));

        dieldpass.setBackground(new java.awt.Color(204, 204, 204));
        dieldpass.setForeground(new java.awt.Color(0, 0, 0));
        dieldpass.setText("Password");
        dieldpass.setFont(new java.awt.Font("Poppins Light", 0, 14)); // NOI18N
        dieldpass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/password.png"))); // NOI18N
        dieldpass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dieldpassMouseClicked(evt);
            }
        });
        dieldpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dieldpassActionPerformed(evt);
            }
        });
        bg.add(dieldpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 280, 40));

        VER.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ver.png"))); // NOI18N
        VER.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                VERMouseClicked(evt);
            }
        });
        bg.add(VER, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 220, 30, 20));

        OCULTAR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/oculto.png"))); // NOI18N
        OCULTAR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                OCULTARMouseClicked(evt);
            }
        });
        bg.add(OCULTAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 220, 30, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 956, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, 508, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fielduserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fielduserActionPerformed
        fielduser.setText(null);
    }//GEN-LAST:event_fielduserActionPerformed

    private void boton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton1ActionPerformed
        Crear cr = new Crear();
        cr.setVisible(true);
        this.dispose();

        // TODO add your handling code here:
    }//GEN-LAST:event_boton1ActionPerformed

    private void btn_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_loginActionPerformed

       
        if (!fielduser.getText().trim().equals("") && !dieldpass.getText().trim().equals("")) {
           
            String Usuario  = fielduser.getText().trim();
            String Password = enc.ecnode(dieldpass.getText().trim()); 
            
            var user = (ud.ValidarVendedor(Usuario, Password));
            if (Password.equals(user.getContraseña())){
                JOptionPane.showMessageDialog(null, "Bienvenido al Sistema!");
                index ola = new index();
                ola.setVisible(true);
                this.dispose();

            } else {
                JOptionPane.showMessageDialog(null, "Contraseña incorrecta");
            }

        } else {
            JOptionPane.showMessageDialog(null, "Ingrese un usuario valido porfavor");
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_loginActionPerformed

    private void dieldpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dieldpassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dieldpassActionPerformed

    private void fielduserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fielduserMouseClicked
        fielduser.setText("");
        // TODO add your handling code here:
    }//GEN-LAST:event_fielduserMouseClicked

    private void dieldpassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dieldpassMouseClicked
        dieldpass.setText("");

        // TODO add your handling code here:
    }//GEN-LAST:event_dieldpassMouseClicked

    private void VERMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VERMouseClicked
        VER.setVisible(false);
        OCULTAR.setVisible(true);
        dieldpass.setEchoChar((char) 0);

        // TODO add your handling code here:
    }//GEN-LAST:event_VERMouseClicked

    private void OCULTARMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OCULTARMouseClicked
        VER.setVisible(true);
        OCULTAR.setVisible(false);
        dieldpass.setEchoChar('*');
        // TODO add your handling code here:
    }//GEN-LAST:event_OCULTARMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel OCULTAR;
    private javax.swing.JLabel VER;
    private javax.swing.JPanel bg;
    private javax.swing.JLabel bgfont;
    private diseño.Boton boton1;
    private javax.swing.JLabel boximg;
    private diseño.Boton btn_login;
    private diseño.JERoundPassField dieldpass;
    private diseño.JERoundTextField fielduser;
    private javax.swing.JLabel header;
    private javax.swing.JLabel header1;
    private javax.swing.JLabel txtLOGIN;
    // End of variables declaration//GEN-END:variables
}
