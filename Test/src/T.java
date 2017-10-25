import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
public class T implements ActionListener {
JFrame frame;
JPanel panel;
JButton button;
JButton buttontwo;
JButton buttonthree;
JButton buttonfour;
Color g;
Color h;
Color u;
Color e;

public static void main(String[] args) {
T s = new T();	
}
T() {
frame = new JFrame();
panel = new JPanel();
button = new JButton();
buttontwo = new JButton();
buttonthree = new JButton();
buttonfour = new JButton();
g = new Color(255, 0, 0);
h = new Color(0, 255, 0);
u = new Color(0, 0, 255);
e = new Color(0, 0, 0);
button.setOpaque(true);
buttontwo.setOpaque(true);
buttonthree.setOpaque(true);
buttonfour.setOpaque(true);
button.setBackground(g);
buttontwo.setBackground(h);
buttonthree.setBackground(u);
buttonfour.setBackground(e);
button.addActionListener(this);
buttontwo.addActionListener(this);
buttonthree.addActionListener(this);
buttonfour.addActionListener(this);
frame.add(panel);
panel.add(button);
panel.add(buttontwo);
panel.add(buttonthree);
panel.add(buttonfour);
frame.setVisible(true);
frame.pack();

}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	if (e.getSource() == button) {
speak("That color is red");		
	}
if (e.getSource() == buttontwo) {
speak("That color is green");			
	}
if (e.getSource() == buttonthree) {
speak("That color is blue");	
}
if (e.getSource() == buttonfour) {
speak("That color is black");	
}
	}
void speak(String words) {
try {
Runtime.getRuntime()	.exec("say " + words);
}
catch (IOException e) {
e.printStackTrace();	
}
	
}
}

