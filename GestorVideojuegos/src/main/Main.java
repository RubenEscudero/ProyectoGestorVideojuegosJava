package main;


import java.awt.GridLayout;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;

import gui.Controlador;
import gui.Modelo;
import gui.Vista;


public class Main {

	public static void main(String[] args) {
		Modelo modelo = new Modelo();
		Composite container;
		Vista vista = new Vista();
		Controlador controlador = new Controlador(vista, modelo);

	}

}
