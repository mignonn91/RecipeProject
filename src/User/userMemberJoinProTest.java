package User;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Admin.adminMemberJoinPro;

class userMemberJoinProTest {

	@Test
	void testIdDuplication() {
		System.out.println("����� ȸ������");
		String text1 = "Kim";	//�Է� ������
		int expResult = 0;		//�׽�Ʈ ����Ŭ
		int result = userMemberJoinPro.idDuplication(text1);
		assertEquals(expResult, result);
		
		String text12 = "Go";	//�Է� ������
		int expResult2 = 1;		//�׽�Ʈ ����Ŭ
		int result2 = userMemberJoinPro.idDuplication(text12);
		assertEquals(expResult2, result2);
	}

}
