package com.jcohy.sample.java;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Properties;
import java.util.Queue;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;

import com.jcohy.sample.java.juc.Account;

/**
 * 描述: .
 *
 * <p>
 * Copyright © 2023 <a href="https://www.jcohy.com" target= "_blank">https://www.jcohy.com</a>
 *
 * @author jiac
 * @version 1.0.0 2023/2/23 15:45
 * @since 1.0.0
 */
public class Test {
    public static void main(String[] args) throws Exception {
		ConcurrentHashMap
        new Test().setA();
    }
    synchronized void setA() throws Exception{
        System.out.println("A");
        Thread.sleep(1000);
        setB();
    }

     void setB() throws Exception{
         synchronized(Account.class) {
             System.out.println("B");
             Thread.sleep(1000);
         }

    }
}
