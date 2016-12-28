package timer;

import java.awt.Color;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TimerThread extends Thread{

	 String str=getCurrentTime();
      String[] string=str.split(":");
      String str1=string[0];
     String str2=string[1]; 
     public String getCurrentTime()
	 {
		 Date date=new Date();
		 SimpleDateFormat simpledate=new SimpleDateFormat("hh:mm");
		 String str=simpledate.format(date);
		 return str;
	 }

	private ContentPanel contentPanel;
    private TimerFrame timer;
  
	public TimerThread(TimerFrame timer)
	{
		this.timer=timer;
		ContentPanel contentPanel=new ContentPanel();
		timer.setContentPane(contentPanel);
		timer.getContentPane().setBackground(Color.black);
	}
	
	public void run(){
   for(int i=0;i<10000;i++){
	  // System.out.println("coco");
	  // TimerFrame timer=new TimerFrame();
	 contentPanel=new ContentPanel();
	 timer.setContentPane(contentPanel);
	 timer.getContentPane().setBackground(Color.black);
	 contentPanel.addPanel(timer,str1,str2);
	 //System.out.println("cc");
	 contentPanel.add(timer.panel1);
		// setLayout(new FlowLayout(FlowLayout.RIGHT,10,190));
     contentPanel.add(timer.panel2);
     if(i<=1)
     {
    	 timer.dispose();
 		 timer.repaint();
 		 timer=new TimerFrame();
      }
    else{
     try {
    	 sleep(60000);
    	 
		
		str=getCurrentTime();
		string=str.split(":");
		str1=string[0];
		str2=string[1];
		timer.dispose();
		timer.repaint();
  		timer=new TimerFrame();
		
		
	    
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
     }
   }
	}

}
