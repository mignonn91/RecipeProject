/**
 * 
 */
package User;

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
public class userloginScreen extends JFrame{
	
	//���� �����ϱ�
	JLabel label_id = new JLabel("���̵�");
	JLabel label_password = new JLabel("�н�����");
	JTextField id = new JTextField(15);
	JTextField password = new JTextField(15);
	JButton loginbutton = new JButton("�α���");
	JButton mjbutton = new JButton("ȸ������");
	
	/**
	 * ID, PW �Է°� �˻�
	 * @param text1
	 * @param text2
	 * @return ���� ��
	 */
	int IDPWCheck(String text1, String text2) {
		
		if (text1.equals("")||text2.equals("")) {
			JOptionPane.showMessageDialog(null, "��� �Է��� �ּ���.","����",JOptionPane.ERROR_MESSAGE);
			return 1;
		}
		return 0;
	}
	
	/**
	 * �α��� ȭ��
	 */
	public userloginScreen() {
		// TODO Auto-generated constructor stub
		
		//ȭ�� ����
		setTitle("userloginScreen");
		setSize(375, 250);
	    setLocationRelativeTo(null);
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    setVisible(true);
		setLayout(null);
		
		label_id.setBounds(80,60,50,25);
		id.setBounds(150,60,150,25);
		label_password.setBounds(80,95,50,25);
		password.setBounds(150,95,150,25);
		
		loginbutton.setBounds(80,140,85,30);
		mjbutton.setBounds(200,140,85,30);
		
		add(label_id);
		add(id);
		add(label_password);
		add(password);
		add(loginbutton);
		add(mjbutton);
		
		loginbutton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(IDPWCheck(id.getText(), password.getText())==0) {
					
					userLoginPro userLP;
					userLP = new userLoginPro();
							
					if(userLP.IDPWECheck(id.getText(), password.getText())==0 && 
							userLP.loginCheck(id.getText(), password.getText())==0) {
						
						JOptionPane.showMessageDialog(null, "�α��� ����", "����", JOptionPane.INFORMATION_MESSAGE);
						dispose();
						setVisible();
						
					}else {
						JOptionPane.showMessageDialog(null, "�Է°��� Ȯ���ϼ���.","����",JOptionPane.ERROR_MESSAGE);
					}
					
				}
			}
		});
		
		mjbutton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				uMembersetVisible();
			}
		});
		
	}
	
	/**
	 * ȭ�麸�̱�(����ڸ޴�ȭ��)
	 */
	void setVisible() {
//		UserScreen
	}
	
	/**
	 * ȭ�麸�̱�(�����ȸ������ȭ��)
	 */
	void uMembersetVisible() {
		dispose();
		userMemberJoinScreen userMJS;
		userMJS = new userMemberJoinScreen();
	}

}

