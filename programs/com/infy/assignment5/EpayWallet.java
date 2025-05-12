package com.infy.assignment5;

public class EpayWallet {
	public static void processPaymentByUser(User user,double billAmount) {
		if(user.makePayment(billAmount)) {
			System.out.println("Congratulations "+user.getUsername()+", payment of "+billAmount+" was successful.");
			System.out.println("Your wallet Balance is "+user.getWalletBalance());
			if(user instanceof KYCUser) {
				System.out.println("You have "+((KYCUser) user).getRewardPoints()+" reward points");
			}
		}
		else {
			System.out.println("Sorry "+user.getUsername()+", not enough balance to make payment.");
			System.out.println("Your wallet Balance is "+user.getWalletBalance());
			if(user instanceof KYCUser) {
				System.out.println("You have "+((KYCUser) user).getRewardPoints()+" reward points");
			}
		}
	}
	public static void main(String[] args) {
		User u=new User(101,"Jack","jack@infy.com",1000);
		KYCUser u1=new KYCUser(201,"Jill","jill@infy.com",3000);
		processPaymentByUser(u,700);
		System.out.println("-----------------------------------");
		processPaymentByUser(u1,1500);
		System.out.println("-----------------------------------");
		processPaymentByUser(u1,800);
		System.out.println("-----------------------------------");
		processPaymentByUser(u1,1200);
	}
}
