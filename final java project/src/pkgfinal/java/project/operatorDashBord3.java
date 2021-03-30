package pkgfinal.java.project;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import pkgfinal.java.project.PanelPackege.*;

public class operatorDashBord3 extends javax.swing.JFrame {

    collect pcollect;
    print pprint;
    define pdefine;
    stop pstop;
    view pview;
    validate pvalidate;
    GridBagLayout layout = new GridBagLayout();
    double bill;

    public operatorDashBord3() {
        initComponents();
        initComponents();
        pcollect = new collect();
        pstop = new stop();
        pview = new view();
        pvalidate = new validate();
        pdefine = new define();
        pprint = new print();
        jPanelDynamicOperator.setLayout(layout);
        GridBagConstraints c = new GridBagConstraints();
        c.gridx = 0;
        c.gridy = 0;
        jPanelDynamicOperator.add(pcollect, c);
        jPanelDynamicOperator.add(pprint, c);
        jPanelDynamicOperator.add(pview, c);
        jPanelDynamicOperator.add(pstop, c);
        jPanelDynamicOperator.add(pdefine, c);
        jPanelDynamicOperator.add(pvalidate, c);
        pcollect.setVisible(false);
        pview.setVisible(false);
        pprint.setVisible(false);
        pvalidate.setVisible(false);
        pstop.setVisible(false);
        pdefine.setVisible(false);

    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelDynamicOperator = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jBcollect = new javax.swing.JButton();
        jBprint = new javax.swing.JButton();
        jBview = new javax.swing.JButton();
        jBstop = new javax.swing.JButton();
        jBdefine = new javax.swing.JButton();
        jBvalidate = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jPanelDynamicOperatorLayout = new javax.swing.GroupLayout(jPanelDynamicOperator);
        jPanelDynamicOperator.setLayout(jPanelDynamicOperatorLayout);
        jPanelDynamicOperatorLayout.setHorizontalGroup(
            jPanelDynamicOperatorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 588, Short.MAX_VALUE)
        );
        jPanelDynamicOperatorLayout.setVerticalGroup(
            jPanelDynamicOperatorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 369, Short.MAX_VALUE)
        );

        jBcollect.setText("collect payment");
        jBcollect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBcollectActionPerformed(evt);
            }
        });

        jBprint.setText(" print bill");
        jBprint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBprintActionPerformed(evt);
            }
        });

        jBview.setText("view all bills of specific region");
        jBview.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBviewActionPerformed(evt);
            }
        });

        jBstop.setText("stop meter");
        jBstop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBstopActionPerformed(evt);
            }
        });

        jBdefine.setText("define tariff");
        jBdefine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBdefineActionPerformed(evt);
            }
        });

        jBvalidate.setText("validate the reading");
        jBvalidate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBvalidateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBview, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBprint, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBcollect, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBstop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBdefine, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBvalidate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jBcollect)
                .addGap(38, 38, 38)
                .addComponent(jBprint)
                .addGap(39, 39, 39)
                .addComponent(jBview)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBstop)
                .addGap(34, 34, 34)
                .addComponent(jBdefine)
                .addGap(46, 46, 46)
                .addComponent(jBvalidate)
                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanelDynamicOperator, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelDynamicOperator, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBcollectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBcollectActionPerformed
        
        pcollect.setVisible(true);
        pview.setVisible(false);
        pprint.setVisible(false);
        pvalidate.setVisible(false);
        pstop.setVisible(false);
        pdefine.setVisible(false);

    }//GEN-LAST:event_jBcollectActionPerformed

    private void jBprintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBprintActionPerformed
        pcollect.setVisible(false);
        pview.setVisible(false);
        pprint.setVisible(true);
        pvalidate.setVisible(false);
        pstop.setVisible(false);
        pdefine.setVisible(false);    }//GEN-LAST:event_jBprintActionPerformed

    private void jBstopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBstopActionPerformed
        pcollect.setVisible(false);
        pview.setVisible(false);
        pprint.setVisible(false);
        pvalidate.setVisible(false);
        pstop.setVisible(true);
        pdefine.setVisible(false);    }//GEN-LAST:event_jBstopActionPerformed

    private void jBviewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBviewActionPerformed
        pcollect.setVisible(false);
        pview.setVisible(true);
        pprint.setVisible(false);
        pvalidate.setVisible(false);
        pstop.setVisible(false);
        pdefine.setVisible(false);    }//GEN-LAST:event_jBviewActionPerformed

    private void jBdefineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBdefineActionPerformed
        pcollect.setVisible(false);
        pview.setVisible(false);
        pprint.setVisible(false);
        pvalidate.setVisible(false);
        pstop.setVisible(false);
        pdefine.setVisible(true);    }//GEN-LAST:event_jBdefineActionPerformed

    private void jBvalidateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBvalidateActionPerformed
        pcollect.setVisible(false);
        pview.setVisible(false);
        pprint.setVisible(false);
        pvalidate.setVisible(true);
        pstop.setVisible(false);
        pdefine.setVisible(false);    }//GEN-LAST:event_jBvalidateActionPerformed

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
            java.util.logging.Logger.getLogger(operatorDashBord3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(operatorDashBord3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(operatorDashBord3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(operatorDashBord3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new operatorDashBord3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBcollect;
    private javax.swing.JButton jBdefine;
    private javax.swing.JButton jBprint;
    private javax.swing.JButton jBstop;
    private javax.swing.JButton jBvalidate;
    private javax.swing.JButton jBview;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelDynamicOperator;
    // End of variables declaration//GEN-END:variables
}
