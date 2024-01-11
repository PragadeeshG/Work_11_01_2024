package com.test1;

public class PrivacyPolicy {
	private long procesingEntity;
	private String products;
	private String specifiedProcess;
	private String forexCards;
	private String paymentInstructions;
	private String remittanceServices;
	private String insuranceProducts;
	private String insuranceAdvisory;
	private String pointOfSaleServices;

	public PrivacyPolicy() {

	}

	public PrivacyPolicy(long procesingEntity, String products, String specifiedProcess, String forexCards,
			String paymentInstructions, String remittanceServices, String insuranceProducts, String insuranceAdvisory,
			String pointOfSaleServices) {
		super();
		this.procesingEntity = procesingEntity;
		this.products = products;
		this.specifiedProcess = specifiedProcess;
		this.forexCards = forexCards;
		this.paymentInstructions = paymentInstructions;
		this.remittanceServices = remittanceServices;
		this.insuranceProducts = insuranceProducts;
		this.insuranceAdvisory = insuranceAdvisory;
		this.pointOfSaleServices = pointOfSaleServices;
	}

	public long getProcesingEntity() {
		return procesingEntity;
	}

	public void setProcesingEntity(long procesingEntity) {
		this.procesingEntity = procesingEntity;
	}

	public String getProducts() {
		return products;
	}

	public void setProducts(String products) {
		this.products = products;
	}

	public String getSpecifiedProcess() {
		return specifiedProcess;
	}

	public void setSpecifiedProcess(String specifiedProcess) {
		this.specifiedProcess = specifiedProcess;
	}

	public String getForexCards() {
		return forexCards;
	}

	public void setForexCards(String forexCards) {
		this.forexCards = forexCards;
	}

	public String getPaymentInstructions() {
		return paymentInstructions;
	}

	public void setPaymentInstructions(String paymentInstructions) {
		this.paymentInstructions = paymentInstructions;
	}

	public String getRemittanceServices() {
		return remittanceServices;
	}

	public void setRemittanceServices(String remittanceServices) {
		this.remittanceServices = remittanceServices;
	}

	public String getInsuranceProducts() {
		return insuranceProducts;
	}

	public void setInsuranceProducts(String insuranceProducts) {
		this.insuranceProducts = insuranceProducts;
	}

	public String getInsuranceAdvisory() {
		return insuranceAdvisory;
	}

	public void setInsuranceAdvisory(String insuranceAdvisory) {
		this.insuranceAdvisory = insuranceAdvisory;
	}

	public String getPointOfSaleServices() {
		return pointOfSaleServices;
	}

	public void setPointOfSaleServices(String pointOfSaleServices) {
		this.pointOfSaleServices = pointOfSaleServices;
	}

}
