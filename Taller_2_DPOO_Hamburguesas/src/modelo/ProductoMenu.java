package modelo;





public class ProductoMenu implements Producto{
	// ************************************************************************
	// Atributos
	// ************************************************************************

	/**
	 * El nombre de un producto
	 */
	private String nombre;

	/**
	 * El precio de un producto
	 */
	private int precioBase;
	
	/**
	 * El precio de un producto
	 */
	private int calorias;

	// ************************************************************************
	// Constructores
	// ************************************************************************

	/**
	 * Construye un nuevo producto del menu e inicializa sus atributos con la 
	 * información de los parámetros. 
	 * 
	 * @param elNombre El nombre del producto.
	 * @param elPrecio El precio del producto.
	 * @param lasCalorias Las calorias del producto.
	 */
	public ProductoMenu(String elNombre, int elPrecio, int lasCalorias)
	{
		this.nombre = elNombre;
		this.precioBase = elPrecio;
		this.calorias = lasCalorias;
		
	}

	// ************************************************************************
	// Métodos para consultar los atributos
	// ************************************************************************

	
	
	public int darCalorias()
	{
		return calorias;
	}
	

	@Override
	public int getPrecio() {
		return precioBase;
	}

	@Override
	public String getNombre() {
		
		return nombre;
	}
	@Override
	public String generarTextoFactura() {
		
		String textoFactura="El precio de "+getNombre()+" es de "+getPrecio()+" y las calorias que tiene son "+darCalorias();
		return textoFactura;
	}
	}
