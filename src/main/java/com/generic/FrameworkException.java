package com.generic;

public class FrameworkException extends RuntimeException{
	
	public String errorName;
	
	public FrameworkException(String errorDescription) {
		super(errorDescription);
	}

	public FrameworkException(String errorName, String errorDescription) {
		super(errorDescription);
		this.errorName = errorName;
	}
}
