/**
 * 
 */
package User;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 * @author Soft43
 *
 */
public class UserScreen extends JFrame{
	
	//���� �����ϱ�
	JTextField recipename = new JTextField();
	JButton searchButton = new JButton("�˻�");
	
	String[] ca = {"�ѽ�","�߽�","���","�Ͻ�"};
	JButton category[] = new JButton[4];
	
	String[] allergy = {"�ް�","����","��","��","����","��","����","����"};
	JCheckBox allergyOption[] = new JCheckBox[allergy.length];
	
	JButton recButton = new JButton("START");
	
	/**
	 * �Է°� �˻�
	 * @param text1	�����Ǹ�
	 * @param text2	�˷�������
	 * @return ���� ��
	 */
	int recipesearchcheck(String text1, String text2) {
		
		if (text1.equals("")||text2.equals("")) {
			JOptionPane.showMessageDialog(null, "��� �Է��� �ּ���.","����",JOptionPane.ERROR_MESSAGE);
			return 1;
		}else{
			for (int i = 0; i < allergy.length-1; i++) {
				if (allergyOption[7].isSelected() && allergyOption[i].isSelected()) {
					JOptionPane.showMessageDialog(null, "�Է°��� Ȯ���ϼ���.","����",JOptionPane.ERROR_MESSAGE);
					return 1;
				}
			}
			
		}
		return 0;
	}
	
	/**
	 * ��ȭ��
	 */
	public UserScreen() {
		// TODO Auto-generated constructor stub
		
		//ȭ�� ����
		setTitle("UserScreen");
		setSize(500, 600);
	    setLocationRelativeTo(null);
	    setLayout(null);
	    setVisible(true);
	    getContentPane().setBackground(Color.white);
	    
	    
	}
	
}
