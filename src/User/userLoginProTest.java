package User;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class userLoginProTest {

	@Test
	void testLoginCheck() {
		
		//�׽�Ʈ���̽��� �̿��Ͽ� �ڵ�ȭ
		System.out.println("����� �α��� �˻�");
		String text1 = "Go";	//�Է� ������
		String text2 = "1234";	//�Է� ������
		int expResult = 0;		//�׽�Ʈ ����Ŭ
		int result = userLoginPro.loginCheck(text1, text2);
		assertEquals(expResult, result);
		
		String text12 = "Song";	//�Է� ������
		String text22 = "5678";	//�Է� ������
		int expResult2 = 0;		//�׽�Ʈ ����Ŭ
		int result2 = userLoginPro.loginCheck(text12, text22);
		assertEquals(expResult2, result2);
		
		String text13 = "Lee";	//�Է� ������
		String text23 = "0123";	//�Է� ������
		int expResult3 = 0;		//�׽�Ʈ ����Ŭ
		int result3 = userLoginPro.loginCheck(text13, text23);
		assertEquals(expResult3, result3);
		
		String text14 = "Go2";	//�Է� ������
		String text24 = "1234";	//�Է� ������
		int expResult4 = 1;		//�׽�Ʈ ����Ŭ
		int result4 = userLoginPro.loginCheck(text14, text24);
		assertEquals(expResult4, result4);
		
		String text15 = "Soong";	//�Է� ������
		String text25 = "5678";	//�Է� ������
		int expResult5 = 1;		//�׽�Ʈ ����Ŭ
		int result5 = userLoginPro.loginCheck(text15, text25);
		assertEquals(expResult5, result5);
		
		String text16 = "Go";	//�Է� ������
		String text26 = "5678";	//�Է� ������
		int expResult6 = 1;		//�׽�Ʈ ����Ŭ
		int result6 = userLoginPro.loginCheck(text16, text26);
		assertEquals(expResult6, result6);

	}

}
