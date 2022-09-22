package com.naveen.exceptionhandling;

public class ResourceNotFoundException extends Exception {

	private static final long serialVersionUID = -9079454849611061074L;
	
//	SerialVersionUID is a unique identifier for each class, JVM uses it to compare the versions of the class ensuring that the same class
//	was used during
//	Serialization is loaded during Deserialization. Specifying one gives more control, though JVM does generate one if you don't specify.
	
	public ResourceNotFoundException() {
		super();
	}

	public ResourceNotFoundException(final String message) {
		super(message);
	}

}
