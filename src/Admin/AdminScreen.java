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
	
	//���� �����ϱ�
	JButton btninsert = new JButton("������ �߰�");
	JButton btnRenewal = new JButton("������ ����");
	JButton btndelete = new JButton("������ ����");
	
	 
	public AdminScreen() {
		// TODO Auto-generated constructor stub
		
		//ȭ�� ����
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
