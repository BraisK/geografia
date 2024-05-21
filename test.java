package geografia;

import java.util.ArrayList;

public class test {
	/**
	 * Metodo main que crea un departamento. Luego, crea varios municipios que se
	 * agregan al departamento y luego calcula el censo de población del
	 * departamento, muestra los municipios con una población mayor a un valor dado
	 * y busca un municipio determinado
	 */
	public static void main(String[] args) {
		Municipio municipio1 = new Municipio("Manizales", 400000, 17, 2200);
		Municipio municipio2 = new Municipio("La Dorada", 98000, 28, 1000);
		Municipio municipio3 = new Municipio("Neira", 30000, 20, 1969);

		ArrayList<Municipio> municipios = new ArrayList();
		municipios.add(municipio1);
		municipios.add(municipio2);
		municipios.add(municipio3);
		Departamento departamento = new Departamento("Caldas", municipios);

		System.out.println("El " + departamento.getNombre() + " tiene una poblacion de:"
				+ departamento.calcularCensoPoblacionDepartamento() + " habitantes.");

		System.out.println("Municipios con población mayor a 50.000");
		departamento.buscarMunicipioConPoblacionMayor(50000);

		System.out.println("Búsqueda del municipio de Manizales");
		Municipio mun = departamento.buscarMunicipio("Manizales");

		Municipio municipio = new Municipio("Hispanity", 300, 16, 48);
		departamento.agregarMunicipio(municipio);

		departamento.listarMunicipios();

		departamento.eliminarMunicipio("Hispanity");

		departamento.listarMunicipios();

	}
}
