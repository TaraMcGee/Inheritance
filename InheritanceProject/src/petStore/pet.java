package petStore;

public class pet {

	private  int petID;
	private String name ;
	private  String ownerFName;
	private  String ownerlName;
	private  String eircode;
	private  String dob;
	private boolean licenceReq;
	private double sellingPrice;
	private double purchasePrice;
	
	/**
	 * 
	 */
	public pet() {
		super();
	}

	/**
	 * @param petID
	 * @param name
	 * @param ownerFName
	 * @param ownerlName
	 * @param eircode
	 * @param dob
	 * @param licenceReq
	 * @param sellingPrice
	 * @param purchasePrice
	 */
	public pet(int petID, String name, String ownerFName, String ownerlName, String eircode, String dob,
			boolean licenceReq, double sellingPrice, double purchasePrice) {
		super();
		this.petID = petID;
		this.name = name;
		this.ownerFName = ownerFName;
		this.ownerlName = ownerlName;
		this.eircode = eircode;
		this.dob = dob;
		this.licenceReq = licenceReq;
		this.sellingPrice = sellingPrice;
		this.purchasePrice = purchasePrice;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dob == null) ? 0 : dob.hashCode());
		result = prime * result + ((eircode == null) ? 0 : eircode.hashCode());
		result = prime * result + (licenceReq ? 1231 : 1237);
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((ownerFName == null) ? 0 : ownerFName.hashCode());
		result = prime * result + ((ownerlName == null) ? 0 : ownerlName.hashCode());
		result = prime * result + petID;
		long temp;
		temp = Double.doubleToLongBits(purchasePrice);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(sellingPrice);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		pet other = (pet) obj;
		if (dob == null) {
			if (other.dob != null)
				return false;
		} else if (!dob.equals(other.dob))
			return false;
		if (eircode == null) {
			if (other.eircode != null)
				return false;
		} else if (!eircode.equals(other.eircode))
			return false;
		if (licenceReq != other.licenceReq)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (ownerFName == null) {
			if (other.ownerFName != null)
				return false;
		} else if (!ownerFName.equals(other.ownerFName))
			return false;
		if (ownerlName == null) {
			if (other.ownerlName != null)
				return false;
		} else if (!ownerlName.equals(other.ownerlName))
			return false;
		if (petID != other.petID)
			return false;
		if (Double.doubleToLongBits(purchasePrice) != Double.doubleToLongBits(other.purchasePrice))
			return false;
		if (Double.doubleToLongBits(sellingPrice) != Double.doubleToLongBits(other.sellingPrice))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "pet [petID=" + petID + ", name=" + name + ", ownerFName=" + ownerFName + ", ownerlName=" + ownerlName
				+ ", eircode=" + eircode + ", dob=" + dob + ", licenceReq=" + licenceReq + ", sellingPrice="
				+ sellingPrice + ", purchasePrice=" + purchasePrice + "]";
	}

	public int getPetID() {
		return petID;
	}

	public void setPetID(int petID) {
		this.petID = petID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOwnerFName() {
		return ownerFName;
	}

	public void setOwnerFName(String ownerFName) {
		this.ownerFName = ownerFName;
	}

	public String getOwnerlName() {
		return ownerlName;
	}

	public void setOwnerlName(String ownerlName) {
		this.ownerlName = ownerlName;
	}

	public String getEircode() {
		return eircode;
	}

	public void setEircode(String eircode) {
		this.eircode = eircode;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public boolean isLicenceReq() {
		return licenceReq;
	}

	public void setLicenceReq(boolean licenceReq) {
		this.licenceReq = licenceReq;
	}

	public double getSellingPrice() {
		return sellingPrice;
	}

	public void setSellingPrice(double sellingPrice) {
		this.sellingPrice = sellingPrice;
	}

	public double getPurchasePrice() {
		return purchasePrice;
	}

	public void setPurchasePrice(double purchasePrice) {
		this.purchasePrice = purchasePrice;
	}

	/**
	 * @param petID
	 * @param name
	 * @param dob
	 * @param licenceReq
	 * @param purchasePrice
	 */
	public pet(int petID, String name, String dob, boolean licenceReq, double purchasePrice) {
		super();
		this.petID = petID;
		this.name = name;
		this.dob = dob;
		this.licenceReq = licenceReq;
		this.purchasePrice = purchasePrice;
	}
	
	
	protected String feedingInstructions()
	{
		return "Feed me Seymour";
		
	}
}
