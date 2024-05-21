package geografia;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Departamento {

	private String nombre;
	private ArrayList<Municipio> municipios;

	public Departamento(String nombre, ArrayList<Municipio> municipios) {
		this.nombre = nombre;
		this.municipios = municipios;
		Collections.sort(this.municipios);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<Municipio> getMunicipios() {
		return municipios;
	}

	public void setMunicipios(ArrayList<Municipio> municipios) {
		this.municipios = municipios;
	}

	public void agregarMunicipio(Municipio municipio) {
		municipios.add(municipio);
	}

	public Municipio buscarMunicipio(String nombre) {
		Municipio mun = null;
		for (Municipio m : municipios) {
			if (m.getNombre().equals(nombre)) {
				mun = m;
				System.out.println(m.toString());
			}
		}
		return mun;
	}

	public void eliminarMunicipio(String nombre) {
		municipios.remove(buscarMunicipio(nombre));
	}

	public void buscarMunicipioConPoblacionMayor(int poblacion) {
		for (Municipio m : municipios) {
			if (m.getPoblacion() >= poblacion) {
				System.out.println(m.toString());
			}
		}
	}

	public int calcularCensoPoblacionDepartamento() {
		int cen = 0;
		for (Municipio municipio : municipios) {
			cen += municipio.getPoblacion();
		}
		return cen;
	}

	public void listarMunicipios() {
		System.out.println(this.nombre);
		System.out.println("-------------------");
		for (int i = 0; i < municipios.size(); i++) {
			System.out.println(municipios.get(i));
		}
	}
}
