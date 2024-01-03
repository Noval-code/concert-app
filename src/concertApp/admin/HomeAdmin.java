/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package concertApp.admin;

/**
 *
 * @author muhammad noval aula
 */
public class HomeAdmin extends javax.swing.JFrame {

    /**
     * Creates new form HomePage
     */
    public HomeAdmin() {
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

        jDialog1 = new javax.swing.JDialog();
        jPanel1 = new javax.swing.JPanel();
        scheduleBtn = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        icon_ticket2 = new javax.swing.JLabel();
        reportBtn = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        icon_ticket3 = new javax.swing.JLabel();
        addConcertBtn = new javax.swing.JPanel();
        label_addConcert = new javax.swing.JLabel();
        concert_icon = new javax.swing.JLabel();
        TicketBtn = new javax.swing.JPanel();
        label_addConcert1 = new javax.swing.JLabel();
        concert_icon1 = new javax.swing.JLabel();
        ScannerBtn = new javax.swing.JPanel();
        label_addConcert2 = new javax.swing.JLabel();
        concert_icon2 = new javax.swing.JLabel();
        exitBtn1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        icon_ticket4 = new javax.swing.JLabel();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        scheduleBtn.setBackground(new java.awt.Color(204, 204, 255));
        scheduleBtn.setPreferredSize(new java.awt.Dimension(165, 131));
        scheduleBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                scheduleBtnMouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Jadwal Konser");

        icon_ticket2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-schedule-70.png"))); // NOI18N

        javax.swing.GroupLayout scheduleBtnLayout = new javax.swing.GroupLayout(scheduleBtn);
        scheduleBtn.setLayout(scheduleBtnLayout);
        scheduleBtnLayout.setHorizontalGroup(
            scheduleBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(scheduleBtnLayout.createSequentialGroup()
                .addGroup(scheduleBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(scheduleBtnLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel3))
                    .addGroup(scheduleBtnLayout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(icon_ticket2)))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        scheduleBtnLayout.setVerticalGroup(
            scheduleBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, scheduleBtnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(icon_ticket2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(14, 14, 14))
        );

        reportBtn.setBackground(new java.awt.Color(204, 204, 255));
        reportBtn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        reportBtn.setPreferredSize(new java.awt.Dimension(165, 131));
        reportBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reportBtnMouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("Laporan");

        icon_ticket3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-report-70.png"))); // NOI18N

        javax.swing.GroupLayout reportBtnLayout = new javax.swing.GroupLayout(reportBtn);
        reportBtn.setLayout(reportBtnLayout);
        reportBtnLayout.setHorizontalGroup(
            reportBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(reportBtnLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(reportBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(reportBtnLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel4))
                    .addComponent(icon_ticket3))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        reportBtnLayout.setVerticalGroup(
            reportBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, reportBtnLayout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(icon_ticket3, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(19, 19, 19))
        );

        addConcertBtn.setBackground(new java.awt.Color(204, 204, 255));
        addConcertBtn.setPreferredSize(new java.awt.Dimension(165, 131));
        addConcertBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addConcertBtnMouseClicked(evt);
            }
        });

        label_addConcert.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        label_addConcert.setText("Tambah Konser");

        concert_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-circus-70.png"))); // NOI18N

