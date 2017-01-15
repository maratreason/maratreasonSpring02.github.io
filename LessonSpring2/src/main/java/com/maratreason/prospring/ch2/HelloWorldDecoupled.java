package com.maratreason.prospring.ch2;

public class HelloWorldDecoupled {

	public static void main(String[] args) {

		MessageRenderer mr = new StandardOutMessageRenderer();
		MessageProvider mp = new HelloWOrldMessageProvider();
		mr.setMessageProvider(mp);
		mr.render();
		
	}

}
