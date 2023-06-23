package com.javatpoint.bean;

public class ProjectsAndSparesBean {
	
	
//	private String projects ;
//	private Integer sitesCount;
//	private Integer quantity ;
//	 
//	private Integer CostlyQuantity;
//	private Integer NonCostlyQuantity;
//	private Integer BothNoncostlyCostlyQuantity;
	
	private String status;
	private int Quantity;
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getQuantity() {
		return Quantity;
	}
	public void setQuantity(int quantity) {
		Quantity = quantity;
	}
	public ProjectsAndSparesBean(String status, int quantity) {
		super();
		this.status = status;
		Quantity = quantity;
	}
	
	
	
	
	
	
	
//	
//	public ProjectsAndSparesBean(String projects, Integer sitesCount, Integer quantity) {
//		super();
//		this.projects = projects;
//		this.sitesCount = sitesCount;
//		this.quantity = quantity;
//	}
//	public String getProjects() {
//		return projects;
//	}
//	public void setProjects(String projects) {
//		this.projects = projects;
//	}
//	public Integer getSitesCount() {
//		return sitesCount;
//	}
//	public void setSitesCount(Integer sitesCount) {
//		this.sitesCount = sitesCount;
//	}
//	public Integer getQuantity() {
//		return quantity;
//	}
//	public void setQuantity(Integer quantity) {
//		this.quantity = quantity;
//	}
//	
//	public Integer getCostlyQuantity() {
//		return CostlyQuantity;
//	}
//	
//	public void setCostlyQuantity(Integer costlyQuantity) {
//		CostlyQuantity = costlyQuantity;
//	}
//	public Integer getNonCostlyQuantity() {
//		return NonCostlyQuantity;
//	}
//	public void setNonCostlyQuantity(Integer nonCostlyQuantity) {
//		NonCostlyQuantity = nonCostlyQuantity;
//	}
//	public Integer getBothNoncostlyCostlyQuantity() {
//		return BothNoncostlyCostlyQuantity;
//	}
//	public void setBothNoncostlyCostlyQuantity(Integer bothNoncostlyCostlyQuantity) {
//		BothNoncostlyCostlyQuantity = bothNoncostlyCostlyQuantity;
//	}
//	public ProjectsAndSparesBean(String projects, Integer costlyQuantity, Integer nonCostlyQuantity,
//			Integer bothNoncostlyCostlyQuantity) {
//		super();
//		this.projects = projects;
//		CostlyQuantity = costlyQuantity;
//		NonCostlyQuantity = nonCostlyQuantity;
//		BothNoncostlyCostlyQuantity = bothNoncostlyCostlyQuantity;
//	}
//	
//	
	
	
//
//	private String ARYA;
//	private String BOB;
//	private String BOM;
//	private String CBI;
//	private String ICICI;
//	private String IDFC;
//	private String IIFL;
//	private String JFS;
//	
//	private String KalpataruSSLL ;
//	private String KBL;
//	private String NBHC;
//	private String NCRBOB;
//	private String OBC;
//	private String SBIAmaravati;
//	private String SBIBhubaneswar;
//	private String SBICHE;
//	private String SBIFIS;
//	private String SBIHYD;
//	private String SBIKolkata;
//	private String SBILucknow;
//	private String UBI;
//	private String SBEPokhran ;
//	public String getARYA() {
//		return ARYA;
//	}
//	public void setARYA(String aRYA) {
//		ARYA = aRYA;
//	}
//	public String getBOB() {
//		return BOB;
//	}
//	public void setBOB(String bOB) {
//		BOB = bOB;
//	}
//	public String getBOM() {
//		return BOM;
//	}
//	public void setBOM(String bOM) {
//		BOM = bOM;
//	}
//	public String getCBI() {
//		return CBI;
//	}
//	public void setCBI(String cBI) {
//		CBI = cBI;
//	}
//	public String getICICI() {
//		return ICICI;
//	}
//	public void setICICI(String iCICI) {
//		ICICI = iCICI;
//	}
//	public String getIDFC() {
//		return IDFC;
//	}
//	public void setIDFC(String iDFC) {
//		IDFC = iDFC;
//	}
//	public String getIIFL() {
//		return IIFL;
//	}
//	public void setIIFL(String iIFL) {
//		IIFL = iIFL;
//	}
//	public String getJFS() {
//		return JFS;
//	}
//	public void setJFS(String jFS) {
//		JFS = jFS;
//	}
//	public String getKalpataruSSLL() {
//		return KalpataruSSLL;
//	}
//	public void setKalpataruSSLL(String kalpataruSSLL) {
//		KalpataruSSLL = kalpataruSSLL;
//	}
//	public String getKBL() {
//		return KBL;
//	}
//	public void setKBL(String kBL) {
//		KBL = kBL;
//	}
//	public String getNBHC() {
//		return NBHC;
//	}
//	public void setNBHC(String nBHC) {
//		NBHC = nBHC;
//	}
//	public String getNCRBOB() {
//		return NCRBOB;
//	}
//	public void setNCRBOB(String nCRBOB) {
//		NCRBOB = nCRBOB;
//	}
//	public String getOBC() {
//		return OBC;
//	}
//	public void setOBC(String oBC) {
//		OBC = oBC;
//	}
//	public String getSBIAmaravati() {
//		return SBIAmaravati;
//	}
//	public void setSBIAmaravati(String sBIAmaravati) {
//		SBIAmaravati = sBIAmaravati;
//	}
//	public String getSBIBhubaneswar() {
//		return SBIBhubaneswar;
//	}
//	public void setSBIBhubaneswar(String sBIBhubaneswar) {
//		SBIBhubaneswar = sBIBhubaneswar;
//	}
//	public String getSBICHE() {
//		return SBICHE;
//	}
//	public void setSBICHE(String sBICHE) {
//		SBICHE = sBICHE;
//	}
//	public String getSBIFIS() {
//		return SBIFIS;
//	}
//	public void setSBIFIS(String sBIFIS) {
//		SBIFIS = sBIFIS;
//	}
//	public String getSBIHYD() {
//		return SBIHYD;
//	}
//	public void setSBIHYD(String sBIHYD) {
//		SBIHYD = sBIHYD;
//	}
//	public String getSBIKolkata() {
//		return SBIKolkata;
//	}
//	public void setSBIKolkata(String sBIKolkata) {
//		SBIKolkata = sBIKolkata;
//	}
//	public String getSBILucknow() {
//		return SBILucknow;
//	}
//	public void setSBILucknow(String sBILucknow) {
//		SBILucknow = sBILucknow;
//	}
//	public String getUBI() {
//		return UBI;
//	}
//	public void setUBI(String uBI) {
//		UBI = uBI;
//	}
//	public String getSBEPokhran() {
//		return SBEPokhran;
//	}
//	public void setSBEPokhran(String sBEPokhran) {
//		SBEPokhran = sBEPokhran;
//	}
//	
//	
//	
	
	
	
	
	
	
}
