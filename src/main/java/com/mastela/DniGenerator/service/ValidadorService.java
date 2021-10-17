package main.java.com.mastela.DniGenerator.service;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import main.java.com.mastela.DniGenerator.consola.ConsolaService;
import main.java.com.mastela.DniGenerator.dominio.DatosNif;

public class ValidadorService
{
	private ConsolaService consolaService;

	public ValidadorService ( )
	{
		super ( );
		consolaService = new ConsolaService ( );
		// TODO Auto-generated constructor stub
	}

	public Map < Integer, String > listaAlgoritmo ( )
	{

		Map < Integer, String > listaNumeroLetra = new HashMap <> ( );

		listaNumeroLetra.put ( 0, "T" );
		listaNumeroLetra.put ( 1, "R" );
		listaNumeroLetra.put ( 2, "W" );
		listaNumeroLetra.put ( 3, "A" );
		listaNumeroLetra.put ( 4, "G" );
		listaNumeroLetra.put ( 5, "M" );
		listaNumeroLetra.put ( 6, "Y" );
		listaNumeroLetra.put ( 7, "F" );
		listaNumeroLetra.put ( 8, "P" );
		listaNumeroLetra.put ( 9, "D" );
		listaNumeroLetra.put ( 10, "X" );
		listaNumeroLetra.put ( 11, "B" );
		listaNumeroLetra.put ( 12, "N" );
		listaNumeroLetra.put ( 13, "J" );
		listaNumeroLetra.put ( 14, "Z" );
		listaNumeroLetra.put ( 15, "S" );
		listaNumeroLetra.put ( 16, "Q" );
		listaNumeroLetra.put ( 17, "V" );
		listaNumeroLetra.put ( 18, "H" );
		listaNumeroLetra.put ( 19, "L" );
		listaNumeroLetra.put ( 20, "C" );
		listaNumeroLetra.put ( 21, "K" );
		listaNumeroLetra.put ( 22, "E" );

		return listaNumeroLetra;

	}

	public void listarNumeroConSuLetra ( Map < Integer, String > listaNumeros )
	{

		System.out.printf ( "Estos son los numeros asociados a cada letra%n" );
		for ( Entry < Integer, String > letras : listaNumeros.entrySet ( ) )
		{
			System.out.printf ( "Numero: %d Letra: %s%n", letras.getKey ( ), letras.getValue ( ) );
		}
	}

	public String comprobarLetra ( Map < Integer, String > listaNumeros, Integer resto )
	{

		return listaNumeros.get ( resto );

	}

	public DatosNif obtenerDNI ( ) throws IOException
	{
		DatosNif nif;

		nif = new DatosNif ( );

		nif.setDni ( consolaService.recogerOperacionUsuarioTrasMensaje ( "Introduzca el DNI a validar:%n" ) );

		return nif;
	}

	public Integer calcularResto ( DatosNif nif )
	{
		Integer total = Integer.valueOf ( nif.getDni ( )
				.substring ( 0, 8 ) );

		total = total % 23;

		return total;
	}

	public Integer calcularResto ( String nif )
	{
		Integer total = Integer.valueOf ( nif.substring ( 0, 8 ) );

		total = total % 23;

		return total;
	}

	public Boolean validarLongitudNif ( DatosNif nif )
	{
		if ( nif.getDni ( )
				.length ( ) != 9 )
		{

			return false;
		}
		else
		{
			return true;
		}

	}

	public Boolean validarNumericosNif ( DatosNif nif )
	{
		String nifCalculo = nif.getDni ( )
				.substring ( 0, 8 );

		for ( int i = 0; i < nifCalculo.length ( ); i++ )
		{
			if ( Character.isLetter ( nifCalculo.charAt ( i ) ) )
			{
				return false;
			}
		}

		return true;

	}

	public String generadorDni ( )
	{

//		Random random = new Random ( );
//		return random.
		int min = 10000000;
		int max = 99999999;

		// Generate random int value from 50 to 100
		int random_int = ( int ) Math.floor ( Math.random ( ) * ( max - min + 1 ) + min );
		String valor = String.valueOf ( random_int );
		return valor;
	}

}
