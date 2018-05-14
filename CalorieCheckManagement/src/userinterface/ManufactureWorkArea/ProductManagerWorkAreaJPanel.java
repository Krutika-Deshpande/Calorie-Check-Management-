/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.ManufactureWorkArea;

import business.Ecosystem;
import business.Enterprise.Enterprise;
import business.Enterprise.FoodLabEnterprise;
import business.Market.ManufacturedProduct;
import business.Market.ManufacturedProductDirectory;
import business.Network.Network;
import business.Organization.FoodLabManagerOrganization;
import business.Organization.Organization;
import business.Organization.ProductManagerOrganization;
import business.Organization.ProductManufacturerOrganization;
import business.UserAccount.UserAccount;
import business.WorkQueue.FoodLabManagerWorkRequest;
import business.WorkQueue.FoodLabWorkRequest;
import java.util.List;
import javax.accessibility.AccessibleContext;
import javax.swing.DefaultListModel;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import business.WorkQueue.ManufacturerWorkRequest;
import business.WorkQueue.ProductWorkQueue;
import business.WorkQueue.ProductWorkRequest;
import business.WorkQueue.WorkRequest;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.Icon;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.WARNING_MESSAGE;

/**
 *
 * @author kruts
 */
public class ProductManagerWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ProductManagerWorkAreaJPanel
     */
    private JPanel userProcessContainer;
    private ProductManagerOrganization proManagerOrganization;
    private Organization organization;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private WorkRequest workRequest;
    private Network network;
    private ManufacturedProductDirectory manufacturedProductDirectory;
    private Ecosystem system;

    public ProductManagerWorkAreaJPanel(JPanel userProcessContainer, UserAccount account,Organization organziation ,Enterprise enterprise, Network network, Ecosystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        //this.proManagerOrganization = organziation;
        this.organization = organziation;
                
        this.enterprise = enterprise;
        this.userAccount = account;
        this.network = network;
        this.system = system;
        

        manufacturedProductDirectory = new ManufacturedProductDirectory();
        workRequest = new WorkRequest();

        populateCombo();
        populateProductTable();
        populateRequestTable();
        populateRequestFoodLabTable();

        //populateSubCategoryCombo();
    }

    private void populateCombo() {
        jCategoryComboBox.removeAllItems();
        for (ManufacturedProduct.CategoryType type : ManufacturedProduct.CategoryType.values()) {
            jCategoryComboBox.addItem(type);
        }

    }

    private void populateSubCategoryCombo(ManufacturedProduct.CategoryType type) {

        jSubCategoryComboBox.removeAllItems();
        for (ManufacturedProduct.SubCategoryType sub_type : ManufacturedProduct.SubCategoryType.getValues(type)) {
            jSubCategoryComboBox.addItem(sub_type);
        }

    }

    public void populateProductTable() {
        DefaultTableModel dtm = (DefaultTableModel) productJTabel.getModel();
        dtm.setRowCount(0);
        for (ManufacturedProduct product : system.getManufacturedProductDirectory().getManufacturedProductDirectory()) {
            Object row[] = new Object[4];
            row[0] = product;
            row[1] = product.getProductID();
            row[2] = product.getCategory();
            row[3] = product.getQuantity();

            dtm.addRow(row);
        }
    }

    

   

    public void populateRequestTable() {
        DefaultTableModel model = (DefaultTableModel) workRequestJTable.getModel();

        model.setRowCount(0);
        for (WorkRequest request : userAccount.getWorkQueue().getWorkRequestList()) {
            if (request instanceof ManufacturerWorkRequest) {
                Object[] row = new Object[4];
                row[0] = request.getMessage();
                row[1] = request.getReceiver();
                row[2] = request.getStatus();
                String result;
                result = ((ManufacturerWorkRequest) request).getManufacturerResult();
                row[3] = result == null ? "Waiting" : result;
               

                model.addRow(row);
            }
        }
    }

    public void populateRequestFoodLabTable() {
        DefaultTableModel model = (DefaultTableModel) workRequestJTable2.getModel();

        model.setRowCount(0);

        for (WorkRequest request : userAccount.getWorkQueue().getWorkRequestList()) {
            if (request instanceof FoodLabManagerWorkRequest) {
                Object[] row = new Object[4];
                row[0] = request.getMessage();
                row[1] = request.getReceiver();
                row[2] = request.getStatus();
                String result;
                result = ((FoodLabManagerWorkRequest) request).getFoodlabManagerResult();
                row[3] = result == null ? "Waiting" : result;
                

                model.addRow(row);
            }
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

        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jCategoryComboBox = new javax.swing.JComboBox();
        productQuantityTxt = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        enterpriseNameLabel = new javax.swing.JLabel();
        submitBtn = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jSubCategoryComboBox = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        productNametxt = new javax.swing.JTextField();
        productIDtxt = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        productJTabel = new javax.swing.JTable();
        jSeparator2 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        ingredientsTextArea = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        priceTxt = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        enterpriseNameLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        reqmanufactureBTN = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane7 = new javax.swing.JScrollPane();
        workRequestJTable = new javax.swing.JTable();
        messageTxt1 = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        msgCalorieChecktxt = new javax.swing.JTextField();
        reqCalorieCountBTN = new javax.swing.JButton();
        enterpriseNameLabel2 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jScrollPane8 = new javax.swing.JScrollPane();
        workRequestJTable2 = new javax.swing.JTable();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setBackground(new java.awt.Color(153, 255, 204));

        jTabbedPane1.setBackground(new java.awt.Color(153, 255, 204));

        jPanel2.setBackground(new java.awt.Color(153, 255, 204));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Quantity:");

        jCategoryComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " " }));
        jCategoryComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCategoryComboBoxActionPerformed(evt);
            }
        });

        productQuantityTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productQuantityTxtActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("Ingredients:");

        enterpriseNameLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        enterpriseNameLabel.setText("EnterpiseName");

        submitBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        submitBtn.setText("SUBMIT");
        submitBtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        submitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitBtnActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("Sub-Category:");

        jSubCategoryComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Product Name:");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Product ID:");

        productNametxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productNametxtActionPerformed(evt);
            }
        });

        productIDtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productIDtxtActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("Category:");

        productJTabel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product Name", "Product ID", "Category", "Quantity"
            }
        ));
        productJTabel.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(productJTabel);

        ingredientsTextArea.setColumns(20);
        ingredientsTextArea.setRows(5);
        jScrollPane1.setViewportView(ingredientsTextArea);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Product Price:");

        priceTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                priceTxtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator2)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(enterpriseNameLabel)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(31, 31, 31)
                                        .addComponent(jLabel8))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addGap(56, 56, 56)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(productNametxt, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(21, 21, 21)
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(productIDtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(24, 24, 24)
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(productQuantityTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jCategoryComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jSubCategoryComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(27, 27, 27)
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(priceTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 508, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(362, 362, 362)
                        .addComponent(submitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(439, 530, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(enterpriseNameLabel)
                .addGap(58, 58, 58)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(productNametxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel1)
                    .addComponent(productIDtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(productQuantityTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCategoryComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel9)
                    .addComponent(jSubCategoryComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(priceTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel8))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(82, 82, 82)
                .addComponent(submitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(93, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Create Product", jPanel2);

        jPanel3.setBackground(new java.awt.Color(153, 255, 204));

        enterpriseNameLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        enterpriseNameLabel1.setText("EnterpiseName");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Write a Message:");

        reqmanufactureBTN.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        reqmanufactureBTN.setText("Request Manufacture");
        reqmanufactureBTN.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        reqmanufactureBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reqmanufactureBTNActionPerformed(evt);
            }
        });

        workRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Message", "Sender", "Receiver", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        workRequestJTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane7.setViewportView(workRequestJTable);

        messageTxt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                messageTxt1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(enterpriseNameLabel1))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(498, 498, 498)
                        .addComponent(reqmanufactureBTN))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(394, 394, 394)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(messageTxt1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(159, 159, 159)
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 862, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(524, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(enterpriseNameLabel1)
                .addGap(65, 65, 65)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(messageTxt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(reqmanufactureBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(284, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Manufacture Product", jPanel3);

        jPanel4.setBackground(new java.awt.Color(153, 255, 204));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setText("Write a Message:");

        msgCalorieChecktxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                msgCalorieChecktxtActionPerformed(evt);
            }
        });

        reqCalorieCountBTN.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        reqCalorieCountBTN.setText("Request Calorie Count");
        reqCalorieCountBTN.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        reqCalorieCountBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reqCalorieCountBTNActionPerformed(evt);
            }
        });

        enterpriseNameLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        enterpriseNameLabel2.setText("EnterpiseName");

        workRequestJTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Message", "Sender", "Receiver", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        workRequestJTable2.getTableHeader().setReorderingAllowed(false);
        jScrollPane8.setViewportView(workRequestJTable2);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator4, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(574, 574, 574)
                                .addComponent(jLabel5))
                            .addComponent(enterpriseNameLabel2)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(475, 475, 475)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(msgCalorieChecktxt, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(599, 599, 599)
                        .addComponent(reqCalorieCountBTN))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(312, 312, 312)
                        .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 862, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(371, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(enterpriseNameLabel2)
                .addGap(70, 70, 70)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(90, 90, 90))
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(msgCalorieChecktxt, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 104, Short.MAX_VALUE)
                .addComponent(reqCalorieCountBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(296, 296, 296))
        );

        jTabbedPane1.addTab("Food Lab Managament", jPanel4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addGap(8, 8, 8))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void reqmanufactureBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reqmanufactureBTNActionPerformed
        // TODO add your handling code here:
        //populateProductmanufactureTable();
       
            String message = messageTxt1.getText();
            
//            DateFormat df = new SimpleDateFormat("dd/MM/yy");
//            Date requestDate = new Date();
            ManufacturerWorkRequest request = new ManufacturerWorkRequest();
            request.setMessage(message);
            request.setSender(userAccount);
            request.setStatus("Sent");

            Organization org = null;
            for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
                if (organization instanceof ProductManufacturerOrganization) {
                    org = organization;
                    break;
                }
            }
            if (org != null) {
                org.getWorkQueue().getWorkRequestList().add(request);
                userAccount.getWorkQueue().getWorkRequestList().add(request);
            }
            populateRequestTable();
           
        


    }//GEN-LAST:event_reqmanufactureBTNActionPerformed

    private void productIDtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productIDtxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_productIDtxtActionPerformed

    private void productNametxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productNametxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_productNametxtActionPerformed

    private void submitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitBtnActionPerformed
        // TODO add your handling code here:

        String productName = productNametxt.getText();
        String productID = productIDtxt.getText();
        int quantity = 0;
        double price = 0;
        try{
               quantity= Integer.parseInt(productQuantityTxt.getText());
                price = Double.parseDouble(priceTxt.getText());
        }
        catch(NumberFormatException e){
            
        }
      
        ManufacturedProduct.CategoryType type = (ManufacturedProduct.CategoryType) jCategoryComboBox.getSelectedItem();
        ManufacturedProduct.SubCategoryType type1 = (ManufacturedProduct.SubCategoryType) jSubCategoryComboBox.getSelectedItem();
      
        ManufacturedProduct product = system.getManufacturedProductDirectory().addManufacturedProduct();

        String ingredients = ingredientsTextArea.getText();
        product.setProductName(productName);
        product.setProductID(productID);
        product.setQuantity(quantity);
        product.setIngredients(ingredients);
        product.setCategory(type);
        product.setSubCategory(type1);
        product.setPrice(price);
        populateProductTable();
        productNametxt.setText("");
        productIDtxt.setText("");
        productQuantityTxt.setText("");
        ingredientsTextArea.setText("");
        priceTxt.setText("");
        
       

    }//GEN-LAST:event_submitBtnActionPerformed

    private void productQuantityTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productQuantityTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_productQuantityTxtActionPerformed

    private void jCategoryComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCategoryComboBoxActionPerformed
        // TODO add your handling code here:
        if (jCategoryComboBox.getSelectedItem() == null) {
            return;
        }
        Object c = jCategoryComboBox.getSelectedItem();
        ManufacturedProduct.CategoryType type = null;
        if (c.equals(ManufacturedProduct.CategoryType.Dairy)) {
            type = ManufacturedProduct.CategoryType.Dairy;
        } else if (c.equals(ManufacturedProduct.CategoryType.ProteinFoods)) {
            type = ManufacturedProduct.CategoryType.ProteinFoods;
        } else if (c.equals(ManufacturedProduct.CategoryType.Grains)) {
            type = ManufacturedProduct.CategoryType.Grains;
        } else if (c.equals(ManufacturedProduct.CategoryType.Fruits)) {
            type = ManufacturedProduct.CategoryType.Fruits;
        } else if (c.equals(ManufacturedProduct.CategoryType.SnacksSweets)) {
            type = ManufacturedProduct.CategoryType.SnacksSweets;
        } else if (c.equals(ManufacturedProduct.CategoryType.Vegetables)) {
            type = ManufacturedProduct.CategoryType.Vegetables;
        } else if (c.equals(ManufacturedProduct.CategoryType.Beverages)) {
            type = ManufacturedProduct.CategoryType.Beverages;
        }

        populateSubCategoryCombo(type);


    }//GEN-LAST:event_jCategoryComboBoxActionPerformed

    private void reqCalorieCountBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reqCalorieCountBTNActionPerformed
        // TODO add your handling code here:

        //int selectedRow = productJTabel2.getSelectedRow();

        //if (selectedRow >= 0) {
           
            ArrayList<WorkRequest> workRequestList = userAccount.getWorkQueue().getWorkRequestList();
            for (int i = 0, len = workRequestList.size(); i < len; i++) {
                WorkRequest request = workRequestList.get(i);
                if ((request instanceof ManufacturerWorkRequest) && !(((ManufacturerWorkRequest) request).getManufacturerResult().isEmpty())
                        && ((ManufacturerWorkRequest) request).getManufacturerResult().equals("Done")) {
                    String message = msgCalorieChecktxt.getText();
                    FoodLabManagerWorkRequest foodrequest = new FoodLabManagerWorkRequest();
                    foodrequest.setMessage(message);
                    foodrequest.setSender(userAccount);
                    foodrequest.setStatus("Sent");
                    Enterprise enter = null;

                    for (Network network : system.getNetworkList()) {
                        for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                            if (enterprise instanceof FoodLabEnterprise) {
                                enter = enterprise;
                                Organization org = null;
                                for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
                                    if (organization instanceof FoodLabManagerOrganization) {
                                        org = organization;
                                        break;
                                    }
                                    if (org != null) {
                                        org.getWorkQueue().getWorkRequestList().add(foodrequest);
                                        userAccount.getWorkQueue().getWorkRequestList().add(foodrequest);
                                    }
                                }
                                break;
                            }
                        }
                        if (enter != null) {
                            enter.getWorkQueue().getWorkRequestList().add(foodrequest);
                            userAccount.getWorkQueue().getWorkRequestList().add(foodrequest);
                        }
                    }
                

               
                }
                 populateRequestFoodLabTable();
            
