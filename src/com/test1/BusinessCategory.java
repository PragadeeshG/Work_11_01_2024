package com.test1;

public class BusinessCategory {
	private long categoryCode;
	private String corpFinanceGroup;
	private String creditRiskGroup;
	private String financialarketGrp;
	private String lendingGrp;
	private String principalFinance;
	private String retailProducts;
	private String transactionBanking;
	private String wealthManagement;
	private String notesForConsumer;
	private String goldenSource;
	private String levelTwoConcept;
	private String currentOwnership;

	public BusinessCategory() {

	}

	public BusinessCategory(long categoryCode, String corpFinanceGroup, String creditRiskGroup,
			String financialarketGrp, String lendingGrp, String principalFinance, String retailProducts,
			String transactionBanking, String wealthManagement, String notesForConsumer, String goldenSource,
			String levelTwoConcept, String currentOwnership) {
		super();
		this.categoryCode = categoryCode;
		this.corpFinanceGroup = corpFinanceGroup;
		this.creditRiskGroup = creditRiskGroup;
		this.financialarketGrp = financialarketGrp;
		this.lendingGrp = lendingGrp;
		this.principalFinance = principalFinance;
		this.retailProducts = retailProducts;
		this.transactionBanking = transactionBanking;
		this.wealthManagement = wealthManagement;
		this.notesForConsumer = notesForConsumer;
		this.goldenSource = goldenSource;
		this.levelTwoConcept = levelTwoConcept;
		this.currentOwnership = currentOwnership;
	}

	public long getCategoryCode() {
		return categoryCode;
	}

	public void setCategoryCode(long categoryCode) {
		this.categoryCode = categoryCode;
	}

	public String getCorpFinanceGroup() {
		return corpFinanceGroup;
	}

	public void setCorpFinanceGroup(String corpFinanceGroup) {
		this.corpFinanceGroup = corpFinanceGroup;
	}

	public String getCreditRiskGroup() {
		return creditRiskGroup;
	}

	public void setCreditRiskGroup(String creditRiskGroup) {
		this.creditRiskGroup = creditRiskGroup;
	}

	public String getFinancialarketGrp() {
		return financialarketGrp;
	}

	public void setFinancialarketGrp(String financialarketGrp) {
		this.financialarketGrp = financialarketGrp;
	}

	public String getLendingGrp() {
		return lendingGrp;
	}

	public void setLendingGrp(String lendingGrp) {
		this.lendingGrp = lendingGrp;
	}

	public String getPrincipalFinance() {
		return principalFinance;
	}

	public void setPrincipalFinance(String principalFinance) {
		this.principalFinance = principalFinance;
	}

	public String getRetailProducts() {
		return retailProducts;
	}

	public void setRetailProducts(String retailProducts) {
		this.retailProducts = retailProducts;
	}

	public String getTransactionBanking() {
		return transactionBanking;
	}

	public void setTransactionBanking(String transactionBanking) {
		this.transactionBanking = transactionBanking;
	}

	public String getWealthManagement() {
		return wealthManagement;
	}

	public void setWealthManagement(String wealthManagement) {
		this.wealthManagement = wealthManagement;
	}

	public String getNotesForConsumer() {
		return notesForConsumer;
	}

	public void setNotesForConsumer(String notesForConsumer) {
		this.notesForConsumer = notesForConsumer;
	}

	public String getGoldenSource() {
		return goldenSource;
	}

	public void setGoldenSource(String goldenSource) {
		this.goldenSource = goldenSource;
	}

	public String getLevelTwoConcept() {
		return levelTwoConcept;
	}

	public void setLevelTwoConcept(String levelTwoConcept) {
		this.levelTwoConcept = levelTwoConcept;
	}

	public String getCurrentOwnership() {
		return currentOwnership;
	}

	public void setCurrentOwnership(String currentOwnership) {
		this.currentOwnership = currentOwnership;
	}

}
