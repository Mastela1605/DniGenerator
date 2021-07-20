package main.java.com.mastela.DniGenerator.consola;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsolaService
{
	private BufferedReader reader;

	public ConsolaService ( )
	{
		super ( );
		reader = new BufferedReader ( new InputStreamReader ( System.in ) );
	}

	public String recogerOperacionUsuarioTrasMensaje ( String mensaje ) throws IOException
	{

		System.out.printf ( mensaje );

		return reader.readLine ( );
	}
}