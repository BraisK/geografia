package geografia;

public class Municipio implements Comparable{

	private String nombre;

	private int poblacion;

	private double temperaturaMedia;

	private double altitud;

	public Municipio(String nombre, int poblacion, double temperaturaMedia, double altitud) {

		this.nombre = nombre;
		this.poblacion = poblacion;
		this.temperaturaMedia = temperaturaMedia;
		this.altitud = altitud;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPoblacion() {
		return poblacion;
	}

	public void setPoblacion(int poblacion) {
		this.poblacion = poblacion;
	}

	public double getTemperaturaMedia() {
		return temperaturaMedia;
	}

	public void setTemperaturaMedia(double temperaturaMedia) {
		this.temperaturaMedia = temperaturaMedia;
	}

	public double getAltitud() {
		return altitud;
	}

	public void setAltitud(double altitud) {
		this.altitud = altitud;
	}

	@Override
	public String toString() {
		return "Municipio [nombre=" + nombre + ", poblacion=" + poblacion + ", temperaturaMedia=" + temperaturaMedia
				+ ", altitud=" + altitud + "]";
	}

	public int compareTo(Object o) {
		Municipio obj = (Municipio) o;
		return this.poblacion - obj.getPoblacion();
	}

}
