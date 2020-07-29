package AddUserToDatabase;


import java.awt.HeadlessException;
import java.util.ArrayList;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author thean
 */
public class gui extends javax.swing.JFrame {

    /**
     * Creates new form gui
     */
    public gui() {
        initComponents();
        showUser();
          
    }
    
    public ArrayList <User> userList() throws SQLException {
        ArrayList <User> userList = new ArrayList<>();
        Connection conn = DB.getConnection();
        
        String query1 = "SELECT * FROM students";
        Statement st =  conn.createStatement();
        ResultSet rs = st.executeQuery(query1);
        
        User user;
        while(rs.next()) {
            user = new User(rs.getInt("sno"), rs.getString("stuName"), rs.getString("stuAddress"),
                    rs.getString("gender"), rs.getString("knowledge"), rs.getString("stuSubject"));
            userList.add(user);
        }
        return userList;
    }
    
    public void showUser()  {
        try {
            ArrayList <User> list = userList();
            DefaultTableModel model = (DefaultTableModel)tbPeople.getModel();
            Object[] row = new Object[6];
            for(int i=0; i<list.size();i++) {
                row[0] = list.get(i).getSno();
                row[1] = list.get(i).getName();
                row[2] = list.get(i).getAddress();
                row[3] = list.get(i).getGender();
                row[4] = list.get(i).getKnowledge();
                row[5] = list.get(i).getSubject();
                model.addRow(row);
            }
        } catch (SQLException ex) {
            Logger.getLogger(gui.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void reset() {
        tfName.setText("");
        tfAddress.setText("");
        buttonGroup2.clearSelection();
        cbSubject.setSelectedIndex(0);
        chkJava.setSelected(false);
        chkCplusplus.setSelected(false);
        chkPython.setSelected(false);
    }
    
    public void refreshTable() {
        DefaultTableModel dm = (DefaultTableModel) tbPeople.getModel();
        dm.setRowCount(0);
        showUser();
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup2 = new javax.swing.ButtonGroup();
        name = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tfAddress = new javax.swing.JTextField();
        tfName = new javax.swing.JTextField();
        rbMale = new javax.swing.JRadioButton();
        rbFemale = new javax.swing.JRadioButton();
        chkJava = new javax.swing.JCheckBox();
        chkPython = new javax.swing.JCheckBox();
        chkCplusplus = new javax.swing.JCheckBox();
        cbSubject = new javax.swing.JComboBox<>();
        btnAdd = new javax.swing.JButton();
        btnDel = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbPeople = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        name.setText("name");

        jLabel2.setText("address");

        jLabel3.setText("gender");

        jLabel4.setText("knowledge");

        jLabel5.setText("subject");

        tfName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNameActionPerformed(evt);
            }
        });

        buttonGroup2.add(rbMale);
        rbMale.setText("male");
        rbMale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbMaleActionPerformed(evt);
            }
        });

        buttonGroup2.add(rbFemale);
        rbFemale.setText("female");

        chkJava.setText("Java");

        chkPython.setText("Python");
        chkPython.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkPythonActionPerformed(evt);
            }
        });

        chkCplusplus.setText("C++");
        chkCplusplus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkCplusplusActionPerformed(evt);
            }
        });

        cbSubject.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Computer Science", "Education", "Management", "Humannity" }));

        btnAdd.setText("add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnDel.setText("delete");
        btnDel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelActionPerformed(evt);
            }
        });

        btnUpdate.setText("update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnClear.setText("clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        tbPeople.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "sno", "Name", "Address", "Gender", "Knowledge", "Subject"
            }
        ));
        jScrollPane1.setViewportView(tbPeople);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(name)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(chkJava)
                                .addGap(28, 28, 28)
                                .addComponent(chkPython)
                                .addGap(32, 32, 32)
                                .addComponent(chkCplusplus))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rbMale)
                                .addGap(35, 35, 35)
                                .addComponent(rbFemale))
                            .addComponent(tfName, javax.swing.GroupLayout.DEFAULT_SIZE, 297, Short.MAX_VALUE)
                            .addComponent(tfAddress)
                            .addComponent(cbSubject, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(btnAdd)
                        .addGap(18, 18, 18)
                        .addComponent(btnDel)
                        .addGap(18, 18, 18)
                        .addComponent(btnUpdate)
                        .addGap(18, 18, 18)
                        .addComponent(btnClear)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 541, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(name)
                            .addComponent(tfName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(tfAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(rbMale)
                            .addComponent(rbFemale))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(chkJava)
                            .addComponent(chkPython)
                            .addComponent(chkCplusplus))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(cbSubject, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAdd)
                            .addComponent(btnDel)
                            .addComponent(btnUpdate)
                            .addComponent(btnClear))))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNameActionPerformed

    private void rbMaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbMaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbMaleActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        try {
            Connection conn = DB.getConnection();
            String std = "INSERT INTO students(stuName, stuAddress, gender, knowledge, stuSubject) VALUES(?,?,?,?,?)";
            PreparedStatement pst = conn.prepareCall(std);
            pst.setString(1, tfName.getText());
            pst.setString(2, tfAddress.getText());
            
            // Gender Radio 
            String gender = "";
            if(rbMale.isSelected()) {
                gender = "Male";
                
            }
            if (rbFemale.isSelected()){
                gender = "Female";
            }
            pst.setString(3, gender);
            
            // Knowledge Checkbox
            String knowledge = "";
            if(chkJava.isSelected()) {
                knowledge += "Java ";
            }
            if(chkPython.isSelected()) {
                knowledge += "Python ";
            }
            if(chkCplusplus.isSelected()) {
                knowledge += "C++";
            }
            pst.setString(4, knowledge);
            
            // Subject ComboBox
            String selectedSubject = cbSubject.getSelectedItem().toString();
            pst.setString(5, selectedSubject);
            
            pst.executeUpdate();
            
            refreshTable();
            
            JOptionPane.showMessageDialog(null, "Inserted Successfully");
            
        }
        catch(HeadlessException | SQLException e) {
             JOptionPane.showMessageDialog(null,"Cannot Insert: Bad Database");
        }
        
        
        
    }//GEN-LAST:event_btnAddActionPerformed

    private void chkCplusplusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkCplusplusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkCplusplusActionPerformed

    private void chkPythonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkPythonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkPythonActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // TODO add your handling code here:
        tfName.setText("");
        tfAddress.setText("");
        buttonGroup2.clearSelection();
        cbSubject.setSelectedIndex(0);
        chkJava.setSelected(false);
        chkCplusplus.setSelected(false);
        chkPython.setSelected(false);
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnDelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelActionPerformed
        try {
            // TODO add your handling code here:
            Connection conn = DB.getConnection();
            int row = tbPeople.getSelectedRow();
            String value = (tbPeople.getModel().getValueAt(row,0).toString());
            String std = "DELETE students where sno = ?";
            PreparedStatement pst = conn.prepareCall(std);
            pst.setString(1, value);
            pst.executeUpdate();
            refreshTable();
            JOptionPane.showMessageDialog(null, "Deleted Successfully");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Cannot Update: Bad Database");
            System.out.print(ex);
        }
            
    }//GEN-LAST:event_btnDelActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        try {
            // TODO add your handling code here:
            Connection conn = DB.getConnection();
            int row = tbPeople.getSelectedRow();
            String value = (tbPeople.getModel().getValueAt(row,0).toString());
            String std = "UPDATE students SET stuName=?, stuAddress=?, gender=?, knowledge=?, stuSubject=?"
                    + " WHERE sno=?";
            
            PreparedStatement pst = conn.prepareCall(std);
            
            pst.setString(1, tfName.getText());
            pst.setString(2, tfAddress.getText());
            
            // Gender Radio 
            String gender = "";
            if(rbMale.isSelected()) {
                gender = "Male";
                
            }
            if (rbFemale.isSelected()){
                gender = "Female";
            }
            pst.setString(3, gender);
            
            // Knowledge Checkbox
            String knowledge = "";
            if(chkJava.isSelected()) {
                knowledge += "Java ";
            }
            if(chkPython.isSelected()) {
                knowledge += "Python ";
            }
            if(chkCplusplus.isSelected()) {
                knowledge += "C++";
            }
            pst.setString(4, knowledge);
             
             // Subject ComboBox
            String selectedSubject = cbSubject.getSelectedItem().toString();
            pst.setString(5, selectedSubject);
            
            pst.setString(6, value);
            
            pst.executeUpdate();
            
            refreshTable();
            
            JOptionPane.showMessageDialog(null, "Updated Successfully");
            reset();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Cannot Update: Bad Database");
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

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
            java.util.logging.Logger.getLogger(gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new gui().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDel;
    private javax.swing.JButton btnUpdate;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JComboBox<String> cbSubject;
    private javax.swing.JCheckBox chkCplusplus;
    private javax.swing.JCheckBox chkJava;
    private javax.swing.JCheckBox chkPython;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel name;
    private javax.swing.JRadioButton rbFemale;
    private javax.swing.JRadioButton rbMale;
    private javax.swing.JTable tbPeople;
    private javax.swing.JTextField tfAddress;
    private javax.swing.JTextField tfName;
    // End of variables declaration//GEN-END:variables
}
