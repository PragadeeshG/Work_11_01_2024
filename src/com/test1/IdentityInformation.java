package com.test1;

public class IdentityInformation {
	private long id;
	private String names;
	private String address;
	private String signatures;
	private String biometricData;
	private String medicalCondition;
	private String dateOfBirth;
	private String socialSecurityNumber;

	public IdentityInformation() {

	}

	public IdentityInformation(long id, String names, String address, String signatures, String biometricData,
			String medicalCondition, String dateOfBirth, String socialSecurityNumber) {
		super();
		this.id = id;
		this.names = names;
		this.address = address;
		this.signatures = signatures;
		this.biometricData = biometricData;
		this.medicalCondition = medicalCondition;
		this.dateOfBirth = dateOfBirth;
		this.socialSecurityNumber = socialSecurityNumber;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNames() {
		return names;
	}

	public void setNames(String names) {
		this.names = names;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getSignatures() {
		return signatures;
	}

	public void setSignatures(String signatures) {
		this.signatures = signatures;
	}

	public String getBiometricData() {
		return biometricData;
	}

	public void setBiometricData(String biometricData) {
		this.biometricData = biometricData;
	}

	public String getMedicalCondition() {
		return medicalCondition;
	}

	public void setMedicalCondition(String medicalCondition) {
		this.medicalCondition = medicalCondition;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getSocialSecurityNumber() {
		return socialSecurityNumber;
	}

	public void setSocialSecurityNumber(String socialSecurityNumber) {
		this.socialSecurityNumber = socialSecurityNumber;
	}

}
