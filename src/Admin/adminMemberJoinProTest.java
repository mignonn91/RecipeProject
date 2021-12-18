package Admin;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import User.userLoginPro;

class adminMemberJoinProTest {

	@Test
	void testADidDuplication() {
		System.out.println("관리자 회원가입");
		String text1 = "admin3";	//입력 데이터
		int expResult = 0;		//테스트 오러클
		int result = adminMemberJoinPro.ADidDuplication(text1);
		assertEquals(expResult, result);
		
		String text12 = "admin1";	//입력 데이터
		int expResult2 = 1;		//테스트 오러클
		int result2 = adminMemberJoinPro.ADidDuplication(text12);
		assertEquals(expResult2, result2);
	}

}
