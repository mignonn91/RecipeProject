package Admin;
import java.sql.*;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Iterator;

import DB.DBCConnection;

/**
 * @author Soft43
 *
 */
public class adminLoginPro {
	
	/**
	 * ID, PW 유효성 검사
	 * @param text1	ID
	 * @param text2	PW
	 */
	int ADIDPWECheck(String text1, String text2) {
		
		return 0;
	}
	
	/**
	 * ID, PW 요청
	 * @return ID, PW 요청 후 리턴 값
	 */
	static ArrayList<ArrayList<String>> ADIDPWRequest() {
		
		ArrayList<ArrayList<String>> userDB = new ArrayList<ArrayList<String>>();
		DBCConnection DBCon;
		DBCon = new DBCConnection();
		String sql = "select * from adminDB";
		
		try {
			Connection con = DBCon.getConnection();
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			
			while (rs.next()) {
				
				int admin_no = rs.getInt(1);
				String admin_id = rs.getString(2);
				String admin_password = rs.getString(3);
				
				ArrayList<String> temp = new ArrayList<String>();
				temp.add(admin_no+"");
				temp.add(admin_id);
				temp.add(admin_password);
				
				userDB.add(temp);
			}
			
		} catch (Exception e) {
			System.out.println(sql);
		}
		
		return userDB;
	}
	
	/**
	 * ID, PW 검사()
	 * @param text1	ID
	 * @param text2	PW
	 */
	static int ADloginCheck(String text1, String text2) {
		
		int check = 1;
		
		for (int i = 0; i < ADIDPWRequest().size(); i++) {
			if (ADIDPWRequest().get(i).get(1).equals(text1) && 
					ADIDPWRequest().get(i).get(2).equals(text2)) {
				check = 0;
			}
		}
		
		return check;
	}
	
}
