package modelo;

public class Ingrediente {
	
	// ************************************************************************
		// Atributos
		// ************************************************************************

		/**
		 * El nombre de un ingrediente
		 */
		private String nombre;

		/**
		 * El precio de un producto
		 */
		private int costoAdicional;
		
		// ************************************************************************
		// Constructores
		// ************************************************************************

		/**
		 * Construye un nuevo ingrediente del menu e inicializa sus atributos con la 
		 * información de los parámetros. 
		 * 
		 * @param elNombre El nombre del ingrediente.
		 * @param elAdicional El precio del ingrediente adicional.
		 */
		public Ingrediente(String elNombre, int elAdicional)
		{
			this.nombre = elNombre;
			this.costoAdicional = elAdicional;
			
			
		}
		
		public String darNombre() {
			return nombre;
		}
		
		public int darAdicional() {
			return costoAdicional;
		}


}
