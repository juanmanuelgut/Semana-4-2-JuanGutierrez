/**
 * 
 */
package com.ucreativa;

import com.ucreativa.Starbucks.CoffeeBuilder;
import com.ucreativa.Starbucks.Customer;
import com.ucreativa.Starbucks.Starbucks;
import com.ucreativa.Starbucks.StarbucksBuilder;
import com.ucreativa.Starbucks.TeaBuilder;
import com.ucreativa.Starbucks.Water;

/**
 * @author juangutierrez
 *
 */
public class Main {

	/**
	 * 
	 */
	public Main() {
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
			Profesor profesor = new Profesor( "Albus", "Dumbledore", "Griffindor", "Profesor", "Defensa Artes Ocuras", "Orden del Fénix");
			profesor.setProfesorMateria("Director");
			System.out.println(profesor.personaMetodo3());
			System.out.println(profesor.toString());
			
			Estudiante estudiante = new Estudiante("Harry","Potter","Griffindor","Sirius Black","Acebo con una Pluna de Fénix en el centro","6 año");
			estudiante.setEstudianteMentor("Albus Dumbeldore");
			System.out.println(estudiante.estudianteMetodo3());
			System.out.println(estudiante.toString());
			
			
			//Polimorfismo ejemplo 1
			Persona mortifago = new Estudiante("Draco","Malfoy","Slytherin","Tom Riddle","Madera de Espino con centro de Pelo de Unicornio","6 año");
			System.out.println(mortifago.toString());
			
			Vehiculo triciclo = new Vehiculo("rojo", "Energía Humana", "Delantera");
			triciclo.setVehiculoColor("Amarillo");
			System.out.println(triciclo.vehiculoMetodo1());
			System.out.println(triciclo.toString());
			
			Coche kicks = new Coche("negro", "gasolina", "Delantera", "NIssan", "Pennzoil", "Automatica");
			kicks.setCocheMarcaAceite("Valvoline");
			System.out.println(kicks.cocheMetodo1());
			System.out.println(kicks.toString());
			
			Bicicleta bmx = new Bicicleta("azul","Energia Humana", "trasera", "30", "profesionales", "Regular");
			bmx.setBicicletaPlatos("7 Velocidades");
			System.out.println(bmx.bicicletaMetodo2());
			System.out.println(bmx.toString());
			
			
			//Polimorfismo Ejemplo 2
			Vehiculo pickUp = new Coche("Gris", "Diesel", "4X4", "Ford", "Pennzoil", "Manual");
			System.out.println(pickUp.toString());
			
			Vegetal vegetal = new Vegetal("atributo1","atributo2","atributo3");
			vegetal.setVegetalAtributo1("atributo1 cambiado");
			System.out.println(vegetal.vegetalMetodo2(0));
			System.out.println(vegetal.toString());
			
			Arbol arbol = new Arbol("atributoVegetal 1","Atributo Vegetal 2","atributo Vegetal 3",1000,"Cedro","Atributo Arbol 3");
			arbol.setNumeroDeHojas(5248);
			System.out.println(arbol.arbolMetodo3());
			System.out.println(arbol.toString());
			
			Arbusto arbusto = new Arbusto("vegetal Atributo 1", "vegetal Atributo 2", "vegetal Atributo 3", "arbusto Atributo 1", "arbusto Atributo 2", "arbusto Atributo 3");
			arbusto.setArbustoAtributo2("Arbusto Atributo 2 cambiado");
			System.out.println(arbusto.arbustoMetodo2());
			System.out.println(arbusto.toString());
			
			Starbucks starbucks = new Starbucks("Venti","Latte","Atributo 3");
			starbucks.setSize("Grande");
			System.out.println(starbucks.metodoStarbucks3("Buenas tardes"));
			System.out.println(starbucks.toString());
			
			StarbucksBuilder sbBuilder = new StarbucksBuilder("sbAtributo1", "sbAtributo2", "sbAtributo3");
			sbBuilder.setStarbucksBuilderAtributo1("Atributo 1 Modificado");
			System.out.println(sbBuilder.starbucksBuilderMetodo1());
			System.out.println(sbBuilder.toString());
			
			CoffeeBuilder cfBuilder = new CoffeeBuilder("sbBuilder Atributo1", "sbBuilder Atributo2", "sbBuilder Atributo3", "cfBuilder Atributo1", "cfBuilder Atributo2", "cfBuilder Atributo3");
			cfBuilder.setCoffeeBuilderAtributo3("Atributo 3 modificato");
			System.out.println(cfBuilder.coffeBuilderMetodo1("Hola"));
			System.out.println(cfBuilder.toString());
			
			TeaBuilder tBuilder = new TeaBuilder("sbBuilder Atributo1", "sbBuilder Atributo2", "sbBuilder Atributo3", "tBuilder Atributo1", "tBuilder Atributo2", "tBuilder Atributo3");
			tBuilder.setTeaBuilderAtributo1("Atributo 1 modificato");
			System.out.println(tBuilder.teaBuilderMetodo1("Good Morning"));
			System.out.println(tBuilder.toString());
			
			Water water = new Water("water Atributo 1", "water Atributo 2", "water Atributo 3");
			water.setWaterAtributo2("Atributo 2 de Water Modificado");
			System.out.println(water.metodoWater1());
			System.out.println(water.toString());
			
			Customer customer = new Customer("customer Atributo 1", "customer Atributo 2", "customer Atributo 3");
			customer.setCustomerAtributo2("Atributo 2 de Customer Modificado");
			System.out.println(customer.customerMetodo1());
			System.out.println(customer.toString());
	}

}
