package User;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.Test.None;
import org.junit.jupiter.api.Test;

import Admin.adminLoginPro;

class searchProTest {

	@Test
	void testRecipeAllergyReq() {
		//테스트케이스를 이용하여 자동화
		System.out.println("레시피 검색하기");
		String name = "자장면";	//입력 데이터
		String allergy = "";	//입력 데이터
		String text1 = "select * from recipeDB where name like '%"+name+"%';";
		String expResult = "8";		//테스트 오러클
		String result = searchPro.recipeAllergyReq(text1).get(0).get(0);
		assertEquals(expResult, result);
		
		System.out.println("레시피 검색하기");
		String name2 = "자";	//입력 데이터
		String allergy2 = "우유";	//입력 데이터
		String text12 = "select * from recipeDB where name like '%"+name2+"%' and ingredient not like '%"+allergy2+"%';";
		String expResult21 = "8";		//테스트 오러클
		String expResult22 = "12";		//테스트 오러클
		String result21 = searchPro.recipeAllergyReq(text12).get(0).get(0);
		String result22 = searchPro.recipeAllergyReq(text12).get(1).get(0);
		assertEquals(expResult21, result21);
		assertEquals(expResult22, result22);
		
		
		System.out.println("레시피 검색하기");
		String name3 = "졸려요";	//입력 데이터
		String allergy3 = "";	//입력 데이터
		String text13 = "select * from recipeDB where name like '%"+name3+"%';";
		ArrayList<ArrayList<String>> expResult3 = new ArrayList<ArrayList<String>>();		//테스트 오러클
		ArrayList<ArrayList<String>> result3 = searchPro.recipeAllergyReq(text13);
		assertEquals(expResult3, result3);
	}

}
