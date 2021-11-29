package GUI;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Owner
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import javax.swing.JOptionPane;

public class CheckIn extends javax.swing.JFrame {

    // create 2D array. Rows wil be A-E, columns 1-9
    // if someone selects B3 then its [1][2] (i think)
    public static String [][] garage = new String[5][10];
    public static ArrayList<String> a = new ArrayList<String>();
    public static ArrayList<String> b = new ArrayList<String>();
    public static ArrayList<String> c = new ArrayList<String>();
    public static ArrayList<String> d = new ArrayList<String>();
    public static ArrayList<String> e = new ArrayList<String>();
    // arraylist holding the spots filled by vehicles
    public static ArrayList<String> leave = new ArrayList<String>();
    public static String selectedValue = "";
    public static String floor;
    public static String spotNumeral;
    public static String takenSpot = "X";
    public static int counter = 0;
    /**
     * Creates new form CheckIn
     */
    public CheckIn() {
        initComponents();
        
        if (counter == 0){
        for(int i = 0; i < 9; i++) {
            a.add("A" + String.valueOf(i + 1));
        }
        for(int i = 0; i < 9; i++) {
            b.add("B" + String.valueOf(i + 1));
        }
        for(int i = 0; i < 9; i++) {
            c.add("C" + String.valueOf(i + 1));
        }
        for(int i = 0; i < 9; i++) {
            d.add("D" + String.valueOf(i + 1));
        }
        for(int i = 0; i < 9; i++) {
            e.add("E" + String.valueOf(i + 1));
        } 
        counter++;
        }
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(a.toArray()));
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(b.toArray()));
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel(c.toArray()));
        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel(d.toArray()));
        combSpot.setModel(new javax.swing.DefaultComboBoxModel(e.toArray()));
        
        for (int i = 0; i < 5; i++){
            for (int k = 0; k <9; k++){
                garage[i][k] = "-";
            }
        }
        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel(leave.toArray()));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblDate = new javax.swing.JLabel();
        txtDate = new javax.swing.JTextField();
        lblSpot = new javax.swing.JLabel();
        combSpot = new javax.swing.JComboBox<>();
        btnBack = new javax.swing.JButton();
        btnCheckIn = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jComboBox3 = new javax.swing.JComboBox<>();
        jComboBox4 = new javax.swing.JComboBox<>();
        txtName = new javax.swing.JTextField();
        lblName = new javax.swing.JLabel();
        lblSelectedSpot = new javax.swing.JLabel();
        jComboBox5 = new javax.swing.JComboBox<>();
        jTextField1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblDate.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblDate.setText("DATE:");

        txtDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDateActionPerformed(evt);
            }
        });

        lblSpot.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblSpot.setText("SPOT:");

        combSpot.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        combSpot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combSpotActionPerformed(evt);
            }
        });

        btnBack.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnBack.setText("BACK");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnCheckIn.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnCheckIn.setText("CHECK IN");
        btnCheckIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCheckInActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox4ActionPerformed(evt);
            }
        });

        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });

        lblName.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblName.setText("Name:");

        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox5ActionPerformed(evt);
            }
        });

        jTextField1.setText("Unavailable Spots");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblName)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblSpot, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(30, 30, 30)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtName)
                                            .addComponent(txtDate, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblSelectedSpot, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(combSpot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(205, 205, 205)
                        .addComponent(btnBack)
                        .addGap(101, 101, 101)
                        .addComponent(btnCheckIn)
                        .addGap(182, 182, 182)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(229, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtName)
                    .addComponent(lblName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblDate, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSpot, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combSpot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lblSelectedSpot)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnBack)
                            .addComponent(btnCheckIn)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(438, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDateActionPerformed

    private void combSpotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combSpotActionPerformed
        // TODO add your handling code here:
        selectedValue = combSpot.getSelectedItem().toString();
        lblSelectedSpot.setText(selectedValue);
    }//GEN-LAST:event_combSpotActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        dispose();
        new start().setVisible(true);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnCheckInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCheckInActionPerformed
        // TODO add your handling code here:
        
        // TODO add your handling code here:
        // get the selected spot
        selectedValue = lblSelectedSpot.getText();
        // split the spot into the floor and number, then fill the spot in the 2D array
        
        floor = selectedValue.substring(0, 1);
        spotNumeral = selectedValue.substring(1);
        
        int floorInt = 0;
        int spotInt = 0;
            if (null != floor) 
        switch (floor) {
            case "A":
                floorInt = 0;
                break;
            case "B":
                floorInt = 1;
                break;
            case "C":
                floorInt = 2;
                break;
            case "D":
                floorInt = 3;
                break;
            case "E":
                floorInt = 4;
                break;
            default:
                break;
        }
            if (null != spotNumeral) 
        switch (spotNumeral) {
            case "0":
                spotInt = 0;
                break;
            case "1":
                spotInt = 1;
                break;
            case "2":
                spotInt = 2;
                break;
            case "3":
                spotInt = 3;
                break;
            case "4":
                spotInt = 4;
                break;
            case "5":
                spotInt = 5;
                break;
            case "6":
                spotInt = 6;
                break;
            case "7":
                spotInt = 7;
                break;
            case "8":
                spotInt = 8;
                break;
            case "9":
                spotInt = 9;
                break;
            default:
                break;
        }
            
        // put a car into the 2d array
        //fillParkingSpot(selectedValue);
        garage[floorInt][spotInt] = takenSpot;
        // remove the spot from the array/combo box
        //switch (floorInt) {
            if (floorInt == 0){
                Iterator itr = a.iterator();
                    while (itr.hasNext()) {
                        String x = (String)itr.next();
                        if (x.equals(selectedValue)){
                            itr.remove();
                        }
                    }       jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(a.toArray()));
                }
            else if (floorInt == 1){
                Iterator itr = b.iterator();
                    while (itr.hasNext()) {
                        String x = (String)itr.next();
                        if (x.equals(selectedValue)){
                            itr.remove();
                        }
                    }       jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(b.toArray()));
                }
            else if (floorInt == 2){
                Iterator itr = c.iterator();
                    while (itr.hasNext()) {
                        String x = (String)itr.next();
                        if (x.equals(selectedValue)){
                            itr.remove();
                        }
                    }       jComboBox3.setModel(new javax.swing.DefaultComboBoxModel(c.toArray()));
                }
            else if (floorInt == 3){
                Iterator itr = d.iterator();
                    while (itr.hasNext()) {
                        String x = (String)itr.next();
                        if (x.equals(selectedValue)){
                            itr.remove();
                        }
                    }       jComboBox4.setModel(new javax.swing.DefaultComboBoxModel(d.toArray()));
                }
            else if (floorInt == 4){
                Iterator itr = e.iterator();
                    while (itr.hasNext()) {
                        String x = (String)itr.next();
                        if (x.equals(selectedValue)){
                            itr.remove();
                        }
                    }       combSpot.setModel(new javax.swing.DefaultComboBoxModel(e.toArray()));
                }
        // write loop here calling sort method to add selectedValue tothe arraylist in correct order
        leave.add(selectedValue);
        Collections.sort(leave);  
        lblSelectedSpot.setText(selectedValue);
        
        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel(leave.toArray()));
        //**ADD CODE FOR RECEIVING THE CHECK IN TIME/DATE**
        
        txtDate.setText("");
        JOptionPane.showMessageDialog(this, "You have been checked in, please park in spot " + lblSelectedSpot.getText() + ".");
        new start().setVisible(true);
        dispose();
        
    }//GEN-LAST:event_btnCheckInActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
        selectedValue = jComboBox1.getSelectedItem().toString();
        lblSelectedSpot.setText(selectedValue);
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
        selectedValue = jComboBox2.getSelectedItem().toString();
        lblSelectedSpot.setText(selectedValue);
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
        // TODO add your handling code here:
        selectedValue = jComboBox3.getSelectedItem().toString();
        lblSelectedSpot.setText(selectedValue);
    }//GEN-LAST:event_jComboBox3ActionPerformed

    private void jComboBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox4ActionPerformed
        // TODO add your handling code here:
        selectedValue = jComboBox4.getSelectedItem().toString();
        lblSelectedSpot.setText(selectedValue);
    }//GEN-LAST:event_jComboBox4ActionPerformed

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jComboBox5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox5ActionPerformed

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
            java.util.logging.Logger.getLogger(CheckIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CheckIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CheckIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CheckIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CheckIn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCheckIn;
    private javax.swing.JComboBox<String> combSpot;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JComboBox<String> jComboBox5;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblSelectedSpot;
    private javax.swing.JLabel lblSpot;
    private javax.swing.JTextField txtDate;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables
}
