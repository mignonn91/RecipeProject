package Admin;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import User.userLoginPro;

class adminLoginProTest {

	@Test
	void testADloginCheck() {
		//테스트케이스를 이용하여 자동화
		System.out.println("관리자 로그인");
		String text1 = "admin1";	//입력 데이터
		String text2 = "1234";	//입력 데이터
		int expResult = 0;		//테스트 오러클
		int result = adminLoginPro.ADloginCheck(text1, text2);
		assertEquals(expResult, result);
		
		String text12 = "admin2";	//입력 데이터
		String text22 = "5678";	//입력 데이터
		int expResult2 = 0;		//테스트 오러클
		int result2 = adminLoginPro.ADloginCheck(text12, text22);
		assertEquals(expResult2, result2);
		
		String text13 = "wdmin2";	//입력 데이터
		String text23 = "5678";	//입력 데이터
		int expResult3 = 1;		//테스트 오러클
		int result3 = adminLoginPro.ADloginCheck(text13, text23);
		assertEquals(expResult3, result3);
		
		String text14 = "admin";	//입력 데이터
		String text24 = "1234";	//입력 데이터
		int expResult4 = 1;		//테스트 오러클
		int result4 = adminLoginPro.ADloginCheck(text14, text24);
		assertEquals(expResult4, result4);
		
		String text15 = "admin1";	//입력 데이터
		String text25 = "5678";	//입력 데이터
		int expResult5 = 1;		//테스트 오러클
		int result5 = adminLoginPro.ADloginCheck(text15, text25);
		assertEquals(expResult5, result5);
}

}
