package main.java.com.mastela.DniGenerator.service;

import java.io.IOException;

import main.java.com.mastela.DniGenerator.consola.ConsolaService;

public class MenuService
{
	private ConsolaService consolaService;
	private ValidadorService validarService;

	public MenuService ( )
	{
		super ( );
		consolaService = new ConsolaService ( );
		validarService = new ValidadorService ( );
		// TODO Auto-generated constructor stub
	}

	public void ejecutarMenuPrincipal ( ) throws NumberFormatException, IOException
	{

		int opcion = 99;
		while ( opcion != -1 )
		{
			this.mostrarMenu ( );
			opcion = Integer.parseInt ( consolaService.recogerOperacionUsuarioTrasMensaje ( "Seleccione una opcion: " ) );
			switch ( opcion )
			{
			case 1:

				break;
			case 2:

				break;
			case 3:

				break;
			case 4:
				validarService.listarNumeroConSuLetra ( validarService.listaAlgoritmo ( ) );
				break;

			default:
				System.out.printf ( "Opcion incorrecta%n" );
				opcion = 99;
			}
		}

	}

	public void mostrarMenu ( )
	{

		System.out.printf ( "------------------%nMenu NIF%n-----------------%n" );
		System.out.printf ( "1) Generar NIF%n" );
		System.out.printf ( "2) Validar letra NIF%n" );
		System.out.printf ( "3) Calcular letra NIF%n" );
		System.out.printf ( "4) Listar Numero de control asociado a su letra DNI%n" );

	}
}
