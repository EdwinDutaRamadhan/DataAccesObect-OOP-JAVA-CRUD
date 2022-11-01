/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

package View;

import Data.UserDAO;
import Model.UserModel;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author HP
 */
public class UserView extends javax.swing.JFrame {
    UserModel mhs;
    UserDAO data;
    DefaultTableModel tableModel;
    /** Creates new form UserView */
    public UserView() {
        initComponents();
        startup();
    }
    
    private void startup(){
        displayTableData();
    }
    
    private void defaultTableModel(){
        String[] defaultTable = {"KODE", "Mata Kuliah", "SKST", "SKSTM"};
        tableModel = new DefaultTableModel(defaultTable, 0);
        tableUser.setModel(tableModel);
    }
    
    private void displayTableData(){
        List<UserModel> ls = new ArrayList<>();
        ls = new UserDAO().getAllMahasiswa();
        String DataTable[][] = new String[ls.size()][5];
        for(int i = 0; i < ls.size(); i++){
            DataTable[i][0] = ls.get(i).getKode();
            DataTable[i][1] = ls.get(i).getMatkul();
            DataTable[i][2] = ls.get(i).getSksp();
            DataTable[i][3] = ls.get(i).getSkstm();
        }
        tableUser.setModel(new DefaultTableModel(DataTable, new String[]{"KODE", "Mata Kuliah", "SKST", "SKSTM"}));
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tableUser = new javax.swing.JTable();
        kodeTextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        skspTextField = new javax.swing.JTextField();
        mataKuliahTextField = new javax.swing.JTextField();
        skstmTextField = new javax.swing.JTextField();
        addButton = new javax.swing.JButton();
        saveButton = new javax.swing.JButton();
        deletebutton = new javax.swing.JButton();
        updateButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tableUser.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "kode", "matkul", "sksp", "skstm"
            }
        ));
        tableUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableUserMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableUser);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("KODE");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("MATA KULIAH");

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("SKSP");

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("SKSTM");

        addButton.setText("ADD");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        saveButton.setText("SAVE");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        deletebutton.setText("DELETE");
        deletebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletebuttonActionPerformed(evt);
            }
        });

        updateButton.setText("UPDATE");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(kodeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(skspTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(skstmTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mataKuliahTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(deletebutton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(updateButton)
                        .addContainerGap(7, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(53, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mataKuliahTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(skspTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(skstmTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(deletebutton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(updateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(kodeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tableUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableUserMouseClicked
        int selectedRow = tableUser.getSelectedRow();
        kodeTextField.setText(tableUser.getValueAt(selectedRow, 0).toString());
        mataKuliahTextField.setText(tableUser.getValueAt(selectedRow, 1).toString());
        skspTextField.setText(tableUser.getValueAt(selectedRow, 2).toString());
        skstmTextField.setText(tableUser.getValueAt(selectedRow, 3).toString());
    }//GEN-LAST:event_tableUserMouseClicked

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        reset();
    }//GEN-LAST:event_addButtonActionPerformed
    private void reset(){
        kodeTextField.setText("");
        mataKuliahTextField.setText("");
        skspTextField.setText("");
        skstmTextField.setText("");
    }
    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        mhs = new UserModel();
        data = new UserDAO();
        mhs.setKode(kodeTextField.getText());
        mhs.setMatkul(mataKuliahTextField.getText());
        mhs.setSksp(skspTextField.getText());
        mhs.setSkstm(skstmTextField.getText());
        if(data.simpanDataMahasiswa(mhs)){
            JOptionPane.showMessageDialog(this, "Simpan Data Berhasil");
            displayTableData();
            reset();
        }else{
            JOptionPane.showMessageDialog(this, "Simpan Data Gagal");
        }   
    }//GEN-LAST:event_saveButtonActionPerformed

    private void deletebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletebuttonActionPerformed
        mhs = new UserModel();
        mhs.setKode(kodeTextField.getText());
        data = new UserDAO();
        if(data.deleteDataMahasiswa(mhs)){
            JOptionPane.showMessageDialog(this, "Delete Data Berhasil");
            displayTableData();
            reset();
        }else{
            JOptionPane.showMessageDialog(this, "Delete Data Gagal");
        }
    }//GEN-LAST:event_deletebuttonActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        mhs = new UserModel();
        mhs.setKode(kodeTextField.getText());      
        mhs.setMatkul(mataKuliahTextField.getText());      
        mhs.setSksp(skspTextField.getText());      
        mhs.setSkstm(skstmTextField.getText());      
        data = new UserDAO();
        if(data.updateDataMahasiswa(mhs)){
            JOptionPane.showMessageDialog(this, "Update Data Berhasil");
            displayTableData();
            reset();
        }else{
            JOptionPane.showMessageDialog(this, "Update Data Gagal");
        }
    }//GEN-LAST:event_updateButtonActionPerformed

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
            java.util.logging.Logger.getLogger(UserView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JButton deletebutton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField kodeTextField;
    private javax.swing.JTextField mataKuliahTextField;
    private javax.swing.JButton saveButton;
    private javax.swing.JTextField skspTextField;
    private javax.swing.JTextField skstmTextField;
    private javax.swing.JTable tableUser;
    private javax.swing.JButton updateButton;
    // End of variables declaration//GEN-END:variables

}
