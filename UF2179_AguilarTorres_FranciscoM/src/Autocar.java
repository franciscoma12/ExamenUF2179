import java.util.Objects;

/**
 * 
 */

/**
 * @author USUARIO
 *
 */
public class Autocar {
		private String matr�cula;
		private String marca;
		private String modelo;
		private int kil�metros;
		private int num_plazas;
		

		public Autocar() {
			
		}

		public String getMatr�cula() {
		return matr�cula;
		}

		public void setMatr�cula(String matr�cula) {
		this.matr�cula = matr�cula;
		}

		public String getMarca() {
		return marca;
		}

		public void setMarca(String marca) {
		this.marca = marca;
		}


		public String getModelo() {
		return modelo;
		}

		public void setModelo(String modelo) {
		this.modelo = modelo;
		}

		public int getKil�metros() {
		return kil�metros;
		}

		public void setKil�metros(int kil�metros) {
		this.kil�metros = kil�metros;
		}

		public int getNum_plazas() {
		return num_plazas;
		}

		public void setNum_plazas(int num_plazas) {
		this.num_plazas = num_plazas;
		}

		@Override
		public int hashCode() {
			return Objects.hash(matr�cula);
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Autocar other = (Autocar) obj;
			return Objects.equals(matr�cula, other.matr�cula);
		}

		@Override
		public String toString() {
			return "Autocar [matr�cula=" + matr�cula + ", marca=" + marca + ", modelo=" + modelo + ", kil�metros="
					+ kil�metros + ", num_plazas=" + num_plazas + "]";
		}
		

}
