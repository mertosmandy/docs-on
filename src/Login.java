
import java.awt.*;
import java.awt.event.KeyEvent;
import java.sql.*;
import javax.swing.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author mert.donmezyurek-ug
 */
public class Login extends javax.swing.JFrame {

    Connection con = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    static Doctor currentUser = new Doctor();

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();//put all the components in the frame
        setLocationRelativeTo(null);//Creates a new window according to default size and location
        getContentPane().setBackground(Color.WHITE);//setting background color of pane to white

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtUserName = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        btnOK = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        sQLOptionButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setForeground(java.awt.Color.white);
        setPreferredSize(new java.awt.Dimension(1000, 620));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Logo_small.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel2.setText("User Name");

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel3.setText("Password");

        txtUserName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtUserNameMouseClicked(evt);
            }
        });
        txtUserName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserNameActionPerformed(evt);
            }
        });

        txtPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPasswordKeyPressed(evt);
            }
        });

        btnOK.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        btnOK.setText("OK");
        btnOK.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnOK.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnOKMouseClicked(evt);
            }
        });
        btnOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOKActionPerformed(evt);
            }
        });

        btnCancel.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        btnCancel.setText("Cancel");
        btnCancel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        sQLOptionButton.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        sQLOptionButton.setText("SQL Option");
        sQLOptionButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sQLOptionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sQLOptionButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(325, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(40, 40, 40)
                            .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btnOK, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(20, 20, 20)
                            .addComponent(sQLOptionButton, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(20, 20, 20)
                            .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(40, 40, 40)
                            .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(308, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnOK, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sQLOptionButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(97, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtUserNameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtUserNameMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserNameMouseClicked

    private void txtUserNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserNameActionPerformed

    private void txtPasswordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPasswordKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) { //if user presses 'enter' key from the keyboard, the method below runs
            con = DatabaseConnection.ConnectDB(); //connect to database

            //MySql code to call doctors table 
            String sql = "select * from Doctors where UserName= '" + txtUserName.getText() + "' and UserPassword ='" + txtPassword.getText() + "'";
            try {
                pst = con.prepareStatement(sql);  //converts String to mySql
                rs = pst.executeQuery();  //runs the mysql
                if (rs.next()) {  //if mysql has a result, if method will work
                    setCurrentUser(rs); // Stores current user's data
                    DoctorMainMenu frm = new DoctorMainMenu();
                    frm.setVisible(true); //making the create new account button visible
                    frm.setLocation(getLocation());//Gets the location of the current window and then sets it to the next opening window
                    frm.setSize(getSize());//Gets the size of the current window and then sets it to the next opening window
                    frm.setExtendedState(getExtendedState());//Controls whether it is full screen or not and then according to that opens the next window in full screen or not
                    this.hide();//Hides the current window while screening the next window
                    con.close();// Close the connection not to make busy the server
                } else {
                    JOptionPane.showMessageDialog(null, "Login Failed..Try again !", "Access denied", JOptionPane.ERROR_MESSAGE);
                    txtUserName.setText("");//sets username to its default value
                    txtPassword.setText("");//sets password to its default value
                    txtUserName.requestDefaultFocus();//enables the text indicator"I"
                }
            } catch (SQLException | HeadlessException e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }//GEN-LAST:event_txtPasswordKeyPressed

    private void btnOKMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnOKMouseClicked
        if (txtUserName.getText().equals("")) {  //if user enters nothing to username text, gives an error
            JOptionPane.showMessageDialog(this, "Please enter user name", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        String Password = String.valueOf(txtPassword.getPassword());
        if (Password.equals("")) {  //if user enters nothing to password text, gives an error
            JOptionPane.showMessageDialog(this, "Please enter password", "Error", JOptionPane.ERROR_MESSAGE);
            return;

        }
        con = DatabaseConnection.ConnectDB(); //connect to database
        String sql = "select * from Doctors where UserName= '" + txtUserName.getText() + "' and UserPassword ='" + txtPassword.getText() + "'"; //mysql code to get the data from database
        try {
            pst = con.prepareStatement(sql);//converts String to mysql
            rs = pst.executeQuery();//runs the mysql
            if (rs.next()) {//if mysql has a result, if method will work

                setCurrentUser(rs);
                DoctorMainMenu frm = new DoctorMainMenu();
                frm.setVisible(true);//making the create new account button visible
                frm.setLocation(getLocation());//Gets the location of the current window and then sets it to the next opening window
                frm.setSize(getSize());//Gets the size of the current window and then sets it to the next opening window
                frm.setExtendedState(getExtendedState());//Controls whether it is full screen or not and then according to that opens the next window in full screen or not
                this.hide();//Hides the current window while screening the next window
                con.close();// Close the connection not to make busy the server
            } else {
                JOptionPane.showMessageDialog(null, "Login Failed..Try again !", "Access denied", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException | HeadlessException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_btnOKMouseClicked

    private void btnOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOKActionPerformed

    }//GEN-LAST:event_btnOKActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        System.exit(0); //if cancel is clicked, exit the window
    }//GEN-LAST:event_btnCancelActionPerformed

    private void sQLOptionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sQLOptionButtonActionPerformed
        SQLSelection frm = new SQLSelection();
        frm.setVisible(true);
        frm.setLocationRelativeTo(getContentPane());
    }//GEN-LAST:event_sQLOptionButtonActionPerformed

    private void setCurrentUser(ResultSet rs) throws SQLException {
        currentUser.setID(rs.getInt("ID"));
        currentUser.setName(rs.getString("Name"));
        currentUser.setSurname(rs.getString("Surname"));
        currentUser.setExpertise(rs.getString("UserType"));
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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        (new Login()).setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnOK;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton sQLOptionButton;
    public javax.swing.JPasswordField txtPassword;
    public javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables
}