package tp2dpbo;


import java.awt.Image;
import java.io.File;
import java.nio.file.Files;
import java.sql.ResultSet;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Muhammad Rayhan Nur
 */
public class FormDigitalDownload extends javax.swing.JFrame {

    /**
     * Creates new form FormDigitalDownload
     */
      private int isUpdate;
      private int idDD;
      private String judul;
      private String namaKomika;
      private int durasi;
      private String path = null;
      private dbConnection db;
      private JFileChooser fileChooser = new JFileChooser();

      
    public FormDigitalDownload() {
        isUpdate = 0;
        initComponents();
        db = new dbConnection();
        updateCombo();
    }

    public FormDigitalDownload(int id, String judul, String namaKomika, int durasi, String path) {
        isUpdate = 1;
        initComponents();
        
        insertButton.setText("Ubah");
        db = new dbConnection();
        updateCombo();
        
        idDD = id;
        fieldJudul.setText(judul);
        for (int i = 0; i < comboBoxKomika.getItemCount(); i++)
        {
            if (comboBoxKomika.getItemAt(i).toString().equals(namaKomika))
            {
                comboBoxKomika.setSelectedIndex(i);
                break;
            }
        }
        fieldDurasi.setText(Integer.toString(durasi));
        this.path = path;
        
        File sourceFile = new File(path);
        fileChooser.setSelectedFile(sourceFile);
        
        ImageIcon icon = new ImageIcon(path);
        Image img = icon.getImage();
        Image imgScale = img.getScaledInstance(previewLabel.getWidth(), previewLabel.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(imgScale);
        previewLabel.setIcon(scaledIcon);
        previewNameLabel.setText(fileChooser.getSelectedFile().getName());
                
    }
    
    private void updateCombo() {
        try {
            String sql = "SELECT nama_komika FROM komika ORDER BY nama_komika ASC";
            ResultSet res = db.selectQuery(sql);
            while (res.next()){
                comboBoxKomika.addItem(res.getString("nama_komika"));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
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
        formTitle = new javax.swing.JLabel();
        judulLabel = new javax.swing.JLabel();
        komikaLabel = new javax.swing.JLabel();
        durasiLabel = new javax.swing.JLabel();
        coverLabel = new javax.swing.JLabel();
        fieldJudul = new javax.swing.JTextField();
        comboBoxKomika = new javax.swing.JComboBox<>();
        fieldDurasi = new javax.swing.JFormattedTextField();
        menitLabel = new javax.swing.JLabel();
        fileButton = new javax.swing.JButton();
        previewLabel = new javax.swing.JLabel();
        insertButton = new javax.swing.JButton();
        previewNameLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        formTitle.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        formTitle.setText("Data Digital Download");

        judulLabel.setText("Judul");

        komikaLabel.setText("Komika");

        durasiLabel.setText("Durasi");

        coverLabel.setText("Cover");

        fieldJudul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldJudulActionPerformed(evt);
            }
        });

        fieldDurasi.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        menitLabel.setText("Menit");

        fileButton.setText("Pilih File");
        fileButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fileButtonMouseClicked(evt);
            }
        });
        fileButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fileButtonActionPerformed(evt);
            }
        });

        previewLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        insertButton.setText("Tambah");
        insertButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(komikaLabel)
                    .addComponent(judulLabel)
                    .addComponent(durasiLabel)
                    .addComponent(coverLabel))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(previewLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(formTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(fieldDurasi, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(menitLabel))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(fileButton)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(previewNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addComponent(comboBoxKomika, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(fieldJudul, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(90, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(insertButton)
                .addGap(73, 73, 73))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(formTitle)
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(judulLabel)
                    .addComponent(fieldJudul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(komikaLabel)
                    .addComponent(comboBoxKomika, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(durasiLabel)
                    .addComponent(fieldDurasi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(menitLabel))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(coverLabel)
                            .addComponent(fileButton))
                        .addGap(18, 18, 18)
                        .addComponent(previewLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                        .addComponent(insertButton)
                        .addGap(28, 28, 28))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(previewNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void fieldJudulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldJudulActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldJudulActionPerformed

    private void fileButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fileButtonMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_fileButtonMouseClicked

    private void fileButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fileButtonActionPerformed
        // TODO add your handling code here:
        fileChooser.setCurrentDirectory(new File(".")); //sets current directory

        int response = fileChooser.showOpenDialog(null); //select file to open
        //int response = fileChooser.showSaveDialog(null); //select file to save

        if (response == JFileChooser.APPROVE_OPTION) {
            path = "images/cover/"+fileChooser.getSelectedFile().getName();
            ImageIcon icon = new ImageIcon(fileChooser.getSelectedFile().getAbsolutePath());
            Image img = icon.getImage();
            Image imgScale = img.getScaledInstance(previewLabel.getWidth(), previewLabel.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon scaledIcon = new ImageIcon(imgScale);
            previewLabel.setIcon(scaledIcon);
            previewNameLabel.setText(fileChooser.getSelectedFile().getName());
        }

    }//GEN-LAST:event_fileButtonActionPerformed

    private void insertButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertButtonActionPerformed
        // TODO add your handling code here:
        try {
            if (fieldJudul.getText().equals("") || fieldDurasi.getText().equals("") || path == null) {
                JOptionPane.showMessageDialog(null, "Data tidak boleh ada yang kosong!");
            } else {
            // Get Data from Form
                int idKomika = -1;
                namaKomika = comboBoxKomika.getSelectedItem().toString();

                String sql = "SELECT id_komika from komika WHERE nama_komika='"+namaKomika+"'";
                ResultSet res = db.selectQuery(sql);
                while (res.next()){
                                    idKomika = res.getInt("id_komika");
                }
            
                judul = fieldJudul.getText();
                path = path;
                durasi = Integer.parseInt(fieldDurasi.getText());
            
                // Add New Data
                if(isUpdate == 1) {
                    sql = "UPDATE digital_download SET judul='"+judul+"', menit_durasi ="+durasi+", cover='"+path+"', id_komika = "+idKomika+" WHERE id_digital_download =  "+idDD+"";
                } else {
                    sql = "INSERT INTO digital_download (judul, menit_durasi, cover, id_komika) VALUES ('"+judul+"', "+durasi+", '"+path+"', "+idKomika+")";
                }
                db.updateQuery(sql);

                // Copy File to Directory
                String newPath = "images/cover/";
                File directory = new File(newPath);
                if(!directory.exists()) {
                    directory.mkdirs();
                }
            
                File sourceFile = new File(fileChooser.getSelectedFile().getAbsolutePath());
                File destinationFile = new File(newPath+fileChooser.getSelectedFile().getName());
                Files.copy(sourceFile.toPath(), destinationFile.toPath());
            
            
            // Show Information
                if(isUpdate == 1) {
                    System.out.println("Update Success!");
                    JOptionPane.showMessageDialog(null, "Digital Download berhasil diperbarui!");
                    isUpdate = 0;
                } else {
                    System.out.println("Insert Success!");
                    JOptionPane.showMessageDialog(null, "Digital Download berhasil ditambahkan!");
                }
                dispose();
            }
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_insertButtonActionPerformed

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
            java.util.logging.Logger.getLogger(FormDigitalDownload.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormDigitalDownload.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormDigitalDownload.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormDigitalDownload.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormDigitalDownload().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> comboBoxKomika;
    private javax.swing.JLabel coverLabel;
    private javax.swing.JLabel durasiLabel;
    private javax.swing.JFormattedTextField fieldDurasi;
    private javax.swing.JTextField fieldJudul;
    private javax.swing.JButton fileButton;
    private javax.swing.JLabel formTitle;
    private javax.swing.JButton insertButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel judulLabel;
    private javax.swing.JLabel komikaLabel;
    private javax.swing.JLabel menitLabel;
    private javax.swing.JLabel previewLabel;
    private javax.swing.JLabel previewNameLabel;
    // End of variables declaration//GEN-END:variables
}