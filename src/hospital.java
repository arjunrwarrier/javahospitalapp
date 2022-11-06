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

                    break;
                case 3:
                    System.out.println("Search Patient");


                    break;
                case 4:
                    System.out.println("Update Patient Details");


                    break;
                case 5:
                    System.out.println("Delete Patient");


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
