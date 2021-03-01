package com.glaucous.numberIncrement.ExceptionHandling;

public class DatabaseException extends RuntimeException{

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;
	
	public DatabaseException(String message)
	{
		super(message);
	}
	

}
