package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JList;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.JButton;

public class Vista extends JFrame {

	private JPanel contentPane;
	public JMenuBar menuBar;
	public JMenu menuArchivo;
	public JMenuItem menuItemGuardar;
	public JMenuItem menuItemGuardarComo;
	public JMenuItem menuItemAbrir;
	public JMenu menuEditar;
	public JMenuItem menuItemAnadir;
	public JMenuItem menuItemEliminar;
	public JMenuItem menuItemModificar;
	public JList listGames;

	/**
	 * Create the frame.
	 */
	public Vista() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		menuArchivo = new JMenu("Archivo");
		menuBar.add(menuArchivo);
		
		menuItemGuardar = new JMenuItem("Guardar");
		menuArchivo.add(menuItemGuardar);
		
		menuItemGuardarComo = new JMenuItem("Guardar como");
		menuArchivo.add(menuItemGuardarComo);
		
		menuItemAbrir = new JMenuItem("Abrir archivo");
		menuArchivo.add(menuItemAbrir);
		
		menuEditar = new JMenu("Editar colecci\u00F3n");
		menuBar.add(menuEditar);
		
		menuItemAnadir = new JMenuItem("A\u00F1adir juego");
		menuEditar.add(menuItemAnadir);
		
		menuItemEliminar = new JMenuItem("Eliminar juego");
		menuEditar.add(menuItemEliminar);
		
		menuItemModificar = new JMenuItem("Modificar juego");
		menuEditar.add(menuItemModificar);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		listGames = new JList();
		contentPane.add(listGames, BorderLayout.WEST);
		setExtendedState(JFrame.MAXIMIZED_BOTH); 
		setVisible(true);
	}

}
