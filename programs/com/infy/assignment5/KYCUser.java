package com.infy.assignment5;

public class KYCUser extends User {

	private int rewardPoints;
	public KYCUser(int id, String username, String email, double walletBalance) {
		super(id, username, email, walletBalance);
	}
	public int getRewardPoints() {
		return rewardPoints;
	}
	public void setRewardPoints(int rewardPoints) {
		this.rewardPoints = rewardPoints;
	}
	@Override
	public boolean makePayment(double billAmount) {
		if(super.makePayment(billAmount)) {
			this.rewardPoints+=(int)(billAmount*0.10f);
			return true;
		}
		return false;
	}
}
