import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.util.ArrayList;
import java.util.List;

public class Ventana extends JFrame {
	
		/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
		//VARIABLES
		public ArrayList<String> colores = new ArrayList<>();
		private int clicks = 0;
		private JPanel panel= new JPanel();
		private JPanel panelResultado= new JPanel();
		private JLabel et= new JLabel();
		private JLabel et2= new JLabel();
		private JButton btn1 = new JButton("Boton 1");
		private JButton btn2 = new JButton("Boton 2");
		private JButton btn3 = new JButton("Boton 3");
		private JButton btn4 = new JButton("* INFORME *");
		private Color col;
		private String nombCol;
		
		
		//CONSTRUCTOR
		public Ventana() {
			this.setSize(900, 500);
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
			et.setText("    Elige un boton y selecciona el color que desees");
			et.setOpaque(true);
			et.setBackground(Color.white);
			et.setBounds(150, 10, 300, 50);
			panel.add(et);
			et2.setText("     Cada 10 pulsaciones de botones de diferentes colores se podra presentar un informe por consola");
			et2.setOpaque(true);
			et2.setBackground(Color.white);
			et2.setBounds(50, 50, 600, 50);
			panel.add(et2);
		}
		
		 
		
		
		public void colocarBotones() {
			btn1.setForeground(Color.white);
			btn1.setBounds(200, 200, 100, 100);
			btn1.setBackground(Color.black);

			btn2.setForeground(Color.white);
			btn2.setBounds(300, 200, 100, 100);
			btn2.setBackground(Color.blue);

			btn3.setForeground(Color.white);
			btn3.setBounds(400, 200, 100, 100);
			btn3.setBackground(Color.LIGHT_GRAY);
			
			btn4.setForeground(Color.white);
			btn4.setBounds(600, 200, 200, 100);
			btn4.setForeground(Color.black);
			btn4.setBackground(Color.yellow);
			
			panel.add(btn1);
			panel.add(btn2);
			panel.add(btn3);
			
			agregarEvento();
			
		}
		
		//A partir de este método, se utilizará el observer
		public void acciones() { //utilizado para presentar por pantalla el cambio de color
			clicks++;
			panel.setBackground(col);
			setCol(col);
			colores.add(nombCol);
			if(clicks%10 == 0) {
				panel.add(btn4);
			}
		}

		public void Actualizacion() {
			System.out.printf("");
		}
		
		
			//EVENTOS
		public void agregarEvento() {
			
			ActionListener evento1= new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent ae) {
					col=Color.black;
					setNombCol("Negro");
					acciones();
					
				}
			};
			
			btn1.addActionListener(evento1);
			
			
			ActionListener evento2= new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent ae) {
					col=Color.blue;
					setNombCol("Azul");
					acciones();
					
				}
			};
			
			btn2.addActionListener(evento2);
			
			ActionListener evento3= new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent ae) {
					col=Color.lightGray;
					setNombCol("Gris claro");
					acciones();
					
				}
			};
			
			btn3.addActionListener(evento3);
			
			ActionListener evento4= new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent ae) {
					
					System.out.print("\nCANTIDAD DE COLORES INGRESADOS: "+ colores.size());
					System.out.print("\nARREGLO: ");
					for (String col : colores) {
						System.out.print(col+", ");
						panel.remove(btn4);
					}
					Actualizacion();
				}
			};
			
			btn4.addActionListener(evento4);
			
		}


		public Color getCol() {
			return col;
		}


		public void setCol(Color col) {
			this.col = col;
		}


		public String getNombCol() {
			return nombCol;
		}


		public void setNombCol(String nombCol) {
			this.nombCol = nombCol;
		}


		
		

	
}
