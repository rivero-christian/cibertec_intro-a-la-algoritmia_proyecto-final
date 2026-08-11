import java.math.BigDecimal;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Rvn10AppGUI extends JFrame implements ActionListener {
    // Constantes:
    private static final String TITULO = "Rvn10 Store 1.0";

    //VARIABLES GLOBALES:

    // Datos del procesador #1
    public static String id1 = "proc-001";
    public static String modelo1 = "Core i5-12400F";
    public static String fabricante1 = "Intel";
    public static BigDecimal precio1 = new BigDecimal("620.00");
    public static int anioFabricacion1 = 2022;
    public static boolean tieneGarantia1 = true;
    public static int stock1 = 20;

    // Datos del procesador #2
    public static String id2 = "proc-002";
    public static String modelo2 = "Ryzen 5 5600X";
    public static String fabricante2 = "AMD";
    public static BigDecimal precio2 = new BigDecimal("552.50");
    public static int anioFabricacion2 = 2020;
    public static boolean tieneGarantia2 = false;
    public static int stock2 = 135;

    // Datos del procesador #3
    public static String id3 = "proc-003";
    public static String modelo3 = "Core i9-14900K";
    public static String fabricante3 = "Intel";
    public static BigDecimal precio3 = new BigDecimal("2198.16");
    public static int anioFabricacion3 = 2023;
    public static boolean tieneGarantia3 = false;
    public static int stock3 = 19;

    // Datos del procesador #4
    public static String id4 = "proc-004";
    public static String modelo4 = "Ryzen 7 7800X3D";
    public static String fabricante4 = "AMD";
    public static BigDecimal precio4 = new BigDecimal("1750.00");
    public static int anioFabricacion4 = 2023;
    public static boolean tieneGarantia4 = true;
    public static int stock4 = 77;

    // Datos del procesador #5
    public static String id5 = "proc-005";
    public static String modelo5 = "Ryzen 5 8600G";
    public static String fabricante5 = "AMD";
    public static BigDecimal precio5 = new BigDecimal("749.00");
    public static int anioFabricacion5 = 2024;
    public static boolean tieneGarantia5 = false;
    public static int stock5 = 41;

    // Datos del procesador #6
    public static String id6 = "proc-006";
    public static String modelo6 = "Core Ultra 7 265K";
    public static String fabricante6 = "Intel";
    public static BigDecimal precio6 = new BigDecimal("1680.50");
    public static int anioFabricacion6 = 2024;
    public static boolean tieneGarantia6 = true;
    public static int stock6 = 91;

    // Datos del procesador #7
    public static String id7 = "proc-007";
    public static String modelo7 = "Core i3-12100F";
    public static String fabricante7 = "Intel";
    public static BigDecimal precio7 = new BigDecimal("395.50");
    public static int anioFabricacion7 = 2022;
    public static boolean tieneGarantia7 = true;
    public static int stock7 = 82;

    // Porcentajes de descuento
    public static double porcentaje1 = 7.5;
    public static double porcentaje2 = 10.0;
    public static double porcentaje3 = 12.5;
    public static double porcentaje4 = 15.0;

    // Obsequios
    public static String obsequio1 = "Mousepad";
    public static String obsequio2 = "Mouse + Teclado";
    public static String obsequio3 = "Audífonos";

    // Elementos de la GUI
    JMenuBar menuBar;
    JMenu menuArchivo, menuMantenimiento, menuVentas, menuConfiguracion, menuAyuda;
    JMenuItem mItemSalir, mItemConsultar, mItemModificar, mItemListar, mItemVender,
            mItemConfigurarDescuentos, mItemConfigurarObsequios, mItemAcercaDe;

    static void main() {
        Rvn10AppGUI frame1 = new Rvn10AppGUI();
        frame1.setVisible(true);
    }

    public Rvn10AppGUI() {
        setTitle(TITULO);
        setBounds(550, 200, 813, 623);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        menuArchivo = new JMenu("Archivo");
        menuBar.add(menuArchivo);

        mItemSalir = new JMenuItem("Salir");
        mItemSalir.addActionListener(this);
        menuArchivo.add(mItemSalir);

        menuMantenimiento = new JMenu("Mantenimiento");
        menuBar.add(menuMantenimiento);

        mItemConsultar = new JMenuItem("Consultar CPU");
        mItemConsultar.addActionListener(this);
        menuMantenimiento.add(mItemConsultar);

        mItemModificar = new JMenuItem("Modificar CPU");
        mItemModificar.addActionListener(this);
        menuMantenimiento.add(mItemModificar);

        mItemListar = new JMenuItem("Listar CPUs");
        mItemListar.addActionListener(this);
        menuMantenimiento.add(mItemListar);

        menuVentas = new JMenu("Ventas");
        menuBar.add(menuVentas);

        mItemVender = new JMenuItem("Vender");
        mItemVender.addActionListener(this);
        menuVentas.add(mItemVender);

        menuConfiguracion = new JMenu("Configuración");
        menuBar.add(menuConfiguracion);

        mItemConfigurarDescuentos = new JMenuItem("Configurar descuentos");
        mItemConfigurarDescuentos.addActionListener(this);
        menuConfiguracion.add(mItemConfigurarDescuentos);

        mItemConfigurarObsequios = new JMenuItem("Configurar obsequios");
        mItemConfigurarObsequios.addActionListener(this);
        menuConfiguracion.add(mItemConfigurarObsequios);

        menuAyuda = new JMenu("Ayuda");
        menuBar.add(menuAyuda);

        mItemAcercaDe = new JMenuItem("Acerca de Tienda");
        mItemAcercaDe.addActionListener(this);
        menuAyuda.add(mItemAcercaDe);

        getContentPane().setLayout(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == mItemSalir) {
            int respuesta =JOptionPane.showConfirmDialog(
                    this,
                    "¿Estás seguro de que deseas salir?",
                    "Confirmar salida",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.QUESTION_MESSAGE
            );

            if(respuesta == JOptionPane.YES_OPTION)
                dispose();
        }

        if (e.getSource() == mItemConsultar) {
            JDialog dialogo1 = new JDialog(this, "Consultar CPU", true);

            dialogo1.setLayout(null);
            dialogo1.setResizable(false);
            dialogo1.setSize(450, 280);
            dialogo1.setLocationRelativeTo(this);
            dialogo1.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);

            JPanel panelPrincipal = new JPanel();
            panelPrincipal.setLayout(null);
            panelPrincipal.setBounds(10, 10, 420, 225);

            panelPrincipal.setBorder(
                BorderFactory.createEtchedBorder()
            );

            dialogo1.add(panelPrincipal);

            JLabel lblModelo = new JLabel("Modelo");
            lblModelo.setBounds(20,10,100,20);
            lblModelo.setBorder(BorderFactory.createLineBorder(Color.RED)); // borrar
            panelPrincipal.add(lblModelo);

            JComboBox<String> cboModelo = new JComboBox<>();
            cboModelo.addItem(modelo1);
            cboModelo.addItem(modelo2);
            cboModelo.addItem(modelo3);
            cboModelo.addItem(modelo4);
            cboModelo.addItem(modelo5);
            cboModelo.addItem(modelo6);
            cboModelo.addItem(modelo7);
            cboModelo.setBounds(140, 10, 170, 25);

            panelPrincipal.add(cboModelo);

            JLabel lblId = new JLabel("ID");
            lblId.setBounds(20,40,100,20);
            lblId.setBorder(BorderFactory.createLineBorder(Color.RED)); // borrar
            panelPrincipal.add(lblId);

            JTextField txtId = new JTextField(id1);
            txtId.setBounds(140,40,170,25);
            txtId.setEditable(false);
            panelPrincipal.add(txtId);

            JLabel lblFabricante = new JLabel("Fabricante");
            lblFabricante.setBounds(20,70,100,20);
            lblFabricante.setBorder(BorderFactory.createLineBorder(Color.RED)); // borrar
            panelPrincipal.add(lblFabricante);

            JTextField txtFabricante = new JTextField(fabricante1);
            txtFabricante.setBounds(140,70,170,25);
            txtFabricante.setEditable(false);
            panelPrincipal.add(txtFabricante);

            JLabel lblPrecio = new JLabel("Precio (S/.)");
            lblPrecio.setBounds(20,100,100,20);
            lblPrecio.setBorder(BorderFactory.createLineBorder(Color.RED)); // borrar
            panelPrincipal.add(lblPrecio);

            JTextField txtPrecio = new JTextField(precio1.toString());
            txtPrecio.setBounds(140,100,170,25);
            txtPrecio.setEditable(false);
            panelPrincipal.add(txtPrecio);

            JLabel lblAnio = new JLabel("Año");
            lblAnio.setBounds(20,130,100,20);
            lblAnio.setBorder(BorderFactory.createLineBorder(Color.RED)); // borrar
            panelPrincipal.add(lblAnio);

            JTextField txtAnio = new JTextField(String.valueOf(anioFabricacion1));
            txtAnio.setBounds(140,130,170,25);
            txtAnio.setEditable(false);
            panelPrincipal.add(txtAnio);

            JLabel lblGarantia = new JLabel("Garantía");
            lblGarantia.setBounds(20,160,100,20);
            lblGarantia.setBorder(BorderFactory.createLineBorder(Color.RED)); // borrar
            panelPrincipal.add(lblGarantia);

            JTextField txtGarantia = new JTextField(convertirBooleanoATexto(tieneGarantia1));
            txtGarantia.setEditable(false);
            txtGarantia.setBounds(140,160,170,25);
            panelPrincipal.add(txtGarantia);

            JLabel lblStock = new JLabel("Stock");
            lblStock.setBounds(20, 190, 100, 20);
            lblStock.setBorder(BorderFactory.createLineBorder(Color.RED)); // borrar
            panelPrincipal.add(lblStock);

            JTextField txtStock = new JTextField(String.valueOf(stock1));
            txtStock.setBounds(140,190,170,25);
            txtStock.setEditable(false);
            panelPrincipal.add(txtStock);

            JButton btnCerrar = new JButton("Cerrar");
            btnCerrar.setBounds(325,10,85,25);
            btnCerrar.addActionListener(evt -> dialogo1.dispose());

            panelPrincipal.add(btnCerrar);

            cboModelo.addActionListener(event -> {
                switch(cboModelo.getSelectedIndex()) {
                    case 0:
                        txtId.setText(id1);
                        txtFabricante.setText(fabricante1);
                        txtPrecio.setText(precio1.toString());
                        txtAnio.setText(String.valueOf(anioFabricacion1));
                        txtGarantia.setText(convertirBooleanoATexto(tieneGarantia1));
                        txtStock.setText(String.valueOf(stock1));
                        break;

                    case 1:
                        txtId.setText(id2);
                        txtFabricante.setText(fabricante2);
                        txtPrecio.setText(precio2.toString());
                        txtAnio.setText(String.valueOf(anioFabricacion2));
                        txtGarantia.setText(convertirBooleanoATexto(tieneGarantia2));
                        txtStock.setText(String.valueOf(stock2));
                        break;

                    case 2:
                        txtId.setText(id3);
                        txtFabricante.setText(fabricante3);
                        txtPrecio.setText(precio3.toString());
                        txtAnio.setText(String.valueOf(anioFabricacion3));
                        txtGarantia.setText(convertirBooleanoATexto(tieneGarantia3));
                        txtStock.setText(String.valueOf(stock3));
                        break;

                    case 3:
                        txtId.setText(id4);
                        txtFabricante.setText(fabricante4);
                        txtPrecio.setText(precio4.toString());
                        txtAnio.setText(String.valueOf(anioFabricacion4));
                        txtGarantia.setText(convertirBooleanoATexto(tieneGarantia4));
                        txtStock.setText(String.valueOf(stock4));
                        break;

                    case 4:
                        txtId.setText(id5);
                        txtFabricante.setText(fabricante5);
                        txtPrecio.setText(precio5.toString());
                        txtAnio.setText(String.valueOf(anioFabricacion5));
                        txtGarantia.setText(convertirBooleanoATexto(tieneGarantia5));
                        txtStock.setText(String.valueOf(stock5));
                        break;

                    case 5:
                        txtId.setText(id6);
                        txtFabricante.setText(fabricante6);
                        txtPrecio.setText(precio6.toString());
                        txtAnio.setText(String.valueOf(anioFabricacion6));
                        txtGarantia.setText(convertirBooleanoATexto(tieneGarantia6));
                        txtStock.setText(String.valueOf(stock6));
                        break;

                    case 6:
                        txtId.setText(id7);
                        txtFabricante.setText(fabricante7);
                        txtPrecio.setText(precio7.toString());
                        txtAnio.setText(String.valueOf(anioFabricacion7));
                        txtGarantia.setText(convertirBooleanoATexto(tieneGarantia7));
                        txtStock.setText(String.valueOf(stock7));
                        break;
                }
            });

            dialogo1.setVisible(true);
        }

        if (e.getSource() == mItemModificar) {
            JDialog dialogo2 = new JDialog(this, "Modificar CPU", true);

            dialogo2.setLayout(null);
            dialogo2.setResizable(false);
            dialogo2.setSize(450, 280);
            dialogo2.setLocationRelativeTo(this);
            dialogo2.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);

            JLabel lblModelo = new JLabel("Modelo");
            lblModelo.setBounds(20,10,80,20);
            lblModelo.setBorder(BorderFactory.createLineBorder(Color.RED)); // borrar
            dialogo2.add(lblModelo);

            JComboBox<String> cboModelo = new JComboBox<>();
            cboModelo.addItem(modelo1);
            cboModelo.addItem(modelo2);
            cboModelo.addItem(modelo3);
            cboModelo.addItem(modelo4);
            cboModelo.addItem(modelo5);
            cboModelo.addItem(modelo6);
            cboModelo.addItem(modelo7);
            cboModelo.setBounds(150, 10, 150, 20);

            dialogo2.add(cboModelo);

            JLabel lblId = new JLabel("ID");
            lblId.setBounds(20,40,80,20);
            lblId.setBorder(BorderFactory.createLineBorder(Color.RED)); // borrar
            dialogo2.add(lblId);

            JTextField txtId = new JTextField(id1);
            txtId.setBounds(150,40,150,20);
            dialogo2.add(txtId);

            JLabel lblFabricante = new JLabel("Fabricante");
            lblFabricante.setBounds(20,70,80,20);
            lblFabricante.setBorder(BorderFactory.createLineBorder(Color.RED)); // borrar
            dialogo2.add(lblFabricante);

            JTextField txtFabricante = new JTextField(fabricante1);
            txtFabricante.setBounds(150,70,150,20);
            dialogo2.add(txtFabricante);

            JLabel lblPrecio = new JLabel("Precio (S/.)");
            lblPrecio.setBounds(20,100,80,20);
            lblPrecio.setBorder(BorderFactory.createLineBorder(Color.RED)); // borrar
            dialogo2.add(lblPrecio);

            JTextField txtPrecio = new JTextField(precio1.toString());
            txtPrecio.setBounds(150,100,150,20);
            dialogo2.add(txtPrecio);

            JLabel lblAnio = new JLabel("Año");
            lblAnio.setBounds(20,130,80,20);
            lblAnio.setBorder(BorderFactory.createLineBorder(Color.RED)); // borrar
            dialogo2.add(lblAnio);

            JTextField txtAnio = new JTextField(String.valueOf(anioFabricacion1));
            txtAnio.setBounds(150,130,150,20);
            dialogo2.add(txtAnio);

            JLabel lblGarantia = new JLabel("Garantía");
            lblGarantia.setBounds(20,160,80,20);
            lblGarantia.setBorder(BorderFactory.createLineBorder(Color.RED)); // borrar
            dialogo2.add(lblGarantia);

            JComboBox<String> cboGarantia = new JComboBox<>();
            cboGarantia.addItem("Sí");
            cboGarantia.addItem("No");
            cboGarantia.setSelectedIndex(tieneGarantia1 ? 0 : 1);
            cboGarantia.setBounds(150,160,150,20);
            dialogo2.add(cboGarantia);

            JLabel lblStock = new JLabel("Stock");
            lblStock.setBounds(20,190,80,20);
            lblStock.setBorder(BorderFactory.createLineBorder(Color.RED)); // borrar
            dialogo2.add(lblStock);

            JTextField txtStock = new JTextField(String.valueOf(stock1));
            txtStock.setBounds(150,190,150,20);
            dialogo2.add(txtStock);

            JButton btnCerrar = new JButton("Cerrar");
            btnCerrar.setBounds(350,10,85,20);
            btnCerrar.addActionListener(evt -> dialogo2.dispose());
            dialogo2.add(btnCerrar);

            JButton btnGuardar = new JButton("Guardar");
            btnGuardar.setBounds(350,40,85,20);
            btnGuardar.setEnabled(false);
            //btnGuardar.addActionListener(evt -> dialogo2.dispose());
            dialogo2.add(btnGuardar);

            cboModelo.addActionListener(event -> {
                switch (cboModelo.getSelectedIndex()) {
                    case 0:
                        txtId.setText(id1);
                        txtFabricante.setText(fabricante1);
                        txtPrecio.setText(precio1.toString());
                        txtAnio.setText(String.valueOf(anioFabricacion1));
                        cboGarantia.setSelectedIndex(tieneGarantia1 ? 0 : 1);
                        txtStock.setText(String.valueOf(stock1));
                        break;

                    case 1:
                        txtId.setText(id2);
                        txtFabricante.setText(fabricante2);
                        txtPrecio.setText(precio2.toString());
                        txtAnio.setText(String.valueOf(anioFabricacion2));
                        cboGarantia.setSelectedIndex(tieneGarantia2 ? 0 : 1);
                        txtStock.setText(String.valueOf(stock2));
                        break;

                    case 2:
                        txtId.setText(id3);
                        txtFabricante.setText(fabricante3);
                        txtPrecio.setText(precio3.toString());
                        txtAnio.setText(String.valueOf(anioFabricacion3));
                        cboGarantia.setSelectedIndex(tieneGarantia3 ? 0 : 1);
                        txtStock.setText(String.valueOf(stock3));
                        break;

                    case 3:
                        txtId.setText(id4);
                        txtFabricante.setText(fabricante4);
                        txtPrecio.setText(precio4.toString());
                        txtAnio.setText(String.valueOf(anioFabricacion4));
                        cboGarantia.setSelectedIndex(tieneGarantia4 ? 0 : 1);
                        txtStock.setText(String.valueOf(stock4));
                        break;

                    case 4:
                        txtId.setText(id5);
                        txtFabricante.setText(fabricante5);
                        txtPrecio.setText(precio5.toString());
                        txtAnio.setText(String.valueOf(anioFabricacion5));
                        cboGarantia.setSelectedIndex(tieneGarantia5 ? 0 : 1);
                        txtStock.setText(String.valueOf(stock5));
                        break;

                    case 5:
                        txtId.setText(id6);
                        txtFabricante.setText(fabricante6);
                        txtPrecio.setText(precio6.toString());
                        txtAnio.setText(String.valueOf(anioFabricacion6));
                        cboGarantia.setSelectedIndex(tieneGarantia6 ? 0 : 1);
                        txtStock.setText(String.valueOf(stock6));
                        break;

                    case 6:
                        txtId.setText(id7);
                        txtFabricante.setText(fabricante7);
                        txtPrecio.setText(precio7.toString());
                        txtAnio.setText(String.valueOf(anioFabricacion7));
                        cboGarantia.setSelectedIndex(tieneGarantia7 ? 0 : 1);
                        txtStock.setText(String.valueOf(stock7));
                        break;
                }
            });

            dialogo2.setVisible(true);
        }

        if (e.getSource() == mItemListar) {
            JDialog dialogo3 = new JDialog(this, "Listado de CPUs", true);
            dialogo3.setResizable(false);

            JTextArea txtArea = new JTextArea();
            txtArea.setEditable(false);
            txtArea.setFont(new Font("Monospaced", Font.PLAIN, 12));

            JScrollPane scroll = new JScrollPane(txtArea);

            dialogo3.add(scroll);

            txtArea.append("""
            =======================================================================
                                          LISTADO DE CPUs
            =======================================================================
            """);

            mostrarCPU(txtArea, id1, modelo1, fabricante1, precio1, anioFabricacion1, tieneGarantia1, stock1);
            mostrarCPU(txtArea, id2, modelo2, fabricante2, precio2, anioFabricacion2, tieneGarantia2, stock2);
            mostrarCPU(txtArea, id3, modelo3, fabricante3, precio3, anioFabricacion3, tieneGarantia3, stock3);
            mostrarCPU(txtArea, id4, modelo4, fabricante4, precio4, anioFabricacion4, tieneGarantia4, stock4);
            mostrarCPU(txtArea, id5, modelo5, fabricante5, precio5, anioFabricacion5, tieneGarantia5, stock5);
            mostrarCPU(txtArea, id6, modelo6, fabricante6, precio6, anioFabricacion6, tieneGarantia6, stock6);
            mostrarCPU(txtArea, id7, modelo7, fabricante7, precio7, anioFabricacion7, tieneGarantia7, stock7);

            dialogo3.setSize(520, 450);
            dialogo3.setLocationRelativeTo(this);
            dialogo3.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
            txtArea.setCaretPosition(0);
            dialogo3.setVisible(true);
        }

        if(e.getSource() == mItemVender) {
            JDialog dlgVender = new JDialog(this, "Vender", true);

            dlgVender.setResizable(false);
            dlgVender.setLayout(null);
            dlgVender.setResizable(false);
            dlgVender.setSize(600, 400);
            dlgVender.setLocationRelativeTo(this);
            dlgVender.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);

            JLabel lblModelo = new JLabel("Modelo");
            lblModelo.setBounds(20,20,70,20);
            lblModelo.setBorder(BorderFactory.createLineBorder(Color.RED)); // borrar
            dlgVender.add(lblModelo);

            JComboBox<String> cboModelo = new JComboBox<>();
            cboModelo.addItem(modelo1);
            cboModelo.addItem(modelo2);
            cboModelo.addItem(modelo3);
            cboModelo.addItem(modelo4);
            cboModelo.addItem(modelo5);
            cboModelo.addItem(modelo6);
            cboModelo.addItem(modelo7);
            cboModelo.setBounds(120, 20, 150, 20);
            dlgVender.add(cboModelo);

            JLabel lblPrecio = new JLabel("Precio(S/.)");
            lblPrecio.setBounds(20,50,70,20);
            lblPrecio.setBorder(BorderFactory.createLineBorder(Color.RED)); // borrar
            dlgVender.add(lblPrecio);

            JTextField txtPrecio = new JTextField(String.valueOf(precio1));
            txtPrecio.setBounds(120, 50, 150, 20);
            txtPrecio.setEditable(false);
            dlgVender.add(txtPrecio);

            JLabel lblCantidad = new JLabel("Cantidad");
            lblCantidad.setBounds(20,80,70,20);
            lblCantidad.setBorder(BorderFactory.createLineBorder(Color.RED)); // borrar
            dlgVender.add(lblCantidad);

            JTextField txtCantidad = new JTextField();
            txtCantidad.setBounds(120, 80, 150, 20);
            dlgVender.add(txtCantidad);

            JButton btnVender = new JButton("Vender");
            btnVender.setBounds(325, 20, 90, 20);
            //btnVender.addActionListener(evt -> ...);
            dlgVender.add(btnVender);

            JButton btnCerrar = new JButton("Cerrar");
            btnCerrar.setBounds(325, 50, 90, 20);
            btnCerrar.addActionListener(evt -> dlgVender.dispose());
            dlgVender.add(btnCerrar);

            cboModelo.addActionListener(event -> {
                switch (cboModelo.getSelectedIndex()) {
                    case 0:
                        txtPrecio.setText(precio1.toString());
                        break;

                    case 1:
                        txtPrecio.setText(precio2.toString());
                        break;

                    case 2:
                        txtPrecio.setText(precio3.toString());
                        break;

                    case 3:
                        txtPrecio.setText(precio4.toString());
                        break;

                    case 4:
                        txtPrecio.setText(precio5.toString());
                        break;

                    case 5:
                        txtPrecio.setText(precio6.toString());
                        break;

                    case 6:
                        txtPrecio.setText(precio7.toString());
                        break;
                }
            });

            dlgVender.setVisible(true);
        }

        if(e.getSource() == mItemConfigurarDescuentos) {
            JDialog dialogo4 = new JDialog(this, "Configurar descuentos", true);

            dialogo4.setResizable(false);
            dialogo4.setLayout(null);
            dialogo4.setResizable(false);
            dialogo4.setSize(450, 280);
            dialogo4.setLocationRelativeTo(this);
            dialogo4.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);

            JLabel lblUnidades1 = new JLabel("1 a 5 unidades");
            lblUnidades1.setBounds(20,10,150,20);
            lblUnidades1.setBorder(BorderFactory.createLineBorder(Color.RED)); // borrar
            dialogo4.add(lblUnidades1);

            JTextField txtPorcentaje1 = new JTextField(String.valueOf(porcentaje1));
            txtPorcentaje1.setBounds(210, 10, 50, 20);
            dialogo4.add(txtPorcentaje1);

            JLabel lblPorcentaje1 = new JLabel("%");
            lblPorcentaje1.setBounds(270,10,20,20);
            lblPorcentaje1.setBorder(BorderFactory.createLineBorder(Color.RED)); // borrar
            dialogo4.add(lblPorcentaje1);

            JLabel lblUnidades2 = new JLabel("6 a 10 unidades");
            lblUnidades2.setBounds(20,40,150,20);
            lblUnidades2.setBorder(BorderFactory.createLineBorder(Color.RED)); // borrar
            dialogo4.add(lblUnidades2);

            JTextField txtPorcentaje2 = new JTextField(String.valueOf(porcentaje2));
            txtPorcentaje2.setBounds(210, 40, 50, 20);
            dialogo4.add(txtPorcentaje2);

            JLabel lblPorcentaje2 = new JLabel("%");
            lblPorcentaje2.setBounds(270,40,20,20);
            lblPorcentaje2.setBorder(BorderFactory.createLineBorder(Color.RED)); // borrar
            dialogo4.add(lblPorcentaje2);

            JLabel lblUnidades3 = new JLabel("11 a 15 unidades");
            lblUnidades3.setBounds(20,70,150,20);
            lblUnidades3.setBorder(BorderFactory.createLineBorder(Color.RED)); // borrar
            dialogo4.add(lblUnidades3);

            JTextField txtPorcentaje3 = new JTextField(String.valueOf(porcentaje3));
            txtPorcentaje3.setBounds(210, 100, 50, 20);
            dialogo4.add(txtPorcentaje3);

            JLabel lblPorcentaje3 = new JLabel("%");
            lblPorcentaje3.setBounds(270,100,20,20);
            lblPorcentaje3.setBorder(BorderFactory.createLineBorder(Color.RED)); // borrar
            dialogo4.add(lblPorcentaje3);

            JLabel lblUnidades4 = new JLabel("Más de 15 unidades");
            lblUnidades4.setBounds(20,100,150,20);
            lblUnidades4.setBorder(BorderFactory.createLineBorder(Color.RED)); // borrar
            dialogo4.add(lblUnidades4);

            JTextField txtPorcentaje4 = new JTextField(String.valueOf(porcentaje4));
            txtPorcentaje4.setBounds(210, 70, 50, 20);
            dialogo4.add(txtPorcentaje4);

            JLabel lblPorcentaje4 = new JLabel("%");
            lblPorcentaje4.setBounds(270,70,20,20);
            lblPorcentaje4.setBorder(BorderFactory.createLineBorder(Color.RED)); // borrar
            dialogo4.add(lblPorcentaje4);

            JButton btnAceptar = new JButton("Aceptar");
            btnAceptar.setBounds(325, 10, 90, 20);
            //btnAceptar.addActionListener(evt -> ...);
            dialogo4.add(btnAceptar);

            JButton btnCancelar = new JButton("Cancelar");
            btnCancelar.setBounds(325, 40, 90, 20);
            btnCancelar.addActionListener(evt -> dialogo4.dispose());
            dialogo4.add(btnCancelar);

            dialogo4.setVisible(true);
        }

        if(e.getSource() == mItemConfigurarObsequios) {
            JDialog dlgObsequios = new JDialog(this, "Configurar obsequios", true);

            dlgObsequios.setLayout(null);
            dlgObsequios.setResizable(false);
            dlgObsequios.setSize(450, 280);
            dlgObsequios.setLocationRelativeTo(this);
            dlgObsequios.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);

            JLabel lblUnidades1 = new JLabel("1 unidad");
            lblUnidades1.setBounds(20,20,120,20);
            lblUnidades1.setBorder(BorderFactory.createLineBorder(Color.RED)); // borrar
            dlgObsequios.add(lblUnidades1);

            JTextField txtObsequio1 = new JTextField(obsequio1);
            txtObsequio1.setBounds(180, 20, 125, 20);
            dlgObsequios.add(txtObsequio1);

            JLabel lblUnidades2 = new JLabel("2 a 5 unidades");
            lblUnidades2.setBounds(20,50,120,20);
            lblUnidades2.setBorder(BorderFactory.createLineBorder(Color.RED)); // borrar
            dlgObsequios.add(lblUnidades2);

            JTextField txtObsequio2 = new JTextField(obsequio2);
            txtObsequio2.setBounds(180, 50, 125, 20);
            dlgObsequios.add(txtObsequio2);

            JLabel lblUnidades3 = new JLabel("6 a más unidades");
            lblUnidades3.setBounds(20,80,120,20);
            lblUnidades3.setBorder(BorderFactory.createLineBorder(Color.RED)); // borrar
            dlgObsequios.add(lblUnidades3);

            JTextField txtObsequio3 = new JTextField(obsequio3);
            txtObsequio3.setBounds(180, 80, 125, 20);
            dlgObsequios.add(txtObsequio3);

            JButton btnAceptar = new JButton("Aceptar");
            btnAceptar.setBounds(325, 20, 90, 20);
            btnAceptar.addActionListener(evt -> {
                if(txtObsequio1.getText().trim().isEmpty() || txtObsequio2.getText().trim().isEmpty() || txtObsequio3.getText().trim().isEmpty()) {
                    JOptionPane.showMessageDialog(
                        dlgObsequios,
                        "Debe completar todos los campos.",
                        "Advertencia",
                        JOptionPane.WARNING_MESSAGE
                    );
                } else {
                    obsequio1 = normalizarEspacios(txtObsequio1.getText());
                    obsequio2 = normalizarEspacios(txtObsequio2.getText());
                    obsequio3 = normalizarEspacios(txtObsequio3.getText());

                    dlgObsequios.dispose();
                }
            });
            dlgObsequios.add(btnAceptar);

            JButton btnCancelar = new JButton("Cancelar");
            btnCancelar.setBounds(325, 50, 90, 20);
            btnCancelar.addActionListener(evt -> dlgObsequios.dispose());
            dlgObsequios.add(btnCancelar);

            dlgObsequios.setVisible(true);
        }

        if(e.getSource() == mItemAcercaDe) {
            String mensaje = """
            Rvn10 Store
            
            Versión: 1.0

            Equipo de desarrollo:
            - Mg. Christian Rivero Valencia
            - Ing. Sergio Cabrera Cueva

            Teléfono: (+51) 999-999-999
            E-mail: support@rvn10.com

            © 2026 Rvn10 Store
            """;

            JOptionPane.showMessageDialog(
                    this,
                    mensaje,
                    "Acerca de",
                    JOptionPane.INFORMATION_MESSAGE
            );
        }
    }

    public static String convertirBooleanoATexto(boolean garantia) {
        return garantia ? "Sí" : "No";
    }

    public void mostrarCPU(JTextArea txtArea, String id, String modelo, String fabricante, BigDecimal precio, int anioFabricacion, boolean tieneGarantia, int stock) {
        txtArea.append("\n\nID           : " + id + "\n");
        txtArea.append("Modelo       : " + modelo + "\n");
        txtArea.append("Fabricante   : " + fabricante + "\n");
        txtArea.append("Precio       : S/ " + precio + "\n");
        txtArea.append("Fabricación  : " + anioFabricacion + "\n");
        txtArea.append("Garantía     : " + convertirBooleanoATexto(tieneGarantia) + "\n");
        txtArea.append("Stock        : " + stock);
    }

    public String normalizarEspacios(String texto) {
        return texto.replaceAll("\\s+", " ").trim();
    }
}
