package pkgfinal.java.project.PanelPackege;

import javax.swing.JOptionPane;
import static pkgfinal.java.project.FinalJavaProject.arr;
import pkgfinal.java.project.oldCustomer;

public class reading extends javax.swing.JPanel {

    int index;
    int read, month, year;

    public reading() {

        initComponents();
    }
    oldCustomer old = new oldCustomer();

    public reading(int index) {

        initComponents();
        this.index = index;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTreading = new javax.swing.JTextField();
        jBreading = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTmonth = new javax.swing.JTextField();
        jTyear = new javax.swing.JTextField();

        jLabel1.setText("enter the monthly reading");

        jBreading.setText("enter");
        jBreading.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBreadingActionPerformed(evt);
            }
        });

        jLabel2.setText("enter the month");

        jLabel3.setText("enter the year");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jBreading)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTreading, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                    .addComponent(jTmonth)
                    .addComponent(jTyear))
                .addGap(87, 87, 87))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTmonth, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTyear, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTreading, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addComponent(jBreading)
                .addGap(66, 66, 66))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jBreadingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBreadingActionPerformed

        if (jTreading.getText().equals("") && jTmonth.getText().equals("") && jTyear.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Please Fill All Information");

        } else {
            read = (Integer.parseInt(jTreading.getText()));
            month = (Integer.parseInt(jTmonth.getText()));
            year = (Integer.parseInt(jTyear.getText()));
            if ( arr.get(index).numberOfReadings == 0 ){
                old.insertReading(read, index, month, year);
                JOptionPane.showMessageDialog(this, "The Reading Is Added");
            }
            else if ( read >= arr.get(index).reading.get(arr.get(index).numberOfReadings-1).monthlyReading){
                old.insertReading(read, index, month, year);
                JOptionPane.showMessageDialog(this, "The Reading Is Added");
            }
            else{
                JOptionPane.showMessageDialog(this, "The reading is incorrect ");
                resetPanelData();
            }
            resetPanelData();
        }
    }//GEN-LAST:event_jBreadingActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBreading;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField jTmonth;
    private javax.swing.JTextField jTreading;
    private javax.swing.JTextField jTyear;
    // End of variables declaration//GEN-END:variables
     private void resetPanelData() {
        jTreading.setText("");
        jTmonth.setText("");
        jTyear.setText("");
    }
}
