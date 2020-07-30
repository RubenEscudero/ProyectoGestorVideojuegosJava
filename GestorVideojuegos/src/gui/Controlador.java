package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Controlador implements ActionListener{
	
	private Modelo modelo;
	private Vista vista;
	
	public Controlador(Vista vista, Modelo modelo) {
		this.vista = vista;
		this.modelo = modelo;
		addActionListener(this);
		
	}
	
	private void addActionListener(ActionListener listener) {
		vista.menuItemAbrir.addActionListener(listener);
		vista.menuItemAbrir.setActionCommand("Abrir");
		vista.menuItemGuardar.addActionListener(listener);
		vista.menuItemGuardar.setActionCommand("Guardar");
		vista.menuItemGuardarComo.addActionListener(listener);
		vista.menuItemGuardarComo.setActionCommand("GuardarComo");
		vista.menuItemAnadir.addActionListener(listener);
		vista.menuItemAnadir.setActionCommand("Anadir");
		vista.menuItemEliminar.addActionListener(listener);
		vista.menuItemEliminar.setActionCommand("Eliminar");
		vista.menuItemModificar.addActionListener(listener);
		vista.menuItemModificar.setActionCommand("Modificar");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		switch (e.getActionCommand()) {
			case "Abrir": 
			try {
				modelo.cargarFichero(abrirArchivo());
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
				break;
				
			case "Guardar": 
				
				break;
				
			case "GuardarComo": 
				
				break;
				
			case "Anadir":
				
				break;
				
			case "Eliminar":
				
				break;
			
			case "Modificar":
				
				break;
			
			default :
				
				break;
		
		}
		
	}
	
	private File abrirArchivo() {
		File file = new File("");
		JFileChooser chooser = new JFileChooser();
		FileNameExtensionFilter filter = new FileNameExtensionFilter("CSV Files", "csv");
		chooser.setFileFilter(filter);
		
		int returnVal = chooser.showOpenDialog(null);
		
		if(returnVal == JFileChooser.APPROVE_OPTION) {
			file = chooser.getSelectedFile();
		}
		return file;
	}

	
}
