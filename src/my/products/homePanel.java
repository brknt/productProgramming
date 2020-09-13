/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.products;

import java.awt.Color;
import java.io.FileWriter;
import java.sql.*;
import java.text.DecimalFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;
import org.json.simple.JSONObject;

/**
 *
 * @author Berkant
 */
public class homePanel extends javax.swing.JFrame {

JSONObject obj ;
Connection conn = null;
PreparedStatement pst = null;
ResultSet rs = null;
private static FileWriter file;

    public homePanel() {
        initComponents();
        conn = DbConn.ConnectDb();
        createNewTable();
        setVisible(true);
        setLocationRelativeTo(null);// frame center
        obj = new JSONObject();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgPanel = new javax.swing.JPanel();
        topPanel = new javax.swing.JPanel();
        headerLabel = new javax.swing.JLabel();
        exitLabelTop = new javax.swing.JLabel();
        sidePanel = new javax.swing.JPanel();
        savePanel = new javax.swing.JPanel();
        saveLabel = new javax.swing.JLabel();
        updatePanel = new javax.swing.JPanel();
        updateLabel = new javax.swing.JLabel();
        exitPanel = new javax.swing.JPanel();
        exitLabel = new javax.swing.JLabel();
        reportPanel = new javax.swing.JPanel();
        reportLabel = new javax.swing.JLabel();
        centerPanel = new javax.swing.JPanel();
        p1 = new javax.swing.JPanel();
        lblName = new javax.swing.JLabel();
        lblPrice = new javax.swing.JLabel();
        lblVat = new javax.swing.JLabel();
        lblBarcode = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtNo = new javax.swing.JTextField();
        txtPrice = new javax.swing.JTextField();
        txtVat = new javax.swing.JTextField();
        txtBarcode = new javax.swing.JTextField();
        saveHeader = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();
        lblNo = new javax.swing.JLabel();
        p2 = new javax.swing.JPanel();
        txtBarcode2 = new javax.swing.JTextField();
        btnUpdate = new javax.swing.JButton();
        updateHeader = new javax.swing.JLabel();
        lblNo2 = new javax.swing.JLabel();
        btnSearchNo = new javax.swing.JButton();
        lblName2 = new javax.swing.JLabel();
        btnSearchName = new javax.swing.JButton();
        lblPrice2 = new javax.swing.JLabel();
        lblVat2 = new javax.swing.JLabel();
        lblBarcode2 = new javax.swing.JLabel();
        txtName2 = new javax.swing.JTextField();
        txtNo2 = new javax.swing.JTextField();
        txtPrice2 = new javax.swing.JTextField();
        txtVat2 = new javax.swing.JTextField();
        p3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableReport = new javax.swing.JTable();
        jsonBtn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        textAreaJson = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);

        bgPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        topPanel.setBackground(new java.awt.Color(55, 38, 91));
        topPanel.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                topPanelMouseDragged(evt);
            }
        });
        topPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                homePanel.this.mousePressed(evt);
            }
        });

        headerLabel.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        headerLabel.setForeground(new java.awt.Color(255, 255, 255));
        headerLabel.setText("Welcome to  Product Tracking Program");

        exitLabelTop.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        exitLabelTop.setForeground(new java.awt.Color(204, 204, 204));
        exitLabelTop.setText("X");
        exitLabelTop.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                exitLabelTopMousePressed(evt);
            }
        });

        javax.swing.GroupLayout topPanelLayout = new javax.swing.GroupLayout(topPanel);
        topPanel.setLayout(topPanelLayout);
        topPanelLayout.setHorizontalGroup(
            topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topPanelLayout.createSequentialGroup()
                .addGap(155, 155, 155)
                .addComponent(headerLabel)
                .addContainerGap(587, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, topPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(exitLabelTop)
                .addGap(430, 430, 430))
        );
        topPanelLayout.setVerticalGroup(
            topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topPanelLayout.createSequentialGroup()
                .addComponent(exitLabelTop)
                .addGap(20, 20, 20)
                .addComponent(headerLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        bgPanel.add(topPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 100));

        sidePanel.setBackground(new java.awt.Color(55, 38, 91));

        savePanel.setBackground(new java.awt.Color(85, 55, 118));
        savePanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homePanel.this.mouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                homePanel.this.mouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                homePanel.this.mouseExited(evt);
            }
        });

        saveLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        saveLabel.setForeground(new java.awt.Color(204, 204, 204));
        saveLabel.setText("Ürün Kaydetme");

        javax.swing.GroupLayout savePanelLayout = new javax.swing.GroupLayout(savePanel);
        savePanel.setLayout(savePanelLayout);
        savePanelLayout.setHorizontalGroup(
            savePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(savePanelLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(saveLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        savePanelLayout.setVerticalGroup(
            savePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(savePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(saveLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        updatePanel.setBackground(new java.awt.Color(85, 55, 118));
        updatePanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homePanel.this.mouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                homePanel.this.mouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                homePanel.this.mouseExited(evt);
            }
        });

        updateLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        updateLabel.setForeground(new java.awt.Color(204, 204, 204));
        updateLabel.setText("Ürün Güncelleme");

        javax.swing.GroupLayout updatePanelLayout = new javax.swing.GroupLayout(updatePanel);
        updatePanel.setLayout(updatePanelLayout);
        updatePanelLayout.setHorizontalGroup(
            updatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(updatePanelLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(updateLabel)
                .addContainerGap(35, Short.MAX_VALUE))
        );
        updatePanelLayout.setVerticalGroup(
            updatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(updatePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(updateLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        exitPanel.setBackground(new java.awt.Color(85, 55, 118));
        exitPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitPanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                homePanel.this.mouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                homePanel.this.mouseExited(evt);
            }
        });

        exitLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        exitLabel.setForeground(new java.awt.Color(204, 204, 204));
        exitLabel.setText("Çıkış");

        javax.swing.GroupLayout exitPanelLayout = new javax.swing.GroupLayout(exitPanel);
        exitPanel.setLayout(exitPanelLayout);
        exitPanelLayout.setHorizontalGroup(
            exitPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(exitPanelLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(exitLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        exitPanelLayout.setVerticalGroup(
            exitPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(exitPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(exitLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        reportPanel.setBackground(new java.awt.Color(85, 55, 118));
        reportPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homePanel.this.mouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                homePanel.this.mouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                homePanel.this.mouseExited(evt);
            }
        });

        reportLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        reportLabel.setForeground(new java.awt.Color(204, 204, 204));
        reportLabel.setText("Raporlama");

        javax.swing.GroupLayout reportPanelLayout = new javax.swing.GroupLayout(reportPanel);
        reportPanel.setLayout(reportPanelLayout);
        reportPanelLayout.setHorizontalGroup(
            reportPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(reportPanelLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(reportLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        reportPanelLayout.setVerticalGroup(
            reportPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(reportPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(reportLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout sidePanelLayout = new javax.swing.GroupLayout(sidePanel);
        sidePanel.setLayout(sidePanelLayout);
        sidePanelLayout.setHorizontalGroup(
            sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(savePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(updatePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(exitPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(reportPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        sidePanelLayout.setVerticalGroup(
            sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidePanelLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(savePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(updatePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(reportPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(exitPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(85, Short.MAX_VALUE))
        );

        bgPanel.add(sidePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 210, 360));

        centerPanel.setLayout(new java.awt.CardLayout());

        lblName.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lblName.setText("Ürün Adı           ");

        lblPrice.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lblPrice.setText("Ürün Fiyatı        ");

        lblVat.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lblVat.setText("Ürün Kdvsi        ");

        lblBarcode.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lblBarcode.setText("Ürün Barkodu  ");

        saveHeader.setBackground(new java.awt.Color(55, 38, 91));
        saveHeader.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        saveHeader.setText("Ürün Kaydetme");

        btnSave.setBackground(new java.awt.Color(85, 55, 118));
        btnSave.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSave.setText("Kaydet");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        lblNo.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lblNo.setText("Ürün No");

        javax.swing.GroupLayout p1Layout = new javax.swing.GroupLayout(p1);
        p1.setLayout(p1Layout);
        p1Layout.setHorizontalGroup(
            p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p1Layout.createSequentialGroup()
                .addGap(134, 134, 134)
                .addGroup(p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(p1Layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addComponent(saveHeader))
                    .addGroup(p1Layout.createSequentialGroup()
                        .addComponent(lblNo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNo, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(p1Layout.createSequentialGroup()
                        .addComponent(lblVat, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtVat, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(p1Layout.createSequentialGroup()
                        .addGroup(p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(p1Layout.createSequentialGroup()
                        .addComponent(lblBarcode, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtBarcode, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(207, Short.MAX_VALUE))
        );
        p1Layout.setVerticalGroup(
            p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p1Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(saveHeader)
                .addGap(18, 18, 18)
                .addGroup(p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNo, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                    .addComponent(lblNo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtName, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                    .addComponent(lblName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPrice, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                    .addComponent(lblPrice))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtVat, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .addComponent(lblVat))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBarcode, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblBarcode))
                .addGap(18, 18, 18)
                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
        );

        centerPanel.add(p1, "card2");

        btnUpdate.setBackground(new java.awt.Color(85, 55, 118));
        btnUpdate.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnUpdate.setText("Güncelle");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        updateHeader.setBackground(new java.awt.Color(55, 38, 91));
        updateHeader.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        updateHeader.setText("Ürün Güncelleme");

        lblNo2.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lblNo2.setText("Ürün No");

        btnSearchNo.setBackground(new java.awt.Color(0, 153, 51));
        btnSearchNo.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btnSearchNo.setText("Ara");
        btnSearchNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchNoActionPerformed(evt);
            }
        });

        lblName2.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lblName2.setText("Ürün Adı           ");

        btnSearchName.setBackground(new java.awt.Color(0, 153, 51));
        btnSearchName.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btnSearchName.setText("Ara");
        btnSearchName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchNameActionPerformed(evt);
            }
        });

        lblPrice2.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lblPrice2.setText("Ürün Fiyatı        ");

        lblVat2.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lblVat2.setText("Ürün Kdvsi        ");

        lblBarcode2.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lblBarcode2.setText("Ürün Barkodu  ");

        javax.swing.GroupLayout p2Layout = new javax.swing.GroupLayout(p2);
        p2.setLayout(p2Layout);
        p2Layout.setHorizontalGroup(
            p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p2Layout.createSequentialGroup()
                .addGap(131, 131, 131)
                .addGroup(p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(p2Layout.createSequentialGroup()
                        .addGroup(p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(p2Layout.createSequentialGroup()
                                .addComponent(lblNo2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtNo2, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(p2Layout.createSequentialGroup()
                                .addComponent(lblVat2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtVat2, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(p2Layout.createSequentialGroup()
                                .addComponent(lblBarcode2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtBarcode2, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(p2Layout.createSequentialGroup()
                                .addGroup(p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblName2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblPrice2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtName2, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPrice2, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(btnUpdate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSearchNo)
                            .addComponent(btnSearchName)))
                    .addGroup(p2Layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(updateHeader)))
                .addContainerGap(147, Short.MAX_VALUE))
        );
        p2Layout.setVerticalGroup(
            p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p2Layout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addComponent(updateHeader)
                .addGap(18, 18, 18)
                .addGroup(p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNo2)
                    .addComponent(txtNo2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearchNo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblName2)
                    .addComponent(txtName2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearchName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPrice2)
                    .addComponent(txtPrice2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblVat2)
                    .addComponent(txtVat2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBarcode2)
                    .addComponent(txtBarcode2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
        );

        centerPanel.add(p2, "card3");

        tableReport.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tableReport);

        jsonBtn.setBackground(new java.awt.Color(85, 55, 118));
        jsonBtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jsonBtn.setText("Show JSON");
        jsonBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jsonBtnActionPerformed(evt);
            }
        });

        textAreaJson.setColumns(20);
        textAreaJson.setRows(5);
        jScrollPane2.setViewportView(textAreaJson);

        javax.swing.GroupLayout p3Layout = new javax.swing.GroupLayout(p3);
        p3.setLayout(p3Layout);
        p3Layout.setHorizontalGroup(
            p3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p3Layout.createSequentialGroup()
                .addGroup(p3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jsonBtn))
                    .addComponent(jScrollPane2))
                .addContainerGap())
        );
        p3Layout.setVerticalGroup(
            p3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p3Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jsonBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        centerPanel.add(p3, "card4");

        bgPanel.add(centerPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 110, 610, 350));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bgPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 845, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bgPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed

        String sql = "INSERT INTO Products(Id,Name,Price,Vat,Barcode) VALUES(?,?,?,?,?)";
        try{
            pst = conn.prepareStatement(sql);
            pst.setString(1,txtNo.getText());
            
            if(txtName.getText().length()<20){
              pst.setString(2,txtName.getText()); 
            }else{
                JOptionPane.showMessageDialog(null,"The product name should not be longer than 20 characters!");
                pst.cancel();}
        
            //The price is at most 2 decimal places
        String numberD = String.valueOf(txtPrice.getText());
        numberD = numberD.substring ( numberD.lastIndexOf('.') + 1).trim();
        int numberInt = Integer.parseInt(numberD);    
        int count = 0;
        while(numberInt != 0)
        {
            // num = num/10
            numberInt /= 10;
            ++count;
        }
            if(count<3){
                pst.setString(3,txtPrice.getText());
            }else{
                JOptionPane.showMessageDialog(null,"There can be a maximum of 2 digits after the comma.");
                pst.cancel();
            }
            
            
            pst.setString(4,txtVat.getText());

            if(txtBarcode.getText().length()== 0 || txtBarcode.getText().length()==13){
                pst.setString(5,txtBarcode.getText());

            }
            else {
                JOptionPane.showMessageDialog(null,"Barcode length must be 0 or 13!");
                

            }
            pst.execute();
            JOptionPane.showMessageDialog(null, "Inserted Succesfully");
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        

                       
        
          
                    
       txtNo.setText(null);txtName.setText(null);txtPrice.setText(null);txtVat.setText(null);txtBarcode.setText(null);
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed

           //The price is at most 2 decimal places
        String numberD = String.valueOf(txtPrice2.getText());
        numberD = numberD.substring ( numberD.lastIndexOf('.') + 1).trim();
        int numberInt = Integer.parseInt(numberD);    
        int count = 0;
        while(numberInt != 0)
        {
            // num = num/10
            numberInt /= 10;
            ++count;
        }
        System.out.println(count);
      if(txtBarcode2.getText().length()== 0 || txtBarcode2.getText().length()==13){
       if(count<3){
           
        try{ 
            
            String sql = "update Products set "
        + " Name = '"+txtName2.getText()+"',"
        + " Price = '"+txtPrice2.getText()+"',"
        + " Vat = '"+txtVat2.getText()+"',"
        + " Barcode = '"+txtBarcode2.getText()+"'"
        + "where Id = "+txtNo2.getText().toString();
            pst = conn.prepareStatement(sql);
            pst.execute();
            if(pst.executeUpdate()==1){
                JOptionPane.showMessageDialog(null, "Update succesfully");
            }else{
                JOptionPane.showMessageDialog(null, "Update failed");
            }
            
            
           
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        } 
      }else{
           JOptionPane.showMessageDialog(null, "There can be a maximum of 2 digits after the comma!");
       }
      }else{
          JOptionPane.showMessageDialog(null, "Barcode length must be 0 or 13!");
      }
        
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnSearchNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchNoActionPerformed

        try{

            String sql = "select * from Products where Id = ?";
            pst = conn.prepareStatement(sql);
            pst.setString(1, txtNo2.getText());
            rs = pst.executeQuery();

            if(rs.next()){
                txtName2.setText(rs.getString("Name"));
                txtPrice2.setText(rs.getString("Price"));
                txtVat2.setText(rs.getString("Vat"));
                txtBarcode2.setText(rs.getString("Barcode"));
            }  else{
                JOptionPane.showMessageDialog(null,"No Records Found");
            }
        }catch(Exception e){

        }
    }//GEN-LAST:event_btnSearchNoActionPerformed

    private void btnSearchNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchNameActionPerformed

        try{

            String sql = "select * from Products where Name = ?";
            pst = conn.prepareStatement(sql);
            pst.setString(1, txtName2.getText());
            rs = pst.executeQuery();

            if(rs.next()){
                txtNo2.setText(rs.getString("Id"));
                txtPrice2.setText(rs.getString("Price"));
                txtVat2.setText(rs.getString("Vat"));
                txtBarcode2.setText(rs.getString("Barcode"));
            }
            else{
                JOptionPane.showMessageDialog(null,"No Records Found!");
            }
        }catch(Exception e){

        }
    }//GEN-LAST:event_btnSearchNameActionPerformed

    private void jsonBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jsonBtnActionPerformed

    }//GEN-LAST:event_jsonBtnActionPerformed

    private void mouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mouseClicked
        
        if(evt.getSource()==savePanel){
            p1.setVisible(true);
            p2.setVisible(false);
            p3.setVisible(false);
        }
                
        if(evt.getSource()==updatePanel){
            p1.setVisible(false);
            p2.setVisible(true);
            p3.setVisible(false);
        }
                
        if(evt.getSource()==reportPanel){
            p1.setVisible(false);
            p2.setVisible(false);
            p3.setVisible(true);
            productReporting();
            
        }
        
        
    }//GEN-LAST:event_mouseClicked

        private void productReporting(){
        
        String sql = "select * from Products";
        try{
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            tableReport.setModel(DbUtils.resultSetToTableModel(rs));
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
    }
    private void mouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mouseEntered
        
        if(evt.getSource()==savePanel){
            savePanel.setBackground(new Color(135,135,135));
        }
         if(evt.getSource()==updatePanel){
            updatePanel.setBackground(new Color(135,135,135));
        }
          if(evt.getSource()==reportPanel){
            reportPanel.setBackground(new Color(135,135,135));
        }
          if(evt.getSource()==exitPanel){
            exitPanel.setBackground(Color.red);
        }
    }//GEN-LAST:event_mouseEntered

    private void mouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mouseExited
        
         if(evt.getSource()==savePanel){
            savePanel.setBackground(new Color(85,55,118));
        }
         if(evt.getSource()==updatePanel){
            updatePanel.setBackground(new Color(85,55,118));
        }
          if(evt.getSource()==reportPanel){
            reportPanel.setBackground(new Color(85,55,118));
        }
          if(evt.getSource()==exitPanel){
            exitPanel.setBackground(new Color(85,55,118));
        }
        
    }//GEN-LAST:event_mouseExited

    int xx;
    int xy;
    private void topPanelMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_topPanelMouseDragged
        
        int x=evt.getXOnScreen();
        int y=evt.getYOnScreen();
        this.setLocation(x-xx, y-xy);

    }//GEN-LAST:event_topPanelMouseDragged


    private void mousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mousePressed
        xx=evt.getX();
        xy=evt.getY();
    }//GEN-LAST:event_mousePressed

    private void exitLabelTopMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitLabelTopMousePressed
        System.exit(0);
    }//GEN-LAST:event_exitLabelTopMousePressed

    private void exitPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitPanelMouseClicked
        System.exit(0);
    }//GEN-LAST:event_exitPanelMouseClicked

  
     public static void createNewTable() {
        // SQLite connection string
        String url = "jdbc:sqlite:productsDb.db";
        
        // SQL statement for creating a new table
        String sql = "CREATE TABLE IF NOT EXISTS Products (\n"
                + "	Id INTEGER,\n"
                + "	Name VARCHAR(20),\n"
                + "	Price DECIMAL(5,2) ,\n"
                + "     Vat INTEGER,\n"
                + "     Barcode VARCHAR(13),\n"
                + "CONSTRAINT CK_Barcode CHECK (length(Barcode) = 0 OR length(Barcode = 13)),\n"
                + "CONSTRAINT CK_Vat CHECK(Vat IN ('0', '1', '8', '18')),\n"
                + "CONSTRAINT CK_Id CHECK(Id BETWEEN 0 AND 10000),\n"
                + "PRIMARY KEY(Id)\n"
                +  ");";
        
        try (Connection conn = DriverManager.getConnection(url);
                Statement stmt = conn.createStatement()) {
            // create a new table
            stmt.execute(sql);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    
    
    
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
            java.util.logging.Logger.getLogger(homePanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(homePanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(homePanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(homePanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new homePanel().setVisible(true);
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bgPanel;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnSearchName;
    private javax.swing.JButton btnSearchNo;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JPanel centerPanel;
    private javax.swing.JLabel exitLabel;
    private javax.swing.JLabel exitLabelTop;
    private javax.swing.JPanel exitPanel;
    private javax.swing.JLabel headerLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton jsonBtn;
    private javax.swing.JLabel lblBarcode;
    private javax.swing.JLabel lblBarcode2;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblName2;
    private javax.swing.JLabel lblNo;
    private javax.swing.JLabel lblNo2;
    private javax.swing.JLabel lblPrice;
    private javax.swing.JLabel lblPrice2;
    private javax.swing.JLabel lblVat;
    private javax.swing.JLabel lblVat2;
    private javax.swing.JPanel p1;
    private javax.swing.JPanel p2;
    private javax.swing.JPanel p3;
    private javax.swing.JLabel reportLabel;
    private javax.swing.JPanel reportPanel;
    private javax.swing.JLabel saveHeader;
    private javax.swing.JLabel saveLabel;
    private javax.swing.JPanel savePanel;
    private javax.swing.JPanel sidePanel;
    private javax.swing.JTable tableReport;
    private javax.swing.JTextArea textAreaJson;
    private javax.swing.JPanel topPanel;
    private javax.swing.JTextField txtBarcode;
    private javax.swing.JTextField txtBarcode2;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtName2;
    private javax.swing.JTextField txtNo;
    private javax.swing.JTextField txtNo2;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtPrice2;
    private javax.swing.JTextField txtVat;
    private javax.swing.JTextField txtVat2;
    private javax.swing.JLabel updateHeader;
    private javax.swing.JLabel updateLabel;
    private javax.swing.JPanel updatePanel;
    // End of variables declaration//GEN-END:variables
}
