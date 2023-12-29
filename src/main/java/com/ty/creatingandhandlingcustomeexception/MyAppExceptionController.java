package com.ty.creatingandhandlingcustomeexception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/*
 * package com.ty.creatingandhandlingcustomeexception;
 * 
 * import org.springframework.http.HttpStatus; import
 * org.springframework.http.ResponseEntity; import
 * org.springframework.web.bind.annotation.ControllerAdvice; import
 * org.springframework.web.bind.annotation.ExceptionHandler; import
 * org.springframework.web.servlet.mvc.method.annotation.
 * ResponseEntityExceptionHandler;
 * 
 * @ControllerAdvice public class MyAppExceptionController extends
 * ResponseEntityExceptionHandler {
 * 
 * @ExceptionHandler(NullPointerException.class)
 * 
 * public ResponseEntity<ResponseStucture<String>>
 * handleNullPointerException(NullPointerException nullPointerException) {
 * ResponseStucture<String> responseStucture = new ResponseStucture<String>();
 * responseStucture.setStatusCode(HttpStatus.BAD_REQUEST.value());
 * responseStucture.setMessage("message: "+nullPointerException.getMessage());
 * responseStucture.setData("Don't Deal With Null"); return new
 * ResponseEntity<ResponseStucture<String>>(responseStucture,HttpStatus.
 * BAD_REQUEST); }
 * 
 * 
 * 
 * }
 */
@ControllerAdvice
public class MyAppExceptionController{
	
	@ExceptionHandler(NullPointerException.class)
	public ResponseEntity<ResponseStucture<String>> handleNullPointer(NullPointerException exception)
	{
	
		ResponseStucture<String> resp= new ResponseStucture<String>();
		resp.setMessage(exception.getMessage());
		resp.setStatusCode(HttpStatus.BAD_REQUEST.value());
		resp.setData("Don't deal With Null");
		
		
		return new ResponseEntity<ResponseStucture<String>>(resp,HttpStatus.BAD_REQUEST);
		
		
	}
	
}