package timer;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class ContentPanel extends JPanel{
 
	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void addPanel(TimerFrame timer,String str1,String str2)
	 {
		   
			 timer.panel1=new JPanel();
			 timer.panel2=new JPanel();
			 timer.panel1.setBackground(Color.DARK_GRAY);
			 timer.panel2.setBackground(Color.darkGray);
			 //panel1.setLocation(100, 150);
			 timer.panel1.setPreferredSize(new Dimension(420,420));
			 timer. panel2.setPreferredSize(new Dimension(420,420));
			 /*BorderLayout lay=new BorderLayout();
			 this.setLayout(lay);*/
			
			 timer.setLayout(new FlowLayout(FlowLayout.LEFT,200,190));
			 System.out.println(str1+"   "+str2);
			 //String st=str1.toString();
			 JLabel label1=new JLabel(str1);
			 label1.setFont(new Font("楷体",Font.BOLD,300));
			 label1.setForeground(Color.lightGray);
			 timer.panel1.add(label1);
			// this.add(panel1);
			 JLabel label2 =new JLabel(str2);
			 label2.setFont(new Font("楷体",Font.BOLD,300));
			 label2.setForeground(Color.lightGray);
			 timer.panel2.add(label2);
			
			 //this.add(panel1);
			// panel1.setLocation(100, 100);
	 }
	// public String 
}
