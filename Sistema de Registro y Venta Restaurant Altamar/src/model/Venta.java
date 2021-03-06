package model;

public class Venta {
	private String CodigoVenta;
	private String CodigoCliente;
	private String NombreCliente;
	private int TipoPedido;
	private String Pedido;
	private int cantidad;
	private String userV;
	
	
	public Venta(String codigoVenta, String codigoCliente, String nombreCliente, int tipoPedido, String pedido,
			int cantidad, String userV) {
		super();
		CodigoVenta = codigoVenta;
		CodigoCliente = codigoCliente;
		NombreCliente = nombreCliente;
		TipoPedido = tipoPedido;
		Pedido = pedido;
		this.cantidad = cantidad;
		this.userV = userV;
	}

	public Venta(String pedido) {
		super();
		Pedido = pedido;
	}

	public Venta(int tipoPedido, String pedido) {
		super();
		TipoPedido = tipoPedido;
		Pedido = pedido;
	}



	public Venta(int tipoPedido) {
		super();
		TipoPedido = tipoPedido;
	}

	

	public Venta(String codigoVenta, String userV) {
		super();
		CodigoVenta = codigoVenta;
		this.userV = userV;
	}

	public Venta() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getCodigoVenta() {
		return CodigoVenta;
	}
	public void setCodigoVenta(String codigoVenta) {
		CodigoVenta = codigoVenta;
	}
	public String getCodigoCliente() {
		return CodigoCliente;
	}
	public void setCodigoCliente(String codigoCliente) {
		CodigoCliente = codigoCliente;
	}
	public String getNombreCliente() {
		return NombreCliente;
	}
	public void setNombreCliente(String nombreCliente) {
		NombreCliente = nombreCliente;
	}
	public int getTipoPedido() {
		return TipoPedido;
	}
	public void setTipoPedido(int tipoPedido) {
		TipoPedido = tipoPedido;
	}
	public String getPedido() {
		return Pedido;
	}
	public void setPedido(String pedido) {
		Pedido = pedido;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public String getUserV() {
		return userV;
	}
	public void setUserV(String userV) {
		this.userV = userV;
	}
	public String toString(){
		return this.Pedido;
	}

	
	
	
	
	
	
}
