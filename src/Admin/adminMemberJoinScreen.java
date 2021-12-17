package Admin;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import User.userloginScreen;

/**
 * @author Soft43
 *	
 */
public class adminMemberJoinScreen extends JFrame{
	
	//���� �����ϱ�
	JLabel label_id = new JLabel("���̵�");
	JLabel label_password = new JLabel("�н�����");
	
	JTextField ADid = new JTextField();
	JTextField ADpassword = new JTextField();
	
	JButton ADJoinbutton = new JButton("ȸ������");
	JButton ADcloseButton = new JButton("�ݱ�");
	
	/**
	 * ID, PW, �Է°� �˻�
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
	 * ����� ȸ������ ȭ��
	 */
	public adminMemberJoinScreen() {
		// TODO Auto-generated constructor stub
		
		//ȭ�� ����
		setTitle("adminMemberJoinScreen");
		setSize(375, 275);
	    setLocationRelativeTo(null);
	    setVisible(true);
		setLayout(null);
		
		label_id.setBounds(80,85,50,25);
		ADid.setBounds(150,85,150,25);
		label_password.setBounds(80,120,50,25);
		ADpassword.setBounds(150,120,150,25);
		
		ADJoinbutton.setBounds(80,170,85,30);
		ADcloseButton.setBounds(200,170,85,30);
		
		add(label_id);
		add(ADid);
		add(label_password);
		add(ADpassword);
		add(ADJoinbutton);
		add(ADcloseButton);
		
		ADJoinbutton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(ADIDPWCheck(ADid.getText(), ADpassword.getText())==0) {
					
					adminMemberJoinPro adminJP;
					adminJP = new adminMemberJoinPro();
					
					if(adminJP.ADidDuplication(ADid.getText())==0) {
						
						adminJP.MemberJoin(ADid.getText(), ADpassword.getText());
						dispose();
						setVisible();
						
					}else {
						JOptionPane.showMessageDialog(null, "�Է°��� Ȯ���ϼ���.","����",JOptionPane.ERROR_MESSAGE);
					}
					
				}
			}
		});
		
		ADcloseButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				dispose();
				new adminLoginScreen();
			}
		});
	}
	
	/**
	 * ȭ�麸�̱�(�α��� ȭ��)
	 */
	void setVisible() {
		adminLoginScreen adminLS;
		adminLS = new adminLoginScreen();
	}
}
