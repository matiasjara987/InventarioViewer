package vista;


public class Logeo extends javax.swing.JFrame {

    public Logeo() {
        initComponents();
         this.setLocationRelativeTo(this);
         rsscalelabel.RSScaleLabel.setScaleLabel(jLabel1, "src/img/box_1.png");
         rsscalelabel.RSScaleLabel.setScaleLabel(lbluser, "src/img/user.png");
         
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        bgfont = new javax.swing.JLabel();
        logform = new javax.swing.JPanel();
        txtLOGIN = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        lbluser = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setForeground(new java.awt.Color(255, 255, 255));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/box_1.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jLabel1.setPreferredSize(new java.awt.Dimension(400, 400));
        bg.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 50, -1, -1));

        bgfont.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bg.jpg"))); // NOI18N
        bgfont.setText("jLabel1");
        bg.add(bgfont, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 0, 590, 510));

        logform.setBackground(new java.awt.Color(255, 255, 255));
        logform.setPreferredSize(new java.awt.Dimension(320, 380));

        txtLOGIN.setBackground(new java.awt.Color(255, 255, 255));
        txtLOGIN.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        txtLOGIN.setForeground(new java.awt.Color(0, 0, 0));
        txtLOGIN.setText("LOGIN");

        jTextField1.setText("jTextField1");

        javax.swing.GroupLayout logformLayout = new javax.swing.GroupLayout(logform);
        logform.setLayout(logformLayout);
        logformLayout.setHorizontalGroup(
            logformLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(logformLayout.createSequentialGroup()
                .addGroup(logformLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(logformLayout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addComponent(txtLOGIN))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, logformLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(lbluser, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(135, Short.MAX_VALUE))
        );
        logformLayout.setVerticalGroup(
            logformLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(logformLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(logformLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbluser, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(logformLayout.createSequentialGroup()
                        .addComponent(txtLOGIN)
                        .addGap(63, 63, 63)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(251, Short.MAX_VALUE))
        );

        bg.add(logform, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 320, 370));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, 508, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JLabel bgfont;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lbluser;
    private javax.swing.JPanel logform;
    private javax.swing.JLabel txtLOGIN;
    // End of variables declaration//GEN-END:variables
}
