package com.diversityarrays.kdcompute.api;

import java.util.Date;

public class ExceptionMsg {
	Date timestamp;
	String clazz;
	String message;
	public ExceptionMsg(Date timestamp, String clazz, String message) {
		super();
		this.timestamp = timestamp;
		this.clazz = clazz;
		this.message = message;
	}
}
