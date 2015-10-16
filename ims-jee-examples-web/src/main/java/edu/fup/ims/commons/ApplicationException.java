package edu.fup.ims.commons;

public class ApplicationException extends Exception {

	private static final long serialVersionUID = -4790193148508376254L;
	
	public ApplicationException(){
		super();
	}
	
	public ApplicationException(String message){
		super(message);
	}
	
}
