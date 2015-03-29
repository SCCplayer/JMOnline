package gui;


import java.awt.*;
import java.applet.*;

public class GridBagLayout1 extends Applet{

public void init() {
  GridBagLayout gbl = new GridBagLayout();
  this.setLayout(gbl);
		
  GridBagConstraints c = new GridBagConstraints();
		
  c.fill = GridBagConstraints.BOTH;   // wie Komponente Bereich füllen soll
  c.weightx = 90;                     // Breite
  c.weighty = 100;                    // Höhe
  c.insets = new Insets(0,5,10,15);   // Abstände definieren
		
  Button but1 = new Button("Hallo");
  Button but2 = new Button("Hallo2");
  Button but3 = new Button("Hallo3");
		
  Checkbox cb1 = new Checkbox("Checkbox 1");
				
  TextField tf1 = new TextField("Textfeld 1");

  c.gridx = 0;                        // x-Position
  c.gridy = 0;                        // y-Position
  c.gridwidth = 1;                    // Breite
  c.gridheight = 2;                   // Höhe
  gbl.setConstraints(but1, c);          // zum GridBagConstraints hinzufügen
  add(but1);
		
  c.gridx = 1;
  c.gridy = 0;
  c.gridwidth = 3;
  c.gridheight = 1;
  gbl.setConstraints(but2, c);
  add(but2);

  c.gridx = 1;
  c.gridy = 1;
  c.gridwidth = 2;
  c.gridheight = 1;
  gbl.setConstraints(but3, c);
  add(but3);

  c.gridx = 3;
  c.gridy = 1;
  c.gridwidth = 1;
  c.gridheight = 2;
  gbl.setConstraints(tf1, c);
  add(tf1);
		
  c.gridx = 0;
  c.gridy = 2;
  c.gridwidth = 3;
  c.gridheight = 1;
  gbl.setConstraints(cb1, c);
  add(cb1);
}

}
