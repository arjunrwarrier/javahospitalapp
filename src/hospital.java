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
