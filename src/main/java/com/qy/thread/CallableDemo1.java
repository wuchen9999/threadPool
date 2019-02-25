package com.qy.thread;

import java.util.concurrent.Callable;

public class CallableDemo1 implements Callable<String> {

	public String call() throws Exception {
		// TODO Auto-generated method stub
		return "callable.call()";
	}

}
