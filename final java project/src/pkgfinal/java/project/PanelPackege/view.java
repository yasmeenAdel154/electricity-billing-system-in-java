/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgfinal.java.project.PanelPackege;
import java.sql.*;
import java.util.*;
import javax.swing.JOptionPane;
import static pkgfinal.java.project.FinalJavaProject.*;
import javax.swing.table.*;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import pkgfinal.java.project.*;
import static pkgfinal.java.project.FinalJavaProject.*;
import static pkgfinal.java.project.FinalJavaProject.query;
import static pkgfinal.java.project.FinalJavaProject.r;
import static pkgfinal.java.project.FinalJavaProject.ss;


/**
 *
 * @author c.city
 */

public class view extends javax.swing.JPanel {
int indexOfCustomer;
    /**
     * Creates new form view
     */
    public view() {
        initComponents();
        
    }

    public view(int indexOfCustomer) {
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

        jButtonSearchview = new javax.swing.JButton();
        jTextFieldregion = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableOfbills = new javax.swing.JTable();

        jButtonSearchview.setText("Search");
        jButtonSearchview.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSearchviewActionPerformed(evt);
            }
        });

        jTableOfbills.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "User Name", "Meter Code", "Bill", "Region"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTableOfbills);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonSearchview, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 102, Short.MAX_VALUE)
                .addComponent(jTextFieldregion, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldregion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSearchview))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSearchviewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSearchviewActionPerformed
        
        String region = jTextFieldregion.getText();
        if(!region.equals("")){
        addRowToTable1(region);
        }
        else{
         JOptionPane.showMessageDialog(this, "Enter please metercode   ");
        }
    }//GEN-LAST:event_jButtonSearchviewActionPerformed
        private void addRowToTable1(String region) {
        DefaultTableModel model = (DefaultTableModel) jTableOfbills.getModel() ;
        model.setRowCount(0);
        Object data[] = new Object[4];
        query = "select * from  customer where region = '" + region + "'";
            try {
             r = ss.executeQuery(query) ;

             while (r.next()){
                data[0] =r.getString("userName") ;
                data[1] =r.getInt("meterCode") ;
                data[2] =r.getInt("bill") ;
                data[3] =r.getString("region") ;
                model.addRow(data);
             }
             
            }catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }  
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonSearchview;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableOfbills;
    private javax.swing.JTextField jTextFieldregion;
    // End of variables declaration//GEN-END:variables

    private void resetPanelData() {
        jTextFieldregion.setText("");
    }
}