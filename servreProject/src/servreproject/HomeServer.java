/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servreproject;

/**
 *
 * @author dnegm
 */
public class HomeServer extends javax.swing.JFrame {

    /**
     * Creates new form HomeServer
     */
    public HomeServer() {
        initComponents();
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
        jPanel2 = new javax.swing.JPanel();
        up1 = new javax.swing.JPanel();
        mainManu1 = new javax.swing.JButton();
        mainManu5 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        down1 = new javax.swing.JPanel();
        listFrend3 = new javax.swing.JButton();
        listFrend4 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        center1 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        page1 = new javax.swing.JPanel();
        up = new javax.swing.JPanel();
        mainManu = new javax.swing.JButton();
        mainManu4 = new javax.swing.JButton();
        down = new javax.swing.JPanel();
        listFrend1 = new javax.swing.JButton();
        listFrend2 = new javax.swing.JButton();
        center = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        ipnumber = new javax.swing.JTextField();
        close = new javax.swing.JButton();
        start = new javax.swing.JButton();
        listFrend = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.CardLayout());

        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel2.setBackground(new java.awt.Color(37, 21, 123));

        up1.setBackground(new java.awt.Color(37, 21, 123));
        up1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        mainManu1.setFont(new java.awt.Font("DejaVu Serif", 1, 14)); // NOI18N
        mainManu1.setForeground(new java.awt.Color(29, 43, 138));
        mainManu1.setText("Home Server");
        mainManu1.setActionCommand("Home Server ");

        mainManu5.setFont(new java.awt.Font("DejaVu Serif", 1, 14)); // NOI18N
        mainManu5.setForeground(new java.awt.Color(29, 43, 138));
        mainManu5.setText("Log");
        mainManu5.setActionCommand("Home Server ");

