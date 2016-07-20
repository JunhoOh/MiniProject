<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>総括出張管理者</title>
<!-- 합쳐지고 최소화된 최신 CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">

<!-- 부가적인 테마 -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap-theme.min.css">

<!-- 합쳐지고 최소화된 최신 자바스크립트 -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js"></script>
<style type="text/css">
    .btn{
		margin-top:50px;
		margin-left:700px;
	}
	th{
		text-align:center;	
	}
	.table{
		border-collapse: collapse;
		text-align:center;
		width:800px;
	}
	
	.panel-footer{
		text-align:left;
	}
	
	thead{
		text-align:center;
	}
	
</style>
</head>
<body>
	
	<center>

  		<A href="javascript:window.print()">
  		<button class="btn btn-default" >検索結果印刷</button>
  		</A>

			<caption style="text-align:center"><h3><strong>検索条件</strong></h3></caption>
				<table class="table">
							<thead style="text-align:center;color:white;">
								<tr bgcolor="#0080ff">
									<th>検索結果</th>
									<th>検索項目</th>
								</tr>
							</thead>
							<tbody>
								<tr>
									<td width = "15%" bgcolor="#CCE5FF">所属</td>
									<td width = "85%">GCS,NCB,PSS</td>
								</tr>
								<tr>
									<td bgcolor="#CCE5FF">職級</td>
									<td>GM,MG,LD</td>
								</tr>
								<tr>
									<td width = "15%" bgcolor="#CCE5FF">経歴</td>
									<td width = "85%">2年以上</td>
								</tr>			
								<tr>
									<td bgcolor="#CCE5FF">分野</td>
									<td>ウェブ</td>
								</tr>
								<tr>
									<td bgcolor="#CCE5FF">業種</td>
									<td>金融</td>
								</tr>
								<tr>
									<td bgcolor="#CCE5FF">言語</td>
									<td>java</td>
								</tr>
								<tr>
									<td bgcolor="#CCE5FF">デビ</td>
									<td>Oracle</td>
								</tr>
								<tr>
									<td bgcolor="#CCE5FF">その他</td>
									<td>LINUX</td>
								</tr>
								<tr>
									 <td colspan="2" class="panel-footer">
										上記の条件で検索結果を表示しています.
									</td>
								</tr>
							</tbody>
				</table>
				
				<caption style="text-align:center"><h3><strong>検索結果</strong></h3></caption>
				
				<table class="table">
						
						<thead  style="text-align:center;color:white;">
							<tr bgcolor="#0080ff">
								<th>所属</th>
								<th>氏名</th>
								<th>職級</th>
								<th>経歴</th>
								<th>メール</th>
								<th>プロジェクト</th>
								<th>予想終了日</th>
							</tr>
						</thead>
						
						<tbody>
							<tr>
								<td>GCS</td>
								<td>洪吉童</td>
								<td>GM</td>
								<td>13年</td>
								<td>hongildong@gcns.co.jp</td>
								<td>三鷹</td>
								<td>201608</td>
							</tr>
							
							<tr>
								<td>NUVO</td>
								<td>江東原</td>
								<td>GM</td>
								<td>12年</td>
								<td>kangdongwon@nuvo.co.jp</td>
								<td>お茶の水</td>
								<td>201608</td>
							</tr>
							
							<tr>
								<td>PSS</td>
								<td>宋惠敎</td>
								<td>MG</td>
								<td>9年</td>
								<td> songhyegyo@pss.co.jp</td>
								<td>横浜</td>
								<td>201608</td>
							</tr>
							
							<tr>
								<td>GCS</td>
								<td>全知現</td>
								<td>MG</td>
								<td>8年</td>
								<td>jeonjihyeon@gcns.co.jp</td>
								<td>福岡</td>
								<td>201608</td>
							</tr>
								
							<tr>
								<td>NUVO</td>
								<td>李炳憲</td>
								<td>LD</td>
								<td>7年</td>
								<td>leebyunghun@nuvo.co.jp</td>
								<td>本社待機</td>
								<td>終了</td>
							</tr>
							
							<tr>
								<td>PSS</td>
								<td>宋中機</td>
								<td>LD</td>
								<td>6年</td>
								<td>songjunggi@pss.co.jp</td>
								<td>本社待機</td>
								<td>終了</td>
							</tr>
							
							<tr>
								<td>GCS</td>
								<td>朴神惠</td>
								<td>MB</td>
								<td>3年</td>
								<td>parkshinhye@gcs.co.jp</td>
								<td>本社待機</td>
								<td>終了</td>
							</tr>
							
							<tr>
								<td>NCB</td>
								<td>序懸進</td>
								<td>MB</td>
								<td>2年</td>
								<td>seohyunjin@nuvo.co.jp</td>
								<td>本社待機</td>
								<td>終了</td>
							</tr>
							</tbody>
				</table>
	</center>
</body>
</html>