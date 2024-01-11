package com.test1;

public class StockPortfolioTrade {
	private long buyOrder;
	private String sellerName;
	private String buyerContact;
	private boolean buyerMarket;
	private boolean sellerMarket;
	private String sellOrder;
	private String holdings;
	private String quantity;
	private String surgeDate;
	private String closingRemarks;
	private String brokerName;

	public StockPortfolioTrade() {

	}

	public StockPortfolioTrade(long buyOrder, String sellerName, String buyerContact, boolean buyerMarket,
			boolean sellerMarket, String sellOrder, String holdings, String quantity, String surgeDate,
			String closingRemarks, String brokerName) {
		super();
		this.buyOrder = buyOrder;
		this.sellerName = sellerName;
		this.buyerContact = buyerContact;
		this.buyerMarket = buyerMarket;
		this.sellerMarket = sellerMarket;
		this.sellOrder = sellOrder;
		this.holdings = holdings;
		this.quantity = quantity;
		this.surgeDate = surgeDate;
		this.closingRemarks = closingRemarks;
		this.brokerName = brokerName;
	}

	public long getBuyOrder() {
		return buyOrder;
	}

	public void setBuyOrder(long buyOrder) {
		this.buyOrder = buyOrder;
	}

	public String getSellerName() {
		return sellerName;
	}

	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}

	public String getBuyerContact() {
		return buyerContact;
	}

	public void setBuyerContact(String buyerContact) {
		this.buyerContact = buyerContact;
	}

	public boolean isBuyerMarket() {
		return buyerMarket;
	}

	public void setBuyerMarket(boolean buyerMarket) {
		this.buyerMarket = buyerMarket;
	}

	public boolean isSellerMarket() {
		return sellerMarket;
	}

	public void setSellerMarket(boolean sellerMarket) {
		this.sellerMarket = sellerMarket;
	}

	public String getSellOrder() {
		return sellOrder;
	}

	public void setSellOrder(String sellOrder) {
		this.sellOrder = sellOrder;
	}

	public String getHoldings() {
		return holdings;
	}

	public void setHoldings(String holdings) {
		this.holdings = holdings;
	}

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	public String getSurgeDate() {
		return surgeDate;
	}

	public void setSurgeDate(String surgeDate) {
		this.surgeDate = surgeDate;
	}

	public String getClosingRemarks() {
		return closingRemarks;
	}

	public void setClosingRemarks(String closingRemarks) {
		this.closingRemarks = closingRemarks;
	}

	public String getBrokerName() {
		return brokerName;
	}

	public void setBrokerName(String brokerName) {
		this.brokerName = brokerName;
	}

}
