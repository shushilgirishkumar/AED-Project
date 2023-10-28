/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.LoginPage;

import Courses.CourseCreation;
import Professor.ProfessorCourses;
import Professor.ProfessorHistory;
import UserInterface.ProfessorHomePageJPanel;
import java.awt.CardLayout;
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
    private JPanel userProcessContainer;
    private Professor.ProfessorCourses pd;
    private Courses.CourseCreation cc;
    private Professor.ProfessorHistory ph;
    public ProfessorLoginPage(JPanel userProcessContainer,ProfessorHistory ph,CourseCreation cc,ProfessorCourses pd) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ph = ph;
        this.cc = cc;
        this.pd =pd;
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
        jButton2 = new javax.swing.JButton();
        BackBtn = new javax.swing.JButton();

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

        jButton2.setText("Reset Password?");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        BackBtn.setText("Back");
        BackBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackBtnActionPerformed(evt);
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
                                    .addComponent(jButton2))
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
                        .addGap(93, 93, 93)
                        .addComponent(BackBtn)))
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
                    .addComponent(jButton2))
                .addGap(145, 145, 145)
                .addComponent(BackBtn)
                .addContainerGap(207, Short.MAX_VALUE))
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
         ProfessorHomePageJPanel panel = new ProfessorHomePageJPanel(userProcessContainer,ph,cc,pd,prof_neuid);
         userProcessContainer.add("ProfessorHomePageJPanel", panel);
         CardLayout layout = (CardLayout) userProcessContainer.getLayout();
         layout.next(userProcessContainer); 
         
//        for(Professor.ProfessorProfile p: ph.getHistory_professor()){
//            if(prof_neuid.equals(p.getProf_id()) && p.getProf_password().equals(prof_password)){
//                JOptionPane.showMessageDialog(this,"Access Granted");
//                txtneuid.setText("");
//                txtPassword.setText("");
//                 ProfessorHomePageJPanel panel = new ProfessorHomePageJPanel(userProcessContainer,ph,cc,pd,prof_neuid);
//                userProcessContainer.add("ProfessorHomePageJPanel", panel);
//                CardLayout layout = (CardLayout) userProcessContainer.getLayout();
//                layout.next(userProcessContainer); 
//                break;
//                }
//            else{
//                 JOptionPane.showMessageDialog(this,"Access Denied");
//                 txtneuid.setText("");
//                 txtPassword.setText("");
//            }
//        }
    }//GEN-LAST:event_LoginBtnActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
         UserInterface.SignupPage.ProfResetPasswordJPanel panel = new UserInterface.SignupPage.ProfResetPasswordJPanel(userProcessContainer,ph,cc,pd);
         userProcessContainer.add("ProfResetPasswordJPanel", panel);
         CardLayout layout = (CardLayout) userProcessContainer.getLayout();
         layout.next(userProcessContainer); 
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void BackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackBtnActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_BackBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackBtn;
    private javax.swing.JButton LoginBtn;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lbFname;
    private javax.swing.JLabel lbLname;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtneuid;
    // End of variables declaration//GEN-END:variables
}