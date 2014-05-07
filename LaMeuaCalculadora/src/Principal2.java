import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class Principal2 {
static Font f = new Font("Verdana",5,12);

	public Principal2() {
		// TODO Auto-generated constructor stub
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String botones[] = {"1","2","3","4","5","6","7","8","9","0","+","-","*","/"};
		JButton tebutones[] = new JButton[botones.length];
		
		JPanel panel;
		String titulo;
		JFrame f1 = new JFrame();
		panel = new JPanel();
		panel.setBackground(Color.DARK_GRAY);
		/*JButton bot1 = new JButton("Si");
		JButton bot2 = new JButton("no");
		panel.add(bot1);
		panel.add(bot2);*/
		titulo = JOptionPane.showInputDialog(f1,"Introduce un titulo");
		f1.setTitle(titulo);
		f1.add(panel);
		f1.setSize(200, 200);
		f1.setLocation(100,150);
		f1.setVisible(true);
		for(int b = 0; b < botones.length;b++){
			tebutones[b] = new JButton(botones[b]);
			panel.add(tebutones[b]);
		}
		for(int i = 0; i<300;i++){
			f1.setLocation(i+100,i+150);
			f1.repaint();
		}
		f1.setFont(f);
		f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		

	}

}
