/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package tp2dpbo;

import java.awt.Image;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author ILHAM
 */
public class CardDD extends javax.swing.JPanel {

    /**
     * Creates new form CardDD
     */
        private dbConnection db;
        private int idDD;
        private String judul;
        private String namaKomika;
        private int durasi;
        private String path = null;
    
    public CardDD(int id, String judul, String komika, int durasi, String path) {
            initComponents();
            db = new dbConnection();
            idDD = id;
            this.judul = judul;
            namaKomika = komika;
            this.durasi = durasi;
            this.path = path;
            
            judulLabel.setText(judul);
            komikaLabel.setText(komika);
            durasiLabel.setText(Integer.toString(durasi) + " menit");
            
            ImageIcon icon = new ImageIcon(path);
            Image img = icon.getImage();
            Image imgScale = img.getScaledInstance(120, 160, Image.SCALE_SMOOTH);
            ImageIcon scaledIcon = new ImageIcon(imgScale);
            coverLabel.setIcon(scaledIcon);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        judulLabel = new javax.swing.JLabel();
        komikaLabel = new javax.swing.JLabel();
        editButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        durasiLabel = new javax.swing.JLabel();
        coverLabel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        setMaximumSize(new java.awt.Dimension(300, 400));

        judulLabel.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        judulLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        judulLabel.setText("JUDUL");

        komikaLabel.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        komikaLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        komikaLabel.setText("Komika");

        editButton.setBackground(new java.awt.Color(255, 255, 102));
        editButton.setText("Edit");
        editButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editButtonActionPerformed(evt);
            }
        });

        deleteButton.setBackground(new java.awt.Color(255, 51, 51));
        deleteButton.setForeground(new java.awt.Color(255, 255, 255));
        deleteButton.setText("Delete");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        durasiLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        durasiLabel.setText("Durasi");

        coverLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        coverLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        coverLabel.setMaximumSize(new java.awt.Dimension(120, 160));
        coverLabel.setMinimumSize(new java.awt.Dimension(120, 160));
        coverLabel.setPreferredSize(new java.awt.Dimension(120, 160));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(editButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addComponent(deleteButton)
                .addGap(30, 30, 30))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(judulLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(komikaLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(durasiLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(coverLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(coverLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(judulLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(komikaLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(durasiLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editButton)
                    .addComponent(deleteButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        // TODO add your handling code here:
        // TODO add your handling code here:
        int opsi = JOptionPane.showConfirmDialog(null, "Apakah Anda yakin ingin menghapus data?", "Konfirmasi Hapus",
			JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if  (opsi == JOptionPane.YES_OPTION) {
            String sql = "DELETE FROM digital_download WHERE id_digital_download="+idDD+"";
            db.updateQuery(sql);
            
            // Show Information
            System.out.println("Delete Success!");
            JOptionPane.showMessageDialog(null, "Data Digital Download berhasil dihapus!");
            Homepage parent = (Homepage) this.getTopLevelAncestor();
            parent.setPanelDD();
        }
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void editButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButtonActionPerformed
        // TODO add your handling code here:
        FormDigitalDownload form = new FormDigitalDownload(this.idDD, this.judul, this.namaKomika, this.durasi, this.path);
        form.setVisible(true);
        
        Homepage parent = (Homepage) this.getTopLevelAncestor();
        form.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosed(WindowEvent e) {
                 if (parent != null) parent.setPanelDD();
             }
         });
    }//GEN-LAST:event_editButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel coverLabel;
    private javax.swing.JButton deleteButton;
    private javax.swing.JLabel durasiLabel;
    private javax.swing.JButton editButton;
    private javax.swing.JLabel judulLabel;
    private javax.swing.JLabel komikaLabel;
    // End of variables declaration//GEN-END:variables
}