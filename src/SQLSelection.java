
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Mert Osman
 */
public class SQLSelection extends javax.swing.JFrame {

    /**
     * Creates new form SQLSelection
     */
    public SQLSelection() {
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

        mainTab = new javax.swing.JTabbedPane();
        mySQLPanel = new javax.swing.JPanel();
        serverText = new javax.swing.JTextField();
        mySQLServerLabel = new javax.swing.JLabel();
        mySQLUserNameLabel = new javax.swing.JLabel();
        mySQLUserNameText = new javax.swing.JTextField();
        mySQLPasswordLabel = new javax.swing.JLabel();
        mySQLPasswordText = new javax.swing.JTextField();
        setButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        pathText = new javax.swing.JTextField();
        attachButton = new javax.swing.JButton();
        setSQLiteButton = new javax.swing.JButton();
        cancelSQLiteButton = new javax.swing.JButton();
        sQLServerLabel = new javax.swing.JLabel();

        setType(java.awt.Window.Type.UTILITY);

        mainTab.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);

        serverText.setFont(new java.awt.Font("Century Gothic", 2, 18)); // NOI18N
        serverText.setText("Server");
        serverText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                serverTextActionPerformed(evt);
            }
        });

        mySQLServerLabel.setFont(new java.awt.Font("Century Gothic", 0, 30)); // NOI18N
        mySQLServerLabel.setText("MySQL Server");

        mySQLUserNameLabel.setFont(new java.awt.Font("Century Gothic", 0, 30)); // NOI18N
        mySQLUserNameLabel.setText("MySQL UserName");
        mySQLUserNameLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        mySQLUserNameText.setFont(new java.awt.Font("Century Gothic", 2, 18)); // NOI18N
        mySQLUserNameText.setText("Username");
        mySQLUserNameText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mySQLUserNameTextActionPerformed(evt);
            }
        });

        mySQLPasswordLabel.setFont(new java.awt.Font("Century Gothic", 0, 30)); // NOI18N
        mySQLPasswordLabel.setText("MySQL Password");
        mySQLPasswordLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        mySQLPasswordText.setFont(new java.awt.Font("Century Gothic", 2, 18)); // NOI18N
        mySQLPasswordText.setText("Password");
        mySQLPasswordText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mySQLPasswordTextActionPerformed(evt);
            }
        });

        setButton.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        setButton.setText("Set");
        setButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setButtonActionPerformed(evt);
            }
        });

        cancelButton.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout mySQLPanelLayout = new javax.swing.GroupLayout(mySQLPanel);
        mySQLPanel.setLayout(mySQLPanelLayout);
        mySQLPanelLayout.setHorizontalGroup(
            mySQLPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mySQLPanelLayout.createSequentialGroup()
                .addContainerGap(94, Short.MAX_VALUE)
                .addGroup(mySQLPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(mySQLPanelLayout.createSequentialGroup()
                        .addComponent(setButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(mySQLUserNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(serverText)
                    .addComponent(mySQLServerLabel)
                    .addComponent(mySQLUserNameText)
                    .addComponent(mySQLPasswordText)
                    .addComponent(mySQLPasswordLabel))
                .addContainerGap(94, Short.MAX_VALUE))
        );
        mySQLPanelLayout.setVerticalGroup(
            mySQLPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mySQLPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(mySQLServerLabel)
                .addGap(30, 30, 30)
                .addComponent(serverText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(mySQLUserNameLabel)
                .addGap(30, 30, 30)
                .addComponent(mySQLUserNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(mySQLPasswordLabel)
                .addGap(30, 30, 30)
                .addComponent(mySQLPasswordText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(mySQLPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(setButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        mainTab.addTab("MySQL", mySQLPanel);

        pathText.setText("File path to be shown...");

        attachButton.setText("Attach");
        attachButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                attachButtonActionPerformed(evt);
            }
        });

        setSQLiteButton.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        setSQLiteButton.setText("Set");
        setSQLiteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setSQLiteButtonActionPerformed(evt);
            }
        });

        cancelSQLiteButton.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        cancelSQLiteButton.setText("Cancel");
        cancelSQLiteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelSQLiteButtonActionPerformed(evt);
            }
        });

        sQLServerLabel.setFont(new java.awt.Font("Century Gothic", 0, 30)); // NOI18N
        sQLServerLabel.setText("SQLite Server");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pathText, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(attachButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(sQLServerLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(setSQLiteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(cancelSQLiteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(134, Short.MAX_VALUE)
                .addComponent(sQLServerLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(attachButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pathText, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(setSQLiteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelSQLiteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(157, Short.MAX_VALUE))
        );

        mainTab.addTab("SQLite", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(mainTab, javax.swing.GroupLayout.DEFAULT_SIZE, 454, Short.MAX_VALUE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(mainTab, javax.swing.GroupLayout.DEFAULT_SIZE, 496, Short.MAX_VALUE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void attachButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_attachButtonActionPerformed

        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File file = chooser.getSelectedFile();
        String filePath = file.getAbsolutePath();
        pathText.setText(filePath);
    }//GEN-LAST:event_attachButtonActionPerformed

    private void serverTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_serverTextActionPerformed
        serverText.setText(DatabaseConnection.getMySQLServer());
    }//GEN-LAST:event_serverTextActionPerformed

    private void mySQLUserNameTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mySQLUserNameTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mySQLUserNameTextActionPerformed

    private void mySQLPasswordTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mySQLPasswordTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mySQLPasswordTextActionPerformed

    private void setButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setButtonActionPerformed
        DatabaseConnection.option = "MySQL";
        DatabaseConnection.mySQLServer = serverText.getText();
        DatabaseConnection.mySQLUserName = mySQLUserNameText.getText();
        DatabaseConnection.mySQLPassword = mySQLPasswordText.getText();
        JOptionPane.showMessageDialog(this, "MySQL Server is set.", "Information", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_setButtonActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        this.hide();
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void setSQLiteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setSQLiteButtonActionPerformed
        DatabaseConnection.option = "SQLite";
        DatabaseConnection.sQLiteLocation = pathText.getText();
        JOptionPane.showMessageDialog(this, "SQL Server is set.", "Information", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_setSQLiteButtonActionPerformed

    private void cancelSQLiteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelSQLiteButtonActionPerformed
        this.hide();
    }//GEN-LAST:event_cancelSQLiteButtonActionPerformed

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
            java.util.logging.Logger.getLogger(SQLSelection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SQLSelection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SQLSelection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SQLSelection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SQLSelection().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton attachButton;
    private javax.swing.JButton cancelButton;
    private javax.swing.JButton cancelSQLiteButton;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTabbedPane mainTab;
    private javax.swing.JPanel mySQLPanel;
    private javax.swing.JLabel mySQLPasswordLabel;
    private javax.swing.JTextField mySQLPasswordText;
    private javax.swing.JLabel mySQLServerLabel;
    private javax.swing.JLabel mySQLUserNameLabel;
    private javax.swing.JTextField mySQLUserNameText;
    private javax.swing.JTextField pathText;
    private javax.swing.JLabel sQLServerLabel;
    private javax.swing.JTextField serverText;
    private javax.swing.JButton setButton;
    private javax.swing.JButton setSQLiteButton;
    // End of variables declaration//GEN-END:variables
}
