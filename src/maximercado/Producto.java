package maximercado;
public class Producto {
		
		private int productoId;
		private String nombreProd;
		private int precio;
		private boolean stock;
		
		
			public Producto(int productoId,String nombreProd , int precio, boolean stock) {
				this.productoId = productoId;
				this.nombreProd = nombreProd;
				this.precio = precio;
				this.stock = stock;
			}

			
			public int getProductoId() {
				return productoId;
			}




			public void setProductoId(int productoId) {
				this.productoId = productoId;
			}




			public String getNombreProd() {
				return nombreProd;
			}




			public void setNombreProd(String nombreProd) {
				this.nombreProd = nombreProd;
			}




			public int getPrecio() {
				return precio;
			}




			public void setPrecio(int precio) {
				this.precio = precio;
			}




			public boolean isStock() {
				return stock;
			}


			public void setStock(boolean stock) {
				this.stock = stock;
			}

			void mostrar() {
				System.out.println("LISTA DE PRODUCTOS: " + "\n" + nombreProd + "\n" + "$" + precio + "\n" + "STOCK: " + stock);
			}
			
}
