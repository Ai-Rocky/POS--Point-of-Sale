package pos;

import pos.Classes.Database;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Rocky Shamsul Alam
 */
public class ViewVendorOrderFrame extends javax.swing.JFrame {

    Database db = new Database();

    public ViewVendorOrderFrame() {
        initComponents();
        db.dbConnect();
        dtmOrder = (DefaultTableModel) tblVendorOrder.getModel();
        dtmProduct = (DefaultTableModel) tblVendorProduct.getModel();
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
        tblVendorOrder = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblVendorProduct = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        txtSearchOrder = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtSearchProduct = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        btnToday = new javax.swing.JButton();
        btnThisMonth = new javax.swing.JButton();
        btnAll = new javax.swing.JButton();
        btnBack1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        tblVendorOrder.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tblVendorOrder.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Order Id", "Vendor Name", "Total Product", "Total Amount", "Order Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblVendorOrder.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblVendorOrderMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblVendorOrder);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("View Vendor Order");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        tblVendorProduct.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tblVendorProduct.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Category", "Brand", "Product", "Price", "Quantity", "Details", "Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblVendorProduct.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblVendorProductMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblVendorProduct);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("Vendor Product List:");

        txtSearchOrder.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtSearchOrder.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchOrderKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSearchOrderKeyTyped(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Search:");

        txtSearchProduct.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtSearchProduct.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchProductKeyReleased(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Search:");

        btnToday.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnToday.setText("Today");
        btnToday.setPreferredSize(new java.awt.Dimension(90, 30));
        btnToday.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTodayActionPerformed(evt);
            }
        });

        btnThisMonth.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnThisMonth.setText("This Month");
        btnThisMonth.setPreferredSize(new java.awt.Dimension(90, 30));
        btnThisMonth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThisMonthActionPerformed(evt);
            }
        });

        btnAll.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnAll.setText("All");
        btnAll.setPreferredSize(new java.awt.Dimension(90, 30));
        btnAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAllActionPerformed(evt);
            }
        });

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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtSearchProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAll, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(btnBack1))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnToday, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnThisMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtSearchOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 550, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(btnBack1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSearchOrder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(btnToday, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnThisMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAll, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtSearchProduct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6))
                    .addComponent(jLabel9))
                .addGap(5, 5, 5)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(61, 61, 61)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(467, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void VendorOderList() {
        try {

            String query = "select tblvendororder.Id as OrderId,tblvendor.Name as VendorName,COUNT(tblstock.Id) as TP,SUM(tblstock.ProductPrice * tblstock.ProductQuantity) as TA,Date(tblvendororder.Date) as OrderDate from tblvendor,tblvendororder,tblstock where tblvendor.Id = tblvendororder.VendorId and tblvendororder.Id = tblstock.VendorOrderId GROUP BY tblstock.VendorOrderId";
            sta = db.con.createStatement();
            rs = sta.executeQuery(query);
            dtmOrder.setRowCount(0);

            while (rs.next()) {
                Object Order[] = {
                    rs.getInt("OrderId"),
                    rs.getString("VendorName"),
                    rs.getInt("TP"),
                    rs.getDouble("TA"),
                    rs.getString("OrderDate"),};

                dtmOrder.addRow(Order);
            }
            sta.close();

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "VendorOderList: " + ex);
        }
    }

    private void VendorProduct(int OrderId) {
        try {

            String query = "select tblcategory.Name as CategoryName,tblbrand.Name as BrandName,tblstock.*,(tblstock.ProductPrice * tblstock.ProductQuantity) as Total from tblcategory,tblbrand,tblstock where tblcategory.Id = tblstock.CategoryId and tblbrand.Id = tblstock.BrandId and tblstock.VendorOrderId = '" + OrderId + "'";
            sta = db.con.createStatement();
            rs = sta.executeQuery(query);
            dtmProduct.setRowCount(0);

            while (rs.next()) {
                Object Order[] = {
                    rs.getString("CategoryName"),
                    rs.getString("BrandName"),
                    rs.getString("ProductName"),
                    rs.getDouble("ProductPrice"),
                    rs.getInt("ProductQuantity"),
                    rs.getString("ProductDetails"),
                    rs.getDouble("Total"),};

                dtmProduct.addRow(Order);
            }
            sta.close();

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "VendorProduct: " + ex);
        }
    }
    
    private void tblVendorOrderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblVendorOrderMouseClicked
        selectedRow = tblVendorOrder.getSelectedRow();

        if (selectedRow >= 0) {

            int OrderId = (int) dtmOrder.getValueAt(selectedRow, 0);
            VendorProduct(OrderId);
        } else {
            JOptionPane.showMessageDialog(null, "No row selected !", "Product List", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_tblVendorOrderMouseClicked

    private void tblVendorProductMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblVendorProductMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblVendorProductMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        VendorOderList();
        this.setLocationRelativeTo(null);
    }//GEN-LAST:event_formWindowOpened

    private void txtSearchOrderKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchOrderKeyTyped

    }//GEN-LAST:event_txtSearchOrderKeyTyped

    private void txtSearchOrderKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchOrderKeyReleased

        TableRowSorter<DefaultTableModel> trs = new TableRowSorter<>(dtmOrder);
        tblVendorOrder.setRowSorter(trs);
        String txt = txtSearchOrder.getText();
        trs.setRowFilter(RowFilter.regexFilter("(?i)" + txt));
    }//GEN-LAST:event_txtSearchOrderKeyReleased

    private void txtSearchProductKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchProductKeyReleased

        TableRowSorter<DefaultTableModel> trs = new TableRowSorter<>(dtmProduct);
        tblVendorProduct.setRowSorter(trs);
        String txt = txtSearchProduct.getText();
        trs.setRowFilter(RowFilter.regexFilter("(?i)" + txt));
    }//GEN-LAST:event_txtSearchProductKeyReleased

    private void btnTodayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTodayActionPerformed

        TableRowSorter<DefaultTableModel> trs = new TableRowSorter<>(dtmOrder);
        tblVendorOrder.setRowSorter(trs);
        
        String txt = LocalDate.now().toString();
        trs.setRowFilter(RowFilter.regexFilter("(?i)" + txt));
    }//GEN-LAST:event_btnTodayActionPerformed

    private void btnThisMonthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThisMonthActionPerformed
        
        Calendar cal = Calendar.getInstance();
        int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH) + 1;
        
        TableRowSorter<DefaultTableModel> trs = new TableRowSorter<>(dtmOrder);
        tblVendorOrder.setRowSorter(trs);
        
        String txt = year + "-" + (month < 10 ? ("0" + month) : (month));
        trs.setRowFilter(RowFilter.regexFilter("(?i)" + txt));
    }//GEN-LAST:event_btnThisMonthActionPerformed

    private void btnAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAllActionPerformed
        // TODO add your handling code here:
        TableRowSorter<DefaultTableModel> trs = new TableRowSorter<>(dtmOrder);
        tblVendorOrder.setRowSorter(trs);

        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
        Date date = new Date();
        String currentD = dateFormat.format(date);

        String txt = "";
        trs.setRowFilter(RowFilter.regexFilter("(?i)" + txt));
    }//GEN-LAST:event_btnAllActionPerformed

    private void btnBack1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBack1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new VendorMenuFrame().setVisible(true);
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
            java.util.logging.Logger.getLogger(ViewVendorOrderFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewVendorOrderFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewVendorOrderFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewVendorOrderFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewVendorOrderFrame().setVisible(true);
            }
        });
    }

    // Input Variables declaration
    // Database Variables declaration
    private Statement sta;
    private ResultSet rs;

    // Table Variables declaration
    private int selectedRow = - 1;
    private final DefaultTableModel dtmOrder;
    private final DefaultTableModel dtmProduct;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAll;
    private javax.swing.JButton btnBack1;
    private javax.swing.JButton btnThisMonth;
    private javax.swing.JButton btnToday;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    public javax.swing.JTable tblVendorOrder;
    public javax.swing.JTable tblVendorProduct;
    private javax.swing.JTextField txtSearchOrder;
    private javax.swing.JTextField txtSearchProduct;
    // End of variables declaration//GEN-END:variables
}
