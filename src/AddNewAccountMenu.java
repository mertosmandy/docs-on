
import java.awt.HeadlessException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.sql.*;
import java.text.ParseException;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author user
 */
public class AddNewAccountMenu extends javax.swing.JFrame {

    /**
     * Creates new form AddNewAccountMenu
     */
    private Connection con = null;
    private Statement stmt = null;
    private ResultSet rs = null;
    private PreparedStatement pst = null;

    public AddNewAccountMenu() {
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

        clearFieldsButton = new javax.swing.JButton();
        addANewAccountLabel = new javax.swing.JLabel();
        idNumberButton = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        birthDateLabel = new javax.swing.JLabel();
        idNumberText = new javax.swing.JTextField();
        nameText = new javax.swing.JTextField();
        birthDateText = new javax.swing.JTextField();
        surnameLabel = new javax.swing.JLabel();
        expertiseLabel = new javax.swing.JLabel();
        surnameText = new javax.swing.JTextField();
        contactInformationLabel = new javax.swing.JLabel();
        phoneLabel = new javax.swing.JLabel();
        addressLabel = new javax.swing.JLabel();
        emailLabel = new javax.swing.JLabel();
        phoneText = new javax.swing.JTextField();
        emailText = new javax.swing.JTextField();
        expertiseChoice = new java.awt.Choice();
        saveButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        userNameLabel = new javax.swing.JLabel();
        userNameText = new javax.swing.JTextField();
        passwordText = new javax.swing.JTextField();
        passwordLabel = new javax.swing.JLabel();
        accountTypeLabel = new javax.swing.JLabel();
        accountTypeChoice = new java.awt.Choice();
        jScrollPane1 = new javax.swing.JScrollPane();
        addressTextArea = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1000, 620));

        clearFieldsButton.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        clearFieldsButton.setText("Clear");
        clearFieldsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearFieldsButtonActionPerformed(evt);
            }
        });

        addANewAccountLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        addANewAccountLabel.setForeground(new java.awt.Color(0, 102, 204));
        addANewAccountLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/file_icon.png"))); // NOI18N
        addANewAccountLabel.setText("Add a New Account");

        idNumberButton.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        idNumberButton.setText("ID Number*:");

        nameLabel.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        nameLabel.setText("Name*:");

        birthDateLabel.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        birthDateLabel.setText("Birth Date*:");

        birthDateText.setText("(yyyy-MM-dd)");
        birthDateText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                birthDateTextMouseClicked(evt);
            }
        });
        birthDateText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                birthDateTextActionPerformed(evt);
            }
        });

        surnameLabel.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        surnameLabel.setText("Surname*:");

        expertiseLabel.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        expertiseLabel.setText("Expertise*:");

        contactInformationLabel.setFont(new java.awt.Font("Tahoma", 2, 13)); // NOI18N
        contactInformationLabel.setText("Contact Information");

        phoneLabel.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        phoneLabel.setText("Phone:");

        addressLabel.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        addressLabel.setText("Address:");

        emailLabel.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        emailLabel.setText("E-mail:");

        saveButton.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        saveButton.setText("Save");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        cancelButton.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        userNameLabel.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        userNameLabel.setText("User Name*:");

        passwordText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordTextActionPerformed(evt);
            }
        });

        passwordLabel.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        passwordLabel.setText("Password*:");

        accountTypeLabel.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        accountTypeLabel.setText("Account Type*: ");

        addressTextArea.setColumns(20);
        addressTextArea.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        addressTextArea.setRows(5);
        jScrollPane1.setViewportView(addressTextArea);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(44, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addANewAccountLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(40, 40, 40)
                            .addComponent(clearFieldsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(31, 31, 31)
                            .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(userNameLabel)
                                        .addGap(36, 36, 36)
                                        .addComponent(userNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(accountTypeLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(nameText, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(accountTypeChoice, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(birthDateText, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(phoneText, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(79, 79, 79)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(passwordLabel)
                                            .addComponent(expertiseLabel)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(81, 81, 81)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(idNumberButton)
                                            .addComponent(surnameLabel)
                                            .addComponent(emailLabel))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(emailText, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(surnameText, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(idNumberText, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(expertiseChoice, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(passwordText, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addComponent(birthDateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(contactInformationLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(phoneLabel)
                                    .addComponent(addressLabel))
                                .addGap(57, 57, 57)
                                .addComponent(jScrollPane1)))))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(addANewAccountLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(userNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwordLabel)
                    .addComponent(passwordText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(expertiseLabel)
                            .addComponent(expertiseChoice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(surnameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(surnameLabel)))
                    .addComponent(accountTypeLabel)
                    .addComponent(accountTypeChoice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(birthDateLabel)
                    .addComponent(birthDateText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idNumberButton)
                    .addComponent(idNumberText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addComponent(contactInformationLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(phoneLabel)
                    .addComponent(phoneText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emailLabel)
                    .addComponent(emailText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addressLabel)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clearFieldsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(51, Short.MAX_VALUE))
        );

        expertiseChoice.add("Cardiologist");
        expertiseChoice.add("Dentist");
        expertiseChoice.add("Internist");
        expertiseChoice.add("Pediatrist");
        expertiseChoice.add("Primary care physician");
        expertiseChoice.add("Psychiatrist");
        expertiseChoice.add("Radiologist");
        expertiseChoice.add("Urologist");
        accountTypeChoice.add("Head Doctor");
        accountTypeChoice.add("Doctor");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void clearFieldsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearFieldsButtonActionPerformed
        idNumberText.setText("");
        nameText.setText("");
        surnameText.setText("");
        birthDateText.setText("(yyyy-MM-dd)");
        userNameText.setText("");
        passwordText.setText("");
        emailText.setText("");
        addressTextArea.setText("");
        phoneText.setText("");

    }//GEN-LAST:event_clearFieldsButtonActionPerformed

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        if (userNameText.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Please enter user name. You cannot save without compulsory areas(*).", "Error", JOptionPane.ERROR_MESSAGE);
        } else if (passwordText.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Please enter password. You cannot save without compulsory areas(*).", "Error", JOptionPane.ERROR_MESSAGE);
        } else if (nameText.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Please enter a name. You cannot save without compulsory areas(*).", "Error", JOptionPane.ERROR_MESSAGE);
        } else if (surnameText.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Please enter a surname. You cannot save without compulsory areas(*).", "Error", JOptionPane.ERROR_MESSAGE);
        } else if (idNumberText.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Please enter ID number. You cannot save without compulsory areas(*).", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            try {
                int id = Integer.parseInt(idNumberText.getText());
                String name = nameText.getText();
                String surname = surnameText.getText();
                DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
                java.util.Date birthDate = format.parse(birthDateText.getText());
                java.sql.Date sqlDate = new java.sql.Date(birthDate.getTime());
                String username = userNameText.getText();
                String password = passwordText.getText();
                String email = emailText.getText();
                String address = addressTextArea.getText();
                String phone = phoneText.getText();
                String expertise = expertiseChoice.getSelectedItem();
                String accountType = accountTypeChoice.getSelectedItem();

                con = DatabaseConnection.ConnectDB();

                String sql = "INSERT INTO Doctors (UserName,UserPassword,UserType,Name,Surname,ID,BirthDate,Address,PhoneNumber,Expertise,Email) VALUES(?,?,?,?,?,?,?,?,?,?,?)";

                pst = con.prepareStatement(sql);

                pst.setString(1, username);
                pst.setString(2, password);
                pst.setString(3, accountType);
                pst.setString(4, name);
                pst.setString(5, surname);
                pst.setInt(6, id);

                pst.setDate(7, sqlDate);
                pst.setString(8, address);
                pst.setString(9, phone);
                pst.setString(10, expertise);
                pst.setString(11, email);

                pst.executeUpdate();
                con.close();
                JOptionPane.showMessageDialog(this, "Saved it successfully", "Record", JOptionPane.INFORMATION_MESSAGE);

            } catch (NumberFormatException | ParseException | SQLException | HeadlessException e) {
                System.err.println(e.getClass().getName() + ": " + e.getMessage());
            }
        }
    }//GEN-LAST:event_saveButtonActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        DoctorMainMenu frm = new DoctorMainMenu();
        frm.setVisible(true);
        frm.setLocation(getLocation());
        frm.setSize(getSize());
        frm.setExtendedState(getExtendedState());
        this.hide();
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void birthDateTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_birthDateTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_birthDateTextActionPerformed

    private void passwordTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordTextActionPerformed

    private void birthDateTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_birthDateTextMouseClicked
        birthDateText.setText("");
    }//GEN-LAST:event_birthDateTextMouseClicked

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
            java.util.logging.Logger.getLogger(AddNewAccountMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddNewAccountMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddNewAccountMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddNewAccountMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        new AddNewAccountMenu().setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Choice accountTypeChoice;
    private javax.swing.JLabel accountTypeLabel;
    private javax.swing.JLabel addANewAccountLabel;
    private javax.swing.JLabel addressLabel;
    private javax.swing.JTextArea addressTextArea;
    private javax.swing.JLabel birthDateLabel;
    private javax.swing.JTextField birthDateText;
    private javax.swing.JButton cancelButton;
    private javax.swing.JButton clearFieldsButton;
    private javax.swing.JLabel contactInformationLabel;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JTextField emailText;
    private java.awt.Choice expertiseChoice;
    private javax.swing.JLabel expertiseLabel;
    private javax.swing.JLabel idNumberButton;
    private javax.swing.JTextField idNumberText;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JTextField nameText;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JTextField passwordText;
    private javax.swing.JLabel phoneLabel;
    private javax.swing.JTextField phoneText;
    private javax.swing.JButton saveButton;
    private javax.swing.JLabel surnameLabel;
    private javax.swing.JTextField surnameText;
    private javax.swing.JLabel userNameLabel;
    private javax.swing.JTextField userNameText;
    // End of variables declaration//GEN-END:variables
}
