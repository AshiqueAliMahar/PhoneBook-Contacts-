package mainFrame;

import BeanClass.ContactBean;
import BeanClass.ContactTypes;
import PhoneBookBAL.PhBAL;
import PhoneBookBAL.contctTypeBal;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class PhoneBook extends javax.swing.JFrame {

    public PhoneBook() {
        initComponents();
        loadTable();
        loadList();

    }

    PhBAL pBal = new PhBAL();

    private void loadTable() {

        try {
            contctTypeBal cType = new contctTypeBal();
            DefaultTableModel tblModel = (DefaultTableModel) tblContacts.getModel();
            tblModel.setRowCount(0);
            PhBAL pBal = new PhBAL();
            ArrayList<ContactBean> contacts = pBal.getContacts();
            int row = 0;
            for (ContactBean ob : contacts) {
                Vector vectr = new Vector();
                vectr.add(ob.getId());
                vectr.add(ob.getName());
                vectr.add(ob.getNumber());
                vectr.add(ob.getContactType());
                tblModel.addRow(vectr);
            }
            tblContacts.setModel(tblModel);

            ArrayList<ContactTypes> arrCntctTypes = cType.getCntctTypes();
            cmbType.removeAllItems();
            for (ContactTypes ob : arrCntctTypes) {

                cmbType.addItem(ob);
            }
        } catch (Exception ex) {

        }
    }

    private void loadList() {
        String[] arr = new String[tblContacts.getRowCount()];
        for (int i = 0; i < tblContacts.getRowCount(); i++) {

            arr[i] = tblContacts.getValueAt(i, 1).toString();
        }
        lstSearch.setListData(arr);

    }

    private void loadTable(String name) {

        try {
            contctTypeBal cType = new contctTypeBal();
            DefaultTableModel tblModel = (DefaultTableModel) tblContacts.getModel();
            tblModel.setRowCount(0);
            PhBAL pBal = new PhBAL();
            ArrayList<ContactBean> contacts = pBal.searchName(name);
            int row = 0;
            for (ContactBean ob : contacts) {
                Vector vectr = new Vector();
                vectr.add(ob.getId());
                vectr.add(ob.getName());
                vectr.add(ob.getNumber());
                vectr.add(ob.getContactType());
                tblModel.addRow(vectr);
            }
            tblContacts.setModel(tblModel);

            ArrayList<ContactTypes> arrCntctTypes = cType.getCntctTypes();
            cmbType.removeAllItems();
            for (ContactTypes ob : arrCntctTypes) {

                cmbType.addItem(ob);
            }
        } catch (Exception ex) {

        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        txtName = new javax.swing.JTextField();
        txtNumber = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblContacts = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        cmbType = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        scrPane = new javax.swing.JScrollPane();
        lstSearch = new javax.swing.JList<>();
        jLabel7 = new javax.swing.JLabel();

        jFormattedTextField1.setText("jFormattedTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        txtName.setBackground(new java.awt.Color(153, 0, 153));
        txtName.setForeground(new java.awt.Color(255, 255, 255));

        txtNumber.setBackground(new java.awt.Color(153, 0, 153));
        txtNumber.setForeground(new java.awt.Color(255, 255, 255));
        txtNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumberActionPerformed(evt);
            }
        });

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(255, 102, 102));
        jLabel3.setFont(new java.awt.Font("Old English Text MT", 2, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 51, 0));
        jLabel3.setText("Name");
        jLabel3.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 0, 0)));

        jLabel4.setBackground(new java.awt.Color(255, 102, 102));
        jLabel4.setFont(new java.awt.Font("Old English Text MT", 2, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 51, 0));
        jLabel4.setText("Number");
        jLabel4.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 0, 0)));

        tblContacts.setBackground(new java.awt.Color(204, 204, 0));
        tblContacts.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 1, 1, 1, new java.awt.Color(255, 153, 0)));
        tblContacts.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Number", "ContactType"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblContacts.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblContactsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblContacts);

        jLabel5.setBackground(new java.awt.Color(255, 102, 102));
        jLabel5.setFont(new java.awt.Font("Old English Text MT", 2, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 51, 0));
        jLabel5.setText("ID");
        jLabel5.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 0, 0)));

        txtID.setEditable(false);
        txtID.setBackground(new java.awt.Color(153, 0, 153));
        txtID.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(255, 102, 102));
        jLabel1.setFont(new java.awt.Font("Old English Text MT", 2, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 51, 0));
        jLabel1.setText("Type");
        jLabel1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 0, 0)));

        jLabel6.setBackground(new java.awt.Color(255, 102, 102));
        jLabel6.setFont(new java.awt.Font("Old English Text MT", 2, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 51, 0));
        jLabel6.setText("Search");
        jLabel6.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 0, 0)));

        jLabel2.setFont(new java.awt.Font("Old English Text MT", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 102, 102));
        jLabel2.setText("Phone Book");

        txtSearch.setBackground(new java.awt.Color(0, 51, 204));
        txtSearch.setForeground(new java.awt.Color(255, 255, 255));
        txtSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchActionPerformed(evt);
            }
        });
        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchKeyReleased(evt);
            }
        });

        lstSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lstSearchMouseClicked(evt);
            }
        });
        scrPane.setViewportView(lstSearch);

        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ashique Ali Mahar\\Desktop\\phone-book-975141.jpg")); // NOI18N
        jLabel7.setDisabledIcon(new javax.swing.ImageIcon("C:\\Users\\Ashique Ali Mahar\\Desktop\\phone-book-975141.jpg")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(568, 568, 568)
                .addComponent(jLabel6))
            .addGroup(layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(230, 230, 230)
                .addComponent(scrPane, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(341, 341, 341)
                .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 914, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(jLabel5))
            .addGroup(layout.createSequentialGroup()
                .addGap(204, 204, 204)
                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(654, 654, 654)
                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(289, 289, 289)
                .addComponent(jLabel2))
            .addGroup(layout.createSequentialGroup()
                .addGap(190, 190, 190)
                .addComponent(txtNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(615, 615, 615)
                .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(190, 190, 190)
                .addComponent(cmbType, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(jLabel4))
            .addGroup(layout.createSequentialGroup()
                .addGap(190, 190, 190)
                .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 920, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(124, 124, 124)
                .addComponent(jLabel6)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabel3)
                        .addGap(60, 60, 60)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(scrPane, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnUpdate)
                    .addComponent(btnDelete))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(161, 161, 161)
                .addComponent(jLabel5))
            .addGroup(layout.createSequentialGroup()
                .addGap(331, 331, 331)
                .addComponent(btnSave))
            .addGroup(layout.createSequentialGroup()
                .addGap(124, 124, 124)
                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel2))
            .addGroup(layout.createSequentialGroup()
                .addGap(254, 254, 254)
                .addComponent(txtNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(331, 331, 331)
                .addComponent(btnClear))
            .addGroup(layout.createSequentialGroup()
                .addGap(300, 300, 300)
                .addComponent(cmbType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(255, 255, 255)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(163, 163, 163)
                .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblContactsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblContactsMouseClicked

        selectFromTable();
    }//GEN-LAST:event_tblContactsMouseClicked

    private void selectFromTable() {

        int row = tblContacts.getSelectedRow();

        if (row >= 0) {

            txtID.setText(tblContacts.getValueAt(row, 0).toString());
            txtName.setText(tblContacts.getValueAt(row, 1).toString());
            txtNumber.setText(tblContacts.getValueAt(row, 2).toString());
            String contactType = tblContacts.getValueAt(row, 3).toString();
            for (int i = 0; i < cmbType.getItemCount(); i++) {

                ContactTypes CType = (ContactTypes) cmbType.getItemAt(i);
                if (CType.getContctType().equals(contactType)) {
                    cmbType.setSelectedItem(CType);
                }
            }

        }
    }

    private void selectFromTable(String Name) {

        int row = -1;
        {
            int i = 0;
            while (i < tblContacts.getRowCount() && row == -1) {

                if (Name.equals(tblContacts.getValueAt(i, 1).toString())) {
                    row = i;
                }
                i++;
            }
        }
        if (row >= 0) {

            txtID.setText(tblContacts.getValueAt(row, 0).toString());
            txtName.setText(tblContacts.getValueAt(row, 1).toString());
            txtNumber.setText(tblContacts.getValueAt(row, 2).toString());
            String contactType = tblContacts.getValueAt(row, 3).toString();
            for (int i = 0; i < cmbType.getItemCount(); i++) {

                ContactTypes CType = (ContactTypes) cmbType.getItemAt(i);
                if (CType.getContctType().equals(contactType)) {
                    cmbType.setSelectedItem(CType);
                }
            }

        }
    }
    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed

        ContactTypes cType = (ContactTypes) cmbType.getSelectedItem();

        pBal.insertContact(txtName.getText(), txtNumber.getText(), cType.getId());
        loadTable();
        clear();
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed

        if (tblContacts.getSelectedRow() >= 0) {
            pBal.deleteData(Integer.parseInt(txtID.getText()));
            loadTable();
            clear();
        } else {
            JOptionPane.showMessageDialog(null, "First Select A Contact From Table");
        }

    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed

        if (tblContacts.getSelectedRow() >= 0) {
            ContactTypes cType = (ContactTypes) cmbType.getSelectedItem();
            pBal.updateData(Integer.parseInt(txtID.getText()), txtName.getText(), txtNumber.getText(), cType.getId());
            loadTable();
            clear();
        } else {
            JOptionPane.showMessageDialog(null, "First Select A Contact From Table");
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void clear() {

        txtID.setText("");
        txtName.setText("");
        txtNumber.setText("");
        cmbType.setSelectedIndex(-1);
        tblContacts.clearSelection();

    }

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed

        clear();

    }//GEN-LAST:event_btnClearActionPerformed

    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchActionPerformed

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
        String srch = txtSearch.getText();

        if (srch.trim().length() > 0) {
            loadTable(srch);
            lstSearch.setVisible(true);
            scrPane.setVisible(true);
            loadList();
            if (tblContacts.getRowCount() > 0) {
                txtID.setText(tblContacts.getValueAt(0, 0).toString());
                txtName.setText(tblContacts.getValueAt(0, 1).toString());
                txtNumber.setText(tblContacts.getValueAt(0, 2).toString());
                String contactType = tblContacts.getValueAt(0, 3).toString();
                for (int i = 0; i < cmbType.getItemCount(); i++) {

                    ContactTypes CType = (ContactTypes) cmbType.getItemAt(i);
                    if (CType.getContctType().equals(contactType)) {
                        cmbType.setSelectedItem(CType);
                    }
                }
            }
        } else {
            clear();
            loadTable();
            loadList();

            lstSearch.setVisible(false);
            scrPane.setVisible(false);
        }
    }//GEN-LAST:event_txtSearchKeyReleased

    private void txtNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumberActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        lstSearch.setVisible(false);
        scrPane.setVisible(false);
    }//GEN-LAST:event_formWindowOpened

    private void lstSearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lstSearchMouseClicked

        if (lstSearch.getSelectedIndex() > 0) {
            String selectedValue = lstSearch.getSelectedValue();
            selectFromTable(selectedValue);
        }


    }//GEN-LAST:event_lstSearchMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox cmbType;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> lstSearch;
    private javax.swing.JScrollPane scrPane;
    private javax.swing.JTable tblContacts;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtNumber;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
