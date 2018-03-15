
package prefinal_exer2;

import javax.swing.table.*;
import java.sql.*;
import javax.swing.JOptionPane;

public class RootPage extends javax.swing.JFrame {
    public Prefinal_Exer2 connect;
    
    public OptionPage lp;
    
    public String database;
    public String IP;
    public String thisIP;
  
    public RootPage() {
        initComponents();
         this.setLocationRelativeTo(null);
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        SubjectTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        EnrollSubBTN = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        EnrolledSubjects = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        CodeBX = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        LogoutBTN = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        NameBX = new javax.swing.JTextField();
        AddBX = new javax.swing.JTextField();
        CourseBX = new javax.swing.JTextField();
        CurrentYearBX = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        SecBX = new javax.swing.JTextField();
        SchoolYearBX = new javax.swing.JTextField();
        SemesterBX = new javax.swing.JTextField();
        EnrollBTN = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        jLabel9.setText("Add New Student");

        SubjectTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Description", "Code", "Units", "Schedule", "Enrollees"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        SubjectTable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        SubjectTable.setColumnSelectionAllowed(true);
        jScrollPane1.setViewportView(SubjectTable);
        SubjectTable.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        if (SubjectTable.getColumnModel().getColumnCount() > 0) {
            SubjectTable.getColumnModel().getColumn(1).setPreferredWidth(200);
            SubjectTable.getColumnModel().getColumn(4).setPreferredWidth(115);
        }

        jLabel1.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        jLabel1.setText("Student Name:");

        EnrollSubBTN.setText("ENROLL SUBJECT");
        EnrollSubBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnrollSubBTNActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        jLabel2.setText("Address:");

        jLabel4.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        jLabel4.setText("Section:");

        jLabel11.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        jLabel11.setText("Subject ID:");

        EnrolledSubjects.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Code", "Description"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        EnrolledSubjects.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        EnrolledSubjects.setColumnSelectionAllowed(true);
        jScrollPane3.setViewportView(EnrolledSubjects);

        jLabel3.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        jLabel3.setText("Course:");

        CodeBX.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        jLabel5.setText("Semester:");

        LogoutBTN.setText("LOGOUT");
        LogoutBTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LogoutBTNMouseClicked(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        jLabel6.setText("Current Year:");

        jLabel7.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        jLabel7.setText("School Year:");

        jLabel12.setFont(new java.awt.Font("Segoe UI Light", 1, 12)); // NOI18N
        jLabel12.setText("ENROLLED SUBJECTS");
        jLabel12.setToolTipText("");

        NameBX.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N

        AddBX.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N

        CourseBX.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N

        CurrentYearBX.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Segoe UI Light", 1, 12)); // NOI18N
        jLabel8.setText("CHOOSE A SUBJECT");
        jLabel8.setToolTipText("");

        SecBX.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N

        SchoolYearBX.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N

        SemesterBX.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N

        EnrollBTN.setText("ENROLL AND GRANT PERMSIION");
        EnrollBTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EnrollBTNMouseClicked(evt);
            }
        });
        EnrollBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnrollBTNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(47, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(LogoutBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(62, 62, 62)
                                        .addComponent(SecBX, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel9)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addComponent(jLabel3)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(CourseBX, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel2)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(AddBX, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel1)
                                                .addGap(24, 24, 24)
                                                .addComponent(NameBX, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGap(54, 54, 54)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel5))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(SemesterBX)
                                    .addComponent(SchoolYearBX)
                                    .addComponent(CurrentYearBX)
                                    .addComponent(EnrollBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 618, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addComponent(EnrollSubBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(62, 62, 62)
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CodeBX, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(NameBX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(CurrentYearBX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(CodeBX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(AddBX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(SchoolYearBX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EnrollSubBTN))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(CourseBX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3)
                        .addComponent(jLabel5)
                        .addComponent(SemesterBX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(SecBX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(EnrollBTN))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(LogoutBTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(35, 35, 35))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EnrollSubBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EnrollSubBTNActionPerformed
        connect.createEnrolled(Integer.parseInt(CodeBX.getText()), connect.getLastID("Student", "StudID"));
        updateSubjectsEnrolledTable();
        updateSubjectsTable();
    }//GEN-LAST:event_EnrollSubBTNActionPerformed

    private void LogoutBTNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoutBTNMouseClicked
        lp.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_LogoutBTNMouseClicked

    private void EnrollBTNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EnrollBTNMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_EnrollBTNMouseClicked

    private void EnrollBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EnrollBTNActionPerformed
        String m = connect.insertStudentData(NameBX.getText(), AddBX.getText(), CourseBX.getText(), SecBX.getText(), 1, SemesterBX.getText(), SchoolYearBX.getText(), CurrentYearBX.getText());
        if(m.equals((" Record Inserted!"))){
            connect.grantPermission("s"+connect.getLastID("Student","StudID"), NameBX.getText(), database, thisIP);
            updateSubjectsEnrolledTable();
            updateSubjectsTable();
            JOptionPane.showMessageDialog(rootPane, "Your username: s"+connect.getLastID("Student","StudID")+"\nYour Password: "+NameBX.getText());
        } else JOptionPane.showMessageDialog(rootPane, m);
    }//GEN-LAST:event_EnrollBTNActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
      
    }//GEN-LAST:event_formWindowActivated

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        lp.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_formWindowClosing

      private void updateSubjectsEnrolledTable(){
        DefaultTableModel subjectsEnrolledTable = (DefaultTableModel)EnrolledSubjects.getModel();
        subjectsEnrolledTable.setRowCount(0);
        ResultSet rs = connect.getEnrolledSubjects(connect.getLastID("Student","StudID"));
        try{
                while (rs.next()) {
                    subjectsEnrolledTable.addRow(new Object[]{
                        rs.getString("SubjectID") ,
                        rs.getString("SubjectCode"),
                        rs.getString("SubjectDescription"),
                        });
            }
        } catch(Exception ex) {
            System.out.println(ex);
        }
    }
    
        private void updateSubjectsTable(){
        DefaultTableModel subjectsTable = (DefaultTableModel)SubjectTable.getModel();
        subjectsTable.setRowCount(0);
        ResultSet rs = connect.getAllSubjectData();
        try{
                while (rs.next()) {
                    subjectsTable.addRow(new Object[]{
                        rs.getString("SubjectID") ,
                        rs.getString("SubjectDescription"),
                        rs.getString("SubjectCode"),
                        rs.getString("Units"),
                        rs.getString("Sched"),
                        rs.getString("Count")
                        });
            }
        } catch(Exception ex) {
            System.out.println(ex);
        }
    }
        

        
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RootPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RootPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RootPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RootPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RootPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AddBX;
    private javax.swing.JTextField CodeBX;
    private javax.swing.JTextField CourseBX;
    private javax.swing.JTextField CurrentYearBX;
    private javax.swing.JButton EnrollBTN;
    private javax.swing.JButton EnrollSubBTN;
    private javax.swing.JTable EnrolledSubjects;
    private javax.swing.JButton LogoutBTN;
    private javax.swing.JTextField NameBX;
    private javax.swing.JTextField SchoolYearBX;
    private javax.swing.JTextField SecBX;
    private javax.swing.JTextField SemesterBX;
    private javax.swing.JTable SubjectTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables
}
