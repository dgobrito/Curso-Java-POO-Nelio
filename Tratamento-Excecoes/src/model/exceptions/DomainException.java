package model.exceptions;

// Exception = Obriga a tratar
// RuntimeException = Compilador n�o obriga a tratar

public class DomainException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	public DomainException(String msg) {
		super(msg);
	}

}
