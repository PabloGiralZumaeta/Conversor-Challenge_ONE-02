/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.alura.conversor;

import com.alura.conversor.panels.Principal;
import com.alura.conversor.panels.TemperaturaPanel;
import com.alura.conversor.panels.TipoCambio;
import com.formdev.flatlaf.FlatLightLaf;
import java.awt.BorderLayout;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import javax.swing.JPanel;

/**
 *
 * @author Usuario
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu() {

        initComponents();

        SetTime();
        InitContent();
    }

    private void SetTime() {
        LocalDate now = LocalDate.now();

        Locale spanishLocale = new Locale("es", "Es");

        lblDate.setText(now.format(DateTimeFormatter.ofPattern("'Hoy es ' EEEE dd 'de' MMMM  'de' yyyy ", spanishLocale)).toUpperCase());
    }

    private void InitContent() {
        ShowJPanel(new Principal());

    }

    private void ShowJPanel(JPanel p) {

        p.setSize(880, 390);
        p.setLocation(0, 0);

        contentPanel.removeAll();
        contentPanel.setLayout(new BorderLayout());
        contentPanel.add(p, BorderLayout.CENTER);
        contentPanel.revalidate();
        contentPanel.repaint();

    }
//        System.out.print(contentPanel.size());}

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        content = new javax.swing.JPanel();
        OptionPane = new javax.swing.JPanel();
        btnAcerca = new javax.swing.JButton();
        btnTipoDeCambio = new javax.swing.JButton();
        btnTemperatura = new javax.swing.JButton();
        Logo = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        lblDate = new javax.swing.JTextField();
        contentPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 204, 204));
        setMinimumSize(new java.awt.Dimension(893, 440));
        setResizable(false);
        setSize(new java.awt.Dimension(893, 440));

        content.setBackground(new java.awt.Color(255, 51, 102));
        content.setMaximumSize(new java.awt.Dimension(1200, 800));

        OptionPane.setBackground(new java.awt.Color(51, 153, 255));
        OptionPane.setAlignmentX(0.0F);
        OptionPane.setAlignmentY(0.0F);
        OptionPane.setMaximumSize(new java.awt.Dimension(237, 440));
        OptionPane.setPreferredSize(new java.awt.Dimension(240, 500));
        OptionPane.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAcerca.setBackground(new java.awt.Color(0, 153, 255));
        btnAcerca.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnAcerca.setForeground(new java.awt.Color(255, 255, 255));
        btnAcerca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/outline_home_white_36dp.png"))); // NOI18N
        btnAcerca.setText("Inicio");
        btnAcerca.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 10, 1, 1, new java.awt.Color(0, 0, 0)));
        btnAcerca.setBorderPainted(false);
        btnAcerca.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnAcerca.setIconTextGap(10);
        btnAcerca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAcercaActionPerformed(evt);
            }
        });
        OptionPane.add(btnAcerca, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 240, 60));

        btnTipoDeCambio.setBackground(new java.awt.Color(0, 153, 255));
        btnTipoDeCambio.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnTipoDeCambio.setForeground(new java.awt.Color(255, 255, 255));
        btnTipoDeCambio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/moneda.png"))); // NOI18N
        btnTipoDeCambio.setText("Tipo de Cambio");
        btnTipoDeCambio.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 10, 1, 1, new java.awt.Color(0, 0, 0)));
        btnTipoDeCambio.setBorderPainted(false);
        btnTipoDeCambio.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnTipoDeCambio.setIconTextGap(10);
        btnTipoDeCambio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTipoDeCambioActionPerformed(evt);
            }
        });
        OptionPane.add(btnTipoDeCambio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 240, 60));

        btnTemperatura.setBackground(new java.awt.Color(0, 153, 255));
        btnTemperatura.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnTemperatura.setForeground(new java.awt.Color(255, 255, 255));
        btnTemperatura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/outline_thermostat_white_36dp.png"))); // NOI18N
        btnTemperatura.setText("Temperatura");
        btnTemperatura.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 10, 1, 1, new java.awt.Color(0, 0, 0)));
        btnTemperatura.setBorderPainted(false);
        btnTemperatura.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnTemperatura.setIconTextGap(10);
        btnTemperatura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTemperaturaActionPerformed(evt);
            }
        });
        OptionPane.add(btnTemperatura, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 240, 60));

        Logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/alura-logo.1686744883.png"))); // NOI18N
        Logo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LogoMouseClicked(evt);
            }
        });
        OptionPane.add(Logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 228, 153));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setAlignmentX(0.0F);
        jPanel3.setAlignmentY(0.0F);
        jPanel3.setPreferredSize(new java.awt.Dimension(880, 110));

        lblDate.setFont(new java.awt.Font("Segoe UI Emoji", 1, 24)); // NOI18N
        lblDate.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        lblDate.setText("jTextField1");
        lblDate.setActionCommand("<Not Set>");
        lblDate.setAlignmentX(0.0F);
        lblDate.setAlignmentY(0.0F);
        lblDate.setBorder(null);
        lblDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblDateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(lblDate, javax.swing.GroupLayout.PREFERRED_SIZE, 515, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(298, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblDate, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        contentPanel.setBackground(new java.awt.Color(51, 51, 51));
        contentPanel.setAlignmentX(0.0F);
        contentPanel.setAlignmentY(0.0F);
        contentPanel.setPreferredSize(new java.awt.Dimension(880, 390));

        javax.swing.GroupLayout contentPanelLayout = new javax.swing.GroupLayout(contentPanel);
        contentPanel.setLayout(contentPanelLayout);
        contentPanelLayout.setHorizontalGroup(
            contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        contentPanelLayout.setVerticalGroup(
            contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout contentLayout = new javax.swing.GroupLayout(content);
        content.setLayout(contentLayout);
        contentLayout.setHorizontalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(OptionPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(contentLayout.createSequentialGroup()
                .addGap(237, 237, 237)
                .addGroup(contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(contentPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        contentLayout.setVerticalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(OptionPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(contentLayout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addComponent(contentPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(content, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(content, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lblDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lblDateActionPerformed

    private void btnAcercaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAcercaActionPerformed

        ShowJPanel(new Principal());
        
          OptionPane.setBackground(new java.awt.Color(51, 153, 255));
        btnAcerca.setBackground(new java.awt.Color(0, 153, 255));
        btnTipoDeCambio.setBackground(new java.awt.Color(0, 153, 255));
        btnTemperatura.setBackground(new java.awt.Color(0, 153, 255));
    }//GEN-LAST:event_btnAcercaActionPerformed

    private void btnTipoDeCambioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTipoDeCambioActionPerformed
        // TODO add your handling code here:
        ShowJPanel(new TipoCambio());
        OptionPane.setBackground(new java.awt.Color(255,193,156));
        btnAcerca.setBackground(new java.awt.Color(255,168,128));
        btnTipoDeCambio.setBackground(new java.awt.Color(255,168,128));
        btnTemperatura.setBackground(new java.awt.Color(255,168,128));

    }//GEN-LAST:event_btnTipoDeCambioActionPerformed

    private void btnTemperaturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTemperaturaActionPerformed
        // TODO add your handling code here:
        ShowJPanel(new TemperaturaPanel());
        OptionPane.setBackground(new java.awt.Color(185,64,36));
        btnAcerca.setBackground(new java.awt.Color(185,61,51));
        btnTipoDeCambio.setBackground(new java.awt.Color(185,61,51));
        btnTemperatura.setBackground(new java.awt.Color(185,61,51));
//        205,90,76
    }//GEN-LAST:event_btnTemperaturaActionPerformed

    private void LogoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoMouseClicked
        // TODO add your handling code here:
        ShowJPanel(new Principal());
        OptionPane.setBackground(new java.awt.Color(51, 153, 255));
        btnAcerca.setBackground(new java.awt.Color(0, 153, 255));
        btnTipoDeCambio.setBackground(new java.awt.Color(0, 153, 255));
        btnTemperatura.setBackground(new java.awt.Color(0, 153, 255));

    }//GEN-LAST:event_LogoMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        FlatLightLaf.setup();

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Logo;
    private javax.swing.JPanel OptionPane;
    private javax.swing.JButton btnAcerca;
    private javax.swing.JButton btnTemperatura;
    private javax.swing.JButton btnTipoDeCambio;
    private javax.swing.JPanel content;
    private javax.swing.JPanel contentPanel;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField lblDate;
    // End of variables declaration//GEN-END:variables
}
