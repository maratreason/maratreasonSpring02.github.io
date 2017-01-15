package com.maratreason.prospring.ch2;

public class HelloWorldDecoupleWithFactory {

	public static void main(String[] args) {

		MessageRenderer mr = MessageSupportFactory.getInstance().getMessageRenderer();
		MessageProvider mp = MessageSupportFactory.getInstance().getMessageProvider();
		mr.setMessageProvider(mp);
		mr.render();
		
	}

}
