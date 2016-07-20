package src.login;

import org.apache.log4j.Logger;
import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;

public class LoginAction implements Action,Preparable,ModelDriven<LoginVO>{
		
	/**
	 * 全晟斌
	 * ログイン処理
	 */
	static Logger logger = Logger.getLogger(LoginVO.class);
	
	private LoginVO loginVo;
	private LoginDAO loginDao;
	private String result;
	
	@Override
	public String execute() throws Exception {
		
		loginDao = new LoginDAO();
		//logindao object 作る
		
		result = loginDao.doDAO(loginVo);
		//LogicのStart
		
		return result;
		/*//成功した場合（出張所管理者）
		//成功した場合（管理者）
		//情報を見つかり無かった場合
		DAOで処理
		*/
	}

	public LoginVO getModel() {
		return loginVo;
		//getter 部分
	}

	@Override
	public void prepare() throws Exception {
		this.loginVo = new LoginVO();
		// 1. prepare部分が先に実行
	}
}
