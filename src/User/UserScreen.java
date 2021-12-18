/**
 * 
 */
package User;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * @author Soft43
 *
 */
public class UserScreen extends JFrame{
	
	//���� �����ϱ�
	JLabel label_recipename = new JLabel("�����Ǹ�:");
	JTextField recipename = new JTextField(20);
	String[] ca = {"�ѽ�","�߽�","���","�Ͻ�"};
	String[] allergy = {"�ް�","����","��","��","����","��","����","����"};
	JCheckBox allergyOption[] = new JCheckBox[allergy.length];
	
	JButton searchButton = new JButton("�˻�");
	JButton category[] = new JButton[4];
	JButton recButton = new JButton("START");
	
	JLabel label_imag;
	BufferedImage r;
	
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

	    JPanel p1 = new JPanel();
	    p1.setBounds(40, 10, 400, 50);
	    p1.setBackground(Color.white);
	    p1.add(label_recipename);
	    p1.add(recipename);
	    p1.add(searchButton);
	    
	    
	    JPanel p2 = new JPanel();
	    p2.setBounds(0,50,480,50);
		p2.setBackground(Color.white);
	    
		for (int i = 0; i < allergy.length; i++) {
			allergyOption[i] = new JCheckBox(allergy[i]);
			allergyOption[i].setBackground(Color.white);
			p2.add(allergyOption[i]);
		}
		
	    add(p1);
	    add(p2);
	    pack();
	    setSize(500, 600);
	    
	    searchButton.addActionListener(new ActionListener() {
	    	
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				int count = 0;	//üũ ����
				String text2 = "";
				for (int i = 0; i < allergyOption.length; i++) {
					if (allergyOption[i].isSelected()==true) {
						text2 = text2 + "/" + allergyOption[i].getText();
					}
				}
				
				if(recipesearchcheck(recipename.getText(), text2)==0) {
					
					
					
				}
			}
		});
	    
	}	
}