        javax.swing.GroupLayout addConcertBtnLayout = new javax.swing.GroupLayout(addConcertBtn);
        addConcertBtn.setLayout(addConcertBtnLayout);
        addConcertBtnLayout.setHorizontalGroup(
            addConcertBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addConcertBtnLayout.createSequentialGroup()
                .addGroup(addConcertBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(addConcertBtnLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(label_addConcert))
                    .addGroup(addConcertBtnLayout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(concert_icon)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        addConcertBtnLayout.setVerticalGroup(
            addConcertBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addConcertBtnLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(concert_icon, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label_addConcert)
                .addGap(14, 14, 14))
        );

        TicketBtn.setBackground(new java.awt.Color(204, 204, 255));
        TicketBtn.setPreferredSize(new java.awt.Dimension(165, 131));
        TicketBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TicketBtnMouseClicked(evt);
            }
        });

        label_addConcert1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        label_addConcert1.setText("Tambah Tiket");

        concert_icon1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-ticket-70.png"))); // NOI18N

        javax.swing.GroupLayout TicketBtnLayout = new javax.swing.GroupLayout(TicketBtn);
        TicketBtn.setLayout(TicketBtnLayout);
        TicketBtnLayout.setHorizontalGroup(
            TicketBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TicketBtnLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(concert_icon1)
                .addContainerGap(48, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TicketBtnLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(label_addConcert1)
                .addGap(25, 25, 25))
        );
        TicketBtnLayout.setVerticalGroup(
            TicketBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TicketBtnLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(concert_icon1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label_addConcert1)
                .addGap(14, 14, 14))
        );

        ScannerBtn.setBackground(new java.awt.Color(204, 204, 255));
        ScannerBtn.setPreferredSize(new java.awt.Dimension(165, 131));
        ScannerBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ScannerBtnMouseClicked(evt);
            }
        });

        label_addConcert2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        label_addConcert2.setText("Scan QR");

        concert_icon2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-qr-code-70.png"))); // NOI18N

        javax.swing.GroupLayout ScannerBtnLayout = new javax.swing.GroupLayout(ScannerBtn);
        ScannerBtn.setLayout(ScannerBtnLayout);
        ScannerBtnLayout.setHorizontalGroup(
            ScannerBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ScannerBtnLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(ScannerBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label_addConcert2)
                    .addComponent(concert_icon2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ScannerBtnLayout.setVerticalGroup(
            ScannerBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ScannerBtnLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(concert_icon2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label_addConcert2)
                .addGap(14, 14, 14))
        );

        exitBtn1.setBackground(new java.awt.Color(204, 204, 255));
        exitBtn1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        exitBtn1.setPreferredSize(new java.awt.Dimension(165, 131));
        exitBtn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitBtn1MouseClicked(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("keluar");

        icon_ticket4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-exit-70.png"))); // NOI18N

        javax.swing.GroupLayout exitBtn1Layout = new javax.swing.GroupLayout(exitBtn1);
        exitBtn1.setLayout(exitBtn1Layout);
        exitBtn1Layout.setHorizontalGroup(
            exitBtn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(exitBtn1Layout.createSequentialGroup()
                .addGroup(exitBtn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(exitBtn1Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jLabel5))
                    .addGroup(exitBtn1Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(icon_ticket4)))
                .addContainerGap(58, Short.MAX_VALUE))
        );
        exitBtn1Layout.setVerticalGroup(
            exitBtn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, exitBtn1Layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(icon_ticket4, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(153, 153, 153)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(reportBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                        .addComponent(exitBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addConcertBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TicketBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(scheduleBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                            .addComponent(ScannerBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE))))
                .addContainerGap(161, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(scheduleBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addConcertBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TicketBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ScannerBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(reportBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(exitBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(81, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void reportBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reportBtnMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        new Report().setVisible(true);
    }//GEN-LAST:event_reportBtnMouseClicked

    private void addConcertBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addConcertBtnMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        new singer().setVisible(true);
    }//GEN-LAST:event_addConcertBtnMouseClicked

    private void scheduleBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_scheduleBtnMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        new ScheduleAdmin().setVisible(true);
    }//GEN-LAST:event_scheduleBtnMouseClicked

    private void TicketBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TicketBtnMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        new Ticket().setVisible(true);
    }//GEN-LAST:event_TicketBtnMouseClicked

    private void ScannerBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ScannerBtnMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        new ScanQR().setVisible(true);
    }//GEN-LAST:event_ScannerBtnMouseClicked

    private void exitBtn1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitBtn1MouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_exitBtn1MouseClicked

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
            java.util.logging.Logger.getLogger(HomeAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomeAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomeAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomeAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomeAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ScannerBtn;
    private javax.swing.JPanel TicketBtn;
    private javax.swing.JPanel addConcertBtn;
    private javax.swing.JLabel concert_icon;
    private javax.swing.JLabel concert_icon1;
    private javax.swing.JLabel concert_icon2;
    private javax.swing.JPanel exitBtn1;
    private javax.swing.JLabel icon_ticket2;
    private javax.swing.JLabel icon_ticket3;
    private javax.swing.JLabel icon_ticket4;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel label_addConcert;
    private javax.swing.JLabel label_addConcert1;
    private javax.swing.JLabel label_addConcert2;
    private javax.swing.JPanel reportBtn;
    private javax.swing.JPanel scheduleBtn;
    // End of variables declaration//GEN-END:variables
}
