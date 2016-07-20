package src.login;

import src.common.ActionVO;

public class LoginVO extends ActionVO{

	private String id;									//table culumn name
	private String pwd;
	private String ErrorMessage;
														//Getter　Setter
	public String getErrorMessage() {
		return ErrorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		ErrorMessage = errorMessage;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
}