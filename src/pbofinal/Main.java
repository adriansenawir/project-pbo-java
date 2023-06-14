/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pbofinal;

import java.awt.GridLayout;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import pbofinal.models.Produk;
import pbofinal.controllers.DbController;
//import java.util.ArrayList;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableCellRenderer;
import static pbofinal.controllers.DbController.updateHarga;
import static pbofinal.controllers.DbController.updateJumlah;
import static pbofinal.controllers.DbController.updateNama;


/**
 *
 * @author adria
 */
public class Main extends javax.swing.JFrame {

    public Main() {
        initComponents();
        tableNow();
    }
    
    private void tableNow (){
        DefaultTableModel model = (DefaultTableModel) ID.getModel();
        model.setRowCount(0);
        
        List<Produk> dataList = DbController.getDatabase();

        // Mengisi data hasil query ke dalam model tabel
        for (Produk produk : dataList) {
            Object[] row = {produk.getId(),produk.getNama(), produk.getHarga(), produk.getJumlah()};
            model.addRow(row);
        }
        
        // waktu sekarang
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String tanggal = LocalDateTime.now().format(formatter);
        labelTanggal.setText(("Tanggal : "+tanggal));
        // Mengatur tampilan renderer untuk tabel
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(DefaultTableCellRenderer.CENTER);
        ID.setDefaultRenderer(Object.class, centerRenderer);
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
        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ID = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        labelTanggal = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(202, 205, 203));

        jPanel1.setBackground(new java.awt.Color(202, 205, 203));

        jPanel3.setBackground(new java.awt.Color(202, 205, 203));

        jPanel2.setBackground(new java.awt.Color(16, 90, 134));

