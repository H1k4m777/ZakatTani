/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zakattani;

/**
 *
 * @hkm
 */
import javax.swing.JOptionPane;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Locale;

public class cetak_Hasil extends javax.swing.JFrame {

    /**
     * Creates new form cetak_panen
     */
    public cetak_Hasil() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tf_hasilPanen = new javax.swing.JTextField();
        tf_harga = new javax.swing.JTextField();
        cb_biaya = new javax.swing.JComboBox<>();
        btn_reset = new javax.swing.JButton();
        btn_hsl = new javax.swing.JButton();
        lb_hasil = new javax.swing.JLabel();

        jLabel4.setText("jLabel4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("ZakatTani");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Hasil Panen");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Harga Panen");

        tf_hasilPanen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_hasilPanenActionPerformed(evt);
            }
        });

        tf_harga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_hargaActionPerformed(evt);
            }
        });

        cb_biaya.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cb_biaya.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--->Pilih Biaya Perawatan<---", "Ada biaya perawatan", "Tidak ada biaya perawatan" }));
        cb_biaya.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cb_biaya.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_biayaActionPerformed(evt);
            }
        });

        btn_reset.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_reset.setText("Reset");
        btn_reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_resetActionPerformed(evt);
            }
        });

        btn_hsl.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_hsl.setText("Hitung Zakat");
        btn_hsl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_hslActionPerformed(evt);
            }
        });

        lb_hasil.setFont(new java.awt.Font("Yu Gothic UI Light", 3, 14)); // NOI18N
        lb_hasil.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_hasil.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lb_hasil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(93, 93, 93)
                            .addComponent(jLabel1))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGap(402, 402, 402)
                            .addComponent(btn_hsl)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btn_reset))
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3)
                                .addComponent(jLabel2))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tf_hasilPanen, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tf_harga, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cb_biaya, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(368, 368, 368)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tf_hasilPanen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cb_biaya, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_harga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(btn_hsl)
                    .addComponent(btn_reset))
                .addGap(83, 83, 83)
                .addComponent(lb_hasil, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tf_hasilPanenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_hasilPanenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_hasilPanenActionPerformed

    private void tf_hargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_hargaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_hargaActionPerformed

    private void cb_biayaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_biayaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_biayaActionPerformed

    private void btn_resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_resetActionPerformed
        // TODO add your handling code here:
        tf_hasilPanen.setText("");
        tf_harga.setText("");
        lb_hasil.setText("");
    }//GEN-LAST:event_btn_resetActionPerformed

    private void btn_hslActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_hslActionPerformed
        // TODO add your handling code here:
        int panen = Integer.valueOf(tf_hasilPanen.getText().trim());
        int harga = Integer.valueOf(tf_harga.getText().trim());
        
        String biaya = (String)cb_biaya.getSelectedItem();
        
        DecimalFormat kursIndonesia = (DecimalFormat) DecimalFormat.getCurrencyInstance();
        DecimalFormatSymbols formatRp = new DecimalFormatSymbols();
        formatRp.setCurrencySymbol("Rp. ");
        formatRp.setMonetaryDecimalSeparator(',');
        formatRp.setGroupingSeparator('.');
        
        if(tf_harga.getText().isEmpty() && tf_hasilPanen.getText().isEmpty() ){
            JOptionPane.showMessageDialog(null, "Isi Hasil panen dan harganya dahulu");
        }else{       
            if(panen < 653){
                lb_hasil.setText("tidak memenuhi Syarat");
                tf_hasilPanen.setText("");
                tf_harga.setText("");
                JOptionPane.showMessageDialog(null, "tidak memenuhi Syarat sah");
            }
            else if("--->Pilih Biaya Perawatan<---".equals(biaya)){
                JOptionPane.showMessageDialog(null, "pilih biaya perawatan dahulu");
                lb_hasil.setText("");
            }else
                if("Ada biaya perawatan".equals(biaya)){                 
                    kursIndonesia.setDecimalFormatSymbols(formatRp);
                    lb_hasil.setText(String.valueOf(kursIndonesia.format(panen*harga*0.05)));

                }else if("Tidak ada biaya perawatan".equals(biaya)){
                    
                    kursIndonesia.setDecimalFormatSymbols(formatRp);
                    lb_hasil.setText(String.valueOf(kursIndonesia.format(panen*harga*0.10)));

                }
            }
    }//GEN-LAST:event_btn_hslActionPerformed

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
            java.util.logging.Logger.getLogger(cetak_Hasil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cetak_Hasil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cetak_Hasil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cetak_Hasil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cetak_Hasil().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_hsl;
    private javax.swing.JButton btn_reset;
    private javax.swing.JComboBox<String> cb_biaya;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lb_hasil;
    private javax.swing.JTextField tf_harga;
    private javax.swing.JTextField tf_hasilPanen;
    // End of variables declaration//GEN-END:variables
}
