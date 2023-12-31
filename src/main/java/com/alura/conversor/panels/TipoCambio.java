/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.alura.conversor.panels;

import com.alura.cambioMoneda.enum_divisas.Divisas;
import com.alura.conversor.util.MonedasAgrupadas;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JComboBox;

/**
 *
 * @author Usuario
 */
public class TipoCambio extends javax.swing.JPanel {

    /**
     * Creates new form Temperatura
     */
    public TipoCambio() {
        initComponents();
        InitContent();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Background = new javax.swing.JLabel();
        Content = new javax.swing.JPanel();
        cboOption1 = new javax.swing.JComboBox<>();
        txtValor1 = new javax.swing.JTextField();
        cboOption2 = new javax.swing.JComboBox<>();
        txtValor2 = new javax.swing.JTextField();
        btnCalcular = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 241, 224));
        setMaximumSize(new java.awt.Dimension(1000, 800));
        setPreferredSize(new java.awt.Dimension(880, 390));

        Background.setBackground(new java.awt.Color(255, 241, 224));
        Background.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fondo-dinero-dolar-oro-monedas-dibujos-animados_31.png"))); // NOI18N
        Background.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        Background.setAlignmentY(0.0F);
        Background.setIconTextGap(0);
        Background.setMaximumSize(new java.awt.Dimension(1330, 276));
        Background.setMinimumSize(new java.awt.Dimension(880, 390));
        Background.setPreferredSize(new java.awt.Dimension(880, 390));

        Content.setBackground(new java.awt.Color(255, 241, 224));
        Content.setOpaque(false);
        Content.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cboOption1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cboOption1.setBorder(null);
        cboOption1.setPreferredSize(null);
        Content.add(cboOption1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 76, 140, 50));

        txtValor1.setBorder(null);
        txtValor1.setPreferredSize(new java.awt.Dimension(280, 50));
        txtValor1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtValor1KeyReleased(evt);
            }
        });
        Content.add(txtValor1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 76, 292, -1));

        cboOption2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cboOption2.setBorder(null);
        cboOption2.setPreferredSize(null);
        Content.add(cboOption2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 256, 140, 50));

        txtValor2.setBorder(null);
        txtValor2.setPreferredSize(new java.awt.Dimension(280, 60));
        Content.add(txtValor2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 256, 292, 50));

        btnCalcular.setBackground(new java.awt.Color(255, 181, 146));
        btnCalcular.setIcon(new javax.swing.ImageIcon(getClass().getResource("/moneda.png"))); // NOI18N
        btnCalcular.setBorder(null);
        btnCalcular.setBorderPainted(false);
        btnCalcular.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCalcular.setMaximumSize(new java.awt.Dimension(70, 46));
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });
        Content.add(btnCalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 146, 100, 90));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Content, javax.swing.GroupLayout.DEFAULT_SIZE, 880, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Content, javax.swing.GroupLayout.DEFAULT_SIZE, 390, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(Background, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
         String cbo1 =  cboOption1.getSelectedIndex()+"";
        String cbo2 = cboOption2.getSelectedIndex()+"";

        Change(cbo1, cbo2);
        ExchangeTipe();
    }//GEN-LAST:event_btnCalcularActionPerformed

    private void txtValor1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtValor1KeyReleased
        ExchangeTipe();
    }//GEN-LAST:event_txtValor1KeyReleased

    private void InitContent() {
        CboFill(cboOption1);
        CboFill(cboOption2);

    }

    private void CboFill(JComboBox cbo) {
        cbo.removeAllItems();
        cbo.addItem("Seleccionar");
        for (Divisas divisa : Divisas.values()) {
            cbo.addItem(divisa.name());
        }
    }

    private void Change(String valor1, String valor2) {
       String temp = valor1;
        valor1 = valor2;
        valor2 = temp;

        cboOption1.setSelectedIndex(Integer.valueOf(valor1));
        cboOption2.setSelectedIndex(Integer.valueOf(valor2));
        System.out.println(valor1 + " " + valor2);
    }

    private void ExchangeTipe() {
        MonedasAgrupadas moneda = new MonedasAgrupadas();
        txtValor2.setText("");

        String cbo1 = cboOption1.getSelectedItem().toString();
        String cbo2 = cboOption2.getSelectedItem().toString();

        String valor1 = txtValor1.getText();

        moneda.setDivisa1(cbo1);
        moneda.setDivisa2(cbo2);
        moneda.setValor(valor1);

        String cambio = moneda.OperaciónMoneda(cbo1, cbo2);

        txtValor2.setText(cambio);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JPanel Content;
    private javax.swing.JButton btnCalcular;
    private javax.swing.JComboBox<String> cboOption1;
    private javax.swing.JComboBox<String> cboOption2;
    private javax.swing.JTextField txtValor1;
    private javax.swing.JTextField txtValor2;
    // End of variables declaration//GEN-END:variables
}
