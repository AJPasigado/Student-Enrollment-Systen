package prefinal_exer2;

import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;

public class ClassListForm extends javax.swing.JFrame {
    public Prefinal_Exer2 connect;
    public ClassList lp;
    public int TID;
    public String SubjCode;

    public ClassListForm() {
        initComponents();
         this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SemBX = new javax.swing.JTextField();
        LogoutBTN = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        RegistrationTBL = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        NameBX = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        CodeBX = new javax.swing.JTextField();
        DescBX = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        SchedBX = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        UnitsBX = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        SemBX.setEditable(false);
        SemBX.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        SemBX.setText("Second");
        SemBX.setBorder(null);
        SemBX.setSelectedTextColor(new java.awt.Color(102, 102, 102));
        SemBX.setSelectionColor(new java.awt.Color(255, 255, 255));
        getContentPane().add(SemBX, new org.netbeans.lib.awtextra.AbsoluteConstraints(376, 73, -1, -1));

        LogoutBTN.setText("BACK");
        LogoutBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutBTNActionPerformed(evt);
            }
        });
        getContentPane().add(LogoutBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(374, 555, -1, -1));

        RegistrationTBL.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Student ID", "Name", "Current Year"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        RegistrationTBL.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jScrollPane1.setViewportView(RegistrationTBL);
        if (RegistrationTBL.getColumnModel().getColumnCount() > 0) {
            RegistrationTBL.getColumnModel().getColumn(1).setPreferredWidth(200);
            RegistrationTBL.getColumnModel().getColumn(2).setPreferredWidth(110);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 247, 390, 290));

        jLabel3.setFont(new java.awt.Font("Tw Cen MT", 0, 36)); // NOI18N
        jLabel3.setText("Class List");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(198, 25, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tw Cen MT", 0, 12)); // NOI18N
        jLabel2.setText("TEACHER'S NAME:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 78, -1, -1));

        NameBX.setEditable(false);
        NameBX.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        NameBX.setText("Name");
        NameBX.setBorder(null);
        NameBX.setSelectedTextColor(new java.awt.Color(102, 102, 102));
        NameBX.setSelectionColor(new java.awt.Color(255, 255, 255));
        getContentPane().add(NameBX, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, -1, 30));

        jLabel4.setFont(new java.awt.Font("Tw Cen MT", 0, 12)); // NOI18N
        jLabel4.setText("DEPARTMENT:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(292, 78, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tw Cen MT", 0, 12)); // NOI18N
        jLabel5.setText("SUBJECT CODE:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tw Cen MT", 0, 12)); // NOI18N
        jLabel6.setText("DESCRIPTION:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, -1, -1));

        CodeBX.setEditable(false);
        CodeBX.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        CodeBX.setText("Name");
        CodeBX.setBorder(null);
        CodeBX.setSelectedTextColor(new java.awt.Color(102, 102, 102));
        CodeBX.setSelectionColor(new java.awt.Color(255, 255, 255));
        getContentPane().add(CodeBX, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, -1, 30));

        DescBX.setEditable(false);
        DescBX.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        DescBX.setText("Second");
        DescBX.setBorder(null);
        DescBX.setSelectedTextColor(new java.awt.Color(102, 102, 102));
        DescBX.setSelectionColor(new java.awt.Color(255, 255, 255));
        getContentPane().add(DescBX, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, -1, 30));

        jLabel7.setFont(new java.awt.Font("Tw Cen MT", 0, 12)); // NOI18N
        jLabel7.setText(".");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 0, 10, -1));

        SchedBX.setEditable(false);
        SchedBX.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        SchedBX.setText("Second");
        SchedBX.setBorder(null);
        SchedBX.setSelectedTextColor(new java.awt.Color(102, 102, 102));
        SchedBX.setSelectionColor(new java.awt.Color(255, 255, 255));
        getContentPane().add(SchedBX, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, -1, 30));

        jLabel8.setFont(new java.awt.Font("Tw Cen MT", 0, 12)); // NOI18N
        jLabel8.setText("UNITS:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 110, -1, -1));

        UnitsBX.setEditable(false);
        UnitsBX.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        UnitsBX.setText("Second");
        UnitsBX.setBorder(null);
        UnitsBX.setSelectedTextColor(new java.awt.Color(102, 102, 102));
        UnitsBX.setSelectionColor(new java.awt.Color(255, 255, 255));
        getContentPane().add(UnitsBX, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 100, -1, 30));

        jLabel9.setFont(new java.awt.Font("Tw Cen MT", 0, 12)); // NOI18N
        jLabel9.setText("SCHED:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tw Cen MT", 0, 12)); // NOI18N
        jLabel10.setText(".");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 590, 10, 10));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LogoutBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutBTNActionPerformed
        lp.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_LogoutBTNActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        updateForm();
        updateRegTable();
    }//GEN-LAST:event_formWindowActivated

    private void updateForm(){
        ResultSet rs = connect.getTeacherData("TeacherID", TID+"");
        try{
            rs.next();
            NameBX.setText(rs.getString("TeacherName"));
            SemBX.setText(rs.getString("TeacherDepartment"));
        } catch(Exception ex) {
            System.out.println(ex);
        }
        String q = "SELECT * FROM SUBJECTS WHERE SubjectCode='"+SubjCode+"'";
        rs = connect.query(q);
        try{
            rs.next();
            CodeBX.setText(rs.getString("SubjectCode"));
            DescBX.setText(rs.getString("SubjectDescription"));
            SchedBX.setText(rs.getString("Sched"));
            UnitsBX.setText(rs.getString("Units"));
        } catch(Exception ex) {
            System.out.println(ex);
        }
    }
    
     private void updateRegTable(){
     DefaultTableModel registrationTBL = (DefaultTableModel)RegistrationTBL.getModel();
     registrationTBL.setRowCount(0);
     String q = "SELECT Student.StudID, Student.StudName, Student.CurrentYear, Subjects.SubjectCode FROM Student JOIN Enrolled ON Student.StudID = Enrolled.StudID JOIN Subjects ON Subjects.SubjectID = Enrolled.SubjectID WHERE SubjectCode='"+SubjCode+"'";
     ResultSet rs = connect.query(q);
     try{
             while (rs.next()) {
                 registrationTBL.addRow(new Object[]{
                     rs.getString("StudID"),
                     rs.getString("StudName"),
                     rs.getString("CurrentYear")
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
            java.util.logging.Logger.getLogger(ClassListForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClassListForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClassListForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClassListForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClassListForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CodeBX;
    private javax.swing.JTextField DescBX;
    private javax.swing.JButton LogoutBTN;
    private javax.swing.JTextField NameBX;
    private javax.swing.JTable RegistrationTBL;
    private javax.swing.JTextField SchedBX;
    private javax.swing.JTextField SemBX;
    private javax.swing.JTextField UnitsBX;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
