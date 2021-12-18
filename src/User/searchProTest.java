package User;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.Test.None;
import org.junit.jupiter.api.Test;

import Admin.adminLoginPro;

class searchProTest {

	@Test
	void testRecipeAllergyReq() {
		//�׽�Ʈ���̽��� �̿��Ͽ� �ڵ�ȭ
		System.out.println("������ �˻��ϱ�");
		String name = "�����";	//�Է� ������
		String allergy = "";	//�Է� ������
		String text1 = "select * from recipeDB where name like '%"+name+"%';";
		String expResult = "8";		//�׽�Ʈ ����Ŭ
		String result = searchPro.recipeAllergyReq(text1).get(0).get(0);
		assertEquals(expResult, result);
		
		System.out.println("������ �˻��ϱ�");
		String name2 = "��";	//�Է� ������
		String allergy2 = "����";	//�Է� ������
		String text12 = "select * from recipeDB where name like '%"+name2+"%' and ingredient not like '%"+allergy2+"%';";
		String expResult21 = "8";		//�׽�Ʈ ����Ŭ
		String expResult22 = "12";		//�׽�Ʈ ����Ŭ
		String result21 = searchPro.recipeAllergyReq(text12).get(0).get(0);
		String result22 = searchPro.recipeAllergyReq(text12).get(1).get(0);
		assertEquals(expResult21, result21);
		assertEquals(expResult22, result22);
		
		
		System.out.println("������ �˻��ϱ�");
		String name3 = "������";	//�Է� ������
		String allergy3 = "";	//�Է� ������
		String text13 = "select * from recipeDB where name like '%"+name3+"%';";
		ArrayList<ArrayList<String>> expResult3 = new ArrayList<ArrayList<String>>();		//�׽�Ʈ ����Ŭ
		ArrayList<ArrayList<String>> result3 = searchPro.recipeAllergyReq(text13);
		assertEquals(expResult3, result3);
	}

}
