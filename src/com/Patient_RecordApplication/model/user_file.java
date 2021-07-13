package com.Patient_RecordApplication.model;

import java.sql.SQLException;
import java.util.Scanner;

public class user_file {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		
		int choice = 0;
		Scanner obj = new Scanner(System.in);
		PatientDao p = new PatientDao();
		
		while(choice>=0 ) {
			
			System.out.println("\nChoose one option or 5 to Exit");
			System.out.println("1.Display Record");
			System.out.println("2.Insert Record");
			System.out.println("3.Update Record");
			System.out.println("4.Delete Record");
			System.out.println("5.Exit");
			
			choice = obj.nextInt();
			
			if(choice == 1) {
				
				
				System.out.println(p.displayRecord());
				
			}
			
			else if(choice ==2) {	
				
				System.out.println("Enter the Patient_id:");
				int patient_id = obj.nextInt();
				System.out.println("Enter the Patient Name:");
				obj.nextLine();				
				String name = obj.nextLine();
				System.out.println("Enter the Contact:");
				String contact = obj.nextLine();
				System.out.println("Enter the Region:");
				String region = obj.nextLine();
				System.out.println("Enter the Disease:");
				String disease = obj.nextLine();
				System.out.println("Enter the Prescribed medicine:");
				String med_prescribed = obj.nextLine();
				System.out.println("Enter the Visit date:");
				String visit_date = obj.nextLine();
				System.out.println("Enter the doctor name:");
				String doctors_name = obj.nextLine();
				
				Patient p1 = new Patient(patient_id,name,contact,region,disease,med_prescribed,visit_date,doctors_name);
				System.out.println(p.insertRecord(p1));
				
			}
			
			else if(choice == 4) {
				
				System.out.println("Enter the Patient id to delete");
				
				System.out.println(p.deleteRecord(obj.nextInt()));
			}
			
			else if(choice == 3) {
				
				System.out.println("Enter the Patient id to update");
				int patient_id = obj.nextInt();
				System.out.println("Enter the Patient Name:");
				obj.nextLine();				
				String name = obj.nextLine();
				System.out.println("Enter the Contact:");
				String contact = obj.nextLine();
				System.out.println("Enter the Region:");
				String region = obj.nextLine();
				System.out.println("Enter the Disease:");
				String disease = obj.nextLine();
				System.out.println("Enter the Prescribed medicine:");
				String med_prescribed = obj.nextLine();
				System.out.println("Enter the Visit date:");
				String visit_date = obj.nextLine();
				System.out.println("Enter the doctor name:");
				String doctors_name = obj.nextLine();
				
				Patient p1 = new Patient(patient_id,name,contact,region,disease,med_prescribed,visit_date,doctors_name);				
				System.out.println(p.update(patient_id, p1));
			}
			
			else {
				
				System.out.println("Thank you..");
				break;
			}
			
			
		}
		
		
		
		
		
		
		

	}

}
