/**
 * 
 */
package Admin;

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
public class adminMemberJoinPro {
	
	/**
	 * �����Ϳ�û
	 * @return adminDB������
	 */
	ArrayList<ArrayList<String>> IDPWRequest() {
		
		ArrayList<ArrayList<String>> adminDB = new ArrayList<ArrayList<String>>();
		DBCConnection DBCon;
		DBCon = new DBCConnection();
		String sql = "select * from adminDB";
		
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
				
				adminDB.add(temp);
			}
			
		} catch (Exception e) {
			System.out.println(sql);
		}
		
		return adminDB;
	}
	
	/**
	 * ID �ߺ� �˻�
	 * @param text1 ID
	 */
	int ADidDuplication(String text1) {
		
		int check = 0;
		for (int i = 0; i < IDPWRequest().size(); i++) {
			if (IDPWRequest().get(i).get(1).equals(text1)) {
				check = 1;
			}
		}
		
		return check;
	}
	
	/**
	 * ���� ����
	 * @param text1	ID
	 * @param text2	PW
	 */
	void MemberJoin(String text1, String text2) {
		
		DBCConnection DBCon;
		DBCon = new DBCConnection();
		String sql = "INSERT INTO adminDB(id, pw) VALUES ('"+text1+"','"+text2+"');";
		
		try {
			Connection con = DBCon.getConnection();
			Statement stmt = con.createStatement();
			stmt.executeUpdate(sql);
			
			JOptionPane.showMessageDialog(null, "ȸ������ ����", "����", JOptionPane.INFORMATION_MESSAGE);
			
		} catch (Exception e) {
			System.out.println(sql);
		}
		
	}
}
