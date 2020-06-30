
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public aspect ColorAsp{
	
	
	pointcut callColor(Ventana v ): call(* Ventana.acciones())
	&& target(v)	;
	 
	after(Ventana v) : callColor(v )  {
	        System.out.println("El color utilizado es: " +v.getNombCol());
	}
	
	pointcut mostrarColores(): call(* Actualizacion(..));
	 
	after() : mostrarColores()  {
	        System.out.println("\n\nSE HA MOSTRADO EL ARREGLO ACTUALIZADO\n");
	}
	
}