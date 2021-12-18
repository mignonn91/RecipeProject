package User;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

/**
 * @author Soft43
 *
 */
public class recipeView extends JFrame{
	
	//변수선언
	int num = 0;
	JLabel result = new JLabel("", JLabel.CENTER);
	JLabel img = new JLabel(new ImageIcon("./Food/경장육사.jpg"));
	JLabel info = new JLabel("");
	
	JButton leftButton = new JButton("◀");
	JButton rightButton = new JButton("▶");
	
	/**
	 * 레시피화면
	 * @param 레시피 검색값 list1 
	 */
	public recipeView(ArrayList<ArrayList<String>> list1) {
		// TODO Auto-generated constructor stub
		
		//화면 생성
		setTitle("recipeView");
		setSize(600, 800);
	    setLocationRelativeTo(null);
	    setLayout(null);
	    setVisible(true);
	    getContentPane().setBackground(Color.white);
	    
	    Viewrepaint(num, list1);
	    
	    info.setOpaque(true);

		result.setFont(new Font("돋움",Font.BOLD,16));
		result.setText("< 검색 결과 : " + list1.size() + " 개 >");
		
		result.setBounds(0, 20, 600, 20);
		img.setBounds(125, 50, 340, 300);	
		
		leftButton.setBounds(10, 700, 80, 50);
		rightButton.setBounds(495, 700, 80, 50);
		
		info.setFont(new Font("Consolas",Font.BOLD,14));
		info.setBounds(10,360,560,330);
		
		leftButton.setVisible(false);
		if (list1.size()==0) {
			rightButton.setVisible(false);
		}
		
		add(result); add(img); add(info); add(leftButton); add(rightButton);
	    pack();
	    setSize(600, 800);
	    
	    leftButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				rightButton.setVisible(true);
				num = num - 1;
				
				Viewrepaint(num, list1);
				repaint();
				
				if (num==0) {
					leftButton.setVisible(false);
				}
			}
		});
	    
	    
	    rightButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				leftButton.setVisible(true);
				num = num + 1;
				
				Viewrepaint(num, list1);
				repaint();
				
				if ((num+1) == list1.size()) {
					rightButton.setVisible(false);
				}
			}
		});
	}
	
	/**
	 * 화면다시보이기
	 * @param num	현재 검색 번호
	 * @param list1 검색 리스트
	 */
	void Viewrepaint(int num, ArrayList<ArrayList<String>> list1) {
		//레시피정보		
		String text = "<html><body>";
				
		text = text + "카테고리: " + list1.get(num).get(7);
		text = text + "<br><br>레시피명: " + list1.get(num).get(1);
		text = text + "<br><br>제작방법: "+ list1.get(num).get(2);
		text = text + "<br><br>영양소: "+ list1.get(num).get(3);
		text = text + "<br><br>조리시간: "+ list1.get(num).get(4) + "분";
		text = text + "<br><br>재료: "+ list1.get(num).get(5) + "분";
		text = text + "<br><br>칼로리: "+ list1.get(num).get(6) + "kcal";
		
		text = text + "</body></html>";
		info.setText(text);
		
		//음식사진
		String recipe_name = list1.get(num).get(1);
		Image image = new ImageIcon("./Food/"+recipe_name+".jpg").getImage().getScaledInstance(340, 300, Image.SCALE_SMOOTH);
		img.setIcon(new ImageIcon(image));
	}

}
