package User;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Admin.adminMemberJoinPro;

class userMemberJoinProTest {

	@Test
	void testIdDuplication() {
		System.out.println("사용자 회원가입");
		String text1 = "Kim";	//입력 데이터
		int expResult = 0;		//테스트 오러클
		int result = userMemberJoinPro.idDuplication(text1);
		assertEquals(expResult, result);
		
		String text12 = "Go";	//입력 데이터
		int expResult2 = 1;		//테스트 오러클
		int result2 = userMemberJoinPro.idDuplication(text12);
		assertEquals(expResult2, result2);
	}

}
