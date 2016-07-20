package src.bean;

public class ReadyListBean {
	
	String USER_NUMBER; //承認処理順番待ちリストのユーザーの固有番号
	String USER_NAME;	//承認処理順番待ちリストのユーザーの氏名
	String USER_ADDRESS;//承認処理順番待ちリストのユーザーの住所
	String USER_PHONE;	//承認処理順番待ちリストのユーザーの電話番号
	String LOCAL_NUMBER;//承認処理順番待ちリストのユーザーの地域区別
	String USER_STATUS;	//承認処理順番待ちリストのユーザーの状態情報（0：加入、１：退会）
	
	public String getUSER_NUMBER() {						//承認処理順番待ちリストのユーザーの固有番号取得
		return USER_NUMBER;
	}
	public void setUSER_NUMBER(String uSER_NUMBER) {		//承認処理順番待ちリストのユーザーの固有番号指定
		USER_NUMBER = uSER_NUMBER;
	}
	
	public String getUSER_NAME() {							//承認処理順番待ちリストのユーザーの氏名取得
		return USER_NAME;
	}
	public void setUSER_NAME(String uSER_NAME){				//承認処理順番待ちリストのユーザーの氏名指定
		USER_NAME = uSER_NAME;
	}
	
	public String getUSER_ADDRESS(){						//承認処理順番待ちリストのユーザーの住所取得
		return USER_ADDRESS;
	}
	public void setUSER_ADDRESS(String uSER_ADDRESS) {		//承認処理順番待ちリストのユーザーの氏名指定
		USER_ADDRESS = uSER_ADDRESS;
	}

	public String getUSER_PHONE() {							//承認処理順番待ちリストのユーザーの電話番号取得
		return USER_PHONE;
	}
	public void setUSER_PHONE(String uSER_PHONE) {			//承認処理順番待ちリストのユーザーの電話番号指定
		USER_PHONE = uSER_PHONE;
	}
	
	public String getLOCAL_NUMBER() {						//承認処理順番待ちリストのユーザーの地域区別情報取得
		return LOCAL_NUMBER;
	}
	public void setLOCAL_NUMBER(String lOCAL_NUMBER) {		//承認処理順番待ちリストのユーザーの地域区別情報指定
		LOCAL_NUMBER = lOCAL_NUMBER;
	}
		
	public String getUSER_STATUS() {						//承認処理順番待ちリストのユーザーの状態情報（0：加入、１：退会）取得
		return USER_STATUS;
	}
	public void setUSER_STATUS(String uSER_STATUS) {		//承認処理順番待ちリストのユーザーの状態情報（0：加入、１：退会）指定
		USER_STATUS = uSER_STATUS;
	}
	
	
	@Override
	public String toString() {								//データ情報確認向けの出力するメソッド
		return "ReadyListBean [USER_NAME=" + USER_NAME + ", USER_ADDRESS=" + USER_ADDRESS + ", USER_PHONE=" + USER_PHONE
				+ "]";
	}	
}