        javax.swing.GroupLayout up1Layout = new javax.swing.GroupLayout(up1);
        up1.setLayout(up1Layout);
        up1Layout.setHorizontalGroup(
            up1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(up1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mainManu1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mainManu5, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(272, Short.MAX_VALUE))
        );
        up1Layout.setVerticalGroup(
            up1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, up1Layout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addGroup(up1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mainManu1)
                    .addComponent(mainManu5))
                .addGap(28, 28, 28))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 484, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(up1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 103, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addComponent(up1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 12, Short.MAX_VALUE)))
        );

        jPanel1.add(jPanel2, java.awt.BorderLayout.PAGE_START);

        jPanel3.setBackground(new java.awt.Color(37, 21, 123));

        down1.setBackground(new java.awt.Color(37, 21, 123));
        down1.setBorder(null);

        listFrend3.setFont(new java.awt.Font("DejaVu Serif", 0, 14)); // NOI18N
        listFrend3.setForeground(new java.awt.Color(29, 43, 138));
        listFrend3.setText("Hide");
        listFrend3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listFrend3ActionPerformed(evt);
            }
        });

        listFrend4.setFont(new java.awt.Font("DejaVu Serif", 0, 14)); // NOI18N
        listFrend4.setForeground(new java.awt.Color(29, 43, 138));
        listFrend4.setText("Exit");
        listFrend4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listFrend4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout down1Layout = new javax.swing.GroupLayout(down1);
        down1.setLayout(down1Layout);
        down1Layout.setHorizontalGroup(
            down1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, down1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(listFrend3, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 253, Short.MAX_VALUE)
                .addComponent(listFrend4, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );
        down1Layout.setVerticalGroup(
            down1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, down1Layout.createSequentialGroup()
                .addContainerGap(62, Short.MAX_VALUE)
                .addGroup(down1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(listFrend3)
                    .addComponent(listFrend4))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 484, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(0, 14, Short.MAX_VALUE)
                    .addComponent(down1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 14, Short.MAX_VALUE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 103, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(down1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel1.add(jPanel3, java.awt.BorderLayout.PAGE_END);

        jPanel4.setBackground(new java.awt.Color(37, 21, 123));

        center1.setBackground(new java.awt.Color(37, 21, 123));

        jPanel5.setBackground(new java.awt.Color(37, 21, 123));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 432, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 365, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout center1Layout = new javax.swing.GroupLayout(center1);
        center1.setLayout(center1Layout);
        center1Layout.setHorizontalGroup(
            center1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(center1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        center1Layout.setVerticalGroup(
            center1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(center1Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel2.setFont(new java.awt.Font("DejaVu Serif", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(21, 130, 238));
        jLabel2.setText("Log");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(center1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(377, 377, 377))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(center1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel4, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel1, "card3");

        page1.setBackground(new java.awt.Color(14, 25, 121));
        page1.setLayout(new java.awt.BorderLayout());

        up.setBackground(new java.awt.Color(37, 21, 123));
        up.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        mainManu.setFont(new java.awt.Font("DejaVu Serif", 1, 14)); // NOI18N
        mainManu.setForeground(new java.awt.Color(29, 43, 138));
        mainManu.setText("Home Server");
        mainManu.setActionCommand("Home Server ");

        mainManu4.setFont(new java.awt.Font("DejaVu Serif", 1, 14)); // NOI18N
        mainManu4.setForeground(new java.awt.Color(29, 43, 138));
        mainManu4.setText("Log");
        mainManu4.setActionCommand("Home Server ");

        javax.swing.GroupLayout upLayout = new javax.swing.GroupLayout(up);
        up.setLayout(upLayout);
        upLayout.setHorizontalGroup(
            upLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(upLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mainManu, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mainManu4, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(272, Short.MAX_VALUE))
        );
        upLayout.setVerticalGroup(
            upLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, upLayout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(upLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mainManu)
                    .addComponent(mainManu4))
                .addGap(28, 28, 28))
        );

        page1.add(up, java.awt.BorderLayout.PAGE_START);

        down.setBackground(new java.awt.Color(37, 21, 123));
        down.setBorder(null);

        listFrend1.setFont(new java.awt.Font("DejaVu Serif", 0, 14)); // NOI18N
        listFrend1.setForeground(new java.awt.Color(29, 43, 138));
        listFrend1.setText("Hide");
        listFrend1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listFrend1ActionPerformed(evt);
            }
        });

        listFrend2.setFont(new java.awt.Font("DejaVu Serif", 0, 14)); // NOI18N
        listFrend2.setForeground(new java.awt.Color(29, 43, 138));
        listFrend2.setText("Exit");
        listFrend2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listFrend2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout downLayout = new javax.swing.GroupLayout(down);
        down.setLayout(downLayout);
        downLayout.setHorizontalGroup(
            downLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, downLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(listFrend1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 281, Short.MAX_VALUE)
                .addComponent(listFrend2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );
        downLayout.setVerticalGroup(
            downLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, downLayout.createSequentialGroup()
                .addContainerGap(62, Short.MAX_VALUE)
                .addGroup(downLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(listFrend1)
                    .addComponent(listFrend2))
                .addContainerGap())
        );

        page1.add(down, java.awt.BorderLayout.PAGE_END);

        center.setBackground(new java.awt.Color(37, 21, 123));

        jLabel1.setFont(new java.awt.Font("DejaVu Serif", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(222, 237, 240));
        jLabel1.setText("Ip Server : :");

        ipnumber.setText("172,0,0,1");

        close.setFont(new java.awt.Font("DejaVu Serif", 0, 14)); // NOI18N
        close.setForeground(new java.awt.Color(29, 43, 138));
        close.setText("Stope Server");

        start.setFont(new java.awt.Font("DejaVu Serif", 0, 14)); // NOI18N
        start.setForeground(new java.awt.Color(29, 43, 138));
        start.setText("Start Server");

        listFrend.setFont(new java.awt.Font("DejaVu Serif", 0, 14)); // NOI18N
        listFrend.setForeground(new java.awt.Color(29, 43, 138));
        listFrend.setText("Users Stautse");

        javax.swing.GroupLayout centerLayout = new javax.swing.GroupLayout(center);
        center.setLayout(centerLayout);
        centerLayout.setHorizontalGroup(
            centerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, centerLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ipnumber, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(124, 124, 124))
            .addGroup(centerLayout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addGroup(centerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(listFrend, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(close, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(start, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        centerLayout.setVerticalGroup(
            centerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(centerLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(centerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ipnumber, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addComponent(start, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(close, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(listFrend, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(176, Short.MAX_VALUE))
        );

        page1.add(center, java.awt.BorderLayout.CENTER);

        getContentPane().add(page1, "card2");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void listFrend1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listFrend1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_listFrend1ActionPerformed

    private void listFrend2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listFrend2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_listFrend2ActionPerformed

    private void listFrend3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listFrend3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_listFrend3ActionPerformed

    private void listFrend4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listFrend4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_listFrend4ActionPerformed

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
            java.util.logging.Logger.getLogger(HomeServer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomeServer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomeServer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomeServer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomeServer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel center;
    private javax.swing.JPanel center1;
    private javax.swing.JButton close;
    private javax.swing.JPanel down;
    private javax.swing.JPanel down1;
    private javax.swing.JTextField ipnumber;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JButton listFrend;
    private javax.swing.JButton listFrend1;
    private javax.swing.JButton listFrend2;
    private javax.swing.JButton listFrend3;
    private javax.swing.JButton listFrend4;
    private javax.swing.JButton mainManu;
    private javax.swing.JButton mainManu1;
    private javax.swing.JButton mainManu4;
    private javax.swing.JButton mainManu5;
    private javax.swing.JPanel page1;
    private javax.swing.JButton start;
    private javax.swing.JPanel up;
    private javax.swing.JPanel up1;
    // End of variables declaration//GEN-END:variables
}