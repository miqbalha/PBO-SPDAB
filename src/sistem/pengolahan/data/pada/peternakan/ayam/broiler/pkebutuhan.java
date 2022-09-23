/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistem.pengolahan.data.pada.peternakan.ayam.broiler;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author IQBAL
 */
public class pkebutuhan extends javax.swing.JFrame {

    /**
     * Creates new form pkebutuhan
     */
    public pkebutuhan() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        home = new javax.swing.JMenu();
        dtakaryawan = new javax.swing.JMenu();
        dtadistribusi = new javax.swing.JMenu();
        dtakandang = new javax.swing.JMenu();
        dtaayam = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setPreferredSize(new java.awt.Dimension(882, 600));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("PERIODE");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(70, 110, 81, 24);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bulan", "Januari", "Februari", "Maret", "April", "Mei", "Juni", "Juli", "Agustus", "September", "Oktober", "November", "Desember" }));
        jPanel1.add(jComboBox1);
        jComboBox1.setBounds(163, 110, 77, 20);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID pakan", "Nama Pakan", "Supplier", "Berat/Kg", "Berat Kemasan/Kg", "Jenis", "Umur Pemberian", "Bentuk"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(10, 194, 862, 156);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("LAPORAN DATA KEBUTUHAN AYAM BROILER");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(220, 30, 430, 50);

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon("E:\\KULIAH\\4 SEMESTER\\PBO\\gambar ayam pbo\\rsz_1rsz_4670c6d49c.png")); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(770, 360, 90, 83);

        jLabel3.setIcon(new javax.swing.ImageIcon("E:\\KULIAH\\4 SEMESTER\\PBO\\gambar ayam pbo\\logo-without-text.png")); // NOI18N
        jPanel1.add(jLabel3);
        jLabel3.setBounds(600, 0, 309, 260);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon("E:\\KULIAH\\4 SEMESTER\\PBO\\gambar ayam pbo\\doc-ayam.jpg")); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(0, 0, 880, 620);

        home.setText("Home");
        home.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        home.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                homeMenuSelected(evt);
            }
        });
        home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeActionPerformed(evt);
            }
        });
        jMenuBar1.add(home);

        dtakaryawan.setText("Data Karyawan");
        dtakaryawan.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        dtakaryawan.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                dtakaryawanMenuSelected(evt);
            }
        });
        dtakaryawan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dtakaryawanActionPerformed(evt);
            }
        });
        jMenuBar1.add(dtakaryawan);

        dtadistribusi.setText("Data Distribusi");
        dtadistribusi.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        dtadistribusi.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                dtadistribusiMenuSelected(evt);
            }
        });
        dtadistribusi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dtadistribusiActionPerformed(evt);
            }
        });
        jMenuBar1.add(dtadistribusi);

        dtakandang.setText("Data Kandang");
        dtakandang.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        dtakandang.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                dtakandangMenuSelected(evt);
            }
        });
        dtakandang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dtakandangActionPerformed(evt);
            }
        });
        jMenuBar1.add(dtakandang);

        dtaayam.setText("Kebutuhan Ayam");
        dtaayam.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        dtaayam.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                dtaayamMenuSelected(evt);
            }
        });
        dtaayam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dtaayamActionPerformed(evt);
            }
        });
        jMenuBar1.add(dtaayam);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void dtaayamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dtaayamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dtaayamActionPerformed

    private void homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeActionPerformed
        // TODO add your handling code here:
        Home as = new Home();
        as.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_homeActionPerformed

    private void dtakaryawanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dtakaryawanActionPerformed
        // TODO add your handling code here:
        Data_karyawan as = new Data_karyawan();
        as.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_dtakaryawanActionPerformed

    private void dtadistribusiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dtadistribusiActionPerformed
        // TODO add your handling code here:
        Data_distributor as = new Data_distributor();
        as.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_dtadistribusiActionPerformed

    private void dtakandangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dtakandangActionPerformed
        // TODO add your handling code here:
        Kandang as = new Kandang();
        as.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_dtakandangActionPerformed

    private void homeMenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_homeMenuSelected
        // TODO add your handling code here:
        Home as = new Home();
        as.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_homeMenuSelected

    private void dtakaryawanMenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_dtakaryawanMenuSelected
        // TODO add your handling code here:
        Data_karyawan as = new Data_karyawan();
        as.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_dtakaryawanMenuSelected

    private void dtadistribusiMenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_dtadistribusiMenuSelected
        // TODO add your handling code here:
        Data_distributor as = new Data_distributor();
        as.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_dtadistribusiMenuSelected

    private void dtakandangMenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_dtakandangMenuSelected
        // TODO add your handling code here:
        Kandang as = new Kandang();
        as.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_dtakandangMenuSelected

    private void dtaayamMenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_dtaayamMenuSelected
        // TODO add your handling code here:
        kebutuhanayam as = new kebutuhanayam();
        as.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_dtaayamMenuSelected

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        FileOutputStream fop = null;
        File file;
        String content = "ini adalah coba coba aja";
        try{
            file = new File("c:/Documents/filebaru.PDF");
            fop = new FileOutputStream(file);
            if(!file.exists()){
               file.createNewFile();
            }
            
            byte[] contentInBytes = content.getBytes();
            
            fop.write(contentInBytes);
            fop.flush();
            fop.close();
            
            System.out.println("selasai");
        }catch(IOException e){
            e.printStackTrace();
        }finally{
            try{
                if(fop != null){
                    fop.close();
                }
            }catch(IOException e){
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(pkebutuhan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pkebutuhan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pkebutuhan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pkebutuhan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pkebutuhan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu dtaayam;
    private javax.swing.JMenu dtadistribusi;
    private javax.swing.JMenu dtakandang;
    private javax.swing.JMenu dtakaryawan;
    private javax.swing.JMenu home;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
