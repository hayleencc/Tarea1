
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class Ventana extends JFrame {
	
		//VARIABLES
		private JPanel panel= new JPanel();
		private JLabel et= new JLabel("Elige un color");
		private JButton btn1 = new JButton("Boton 1");
		private JButton btn2 = new JButton("Boton 2");
		private JButton btn3 = new JButton("Boton 3");
		private String color;
		
		
		//CONSTRUCTOR
		public Ventana() {
			this.setSize(500, 500);
			this.setLocationRelativeTo(null);
			this.setDefaultCloseOperation(EXIT_ON_CLOSE);
			this.setTitle("Cambio de colores de Botones");
			iniciarComponentes();

		}
		
		
		//METODOS
		public void iniciarComponentes() {
			organizarPanel();
			colocarBotones();
		}
		
		public void organizarPanel() {
			panel.setLayout(null);
			this.getContentPane().add(panel);
			panel.setBackground(Color.WHITE);
			panel.add(et);
		}
		 

		
		public void colocarBotones() {
			btn1.setForeground(Color.white);
			btn1.setBounds(100, 100, 100, 100);
			btn1.setBackground(Color.black);

			btn2.setForeground(Color.white);
			btn2.setBounds(200, 100, 100, 100);
			btn2.setBackground(Color.blue);

			btn3.setForeground(Color.white);
			btn3.setBounds(300, 100, 100, 100);
			btn3.setBackground(Color.LIGHT_GRAY);
			
			panel.add(btn1);
			panel.add(btn2);
			panel.add(btn3);
			
			
			//EVENTOS
			
			ActionListener evento1= new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent ae) {
					panel.setBackground(Color.black);
				}
			};
			
			btn1.addActionListener(evento1);
			
			
			ActionListener evento2= new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent ae) {
					panel.setBackground(Color.blue);
				}
			};
			
			btn2.addActionListener(evento2);
			
			ActionListener evento3= new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent ae) {
					panel.setBackground(Color.LIGHT_GRAY);
				}
			};
			
			btn3.addActionListener(evento3);
			
		}

		

	
}
