package Admin;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import User.userLoginPro;

class adminMemberJoinProTest {

	@Test
	void testADidDuplication() {
		System.out.println("������ ȸ������");
		String text1 = "admin3";	//�Է� ������
		int expResult = 0;		//�׽�Ʈ ����Ŭ
		int result = adminMemberJoinPro.ADidDuplication(text1);
		assertEquals(expResult, result);
		
		String text12 = "admin1";	//�Է� ������
		int expResult2 = 1;		//�׽�Ʈ ����Ŭ
		int result2 = adminMemberJoinPro.ADidDuplication(text12);
		assertEquals(expResult2, result2);
	}

}
