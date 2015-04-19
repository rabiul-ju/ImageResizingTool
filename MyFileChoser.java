package test;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyFileChoser extends JFrame
{
	
	private String file;
	public MyFileChoser() {
		
		JPanel panel =new JPanel();
		JFileChooser fileChooser=new JFileChooser();
//		fileChooser.
		int returnVal = fileChooser.showSaveDialog(this);
		
	    if(returnVal == JFileChooser.APPROVE_OPTION) {
	       this.file= fileChooser.getSelectedFile().getAbsolutePath();
	    }
	    
		panel.add(fileChooser);
		add(panel);	
		
	}
	
	
	public String getFile() {
		return file;
	}
	public void setFile(String file) {
		this.file = file;
	}
}
