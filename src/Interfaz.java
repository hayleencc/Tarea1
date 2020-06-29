
public class Interfaz {
		
		private VBox root= new VBox();
		private JPanel panel=new JPanel();
		private JButton boton1;
		private JButton boton2;
		private JButton boton3;
		
		
		public Interfaz() {
		boton1= new JButton("boton 1");
		boton2= new JButton("boton 2");
		boton3= new JButton("boton 3");
		organizarPantalla();
		cambioBotones();
		}
		
		
		public void organizarPantalla() {
		root.getChildren().add(p);
		panel.getPnlFamilias().add(boton1,boton2,boton3);
		
		panel.getChildren().add(p);
		boton1.setOnAction(e)
		}
		
		public void cambioBotones() {
			boton1.setOnAction(e->cambioDeColor("PURPLE"));
			boton2.setOnAction(e->cambioDeColor("BLUE"));
			boton3.setOnAction(e->cambioDeColor("BLACK"));
		}

		
		public void cambioDeColor(String color) {
			panel.setBackground(Color.color);
		}

	
}
