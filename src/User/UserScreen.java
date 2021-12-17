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
	
	//변수 선언하기
	JTextField recipename = new JTextField();
	JButton searchButton = new JButton("검색");
	
	String[] ca = {"한식","중식","양식","일식"};
	JButton category[] = new JButton[4];
	
	String[] allergy = {"달걀","우유","밀","콩","땅콩","밤","조개","없음"};
	JCheckBox allergyOption[] = new JCheckBox[allergy.length];
	
	JButton recButton = new JButton("START");
	
	/**
	 * 입력값 검사
	 * @param text1	레시피명
	 * @param text2	알러지정보
	 * @return 에러 값
	 */
	int recipesearchcheck(String text1, String text2) {
		
		if (text1.equals("")||text2.equals("")) {
			JOptionPane.showMessageDialog(null, "모두 입력해 주세요.","에러",JOptionPane.ERROR_MESSAGE);
			return 1;
		}else{
			for (int i = 0; i < allergy.length-1; i++) {
				if (allergyOption[7].isSelected() && allergyOption[i].isSelected()) {
					JOptionPane.showMessageDialog(null, "입력값을 확인하세요.","에러",JOptionPane.ERROR_MESSAGE);
					return 1;
				}
			}
			
		}
		return 0;
	}
	
	/**
	 * 주화면
	 */
	public UserScreen() {
		// TODO Auto-generated constructor stub
		
		//화면 생성
		setTitle("UserScreen");
		setSize(500, 600);
	    setLocationRelativeTo(null);
	    setLayout(null);
	    setVisible(true);
	    getContentPane().setBackground(Color.white);
	    
	    
	}
	
}
