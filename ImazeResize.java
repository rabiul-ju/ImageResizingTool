package test;


import java.awt.Component;
import java.awt.Graphics2D;
import java.awt.List;
import java.awt.RenderingHints;
import java.awt.Transparency;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.imageio.stream.ImageOutputStream;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;

import org.omg.CORBA.PUBLIC_MEMBER;


public class ImazeResize extends JFrame  implements ActionListener
{
	
	private static final String file = null;
	JButton resize;
	JButton selectFile;
	
	public ImazeResize(){
		
		resize=new JButton("Resize");
		
		selectFile= new JButton("Select File");
		
		JPanel panel =new JPanel();
		
		//resize.addActionListener(this);
		selectFile.addActionListener(this);
		
		panel.add(resize);
		panel.add(selectFile);
			
		add(panel);	
			
}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final JFrame frame = new ImazeResize();
		
			
			
			frame.setTitle("Resize");
			frame.setSize(500, 500);
			frame.setLocationRelativeTo(null);
			frame.pack();
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setVisible(true);	
					
			
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object object=e.getSource();
		//Object hint = null;
		int height=341,width=231;
		MyFileChoser choser= new MyFileChoser();
		
		if(object.equals(selectFile))
		{
			String file = new MyFileChoser().getFile();
			//System.out.println(file);
			//System.out.println(choser.getFile());
			/*try {
				
				BufferedImage img = ImageIO.read(new File(file));
				//System.out.println(originalImage);
				int type = (img.getTransparency()==Transparency.OPAQUE)?
						BufferedImage.TYPE_INT_RGB:BufferedImage.TYPE_INT_ARGB;
				//BufferedImage ret = (BufferedImage)img;
				int w,h;

					w=img.getWidth();
					h=img.getHeight();

				do {
					if ( w>width) {
						w=w/2;
						if(w<width){
							w=width;
						}						
					}
					
					if(h>height){
						h=h/2;
						if (h<height) {
							h=height;
							
						}					
						
					}
					BufferedImage tmp= new BufferedImage(w, h, type);
					Graphics2D g2 = tmp.createGraphics();
					//g2.setRenderingHint(RenderingHints.KEY_INTERPOLATION, img);
					g2.drawImage(img, 0, 0,w, h,null);
					g2.dispose();
					
					img= tmp;
				} while (w!=width || h!=height);
				
				
				ImageIO.write(img, "jpg", new File(file));
				
				
				
			} catch (Exception e2) {
				// TODO: handle exception
			}
			*/
		
				
			
		}
		
		if (object.equals(resize)) {
			
			
			
			try {
				
				//String file = choser.getFile();
				System.out.println(file);
				
				BufferedImage img = ImageIO.read(new File(file));
				//System.out.println(img);
				int type = (img.getTransparency()==Transparency.OPAQUE)?
						BufferedImage.TYPE_INT_RGB:BufferedImage.TYPE_INT_ARGB;
				//BufferedImage ret = (BufferedImage)img;
				int w,h;

					w=img.getWidth();
					h=img.getHeight();

				do {
					if ( w>width) {
						w=w/2;
						if(w<width){
							w=width;
						}						
					}
					
					if(h>height){
						h=h/2;
						if (h<height) {
							h=height;
							
						}					
						
					}
					BufferedImage tmp= new BufferedImage(w, h, type);
					Graphics2D g2 = tmp.createGraphics();
					//g2.setRenderingHint(RenderingHints.KEY_INTERPOLATION, img);
					g2.drawImage(img, 0, 0,w, h,null);
					g2.dispose();
					
					img= tmp;
				} while (w!=width || h!=height);
				
				
				ImageIO.write(img, "jpg", new File(file));
				//System.out.println(file);
				
				
			} catch (Exception e2) {
				// TODO: handle exception
			}
			
			
		}
		
		}
		

	}
	


	

