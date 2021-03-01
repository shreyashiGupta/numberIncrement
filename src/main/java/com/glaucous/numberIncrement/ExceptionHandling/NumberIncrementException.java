package com.glaucous.numberIncrement.ExceptionHandling;

import java.time.Instant;

public class NumberIncrementException  {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	private Instant date;
	private String messageDetail;
	private String errorCode;
	
	public NumberIncrementException(Instant date, String messageDetail, String errorCode) {
		super();
		this.date = date;
		this.messageDetail = messageDetail;
		this.errorCode = errorCode;
	}
	
	public Instant getDate() {
		return date;
	}
	public void setDate(Instant date) {
		this.date = date;
	}
	public String getMessageDetail() {
		return messageDetail;
	}
	public void setMessageDetail(String messageDetail) {
		this.messageDetail = messageDetail;
	}
	public String getErrorCode() {
		return errorCode;
	}
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	
	
	
}
