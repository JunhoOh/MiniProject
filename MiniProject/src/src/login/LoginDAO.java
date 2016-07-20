package src.login;

import java.io.IOException;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import com.opensymphony.xwork2.ActionContext;

import src.bean.LoginBean;
import src.bean.ReadyListBean;
import src.common.ActionVO;
import src.common.DAOInterface;
import src.common.StringUtility;
import src.mybatis.SqlMapClient;


public class LoginDAO implements DAOInterface{
	/**
	 * 全晟斌
	 * ログイン処理
	 
		成功した場合（出張所管理者）
		成功した場合（管理者）
		情報を見つかり無かった場合
		DAOで処理
	*/
	
	private LoginVO form;								//form オブジェクトを受ける
	private SqlSession sqlSession = null;				//DB処理
	private List<LoginBean> loginList;					//Login情報
	private ActionContext con;
	private Map<String, Object> session;				//セッション貯蔵
	private String result;								//結果値の貯蔵
	
	@Override
	public String doDAO(ActionVO formData) throws IOException {
		
		form = (LoginVO)formData;										//　値の貯蔵
		
		sqlSession = SqlMapClient.getSqlSession();
		Map<String, Object> loginmap = new HashMap<String, Object>();	//　Mapを利用してDBでの検索をするのでMapの生成
		loginList = new ArrayList<LoginBean>();							//　検索の行った結果の貯蔵する為List生成

		loginmap.put("USER_ID", form.getId());							//　IDを検索する為、loginmapで貯蔵
		loginList = sqlSession.selectList("login.getUser", loginmap);	//　IDの検索検索しその結果をloginListで貯蔵
		
		if (loginList == null || loginList.size() == 0) {		//　場合1 : DB上に該当社員IDがない場合（ログイン失敗）
			form.setErrorMessage("1");							//　ウェブでエラ表示の為、エラーメッセージで１を貯蔵
			return RESULT_ERROR;								//　エラー処理
			
		} else {												//　IDがある場合
			try{
				loginmap = new HashMap<String, Object>();		
				loginmap.put("USER_PS", StringUtility.getSHA256(form.getPwd()));
				loginmap.put("USER_ID", form.getId());								//　IDとPWDを貯蔵
				loginList = new ArrayList<LoginBean>();
				loginList = sqlSession.selectList("login.getPwd", loginmap);		//　結果値の貯蔵
			
				if (StringUtility.checkEqual(loginList.get(0).getUSER_PS(), StringUtility.getSHA256(form.getPwd()))) {
					//ログイン成功の場合
					
					switch(loginList.get(0).getUSER_STATUS()){
					case "0":														//管理者の場合（STATUSが０の場合）
						
						con = ActionContext.getContext();
						session = con.getSession();									//セッションの生成
						
						session.put("id", form.getId());
						session.put("status", loginList.get(0).getUSER_STATUS());
						con.setSession(session);									//ID値とStatusをセッションに貯蔵（管理者の値）
					
						result = RESULT_SUCCESS;			
						break;														//結果値の貯蔵、returnする。
						
					case "1":case "2":
		
						con = ActionContext.getContext();
						session = con.getSession();									//セッションの生成
						
						session.put("id", form.getId());
						session.put("status", loginList.get(0).getUSER_STATUS());
						con.setSession(session);									//ID値とStatusをセッションに貯蔵（出張所の値）
						
						result = RESULT_SUCCESS2;							
						break;														//結果値を貯蔵、returnする。
						
					default:
						form.setErrorMessage("1");
						result = RESULT_ERROR;								//情報がないのでエラー処理
						break;
					}//End of switch
				}else{
					form.setErrorMessage("1");
					result = RESULT_ERROR;
					return result;
				}//end of if
			} catch(Exception e){
				e.printStackTrace();
				form.setErrorMessage("1");									
				result = RESULT_ERROR;
				return result;												//　エラー処理
			} finally{
				SqlMapClient.closeSession(sqlSession);						//　SQLセッションをCloseする
			}//end of try - catch
			
			form.setErrorMessage("1");										//　Switch文で貯蔵しresultのReturnする。
			return result;
		}//end of if
	}//end of method
}//end of class