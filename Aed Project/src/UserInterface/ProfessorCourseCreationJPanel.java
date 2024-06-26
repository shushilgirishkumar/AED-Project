/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface;


import Professor.ProfessorCourses;
import Professor.ProfessorHistory;
import java.awt.CardLayout;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Aneesh
 */
public class ProfessorCourseCreationJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CourseCrt
     */
    private JPanel userProcessContainer;
    private Professor.ProfessorHistory ph;
    private String profid;
    public ProfessorCourseCreationJPanel(JPanel userProcessContainer,ProfessorHistory ph,String neuid) {
        initComponents();
         this.userProcessContainer = userProcessContainer;
        this.ph = ph; 
        this.profid = neuid;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel18 = new javax.swing.JLabel();
        txtStartDate = new javax.swing.JTextField();
        txtEndDate = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtcode = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtSemster = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtCourseName = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txtCredits = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtCourseDescription = new javax.swing.JTextArea();
        CreateCourseBtn = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        BackBtn = new javax.swing.JButton();
        txtcrn = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtcoursedepartment = new javax.swing.JLabel();
        txtSeats = new javax.swing.JSpinner();
        txtcoursedep = new javax.swing.JComboBox<>();
        txtCourseType = new javax.swing.JComboBox<>();

        jPasswordField1.setText("jPasswordField1");

        jLabel18.setText("Seats:");

        txtStartDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStartDateActionPerformed(evt);
            }
        });

        jLabel11.setText("Course CRN:");

        jLabel12.setText("Course Semester :");

        jLabel14.setText("Course Name:");

        txtcode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcodeActionPerformed(evt);
            }
        });

        jLabel15.setText("Credits:");

        jLabel16.setText("StartDate(MM/dd/yyyy hh:mm):");

        jLabel17.setText("EndDate(MM/dd/yyyy hh:mm):");

        jLabel1.setText("Create Course Information");

        jLabel20.setText("Course Description:");

        txtCourseDescription.setColumns(20);
        txtCourseDescription.setRows(5);
        jScrollPane1.setViewportView(txtCourseDescription);

        CreateCourseBtn.setText("Create Course");
        CreateCourseBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateCourseBtnActionPerformed(evt);
            }
        });

        jLabel21.setText("Course Type:");

        BackBtn.setText("Back");
        BackBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackBtnActionPerformed(evt);
            }
        });

        txtcrn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcrnActionPerformed(evt);
            }
        });

        jLabel13.setText("Course code:");

        txtcoursedepartment.setText("Course department:");

        txtSeats.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                txtSeatsStateChanged(evt);
            }
        });

        txtcoursedep.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECT", "Information Systems", "Software Engineering", "Data Architecture Management" }));

        txtCourseType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECT", "OFFLINE", "ONLINE" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(252, 252, 252)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(BackBtn)
                        .addGap(190, 190, 190)
                        .addComponent(CreateCourseBtn)))
                .addContainerGap(386, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtcoursedepartment, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtcode)
                        .addComponent(txtCourseName)
                        .addComponent(txtCredits)
                        .addComponent(txtStartDate)
                        .addComponent(txtEndDate)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE)
                        .addComponent(txtcrn)
                        .addComponent(txtcoursedep, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtSemster)
                        .addComponent(txtSeats))
                    .addComponent(txtCourseType, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(139, 139, 139))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)
                        .addComponent(txtcoursedepartment, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtcrn, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtcode, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtcoursedep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(txtSemster, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtCourseName, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtCredits, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtStartDate, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtEndDate, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtSeats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel21, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCourseType, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                        .addComponent(CreateCourseBtn)
                        .addGap(26, 26, 26))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BackBtn)
                        .addGap(36, 36, 36))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtcodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcodeActionPerformed

    private void txtStartDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStartDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStartDateActionPerformed

    private void CreateCourseBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateCourseBtnActionPerformed
        // TODO add your handling code here:
        
        String CRN = txtcode.getText();
        String CourseName =  txtCourseName.getText();
        String CourseType =  (String) txtCourseType.getSelectedItem();
        String CourseCode =  txtcode.getText();
        int CourseCredits =  Integer.parseInt(txtCredits.getText());
        int seats = (Integer) txtSeats.getValue();
        String semster = txtSemster.getText();
        String startdate = txtStartDate.getText();
        String department = (String) txtcoursedep.getSelectedItem();
        String enddate = txtEndDate.getText();
        String course_desc = txtCourseDescription.getText();
        ProfessorCourses professor_c = ph.SearchProfessorCoursesbyneuid(profid);
        Professor.ProfessorProfile ppp = ph.SearchProfessorbyneuid(profid);
        String prof_name = ppp.getProf_first_name() + " " + ppp.getProf_last_name();
        
        boolean shouldAddNewCourse = true;
        
        

    SimpleDateFormat dateTimeFormat = new SimpleDateFormat("MM/dd/yyyy HH:mm");
    try {
        Date Sdtm1 = dateTimeFormat.parse(startdate);
        Date edtm1 = dateTimeFormat.parse(enddate);
         System.out.println(edtm1);
          if (Sdtm1.equals(edtm1)) {
                   //     printCourseHistory();
                       shouldAddNewCourse = false;
                       JOptionPane.showMessageDialog(null, "Unable to register, There is a time conflict with your registered course or you have already completed or registered for the course", "Warning", JOptionPane.WARNING_MESSAGE);
                        txtStartDate.setText("");
                        txtEndDate.setText("");
                        
                    }
               
            
       if(shouldAddNewCourse)
        {
         if(department.equals("SELECT")){
               JOptionPane.showMessageDialog(this,"Choose a department"); 
         }
         else{
             if(CourseType.equals("SELECT")){
                 JOptionPane.showMessageDialog(this,"Choose a course type"); 
             }
             else{
                 Courses.CourseDetails c = new Courses.CourseDetails(CourseName,"No pre-requisite",department,CourseCode,CRN,prof_name, semster, startdate, enddate, course_desc, CourseCredits,"un-erolled",seats,CourseType,"NA",0,0);
        ArrayList<Courses.CourseDetails> c1 = ph.getCoursehistory();
        ArrayList<Courses.CourseDetails> c2 = professor_c.getCourselists();
        c1.add(c);
        c2.add(c);
        ph.setCoursehistory(c1);
        professor_c.setCourselists(c2);
        JOptionPane.showMessageDialog(this,"New Course Created"); 
             }
        
         }
        
        }
       
        
      }
        
        
        
        
    
    catch (ParseException e) {
        // Handle the ParseException (e.g., log the error or throw a custom exception)
        System.err.println("Error parsing date: " + e.getMessage());
        // You might want to throw an exception here or handle it according to your application's logic
    }
       
        
                //(String Coursename, String course_prerequisite, String course_department, String Course_code, String CRN, String professor_name, String Term_offered, String startDateTime, String endDateTime, String course_description, int Course_credit, String coursestatus, int course_seats, String Course_Type, String Grade, int Course_rating, int no_ofstudentsreg)

          

    }//GEN-LAST:event_CreateCourseBtnActionPerformed

    private void BackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackBtnActionPerformed
        // TODO add your handling code here:
         userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
//        
    }//GEN-LAST:event_BackBtnActionPerformed

    private void txtcrnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcrnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcrnActionPerformed

    private void txtSeatsStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_txtSeatsStateChanged
        // TODO add your handling code here:
         if((Integer) txtSeats.getValue()<0){
             JOptionPane.showMessageDialog(this,"Invalid roles availability!");
        }
    }//GEN-LAST:event_txtSeatsStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackBtn;
    private javax.swing.JButton CreateCourseBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtCourseDescription;
    private javax.swing.JTextField txtCourseName;
    private javax.swing.JComboBox<String> txtCourseType;
    private javax.swing.JTextField txtCredits;
    private javax.swing.JTextField txtEndDate;
    private javax.swing.JSpinner txtSeats;
    private javax.swing.JTextField txtSemster;
    private javax.swing.JTextField txtStartDate;
    private javax.swing.JTextField txtcode;
    private javax.swing.JComboBox<String> txtcoursedep;
    private javax.swing.JLabel txtcoursedepartment;
    private javax.swing.JTextField txtcrn;
    // End of variables declaration//GEN-END:variables
}
