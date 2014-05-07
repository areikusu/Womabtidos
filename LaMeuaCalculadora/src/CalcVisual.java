import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.Font;

import javax.swing.SwingConstants;

import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Color;
import java.awt.Rectangle;
import java.awt.Dimension;

import javax.swing.UIManager;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


public class CalcVisual extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField display;
	private Operacio op;
	private int rtdo;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalcVisual frame = new CalcVisual();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public CalcVisual() {
		setBackground(UIManager.getColor("CheckBox.foreground"));
		setTitle("Pitagorina");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 560, 480);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{600, 0};
		gbl_contentPane.rowHeights = new int[]{50, 64, 143, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{1.0, 1.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);

		JLabel titulo = new JLabel("SE_CALCULA");
		titulo.setBackground(UIManager.getColor("CheckBox.foreground"));
		titulo.setForeground(UIManager.getColor("Button.highlight"));
		titulo.setHorizontalAlignment(SwingConstants.CENTER);
		titulo.setFont(new Font("Verdana", Font.PLAIN, 40));
		GridBagConstraints gbc_titulo = new GridBagConstraints();
		gbc_titulo.fill = GridBagConstraints.HORIZONTAL;
		gbc_titulo.anchor = GridBagConstraints.NORTH;
		gbc_titulo.insets = new Insets(0, 0, 5, 0);
		gbc_titulo.gridx = 0;
		gbc_titulo.gridy = 0;
		contentPane.add(titulo, gbc_titulo);

		display = new JTextField();
		/*display.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				char c;
				String v;
				
				
				
			}
		});*/
		display.setBackground(UIManager.getColor("Button.background"));
		display.setEditable(false);
		display.setFont(new Font("Tahoma", Font.PLAIN, 48));
		display.setHorizontalAlignment(SwingConstants.TRAILING);
		GridBagConstraints gbc_display = new GridBagConstraints();
		gbc_display.anchor = GridBagConstraints.NORTH;
		gbc_display.fill = GridBagConstraints.HORIZONTAL;
		gbc_display.insets = new Insets(0, 0, 5, 0);
		gbc_display.gridx = 0;
		gbc_display.gridy = 1;
		contentPane.add(display, gbc_display);
		display.setColumns(10);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 0, 0));
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.gridheight = 6;
		gbc_panel.insets = new Insets(5, 5, 5, 5);
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 0;
		gbc_panel.gridy = 2;
		contentPane.add(panel, gbc_panel);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[] {300, 40, 160};
		gbl_panel.rowHeights = new int[]{277, 0};
		gbl_panel.columnWeights = new double[]{0.0, 0.0, 0.0};
		gbl_panel.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);

		JPanel panel_1 = new JPanel();
		panel_1.setSize(new Dimension(5, 5));
		panel_1.setBounds(new Rectangle(10, 10, 10, 10));
		panel_1.setBackground(new Color(0, 0, 0));
		GridBagConstraints gbc_panel_1 = new GridBagConstraints();
		gbc_panel_1.fill = GridBagConstraints.BOTH;
		gbc_panel_1.gridx = 0;
		gbc_panel_1.gridy = 0;
		panel.add(panel_1, gbc_panel_1);
		panel_1.setLayout(new GridLayout(4, 3, 15, 15));

		JButton b7 = new JButton("7");
		b7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display.setText(display.getText()+"7");

			}
		});
		b7.setMargin(new Insets(10, 10, 10, 10));
		b7.setFont(new Font("Verdana", Font.BOLD, 16));
		panel_1.add(b7);

		JButton b8 = new JButton("8");
		b8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display.setText(display.getText()+"8");
			}
		});
		b8.setFont(new Font("Verdana", Font.BOLD, 16));
		panel_1.add(b8);

		JButton b9 = new JButton("9");
		b9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display.setText(display.getText()+"9");

			}
		});
		b9.setFont(new Font("Verdana", Font.BOLD, 16));
		panel_1.add(b9);

		JButton b4 = new JButton("4");
		b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display.setText(display.getText()+"4");

			}
		});
		b4.setFont(new Font("Verdana", Font.BOLD, 16));
		panel_1.add(b4);

		JButton b5 = new JButton("5");
		b5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display.setText(display.getText()+"5");

			}
		});
		b5.setFont(new Font("Verdana", Font.BOLD, 16));
		panel_1.add(b5);

		JButton b6 = new JButton("6");
		b6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display.setText(display.getText()+"6");

			}
		});
		b6.setFont(new Font("Verdana", Font.BOLD, 16));
		panel_1.add(b6);

		JButton b1 = new JButton("1");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				display.setText(display.getText()+"1");
			}
		});
		b1.setFont(new Font("Verdana", Font.BOLD, 16));
		panel_1.add(b1);

		JButton b2 = new JButton("2");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display.setText(display.getText()+"2");
			}
		});
		b2.setFont(new Font("Verdana", Font.BOLD, 16));
		panel_1.add(b2);

		JButton b3 = new JButton("3");
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display.setText(display.getText()+"3");

			}
		});
		b3.setFont(new Font("Verdana", Font.BOLD, 16));
		panel_1.add(b3);

		JButton b00 = new JButton("00");
		b00.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display.setText(display.getText()+"00");

			}
		});
		b00.setBounds(new Rectangle(5, 5, 5, 5));
		b00.setFont(new Font("Verdana", Font.BOLD, 16));
		panel_1.add(b00);

		JButton b0 = new JButton("0");
		b0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display.setText(display.getText()+"0");

			}
		});
		b0.setFont(new Font("Verdana", Font.BOLD, 16));
		panel_1.add(b0);

		JButton bDec = new JButton(".");
		bDec.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display.setText(display.getText()+".");

			}
		});
		bDec.setFont(new Font("Verdana", Font.BOLD, 16));
		panel_1.add(bDec);

		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(0, 0, 0));
		GridBagConstraints gbc_panel_2 = new GridBagConstraints();
		gbc_panel_2.fill = GridBagConstraints.BOTH;
		gbc_panel_2.gridx = 2;
		gbc_panel_2.gridy = 0;
		panel.add(panel_2, gbc_panel_2);
		panel_2.setLayout(new GridLayout(4, 2, 15, 15));

		JButton bC = new JButton("C");
		bC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display.setText("");
			}
		});
		bC.setFont(new Font("Verdana", Font.BOLD, 16));
		panel_2.add(bC);

		JButton bCe = new JButton("CE");
		bCe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String str	= display.getText();
				try{
					display.setText(str.substring(0, str.length()-1));
				}
			catch(StringIndexOutOfBoundsException e1){
				display.setText("");
			}
			}}
				
			
		);
		bCe.setFont(new Font("Verdana", Font.BOLD, 16));

		panel_2.add(bCe);

		JButton bSuma = new JButton("+");
		bSuma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(op==null){
					op = new Operacio(Integer.parseInt(display.getText()));
					display.setText("");
				}
				else{
					op.setOp2(Integer.parseInt(display.getText()));
					op.setAccio('+');
					rtdo = op.realitzaOperacio();
					op.setOp1(rtdo);
				}
			}
		});
		bSuma.setFont(new Font("Verdana", Font.BOLD, 16));
		panel_2.add(bSuma);

		JButton bResta = new JButton("-");
		bResta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display.setText(display.getText()+"-");
			}
		});
		bResta.setFont(new Font("Verdana", Font.BOLD, 16));
		panel_2.add(bResta);


		JButton bMult = new JButton("*");
		bMult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				display.setText(display.getText()+"*");
			}
		});
		bMult.setFont(new Font("Verdana", Font.BOLD, 16));
		panel_2.add(bMult);

		JButton bDiv = new JButton("/");
		bDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display.setText(display.getText()+"/");
			}
		});
		bDiv.setFont(new Font("Verdana", Font.BOLD, 16));
		panel_2.add(bDiv);

		JButton bResul = new JButton("=");
		bResul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(op==null){
					op = new Operacio(Integer.parseInt(display.getText()));
					display.setText(""+op.getOp1());
				}
				else{
					op.setOp2(Integer.parseInt(display.getText()));
					rtdo = op.realitzaOperacio();
					display.setText(""+rtdo);
				}
			}
		});
		bResul.setFont(new Font("Verdana", Font.BOLD, 16));
		panel_2.add(bResul);
	}

	

}