//        } else {
//            JOptionPane.showMessageDialog(null, "Please Select a Manufactured Product", "Warning", WARNING_MESSAGE);
//        }
            }
            
    }//GEN-LAST:event_reqCalorieCountBTNActionPerformed

    private void msgCalorieChecktxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_msgCalorieChecktxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_msgCalorieChecktxtActionPerformed
    DefaultListModel model = new DefaultListModel();
    private void messageTxt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_messageTxt1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_messageTxt1ActionPerformed

    private void priceTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_priceTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_priceTxtActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel enterpriseNameLabel;
    private javax.swing.JLabel enterpriseNameLabel1;
    private javax.swing.JLabel enterpriseNameLabel2;
    private javax.swing.JTextArea ingredientsTextArea;
    private javax.swing.JComboBox jCategoryComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JComboBox jSubCategoryComboBox;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField messageTxt1;
    private javax.swing.JTextField msgCalorieChecktxt;
    private javax.swing.JTextField priceTxt;
    private javax.swing.JTextField productIDtxt;
    private javax.swing.JTable productJTabel;
    private javax.swing.JTextField productNametxt;
    private javax.swing.JTextField productQuantityTxt;
    private javax.swing.JButton reqCalorieCountBTN;
    private javax.swing.JButton reqmanufactureBTN;
    private javax.swing.JButton submitBtn;
    private javax.swing.JTable workRequestJTable;
    private javax.swing.JTable workRequestJTable2;
    // End of variables declaration//GEN-END:variables
}
