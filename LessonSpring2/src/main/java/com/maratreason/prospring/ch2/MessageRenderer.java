package com.maratreason.prospring.ch2;

public interface MessageRenderer {

	public void render();
	public void setMessageProvider(MessageProvider provider);
	public MessageProvider getMessageProvider();
	
}
