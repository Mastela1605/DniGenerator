package main.java.com.mastela.DniGenerator;

import java.io.IOException;

import main.java.com.mastela.DniGenerator.service.MenuService;

public class Main
{

	public static void main ( String[ ] args ) throws IOException
	{
		MenuService menu = new MenuService ( );
		menu.ejecutarMenuPrincipal ( );
	}

}
