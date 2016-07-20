package src.bean;

public class UserBean {
	
	String USER_NUMBER;
	String USER_NAME;
	String USER_ADDRESS;
	String USER_PHONE;
	String LOCAL_NUMBER;
	
	public String getUSER_NUMBER() {
		return USER_NUMBER;
	}
	public void setUSER_NUMBER(String uSER_NUMBER) {
		USER_NUMBER = uSER_NUMBER;
	}
	public String getUSER_NAME() {
		return USER_NAME;
	}
	public void setUSER_NAME(String uSER_NAME) {
		USER_NAME = uSER_NAME;
	}
	public String getUSER_ADDRESS() {
		return USER_ADDRESS;
	}
	public void setUSER_ADDRESS(String uSER_ADDRESS) {
		USER_ADDRESS = uSER_ADDRESS;
	}
	public String getUSER_PHONE() {
		return USER_PHONE;
	}
	public void setUSER_PHONE(String uSER_PHONE) {
		USER_PHONE = uSER_PHONE;
	}
	public String getLOCAL_NUMBER() {
		return LOCAL_NUMBER;
	}
	public void setLOCAL_NUMBER(String lOCAL_NUMBER) {
		LOCAL_NUMBER = lOCAL_NUMBER;
	}
	
	@Override
	public String toString() {
		return "UserBean [USER_NUMBER=" + USER_NUMBER + ", USER_NAME=" + USER_NAME + ", USER_ADDRESS=" + USER_ADDRESS
				+ ", USER_PHONE=" + USER_PHONE + ", LOCAL_NUMBER=" + LOCAL_NUMBER + "]";
	}
	
	
	
}
