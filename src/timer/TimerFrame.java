package timer;


import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;



public class TimerFrame extends JFrame{

	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static  int height;
	 public static  int width;

      JPanel panel1;
      JPanel panel2;
	 
	 public void CatchDimensionSize()
	 {
		 Dimension screensize=Toolkit.getDefaultToolkit().getScreenSize();
		 TimerFrame.height=screensize.height;
		 TimerFrame.width=screensize.width;
	 }
	 
	
	 
	 public TimerFrame()
	 {
		 getGraphicsConfiguration().getDevice().setFullScreenWindow(this);
		 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 CatchDimensionSize();
		 setSize(width,height);
		 addMouseListener(new MouseAdapter()
		 {  
			 public void mouseClicked(MouseEvent event)
			 {
		        if(event.getClickCount()>=1)
		        {
		           System.exit(0);
		        }
			 }
		 });
		this. addKeyListener(new KeyAdapter()
	     {
			 public void keyPressed(KeyEvent event)
			 {
				 String str=String.valueOf(event.getKeyChar());
				 if(str!=null)
				 {
					System.exit(0);
				 }
			 }
	     });
		 setVisible(true);
	 }

	 public static void main(String[] args)
	 {
		TimerFrame timer=new TimerFrame();
		ContentPanel contentPanel=new ContentPanel();
		timer.setContentPane(contentPanel);
		timer.getContentPane().setBackground(Color.black);
		TimerThread timerthread=new TimerThread(timer);
		timerthread.setPriority(Thread.NORM_PRIORITY);
		timerthread.start();
	 }
}
