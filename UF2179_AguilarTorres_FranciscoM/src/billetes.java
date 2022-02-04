import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import net.miginfocom.swing.MigLayout;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;

public class billetes extends JFrame {

	private JPanel contentPane;
	private JTextField txtNombre;
	private JTextField txtApellidos;
	private JTextField txtPrecio;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JRadioButton rdbtnida;
	private JRadioButton rdbtnidayvuelta;
	private JRadioButton rdbtnTarjeta;
	private JComboBox comboBoxOrigen;
	private JComboBox comboBoxDestino;
	private JTextArea txt;
	private JScrollPane scrollPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					billetes frame = new billetes();
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
	public billetes() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		JLabel lblTitulo = new JLabel("Venta de billetes");
		lblTitulo.setBounds(12, 12, 410, 25);
		lblTitulo.setVerticalAlignment(SwingConstants.TOP);
		lblTitulo.setHorizontalAlignment(SwingConstants.LEFT);
		lblTitulo.setForeground(Color.WHITE);
		lblTitulo.setOpaque(true);
		lblTitulo.setBackground(Color.BLACK);
		lblTitulo.setFont(new Font("Tahoma", Font.BOLD, 18));
		contentPane.add(lblTitulo);
		
		JLabel lblOrigen = new JLabel("Origen:");
		lblOrigen.setBounds(22, 44, 46, 14);
		contentPane.add(lblOrigen);
		
		comboBoxOrigen = new JComboBox();
		comboBoxOrigen.setModel(new DefaultComboBoxModel(new String[] {"Adamuz", "And\u00FAjar", "Cabra", "Carde\u00F1a", "Obejo", "Santaella"}));
		comboBoxOrigen.setBounds(78, 40, 333, 22);
		contentPane.add(comboBoxOrigen);
		
		JLabel lblDestino = new JLabel("Destino:");
		lblDestino.setBounds(22, 69, 46, 14);
		contentPane.add(lblDestino);
		
		comboBoxDestino = new JComboBox();
		comboBoxDestino.setModel(new DefaultComboBoxModel(new String[] {"Adamuz", "And\u00FAjar", "Cabra", "Carde\u00F1a", "Obejo", "Santaella"}));
		comboBoxDestino.setBounds(78, 65, 333, 22);
		contentPane.add(comboBoxDestino);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(22, 94, 59, 14);
		contentPane.add(lblNombre);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(78, 91, 80, 20);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);
		
		JLabel lblApellidos = new JLabel("Apellidos:");
		lblApellidos.setBounds(168, 94, 67, 14);
		contentPane.add(lblApellidos);
		
		txtApellidos = new JTextField();
		txtApellidos.setColumns(10);
		txtApellidos.setBounds(228, 91, 183, 20);
		contentPane.add(txtApellidos);
		
		JLabel lblPrize = new JLabel("Precio:");
		lblPrize.setBounds(22, 119, 46, 14);
		contentPane.add(lblPrize);
		
		txtPrecio = new JTextField();
		txtPrecio.setBounds(78, 116, 33, 20);
		contentPane.add(txtPrecio);
		txtPrecio.setColumns(10);
		
		JLabel lblBillete = new JLabel("Billete:");
		lblBillete.setBounds(22, 144, 46, 14);
		contentPane.add(lblBillete);
		
		rdbtnida = new JRadioButton("ida");
		buttonGroup.add(rdbtnida);
		rdbtnida.setSelected(true);
		rdbtnida.setBounds(74, 140, 51, 23);
		contentPane.add(rdbtnida);
		
		rdbtnidayvuelta = new JRadioButton("Ida y vuelta");
		buttonGroup.add(rdbtnidayvuelta);
		rdbtnidayvuelta.setBounds(125, 140, 89, 23);
		contentPane.add(rdbtnidayvuelta);
		
		rdbtnTarjeta = new JRadioButton("Tarjeta Dorada");
		buttonGroup.add(rdbtnTarjeta);
		rdbtnTarjeta.setBounds(216, 140, 109, 23);
		contentPane.add(rdbtnTarjeta);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txt.setText(null);
				if(comboBoxOrigen.getSelectedIndex()==comboBoxDestino.getSelectedIndex()) {
					JOptionPane.showMessageDialog(null, "debe elegir un origen y destino diferentes");

					}else {
					double precio = Double.parseDouble(txtPrecio.getText());
					txt.setText(txt.getText() + "Trayecto: " + comboBoxOrigen.getSelectedItem() + " a " + comboBoxDestino.getSelectedItem());
					txt.setText(txt.getText() + "\n" + "Viajero : " + txtNombre.getText() + " " + txtApellidos.getText() );

					if(rdbtnida.isSelected()) {
					txt.setText(txt.getText() + "\n" + "Precio: " + txtPrecio.getText());
					}else if(rdbtnidayvuelta.isSelected()) {
					txt.setText(txt.getText() + "\n" + "Precio: " + (precio-(precio*0.20)));
					}else {
					txt.setText(txt.getText() + "\n" + "Precio: " + (precio-(precio*0.30)));
					}
					}
				
			}
		});
		btnCalcular.setBounds(153, 170, 89, 23);
		contentPane.add(btnCalcular);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 196, 412, 54);
		contentPane.add(scrollPane);
		
		txt = new JTextArea();
		scrollPane.setViewportView(txt);
	}


	}

	
	
	

