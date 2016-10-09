package ie.lyit.bank;

public class Current {
	private Date date;
	private Name name;
	private double balance;
	private String address; 
	final private int accountNo =+9000;
	private int overdraft;
	
	
	
	public Current(Date date, Name name, double balance, String address) {
		super();
		this.date = date;
		this.name = name;
		this.balance = balance;
		this.address = address;
	}


	/**
	 * @return the date
	 */
	public Date getDate() {
		return date;
	}


	/**
	 * @param date the date to set
	 */
	public void setDate(Date date) {
		this.date = date;
	}


	/**
	 * @return the name
	 */
	public Name getName() {
		return name;
	}


	/**
	 * @param name the name to set
	 */
	public void setName(Name name) {
		this.name = name;
	}


	/**
	 * @return the balance
	 */
	public double getBalance() {
		return balance;
	}


	/**
	 * @param balance the balance to set
	 */
	public void setBalance(double balance) {
		this.balance = balance;
	}


	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}


	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}


	/**
	 * @return the accountNo
	 */
	public int getAccountNo() {
		return accountNo;
	}


	/**
	 * @return the overdraft
	 */
	public int getOverdraft() {
		return overdraft;
	}


	/**
	 * @param overdraft the overdraft to set
	 */
	public void setOverdraft(int overdraft) {
		this.overdraft = overdraft;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Current [date=" + date + ", name=" + name + ", balance=" + balance + ", address=" + address
				+ ", accountNo=" + accountNo + "]";
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Current other = (Current) obj;
		if (accountNo != other.accountNo)
			return false;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (Double.doubleToLongBits(balance) != Double.doubleToLongBits(other.balance))
			return false;
		if (date == null) {
			if (other.date != null)
				return false;
		} else if (!date.equals(other.date))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
	

}
