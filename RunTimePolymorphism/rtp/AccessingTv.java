package com.thoughtfocus.RunTimePolymorphism.rtp;

public class AccessingTv {

	public static void main(String[] args) {
		SmartTv smarttv=new SmartTv();
		DommTv dommtv=new DommTv();
		Refrence.ref(dommtv);
		Refrence.ref(smarttv);

	}

}
