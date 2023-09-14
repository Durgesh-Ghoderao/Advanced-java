import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class EXY implements ItemListener    
{	
	JComboBox c1;
	JLabel l1;
	ImageIcon i1,i2,i3,i4;
	EXY()
	{ 	JFrame f = new JFrame("combobox example");
		l1 = new JLabel();
		String[] ass = {"Mumbai","Solapur","pune","Banglore"};
		c1 = new JComboBox();
		for(int i=0;i<4;i++){
		c1.addItem(ass[i]);
		}
		//ImageIcon(String filename) 
		f.add(c1);
		f.add(l1);
		//f.add(i1);
		f.setVisible(true);
		f.setSize(400,300);
		f.setLayout(new FlowLayout());
		c1.addItemListener(this);   
	}
	  public void itemStateChanged(ItemEvent e) { 
		if (e.getSource() == c1) {
				String s = c1.getSelectedItem().toString();
				if(s=="Mumbai")
				{
					i1 = new ImageIcon("mumbai1.jpg");
					l1.setIcon(i1);
				}
				else if(s=="Solapur"){
					i1 = new ImageIcon("solapur.jpg");
					l1.setIcon(i1);
					
				}
				else if(s=="pune"){
					i1 = new ImageIcon("pune.jpg");
					l1.setIcon(i1);
				}
				else if(s=="Banglore"){
					i1 = new ImageIcon("bang.jpg");
					l1.setIcon(i1);
				}
				else{
					l1.setIcon(null);
				}
            //l1.setText("You are in " + c1.getSelectedItem());
        }
    }	  
           
	public static void main(String[] args)
	{
		new EXY();
	}




}