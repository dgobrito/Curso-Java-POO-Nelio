package model.exceptions;

// Exception = compilador obriga a tratar ou propagar
// RuntimeException = Compilador não obriga

public class DomainException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	public DomainException(String msg) {
		super(msg);
	}

}
