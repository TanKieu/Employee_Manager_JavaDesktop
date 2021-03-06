/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EmolyeeManager;

import employeeManagementDAO.EmployeeManagementDAO;
import employeeManagementDTO.EmployeeManagementDTO;
import java.text.SimpleDateFormat;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.Date;
import java.util.Calendar;

/**
 *
 * @author winnh
 */
public class Manager extends javax.swing.JFrame {

    Vector<String> header = new Vector<>();
    Vector data = new Vector();
    boolean addnew = false;
    final int SUCCESS = 1;

    /**
     * Creates new form Manager
     */
    public Manager() {
        initComponents();
        header.add("EmpID");
        header.add("Full name");
        header.add("Phone");
        header.add("Email");
        header.add("Address");
        header.add("Date of Birth");
        header.add("isDelete");
        loadData();
        DefaultTableModel defaultModel;
        defaultModel = (DefaultTableModel) tblEmp.getModel();
        defaultModel.setDataVector(data, header);
    }

    private void loadData() {
        try {
            for (EmployeeManagementDTO emp : EmployeeManagementDAO.getAllEmp()) {
                Vector row = new Vector();
                row.add(emp.getEmpID());
                row.add(emp.getFullname());
                row.add(emp.getPhone());
                row.add(emp.getEmail());
                row.add(emp.getAddress());
                row.add(emp.getDateOfBirth());
                row.add(emp.isIsDelete());
                data.add(row);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEmp = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        txtPhone = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        atxtAdd = new javax.swing.JTextArea();
        txtEmail = new javax.swing.JTextField();
        txtDOB = new javax.swing.JTextField();
        btnFindID = new javax.swing.JButton();
        btnCreate = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnRemove = new javax.swing.JButton();
        btnGetAll = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblEmp.setModel(new javax.swing.table.DefaultTableModel(
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
        tblEmp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblEmpMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblEmp);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 255));
        jLabel1.setText("  Emp    Manager");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Emp's Detail", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N

        jLabel2.setText("Emp ID");

        jLabel3.setText("Full name");

        jLabel4.setText("Phone");

        jLabel5.setText("Email");

        jLabel6.setText("Address");

        jLabel7.setText("DOB");

        txtID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDActionPerformed(evt);
            }
        });

        atxtAdd.setColumns(20);
        atxtAdd.setRows(5);
        jScrollPane2.setViewportView(atxtAdd);

        btnFindID.setText("Find by Emp ID");
        btnFindID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindIDActionPerformed(evt);
            }
        });

        btnCreate.setText("Create Emp");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        btnUpdate.setText("Update Emp");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnRemove.setText("Remove");
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2)
                    .addComponent(txtEmail)
                    .addComponent(txtID)
                    .addComponent(txtName)
                    .addComponent(txtPhone)
                    .addComponent(txtDOB))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnFindID))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(btnCreate)
                .addGap(43, 43, 43)
                .addComponent(btnUpdate)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnRemove)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFindID))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDOB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCreate)
                    .addComponent(btnUpdate)
                    .addComponent(btnRemove))
                .addContainerGap(128, Short.MAX_VALUE))
        );

        btnGetAll.setText(" Get All Emp");
        btnGetAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGetAllActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(165, 165, 165)
                        .addComponent(btnGetAll)))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(282, 282, 282))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(btnGetAll))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDActionPerformed

    private void tblEmpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblEmpMouseClicked
        addnew = false;
        txtID.setEditable(addnew);
        int selectedRow = tblEmp.getSelectedRow();
        String id = tblEmp.getValueAt(selectedRow, 0).toString();
        String name = tblEmp.getValueAt(selectedRow, 1).toString();
        String phone = tblEmp.getValueAt(selectedRow, 2).toString();
        String email = tblEmp.getValueAt(selectedRow, 3).toString();
        String add = tblEmp.getValueAt(selectedRow, 4).toString();
        String DoB = tblEmp.getValueAt(selectedRow, 5).toString();
        String dayofbirth[];
        dayofbirth = DoB.split("[-]");
        txtID.setText(id);
        txtName.setText(name);
        txtPhone.setText(phone);
        txtEmail.setText(email);
        atxtAdd.setText(add);
        txtDOB.setText(dayofbirth[2] + "-" + dayofbirth[1] + "-" + dayofbirth[0]);
    }//GEN-LAST:event_tblEmpMouseClicked

    private void btnGetAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGetAllActionPerformed
        data.clear();
        loadData();
        tblEmp.updateUI();
    }//GEN-LAST:event_btnGetAllActionPerformed

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        addnew = true;
        txtID.setEditable(addnew);
        txtID.setText("");
        txtID.requestFocus();
        txtName.setText("");
        txtPhone.setText("");
        txtEmail.setText("");
        atxtAdd.setText("");
        txtDOB.setText("");

    }//GEN-LAST:event_btnCreateActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        String Id = txtID.getText().trim();
        if (Id.isEmpty()) {
            JOptionPane.showMessageDialog(this, "ID is not null!!!");
            return;
        }
        String name = txtName.getText().trim();
        if (name.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Name is not null!!!");
            return;
        }
        if (!Id.matches("\\w+")) {
            JOptionPane.showMessageDialog(this, "ID does not contain special characters(!,@,#,...)!!!");
            return;
        }
        if (Id.length() > 10) {
            JOptionPane.showMessageDialog(this, "Max length of ID is 10 !!!");
            return;
        }
        if (name.length() > 30) {
            JOptionPane.showMessageDialog(this, "Max length of Name is 30 !!!");
            return;
        }
        String add = atxtAdd.getText().trim();
        String address = add.replaceAll("\\n", " ");
        if (address.length() > 300) {
            JOptionPane.showMessageDialog(this, "Max length of Address is 300 !!!");
            return;
        }
        String dateFormat = "([0-9]{2})-([0-9]{2})-([0-9]{4})";
        String DOB = txtDOB.getText().trim();
        if (!DOB.matches(dateFormat)) {
            JOptionPane.showMessageDialog(this, "Day of Birth is wrong format !!!Format: dd-mm-yyyy");
            return;
        }
        String DayOB[];
        DayOB = DOB.split("[-]");

        if (Integer.parseInt(DayOB[0].toString()) > 30) {
            JOptionPane.showMessageDialog(this, "Day is invalid (<=31)");
            return;
        }
        if (Integer.parseInt(DayOB[1].toString()) > 12) {
            JOptionPane.showMessageDialog(this, "Month is invalid (<=12)");
            return;
        }
        if (Integer.parseInt(DayOB[2].toString()) > 2020) {
            JOptionPane.showMessageDialog(this, "Year is invalid (<=2020)");
            return;
        }
        Date dob = Date.valueOf(DayOB[2] + "-" + DayOB[1] + "-" + DayOB[0]);

        String phone = txtPhone.getText().trim();
        if (!phone.matches("[0-9]{0,15}")) {
            JOptionPane.showMessageDialog(this, "Phone number only contains (0-9) and max length is 15");
            return;
        }
        String email = txtEmail.getText().trim();
        String emailFormat = "\\w+@\\w+[.]\\w+([.]\\w+)?";
        if (!email.matches(emailFormat)) {
            JOptionPane.showMessageDialog(this, "Email is invalid (xxx@xxx.xxx Ex:'abc@gmail.com') !!!!");
            return;
        }
        if (email.length() > 30) {
            JOptionPane.showMessageDialog(this, "Max length of email is 30 !!!");
            return;
        }
        EmployeeManagementDTO emp = new EmployeeManagementDTO(Id, name, phone, email, address, dob, false);
        if (addnew) {
            try {
                EmployeeManagementDTO e = null;
                e = EmployeeManagementDAO.findByID(Id);
                if (e != null) {
                    JOptionPane.showMessageDialog(this, "ID is duplicated");
                    return;
                }
                for (EmployeeManagementDTO E : EmployeeManagementDAO.getAllEmp()) {
                    if (E.getEmpID().equals(Id)) {
                        JOptionPane.showMessageDialog(this, "Id is duplicated");
                        return;
                    }
                }
                if (EmployeeManagementDAO.insert(emp) == SUCCESS) {
                    Vector row = new Vector();
                    row.add(Id);
                    row.add(name);
                    row.add(phone);
                    row.add(email);
                    row.add(address);
                    row.add(DayOB[2] + "-" + DayOB[1] + "-" + DayOB[0]);
                    row.add(emp.isIsDelete());
                    data.add(row);
                    tblEmp.updateUI();
                    addnew = false;
                }

            } catch (Exception ex) {
                ex.printStackTrace();
            }

        } else {
            try {
                if (EmployeeManagementDAO.update(emp) == SUCCESS) {
                    int selectedRow = tblEmp.getSelectedRow();
                    Vector row = (Vector) data.get(selectedRow);
                    row.set(1, emp.getFullname());
                    row.set(2, emp.getPhone());
                    row.set(3, emp.getEmail());
                    row.set(4, emp.getAddress());
                    row.set(5, DayOB[2] + "-" + DayOB[1] + "-" + DayOB[0]);
                    tblEmp.updateUI();
                }
            } catch (Exception ee) {
                ee.printStackTrace();
            }
        }


    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed
        int r = JOptionPane.showConfirmDialog(this, "Are you sure?", "Remove", JOptionPane.YES_NO_OPTION);
        if (r == JOptionPane.YES_OPTION) {
            try {
                int selectedRow = tblEmp.getSelectedRow();
                String id = tblEmp.getValueAt(selectedRow, 0).toString();
                if (EmployeeManagementDAO.remove(id) == SUCCESS) {
                    data.remove(selectedRow);
                    tblEmp.updateUI();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_btnRemoveActionPerformed

    private void btnFindIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindIDActionPerformed
        String id = txtID.getText().trim();
        if (id.isEmpty()) {
            return;
        } else {
            try {
                EmployeeManagementDTO emp = EmployeeManagementDAO.findByID(id);
                if (emp == null) {
                    JOptionPane.showMessageDialog(this, "Not Found!!!");
                    return;
                } else {
                    Vector row = new Vector();
                    row.add(emp.getEmpID());
                    row.add(emp.getFullname());
                    row.add(emp.getPhone());
                    row.add(emp.getEmail());
                    row.add(emp.getAddress());
                    row.add(emp.getDateOfBirth());
                    row.add(emp.isIsDelete());
                    data.clear();
                    data.add(row);
                    tblEmp.updateUI();
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }

        }
    }//GEN-LAST:event_btnFindIDActionPerformed

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
            java.util.logging.Logger.getLogger(Manager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Manager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Manager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Manager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Manager().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea atxtAdd;
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnFindID;
    private javax.swing.JButton btnGetAll;
    private javax.swing.JButton btnRemove;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tblEmp;
    private javax.swing.JTextField txtDOB;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPhone;
    // End of variables declaration//GEN-END:variables

}
