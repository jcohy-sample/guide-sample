package com.jcohy.sample.java;

/**
 * Copyright: Copyright (c) 2023 <a href="https://www.jcohy.com" target="_blank">jcohy.com</a>
 * <p> Description:
 *
 * @author jiac
 * @version 2023.0.1 2023/10/12:10:23
 * @since 2023.0.1
 */
public class Human {

	public static void main(String[] args) {
		try {
			try {
				throw new Sneeze();
			}
			catch ( Annoyance a ) {
				System.out.println("Caught Annoyance");
				throw a;
			}
		}catch ( Sneeze s ) {
			System.out.println("Caught Sneeze");
			return ;
		}
		finally {
			System.out.println("Hello World!");
		}
	}
}
