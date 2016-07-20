package src.bean;

public class LoginBean {
//전성빈 작성
	private String USER_ID;
	private String USER_PS;
	private String USER_STATUS;
/*	private String USER_COUNT;*/
	//유저 수 파악해서 로그인 다음의 jsp 파일에서 우리아게 출력 하기 위함
	
	public String getUSER_ID() {
		return USER_ID;
	}
	/*public String getUSER_COUNT() {
		return USER_COUNT;
	}
	public void setUSER_COUNT(String uSER_COUNT) {
		USER_COUNT = uSER_COUNT;
	}*/
	public void setUSER_ID(String uSER_ID) {
		USER_ID = uSER_ID;
	}
	public String getUSER_PS() {
		return USER_PS;
	}
	public void setUSER_PS(String uSER_PS) {
		USER_PS = uSER_PS;
	}
	public String getUSER_STATUS() {
		return USER_STATUS;
	}
	public void setUSER_STATUS(String uSER_STATUS) {
		USER_STATUS = uSER_STATUS;
	}
	
	@Override
	public String toString() {
		return "LoginBean [USER_ID=" + USER_ID + ", USER_PS=" + USER_PS + ", USER_STATUS=" + USER_STATUS + "]";
	}
	
}
