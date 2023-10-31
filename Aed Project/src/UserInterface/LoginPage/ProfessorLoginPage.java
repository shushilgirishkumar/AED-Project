/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.LoginPage;

import Professor.ProfessorHistory;
import Student.Student;
import UserInterface.HomePage.ProfessorHomePageJPanel;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author shush
 */
public class ProfessorLoginPage extends javax.swing.JPanel {

    /**
     * Creates new form ProfessorLoginPage
     */
     private ArrayList<Student> st;
    private JPanel userProcessContainer;
    private Professor.ProfessorHistory ph;
    public ProfessorLoginPage(JPanel userProcessContainer,ProfessorHistory ph,ArrayList<Student> s) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ph = ph;
        this.st = s;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbLname = new javax.swing.JLabel();
        lbFname = new javax.swing.JLabel();
        txtneuid = new javax.swing.JTextField();
        txtPassword = new javax.swing.JTextField();
        LoginBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        ResetPasswordBtn = new javax.swing.JButton();
        BackBtn = new javax.swing.JButton();
        SignupBtn = new javax.swing.JButton();

        lbLname.setText("Password:");

        lbFname.setText("Professor neuid:");

        txtneuid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtneuidActionPerformed(evt);
            }
        });

        LoginBtn.setText("Login");
        LoginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginBtnActionPerformed(evt);
            }
        });

        jLabel1.setText("Professor Login");

        ResetPasswordBtn.setText("Reset Password?");
        ResetPasswordBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetPasswordBtnActionPerformed(evt);
            }
        });

        BackBtn.setText("Back");
        BackBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackBtnActionPerformed(evt);
            }
        });

        SignupBtn.setText("Signup");
        SignupBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignupBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(231, 231, 231)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbFname)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbLname, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ResetPasswordBtn))
                                .addGap(97, 97, 97)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LoginBtn)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtneuid)
                                        .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(376, 376, 376)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(BackBtn)
                        .addGap(152, 152, 152)
                        .addComponent(SignupBtn)))
                .addContainerGap(270, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addGap(76, 76, 76)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(lbFname))
                    .addComponent(txtneuid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(lbLname))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LoginBtn)
                    .addComponent(ResetPasswordBtn))
                .addGap(90, 90, 90)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BackBtn)
                    .addComponent(SignupBtn))
                .addContainerGap(262, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtneuidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtneuidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtneuidActionPerformed

    private void LoginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginBtnActionPerformed
        // TODO add your handling code here:
         String prof_neuid = txtneuid.getText();
        String prof_password = txtPassword.getText();
        Professor.ProfessorProfile p = ph.SearchProfessorbyneuid(prof_neuid);
        if(p==null){
            JOptionPane.showMessageDialog(this,"Access Denied");
        }
        else{
            if(p.getProf_password().equals(prof_password)){
                JOptionPane.showMessageDialog(this,"Access Granted");
            }
            else{
                JOptionPane.showMessageDialog(this,"Incorrect password!! Please Try again");
            }
        }
         txtneuid.setText("");
         txtPassword.setText("");
         ProfessorHomePageJPanel panel = new ProfessorHomePageJPanel(userProcessContainer,ph,prof_neuid,st);
         userProcessContainer.add("ProfessorHomePageJPanel", panel);
         CardLayout layout = (CardLayout) userProcessContainer.getLayout();
         layout.next(userProcessContainer); 
         

    }//GEN-LAST:event_LoginBtnActionPerformed

    private void ResetPasswordBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetPasswordBtnActionPerformed
        // TODO add your handling code here:
         UserInterface.ResetPassword.ProfResetPasswordJPanel panel = new UserInterface.ResetPassword.ProfResetPasswordJPanel(userProcessContainer,ph);
         userProcessContainer.add("ProfResetPasswordJPanel", panel);
         CardLayout layout = (CardLayout) userProcessContainer.getLayout();
         layout.next(userProcessContainer); 
        
    }//GEN-LAST:event_ResetPasswordBtnActionPerformed

    private void BackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackBtnActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_BackBtnActionPerformed

    private void SignupBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignupBtnActionPerformed
        // TODO add your handling code here:
         UserInterface.SignupPage.ProfessorSignupJPanel panel = new UserInterface.SignupPage.ProfessorSignupJPanel(userProcessContainer,ph);
         userProcessContainer.add("ProfResetPasswordJPanel", panel);
         CardLayout layout = (CardLayout) userProcessContainer.getLayout();
         layout.next(userProcessContainer); 
    }//GEN-LAST:event_SignupBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackBtn;
    private javax.swing.JButton LoginBtn;
    private javax.swing.JButton ResetPasswordBtn;
    private javax.swing.JButton SignupBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lbFname;
    private javax.swing.JLabel lbLname;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtneuid;
    // End of variables declaration//GEN-END:variables
}