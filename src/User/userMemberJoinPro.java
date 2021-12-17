/**
 * 
 */
package User;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import DB.DBCConnection;

/**
 * @author Soft43
 *
 */
public class userMemberJoinPro {
	
	/**
	 * 데이터요청
	 * @return
	 */
	ArrayList<ArrayList<String>> IDPWRequest() {
		
		ArrayList<ArrayList<String>> userDB = new ArrayList<ArrayList<String>>();
		DBCConnection DBCon;
		DBCon = new DBCConnection();
		String sql = "select * from userDB";
		
		try {
			Connection con = DBCon.getConnection();
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			
			while (rs.next()) {
				
				int user_no = rs.getInt(1);
				String user_id = rs.getString(2);
				String user_password = rs.getString(3);
				
				ArrayList<String> temp = new ArrayList<String>();
				temp.add(user_no+"");
				temp.add(user_id);
				temp.add(user_password);
				
				userDB.add(temp);
			}
			
		} catch (Exception e) {
			System.out.println(sql);
		}
		
		return userDB;
	}
	
	/**
	 * ID 중복 검사
	 * @param text1 ID
	 * @param text2 PW
	 * @param text3 NAME
	 */
	int idDuplication(String text1) {
		
		int check = 0;
		for (int i = 0; i < IDPWRequest().size(); i++) {
			if (IDPWRequest().get(i).get(1).equals(text1)) {
				check = 1;
			}
		}
		
		return check;
	}
	
	/**
	 * 계정 생성
	 * @param text1	ID
	 * @param text2	PW
	 * @param text3 NAME
	 */
	void MJCreate(String text1, String text2, String text3) {
		
		DBCConnection DBCon;
		DBCon = new DBCConnection();
		String sql = "INSERT INTO userDB(id, pw, name) VALUES ('"+text1+"','"+text2+"','"+text3+"');";
		
		try {
			Connection con = DBCon.getConnection();
			Statement stmt = con.createStatement();
			stmt.executeUpdate(sql);
			
			JOptionPane.showMessageDialog(null, "회원가입 성공", "성공", JOptionPane.INFORMATION_MESSAGE);
			
		} catch (Exception e) {
			System.out.println(sql);
		}
		
	}
}
