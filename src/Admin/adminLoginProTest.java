package Admin;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import User.userLoginPro;

class adminLoginProTest {

	@Test
	void testADloginCheck() {
		//�׽�Ʈ���̽��� �̿��Ͽ� �ڵ�ȭ
		System.out.println("������ �α���");
		String text1 = "admin1";	//�Է� ������
		String text2 = "1234";	//�Է� ������
		int expResult = 0;		//�׽�Ʈ ����Ŭ
		int result = adminLoginPro.ADloginCheck(text1, text2);
		assertEquals(expResult, result);
		
		String text12 = "admin2";	//�Է� ������
		String text22 = "5678";	//�Է� ������
		int expResult2 = 0;		//�׽�Ʈ ����Ŭ
		int result2 = adminLoginPro.ADloginCheck(text12, text22);
		assertEquals(expResult2, result2);
		
		String text13 = "wdmin2";	//�Է� ������
		String text23 = "5678";	//�Է� ������
		int expResult3 = 1;		//�׽�Ʈ ����Ŭ
		int result3 = adminLoginPro.ADloginCheck(text13, text23);
		assertEquals(expResult3, result3);
		
		String text14 = "admin";	//�Է� ������
		String text24 = "1234";	//�Է� ������
		int expResult4 = 1;		//�׽�Ʈ ����Ŭ
		int result4 = adminLoginPro.ADloginCheck(text14, text24);
		assertEquals(expResult4, result4);
		
		String text15 = "admin1";	//�Է� ������
		String text25 = "5678";	//�Է� ������
		int expResult5 = 1;		//�׽�Ʈ ����Ŭ
		int result5 = adminLoginPro.ADloginCheck(text15, text25);
		assertEquals(expResult5, result5);
}

}
