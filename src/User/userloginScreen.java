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
	
	//변수 선언하기
	JLabel label_id = new JLabel("아이디");
	JLabel label_password = new JLabel("패스워드");
	JTextField id = new JTextField(15);
	JTextField password = new JTextField(15);
	JButton loginbutton = new JButton("로그인");
	JButton mjbutton = new JButton("회원가입");
	
	/**
	 * ID, PW 입력값 검사
	 * @param text1
	 * @param text2
	 * @return 에러 값
	 */
	int IDPWCheck(String text1, String text2) {
		
		if (text1.equals("")||text2.equals("")) {
			JOptionPane.showMessageDialog(null, "모두 입력해 주세요.","에러",JOptionPane.ERROR_MESSAGE);
			return 1;
		}
		return 0;
	}
	
	/**
	 * 로그인 화면
	 */
	public userloginScreen() {
		// TODO Auto-generated constructor stub
		
		//화면 생성
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
						
						JOptionPane.showMessageDialog(null, "로그인 성공", "성공", JOptionPane.INFORMATION_MESSAGE);
						dispose();
						setVisible();
						
					}else {
						JOptionPane.showMessageDialog(null, "입력값을 확인하세요.","에러",JOptionPane.ERROR_MESSAGE);
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
	 * 화면보이기(사용자메뉴화면)
	 */
	void setVisible() {
//		UserScreen
	}
	
	/**
	 * 화면보이기(사용자회원가입화면)
	 */
	void uMembersetVisible() {
		dispose();
		userMemberJoinScreen userMJS;
		userMJS = new userMemberJoinScreen();
	}

}

