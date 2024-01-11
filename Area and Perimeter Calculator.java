import javax.swing.*;    
import java.awt.event.*;  
import java.awt.*;
import java.lang.Math;
public class MainProjectJava implements ItemListener
{    
	JFrame f;   
	JLabel label;
	String[] shapes = {"Select object For Area","Rectangle","Circle","Traingle","Square","Parallelogram","Elipse","Cube"};
	String[] sh= {"Select object For Perimeter","Rectangle","Circle","Traingle","Square","Parallelogram","Elipse"};
	JComboBox cb,cb1;
	JPanel jp;
	MainProjectJava()
	{    
	    f=new JFrame("AREA CALCULATOR");   
	    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    JLabel label = new JLabel();
	    label.setHorizontalAlignment(JLabel.CENTER);  
	    label.setSize(800,80);  
	    label.setFont(new Font("Serif", Font.BOLD, 30));
	    label.setForeground(Color.red);
	    label.setText("Select your Choice of the following to perform your operation:");
	    cb=new JComboBox(shapes);
	    cb1=new JComboBox(sh);
	     cb.setBounds(180, 180,170,60);
	     cb1.setBounds(700,180,185,60);
	    f.add(cb);
	    f.add(cb1);
	    f.add(label);
	    f.setLayout(null);    
	    f.setSize(500,500);    
	    f.setVisible(true);     
	    jp=new JPanel(new GridLayout(5,5,25,25));
	    jp.setBackground(Color.gray);
	    jp.setBounds(300,300,950,500);
	    f.add(jp);
	    cb.addItemListener(this);
	    cb1.addItemListener(new ItemListener()
	    		{
	    	       public void itemStateChanged(ItemEvent ee)
	    	       {
	    	    	   String getItem=(String)cb1.getSelectedItem();
	    	    	   jp.removeAll();
	    		        jp.repaint();
	    	    	   if(getItem.equals(sh[1]))
	    	    	   {
	    	    		  jp.revalidate();
	    	    		  JTextField t1=new JTextField();
	    	    		  JTextField t2=new JTextField();
	    	    		  JLabel l=new JLabel();
	    	    		  l.setFont(new Font("Serif", Font.BOLD, 25));
	    	    		  JLabel j1=new JLabel("Enter Length: ");
	    	    		  j1.setFont(new Font("Serif", Font.BOLD, 25));
	    	    		  jp.add(j1);
	    	    		  jp.add(t1);
	    	    		  JLabel j2=new JLabel("Enter Breadth: ");
	    	    		  j2.setFont(new Font("Serif", Font.BOLD, 25));
	    	    		  jp.add(j2);
	    	    		  jp.add(t2);
	    	    		  JButton b1=new JButton("Calculate");
	    	    		  jp.add(b1);
	    	    		  jp.add(l);
	    	    		  b1.addActionListener(new ActionListener()
	    	    		  {
	   	    			   public void actionPerformed(ActionEvent ae)
	   	    			   {
	   	    			       int a=Integer.parseInt(t1.getText());
	   	    				   int b=Integer.parseInt(t2.getText());
	   	    				   int c=2*(a+b);
	   	    				   l.setText("Perimeter of Rectangle:"+String.valueOf(c));
	   	    			   }
	   	    			   });
	    	    				  
	    	    	   }
	    	    	   else if(getItem.equals(sh[2]))
	    	    	   {
	    	    		   jp.revalidate();
		    	    		  JTextField t1=new JTextField();
		    	    		  
		    	    		  JLabel l=new JLabel();
		    	    		  l.setFont(new Font("Serif", Font.BOLD, 25));
		    	    		  JLabel j1=new JLabel("Enter Diameter: ");
		    	    		  j1.setFont(new Font("Serif", Font.BOLD, 25));
		    	    		  jp.add(j1);
		    	    		  jp.add(t1);
		    	    		  
		    	    		  JButton b1=new JButton("Calculate");
		    	    		  jp.add(b1);
		    	    		  jp.add(l);
		    	    		  b1.addActionListener(new ActionListener()
		    	    		  {
		   	    			   public void actionPerformed(ActionEvent ae)
		   	    			   {
		   	    			       int a=Integer.parseInt(t1.getText());
		   	    				   double c=(22/7)*a;
		   	    				   l.setText("Perimeter of Circle:"+String.valueOf(c));
		   	    			   }
		   	    			   }); 
	    	    	   }
	    	    	   else if(getItem.equals(sh[3]))
	    	    	   {
	    	    		   jp.revalidate();
		    	    		  JTextField t1=new JTextField();
		    	    		  JTextField t2=new JTextField();
		    	    		  JTextField t3=new JTextField();
		    	    		  JLabel l=new JLabel();
		    	    		  l.setFont(new Font("Serif", Font.BOLD, 25));
		    	    		  JLabel j1=new JLabel("Enter First Side: ");
		    	    		  j1.setFont(new Font("Serif", Font.BOLD, 25));
		    	    		  jp.add(j1);
		    	    		  jp.add(t1);
		    	    		  JLabel j2=new JLabel("Enter Second Side: ");
		    	    		  j2.setFont(new Font("Serif", Font.BOLD, 25));
		    	    		  jp.add(j2);
		    	    		  jp.add(t2);
		    	    		  JLabel j3=new JLabel("Enter Second Side: ");
		    	    		  j3.setFont(new Font("Serif", Font.BOLD, 25));
		    	    		  jp.add(j3);
		    	    		  jp.add(t3);
		    	    		  JButton b1=new JButton("Calculate");
		    	    		  jp.add(b1);
		    	    		  jp.add(l);
		    	    		  b1.addActionListener(new ActionListener()
		    	    		  {
		   	    			   public void actionPerformed(ActionEvent ae)
		   	    			   {
		   	    			       float a=Integer.parseInt(t1.getText());
		   	    				   float b=Integer.parseInt(t2.getText());
                                   float c=Integer.parseInt(t3.getText());
		   	    				   float d=(a+b+c);
		   	    				   l.setText("Perimeter of Traingle:"+String.valueOf(d));
		   	    			   }
		   	    			   }); 
	    	    	   }
	    	    	   else if(getItem.equals(sh[4]))
	    	    	   {
	    	    		      jp.revalidate();
		    	    		  JTextField t1=new JTextField();
		    	    		  
		    	    		  JLabel l=new JLabel();
		    	    		  l.setFont(new Font("Serif", Font.BOLD, 25));
		    	    		  JLabel j1=new JLabel("Enter Side of the Square: ");
		    	    		  j1.setFont(new Font("Serif", Font.BOLD, 25));
		    	    		  jp.add(j1);
		    	    		  jp.add(t1);
		    	    		  
		    	    		  JButton b1=new JButton("Calculate");
		    	    		  jp.add(b1);
		    	    		  jp.add(l);
		    	    		  b1.addActionListener(new ActionListener()
		    	    		  {
		   	    			   public void actionPerformed(ActionEvent ae)
		   	    			   {
		   	    			       int a=Integer.parseInt(t1.getText());
		   	    				   double c=4*a;
		   	    				   l.setText("Perimeter of Square:"+String.valueOf(c));
		   	    			   }
		   	    			   });
	    	    	   }
	    	    	   else if(getItem.equals(sh[5]))
	    	    	   {
	    	    		      jp.revalidate();
		    	    		  JTextField t1=new JTextField();
		    	    		  JTextField t2=new JTextField();
		    	    		  JLabel l=new JLabel();
		    	    		  l.setFont(new Font("Serif", Font.BOLD, 25));
		    	    		  JLabel j1=new JLabel("Enter Height: ");
		    	    		  j1.setFont(new Font("Serif", Font.BOLD, 25));
		    	    		  jp.add(j1);
		    	    		  jp.add(t1);
		    	    		  JLabel j2=new JLabel("Enter Breadth: ");
		    	    		  j2.setFont(new Font("Serif", Font.BOLD, 25));
		    	    		  jp.add(j2);
		    	    		  jp.add(t2);
		    	    		  JButton b1=new JButton("Calculate");
		    	    		  jp.add(b1);
		    	    		  jp.add(l);
		    	    		  b1.addActionListener(new ActionListener()
		    	    		  {
		   	    			   public void actionPerformed(ActionEvent ae)
		   	    			   {
		   	    			       int a=Integer.parseInt(t1.getText());
		   	    				   int b=Integer.parseInt(t2.getText());
		   	    				   int c=2*(a+b);
		   	    				   l.setText("Perimeter of Parllelogram:"+String.valueOf(c));
		   	    			   }
		   	    			   });
	    	    	   }
	    	    	   else if(getItem.equals(sh[6]))
	    	    	   {
	    	    		   jp.revalidate();
		    	    		  JTextField t1=new JTextField();
		    	    		  JTextField t2=new JTextField();
		    	    		  JLabel l=new JLabel();
		    	    		  l.setFont(new Font("Serif", Font.BOLD, 25));
		    	    		  JLabel j1=new JLabel("Enter the semi-major axis of the ellipse: ");
		    	    		  j1.setFont(new Font("Serif", Font.BOLD, 25));
		    	    		  jp.add(j1);
		    	    		  jp.add(t1);
		    	    		  JLabel j2=new JLabel("Enter the semi-minor axis of the ellipse: ");
		    	    		  j2.setFont(new Font("Serif", Font.BOLD, 25));
		    	    		  jp.add(j2);
		    	    		  jp.add(t2);
		    	    		  JButton b1=new JButton("Calculate");
		    	    		  jp.add(b1);
		    	    		  jp.add(l);
		    	    		  b1.addActionListener(new ActionListener()
		    	    		  {
		   	    			   public void actionPerformed(ActionEvent ae)
		   	    			   {
		   	    			       float a=Integer.parseInt(t1.getText());
		   	    				   float b=Integer.parseInt(t2.getText());
		   	    				   float c=(float) ((float)2 * 3.14 * Math.sqrt( ( (a* a) + (b * b) ) / 2)); 
		   	    				   l.setText("Perimeter of Elipse:"+String.valueOf(c));
		   	    			   }
		   	    			   });   
	    	    	   }
	    	       }
	    		}
	    		
	    		
	    		);
	}    
	public static void main(String[] args) 
	{    
	    new MainProjectJava();         
	}

	
	public void itemStateChanged(ItemEvent e) 
	{
		
	    	String getItem = (String)cb.getSelectedItem();
	    	jp.removeAll();
	        jp.repaint();
	    	 if(getItem.equals(shapes[1]))
	    	 {
	    		 jp.revalidate();
	    		 JTextField t1=new JTextField();
	    		 JTextField t2=new JTextField();
	    		 JLabel l=new JLabel();
	    		 l.setFont(new Font("Serif", Font.BOLD, 25));
	    		 
	    		 JLabel j1=new JLabel("Enter Length");
	    		 j1.setFont(new Font("Serif", Font.BOLD, 25));
	    		   
	    		   jp.add(j1);
	    		   jp.add(t1);
	    		   JLabel j2=new JLabel("Enter Breadth");
	    		   j2.setFont(new Font("Serif", Font.BOLD, 25));
	    		   
	    		   jp.add(j2);
	    		   jp.add(t2);
	    		  JButton b1=new JButton("Calculate");
	    		  jp.add(b1);
	    		  jp.add(l);
	    		
	    		  b1.addActionListener(new ActionListener()
	    		   {
	    			   public void actionPerformed(ActionEvent ae)
	    			   {
	    			        int a=Integer.parseInt(t1.getText());
	    				   int b=Integer.parseInt(t2.getText());
	    				   int c=a*b;
	    				   l.setText("Area of Rectangle :"+String.valueOf(c));
	    			   }
	    			   });
	    	 }
	    	 else if(getItem.equals(shapes[2]))
	    	 {
	    		 jp.revalidate();
	    		 JTextField t1=new JTextField();
	    		 JLabel l=new JLabel();
	    		 l.setFont(new Font("Serif", Font.BOLD, 25));
	    		 JLabel j1=new JLabel("Enter Radius :");
	    		 j1.setFont(new Font("Serif", Font.BOLD, 25));
	    		   
	    		   jp.add(j1);
	    		   jp.add(t1);
	  
	    		  JButton b2=new JButton("Calculate");
	    		  jp.add(b2);
	    		  jp.add(l);
	 		  	 b2.addActionListener(new ActionListener() 
	 		  			 {
	 		  		       public void actionPerformed(ActionEvent ae)
	 		  		       {
	 		  		    	   int r=Integer.parseInt(t1.getText());
		    				   int m=(22*r*r)/7 ;
		    				   l.setText("Area of Circle :"+String.valueOf(m));
	 		  		       }
	 		  			 });
	    	 }
	    	 else if(getItem.equals(shapes[3]))
	    	 {
	    		jp.revalidate();
	    		JTextField t1=new JTextField();
	    		 JTextField t2=new JTextField();
	    		 JLabel l=new JLabel();
	    		 l.setFont(new Font("Serif", Font.BOLD, 25));
	    		 JLabel j1=new JLabel("Enter Base: ");
	    		 j1.setFont(new Font("Serif", Font.BOLD, 25));
	    		   
	    		   jp.add(j1);
	    		   jp.add(t1);
	    		   JLabel j2=new JLabel("Enter Height: ");
	    		   j2.setFont(new Font("Serif", Font.BOLD, 25));
	    		   
	    		   jp.add(j2);
	    		   jp.add(t2);
	    		  JButton b3=new JButton("Calculate");
	    		  jp.add(b3);
	    		  jp.add(l);
	    		
	    		  b3.addActionListener(new ActionListener()
	    		   {
	    			   public void actionPerformed(ActionEvent ae)
	    			   {
	    			        int a=Integer.parseInt(t1.getText());
	    				   int b=Integer.parseInt(t2.getText());
	    				   int c=(a*b)/2;
	    				   l.setText("Area of Traingle :"+String.valueOf(c));
	    			   }
	    			   });
	    		
	   		 }
	    	 else if(getItem.equals(shapes[4]))
			 {
	    		jp.revalidate();
	    		JTextField t1=new JTextField();
	    		 JLabel l=new JLabel();
	    		 l.setFont(new Font("Serif", Font.BOLD, 25));
	    		 JLabel j1=new JLabel("Enter Side :");
	    		 j1.setFont(new Font("Serif", Font.BOLD, 25));
	    		   
	    		   jp.add(j1);
	    		   jp.add(t1);
	  
	    		  JButton b4=new JButton("Calculate");
	    		  jp.add(b4);
	    		  jp.add(l);
	 		  	 b4.addActionListener(new ActionListener() 
	 		  			 {
	 		  		       public void actionPerformed(ActionEvent ae)
	 		  		       {
	 		  		    	   int r=Integer.parseInt(t1.getText());
		    				   int m=(r*r);
		    				   l.setText("Area of Square :"+String.valueOf(m));
	 		  		       }
	 		  			 });
			 }
	    	 else if(getItem.equals(shapes[5]))
			 {
	    		jp.revalidate();
	    		JTextField t1=new JTextField();
	    		 JTextField t2=new JTextField();
	    		 JLabel l=new JLabel();
	    		 l.setFont(new Font("Serif", Font.BOLD, 25));
	    		 JLabel j1=new JLabel("Enter Base :");
	    		 j1.setFont(new Font("Serif", Font.BOLD, 25));
	    		   
	    		   jp.add(j1);
	    		   jp.add(t1);
	    		   JLabel j2=new JLabel("Enter Height :");
	    		   j2.setFont(new Font("Serif", Font.BOLD, 25));
	    		   
	    		   jp.add(j2);
	    		   jp.add(t2);
	    		  JButton b5=new JButton("Calculate");
	    		  jp.add(b5);
	    		  jp.add(l);
	    		
	    		  b5.addActionListener(new ActionListener()
	    		   {
	    			   public void actionPerformed(ActionEvent ae)
	    			   {
	    			       int a=Integer.parseInt(t1.getText());
	    				   int b=Integer.parseInt(t2.getText());
	    				   int c=a*b;
	    				   l.setText("Area of Parallelogram:"+String.valueOf(c));
	    			   }
	    			   });
			 }
	    	 else if(getItem.equals(shapes[6]))
			 {
	    		 jp.revalidate();
	    		 JTextField t1=new JTextField();
	    		 JTextField t2=new JTextField();
	    		 JLabel l=new JLabel();
	    		 l.setFont(new Font("Serif", Font.BOLD, 25));
	    		 JLabel j1=new JLabel("Enter X axis Value :");
	    		 j1.setFont(new Font("Serif", Font.BOLD, 25));
	    		   
	    		   jp.add(j1);
	    		   jp.add(t1);
	    		   JLabel j2=new JLabel("Enter Y axis Value :");
	    		   j2.setFont(new Font("Serif", Font.BOLD, 25));
	    		   
	    		   jp.add(j2);
	    		   jp.add(t2);
	    		  JButton b6=new JButton("Calculate");
	    		  jp.add(b6);
	    		  jp.add(l);
	    		
	    		  b6.addActionListener(new ActionListener()
	    		   {
	    			   public void actionPerformed(ActionEvent ae)
	    			   {
	    			       int a=Integer.parseInt(t1.getText());
	    				   int b=Integer.parseInt(t2.getText());
	    				   float c=(float)(3.14*a*b);
	    				   l.setText("Area of Elipse:"+String.valueOf(c));
	    			   }
	    			   });
			 }
	    	 else if(getItem.equals(shapes[7]))
	    	 {
	    		jp.revalidate();
	    		JTextField t1=new JTextField();
	    		 JLabel l=new JLabel();
	    		 l.setFont(new Font("Serif", Font.BOLD, 25));
	    		 JLabel j1=new JLabel("Enter Edge Value :");
	    		 j1.setFont(new Font("Serif", Font.BOLD, 25));
	    		   
	    		   jp.add(j1);
	    		   jp.add(t1);
	    		  JButton b7=new JButton("Calculate");
	    		  jp.add(b7);
	    		  jp.add(l);
	    		
	    		  b7.addActionListener(new ActionListener()
	    		   {
	    			   public void actionPerformed(ActionEvent ae)
	    			   {
	    			       float a=Integer.parseInt(t1.getText());
	    				   float r=6*(a*a);
	    				   l.setText("Surfacearea of Cube:"+String.valueOf(r));
	    			   }
	    			   });
	    	 }
	    }  	
}