import java.util.Scanner;
import  java.sql.*;

public class hospital {
    public static void main(String[] args) {
        int choice;
        Scanner input = new Scanner(System.in);
        String patientName, patientAddress, patientSymptoms, patientsDoctor, patientPhone;
        int patientId, patientPincode;






        while(true) {
            System.out.println("Select an option from below");
            System.out.println("1.Add Patient ");
            System.out.println("2.View all  Patients ");
            System.out.println("3.Search a Patient details ");
            System.out.println("4.Update a Patient Details ");
            System.out.println("5.Delete a Patient ");
            System.out.println("6.Exit ");
            System.out.println("Enter your choice:  ");
            choice = input.nextInt();

            switch (choice){
                case 1:
                    System.out.println("Add a Patient");
                    System.out.println("Enter Patient ID: ");
                    patientId = input.nextInt();
                    System.out.println("Enter Patient Name: ");
                    patientName = input.next();
                    System.out.println("Enter patient address: ");
                    patientAddress = input.next();
                    System.out.println("Enter pincode: ");
                    patientPincode = input.nextInt();
                    System.out.println("Enter patient phone: ");
                    patientPhone = input.next();
                    System.out.println("Enter patients symptoms: ");
                    patientSymptoms = input.next();
                    System.out.println("Enter doctors name: ");
                    patientsDoctor = input.next();

                    try {
                        Class.forName("com.mysql.jdbc.Driver");
                        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospitaldb","root","");
                        String sql = "INSERT INTO `patients`(`patientid`, `name`, `address`, `pincode`, `phone`, `symptoms`, `docname`)VALUES (?,?,?,?,?,?,?)";
                        PreparedStatement stmt = con.prepareStatement(sql);
                        stmt.setInt(1,patientId);
                        stmt.setString(2,patientName);
                        stmt.setString(3,patientAddress);
                        stmt.setInt(4,patientPincode);
                        stmt.setString(5,patientPhone);
                        stmt.setString(6,patientSymptoms);
                        stmt.setString(7,patientsDoctor);
                        stmt.executeUpdate();
                    }
                    catch (Exception e ){
                        System.out.println(e);
                    }




                    break;
                case 2:
                    System.out.println("View all Patients");
                    try{
                        Class.forName("com.mysql.jdbc.Driver");
                        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospitaldb","root","");
                        String sql = "SELECT `patientid`, `name`, `address`, `pincode`, `phone`, `symptoms`, `docname` FROM `patients`";
                        Statement stmt = con.createStatement();
                        ResultSet rs = stmt.executeQuery(sql);
                        while (rs.next()){
                            String getPatientId = rs.getString("patientid");
                            String getPatientName = rs.getString("name");
                            String getPatientAddress = rs.getString("address");
                            String getPin = rs.getString("pincode");
                            String getPatientPhone = rs.getString("phone");
                            String getPatientSymptoms = rs.getString("symptoms");
                            String getPatientDoc =rs.getString("docname");

                            System.out.println("Patient Id="+getPatientId);
                            System.out.println("Patient Name="+getPatientName);
                            System.out.println("Patient Address="+getPatientAddress);
                            System.out.println("Patient Pincode="+getPin);
                            System.out.println("Patient Phone="+getPatientPhone);
                            System.out.println("Patient Symptoms="+getPatientSymptoms);
                            System.out.println("Patients Doctor="+getPatientDoc+"\n");

                        }

                    }
                    catch (Exception e){
                        System.out.println(e);
                    }

                    break;
                case 3:
                    System.out.println("Search Patient");
                    System.out.println("Enter the patient Id: ");
                    patientId = input.nextInt();

                    try {
                        Class.forName("com.mysql.jdbc.Driver");
                        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospitaldb", "root", "");
                        String sql = "SELECT `name`, `address`, `pincode`, `phone`, `symptoms`, `docname` FROM `patients` WHERE `patientid` =  "+String.valueOf(patientId);

                        Statement stmt = con.createStatement();
                        ResultSet rs = stmt.executeQuery(sql);
                        while (rs.next()){
                            String getPatientName = rs.getString("name");
                            String getPatientAddress = rs.getString("address");
                            String getPin = rs.getString("pincode");
                            String getPatientPhone = rs.getString("phone");
                            String getPatientSymptoms = rs.getString("symptoms");
                            String getPatientDoc =rs.getString("docname");

                            System.out.println("Patient Name="+getPatientName);
                            System.out.println("Patient Address="+getPatientAddress);
                            System.out.println("Patient Pincode="+getPin);
                            System.out.println("Patient Phone="+getPatientPhone);
                            System.out.println("Patient Symptoms="+getPatientSymptoms);
                            System.out.println("Patients Doctor="+getPatientDoc+"\n");

                        }


                    }
                    catch (Exception e){
                        System.out.println(e);
                    }



                    break;
                case 4:
                    System.out.println("Update Patient Details");
                    System.out.println("Enter the patient ID: ");
                    patientId = input.nextInt();
                    System.out.println("Enter Patient Name: ");
                    patientName = input.next();
                    System.out.println("Enter patient address: ");
                    patientAddress = input.next();
                    System.out.println("Enter pincode: ");
                    patientPincode = input.nextInt();
                    System.out.println("Enter patient phone: ");
                    patientPhone = input.next();
                    System.out.println("Enter patients symptoms: ");
                    patientSymptoms = input.next();
                    System.out.println("Enter doctors name: ");
                    patientsDoctor = input.next();

                    try {
                        Class.forName("com.mysql.jdbc.Driver");
                        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospitaldb", "root", "");
                        String sql = "UPDATE `patients` SET `name`='"+patientName+"',`address`='"+patientAddress+"',`pincode`='"+patientPincode+"',`phone`='"+patientPhone+"',`symptoms`='"+patientSymptoms+"',`docname`='"+patientsDoctor+"' WHERE `patientid` = " + patientId;
                        Statement stmt = con.createStatement();
                        stmt.executeUpdate(sql);
                        System.out.println("Patients Data updated successfully.");
                    }
                    catch (Exception e){
                        System.out.println(e);
                    }


                    break;
                case 5:
                    System.out.println("Delete Patient");
                    System.out.println("Enter the Patient Id : ");
                    patientId = input.nextInt();

                    try {
                        Class.forName("com.mysql.jdbc.Driver");
                        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospitaldb", "root", "");
                        String sql = "DELETE FROM `patients` WHERE `patientid` = " + patientId;
                        Statement stmt = con.createStatement();
                        stmt.executeUpdate(sql);
                        System.out.println("Patient Data deleted successfully.");
                    }
                    catch (Exception e){
                        System.out.println(e);
                    }


                    break;
                case 6:
                    System.out.println("Exit");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Enter correct choice");


            }

        }
    }
}
