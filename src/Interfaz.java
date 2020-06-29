
public class Interfaz {
		
		private VBox panel= new VBox();
		private HBOx p=new HBox();
		private Button boton1= new Button("boton 1");
		private Button boton2= new Button("boton 2");
		private Button boton3= new Button("boton 3");
		
		public void organizarPantalla() {
			
		p.getChildren().add(boton1,boton2,boton3);
		panel.getChildren().add(p);
		boton1.setOnAction(e)
		
		}
		
		public void cambioBotones() {
		
			boton1.setOnAction(e->cambioDeColor);
			boton2.setOnAction(e->cambioDeColor);
			boton3.setOnAction(e->cambioDeColor);
			
		}

		public void cambioDeColor() {
			
			
			
		}

	
}
