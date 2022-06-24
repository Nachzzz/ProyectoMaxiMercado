package maximercado;

public class Cliente {

		//ATRIBUTOS
		private String nombre;
		private String apellido;
		private int dni;
		private String domicilio;
		private int telefono;
		
			public Cliente(String nombre, String apellido, int dni, String domicilio, int telefono) {
				this.nombre = nombre;
				this.apellido = apellido;
				this.dni = dni;
				this.domicilio = domicilio;
				this.telefono = telefono;
				
			}

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public String getApellido() {
			return apellido;
		}

		public void setApellido(String apellido) {
			this.apellido = apellido;
		}

		public int getDni() {
			return dni;
		}

		public void setDni(int dni) {
			this.dni = dni;
		}

		public String getDomicilio() {
			return domicilio;
		}

		public void setDomicilio(String domicilio) {
			this.domicilio = domicilio;
		}

		public int getTelefono() {
			return telefono;
		}

		public void setTelefono(int telefono) {
			this.telefono = telefono;
		}	
		
		void mostrar( ) {
			System.out.println( "DATOS DEL CLIENTE " + "\n" 
								+ "Nombre: " + nombre + "\n" + "Apellido: " + apellido + "\n" + "DNI: " + dni + "\n" + "Domicilio: " + domicilio + "\n" + "Telefono: " + telefono  );
		} 

}
