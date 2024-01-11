package com.test1;

public class StockPortfolio {
	private String sotcKId;
	private String buySell;
	private String buyPrice;
	private String sellPrice;
	private Integer limit;
	private Integer quantity;
	private String glCurrency;
	private String glBizUnit;
	private String gruCode;
	private String remarks;

	public StockPortfolio() {

	}

	public StockPortfolio(String sotcKId, String buySell, String buyPrice, String sellPrice, Integer limit,
			Integer quantity, String glCurrency, String glBizUnit, String gruCode, String remarks) {
		super();
		this.sotcKId = sotcKId;
		this.buySell = buySell;
		this.buyPrice = buyPrice;
		this.sellPrice = sellPrice;
		this.limit = limit;
		this.quantity = quantity;
		this.glCurrency = glCurrency;
		this.glBizUnit = glBizUnit;
		this.gruCode = gruCode;
		this.remarks = remarks;
	}

	public String getSotcKId() {
		return sotcKId;
	}

	public void setSotcKId(String sotcKId) {
		this.sotcKId = sotcKId;
	}

	public String getBuySell() {
		return buySell;
	}

	public void setBuySell(String buySell) {
		this.buySell = buySell;
	}

	public String getBuyPrice() {
		return buyPrice;
	}

	public void setBuyPrice(String buyPrice) {
		this.buyPrice = buyPrice;
	}

	public String getSellPrice() {
		return sellPrice;
	}

	public void setSellPrice(String sellPrice) {
		this.sellPrice = sellPrice;
	}

	public Integer getLimit() {
		return limit;
	}

	public void setLimit(Integer limit) {
		this.limit = limit;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public String getGlCurrency() {
		return glCurrency;
	}

	public void setGlCurrency(String glCurrency) {
		this.glCurrency = glCurrency;
	}

	public String getGlBizUnit() {
		return glBizUnit;
	}

	public void setGlBizUnit(String glBizUnit) {
		this.glBizUnit = glBizUnit;
	}

	public String getGruCode() {
		return gruCode;
	}

	public void setGruCode(String gruCode) {
		this.gruCode = gruCode;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

}
