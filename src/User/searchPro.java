package User;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import DB.DBCConnection;

/**
 * @author Soft43
 *
 */
public class searchPro {
	
	/**
	 * 레시피명, 알러지 요청
	 * @param text1	검색 SQL(레시피명, 알러지정보 포함)
	 */
	static ArrayList<ArrayList<String>> recipeAllergyReq(String text1) {
		
		ArrayList<ArrayList<String>> recipeDB = new ArrayList<ArrayList<String>>();
		DBCConnection DBCon;
		DBCon = new DBCConnection();
		String sql = text1;
		
		try {
			Connection con = DBCon.getConnection();
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			
			while (rs.next()) {
				
				int recipe_no = rs.getInt(1);
				String recipe_name = rs.getString(2);
				String recipe_made = rs.getString(3);
				String recipe_nutrient = rs.getString(4);
				int recipe_time = rs.getInt(5);
				String recipe_ingredient = rs.getString(6);
				Float recipe_kcal = rs.getFloat(7);
				String recipe_category = rs.getString(8);
								
				ArrayList<String> temp = new ArrayList<String>();
				temp.add(recipe_no+"");
				temp.add(recipe_name);
				temp.add(recipe_made);
				temp.add(recipe_nutrient);
				temp.add(recipe_time+"");
				temp.add(recipe_ingredient);
				temp.add(recipe_kcal+"");
				temp.add(recipe_category);
				
				recipeDB.add(temp);
			}
			
		} catch (Exception e) {
			System.out.println(sql);
		}
		return recipeDB;
		
	}
	
}
