package in.co.rays.project_3.exception;


/**
 * @author Jayati Chouhan
 */
public class DuplicateRecordException extends Exception{

	private static final long serialVersionUID = 1L;

	public DuplicateRecordException(String msg){
		super(msg);
	}
}
