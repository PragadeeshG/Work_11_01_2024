package com.test1;

public class CfConsolidation {
	private long consolidatedAcc;
	private String unConsAcc;
	private String additionalCons;
	private String opinion;
	private String compliance;
	private String nonCompliance;
	private String coveredPerson;
	private String applicability;
	private String derivation;

	public CfConsolidation() {

	}

	public CfConsolidation(long consolidatedAcc, String unConsAcc, String additionalCons, String opinion,
			String compliance, String nonCompliance, String coveredPerson, String applicability, String derivation) {
		super();
		this.consolidatedAcc = consolidatedAcc;
		this.unConsAcc = unConsAcc;
		this.additionalCons = additionalCons;
		this.opinion = opinion;
		this.compliance = compliance;
		this.nonCompliance = nonCompliance;
		this.coveredPerson = coveredPerson;
		this.applicability = applicability;
		this.derivation = derivation;
	}

	public long getConsolidatedAcc() {
		return consolidatedAcc;
	}

	public void setConsolidatedAcc(long consolidatedAcc) {
		this.consolidatedAcc = consolidatedAcc;
	}

	public String getUnConsAcc() {
		return unConsAcc;
	}

	public void setUnConsAcc(String unConsAcc) {
		this.unConsAcc = unConsAcc;
	}

	public String getAdditionalCons() {
		return additionalCons;
	}

	public void setAdditionalCons(String additionalCons) {
		this.additionalCons = additionalCons;
	}

	public String getOpinion() {
		return opinion;
	}

	public void setOpinion(String opinion) {
		this.opinion = opinion;
	}

	public String getCompliance() {
		return compliance;
	}

	public void setCompliance(String compliance) {
		this.compliance = compliance;
	}

	public String getNonCompliance() {
		return nonCompliance;
	}

	public void setNonCompliance(String nonCompliance) {
		this.nonCompliance = nonCompliance;
	}

	public String getCoveredPerson() {
		return coveredPerson;
	}

	public void setCoveredPerson(String coveredPerson) {
		this.coveredPerson = coveredPerson;
	}

	public String getApplicability() {
		return applicability;
	}

	public void setApplicability(String applicability) {
		this.applicability = applicability;
	}

	public String getDerivation() {
		return derivation;
	}

	public void setDerivation(String derivation) {
		this.derivation = derivation;
	}

}
