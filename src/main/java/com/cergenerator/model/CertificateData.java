package com.cergenerator.model;

public class CertificateData {

	private int serialNumber;	//automatski
	private boolean ca;
	private boolean revoked;
	
	
	
	private int keySize;
	private String keyType;
	
	public void setKeyType(String keyType) {
		this.keyType = keyType;
	}

	private String commonName;
	private String organization;
	private String organizationUnit;
	private String city;
	private String state;
	private String country;
	private int validity;
	private String alias;
	private char[] keystorePass = "test".toCharArray();
	
	public CertificateData() {
		// TODO Auto-generated constructor stub
	}
	

	public CertificateData(boolean ca, boolean revoked, int keySize, String keyType, String commonName, String organization,
			String organizationUnit, String city, String state, String country, int validity, String alias,
			char[] keystorePass) {
		super();
		this.ca = ca;
		this.revoked = revoked;
		this.keySize = keySize;
		this.keyType = keyType;
		this.commonName = commonName;
		this.organization = organization;
		this.organizationUnit = organizationUnit;
		this.city = city;
		this.state = state;
		this.country = country;
		this.validity = validity;
		this.alias = alias;
		this.keystorePass = keystorePass;
	}




	public String getKeyType() {
		return keyType;
	}


	public boolean isRevoked() {
		return revoked;
	}

	public void setRevoked(boolean revoked) {
		this.revoked = revoked;
	}

	public boolean isCa() {
		return ca;
	}

	public void setCa(boolean ca) {
		this.ca = ca;
	}

	public int getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(int serialNumber) {
		this.serialNumber = serialNumber;
	}

	public int getKeySize() {
		return keySize;
	}

	public void setKeySize(int keySize) {
		this.keySize = keySize;
	}

	public String getCommonName() {
		return commonName;
	}

	public void setCommonName(String commonName) {
		this.commonName = commonName;
	}

	public String getOrganization() {
		return organization;
	}

	public void setOrganization(String organization) {
		this.organization = organization;
	}

	public String getOrganizationUnit() {
		return organizationUnit;
	}

	public void setOrganizationUnit(String organizationUnit) {
		this.organizationUnit = organizationUnit;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getValidity() {
		return validity;
	}

	public void setValidity(int validity) {
		this.validity = validity;
	}

	public String getAlias() {
		return alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
	}

	public char[] getKeystorePass() {
		return keystorePass;
	}

	public void setKeystorePass(char[] keystorePass) {
		this.keystorePass = keystorePass;
	}
	
	
	
}
