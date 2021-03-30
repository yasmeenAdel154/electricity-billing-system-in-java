
package pkgfinal.java.project.PanelPackege;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import pkgfinal.java.project.*;
import javax.swing.table.*;
import static pkgfinal.java.project.customer.indexOfMeterCode;
import static pkgfinal.java.project.FinalJavaProject.*;
import static pkgfinal.java.project.FinalJavaProject.query;
import static pkgfinal.java.project.FinalJavaProject.r;
import static pkgfinal.java.project.FinalJavaProject.ss;

public class validate extends javax.swing.JPanel {
int indexOfCustomer;
   
    public validate() {
        initComponents();
    }

    public validate(int indexOfCustomer) {
        initComponents();
    
            this.indexOfCustomer=indexOfCustomer;

}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTextFieldmeterCode1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldmonthlyReading1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableReading = new javax.swing.JTable();

        jLabel1.setText("Enter meterCode");

        jTextFieldmeterCode1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldmeterCode1ActionPerformed(evt);
            }
        });

        jLabel2.setText("Enter monthlyReading");

        jButton1.setText("Vaildate");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTableReading.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "metercode", "montlyReading", "month", "year", "day"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTableReading);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextFieldmeterCode1)
                    .addComponent(jTextFieldmonthlyReading1, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE))
                .addGap(110, 110, 110))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(25, 25, 25))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldmeterCode1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldmonthlyReading1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldmeterCode1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldmeterCode1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldmeterCode1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String meter = jTextFieldmeterCode1.getText();
        String reading = jTextFieldmonthlyReading1.getText() ;        
        if (!meter.equals("")&& !reading.equals("")){
            int meterCode = Integer.parseInt(meter) ;
            int monthlyReading = Integer.parseInt(reading);
            validateReadingGUI(meterCode,monthlyReading);
            resetPanelData();
        }
        else
        {
            JOptionPane.showMessageDialog(this, "Please Fill All Information");
        }
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableReading;
    private javax.swing.JTextField jTextFieldmeterCode1;
    private javax.swing.JTextField jTextFieldmonthlyReading1;
    // End of variables declaration//GEN-END:variables
        public void validateReadingGUI(int meterCode,int montlyReading) {
        int count = 0, j,realR;
        int index = indexOfMeterCode(meterCode);
        for (j = 0; j < arr.get(index).numberOfReadings; j++) {
                }
        realR =arr.get(index).reading.get(j-1).monthlyReading;
        if (montlyReading==realR) {
            JOptionPane.showMessageDialog(this, "True ");
            addRowToTable(meterCode);
            resetPanelData();
        } else {
            JOptionPane.showMessageDialog(this, "false ");
            addRowToTable(meterCode);
            resetPanelData();
        }
    }
            public void resetPanelData() {
        jTextFieldmeterCode1.setText("");
        jTextFieldmonthlyReading1.setText("");

    }
            
    public void addRowToTable(int metercode) {
        DefaultTableModel model = (DefaultTableModel) jTableReading.getModel() ;
        model.setRowCount(0);
        Object data[] = new Object[5];
         query = "select*from reading where meterCode = " + metercode + "order by  monthlyReading";
            try {
             r = ss.executeQuery(query) ;
             while (r.next()){
                data[0] =r.getInt("meterCode") ;
                data[1] =r.getInt("monthlyReading") ;
                data[2] =r.getInt("month") ;
                data[3] =r.getInt("year") ;
                data[4] =r.getInt("day") ;
                model.addRow(data);
             }
             
            }catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }  
    }
    
        /*    int indexOfMeterCode(int meterCode) {

        for (int i = 0; i < numberOfCustomers; i++) {
            if (meterCode == arr.get(i).meterCode) {
                return i;
            }

        }
        return -1;
    }*/
}
