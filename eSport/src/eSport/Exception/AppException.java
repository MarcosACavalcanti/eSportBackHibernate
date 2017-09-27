package eSport.Exception;

import javax.ejb.ApplicationException;

@ApplicationException(rollback = false)
public class AppException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}