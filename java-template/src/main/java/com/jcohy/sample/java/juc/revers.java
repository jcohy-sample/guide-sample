package com.jcohy.sample.java.juc;

/**
 * Copyright: Copyright (c) 2023 <a href="https://www.jcohy.com" target="_blank">jcohy.com</a>
 * <p> Description:
 *
 * @author jiac
 * @version 2023.0.1 2023/10/9:18:35
 * @since 2023.0.1
 */
public class revers {
	public static void main(String[] args) {
		System.out.println(reverse("Hello world"));

	}

	public static String reverse(String originStr) {
		if (originStr == null || originStr.length() <= 1)
			return originStr;
		return reverse(originStr.substring(1)) + originStr.charAt(0);
	}
}
