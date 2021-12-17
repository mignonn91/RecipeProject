package Admin;
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

/**
 * 
 */

/**
 * @author User
 *
 */
public class AdminScreen extends JFrame{
	
	//변수 선언하기
	JButton btninsert = new JButton("레시피 추가");
	JButton btnRenewal = new JButton("레시피 수정");
	JButton btndelete = new JButton("레시피 삭제");
	
	 
	public AdminScreen() {
		// TODO Auto-generated constructor stub
		
		//화면 생성
		setTitle("AdminScreen");
		setSize(375, 435);
	    setLocationRelativeTo(null);
	    setVisible(true);
		setLayout(new GridLayout(3,1,10,10));
		
		add(btninsert);
		add(btnRenewal);
		add(btndelete);
		
	}
	
}
