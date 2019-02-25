package com.qy.thread;

import java.util.concurrent.Callable;
//并行是指在同一时刻，有多条指令在多个处理器上同时执行
//并发指在同一时刻只能有一条指令执行，但多个进程指令被快速轮换执行，使得宏观上具有多个进程同时执行的效果。
public class CallableDemo1 implements Callable<String> {

	public String call() throws Exception {
		// TODO Auto-generated method stub
		return "callable.call()";
	}

}
