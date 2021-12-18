package Admin;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 * @author Soft43
 *	
 */
public class adminLoginScreen extends JFrame{
	
	//���� �����ϱ�
	JLabel label_id = new JLabel("���̵�");
	JLabel label_password = new JLabel("�н�����");
	JTextField ADid = new JTextField(15);
	JTextField ADpassword = new JTextField(15);
	JButton ADloginbutton = new JButton("�α���");
	JButton ADmjbutton = new JButton("ȸ������");
	
	/**
	 * ID, PW �Է°� �˻�
	 * @param text1	ID
	 * @param text2	PW
	 * @return ���� ��
	 */
	int ADIDPWCheck(String text1, String text2) {
		
		if (text1.equals("")||text2.equals("")) {
			JOptionPane.showMessageDialog(null, "��� �Է��� �ּ���.","����",JOptionPane.ERROR_MESSAGE);
			return 1;
		}
		return 0;
	}
	
	/**
	 * �α��� ȭ��
	 */
	public adminLoginScreen() {
		// TODO Auto-generated constructor stub
		
		//ȭ�� ����
		setTitle("adminLoginScreen");
		setSize(375, 250);
	    setLocationRelativeTo(null);
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    setVisible(true);
		setLayout(null);
		
		label_id.setBounds(80,60,50,25);
		ADid.setBounds(150,60,150,25);
		label_password.setBounds(80,95,50,25);
		ADpassword.setBounds(150,95,150,25);
		
		ADloginbutton.setBounds(80,140,85,30);
		ADmjbutton.setBounds(200,140,85,30);
		
		add(label_id);
		add(ADid);
		add(label_password);
		add(ADpassword);
		add(ADloginbutton);
		add(ADmjbutton);
		
		ADloginbutton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(ADIDPWCheck(ADid.getText(), ADpassword.getText())==0) {
					
					adminLoginPro adminLP;
					adminLP = new adminLoginPro();
							
					if(adminLP.ADIDPWECheck(ADid.getText(), ADpassword.getText())==0 && 
							adminLP.ADloginCheck(ADid.getText(), ADpassword.getText())==0) {
						
						JOptionPane.showMessageDialog(null, "�α��� ����", "����", JOptionPane.INFORMATION_MESSAGE);
						dispose();
						setVisible();
						
					}else {
						JOptionPane.showMessageDialog(null, "�Է°��� Ȯ���ϼ���.","����",JOptionPane.ERROR_MESSAGE);
					}
					
				}
			}
		});
		
		ADmjbutton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				dispose();
				aMembersetVisible();
			}
		});
		
	}
	
	/**
	 * ȭ�麸�̱�(��ȭ��)
	 */
	void setVisible() {
		AdminScreen adminS;
		adminS = new AdminScreen();
	}
	
	/**
	 * ȭ�麸�̱�(������ȸ������ȭ��)
	 */
	void aMembersetVisible() {
		adminMemberJoinScreen adminMJS;
		adminMJS = new adminMemberJoinScreen();
	}

}

