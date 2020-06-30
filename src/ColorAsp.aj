

public aspect ColorAsp {
	pointcut callColor(Ventana v ): call(* Ventana.acciones())
	&& target(v)	;
	 
	after(Ventana v) : callColor(v )  {
	        System.out.println("El color utilizado es: " +v.getNombCol());
	}
	
	        
    
}

