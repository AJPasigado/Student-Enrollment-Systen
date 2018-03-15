package prefinal_exer2;
import javax.swing.table.*;
import java.sql.*;
import javax.swing.JOptionPane;

public class AddTeacher extends javax.swing.JFrame {
    public Prefinal_Exer2 connect;
    
    public OptionPage lp;

   public String database;
    public String IP;
    public String thisIP;
    
    public AddTeacher() {
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
        AssignBTN = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        EnrolledSubjects = new javax.swing.JTable();
        CodeBX = new javax.swing.JTextField();
        LogoutBTN = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        NameBX = new javax.swing.JTextField();
        AddBX = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        AddNewBTN = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        jLabel9.setText("Add New Teacher");

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
        jLabel1.setText("Teacher's Name:");

        AssignBTN.setText("ASSIGN SUBJECT");
        AssignBTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AssignBTNMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        jLabel2.setText("Department:");

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

        CodeBX.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N

        LogoutBTN.setText("LOGOUT");
        LogoutBTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LogoutBTNMouseClicked(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Segoe UI Light", 1, 12)); // NOI18N
        jLabel12.setText("ASSIGNED SUBJECTS");
        jLabel12.setToolTipText("");

        NameBX.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N

        AddBX.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Segoe UI Light", 1, 12)); // NOI18N
        jLabel8.setText("AVAILABLE SUBJECTS");
        jLabel8.setToolTipText("");

        AddNewBTN.setText("ADD NEW TEACHER");
        AddNewBTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddNewBTNMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(LogoutBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel9)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1)
                                .addComponent(jLabel2))
                            .addGap(24, 24, 24)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(NameBX, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(AddBX, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(62, 62, 62)
                            .addComponent(AddNewBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(136, 136, 136)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(19, 19, 19)
                                    .addComponent(jLabel11)
                                    .addGap(4, 4, 4)
                                    .addComponent(CodeBX, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(AssignBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel8)
                            .addGap(506, 506, 506)
                            .addComponent(jLabel12))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 618, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(28, 28, 28))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel9)
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel1)
                        .addGap(12, 12, 12)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(NameBX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(AddBX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(AddNewBTN))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel11))
                            .addComponent(CodeBX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(7, 7, 7)
                        .addComponent(AssignBTN)))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel12))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(LogoutBTN)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LogoutBTNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoutBTNMouseClicked
        lp.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_LogoutBTNMouseClicked

    private void AddNewBTNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddNewBTNMouseClicked
        String m = connect.insertTeacherData(NameBX.getText(), AddBX.getText());
        if(m.equals((" Record Inserted!"))){
            connect.grantPermission("t"+connect.getLastID("Teacher","TeacherID"), NameBX.getText(), database, thisIP);
            updateSubjectsEnrolledTable();
            updateSubjectsTable();
            JOptionPane.showMessageDialog(rootPane, "Your username: t"+connect.getLastID("Teacher","TeacherID")+"\nYour Password: "+NameBX.getText());
        } else JOptionPane.showMessageDialog(rootPane, m);
    }//GEN-LAST:event_AddNewBTNMouseClicked

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
         lp.setVisible(true);
    }//GEN-LAST:event_formWindowClosing

    private void AssignBTNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AssignBTNMouseClicked
        String m = connect.updateSubjectAssignment(Integer.parseInt(CodeBX.getText()), connect.getLastID("Teacher","TeacherID"));
        if(m.equals(("Record Updated!"))){
            updateSubjectsEnrolledTable();
            updateSubjectsTable();
        } else JOptionPane.showMessageDialog(rootPane, m);
    }//GEN-LAST:event_AssignBTNMouseClicked

     private void updateSubjectsEnrolledTable(){
        DefaultTableModel subjectsEnrolledTable = (DefaultTableModel)EnrolledSubjects.getModel();
        subjectsEnrolledTable.setRowCount(0);
        ResultSet rs = connect.getAssignedSubjects(connect.getLastID("Teacher","TeacherID"));
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
        ResultSet rs = connect.getSubjectsNoAssignment();
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
            java.util.logging.Logger.getLogger(AddTeacher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddTeacher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddTeacher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddTeacher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddTeacher().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AddBX;
    private javax.swing.JButton AddNewBTN;
    private javax.swing.JButton AssignBTN;
    private javax.swing.JTextField CodeBX;
    private javax.swing.JTable EnrolledSubjects;
    private javax.swing.JButton LogoutBTN;
    private javax.swing.JTextField NameBX;
    private javax.swing.JTable SubjectTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables
}
