import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import net.miginfocom.swing.MigLayout;
import javax.swing.JTextField;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;

public class autocares extends JFrame {

	private JPanel contentPane;
	private JTextField txtMatricula;
	private JTextField txtMarca;
	private JTextField txtkm;
	private JTextField txtmodelo;
	private JTextArea txt;
	private ArrayList<Autocar> lista;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					autocares frame = new autocares();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public autocares() {
		lista=new ArrayList<Autocar> ();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTitulo = new JLabel("Gesti\u00F3n autocares");
		lblTitulo.setBounds(12, 12, 410, 19);
		lblTitulo.setFont(new Font("Tahoma", Font.PLAIN, 15));
		contentPane.add(lblTitulo);
		
		JLabel lblMatricula = new JLabel("Matr\u00EDcula:");
		lblMatricula.setBounds(12, 52, 56, 14);
		contentPane.add(lblMatricula);
		
		txtMatricula = new JTextField();
		txtMatricula.setBounds(83, 49, 107, 20);
		contentPane.add(txtMatricula);
		txtMatricula.setColumns(10);
		
		JLabel lblMarca = new JLabel("Marca:");
		lblMarca.setBounds(12, 83, 53, 14);
		contentPane.add(lblMarca);
		
		txtMarca = new JTextField();
		txtMarca.setBounds(83, 80, 107, 20);
		contentPane.add(txtMarca);
		txtMarca.setColumns(10);
		
		JLabel lblKM = new JLabel("Kil\u00F3metros:");
		lblKM.setBounds(13, 114, 65, 14);
		contentPane.add(lblKM);
		
		txtkm = new JTextField();
		txtkm.setBounds(83, 111, 107, 20);
		contentPane.add(txtkm);
		txtkm.setColumns(10);
		
		JLabel lblModelo = new JLabel("Modelo:");
		lblModelo.setBounds(214, 86, 46, 14);
		contentPane.add(lblModelo);
		
		txtmodelo = new JTextField();
		txtmodelo.setBounds(270, 83, 86, 20);
		contentPane.add(txtmodelo);
		txtmodelo.setColumns(10);
		
		JLabel lblPlazas = new JLabel("Plazas:");
		lblPlazas.setBounds(214, 114, 46, 14);
		contentPane.add(lblPlazas);
		
		JSpinner spinner = new JSpinner();
		spinner.setModel(new SpinnerNumberModel(30, 1, 80, 1));
		spinner.setBounds(270, 111, 39, 20);
		contentPane.add(spinner);
		
		JButton btnInsertar = new JButton("Insertar");
		btnInsertar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Autocar a= new Autocar();
				a.setMatrícula(txtMatricula.getText());
				a.setMarca(txtMarca.getText());
				a.setKilómetros(Integer.parseInt(txtkm.getText()));  
				a.setModelo(txtmodelo.getText());
				int num= (Integer)spinner.getValue();
				a.setNum_plazas(num);
				txt.setText(a.toString());
				lista.add(a);
				}
		}
		);
		btnInsertar.setBounds(101, 142, 89, 23);
		contentPane.add(btnInsertar);
		
		JButton btnMostrar = new JButton("Mostrar");
		btnMostrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txt.setText(lista.toString());
				
				
			}
		});
		btnMostrar.setBounds(199, 142, 89, 23);
		contentPane.add(btnMostrar);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 177, 412, 73);
		contentPane.add(scrollPane);
		
		txt = new JTextArea();
		scrollPane.setViewportView(txt);
	}
	
}
