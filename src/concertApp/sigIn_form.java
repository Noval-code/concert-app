/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package concertApp;

import javax.swing.JOptionPane;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author muhammad noval aula
 */
public class sigIn_form extends javax.swing.JFrame {

    /**
     * Creates new form login_form
     */
    public Statement st;
    public ResultSet rs;
    Connection con = connection.koneksiDB.BukaKoneksi();

    public sigIn_form() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        LogoSoulmate = new javax.swing.JLabel();
        UserInput1 = new javax.swing.JPanel();
        icon_user1 = new javax.swing.JLabel();
        UsernameTxt = new javax.swing.JTextField();
        PasswordInput = new javax.swing.JPanel();
        icon_password = new javax.swing.JLabel();
        PasswordTxt = new javax.swing.JPasswordField();
        BtnExit = new javax.swing.JLabel();
        BtnLogin = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        PasswordInput1 = new javax.swing.JPanel();
        icon_password1 = new javax.swing.JLabel();
        ConfirmPasswordTxt = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(0, 0));
        setUndecorated(true);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LogoSoulmate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/form-img.png"))); // NOI18N
        jPanel1.add(LogoSoulmate, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        UserInput1.setBackground(new java.awt.Color(255, 255, 255));
        UserInput1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 153), 3));

        icon_user1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-user-50.png"))); // NOI18N

        UsernameTxt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        UsernameTxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        UsernameTxt.setText("username");
        UsernameTxt.setBorder(null);
        UsernameTxt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                UsernameTxtFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                UsernameTxtFocusLost(evt);
            }
        });
        UsernameTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsernameTxtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout UserInput1Layout = new javax.swing.GroupLayout(UserInput1);
        UserInput1.setLayout(UserInput1Layout);
        UserInput1Layout.setHorizontalGroup(
            UserInput1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UserInput1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(icon_user1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(UsernameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );
        UserInput1Layout.setVerticalGroup(
            UserInput1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UserInput1Layout.createSequentialGroup()
                .addGroup(UserInput1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(UserInput1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(icon_user1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(UserInput1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(UsernameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(UserInput1, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 130, -1, -1));

        PasswordInput.setBackground(new java.awt.Color(255, 255, 255));
        PasswordInput.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 153), 3));

        icon_password.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        icon_password.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-password-50.png"))); // NOI18N
        icon_password.setVerifyInputWhenFocusTarget(false);
        icon_password.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        PasswordTxt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        PasswordTxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        PasswordTxt.setText("password");
        PasswordTxt.setBorder(null);
        PasswordTxt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                PasswordTxtFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                PasswordTxtFocusLost(evt);
            }
        });

        javax.swing.GroupLayout PasswordInputLayout = new javax.swing.GroupLayout(PasswordInput);
        PasswordInput.setLayout(PasswordInputLayout);
        PasswordInputLayout.setHorizontalGroup(
            PasswordInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PasswordInputLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(icon_password, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(PasswordTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PasswordInputLayout.setVerticalGroup(
            PasswordInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PasswordInputLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(icon_password, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(PasswordInputLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(PasswordTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(PasswordInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 260, 291, -1));

        BtnExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-cancel-40.png"))); // NOI18N
        BtnExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnExitMouseClicked(evt);
            }
        });
        jPanel1.add(BtnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 20, 37, -1));

        BtnLogin.setBackground(new java.awt.Color(51, 0, 153));
        BtnLogin.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        BtnLogin.setForeground(new java.awt.Color(255, 255, 255));
        BtnLogin.setText("Buat Akun");
        BtnLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnLoginMouseClicked(evt);
            }
        });
        BtnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnLoginActionPerformed(evt);
            }
        });
        jPanel1.add(BtnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 530, 291, 41));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("sudah punya akun ?");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 500, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 0, 153));
        jLabel2.setText("Masuk");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 500, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Buat username");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 100, -1, -1));

        PasswordInput1.setBackground(new java.awt.Color(255, 255, 255));
        PasswordInput1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 153), 3));

        icon_password1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        icon_password1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-password-50.png"))); // NOI18N
        icon_password1.setVerifyInputWhenFocusTarget(false);
        icon_password1.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        ConfirmPasswordTxt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        ConfirmPasswordTxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ConfirmPasswordTxt.setText("password");
        ConfirmPasswordTxt.setBorder(null);
        ConfirmPasswordTxt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                ConfirmPasswordTxtFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                ConfirmPasswordTxtFocusLost(evt);
            }
        });

        javax.swing.GroupLayout PasswordInput1Layout = new javax.swing.GroupLayout(PasswordInput1);
        PasswordInput1.setLayout(PasswordInput1Layout);
        PasswordInput1Layout.setHorizontalGroup(
            PasswordInput1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PasswordInput1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(icon_password1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ConfirmPasswordTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PasswordInput1Layout.setVerticalGroup(
            PasswordInput1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PasswordInput1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(icon_password1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(PasswordInput1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(ConfirmPasswordTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(PasswordInput1, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 390, 291, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("Konfirmasi password");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 360, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("Buat password");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 230, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1332, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    int xx, xy;
    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        // TODO add your handling code here:
        xx = evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_formMousePressed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        // TODO add your handling code here:
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xx, y - xy);
    }//GEN-LAST:event_formMouseDragged

    private void BtnExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnExitMouseClicked
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_BtnExitMouseClicked

    private void UsernameTxtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_UsernameTxtFocusGained
        // TODO add your handling code here:
        String userLabel = UsernameTxt.getText();
        if (userLabel.equals("username")) {
            UsernameTxt.setText("");
        }
    }//GEN-LAST:event_UsernameTxtFocusGained

    private void UsernameTxtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_UsernameTxtFocusLost
        // TODO add your handling code here:
        String userLabel = UsernameTxt.getText();
        if (userLabel.equals("") || userLabel.equals("username")) {
            UsernameTxt.setText("username");
        }
    }//GEN-LAST:event_UsernameTxtFocusLost

    private void PasswordTxtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_PasswordTxtFocusGained
        // TODO add your handling code here:
        String passwordLabel = PasswordTxt.getText();
        if (passwordLabel.equals("password")) {
            PasswordTxt.setText("");
        }
    }//GEN-LAST:event_PasswordTxtFocusGained

    private void PasswordTxtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_PasswordTxtFocusLost
        // TODO add your handling code here:
        String passwordLabel = PasswordTxt.getText();
        if (passwordLabel.equals("") || passwordLabel.equals("password")) {
            PasswordTxt.setText("password");
        }
    }//GEN-LAST:event_PasswordTxtFocusLost

    private void BtnLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnLoginMouseClicked
        // TODO add your handling code here:
        try {
            if (ConfirmPasswordTxt.getText().equals(PasswordTxt.getText())) {
                st = con.createStatement();

                String addAccount = "INSERT INTO account VALUES ('" + UsernameTxt.getText() + "','" + ConfirmPasswordTxt.getText() + "')";
                st.executeUpdate(addAccount);
                this.setVisible(false);
                JOptionPane.showMessageDialog(rootPane, "Anda berhasil membuat akun");

                new login_form().setVisible(true);
            } else {
                JOptionPane.showMessageDialog(rootPane, "Anda harus konfirmasi password anda");
            }
        } catch (Exception e) {
            Logger.getLogger(sigIn_form.class.getName()).log(Level.SEVERE, null, e);
        }
    }//GEN-LAST:event_BtnLoginMouseClicked

    private void BtnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnLoginActionPerformed

    private void ConfirmPasswordTxtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ConfirmPasswordTxtFocusGained
        // TODO add your handling code here:
        String passwordLabel = ConfirmPasswordTxt.getText();
        if (passwordLabel.equals("password")) {
            ConfirmPasswordTxt.setText("");
        }
    }//GEN-LAST:event_ConfirmPasswordTxtFocusGained

    private void ConfirmPasswordTxtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ConfirmPasswordTxtFocusLost
        // TODO add your handling code here:
        String passwordLabel = ConfirmPasswordTxt.getText();
        if (passwordLabel.equals("") || passwordLabel.equals("password")) {
            ConfirmPasswordTxt.setText("password");
        }
    }//GEN-LAST:event_ConfirmPasswordTxtFocusLost

    private void UsernameTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsernameTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UsernameTxtActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(sigIn_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(sigIn_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(sigIn_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(sigIn_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new sigIn_form().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BtnExit;
    private javax.swing.JButton BtnLogin;
    private javax.swing.JPasswordField ConfirmPasswordTxt;
    private javax.swing.JLabel LogoSoulmate;
    private javax.swing.JPanel PasswordInput;
    private javax.swing.JPanel PasswordInput1;
    private javax.swing.JPasswordField PasswordTxt;
    private javax.swing.JPanel UserInput1;
    private javax.swing.JTextField UsernameTxt;
    private javax.swing.JLabel icon_password;
    private javax.swing.JLabel icon_password1;
    private javax.swing.JLabel icon_user1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
