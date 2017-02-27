import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.*;

public class EmailPanel extends JPanel 
{
	
	 private JTextField fieldTo, fieldCc, fieldBcc, fieldSubject, fieldMessage;
	 private JLabel textTo, textCc, textBcc, textSubject, textMessage;
	 private JButton send;
	 
	 public EmailPanel()
	 {
		 
		 textTo = new JLabel("To");
		 textCc = new JLabel("Cc");
		 textBcc = new JLabel("Bcc");
		 textSubject = new JLabel("Subject");
		 textMessage = new JLabel("Message");
		 
		 fieldTo = new JTextField(15);
		 fieldCc = new JTextField(15);
		 fieldBcc = new JTextField(15);
		 fieldSubject = new JTextField(15);
		 fieldMessage = new JTextField(25);
		 
		 send = new JButton("Send");
		 send.addActionListener(new EmailListener());

		 add(textTo);
		 add(fieldTo);
	     add(textCc);
	     add(fieldCc);
	     add(textBcc);
	     add(fieldBcc);
	     add(textSubject);
	     add(fieldSubject);
	     add(textMessage);
	     add(fieldMessage);
	     add(send);
	     
	 }
	 
	
	 private class EmailListener implements ActionListener
	 {
	      public void actionPerformed(ActionEvent event)
	      {
	    	  
	    	  System.out.println(fieldTo.getText());
	    	  System.out.println(fieldCc.getText());
	    	  System.out.println(fieldBcc.getText());
	    	  System.out.println(fieldSubject.getText());
	    	  System.out.println(fieldMessage.getText());
	      }
	  }
	

}
