package com.Patient_RecordApplication.model;

public class Patient {
	
	// Patient class Attributes 
		private int patient_id;
		
		private String name;
		
		private String contact;
		
		private String region;
		
		private String disease;
		
		private String med_prescribed;
		
		private String visit_date;
		
		private String doctors_name;

		/**
		 * @return the patient_id
		 */
		public int getPatient_id() {
			return patient_id;
		}

		/**
		 * @param patient_id the patient_id to set
		 */
		public void setPatient_id(int patient_id) {
			this.patient_id = patient_id;
		}

		/**
		 * @return the name
		 */
		public String getName() {
			return name;
		}

		/**
		 * @param name the name to set
		 */
		public void setName(String name) {
			this.name = name;
		}

		/**
		 * @return the contact
		 */
		public String getContact() {
			return contact;
		}

		/**
		 * @param contact the contact to set
		 */
		public void setContact(String contact) {
			this.contact = contact;
		}

		/**
		 * @return the region
		 */
		public String getRegion() {
			return region;
		}

		/**
		 * @param region the region to set
		 */
		public void setRegion(String region) {
			this.region = region;
		}

		/**
		 * @return the disease
		 */
		public String getDisease() {
			return disease;
		}

		/**
		 * @param disease the disease to set
		 */
		public void setDisease(String disease) {
			this.disease = disease;
		}

		/**
		 * @return the med_prescribed
		 */
		public String getMed_prescribed() {
			return med_prescribed;
		}

		/**
		 * @param med_prescribed the med_prescribed to set
		 */
		public void setMed_prescribed(String med_prescribed) {
			this.med_prescribed = med_prescribed;
		}

		/**
		 * @return the visit_date
		 */
		public String getVisit_date() {
			return visit_date;
		}

		/**
		 * @param visit_date the visit_date to set
		 */
		public void setVisit_date(String visit_date) {
			this.visit_date = visit_date;
		}

		/**
		 * @return the doctors_name
		 */
		public String getDoctors_name() {
			return doctors_name;
		}

		/**
		 * @param doctors_name the doctors_name to set
		 */
		public void setDoctors_name(String doctors_name) {
			this.doctors_name = doctors_name;
		}

		public Patient(int patient_id, String name, String contact, String region, String disease,
				String med_prescribed, String visit_date, String doctors_name) {
			super();
			this.patient_id = patient_id;
			this.name = name;
			this.contact = contact;
			this.region = region;
			this.disease = disease;
			this.med_prescribed = med_prescribed;
			this.visit_date = visit_date;
			this.doctors_name = doctors_name;
		}

		public Patient() {
			super();
			// TODO Auto-generated constructor stub
		}

		@Override
		public String toString() {
			return "\npatient_id=" + patient_id + ", name=" + name + ", contact=" + contact + ", region="
					+ region + ", disease=" + disease + ", med_prescribed=" + med_prescribed + ", visit_date="
					+ visit_date + ", doctors_name=" + doctors_name;
		}
		
		
		
		
		
		

}
