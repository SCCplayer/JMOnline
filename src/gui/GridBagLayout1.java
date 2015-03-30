package gui;
//Das ist ein Kommentar

import java.applet.Applet;
import java.awt.Button;
import java.awt.Checkbox;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.TextField;

import javax.swing.JButton;
import javax.swing.JTextPane;

public class GridBagLayout1 extends Applet{

public void init() {
  GridBagLayout gbl = new GridBagLayout();
  this.setLayout(gbl);
  GridBagConstraints c = new GridBagConstraints();
  JButton btnArray[][] = new JButton[10][10];
  
  c.fill = GridBagConstraints.BOTH;   // wie Komponente Bereich füllen soll
  c.weightx = 10;                     // Breite
  c.weighty = 10;                    // Höhe
  c.insets = new Insets(20,20,20,20);   // Abstände definieren

  int i = 1;
  for (int z = 0; z<10;z++){
	  for (int sp = 0; sp<10;sp++){
		  btnArray[z][sp]= new JButton(String.valueOf(i));
		  c.gridx = sp;
		  c.gridy = z;
		  c.gridwidth = 1;
		  c.gridheight = 1;
		  gbl.setConstraints(btnArray[z][sp], c);
		  add(btnArray[z][sp]);  
		  i++;
	  }
  } 
  Button pp = new Button("PlayerPanel");
  Button but2 = new Button("Hallo2");
  Button but3 = new Button("Hallo3");
  
  
  Checkbox cb1 = new Checkbox("Checkbox 1");
				
  TextField tf1 = new TextField("Textfeld 1");
  
  c.gridx = 0;                        // x-Position
  c.gridy = 0;                        // y-Position
  c.gridwidth = 10;                    // Breite
  c.gridheight = 2;                   // Höhe
  gbl.setConstraints(pp, c);          // zum GridBagConstraints hinzufügen
  add(pp);
//		
//  c.gridx = 4;
//  c.gridy = 1;
//  c.gridwidth = 3;
//  c.gridheight = 1;
//  gbl.setConstraints(but2, c);
//  add(but2);
//
//  c.gridx = 5;
//  c.gridy = 1;
//  c.gridwidth = 0;
//  c.gridheight = 0;
//  gbl.setConstraints(but3, c);
//  add(but3);
//
  c.gridx = 0;
  c.gridy = 2;
  c.gridwidth = 10;
  c.gridheight = 8;
  gbl.setConstraints(tf1, c);
  add(tf1);
//		
//  c.gridx = 0;
//  c.gridy = 2;
//  c.gridwidth = 3;
//  c.gridheight = 1;
//  gbl.setConstraints(cb1, c);
//  add(cb1);
}

}
