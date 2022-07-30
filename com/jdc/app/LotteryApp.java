package com.jdc.app;

import com.jdc.app.run.Lottery;
import com.jdc.app.util.AppUtil;

public class LotteryApp {
	
	public static void main(String[] args) {
		
		Lottery lot = new Lottery();
		lot.run();

		AppUtil.sc.close();
	}

}