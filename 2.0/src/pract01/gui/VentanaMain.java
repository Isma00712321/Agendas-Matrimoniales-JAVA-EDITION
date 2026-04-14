package pract01.gui;

import javax.swing.JFrame;

import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;

import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowStateListener;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Component;
import java.awt.Desktop;
import java.awt.CardLayout;

import javax.swing.JTextField;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JRadioButton;
import javax.swing.JSlider;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

import pract01.modelo.Agenda;
import pract01.modelo.Contacto;
import pract01.modelo.Contacto.Estado;

public class VentanaMain extends JFrame implements ActionListener, WindowStateListener, ChangeListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblInsta;
	private JPanel panelIzquierdo;
	private JButton btnAnhade;
	private JButton btnVer;
	private Component verticalStrut;
	private JButton btnInicio;
	private Component verticalStrut_1;
	private JButton btnCarga;
	private Component verticalStrut_2;
	private JLabel lblNewLabel_1;
	private Component verticalStrut_3;
	private JPanel contenedor;
	private JPanel Inicio;
	private JPanel Anhadecontacto;
	private CardLayout cl;
	private JPanel verAgenda;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_3;
	private JPanel panel;
	private JLabel lblNombre;
	private static JTextField txtNombre;
	private JLabel lblApellidos;
	private static JTextField txtApellidos;
	private JLabel lblCiudad;
	private static JTextField txtCiudad;
	private JLabel lblIg;
	private static JTextField txtIG;
	private JLabel lblNewLabel;
	private static JTextField txtEdad;
	private JRadioButton btnHombre;
	private JRadioButton btnMujer;
	private JLabel lblMadrehijos;
	private static JSlider sliderSingar;
	private JLabel lblMadrehijos_1;
	private static JTextField txtPerfil;
	private JLabel lblNewLabel_5;
	private JButton btnAnhadir;
	private static JSlider sliderMDMH;
	private JButton btnTutorial;
	private JButton btnWeb;
	
	
	
	Contacto c;
	String DEFECTO = "N/A";
	Contacto defecto = new Contacto (DEFECTO, DEFECTO, DEFECTO, DEFECTO, 0, 50, 50, "perfildefecto.png", false);
	private boolean sexo = false;
	private static boolean editar;
	private JTextField MDMH;
	private JTextField Singar;
	private JPanel panel_1;
	private JLabel lblNewLabel_7;
	private JTextField verID;
	private JLabel lblNewLabel_8_1_1;
	private JTextField verIG;
	private JLabel lblEstadoCivil;
	private JTextField verEstado;
	private JLabel lblSingar;
	private JLabel lblMDMH;
	private JLabel lblNewLabel_8_1_1_1;
	private JTextField verEdad;
	private JTextField verMDMH;
	private JTextField verSingar;
	private JLabel lblNewLabel_8;
	private JLabel lblNewLabel_9;
	private JLabel lblNewLabel_10;
	private JTextField verNombre;
	private JTextField verApellidos;
	private JTextField verCiudad;
	private JLabel ImagenPerfil;
	private JLabel lblNewLabel_2;
	
	static Agenda agenda = new Agenda();
	int id = 0;
	
	private JButton btnAnterior;
	private JButton btnSiguiente;
	private JButton btnEditar;
	private JButton btnBuscarID;
	private static JComboBox<?> creaEstado; 
	private JRadioButton verHombre;
	private JRadioButton verMujer;
	private JButton btnIG;
	private JButton btnNombre;
	
	ImageIcon imagen = new ImageIcon("hola");
	private JLabel lblNewLabel_12;
	private JLabel lblNewLabel_13;
	private JLabel lblNewLabel_14;
	private JLabel lblNewLabel_15;
	

	/**
	 * Launch the application.
	 */
	
	

	/**
	 * Create the frame.
	 */
	@SuppressWarnings({ "unchecked", "rawtypes"})
	public VentanaMain() {
		cl = new CardLayout();
		contenedor = new JPanel(cl);
		contenedor.setBounds(130, 53, 477, 420);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 480);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblInsta  = new JLabel("Agendas Matrimoniales");
		lblInsta.setBounds(-11, -11, 618, 64);
		lblInsta.setHorizontalAlignment(SwingConstants.CENTER);
		lblInsta.setFont(new Font("Tahoma", Font.PLAIN, 39));
		lblInsta.setForeground(new Color(255, 255, 255));
		lblInsta.setOpaque(true);
		lblInsta.setBackground(new Color(0, 0, 0));
		contentPane.add(lblInsta);
		
		panelIzquierdo = new JPanel();
		panelIzquierdo.setBounds(-1, 53, 141, 420);
		panelIzquierdo.setBackground(Color.GRAY);
		panelIzquierdo.setPreferredSize(new Dimension(125, 0));
		contentPane.add(panelIzquierdo);
		panelIzquierdo.setLayout(new BoxLayout(panelIzquierdo, BoxLayout.Y_AXIS));
		
		Component verticalStrut_4 = Box.createVerticalStrut(10);
		panelIzquierdo.add(verticalStrut_4);
		
		btnInicio = new JButton("Inicio");
		btnInicio.setAlignmentX(0.5f);
		btnInicio.addActionListener(this);
		panelIzquierdo.add(btnInicio);
		Component verticalStrut_5 = Box.createVerticalStrut(50);
		panelIzquierdo.add(verticalStrut_5);
		btnAnhade = new JButton("Nuevo contacto");
		btnAnhade.addActionListener(this);
		btnAnhade.setAlignmentX(Component.CENTER_ALIGNMENT);
		panelIzquierdo.add(btnAnhade);
		
		verticalStrut = Box.createVerticalStrut(50);
		panelIzquierdo.add(verticalStrut);
		
		btnVer = new JButton("Ver agenda");
		btnVer.setAlignmentX(Component.CENTER_ALIGNMENT);
		btnVer.addActionListener(this);
		panelIzquierdo.add(btnVer);
		
		verticalStrut_1 = Box.createVerticalStrut(50);
		panelIzquierdo.add(verticalStrut_1);
		
		btnCarga = new JButton("Cargar/Guardar");
		btnCarga.setAlignmentX(0.5f);
		btnCarga.addActionListener(this);
		panelIzquierdo.add(btnCarga);
		
		
		verticalStrut_2 = Box.createVerticalStrut(50);
		panelIzquierdo.add(verticalStrut_2);
		
		lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setAlignmentX(Component.CENTER_ALIGNMENT);
		lblNewLabel_1.setIcon(new ImageIcon(VentanaMain.class.getResource("/Recursos/iconogui.png")));
		panelIzquierdo.add(lblNewLabel_1);
		
		verticalStrut_3 = Box.createVerticalStrut(10);
		panelIzquierdo.add(verticalStrut_3);
		

		contentPane.add(contenedor);
		
		
		
		Inicio = new JPanel();
		Inicio.setBackground(new Color(255, 128, 128));
		contenedor.add(Inicio, "Inicio");
		Inicio.setLayout(null);
		
		lblNewLabel_13 = new JLabel("Si quieres ver mas programas  tienes el GitHub oficial");
		lblNewLabel_13.setOpaque(true);
		lblNewLabel_13.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_13.setForeground(Color.BLACK);
		lblNewLabel_13.setBackground(new Color(255, 128, 128));
		lblNewLabel_13.setBounds(58, 180, 342, 14);
		Inicio.add(lblNewLabel_13);
		
		lblNewLabel_12 = new JLabel("Si tienes alguna duda no olvides mirar el tutorial");
		lblNewLabel_12.setOpaque(true);
		lblNewLabel_12.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_12.setForeground(Color.BLACK);
		lblNewLabel_12.setBackground(new Color(255, 128, 128));
		lblNewLabel_12.setBounds(58, 151, 342, 14);
		Inicio.add(lblNewLabel_12);
		
		JLabel lblNewLabel_11 = new JLabel("Bienvenido a Agendas Matrimoniales 2.0!");
		lblNewLabel_11.setBackground(new Color(255, 128, 128));
		lblNewLabel_11.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_11.setForeground(new Color(0, 0, 0));
		lblNewLabel_11.setBounds(58, 126, 342, 14);
		lblNewLabel_11.setOpaque(true);
		Inicio.add(lblNewLabel_11);
		
		lblNewLabel_14 = new JLabel("Esto es una DEMO, para la version completa con contactos");
		lblNewLabel_14.setOpaque(true);
		lblNewLabel_14.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_14.setForeground(Color.BLACK);
		lblNewLabel_14.setBackground(new Color(255, 128, 128));
		lblNewLabel_14.setBounds(58, 205, 342, 14);
		Inicio.add(lblNewLabel_14);
		
		lblNewLabel_15 = new JLabel("ilimitados paga la subscripcion a Codigos Lamsallak+");
		lblNewLabel_15.setOpaque(true);
		lblNewLabel_15.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_15.setForeground(Color.BLACK);
		lblNewLabel_15.setBackground(new Color(255, 128, 128));
		lblNewLabel_15.setBounds(58, 219, 342, 14);
		Inicio.add(lblNewLabel_15);
		
		btnTutorial = new JButton("Tutorial");
		btnTutorial.setBounds(58, 322, 89, 23);
		btnTutorial.addActionListener(this);
		Inicio.add(btnTutorial);
		
		btnWeb = new JButton("Github");
		btnWeb.setBounds(311, 322, 89, 23);
		btnWeb.addActionListener(this);
		Inicio.add(btnWeb);
		
		lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBackground(new Color(240, 240, 240));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_2.setIcon(new ImageIcon(VentanaMain.class.getResource("/Recursos/menuinicio.png")));
		lblNewLabel_2.setBounds(0, 0, 477, 390);
		Inicio.add(lblNewLabel_2);
		
		Anhadecontacto = new JPanel();
		Anhadecontacto.setBackground(Color.WHITE);
		contenedor.add(Anhadecontacto, "Anhadecontacto");
		Anhadecontacto.setLayout(new BorderLayout(0, 0));
		
		lblNewLabel_3 = new JLabel("Anhadir contacto");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		Anhadecontacto.add(lblNewLabel_3, BorderLayout.NORTH);
		
		panel = new JPanel();
		Anhadecontacto.add(panel, BorderLayout.CENTER);
		
		lblNombre = new JLabel("Nombre");
		
		txtNombre = new JTextField();
		txtNombre.setColumns(10);
		
		lblApellidos = new JLabel("Apellidos");
		
		txtApellidos = new JTextField();
		txtApellidos.setColumns(10);
		
		lblCiudad = new JLabel("Ciudad");
		
		txtCiudad = new JTextField();
		txtCiudad.setColumns(10);
		
		lblIg = new JLabel("Instagram: @");
		
		txtIG = new JTextField();
		txtIG.setColumns(10);
		
		lblNewLabel = new JLabel("Edad");
		
		txtEdad = new JTextField();
		txtEdad.setColumns(10);
		
		ButtonGroup sexo = new ButtonGroup();
		btnHombre = new JRadioButton("Hombre");
		btnHombre.addActionListener(this);
		
	    btnMujer = new JRadioButton("Mujer");
	    btnMujer.addActionListener(this);
	    sexo.add(btnHombre);
	    sexo.add(btnMujer);
		
		lblMadrehijos = new JLabel("Nivel de MDMH");
		
		sliderMDMH = new JSlider();
		sliderMDMH.setMajorTickSpacing(25);
		sliderMDMH.setPaintTicks(true);
		sliderMDMH.setPaintLabels(true);
		sliderMDMH.addChangeListener(this);
		
		sliderSingar = new JSlider();
		sliderSingar.setMajorTickSpacing(25);
		sliderSingar.setPaintTicks(true);
		sliderSingar.setPaintLabels(true);
		sliderSingar.addChangeListener(this);
		
		lblMadrehijos_1 = new JLabel("Probabilidades de Singar");
		
		txtPerfil = new JTextField();
		txtPerfil.setColumns(10);
		
		lblNewLabel_5 = new JLabel("Foto de perfil");
		
		creaEstado = new JComboBox();
		creaEstado.setModel(new DefaultComboBoxModel(Estado.values()));
		
		JLabel lblNewLabel_6 = new JLabel("Estado     ");
		
		btnAnhadir = new JButton("Anhadir Contacto");
		btnAnhadir.addActionListener(this);
		
		MDMH = new JTextField();
		MDMH.setEditable(false);
		MDMH.setColumns(10);
		
		Singar = new JTextField();
		Singar.setEditable(false);
		Singar.setColumns(10);
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(100)
							.addComponent(btnHombre)
							.addGap(18)
							.addComponent(btnMujer))
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(10)
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel.createParallelGroup(Alignment.LEADING, false)
									.addGroup(gl_panel.createSequentialGroup()
										.addComponent(lblIg)
										.addPreferredGap(ComponentPlacement.RELATED)
										.addComponent(txtIG, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED)
										.addComponent(lblNewLabel))
									.addGroup(gl_panel.createSequentialGroup()
										.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
											.addComponent(lblCiudad)
											.addGroup(gl_panel.createSequentialGroup()
												.addPreferredGap(ComponentPlacement.RELATED)
												.addComponent(lblNewLabel_6)))
										.addGap(24)
										.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
											.addComponent(creaEstado, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
											.addGroup(gl_panel.createSequentialGroup()
												.addComponent(txtCiudad, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
												.addComponent(lblNewLabel_5)))))
								.addGroup(gl_panel.createSequentialGroup()
									.addComponent(lblNombre)
									.addGap(33)
									.addComponent(txtNombre, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(lblApellidos)))
							.addGap(4)
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addComponent(txtPerfil, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtApellidos, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtEdad, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_panel.createSequentialGroup()
							.addContainerGap()
							.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
								.addGroup(gl_panel.createSequentialGroup()
									.addComponent(lblMadrehijos, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(MDMH, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
									.addGap(71))
								.addGroup(gl_panel.createSequentialGroup()
									.addComponent(sliderMDMH, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.UNRELATED)))
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel.createSequentialGroup()
									.addComponent(lblMadrehijos_1)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(Singar, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE))
								.addComponent(sliderSingar, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(149)
							.addComponent(btnAnhadir)))
					.addContainerGap(98, Short.MAX_VALUE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(6)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(btnHombre)
						.addComponent(btnMujer))
					.addGap(7)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(3)
							.addComponent(lblNombre))
						.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
							.addComponent(txtNombre, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addComponent(lblApellidos)
							.addComponent(txtApellidos, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addGap(18)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(3)
							.addComponent(lblIg))
						.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
							.addComponent(lblNewLabel)
							.addComponent(txtIG, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addComponent(txtEdad, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(lblCiudad)
						.addComponent(txtCiudad, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
							.addComponent(lblNewLabel_5)
							.addComponent(txtPerfil, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addGap(18)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(creaEstado, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_6))
					.addGap(80)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblMadrehijos_1)
						.addComponent(lblMadrehijos)
						.addComponent(Singar, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(MDMH, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(sliderMDMH, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(sliderSingar, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnAnhadir)
					.addGap(33))
		);
		panel.setLayout(gl_panel);
		
		verAgenda = new JPanel();
		contenedor.add(verAgenda, "verAgenda");
		verAgenda.setLayout(new BorderLayout(0, 0));
		
		lblNewLabel_4 = new JLabel("AGENDA");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setBackground(new Color(255, 255, 255));
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_4.setOpaque(true);
		verAgenda.add(lblNewLabel_4, BorderLayout.NORTH);
		
		panel_1 = new JPanel();
		verAgenda.add(panel_1, BorderLayout.CENTER);
		
		lblNewLabel_7 = new JLabel("Id:");
		lblNewLabel_7.setBounds(10, 14, 14, 14);
		
		verID = new JTextField();
		verID.setBounds(28, 11, 25, 20);
		verID.setEditable(false);
		verID.setColumns(10);
		
		lblNewLabel_8_1_1 = new JLabel("Instagram:@");
		lblNewLabel_8_1_1.setBounds(10, 162, 128, 14);
		
		verIG = new JTextField();
		verIG.setBounds(89, 162, 86, 20);
		verIG.setEditable(false);
		verIG.setColumns(10);
		
		lblEstadoCivil = new JLabel("Estado");
		lblEstadoCivil.setBounds(10, 284, 69, 14);
		
		verEstado = new JTextField();
		verEstado.setBounds(89, 284, 86, 20);
		verEstado.setEditable(false);
		verEstado.setColumns(10);
		
		lblSingar = new JLabel("Posibilidades de Singar");
		lblSingar.setBounds(193, 284, 184, 14);
		
		lblMDMH = new JLabel("Nivel MDMH");
		lblMDMH.setBounds(10, 242, 107, 14);
		
		lblNewLabel_8_1_1_1 = new JLabel("Edad");
		lblNewLabel_8_1_1_1.setBounds(10, 202, 43, 14);
		
		verEdad = new JTextField();
		verEdad.setBounds(89, 202, 86, 20);
		verEdad.setEditable(false);
		verEdad.setColumns(10);
		
		verMDMH = new JTextField();
		verMDMH.setBounds(89, 242, 86, 20);
		verMDMH.setEditable(false);
		verMDMH.setColumns(10);
		
		verSingar = new JTextField();
		verSingar.setBounds(334, 281, 86, 20);
		verSingar.setEditable(false);
		verSingar.setColumns(10);
		
		lblNewLabel_8 = new JLabel("Apellidos");
		lblNewLabel_8.setBounds(10, 82, 69, 14);
		
		lblNewLabel_9 = new JLabel("Ciudad");
		lblNewLabel_9.setBounds(10, 122, 69, 14);
		
		lblNewLabel_10 = new JLabel("Nombre");
		lblNewLabel_10.setBounds(10, 42, 69, 14);
		
		verNombre = new JTextField();
		verNombre.setBounds(89, 42, 86, 20);
		verNombre.setEditable(false);
		verNombre.setColumns(10);
		
		verApellidos = new JTextField();
		verApellidos.setBounds(89, 82, 86, 20);
		verApellidos.setEditable(false);
		verApellidos.setColumns(10);
		
		verCiudad = new JTextField();
		verCiudad.setBounds(89, 122, 86, 20);
		verCiudad.setEditable(false);
		verCiudad.setColumns(10);
		panel_1.setLayout(null);
		panel_1.add(lblNewLabel_7);
		panel_1.add(verID);
		panel_1.add(lblNewLabel_10);
		panel_1.add(verNombre);
		panel_1.add(lblNewLabel_8);
		panel_1.add(verApellidos);
		panel_1.add(lblNewLabel_9);
		panel_1.add(verCiudad);
		panel_1.add(lblNewLabel_8_1_1);
		panel_1.add(verIG);
		panel_1.add(lblNewLabel_8_1_1_1);
		panel_1.add(lblEstadoCivil);
		panel_1.add(verEstado);
		panel_1.add(verEdad);
		panel_1.add(lblMDMH);
		panel_1.add(verMDMH);
		panel_1.add(lblSingar);
		panel_1.add(verSingar);
		
		ImagenPerfil = new JLabel("Si ves esto no se ha podido cargar la imagen");
		ImagenPerfil.setFont(new Font("Tahoma", Font.PLAIN, 11));
		ImagenPerfil.setHorizontalAlignment(SwingConstants.CENTER);
		ImagenPerfil.setIcon(new ImageIcon(VentanaMain.class.getResource("/Recursos/perfildefecto.png")));
		ImagenPerfil.setBounds(185, 0, 256, 256);
		panel_1.add(ImagenPerfil);
		
		btnAnterior = new JButton("Anterior");
		btnAnterior.setBounds(28, 309, 128, 23);
		btnAnterior.addActionListener(this);
		panel_1.add(btnAnterior);
		
		btnSiguiente = new JButton("Siguiente");
		btnSiguiente.setBounds(292, 309, 128, 23);
		btnSiguiente.addActionListener(this);
		panel_1.add(btnSiguiente);
		
		btnEditar = new JButton("Editar contacto");
		btnEditar.setBounds(160, 335, 128, 23);
		btnEditar.addActionListener(this);
		panel_1.add(btnEditar);
		
		btnBuscarID = new JButton("Buscar por ID");
		btnBuscarID.setBounds(292, 335, 128, 23);
		btnBuscarID.addActionListener(this);
		panel_1.add(btnBuscarID);
		
		verHombre = new JRadioButton("H");
		verHombre.setEnabled(false);
		verHombre.setBounds(89, 14, 33, 14);
		panel_1.add(verHombre);
		
		verMujer = new JRadioButton("M");
		verMujer.setEnabled(false);
		verMujer.setBounds(123, 14, 52, 14);
		panel_1.add(verMujer);
		
		btnNombre = new JButton("Buscar por nombre");
		btnNombre.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnNombre.setBounds(28, 335, 128, 23);
		btnNombre.addActionListener(this);
		panel_1.add(btnNombre);
		
		btnIG = new JButton("Ver IG");
		btnIG.setBounds(160, 309, 128, 23);
		btnIG.addActionListener(this);
		panel_1.add(btnIG);
		setMinimumSize(new Dimension(600, 400));
		setMaximumSize(new Dimension(600, 400));
		this.addWindowStateListener(this);
		
		
		

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnInicio) {
			cl.show(contenedor, "Inicio");
		}
		else if (e.getSource() == btnAnhade) {
			cl.show(contenedor, "Anhadecontacto");
			editar = false;
			rellenaDatos(defecto);
			if (btnHombre.isSelected() == false && btnMujer.isSelected() == false) {
				btnMujer.setSelected(true);
			}
				
		}
		else if (e.getSource() == btnVer) {
			if (agenda.numContactos() != 0) {
				cl.show(contenedor, "verAgenda");
				muestraContacto(agenda.muestraContacto(id));
			} else {
				JOptionPane.showMessageDialog (null, "Tienes que anhadir contactos \n(Con alguien tendras que hablar)","tonto", JOptionPane.ERROR_MESSAGE);
			}

		}
		else if (e.getSource() == btnCarga) {
			JOptionPane.showMessageDialog (null, "Coming soon :)","Nope", JOptionPane.ERROR_MESSAGE);
		}
		else if (e.getSource() == btnHombre) {
			sexo = true;
			lblMadrehijos.setText("Nivel PDMH");
			
		}
		else if (e.getSource() == btnMujer) {
			sexo = false;
			lblMadrehijos.setText("Nivel MDMH");
		}
		else if (e.getSource() == btnAnhadir) {
			 if (!editar) {
				 c = new Contacto(DEFECTO, DEFECTO, DEFECTO, DEFECTO, 0, 0, 0, DEFECTO, sexo);
				 cambiaContacto (c);
			 }else {
				 cambiaContacto (agenda.muestraContacto(id));
			 }
			
		}
		else if (e.getSource() == btnAnterior) {
			if (id != 0) {
				id--;
				muestraContacto(agenda.muestraContacto(id));
			}
		}
		else if (e.getSource() == btnSiguiente) {
			if (id < agenda.numContactos() - 1) {
				id++;
				muestraContacto(agenda.muestraContacto(id));
			}
		}
		else if (e.getSource() == btnBuscarID) {
			int seleccion = 1; 
			do {
				
				try {
					seleccion = Integer.parseInt(JOptionPane.showInputDialog("hola"));
					id = seleccion;
				} catch (NumberFormatException f) {}
				
			} while (seleccion < 0 || seleccion> agenda.numContactos() - 1);
				
				muestraContacto(agenda.muestraContacto(id));
			
		}
		else if (e.getSource() == btnWeb) {
			if (JOptionPane.showConfirmDialog (null, "Pulsa SI si quieres ver a un programador organico y currante\nPusla NO si quires ver obra de la IA","Si", JOptionPane.YES_NO_OPTION) == 0) {
				buscaWeb("https://github.com/Isma00712321");
			} else {
				buscaWeb("https://javib.es/me");
			}
				
			}
		else if (e.getSource() == btnTutorial) {
			JOptionPane.showMessageDialog (null, "Bienvenido a Agendas Matrimoniales 2.0","Tutorial", JOptionPane.INFORMATION_MESSAGE);
			JOptionPane.showMessageDialog (null, "Esta version incluye mejoras como una GUI mejorada \ny otras funciones","Tutorial", JOptionPane.INFORMATION_MESSAGE);
			JOptionPane.showMessageDialog (null, "Ademas de seguir teniendo un tutorial para \nfaltos como tu","Tonto", JOptionPane.INFORMATION_MESSAGE);
			JOptionPane.showMessageDialog (null, "Las fotos de perfil tienen que estar en el MISMO DIRECTORIO que el programa\n ha de ser una imagen de 256x256, de cualquier formato reconocido","No intentes poner un .webp", JOptionPane.INFORMATION_MESSAGE);
			JOptionPane.showMessageDialog (null, "Y poco mas el resto te las puedes apañar si no tienes 3 años","Adios", JOptionPane.INFORMATION_MESSAGE);
			JOptionPane.showMessageDialog (null, "Diviertete y a ver si encuentras a alguna pituquina que poner aqui","Tutorial", JOptionPane.INFORMATION_MESSAGE);
		}
		else if (e.getSource() == btnEditar) {
			cl.show(contenedor, "Anhadecontacto");
			rellenaDatos(agenda.muestraContacto(id));
			editar = true;
		}
		else if (e.getSource() == btnIG) {
			buscaWeb("https://www.instagram.com/" + c.ig() + "/");
		}
		else if (e.getSource() == btnNombre) {
			String nombre = DEFECTO;
			if (!agenda.buscaContactos(nombre)) {
				 JOptionPane.showMessageDialog (null, "No se ha encontrado ningun contacto con ese nombre","Nope", JOptionPane.ERROR_MESSAGE);
			} else if (agenda.repetidos().size() == 1) {
				c = agenda.muestraContacto(agenda.repetidos().get(0));
				if (JOptionPane.showConfirmDialog (null, "Se ha encontrado un contacto con ese nombre\n" + "nombre: " + c.nombre()+ "\napellidos: " + c.apellidos() + "\nID: " + agenda.recogeId(c) + "\n Quieres ver este contacto?","Si", JOptionPane.YES_NO_OPTION) == 0) {
					id = agenda.recogeId(c);
					muestraContacto (c);
				} else {
					 JOptionPane.showMessageDialog (null, "Entonces para que buscas","Tonto", JOptionPane.ERROR_MESSAGE);
				}
			}else {
				String opciones = "";
				for (Integer n: agenda.repetidos()) {
					c = agenda.muestraContacto(n);
					opciones = (opciones + "apellidos: " + c.apellidos() + " ID: " + agenda.recogeId(c) + "\n");
				}
				int seleccion = 1; 
				do {
					try {
						seleccion = Integer.parseInt(JOptionPane.showInputDialog (null, "Se han econtrado varios contactos con el mismo nombre: \n" + opciones ,"Tonto", JOptionPane.ERROR_MESSAGE));
						id = seleccion;
					} catch (NumberFormatException f) {}
				} while (seleccion < 0 || seleccion> agenda.numContactos() - 1);
				muestraContacto(agenda.muestraContacto(id));
			}
		}
	}


	public void windowStateChanged(WindowEvent e) {
		if (this.getExtendedState() == MAXIMIZED_BOTH) {
			System.out.println("full");
			lblNewLabel_2.setIcon(new ImageIcon(VentanaMain.class.getResource("/Recursos/menugrande.png")));
			
		}
		else {
			System.out.println("no");
			lblNewLabel_2.setIcon(new ImageIcon(VentanaMain.class.getResource("/Recursos/menuinicio.png")));
		}
		
	}
	
	
	private static void cambiaContacto (Contacto c) {
		String nombre;
		String apellidos;
		String ciudad;
		String ig;
		String imagen;
		int edad = 0;
		int madrehijos;
		int posibilidad;
		nombre = txtNombre.getText();
		apellidos = txtApellidos.getText();
		ciudad = txtCiudad.getText();
		ig = txtIG.getText();
		imagen = txtPerfil.getText();
		
		try {
		edad = Integer.parseInt(txtEdad.getText());
		} catch (NumberFormatException e) {
		}
		madrehijos = sliderMDMH.getValue();
		posibilidad = sliderSingar.getValue();
		try {
			c.cambiaDatos(nombre, apellidos, ciudad, ig, edad, madrehijos, posibilidad, imagen);
			c.cambiaEstado((Estado) creaEstado.getSelectedItem());
			if (!editar) {
				if (!agenda.anhadeContacto(c)) {
					JOptionPane.showMessageDialog (null, "Has llegado al maximo de contactos de la demo.\nPaga perro.","Paga", JOptionPane.ERROR_MESSAGE);
				}
			} 
		} catch (Contacto.DatoVacio e) {	
	}
	}
	public void rellenaDatos (Contacto c) {
		txtNombre.setText(c.nombre());
		txtApellidos.setText(c.apellidos());
		txtCiudad.setText(c.ciudad());
		txtIG.setText(c.ig());
		txtPerfil.setText(c.imagen());
		txtEdad.setText(c.edad() + "");
		sliderMDMH.setValue(c.madrehijos());
		sliderSingar.setValue(c.posibilidad());
		btnHombre.setSelected(c.sexo());
		btnMujer.setSelected(!c.sexo());
	}

	@Override
	public void stateChanged(ChangeEvent e) {
		Singar.setText("" + sliderSingar.getValue());
		MDMH.setText("" + sliderMDMH.getValue());
		
	}
	public void buscaWeb(String web) {
		Desktop desktop = Desktop.getDesktop();
		try {
			desktop.browse(new URI(web));
		} catch (IOException | URISyntaxException e1) {
			
		}
	}
	
	public void muestraContacto (Contacto c) {
		int idreal = id;
		verID.setText("" + idreal);
		verNombre.setText(c.nombre());
		verApellidos.setText(c.apellidos());
		verCiudad.setText(c.ciudad());
		verIG.setText(c.ig());
		verEdad.setText("" + c.edad());
		verMDMH.setText(""+ c.madrehijos());
		verSingar.setText("" + c.posibilidad());
		verEstado.setText("" + c.estado());
		verHombre.setSelected(c.sexo());
		verMujer.setSelected(!c.sexo());
		ImageIcon perfil = new ImageIcon (c.imagen());
		ImagenPerfil.setIcon(perfil);

		if (c.sexo()) {
			lblMDMH.setText("Nivel PDMH");
		} else {
			lblMDMH.setText("Nivel MDMH");
		}
	}
}

