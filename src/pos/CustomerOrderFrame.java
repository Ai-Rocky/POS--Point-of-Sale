package pos;

import java.awt.event.ItemEvent;
import pos.Classes.Database;

import java.util.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author airoc
 */
public class CustomerOrderFrame extends javax.swing.JFrame {

    Database db = new Database();
    Map<Integer, String> customerMap = new HashMap<>();

    public CustomerOrderFrame() {
        initComponents();
        db.dbConnect();
        dtm = (DefaultTableModel) tblStockProduct.getModel();
        dtmCustomer = (DefaultTableModel) tblCustomerProduct.getModel();
        tblStockProduct.removeColumn(tblStockProduct.getColumnModel().getColumn(0));
        tblCustomerProduct.removeColumn(tblCustomerProduct.getColumnModel().getColumn(0));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTotal = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();
        btnCancle = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblStockProduct = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        txtQuantity = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtPrice = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        cbBrand = new javax.swing.JComboBox<>();
        cbCategory = new javax.swing.JComboBox<>();
        cbCustomer = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnInsert = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        btnReset = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblCustomerProduct = new javax.swing.JTable();
        btnBack1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        lblTotal.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblTotal.setText("Total Amount: 0");

        btnSave.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnSave.setText("Save Order");
        btnSave.setPreferredSize(new java.awt.Dimension(90, 30));
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnCancle.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnCancle.setText("Cancle Order");
        btnCancle.setPreferredSize(new java.awt.Dimension(90, 30));
        btnCancle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancleActionPerformed(evt);
            }
        });

        tblStockProduct.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tblStockProduct.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Poduct", "Price", "Quantity", "Details", "Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblStockProduct.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblStockProductMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblStockProduct);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Product List:");

        txtQuantity.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtQuantity.setEnabled(false);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Price:");

        txtPrice.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtPrice.setEnabled(false);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Quantity:");

        cbBrand.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbBrand.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- Select Brand --" }));
        cbBrand.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbBrandItemStateChanged(evt);
            }
        });

        cbCategory.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbCategory.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- Select Category --" }));
        cbCategory.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbCategoryItemStateChanged(evt);
            }
        });

        cbCustomer.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbCustomer.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- Select Customer--" }));
        cbCustomer.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbCustomerItemStateChanged(evt);
            }
        });
        cbCustomer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbCustomerMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Customer:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Category:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Brand:");

        btnInsert.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnInsert.setText("Add");
        btnInsert.setPreferredSize(new java.awt.Dimension(90, 30));
        btnInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertActionPerformed(evt);
            }
        });

        btnDelete.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.setPreferredSize(new java.awt.Dimension(90, 30));
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnReset.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnReset.setText("Reset Field");
        btnReset.setPreferredSize(new java.awt.Dimension(90, 30));
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("Take Customer Order");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        tblCustomerProduct.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tblCustomerProduct.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Category", "Brand", "Poduct", "Price", "Quantity", "Details", "Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblCustomerProduct.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCustomerProductMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblCustomerProduct);

        btnBack1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnBack1.setText("Back");
        btnBack1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBack1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 486, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cbCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cbBrand, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel6)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(btnInsert, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(2, 2, 2)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel7)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(63, 63, 63)
                                        .addComponent(lblTotal)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnCancle, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 73, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(cbCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(btnBack1)
                        .addGap(302, 302, 302))))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(533, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 552, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnBack1)
                        .addGap(16, 16, 16)))
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(cbCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(cbCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbBrand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnInsert, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(92, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(144, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(141, 141, 141)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private boolean input() {

        if (!txtPrice.getText().isEmpty() && !txtQuantity.getText().isEmpty()) {

            Price = Double.parseDouble(txtPrice.getText());
            Quantity = Integer.parseInt(txtQuantity.getText());

            return true;

        } else {

            JOptionPane.showMessageDialog(null, "Plesase fill the empty field !", "Input Validation", JOptionPane.WARNING_MESSAGE);
            return false;
        }
    }

    private void inputsReset() {

        cbCategory.setSelectedIndex(0);
        cbBrand.setSelectedIndex(0);
        txtPrice.setText("");
        txtQuantity.setText("");
        dtm.setRowCount(0);
        txtPrice.setEnabled(false);
        txtQuantity.setEnabled(false);

    }

    private void CustomerList() {

        try {

            String query = "select * from tblCustomer";
            sta = db.con.createStatement();
            rs = sta.executeQuery(query);

            while (rs.next()) {
                customerMap.put(rs.getInt("Id"), rs.getString("Name"));
                cbCustomer.addItem(rs.getString("Name"));
            }

            sta.close();
            System.out.println(customerMap);

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "vendortList: " + ex);
        }
    }

    private void CategoryList() {

        try {

            String query = "select * from tblCategory";
            sta = db.con.createStatement();
            rs = sta.executeQuery(query);

            while (rs.next()) {
                cbCategory.addItem(rs.getString("Name"));
            }

            sta.close();

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "CategoryList: " + ex);
        }
    }

    private void BrandList() {

        try {

            String query = "select * from tblBrand";
            sta = db.con.createStatement();
            rs = sta.executeQuery(query);

            while (rs.next()) {
                cbBrand.addItem(rs.getString("Name"));
            }

            sta.close();

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "BrandList: " + ex);
        }
    }

    private void TotalAmount() {

        double total = 0;
        for (int i = 0; i < tblCustomerProduct.getRowCount(); i++) {
            total = total + Double.parseDouble((tblCustomerProduct.getValueAt(i, 6).toString()));
        }

        lblTotal.setText("Total Amount: " + total);
    }

    private Integer getCustomerId() {

        if (cbCustomer.getSelectedIndex() > 0) {
            for (Map.Entry cm : customerMap.entrySet()) {
                if (cm.getValue().equals(cbCustomer.getSelectedItem())) {
                    return (int) cm.getKey();
                }
            }
        }
        return null;
    }

    private Integer SaveOrderId() {

        Integer orderId = null;

        int CustomerId = getCustomerId();
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();
        String currentDT = dateFormat.format(date);

        try {
            String iQuery = "insert into tblCustomerOrder (CustomerId, Date) values ('" + CustomerId + "', '" + currentDT + "')";
            sta = db.con.createStatement();
            sta.execute(iQuery);
            sta.close();

            String sQuery = "select * from tblCustomerOrder";
            sta = db.con.createStatement();
            rs = sta.executeQuery(sQuery);

            if (rs.last()) {
                orderId = rs.getInt("Id");
            }
            sta.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        return orderId;
    }

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed

        if (getCustomerId() != null) {

            if (dtmCustomer.getRowCount() > 0) {

                Integer orderId = SaveOrderId();

                if (orderId != null) {

                    int reply = JOptionPane.showConfirmDialog(null, "Are you sure ?", "Save Order", JOptionPane.YES_NO_OPTION);
                    if (reply == JOptionPane.YES_OPTION) {

                        for (int i = 0; i < dtmCustomer.getRowCount(); i++) {

                            int ProductId = Integer.parseInt(dtmCustomer.getValueAt(i, 0).toString());
                            double Price = Double.parseDouble(dtmCustomer.getValueAt(i, 4).toString());
                            double Quantity = Double.parseDouble(dtmCustomer.getValueAt(i, 5).toString());

                            try {
                                String ipQuery = "insert into tblCustomerProduct (CustomerOrderId, ProductId, Price, Quantity) values ('" + orderId + "', '" + ProductId + "', '" + Price + "', '" + Quantity + "')";
                                sta = db.con.createStatement();
                                sta.execute(ipQuery);
                                sta.close();

                            } catch (SQLException ex) {
                                JOptionPane.showMessageDialog(null, ex);
                            }

                        }
                        JOptionPane.showMessageDialog(null, "The order Successfully saved.", "Save Order", JOptionPane.INFORMATION_MESSAGE);
                        dtmCustomer.setRowCount(0);
                        cbCustomer.setSelectedIndex(0);
                        TotalAmount();
                        inputsReset();
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Empty order !", "Save oeder", JOptionPane.WARNING_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Empty product list !", "Save Order", JOptionPane.WARNING_MESSAGE);
            }

        } else {
            JOptionPane.showMessageDialog(null, "Select customer !", "Invalid Customer", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnCancleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancleActionPerformed

        int reply = JOptionPane.showConfirmDialog(null, "Are you sure ?", "Cancle Order", JOptionPane.YES_NO_OPTION);
        if (reply == JOptionPane.YES_OPTION) {
            TotalAmount();
            inputsReset();
            dtmCustomer.setRowCount(0);
            cbCustomer.setSelectedIndex(0);
        }
    }//GEN-LAST:event_btnCancleActionPerformed

    private void tblStockProductMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblStockProductMouseClicked

        selectedRow = tblStockProduct.getSelectedRow();

        if (selectedRow >= 0) {

            txtPrice.setEnabled(true);
            txtQuantity.setEnabled(true);

            Id = Integer.parseInt(dtm.getValueAt(selectedRow, 0).toString());
            Category = cbCategory.getSelectedItem().toString();
            Brand = cbBrand.getSelectedItem().toString();
            Name = dtm.getValueAt(selectedRow, 1).toString();
            //Price = Double.parseDouble(dtm.getValueAt(selectedRow, 2).toString());
            StockQty = Integer.parseInt(dtm.getValueAt(selectedRow, 3).toString());
            Details = dtm.getValueAt(selectedRow, 4).toString();
            dtm.getValueAt(selectedRow, 5).toString();

        } else {
            JOptionPane.showMessageDialog(null, "No row selected !", "Add Row", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_tblStockProductMouseClicked

    private void cbCustomerItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbCustomerItemStateChanged

    }//GEN-LAST:event_cbCustomerItemStateChanged

    private void cbCustomerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbCustomerMouseClicked

    }//GEN-LAST:event_cbCustomerMouseClicked

    private void btnInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertActionPerformed

        if (input()) {
            //dtmCustomer.setRowCount(0);
            Object product[] = {
                Id,
                Category,
                Brand,
                Name,
                Price,
                Quantity,
                Details,
                Price * Quantity};

            if (Quantity > StockQty) {
                JOptionPane.showMessageDialog(null, "Quantity is over !", "Add Product", JOptionPane.WARNING_MESSAGE);
            } else {

                int i, match = 0;
                for (i = 0; i < tblCustomerProduct.getRowCount(); i++) {
                    if (tblCustomerProduct.getValueAt(i, 0).equals(Id)) {
                        match = 1;
                        break;
                    }
                }
                if (tblCustomerProduct.getRowCount() == 0) {
                    dtmCustomer.addRow(product);

                } else if (match == 1) {
                    int newQty = (int) tblCustomerProduct.getValueAt(i, 5) + Quantity;
                    if (newQty > StockQty) {
                        JOptionPane.showMessageDialog(null, "Empty quantity !", "Add Product", JOptionPane.WARNING_MESSAGE);

                    } else {
                        tblCustomerProduct.setValueAt(newQty, i, 5);
                        tblCustomerProduct.setValueAt(Price, i, 4);
                        double newTotal = newQty * Price;
                        tblCustomerProduct.setValueAt(newTotal, i, 7);
                    }
                } else {
                    dtmCustomer.addRow(product);
                }

                TotalAmount();
            }
        }
    }//GEN-LAST:event_btnInsertActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed

        selectedRow = tblCustomerProduct.getSelectedRow();

        if (selectedRow >= 0) {

            int reply = JOptionPane.showConfirmDialog(null, "Do you want to delete ?", "Delete Product", JOptionPane.YES_NO_OPTION);
            if (reply == JOptionPane.YES_OPTION) {

                dtmCustomer.removeRow(selectedRow);
                TotalAmount();
            }
        } else {

            JOptionPane.showMessageDialog(null, "No row selected !", "Modify Row", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        inputsReset();
    }//GEN-LAST:event_btnResetActionPerformed

    private void tblCustomerProductMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCustomerProductMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblCustomerProductMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        CustomerList();
        CategoryList();
        BrandList();
        this.setLocationRelativeTo(null);
    }//GEN-LAST:event_formWindowOpened
    private void stockList(String query) {
        try {

            sta = db.con.createStatement();
            rs = sta.executeQuery(query);
            dtm.setRowCount(0);

            while (rs.next()) {
                Object Stu[] = {
                    rs.getInt("Id"),
                    rs.getString("ProductName"),
                    rs.getString("ProductPrice"),
                    rs.getString("AvailableQty"),
                    rs.getString("ProductDetails"),
                    rs.getString("Total"),};
                dtm.addRow(Stu);
            }
            sta.close();

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "stockList: " + ex);
        }
    }
    private void cbCategoryItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbCategoryItemStateChanged

        txtPrice.setEnabled(false);
        txtQuantity.setEnabled(false);

        if (cbCategory.getSelectedIndex() != 0) {
            if (evt.getStateChange() == ItemEvent.SELECTED) {
                if (cbBrand.getSelectedIndex() != 0) {
                    //System.out.println(cbBrand.getSelectedItem());
                    String query = "SELECT tblStock.Id, ProductName, ProductPrice, IF(tblcustomerproduct.Quantity,ProductQuantity-SUM(tblcustomerproduct.Quantity),ProductQuantity) as AvailableQty, ProductDetails, IF(tblcustomerproduct.Quantity,ProductPrice*(ProductQuantity-tblcustomerproduct.Quantity),ProductPrice*ProductQuantity) as Total FROM tblStock JOIN tblCategory ON tblStock.CategoryId = tblCategory.Id JOIN tblBrand ON tblStock.BrandId = tblBrand.Id LEFT JOIN tblcustomerproduct ON tblstock.Id = tblcustomerproduct.ProductId WHERE tblCategory.Name = '"+evt.getItem()+"' and tblBrand.Name = '"+cbBrand.getSelectedItem()+"' GROUP BY tblcustomerproduct.ProductId";
                    stockList(query);
                }
            }
        } else {
            dtm.setRowCount(0);
        }
    }//GEN-LAST:event_cbCategoryItemStateChanged

    private void cbBrandItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbBrandItemStateChanged

        txtPrice.setEnabled(false);
        txtQuantity.setEnabled(false);

        if (cbBrand.getSelectedIndex() != 0) {
            if (evt.getStateChange() == ItemEvent.SELECTED) {
                if (cbCategory.getSelectedIndex() != 0) {
                    //System.out.println(cbBrand.getSelectedItem());
                    String query = "SELECT tblStock.Id, ProductName, ProductPrice, IF(tblcustomerproduct.Quantity,ProductQuantity-SUM(tblcustomerproduct.Quantity),ProductQuantity) as AvailableQty, ProductDetails, IF(tblcustomerproduct.Quantity,ProductPrice*(ProductQuantity-tblcustomerproduct.Quantity),ProductPrice*ProductQuantity) as Total FROM tblStock JOIN tblCategory ON tblStock.CategoryId = tblCategory.Id JOIN tblBrand ON tblStock.BrandId = tblBrand.Id LEFT JOIN tblcustomerproduct ON tblstock.Id = tblcustomerproduct.ProductId WHERE tblCategory.Name = '"+cbCategory.getSelectedItem()+"' and tblBrand.Name = '"+evt.getItem()+"' GROUP BY tblcustomerproduct.ProductId";
                    stockList(query);
                }
            }
        } else {
            dtm.setRowCount(0);
        }
    }//GEN-LAST:event_cbBrandItemStateChanged

    private void btnBack1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBack1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new CustomerMenuFrame().setVisible(true);
    }//GEN-LAST:event_btnBack1ActionPerformed

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
            java.util.logging.Logger.getLogger(CustomerOrderFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerOrderFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerOrderFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerOrderFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomerOrderFrame().setVisible(true);
            }
        });
    }

    // Input Variables declaration
    private int Id;
    private String Category;
    private String Brand;
    private String Name;
    private double Price;
    private int Quantity;
    private int StockQty;
    private String Details;

    // Database Variables declaration
    private Statement sta;
    private ResultSet rs;

    // Table Variables declaration
    private int selectedRow = - 1;
    private final DefaultTableModel dtm;
    private final DefaultTableModel dtmCustomer;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack1;
    private javax.swing.JButton btnCancle;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnInsert;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox<String> cbBrand;
    private javax.swing.JComboBox<String> cbCategory;
    private javax.swing.JComboBox<String> cbCustomer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblTotal;
    public javax.swing.JTable tblCustomerProduct;
    public javax.swing.JTable tblStockProduct;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtQuantity;
    // End of variables declaration//GEN-END:variables
}
