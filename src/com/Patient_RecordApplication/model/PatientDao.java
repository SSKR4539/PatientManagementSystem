package com.Patient_RecordApplication.model;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class PatientDao {
	

	//get Connection method
	public Connection getConnection() throws SQLException{

		//mysql database connection details
		String url = "jdbc:mysql://127.0.0.1:3306/patient_records";
		String user = "root";
		String pwd = "sumanthRAJU1998";

		Connection con = null ;

		//database connectivity code
		try {

			Class. forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(url,user,pwd);
			System.out.println("connection sucessfull !!!");

			}

			catch(ClassNotFoundException e){

			e.printStackTrace();

			}

		return con;

	}
	
	//Display method to display the table content
	public List<Patient>  displayRecord() throws SQLException{

		//SQL statement to get the data from table..
		String sql = "select * from patients";

		Connection con = getConnection();

		// WE need Statement object to use the select query
		//list object to store the table content
		List<Patient>  m_array = new ArrayList<>();

		try {

			Statement stmt = con.createStatement();

			ResultSet  rs = stmt.executeQuery(sql);

			//while loop until all data fetched from the table.....
			while(rs.next()){

				Patient m = new Patient(rs.getInt("patient_id"),rs.getString("name"),rs.getString("contact"),rs.getString("region"),rs.getString("disease"), rs.getString("med_prescribed"),rs.getString("visit_date"),rs.getString("doctors_name"));
				//push to arraylist
				m_array.add(m);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return m_array;

	}
	

	
public int insertRecord( Patient b) throws SQLException {
		
		String sql = "insert into patients(patient_id,name,contact,region,disease,med_prescribed,visit_date,doctors_name) values(?,?,?,?,?,?,?,?); ";

		Connection con = getConnection();
		
		int status = 0;

		try {
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setInt(1,b.getPatient_id());
			pstmt.setString(2,b.getName());
			pstmt.setString(3,b.getContact());
			pstmt.setString(4,b.getRegion());
			pstmt.setString(5,b.getDisease());
			pstmt.setString(6,b.getMed_prescribed());
			pstmt.setString(7,b.getVisit_date());
			pstmt.setString(8,b.getDoctors_name());
			

			status = pstmt.executeUpdate();
			
			if(status > 0) {
				System.out.println("Record inserted successfully!!");				
				//read();
			}
			
			else {
				System.out.println("Try again !!!");
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return status;		
		
	}

public int deleteRecord(int value) throws SQLException {				
	
	Connection con = getConnection();
	
	String sql = "delete from Patients where patient_id=?";
	
	int status = 0;
	
	PreparedStatement pstmt = con.prepareStatement(sql);
	
	pstmt.setInt(1,value);
	
	status = pstmt.executeUpdate();
	
	if(status > 0) {
		System.out.println("Record deleted successfullu!!");
	
	}
	
	else {
		System.out.println("Try again !!!");
	}
	return status;
}

public int update(int currentId, Patient p) throws SQLException {
	
	Connection con = getConnection();
	
	String sql = "update patients set patient_id=? , name =?, contact = ?, region=?, disease=?, med_prescribed=?,visit_date=?,doctors_name=?  where patient_id=?";
	
	int status = 0;

	try {
		PreparedStatement pstmt = con.prepareStatement(sql);
		pstmt.setInt(1,p.getPatient_id());
		pstmt.setString(2,p.getName());
		pstmt.setString(3,p.getContact());
		pstmt.setString(4,p.getRegion());
		pstmt.setString(5,p.getDisease());
		pstmt.setString(6,p.getMed_prescribed());
		pstmt.setString(7,p.getVisit_date());
		pstmt.setString(8,p.getDoctors_name());		
		pstmt.setInt(9, currentId);
		status = pstmt.executeUpdate();
		
		if(status > 0) {
			System.out.println("Record updated successfullu!!");
			
		}
		
		else {
			System.out.println("Current Id not found!!!");
		}}catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	return status;
	

}

}
