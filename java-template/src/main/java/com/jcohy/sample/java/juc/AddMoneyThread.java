package com.jcohy.sample.java.juc;

/**
 * 描述: .
 * <p>
 * Copyright © 2023 <a href="https://www.jcohy.com" target= "_blank">https://www.jcohy.com</a>
 *
 * @author jiac
 * @version 1.0.0 2023/2/24 10:54
 * @since 1.0.0
 */
public class AddMoneyThread implements Runnable {
	private Account account; // 存入账户

	private double money; // 存入金额

	public AddMoneyThread(Account account, double money) {
		this.account = account;
		this.money = money;
	}

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + "do");
		account.deposit(money);
	}
}
