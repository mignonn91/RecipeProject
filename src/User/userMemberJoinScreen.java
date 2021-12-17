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
public class userMemberJoinScreen extends JFrame{
	
	//���� �����ϱ�
	JLabel label_name = new JLabel("�̸�");
	JLabel label_id = new JLabel("���̵�");
	JLabel label_password = new JLabel("�н�����");
	
	JTextField id = new JTextField();
	JTextField password = new JTextField();
	JTextField name = new JTextField();
	
	JButton Joinbutton = new JButton("ȸ������");
	JButton closeButton = new JButton("�ݱ�");
	
	
	/**
	 * ID, PW, name �Է°� �˻�
	 * @param text1
	 * @param text2
	 * @return ���� ��
	 */
	int IDPWNameCheck(String text1, String text2, String text3) {
		
		if (text1.equals("")||text2.equals("")||text3.equals("")) {
			JOptionPane.showMessageDialog(null, "��� �Է��� �ּ���.","����",JOptionPane.ERROR_MESSAGE);
			return 1;
		}
		return 0;
	}
	
	/**
	 * ����� ȸ������ ȭ��
	 */
	public userMemberJoinScreen() {
		// TODO Auto-generated constructor stub
		
		//ȭ�� ����
		setTitle("userMemberJoinScreen");
		setSize(375, 275);
	    setLocationRelativeTo(null);
	    setVisible(true);
		setLayout(null);
		
		label_name.setBounds(80,50,50,25);
		name.setBounds(150,50,150,25);
		label_id.setBounds(80,85,50,25);
		id.setBounds(150,85,150,25);
		label_password.setBounds(80,120,50,25);
		password.setBounds(150,120,150,25);
		
		Joinbutton.setBounds(80,170,85,30);
		closeButton.setBounds(200,170,85,30);
		
		add(label_name);
		add(name);
		add(label_id);
		add(id);
		add(label_password);
		add(password);
		add(Joinbutton);
		add(closeButton);
		
		Joinbutton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(IDPWNameCheck(id.getText(), password.getText(), name.getText())==0) {
					
					userMemberJoinPro userJP;
					userJP = new userMemberJoinPro();
					
					if(userJP.idDuplication(id.getText())==0) {
						
						userJP.MJCreate(id.getText(), password.getText(),name.getText());
						dispose();
						setVisible();
						
					}else {
						JOptionPane.showMessageDialog(null, "�Է°��� Ȯ���ϼ���.","����",JOptionPane.ERROR_MESSAGE);
					}
					
				}
			}
		});
		
		closeButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				dispose();
				new userloginScreen();
			}
		});
	}
	
	/**
	 * ȭ�麸�̱�(����ڸ޴�ȭ��)
	 */
	void setVisible() {
//		UserScreen
	}
}
