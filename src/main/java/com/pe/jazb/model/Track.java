package com.pe.jazb.model;

import java.io.Serializable;

public class Track implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private String title;
	private String single; 
	
	public String getSingle() {
		return single;
	}
	
	public void setSingle(String single) {
		this.single = single;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public Track() {
		
	}

	public Track(String title, String single) {
		this.title = title;
		this.single = single;
	}
	
	@Override
	public String toString() {
		return "Track [title=" + title + ", single=" + single + "]";
	}
	
}
