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
	
	//변수 선언하기
	JLabel label_id = new JLabel("아이디");
	JLabel label_password = new JLabel("패스워드");
	JTextField ADid = new JTextField(15);
	JTextField ADpassword = new JTextField(15);
	JButton ADloginbutton = new JButton("로그인");
	JButton ADmjbutton = new JButton("회원가입");
	
	/**
	 * ID, PW 입력값 검사
	 * @param text1	ID
	 * @param text2	PW
	 * @return 에러 값
	 */
	int ADIDPWCheck(String text1, String text2) {
		
		if (text1.equals("")||text2.equals("")) {
			JOptionPane.showMessageDialog(null, "모두 입력해 주세요.","에러",JOptionPane.ERROR_MESSAGE);
			return 1;
		}
		return 0;
	}
	
	/**
	 * 로그인 화면
	 */
	public adminLoginScreen() {
		// TODO Auto-generated constructor stub
		
		//화면 생성
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
						
						JOptionPane.showMessageDialog(null, "로그인 성공", "성공", JOptionPane.INFORMATION_MESSAGE);
						dispose();
						setVisible();
						
					}else {
						JOptionPane.showMessageDialog(null, "입력값을 확인하세요.","에러",JOptionPane.ERROR_MESSAGE);
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
	 * 화면보이기(주화면)
	 */
	void setVisible() {
		AdminScreen adminS;
		adminS = new AdminScreen();
	}
	
	/**
	 * 화면보이기(관리자회원가입화면)
	 */
	void aMembersetVisible() {
		adminMemberJoinScreen adminMJS;
		adminMJS = new adminMemberJoinScreen();
	}

}

