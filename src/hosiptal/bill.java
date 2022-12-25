/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package hosiptal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Amr Said
 */
public class bill extends javax.swing.JFrame {

    /**
     * Creates new form bill
     */
     DefaultTableModel dtm;
    Connection con4;
  ArrayList<Integer> id=new ArrayList<>();
    public bill() {
        initComponents();
         this.setLocationRelativeTo(null);
    dtm=new DefaultTableModel();
    dtm.addColumn("Id");
    dtm.addColumn("Doctor Name");
    dtm.addColumn("Date");
    dtm.addColumn("Amount");
        try {
          con4=DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital_2", "root", "amr01069791974");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Connection FAILED");
        }
   //fillcomboBox();
   filltable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
     private void filltable(){
     try {
         
         dtm.setRowCount(0);
            PreparedStatement stm=con4.prepareStatement("select bill_no,doctor_name,Date,amount from bill_table" );
           ResultSet rs= stm.executeQuery();
           while(rs.next()){
         dtm.addRow(new Object[]{rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4)});
            id.add(rs.getInt(1));
           }
           table4.setModel(dtm);
        } catch (SQLException ex) {
           // Logger.getLogger(patient.class.getName()).log(Level.SEVERE, null, ex);
           JOptionPane.showMessageDialog(this, "ERROR");
        }
    
    
    }
    
    
    
    
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        date = new javax.swing.JTextField();
        docname = new javax.swing.JTextField();
        amount = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table4 = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Doctor name");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 47, 120, 36));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Date");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 105, 78, 31));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Amount");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 168, 59, 27));
        jPanel1.add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(136, 110, 250, -1));
        jPanel1.add(docname, new org.netbeans.lib.awtextra.AbsoluteConstraints(136, 55, 250, -1));

        amount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                amountActionPerformed(evt);
            }
        });
        jPanel1.add(amount, new org.netbeans.lib.awtextra.AbsoluteConstraints(136, 171, 250, -1));

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setText("Save");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(542, 470, 120, 32));

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton2.setText("←");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 50, 30));

        table4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(table4);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 246, -1, 260));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hosiptal/photo/back.jpg"))); // NOI18N
        jLabel5.setText("jLabel5");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(-2, 0, 680, 520));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 518));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.dispose();
      new patient().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void amountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_amountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_amountActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         if(
                !docname.getText().isEmpty()&&!amount.getText().isEmpty()){
        try {
     //      dtm.setRowCount(0); 
            // TODO add your handling code here:
            int m=0;
             PreparedStatement stm2=con4.prepareStatement("select doc_name from doctor");
             ResultSet rs2=stm2.executeQuery();
             while(rs2.next()){
             if(docname.getText().equals(rs2.getString(1)))
             {
                 m=1;
             }
             
             
             }
             if(m==0){
             JOptionPane.showMessageDialog(this, "please select existed doctor");
             
             }
             if(m==1){
            PreparedStatement stm=con4.prepareStatement("insert into bill_table  (doctor_name,amount,date)values(?,?,?)");
            stm.setString(1, docname.getText());
            stm.setString(2,amount.getText());
            stm.setString(3, date.getText());
            stm.executeUpdate();
            JOptionPane.showMessageDialog(this, "Saved successfully");
            filltable();
             docname.setText(null);
            date.setText(null);
            amount.setText(null);
        }} catch (SQLException ex) {
           JOptionPane.showMessageDialog(this,"Error");
        }}
        else
            JOptionPane.showMessageDialog(this,"Not Saved...Fill all data");   
        
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(bill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(bill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(bill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(bill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new bill().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField amount;
    private javax.swing.JTextField date;
    private javax.swing.JTextField docname;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table4;
    // End of variables declaration//GEN-END:variables
}
