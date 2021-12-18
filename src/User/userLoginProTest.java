package User;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class userLoginProTest {

	@Test
	void testLoginCheck() {
		
		//테스트케이스를 이용하여 자동화
		System.out.println("사용자 로그인 검사");
		String text1 = "Go";	//입력 데이터
		String text2 = "1234";	//입력 데이터
		int expResult = 0;		//테스트 오러클
		int result = userLoginPro.loginCheck(text1, text2);
		assertEquals(expResult, result);
		
		String text12 = "Song";	//입력 데이터
		String text22 = "5678";	//입력 데이터
		int expResult2 = 0;		//테스트 오러클
		int result2 = userLoginPro.loginCheck(text12, text22);
		assertEquals(expResult2, result2);
		
		String text13 = "Lee";	//입력 데이터
		String text23 = "0123";	//입력 데이터
		int expResult3 = 0;		//테스트 오러클
		int result3 = userLoginPro.loginCheck(text13, text23);
		assertEquals(expResult3, result3);
		
		String text14 = "Go2";	//입력 데이터
		String text24 = "1234";	//입력 데이터
		int expResult4 = 1;		//테스트 오러클
		int result4 = userLoginPro.loginCheck(text14, text24);
		assertEquals(expResult4, result4);
		
		String text15 = "Soong";	//입력 데이터
		String text25 = "5678";	//입력 데이터
		int expResult5 = 1;		//테스트 오러클
		int result5 = userLoginPro.loginCheck(text15, text25);
		assertEquals(expResult5, result5);
		
		String text16 = "Go";	//입력 데이터
		String text26 = "5678";	//입력 데이터
		int expResult6 = 1;		//테스트 오러클
		int result6 = userLoginPro.loginCheck(text16, text26);
		assertEquals(expResult6, result6);

	}

}
