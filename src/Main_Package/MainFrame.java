/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Main_Package;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author HP
 */
public class MainFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
        initComponents();
    }
    
    private File selectedPhotoFile;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        formHeading = new javax.swing.JLabel();
        firstName = new javax.swing.JLabel();
        lastName = new javax.swing.JLabel();
        age = new javax.swing.JLabel();
        phoneNumber = new javax.swing.JLabel();
        email = new javax.swing.JLabel();
        photo = new javax.swing.JLabel();
        jTextFirstName = new javax.swing.JTextField();
        jTextLastName = new javax.swing.JTextField();
        jTextAge = new javax.swing.JTextField();
        jTextPhoneNumber = new javax.swing.JTextField();
        jTextEmail = new javax.swing.JTextField();
        jButtonPhoto = new javax.swing.JButton();
        jButtonSubmit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 153, 255));
        setMinimumSize(new java.awt.Dimension(400, 400));
        setPreferredSize(new java.awt.Dimension(400, 400));

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(400, 400));
        jPanel1.setPreferredSize(new java.awt.Dimension(400, 400));

        formHeading.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        formHeading.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        formHeading.setText("USER DETAILS");

        firstName.setText("First Name");

        lastName.setText("Last Name");

        age.setText("Age");

        phoneNumber.setText("Phone Number");

        email.setText("Email");

        photo.setText("Choose Photo");

        jButtonPhoto.setText("Upload");
        jButtonPhoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPhotoActionPerformed(evt);
            }
        });

        jButtonSubmit.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButtonSubmit.setText("Submit");
        jButtonSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSubmitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(firstName, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(phoneNumber, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE)
                    .addComponent(photo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(email, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(age, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lastName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextFirstName, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
                    .addComponent(jTextLastName)
                    .addComponent(jTextAge)
                    .addComponent(jTextPhoneNumber)
                    .addComponent(jTextEmail)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jButtonPhoto)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(formHeading, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addComponent(jButtonSubmit)))
                .addContainerGap(310, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(formHeading, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstName)
                    .addComponent(jTextFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lastName)
                    .addComponent(jTextLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(age)
                    .addComponent(jTextAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(phoneNumber)
                    .addComponent(jTextPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(email)
                    .addComponent(jTextEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(photo)
                    .addComponent(jButtonPhoto))
                .addGap(27, 27, 27)
                .addComponent(jButtonSubmit)
                .addContainerGap(125, Short.MAX_VALUE))
        );

        firstName.getAccessibleContext().setAccessibleName("Name");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 578, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void jButtonSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSubmitActionPerformed
        // TODO add your handling code here:
         if (validateInputs()) {
            // Validation successful, show pop-up with entered details including the photo

            String message = "First Name: " + jTextFirstName.getText() + "\n"
                    + "Last Name: " + jTextLastName.getText() + "\n"
                    + "Age: " + jTextAge.getText() + "\n"
                    + "Phone Number: " + jTextPhoneNumber.getText() + "\n"
                    + "Email: " + jTextEmail.getText();

            if (selectedPhotoFile != null) {
                // Resize the photo to fit within the default dialog size
                ImageIcon photoIcon = createResizedImageIcon(selectedPhotoFile, 100, 100);
                JOptionPane.showMessageDialog(this, message, "Details Entered", JOptionPane.INFORMATION_MESSAGE, photoIcon);
            } else {
                // No photo selected
                JOptionPane.showMessageDialog(this, message, "Details Entered", JOptionPane.INFORMATION_MESSAGE);
            }
        } else {
            // Validation failed, show an error message
            JOptionPane.showMessageDialog(this, "Invalid input. Please check and try again.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButtonSubmitActionPerformed

    private void jButtonPhotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPhotoActionPerformed
        // TODO add your handling code here:
        JFileChooser fileChooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Image Files", "jpg", "png", "jpeg", "gif");
        fileChooser.setFileFilter(filter);

        int result = fileChooser.showOpenDialog(this);

        if (result == JFileChooser.APPROVE_OPTION) {
            selectedPhotoFile = fileChooser.getSelectedFile();
            JOptionPane.showMessageDialog(this, "Photo selected successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
        }

    }//GEN-LAST:event_jButtonPhotoActionPerformed

    private ImageIcon createResizedImageIcon(File file, int maxWidth, int maxHeight) {
        try {
            BufferedImage originalImage = ImageIO.read(file);

            // Calculate the new dimensions while maintaining the aspect ratio
            int originalWidth = originalImage.getWidth();
            int originalHeight = originalImage.getHeight();

            int newWidth = Math.min(originalWidth, maxWidth);
            int newHeight = (int) Math.round((double) originalHeight / originalWidth * newWidth);

            // Resize the image
            BufferedImage resizedImage = new BufferedImage(newWidth, newHeight, BufferedImage.TYPE_INT_ARGB);
            java.awt.Image scaledImage = originalImage.getScaledInstance(newWidth, newHeight, java.awt.Image.SCALE_SMOOTH);

            // Draw the resized image onto the new BufferedImage
            resizedImage.getGraphics().drawImage(scaledImage, 0, 0, null);

            return new ImageIcon(resizedImage);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
    
    private boolean validateInputs() {
    // Validation for First Name
    if (jTextFirstName.getText().isEmpty()) {
        JOptionPane.showMessageDialog(this, "Please enter the First Name.", "Error", JOptionPane.ERROR_MESSAGE);
        return false;
    }

    // Validation for Last Name
    if (jTextLastName.getText().isEmpty()) {
        JOptionPane.showMessageDialog(this, "Please enter the Last Name.", "Error", JOptionPane.ERROR_MESSAGE);
        return false;
    }

    // Validation for Age (should be an integer value)
    try {
        int age = Integer.parseInt(jTextAge.getText());
        if (age < 0 || jTextAge.getText().length()>2) {
            throw new NumberFormatException();
        }
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Please enter a valid integer for Age.", "Error", JOptionPane.ERROR_MESSAGE);
        return false;
    }

    // Validation for Phone Number (should be a 10-digit number)
    String phoneNumber = jTextPhoneNumber.getText().trim();
    if (!phoneNumber.matches("\\d{10}")) {
        JOptionPane.showMessageDialog(this, "Please enter a valid 10-digit Phone Number.", "Error", JOptionPane.ERROR_MESSAGE);
        return false;
    }

    // Validation for Email (basic email format check)
    String email = jTextEmail.getText().trim();
    if (!email.matches("[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}")) {
        JOptionPane.showMessageDialog(this, "Please enter a valid Email address.", "Error", JOptionPane.ERROR_MESSAGE);
        return false;
    }

    return true;
}
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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel age;
    private javax.swing.JLabel email;
    private javax.swing.JLabel firstName;
    private javax.swing.JLabel formHeading;
    private javax.swing.JButton jButtonPhoto;
    private javax.swing.JButton jButtonSubmit;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextAge;
    private javax.swing.JTextField jTextEmail;
    private javax.swing.JTextField jTextFirstName;
    private javax.swing.JTextField jTextLastName;
    private javax.swing.JTextField jTextPhoneNumber;
    private javax.swing.JLabel lastName;
    private javax.swing.JLabel phoneNumber;
    private javax.swing.JLabel photo;
    // End of variables declaration//GEN-END:variables
}
