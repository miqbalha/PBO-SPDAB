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
public class pkaryawan extends javax.swing.JFrame {

    /**
     * Creates new form pkaryawan
     */
    public pkaryawan() {
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
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        home = new javax.swing.JMenu();
        dtakaryawan = new javax.swing.JMenu();
        dtadistributor = new javax.swing.JMenu();
        dtakandang = new javax.swing.JMenu();
        dtakebayam = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setPreferredSize(new java.awt.Dimension(882, 600));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("PERIODE");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(70, 170, 73, 21);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bulan", "Januari", "Februari", "Maret", "April", "Mei", "Juni", "Juli", "Agustus", "September", "Oktober", "November", "Desember" }));
        jPanel1.add(jComboBox1);
        jComboBox1.setBounds(160, 170, 77, 20);

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("LAPORAN DATA KARYAWAN");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(300, 90, 309, 29);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID karayawan", "Nama", "Nik", "Tempat lahir", "Jenis Kelamin", "Agama", "Pendidikan", "ID kandang", "Jabatan", "Tanggal Masuk", "Status Kerja"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(0, 220, 900, 206);

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon("E:\\KULIAH\\4 SEMESTER\\PBO\\gambar ayam pbo\\rsz_1rsz_4670c6d49c.png")); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(780, 450, 90, 80);

        jLabel4.setIcon(new javax.swing.ImageIcon("E:\\KULIAH\\4 SEMESTER\\PBO\\gambar ayam pbo\\logo-without-text.png")); // NOI18N
        jPanel1.add(jLabel4);
        jLabel4.setBounds(590, 10, 309, 270);

        jLabel3.setIcon(new javax.swing.ImageIcon("E:\\KULIAH\\4 SEMESTER\\PBO\\gambar ayam pbo\\doc-ayam.jpg")); // NOI18N
        jPanel1.add(jLabel3);
        jLabel3.setBounds(0, 0, 900, 630);

        jMenuBar1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

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

        dtadistributor.setText("Data Distributor");
        dtadistributor.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        dtadistributor.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                dtadistributorMenuSelected(evt);
            }
        });
        dtadistributor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dtadistributorActionPerformed(evt);
            }
        });
        jMenuBar1.add(dtadistributor);

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

        dtakebayam.setText("Kebutuhan Ayam");
        dtakebayam.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        dtakebayam.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                dtakebayamMenuSelected(evt);
            }
        });
        dtakebayam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dtakebayamActionPerformed(evt);
            }
        });
        jMenuBar1.add(dtakebayam);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 902, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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

    private void dtadistributorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dtadistributorActionPerformed
        // TODO add your handling code here:
        Data_distributor as = new Data_distributor();
        as.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_dtadistributorActionPerformed

    private void dtakandangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dtakandangActionPerformed
        // TODO add your handling code here:
        Kandang as = new Kandang();
        as.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_dtakandangActionPerformed

    private void dtakebayamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dtakebayamActionPerformed
        // TODO add your handling code here:
        kebutuhanayam as = new kebutuhanayam();
        as.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_dtakebayamActionPerformed

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

    private void dtadistributorMenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_dtadistributorMenuSelected
        // TODO add your handling code here:
        Data_distributor as = new Data_distributor();
        as.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_dtadistributorMenuSelected

    private void dtakandangMenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_dtakandangMenuSelected
        // TODO add your handling code here:
        Kandang as = new Kandang();
        as.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_dtakandangMenuSelected

    private void dtakebayamMenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_dtakebayamMenuSelected
        // TODO add your handling code here:
        kebutuhanayam as = new kebutuhanayam();
        as.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_dtakebayamMenuSelected

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        FileOutputStream fop = null;
        File file;
        String content = "ini adalah coba coba aja";
        try{
            file = new File("c://filebaru.PDF");
            fop = new FileOutputStream(file);
            if(!file.exists()){
               file.createNewFile();
            }
            
            byte[] contentInBytes = content.getBytes();
            
            fop.write(contentInBytes);
            fop.flush();
            fop.close();
            
            System.out.println("selasai");
        }catch(Exception e){
            //e.printStackTrace();
            System.out.println("error");
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
            java.util.logging.Logger.getLogger(pkaryawan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pkaryawan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pkaryawan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pkaryawan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pkaryawan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu dtadistributor;
    private javax.swing.JMenu dtakandang;
    private javax.swing.JMenu dtakaryawan;
    private javax.swing.JMenu dtakebayam;
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
