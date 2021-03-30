/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgfinal.java.project;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import pkgfinal.java.project.PanelPackege.complain;
import pkgfinal.java.project.PanelPackege.pay;
import pkgfinal.java.project.PanelPackege.reading;

/**
 *
 * @author win7win7
 */
public class oldCustomerDashBoard extends javax.swing.JFrame {

    pay ppay;
    reading preading;
    complain pcomplain;
    GridBagLayout layout = new GridBagLayout();

    int indexOfCustomer;
    double bill;

    public oldCustomerDashBoard(int indexOfCustomer) {
        initComponents();
        this.indexOfCustomer = indexOfCustomer;
        ppay = new pay(indexOfCustomer);
        preading = new reading(indexOfCustomer);
        pcomplain = new complain(indexOfCustomer);
        GridBagLayout layout = new GridBagLayout();

        dynamicpanaloldcustomer.setLayout(layout);
        GridBagConstraints c = new GridBagConstraints();
        c.gridx = 0;
        c.gridy = 0;
        dynamicpanaloldcustomer.add(ppay, c);
        dynamicpanaloldcustomer.add(preading, c);
        dynamicpanaloldcustomer.add(pcomplain, c);

        ppay.setVisible(false);
        preading.setVisible(false);
        pcomplain.setVisible(false);

    }

    public oldCustomerDashBoard() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        bpay = new javax.swing.JButton();
        breading = new javax.swing.JButton();
        bcomplain = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        dynamicpanaloldcustomer = new javax.swing.JPanel();

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

        bpay.setText("pay");
        bpay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bpayActionPerformed(evt);
            }
        });

        breading.setText("reading");
        breading.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                breadingActionPerformed(evt);
            }
        });

        bcomplain.setText("complain");
        bcomplain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bcomplainActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(bcomplain, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                    .addComponent(bpay, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(breading, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(bpay)
                .addGap(71, 71, 71)
                .addComponent(breading)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bcomplain)
                .addGap(58, 58, 58))
        );

        jPanel3.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout dynamicpanaloldcustomerLayout = new javax.swing.GroupLayout(dynamicpanaloldcustomer);
        dynamicpanaloldcustomer.setLayout(dynamicpanaloldcustomerLayout);
        dynamicpanaloldcustomerLayout.setHorizontalGroup(
            dynamicpanaloldcustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 359, Short.MAX_VALUE)
        );
        dynamicpanaloldcustomerLayout.setVerticalGroup(
            dynamicpanaloldcustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dynamicpanaloldcustomer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
            .addComponent(dynamicpanaloldcustomer, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bcomplainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bcomplainActionPerformed
        oldCustomer old = new oldCustomer();
        pcomplain.setVisible(true);
        preading.setVisible(false);
        ppay.setVisible(false);
    }//GEN-LAST:event_bcomplainActionPerformed

    private void bpayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bpayActionPerformed
        customer c = new customer();
        bill = c.payGui(indexOfCustomer);
        ppay.bill = bill;
        ppay.fillRows(bill);
        ppay.setVisible(true);
        preading.setVisible(false);
        pcomplain.setVisible(false);
    }//GEN-LAST:event_bpayActionPerformed

    private void breadingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_breadingActionPerformed
        pcomplain.setVisible(false);
        preading.setVisible(true);
        ppay.setVisible(false);
    }//GEN-LAST:event_breadingActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(oldCustomerDashBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(oldCustomerDashBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(oldCustomerDashBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(oldCustomerDashBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new oldCustomerDashBoard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bcomplain;
    private javax.swing.JButton bpay;
    private javax.swing.JButton breading;
    private javax.swing.JPanel dynamicpanaloldcustomer;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
