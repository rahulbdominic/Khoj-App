package com.example.khoj2014;

public class DrawerClass {

	String title;
	String font_awesome;
	
	public DrawerClass(String string, String text) {
		// TODO Auto-generated constructor stub
		title = string;
		font_awesome = text;
	}
	public void setTitle(String param) {title = param;}
	public void setFontAwesome(String param) {font_awesome = param;}
	
	public String getTitle() { return title; }
	public String getFontAwesome() { return font_awesome; }
	
}
