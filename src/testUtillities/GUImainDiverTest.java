<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 2af07f9905004dbe7d00512811ff97e7e65652cd
package testUtillities;


import java.io.IOException;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;


public class GUImainDiverTest {
	
	   JFrame frame = new JFrame("GUI");
	    
	    JTextArea messageArea = new JTextArea(40, 40);

	    public GUImainDiverTest(){
		    messageArea.setEditable(false);
	        frame.getContentPane().add(new JScrollPane(messageArea), "Center");
	        frame.pack();
	    }
	    
	    
	    
	    private void run() throws IOException {
	    	for(int count = 22; count < 500; count++){
	    		messageArea.append(count + "\n");
	    	}
	    }
	    
	    public static void main(String[] args) throws Exception {
	    	GUImainDiverTest client = new GUImainDiverTest();
	        client.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        client.frame.setVisible(true);
	        client.run();
	    }
}
<<<<<<< HEAD
=======
=======
package testUtillities;


import java.io.IOException;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;


public class GUImainDiverTest {
	
	   JFrame frame = new JFrame("GUI");
	    
	    JTextArea messageArea = new JTextArea(40, 40);

	    public GUImainDiverTest(){
		    messageArea.setEditable(false);
	        frame.getContentPane().add(new JScrollPane(messageArea), "Center");
	        frame.pack();
	    }
	    
	    
	    
	    private void run() throws IOException {
	    	for(int count = 22; count < 500; count++){
	    		messageArea.append(count + "\n");
	    	}
	    }
	    
	    public static void main(String[] args) throws Exception {
	    	GUImainDiverTest client = new GUImainDiverTest();
	        client.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        client.frame.setVisible(true);
	        client.run();
	    }
}
>>>>>>> e8eb1f44fda3cde8b26ea1f5809df084d0c46fe1
>>>>>>> 2af07f9905004dbe7d00512811ff97e7e65652cd