        jLabel4.setFont(new java.awt.Font("Georgia", 0, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("SEBERSIH SHOES & CARE");

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pbofinal/Untitled design (15).png"))); // NOI18N

        jLabel7.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 51));
        jLabel7.setText("CATATAN GUDANG");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(52, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(53, 53, 53)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel7))
                .addGap(129, 129, 129))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel6))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        ID.setBackground(new java.awt.Color(132, 167, 161));
        ID.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ID.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Nama Barang", "Harga", "Jumlah"
            }
        ));
        jScrollPane1.setViewportView(ID);
        if (ID.getColumnModel().getColumnCount() > 0) {
            ID.getColumnModel().getColumn(0).setPreferredWidth(5);
            ID.getColumnModel().getColumn(2).setPreferredWidth(5);
            ID.getColumnModel().getColumn(3).setPreferredWidth(5);
        }

        jButton1.setBackground(new java.awt.Color(46, 138, 153));
        jButton1.setFont(new java.awt.Font("Georgia", 1, 17)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 51));
        jButton1.setText("Insert");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jLabel1.setText("Nama Karyawan : ");

        labelTanggal.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        labelTanggal.setText("Tanggal : ");

        jButton2.setBackground(new java.awt.Color(46, 138, 153));
        jButton2.setFont(new java.awt.Font("Georgia", 1, 17)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 51));
        jButton2.setText("Delete");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(46, 138, 153));
        jButton3.setFont(new java.awt.Font("Georgia", 1, 17)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 51));
        jButton3.setText("Edit");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jTextField1.setBackground(new java.awt.Color(132, 167, 161));
        jTextField1.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Georgia", 1, 17)); // NOI18N
        jLabel3.setText("Fitur Aplikasi");

        jButton6.setBackground(new java.awt.Color(0, 0, 0));
        jButton6.setFont(new java.awt.Font("Georgia", 1, 17)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("Keluar");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(labelTanggal, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelTanggal))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(74, 74, 74))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 501, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
        JTextField idCocok = new JTextField();
        JPanel inputId = new JPanel();
        JLabel error = new JLabel();
        inputId.setLayout(new GridLayout(4,2));
        inputId.add(new JLabel("ID:"));
        inputId.add(idCocok);
        inputId.add(error);
        
        JTextField namaField = new JTextField();
        JTextField hargaField = new JTextField();
        JTextField jumlahField = new JTextField();
       

        // Membuat panel untuk menampung JTextField
        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new GridLayout(4, 2)); // Mengatur tata letak menjadi grid dengan 3 baris dan 2 kolom
        inputPanel.add(new JLabel("Nama:"));
        inputPanel.add(namaField);
        inputPanel.add(new JLabel("Harga:"));
        inputPanel.add(hargaField);
        inputPanel.add(new JLabel("Jumlah:"));
        inputPanel.add(jumlahField);
        
         boolean idNotFound = true;

        while (idNotFound) {
            // Menampilkan dialog input dengan panel yang berisi JTextField
            int option = JOptionPane.showConfirmDialog(null, inputId, "Masukkan ID", JOptionPane.OK_CANCEL_OPTION);
            if (option == JOptionPane.OK_OPTION) {
                String inputanId = idCocok.getText();
                int id = Integer.parseInt(inputanId);

                boolean found = false;
                for (int i = 0; i < ID.getRowCount(); i++) {
                    int idTable = (int) ID.getValueAt(i, 0);
                    if (id == idTable) {
                        found = true;
                        break;
                    }
                }

                if (found) {
                    int options = JOptionPane.showConfirmDialog(null, inputPanel, "Data Baru", JOptionPane.OK_CANCEL_OPTION);
                    if (options == JOptionPane.OK_OPTION) {
                        String namaBaru = namaField.getText();
                        int hargaBaru = Integer.parseInt(hargaField.getText());
                        int jumlahBaru = Integer.parseInt(jumlahField.getText());

                        DbController.updateNama(id, namaBaru);
                        DbController.updateHarga(id, hargaBaru);
                        DbController.updateJumlah(id, jumlahBaru);

                        tableNow();
                    }

                    idNotFound = false;
                } else {
                    error.setText("ID tidak ditemukan");
                }
            } else {
                // Jika tombol Cancel ditekan, keluar dari loop
                break;
            }
        }
   
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        // Memunculkan dialog input
        JTextField namaField = new JTextField();
        JTextField hargaField = new JTextField();
        JTextField jumlahField = new JTextField();

        // Membuat panel untuk menampung JTextField
        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new GridLayout(4, 2)); // Mengatur tata letak menjadi grid dengan 3 baris dan 2 kolom
        inputPanel.add(new JLabel("Nama:"));
        inputPanel.add(namaField);
        inputPanel.add(new JLabel("Harga:"));
        inputPanel.add(hargaField);
        inputPanel.add(new JLabel("Jumlah:"));
        inputPanel.add(jumlahField);

        // Menampilkan dialog input dengan panel yang berisi JTextField
        int option = JOptionPane.showConfirmDialog(null, inputPanel, "Masukkan Data", JOptionPane.OK_CANCEL_OPTION);

        if (option == JOptionPane.OK_OPTION) {
            String namaInput = namaField.getText();
            String hargaInputStr = hargaField.getText();
            String jumlahInputStr = jumlahField.getText();

            // Validasi input
            if (!namaInput.isEmpty() && !hargaInputStr.isEmpty() && !jumlahInputStr.isEmpty()) {
                try {
                    int hargaInput = Integer.parseInt(hargaInputStr);
                    int jumlahInput = Integer.parseInt(jumlahInputStr);

                    if (hargaInput > 0 && jumlahInput > 0) {
                        DbController.insertData(namaInput, hargaInput, jumlahInput);

                        // Mengosongkan JTextField setelah data dimasukkan
                        namaField.setText("");
                        hargaField.setText("");
                        jumlahField.setText("");

                        tableNow();
                    } else {
                        JOptionPane.showMessageDialog(null, "Harga dan jumlah harus lebih dari 0", "Input Salah", JOptionPane.ERROR_MESSAGE);
                    }
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Harga dan jumlah harus angka", "Input Salah", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Input tidak boleh kosong", "Input Salah", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        int pilih = JOptionPane.showConfirmDialog(null, "Keluar aplikasi?",
                "Konfirmasi", JOptionPane.OK_CANCEL_OPTION);
        if(pilih == JOptionPane.OK_OPTION){
            System.exit(0);
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        boolean idNotFound = true;

        while (idNotFound) {
            String target = JOptionPane.showInputDialog(null, "Masukkan ID data yang akan dihapus:");

            if (target != null && !target.isEmpty()) {
                try {
                    int targetInt = Integer.parseInt(target);
                    boolean found = false;
                    for (int i = 0; i < ID.getRowCount(); i++) {
                        int idTable = (int) ID.getValueAt(i, 0);
                        if (targetInt == idTable) {
                            found = true;
                            break;
                        }
                    }

                    if (found) {
                        DbController.deleteData(targetInt);
                        tableNow();
                        idNotFound = false;
                    } else {
                        JOptionPane.showMessageDialog(null, "ID tidak ditemukan", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "ID harus berupa angka", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                // Jika tombol Cancel ditekan, keluar dari loop
                break;
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable ID;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel labelTanggal;
    // End of variables declaration//GEN-END:variables
}