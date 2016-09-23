package com.example.khoj2014;

import android.graphics.drawable.Drawable;

public class EventsItem {

	Drawable img_url;
	String topLine;
	String bottomLine;
	
	public void setUrl(Drawable param) {img_url = param;}
	public void setTopLine(String param) {topLine = param;}
	public void setBottomLine(String param) {bottomLine = param;}
	
	public EventsItem(Drawable url, String top, String bottom) {
		
		img_url = url;
		topLine = top;
		bottomLine = bottom;
		
	}
	
	public Drawable getUrl() { return img_url; }
	public String getTopLine() { return topLine; }
	public String getBottomLine() { return bottomLine; }
	
}
