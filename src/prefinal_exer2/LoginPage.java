
package prefinal_exer2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class LoginPage extends javax.swing.JFrame {
    String databaseName = "enrollment";
    String IPAddress = "10.4.42.136";
    String thisIP = "10.4.42.250";
    //String IPAddress = "192.168.1.40";
    //String thisIP = "192.168.1.14";
    Prefinal_Exer2 connect = new Prefinal_Exer2(databaseName, IPAddress,"root","root");
    
    public LoginPage() {
        initComponents();
         this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItem2 = new javax.swing.JRadioButtonMenuItem();
        DatabaseBX = new javax.swing.JTextField();
        LoginBTN = new javax.swing.JButton();
        UsernameBX = new javax.swing.JTextField();
        PasswordBX = new javax.swing.JTextField();
        Username = new java.awt.Label();
        Username1 = new java.awt.Label();
        Username2 = new java.awt.Label();
        Username3 = new java.awt.Label();
        StudentBTN = new javax.swing.JRadioButton();
        TeacherBTN = new javax.swing.JRadioButton();

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        jRadioButtonMenuItem2.setSelected(true);
        jRadioButtonMenuItem2.setText("jRadioButtonMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        DatabaseBX.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        DatabaseBX.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        DatabaseBX.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        LoginBTN.setBackground(new java.awt.Color(153, 153, 153));
        LoginBTN.setFont(new java.awt.Font("Tw Cen MT", 1, 12)); // NOI18N
        LoginBTN.setForeground(new java.awt.Color(51, 51, 51));
        LoginBTN.setText("LOGIN");
        LoginBTN.setBorder(null);
        LoginBTN.setBorderPainted(false);
        LoginBTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LoginBTNMouseClicked(evt);
            }
        });

        UsernameBX.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        UsernameBX.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        UsernameBX.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        PasswordBX.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        PasswordBX.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        PasswordBX.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        Username.setFont(new java.awt.Font("Tw Cen MT", 0, 12)); // NOI18N
        Username.setForeground(new java.awt.Color(102, 102, 102));
        Username.setText("USERNAME");

        Username1.setFont(new java.awt.Font("Tw Cen MT", 0, 12)); // NOI18N
        Username1.setForeground(new java.awt.Color(102, 102, 102));
        Username1.setText("PASSWORD");

        Username2.setAlignment(java.awt.Label.CENTER);
        Username2.setFont(new java.awt.Font("Tw Cen MT", 1, 36)); // NOI18N
        Username2.setForeground(new java.awt.Color(102, 102, 102));
        Username2.setText("Welcome!");

        Username3.setFont(new java.awt.Font("Tw Cen MT", 0, 12)); // NOI18N
        Username3.setForeground(new java.awt.Color(102, 102, 102));
        Username3.setText("DATABASE");

        StudentBTN.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        StudentBTN.setText("Student");
        StudentBTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                StudentBTNMouseClicked(evt);
            }
        });

        TeacherBTN.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        TeacherBTN.setText("Teacher");
        TeacherBTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TeacherBTNMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LoginBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(88, 88, 88))
            .addGroup(layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(StudentBTN)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(TeacherBTN))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(Username3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(DatabaseBX)
                    .addComponent(PasswordBX)
                    .addComponent(UsernameBX)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(Username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(Username1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Username2, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(60, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(Username2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(Username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(UsernameBX, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Username1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(PasswordBX, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Username3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(DatabaseBX, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(StudentBTN)
                    .addComponent(TeacherBTN))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(LoginBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LoginBTNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoginBTNMouseClicked
        if (UsernameBX.getText().equals("") || PasswordBX.getText().equals("") || DatabaseBX.getText().equals(""))
            JOptionPane.showMessageDialog(rootPane, "Please Complete all fields");
       else if (UsernameBX.getText().equals("root") && PasswordBX.getText().equals("root")) {
           connect = new Prefinal_Exer2(DatabaseBX.getText(), IPAddress,UsernameBX.getText(),PasswordBX.getText());
           LoadRoot();
       }
       else {
           try{
               Connection con;
               Statement st;
               Class.forName("com.mysql.jdbc.Driver");
               con = DriverManager.getConnection("jdbc:mysql://"+IPAddress+":3306/"+DatabaseBX.getText(), UsernameBX.getText(), PasswordBX.getText()); 
               st = con.createStatement();
               connect = new Prefinal_Exer2(DatabaseBX.getText(), IPAddress,UsernameBX.getText(),PasswordBX.getText());
               if (StudentBTN.isSelected()) LoadStudent();
               else LoadClassList();
           }
           catch(Exception e){
               System.out.println(e);
               JOptionPane.showMessageDialog(rootPane, "Incorrect credentials or\nNo privileges");
           }
       }
    }//GEN-LAST:event_LoginBTNMouseClicked

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        //connect.createDatabase("enrollment");
        //connect.createTables();
        //insertPredata();
        //connect.deleteDatabase("enrollment");
    }//GEN-LAST:event_formWindowActivated

    private void StudentBTNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StudentBTNMouseClicked
        if (TeacherBTN.isSelected()) TeacherBTN.setSelected(false);
        StudentBTN.setSelected(true);
    }//GEN-LAST:event_StudentBTNMouseClicked

    private void TeacherBTNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TeacherBTNMouseClicked
        if (StudentBTN.isSelected()) StudentBTN.setSelected(false);
        TeacherBTN.setSelected(true);
    }//GEN-LAST:event_TeacherBTNMouseClicked

    private void LoadRoot(){
        OptionPage rp = new OptionPage();
        this.setVisible(false);
        rp.lp = this;
        rp.thisIP = this.thisIP;
        rp.database = DatabaseBX.getText();
        rp.IP = this.IPAddress;
        rp.connect = this.connect;
        rp.setVisible(true);
    }
    
    private void LoadStudent(){
        StudentPage rp = new StudentPage();
        this.setVisible(false);
        rp.lp = this;
        rp.connect = this.connect;
        rp.StudID = Integer.parseInt(UsernameBX.getText().substring(1)); 
        rp.setVisible(true);
    }
    
    private void LoadClassList(){
        ClassList rp = new ClassList();
        this.setVisible(false);
        rp.lp = this;
        rp.connect = this.connect;
        rp.TID = Integer.parseInt(UsernameBX.getText().substring(1)); 
        rp.setVisible(true);
    }
    
    private void insertPredata(){
        connect.insertSubjectDataNoTeacher("CS200", "Applied Information and Communication Technology (ICT)", "7.45am - 8.45am Tth", "3");
        connect.insertSubjectDataNoTeacher("CS201", "Art and Design (Three-Dimensional Design)", "7.45am - 8.45am Tth", "3");
        connect.insertSubjectDataNoTeacher("CS202", "Knowledge and Inquiry", "7.45am - 8.45am Tth", "3");
        connect.insertSubjectDataNoTeacher("CS203", "Design and Technology: Product Design (3D Design", "7.45am - 8.45am Tth", "5");
        connect.insertSubjectDataNoTeacher("CS204", "Design and Technology: Food Technology", "7.45am - 8.45am Tth", "5");
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
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField DatabaseBX;
    private javax.swing.JButton LoginBTN;
    private javax.swing.JTextField PasswordBX;
    private javax.swing.JRadioButton StudentBTN;
    private javax.swing.JRadioButton TeacherBTN;
    private java.awt.Label Username;
    private java.awt.Label Username1;
    private java.awt.Label Username2;
    private java.awt.Label Username3;
    private javax.swing.JTextField UsernameBX;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem2;
    // End of variables declaration//GEN-END:variables
}
