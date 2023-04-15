package tp2dpbo;


import java.awt.Image;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.nio.file.Files;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Muhammad Rayhan Nur
 */
public class FormKomika extends javax.swing.JFrame {

    /**
     * Creates new form FormKomika
     */
     
    private String path = null;
    private JFileChooser fileChooser = new JFileChooser();
    private dbConnection db;
    private int idKomika; 
    int isUpdate;
    
    public FormKomika() {
        initComponents();
        db = new dbConnection();
        insertButton.setText("Tambah");
    }
    
    public FormKomika(int id, String nama, String pathFoto) {
        initComponents();
        db = new dbConnection();
        
        isUpdate = 1;
        insertButton.setText("Ubah");
        idKomika = id;
        fieldNamaKomika.setText(nama);
        path = pathFoto;
        
        File sourceFile = new File(pathFoto);
        fileChooser.setSelectedFile(sourceFile);
        
        ImageIcon icon = new ImageIcon(pathFoto);
        Image img = icon.getImage();
        Image imgScale = img.getScaledInstance(previewLabel.getWidth(), previewLabel.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(imgScale);
        previewLabel.setIcon(scaledIcon);
        previewNameLabel.setText(fileChooser.getSelectedFile().getName());
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
        fieldNamaKomika = new javax.swing.JTextField();
        labelNama = new javax.swing.JLabel();
        insertButton = new javax.swing.JButton();
        fotoLabel = new javax.swing.JLabel();
        fileButton = new javax.swing.JButton();
        previewLabel = new javax.swing.JLabel();
        previewNameLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        formTitle.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        formTitle.setText("Data Komika");

        fieldNamaKomika.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldNamaKomikaActionPerformed(evt);
            }
        });

        labelNama.setText("Nama");

        insertButton.setText("Tambah");
        insertButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                insertButtonMouseClicked(evt);
            }
        });
        insertButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertButtonActionPerformed(evt);
            }
        });

        fotoLabel.setText("Foto Komika");

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(previewLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelNama)
                            .addComponent(fotoLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(fieldNamaKomika, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(insertButton))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(fileButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(previewNameLabel)))
                        .addContainerGap(57, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(formTitle)
                .addGap(159, 159, 159))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(formTitle)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fieldNamaKomika, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelNama))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fileButton)
                    .addComponent(fotoLabel)
                    .addComponent(previewNameLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(previewLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(insertButton)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void fieldNamaKomikaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldNamaKomikaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldNamaKomikaActionPerformed

    private void insertButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertButtonActionPerformed
        // TODO add your handling code here:
        
         try {
            if (fieldNamaKomika.getText().equals("") || path == null) {
                JOptionPane.showMessageDialog(null, "Data tidak boleh ada yang kosong!");
            } else {
            // Get Data from Form
                String namaKomika = fieldNamaKomika.getText();
                String pathFoto = path;
            
            // Add New Data
            String sql;
                if(isUpdate == 1) {
                    sql = "UPDATE komika SET  nama_komika= '"+namaKomika+"', foto_komika='"+pathFoto+"' WHERE id_komika = "+idKomika+"";
                } else {
                    sql = "INSERT INTO komika (nama_komika, foto_komika) VALUES ('"+namaKomika+"', '"+pathFoto+"')";
                }
                db.updateQuery(sql);

            // Copy File to Directory
                String newPath = "images/komika/";
                File directory = new File(newPath);
                if(!directory.exists()) {
                    directory.mkdirs();
                }
            
                File sourceFile = new File(fileChooser.getSelectedFile().getAbsolutePath());
                File destinationFile = new File(newPath+fileChooser.getSelectedFile().getName());
                Files.copy(sourceFile.toPath(), destinationFile.toPath());
            
            
            // Show Information
                System.out.println("Insert Success!");
                if(isUpdate ==1) {
                    JOptionPane.showMessageDialog(null, "Data Komika berhasil diubah!");
                    isUpdate = 0;
                } else {
                    JOptionPane.showMessageDialog(null, "Komika baru berhasil ditambahkan!");
                }
                dispose();
            }
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_insertButtonActionPerformed

    private void fileButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fileButtonActionPerformed
        // TODO add your handling code here		
        fileChooser.setCurrentDirectory(new File(".")); //sets current directory
			
        int response = fileChooser.showOpenDialog(null); //select file to open
			//int response = fileChooser.showSaveDialog(null); //select file to save
			
        if (response == JFileChooser.APPROVE_OPTION) {
             path = "images/komika/"+fileChooser.getSelectedFile().getName();
             ImageIcon icon = new ImageIcon(fileChooser.getSelectedFile().getAbsolutePath());
             Image img = icon.getImage();
             Image imgScale = img.getScaledInstance(previewLabel.getWidth(), previewLabel.getHeight(), Image.SCALE_SMOOTH);
             ImageIcon scaledIcon = new ImageIcon(imgScale);
             previewLabel.setIcon(scaledIcon);
             previewNameLabel.setText(fileChooser.getSelectedFile().getName());
        }
        
        
    }//GEN-LAST:event_fileButtonActionPerformed

    private void fileButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fileButtonMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_fileButtonMouseClicked

    private void insertButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_insertButtonMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_insertButtonMouseClicked

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
            java.util.logging.Logger.getLogger(FormKomika.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormKomika.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormKomika.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormKomika.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormKomika().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField fieldNamaKomika;
    private javax.swing.JButton fileButton;
    private javax.swing.JLabel formTitle;
    private javax.swing.JLabel fotoLabel;
    private javax.swing.JButton insertButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelNama;
    private javax.swing.JLabel previewLabel;
    private javax.swing.JLabel previewNameLabel;
    // End of variables declaration//GEN-END:variables
}
