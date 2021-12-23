package com.thoughtfocus.RunTimePolymorphism.rtp;

public class Refrence {
	static void ref(SmartTv smarttv) {
		smarttv.run();
	}
	static void ref(DommTv dommtv) {
		dommtv.run();
	}
}
