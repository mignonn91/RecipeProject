/**
 * 
 */
package DB;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * @author Soft43
 *
 */
public class DBCConnection {
	
	//변수 선언(생성자)
	int admin_no, user_no, recipe_no, recipe_time;
	float recipe_kal;
	String admin_id, admin_password, user_id, user_password, user_name;
	
	public int getAdmin_no() {
		return admin_no;
	}
	public void setAdmin_no(int admin_no) {
		this.admin_no = admin_no;
	}
	public int getUser_no() {
		return user_no;
	}
	public void setUser_no(int user_no) {
		this.user_no = user_no;
	}
	public int getRecipe_no() {
		return recipe_no;
	}
	public void setRecipe_no(int recipe_no) {
		this.recipe_no = recipe_no;
	}
	public int getRecipe_time() {
		return recipe_time;
	}
	public void setRecipe_time(int recipe_time) {
		this.recipe_time = recipe_time;
	}
	public float getRecipe_kal() {
		return recipe_kal;
	}
	public void setRecipe_kal(float recipe_kal) {
		this.recipe_kal = recipe_kal;
	}
	public String getAdmin_id() {
		return admin_id;
	}
	public void setAdmin_id(String admin_id) {
		this.admin_id = admin_id;
	}
	public String getAdmin_password() {
		return admin_password;
	}
	public void setAdmin_password(String admin_password) {
		this.admin_password = admin_password;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getUser_password() {
		return user_password;
	}
	public void setUser_password(String user_password) {
		this.user_password = user_password;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getRecipe_name() {
		return recipe_name;
	}
	public void setRecipe_name(String recipe_name) {
		this.recipe_name = recipe_name;
	}
	public String getRecipe_made() {
		return recipe_made;
	}
	public void setRecipe_made(String recipe_made) {
		this.recipe_made = recipe_made;
	}
	public String getRecipe_nutrient() {
		return recipe_nutrient;
	}
	public void setRecipe_nutrient(String recipe_nutrient) {
		this.recipe_nutrient = recipe_nutrient;
	}
	public String getRecipe_Ingredient() {
		return recipe_Ingredient;
	}
	public void setRecipe_Ingredient(String recipe_Ingredient) {
		this.recipe_Ingredient = recipe_Ingredient;
	}
	public String getRecipe_category() {
		return recipe_category;
	}
	public void setRecipe_category(String recipe_category) {
		this.recipe_category = recipe_category;
	}
	String recipe_name, recipe_made, recipe_nutrient, recipe_Ingredient, recipe_category;
	
	//변수 생성(DB)
	static Connection con = null;
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost:3306/RecipeProject?useSSL=false&allowPublicKeyRetrieval=true";
	static final String USERNAME = "root"; // DB ID
	static final String PASSWORD = "";
	
	/**
	 * DB 연동하기
	 */
	public DBCConnection() {
		
		try {
			con = DriverManager.getConnection(DB_URL,USERNAME,PASSWORD);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
		new DBCConnection();
	}
	
}
