package prefinal_exer2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Random;

public class Prefinal_Exer2 {

    private Connection con;
    private Statement st;
    private ResultSet rs;
    private String Database;
    
    Random rand = new Random();

    public Prefinal_Exer2(String databaseName, String IPAdd, String user, String pass){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://"+IPAdd+":3306/"+databaseName, user, pass); 
            st = con.createStatement();
        } catch (Exception ex) {
            System.out.println (ex);
        }
    }
    
    //Server
    public int getServerDate(String type){
       try {
           if (type.equals("year")){
                String query = "select year(now()) AS year";
                rs = st.executeQuery(query); 
                rs.next(); 
                return Integer.parseInt(rs.getString("year"));
           } else if (type.equals("month")){
                String query = "select month(now()) AS month";
                rs = st.executeQuery(query); 
                rs.next(); 
                return Integer.parseInt(rs.getString("month"));
           } else if (type.equals("day")){
                String query = "select day(now()) AS day";
                rs = st.executeQuery(query); 
                rs.next(); 
                return Integer.parseInt(rs.getString("day"));
           }
        } catch(Exception ex) {
            System.out.println(ex);
        }
       return 0;
   }
    public boolean checkDate(){
        try {
            int year = getServerDate("year");
            int month = getServerDate("month");
            int day = getServerDate("day");
            if (month == 6 && day == 1){
                createDatabase("SY"+year+"_"+(year+1)+"_1stSem");
                createTables();
                return true;
            } else if (month == 10 && day == 1){
                createDatabase("SY"+year+"_"+(year+1)+"_2ndSem");
                createTables();
                return true;
            }
            return false;
        } catch(Exception ex) {
            System.out.println(ex);
            return false;
        }
    }
    
    //Database
    public void createDatabase(String DBname){
       try {
           String query = "create database if not exists "+ DBname;
           st.execute(query);
           Database = DBname;
           st.execute("use " + DBname);
        } catch(Exception ex) {
            System.out.println(ex);
        }
    }
    
    public String getDatabase(){
        return Database;
    }
    
    public void createTables (){
        try {
           String query = "CREATE TABLE IF NOT EXISTS Student("
                   + "StudID        INT             NOT NULL    AUTO_INCREMENT,     "
                   + "StudName      VARCHAR (255),                                  "
                   + "StudAdd       TEXT,                                           "
                   + "StudCourse    VARCHAR(10),                                    "
                   + "Section       CHAR(2),                                        "
                   + "Gender        BOOL,                                           "
                   + "Semester      VARCHAR(10),                                    "
                   + "SchoolYear    VARCHAR(9),                                     "
                   + "CurrentYear   VARCHAR(6),                                     "
                   + "PRIMARY KEY (StudID)"
                   + ")";
           st.execute(query);
           query = "CREATE TABLE IF NOT EXISTS Teacher("
                   + "TeacherID             INT             NOT NULL    AUTO_INCREMENT,   "
                   + "TeacherName           VARCHAR (250),                                "
                   + "TeacherDepartment     VARCHAR (100),                                "
                   + "PRIMARY KEY (TeacherID)"
                   + ")";
           st.execute(query);
           query = "CREATE TABLE IF NOT EXISTS Subjects("
                   + "SubjectID             INT         NOT NULL    AUTO_INCREMENT,     "
                   + "SubjectCode           VARCHAR(10),                                "
                   + "SubjectDescription    VARCHAR(250),                               "
                   + "Sched                 VARCHAR (45),                               "
                   + "Units                 INT,                                        "
                   + "TeachersID            INT,                                        "
                   + "PRIMARY KEY (SubjectID), "
                   + "FOREIGN KEY (TeachersID) REFERENCES Teacher(TeacherID)"
                   + ")";
           st.execute(query);
           query = "CREATE TABLE IF NOT EXISTS Enrolled("
                   + "EID           INT     NOT NULL    AUTO_INCREMENT,                 "
                   + "SubjectID     INT     NOT NULL,                                   "
                   + "StudID        INT     NOT NULL,                                   "
                   + "PRIMARY KEY (EID),"
                   + "UNIQUE (SubjectID, StudID),"
                   + "FOREIGN KEY (SubjectID) REFERENCES Subjects(SubjectID),"
                   + "FOREIGN KEY (StudID) REFERENCES Student(StudID)"
                   + ")";
           st.execute(query);
           query = "CREATE TABLE IF NOT EXISTS Grades("
                   + "GID           INT         NOT NULL  AUTO_INCREMENT,           "
                   + "Prelim        INT,                                            "
                   + "Midterm       INT,                                            "
                   + "Prefinal      INT,                                            "
                   + "PRIMARY KEY (GID)                                             "
                   + ")";
           st.execute(query);
        } catch(Exception ex) {
            System.out.println(ex);
        }
    }
    public void deleteDatabase(String DBname){
        try {
           String query = "drop database "+ DBname;
           st.execute(query);
        } catch(Exception ex) {
            System.out.println(ex);
        }
    }
    
    //General Methods
    public boolean isDataExist (String tableName, String field, String name){
        try {
            String query = "select * from " + tableName + " where "+field+ "='" + name + "'";
            rs = st.executeQuery(query);
            if (!rs.next()){
                return false;
            } else {
                return true;
            }
        } catch(Exception ex) {
            System.out.println(ex);
        }
        return false;
    }    
    public String deleteAllData (String tableName){
        try{
            String query = "DELETE FROM " + tableName +"";
            st = con.createStatement(); 
            st.executeUpdate(query); 
            return " Records Deleted!"; 
        } catch (Exception e) { 
            System.err.println(e.getMessage()); 
            return " Got an exception!"; 
        } 
    }    
    public String deleteData(String tableName, String field, String name){
        try{
            String query = "DELETE FROM " + tableName + " WHERE "+ field +" = '" + name + "'";
            st = con.createStatement(); 
            st.executeUpdate(query);
            return " Record Deleted!"; 
        } catch (Exception e) { 
            System.err.println(e.getMessage()); 
            return " Got an exception! "; 
        } 
    }     
    public int getLastID(String tableName, String tableID){
        try {
            String query = "select " +tableID+ " from "+tableName;
            rs = st.executeQuery(query);
            if (!rs.next()){
                return 0;
            } else {
                int ret = 1;
                while (rs.next()) if (rs.isLast()) ret = rs.getInt(tableID);
                return ret;
            }
        } catch(Exception ex) {
            System.out.println(ex);
        }
        return 0;
    }
    
    //Student Table
    public String insertStudentData(String StudName, String StudAdd, String Course, String Section, int Gender, String Semester, String SchoolYear, String CurrentYear){
        try { 
            String query = "INSERT INTO Student(        "
                    + "StudName,                        "
                    + "StudAdd,                         "
                    + "StudCourse,                      "
                    + "Section,                         "
                    + "Gender,                          "
                    + "Semester,                        "
                    + "SchoolYear,                      "
                    + "CurrentYear                      "
                    + ") VALUES (                       "
                    + "'"   +StudName+      "',         "
                    + "'"   +StudAdd+       "',         "
                    + "'"   +Course+        "',         "
                    + "'"   +Section+       "',         "
                    + "'"   +Gender+        "',         "
                    + "'"   +Semester+      "',         "
                    + "'"   +SchoolYear+    "',         "
                    + "'"   +CurrentYear+   "'          "
                    + ")";
            st = con.createStatement(); 
            st.executeUpdate(query); 
            return " Record Inserted!";
        } catch (Exception e) { 
            return e.getMessage();
        } 
    }   
    public String updateStudentData (int ID, String StudName, String StudAdd, String Course, String Section, int Gender, String Semester, String SchoolYear, String CurrentYear){
        try{
            String query =  "UPDATE Student SET                 "
                    + "StudName         = '"+StudName+"'    ,   "
                    + "StudAdd          = '"+StudAdd+"'     ,   "
                    + "StudCourse       = '"+ Course +"'    ,   "
                    + "Section          = '"+Section+"'     ,   "
                    + "Gender           = '"+Gender+"'      ,   "
                    + "Semester         = '"+Semester+"'    ,   "
                    + "SchoolYear       = '"+SchoolYear+"'  ,   "
                    + "CurrentYear      = '"+CurrentYear+"'     "
                    + "WHERE StudID     = '" + ID + "'          ";
            st = con.createStatement(); 
            st.executeUpdate(query); 
            return "Record Updated!"; 
        } catch (Exception e) { 
            System.err.println(e.getMessage()); 
            return "Got an exception!"; 
        } 
    }
    public ResultSet getStudentData(String field, String args) {
        try {
            String query = "select * from Student where "+ field +" ='" + args + "'";
            return st.executeQuery(query);
        } catch(Exception ex) {
            System.out.println(ex);
        }
        return rs;
    }   
    public ResultSet getAllStudentData() {
        try {
            String query = "select * from Student";
            return st.executeQuery(query);
        } catch(Exception ex) {
            System.out.println(ex);
        }
        return rs;
    }   
    
    //Teacher table
    public String insertTeacherData(String TeacherName, String TeacherDepartment){
        try { 
            String query = "INSERT INTO Teacher("
                    + "TeacherName, "
                    + "TeacherDepartment"
                    + ") VALUES ("
                    + "'"   +TeacherName+           "'            ,"
                    + "'"   +TeacherDepartment+     "'             "
                    + ")";
            st = con.createStatement(); 
            st.executeUpdate(query); 
            return " Record Inserted!";
        } catch (Exception e) { 
            System.err.println(e.getMessage()); 
            return " Got an exception!"; 
        } 
    }   
    public String updateTeacherData (int ID, String TeacherName, String TeacherDepartment){
        try{
            String query =  "UPDATE Teacher SET "
                    + "TeacherName          = '"+TeacherName+"'         , "
                    + "TeacherDepartment    = '"+TeacherDepartment+"'     "
                    + "WHERE TeacherID = '" + ID + "'                     ";
            st = con.createStatement(); 
            st.executeUpdate(query); 
            return "Record Updated!"; 
        } catch (Exception e) { 
            System.err.println(e.getMessage()); 
            return "Got an exception!"; 
        } 
    }
    public ResultSet getTeacherData(String field, String args) {
        try {
            String query = "SELECT * FROM Teacher WHERE " + field + " = '"+args+"'";
            return st.executeQuery(query);
        } catch(Exception ex) {
            System.out.println(ex);
        }
        return rs;
    } 
    public ResultSet getAllTeacherData() {
        try {
            String query = "SELECT * FROM Teacher";
            return st.executeQuery(query);
        } catch(Exception ex) {
            System.out.println(ex);
        }
        return rs;
    } 
    
    //Subject Table
    public String insertSubjectData(String SubjectCode, String SubjectDescription, String Sched, String Units, String TeachersID){
        try { 
            String query = "INSERT INTO Subjects("
                    + "SubjectCode, "
                    + "SubjectDescription, "
                    + "Sched, "
                    + "Units, "
                    + "TeachersID"
                    + ") VALUES ("
                    + "'"   +SubjectCode+           "'          ,"
                    + "'"   +SubjectDescription+    "'          ,"
                    + "'"   +Sched+                 "'          ,"
                    + "'"   +Units+                 "'          ,"
                    + "'"   +TeachersID+            "'           "
                    + ")";
            st = con.createStatement(); 
            st.executeUpdate(query); 
            return " Record Inserted!";
        } catch (Exception e) { 
            System.err.println(e.getMessage()); 
            return " Got an exception!"; 
        } 
    } 
     public String insertSubjectDataNoTeacher(String SubjectCode, String SubjectDescription, String Sched, String Units){
        try { 
            String query = "INSERT INTO Subjects("
                    + "SubjectCode, "
                    + "SubjectDescription, "
                    + "Sched, "
                    + "Units "
                    + ") VALUES ("
                    + "'"   +SubjectCode+           "'          ,"
                    + "'"   +SubjectDescription+    "'          ,"
                    + "'"   +Sched+                 "'          ,"
                    + "'"   +Units+                 "'          "
                    + ")";
            st = con.createStatement(); 
            st.executeUpdate(query); 
            return " Record Inserted!";
        } catch (Exception e) { 
            System.err.println(e.getMessage()); 
            return " Got an exception!"; 
        } 
    } 
    public String updateSubjectData (int ID, String SubjectCode, String SubjectDescription, String Sched, String Units, String TeachersID){
        try{
            String query =  "UPDATE Subjects SET "
                    + "SubjectCode          = '"+SubjectCode+"',            "
                    + "SubjectDescription   = '"+SubjectDescription+"',      "
                    + "Sched                = '"+Sched+"',                   "
                    + "Units                = '"+Units+"',                   "
                    + "TeachersID           = '"+TeachersID+"'              "
                    + "WHERE SubjectID      = '" + ID + "'                  ";
            st = con.createStatement(); 
            st.executeUpdate(query); 
            return "Record Updated!"; 
        } catch (Exception e) { 
            System.err.println(e.getMessage()); 
            return "Got an exception!"; 
        } 
    }
        public String updateSubjectAssignment (int ID, int TeachersID){
        try{
            String query =  "UPDATE Subjects SET "
                    + "TeachersID           = '"+TeachersID+"'              "
                    + "WHERE SubjectID      = '" + ID + "'                  ";
            st = con.createStatement(); 
            st.executeUpdate(query); 
            return "Record Updated!"; 
        } catch (Exception e) { 
            System.err.println(e.getMessage()); 
            return "Got an exception!"; 
        } 
    }
    public ResultSet getSubjectData(String field, String args) {
        try {
            String query = "SELECT * FROM Subjects WHERE " + field + " = '"+args+"'";
            return st.executeQuery(query);
        } catch(Exception ex) {
            System.out.println(ex);
        }
        return rs;
    } 
    public ResultSet getAllSubjectData() {
        try {
            String query = "SELECT Subjects.*, (SELECT Count(Enrolled.StudID) FROM Enrolled WHERE Enrolled.SubjectID = Subjects.SubjectID) AS Count FROM Subjects";
            return st.executeQuery(query);
        } catch(Exception ex) {
            System.out.println(ex);
        }
        return rs;
    } 
    
    //Grades Table
    public String insertGradeData(int Prelim, int Midterm, int Prefinal){
        try { 
            String query = "INSERT INTO Grades("
                    + "Prelim, "
                    + "Midterm, "
                    + "Prefinal"
                    + ") VALUES ("
                    + "'"       +Prelim+       "'    ,"
                    + "'"       +Midterm+       "'    ,"
                    + "'"       +Prefinal+      "'     "
                    + ")";
            st = con.createStatement(); 
            st.executeUpdate(query); 
            return " Record Inserted!";
        } catch (Exception e) { 
            System.err.println(e.getMessage()); 
            return " Got an exception!"; 
        } 
    }
    public String updateGradeData (int ID, int Prelim, int Midterm, int Prefinal){
        try{
            String query =  "UPDATE Grades SET "
                    + "Prelim               = '"+Prelim+"',            "
                    + "Midterm              = '"+Midterm+"',     "
                    + "Prefinal             = '"+Prefinal+"'                   "
                    + "WHERE GID      = '" + ID + "'                  ";
            st = con.createStatement(); 
            st.executeUpdate(query); 
            return "Record Updated!"; 
        } catch (Exception e) { 
            System.err.println(e.getMessage()); 
            return "Got an exception!"; 
        } 
    }
    public ResultSet getGradeData(String field, String args) {
        try {
            String query = "SELECT * FROM Grades WHERE " + field + " = '"+args+"'";
            return st.executeQuery(query);
        } catch(Exception ex) {
            System.out.println(ex);
        }
        return rs;
    } 
    public ResultSet getAllGradeData() {
        try {
            String query = "SELECT * FROM Grades";
            return st.executeQuery(query);
        } catch(Exception ex) {
            System.out.println(ex);
        }
        return rs;
    } 
    
    //Enrolled Table
    public String createEnrolled(int SubjectID, int StudID){
        try{
            String query = "INSERT INTO Enrolled(        "
                    + "StudID,                        "
                    + "SubjectID                         "
                    + ") VALUES (                       "
                    + "'"   +StudID+      "',         "
                    + "'"   +SubjectID+       "'         "
                    + ")";
            st = con.createStatement(); 
            st.executeUpdate(query); 
            insertGradeData(rand.nextInt(100%28)+72,rand.nextInt(100%28)+72,rand.nextInt(100%28)+72);
            return " Record Inserted!";
        } catch (Exception e) { 
            System.err.println(e.getMessage()); 
            return " Got an exception!"; 
        } 
    }
    public ResultSet getAllEnrollmentData() {
        try {
            String query = "SELECT * FROM Enrolled";
            return st.executeQuery(query);
        } catch(Exception ex) {
            System.out.println(ex);
        }
        return rs;
    } 
    
    public ResultSet getEnrolledSubjects(int StudID) {
        try {
            String query = "SELECT Subjects.SubjectID, SubjectCode, SubjectDescription FROM Subjects JOIN Enrolled ON Enrolled.SubjectID=Subjects.SubjectID WHERE StudID =" + StudID;
            return st.executeQuery(query);
        } catch(Exception ex) {
            System.out.println(ex);
        }
        return rs;
    } 
    
    public void grantPermission(String user, String pass, String database, String IP){
        try {
            String query = "Grant select on "+database+".* to '"+user+"'@"+IP+" identified by '"+pass+"'";
            st.executeQuery(query);
        } catch(Exception ex) {
            System.out.println(ex);
        }
    }
    
    public ResultSet getDetails(int StudID){
        try {
            String query = "SELECT StudName, StudCourse, Section, SchoolYear, Semester FROM Student WHERE StudID="+StudID;
            return st.executeQuery(query);
        } catch(Exception ex) {
            System.out.println(ex);
        }
        return rs;
    }
    
    public ResultSet getGradesDetails(int StudID){
        try {
            String query = "SELECT SubjectCode,SubjectDescription, Prelim, Midterm, Prefinal, ROUND((Prelim+Midterm+Prefinal)/3) AS Final FROM subjects JOIN Enrolled on Enrolled.SubjectID = subjects.SubjectID JOIN grades ON gid = eid WHERE StudID="+StudID;
            return st.executeQuery(query);
        } catch(Exception ex) {
            System.out.println(ex);
        }
        return rs;
    }
    
    public ResultSet getAssignedSubjects(int ID){
        try {
            String query = "SELECT Subjects.SubjectID, SubjectCode, SubjectDescription FROM Subjects WHERE TeachersID="+ID;
            return st.executeQuery(query);
        } catch(Exception ex) {
            System.out.println(ex);
        }
        return rs;
    }
    
    public ResultSet getSubjectsNoAssignment(){
        try {
            String query = "SELECT Subjects.*, (SELECT Count(Enrolled.StudID) FROM Enrolled WHERE Enrolled.SubjectID = Subjects.SubjectID) AS Count FROM Subjects WHERE TeachersID IS NULL";
            return st.executeQuery(query);
        } catch(Exception ex) {
            System.out.println(ex);
        }
        return rs;
    }
    
    public ResultSet getSubjectsAssignment(int ID){
        try {
            String query = "SELECT Subjects.* FROM Subjects WHERE TeachersID ="+ID;
            return st.executeQuery(query);
        } catch(Exception ex) {
            System.out.println(ex);
        }
        return rs;
    }
    
    public ResultSet query(String query){
        try {
            return st.executeQuery(query);
        } catch(Exception ex) {
            System.out.println(ex);
        }
        return rs;
    }
}
