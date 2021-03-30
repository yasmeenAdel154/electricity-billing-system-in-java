/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgfinal.java.project.PanelPackege;

import javax.swing.table.*;
import pkgfinal.java.project.*;
import static pkgfinal.java.project.FinalJavaProject.*;

/**
 *
 * @author win7win7
 */
public class viewAllBillsOfSpecificRegion extends javax.swing.JPanel {
int indexOfCustomer;
    /**
     * Creates new form viewAllBillsOfSpecificRegion
     */
    public viewAllBillsOfSpecificRegion() {
        initComponents();
    }
     public viewAllBillsOfSpecificRegion(int indexOfCustomer) {
        initComponents();
    
            this.indexOfCustomer=indexOfCustomer;

}

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTableOfBills = new javax.swing.JTable();
        jButtonSearch = new javax.swing.JButton();
        jTextFieldRegion = new javax.swing.JTextField();

        jTableOfBills.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "User Name", "Meter Code", "Bill"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTableOfBills);

        jButtonSearch.setText("Search");
        jButtonSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(jTextFieldRegion, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(62, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSearch)
                    .addComponent(jTextFieldRegion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSearchActionPerformed
        String region = jTextFieldRegion.getText();
        addRowToTable(region);
    }//GEN-LAST:event_jButtonSearchActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonSearch;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableOfBills;
    private javax.swing.JTextField jTextFieldRegion;
    // End of variables declaration//GEN-END:variables

    private void addRowToTable(String region) {
        DefaultTableModel model = (DefaultTableModel) jTableOfBills.getModel() ;
        model.setRowCount(0);
        Object data[] = new Object[3];
        for (int i=0 ; i< numberOfCustomers ; i++){
            if (region.equals(arr.get(i).region)){
                data[0] = arr.get(i).userName;
                data[1] = arr.get(i).meterCode ;
                data[2] = arr.get(i).bill ;
                model.addRow(data);
            }
        }
    }
}