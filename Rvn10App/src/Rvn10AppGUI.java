import java.math.BigDecimal;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Rvn10AppGUI extends JFrame implements ActionListener {
    // Constantes:
    private static final String TITULO = "Rvn10 Store 1.0";

    // Datos del procesador #1
    public static String id1 = "proc-001";
    public static String modelo1 = "Core i5-12400F";
    public static String fabricante1 = "Intel";
    BigDecimal precio1 = new BigDecimal("620.00");
    public static int anioFabricacion1 = 2022;
    public static boolean tieneGarantia1 = false;

    // Datos del procesador #2
    public static String id2 = "proc-002";
    public static String modelo2 = "Ryzen 5 5600X";
    public static String fabricante2 = "AMD";
    BigDecimal precio2 = new BigDecimal("552.50");
    public static int anioFabricacion2 = 2020;
    public static boolean tieneGarantia2 = false;

    // Datos del procesador #3
    public static String id3 = "proc-003";
    public static String modelo3 = "Core i9-14900K";
    public static String fabricante3 = "Intel";
    BigDecimal precio3 = new BigDecimal("2198.16");
    public static int anioFabricacion3 = 2023;
    public static boolean tieneGarantia3 = false;

    // Datos del procesador #4
    public static String id4 = "proc-004";
    public static String modelo4 = "Ryzen 7 7800X3D";
    public static String fabricante4 = "AMD";
    BigDecimal precio4 = new BigDecimal("1750.00");
    public static int anioFabricacion4 = 2023;
    public static boolean tieneGarantia4 = false;

    // Datos del procesador #5
    public static String id5 = "proc-005";
    public static String modelo5 = "Ryzen 5 8600G";
    public static String fabricante5 = "AMD";
    BigDecimal precio5 = new BigDecimal("749.00");
    public static int anioFabricacion5 = 2024;
    public static boolean tieneGarantia5 = false;

    // Datos del procesador #6
    public static String id6 = "proc-006";
    public static String modelo6 = "Core Ultra 7 265K";
    public static String fabricante6 = "Intel";
    BigDecimal precio6 = new BigDecimal("1680.50");
    public static int anioFabricacion6 = 2024;
    public static boolean tieneGarantia6 = false;

    // Datos del procesador #7
    public static String id7 = "proc-007";
    public static String modelo7 = "Core i3-12100F";
    public static String fabricante7 = "Intel";
    BigDecimal precio7 = new BigDecimal("395.50");
    public static int anioFabricacion7 = 2022;
    public static boolean tieneGarantia7 = false;

    // Porcentajes de descuento
    public static double porcentaje1 = 5.0;
    public static double porcentaje2 = 7.5;
    public static double porcentaje3 = 10.0;
    public static double porcentaje4 = 12.5;

    // Obsequios
    public static String obsequio1 = "Mousepad";
    public static String obsequio2 = "Mouse + Teclado";
    public static String obsequio3 = "Audifonos";

    // Elementos de la GUI
    JMenuBar menuBar;
    JMenu menuArchivo, menuMantenimiento, menuVentas, menuConfiguracion, menuAyuda;
    JMenuItem miArchivo, miMantenimiento, miVentas, miConfiguracion, miAyuda;
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

        menuArchivo=new JMenu("Archivo");
        menuBar.add(menuArchivo);

        mItemSalir = new JMenuItem("Salir");
        mItemSalir.addActionListener(this);
        menuArchivo.add(mItemSalir);

        menuMantenimiento=new JMenu("Mantenimiento");
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

        menuVentas=new JMenu("Ventas");
        menuBar.add(menuVentas);

        mItemVender = new JMenuItem("Vender");
        mItemVender.addActionListener(this);
        menuVentas.add(mItemVender);

        menuConfiguracion=new JMenu("Configuración");
        menuBar.add(menuConfiguracion);

        mItemConfigurarDescuentos = new JMenuItem("Configurar descuentos");
        mItemConfigurarDescuentos.addActionListener(this);
        menuConfiguracion.add(mItemConfigurarDescuentos);

        mItemConfigurarObsequios = new JMenuItem("Configurar obsequios");
        mItemConfigurarObsequios.addActionListener(this);
        menuConfiguracion.add(mItemConfigurarObsequios);

        menuAyuda = new JMenu("Ayuda");
        menuBar.add(menuAyuda);

        mItemAcercaDe = new JMenuItem("Acerca de");
        mItemAcercaDe.addActionListener(this);
        menuAyuda.add(mItemAcercaDe);

        getContentPane().setLayout(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == mItemAcercaDe) {
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
            JDialog dialogo1 = new JDialog(this, "Consultar CPU");

            dialogo1.setLayout(null);
            dialogo1.setResizable(false);
            dialogo1.setSize(450, 230);
            dialogo1.setLocationRelativeTo(this);
            dialogo1.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);

            JLabel lblModelo = new JLabel("Modelo");
            lblModelo.setBounds(20,10,80,20);
            lblModelo.setBorder(BorderFactory.createLineBorder(Color.RED)); // borrar
            dialogo1.add(lblModelo);

            JComboBox<String> cboModelo = new JComboBox<>();
            cboModelo.addItem(modelo1);
            cboModelo.addItem(modelo2);
            cboModelo.addItem(modelo3);
            cboModelo.addItem(modelo4);
            cboModelo.addItem(modelo5);
            cboModelo.addItem(modelo6);
            cboModelo.addItem(modelo7);
            cboModelo.setBounds(150, 10, 150, 20);

            dialogo1.add(cboModelo);

            JLabel lblId = new JLabel("ID");
            lblId.setBounds(20,40,80,20);
            lblId.setBorder(BorderFactory.createLineBorder(Color.RED)); // borrar
            dialogo1.add(lblId);

            JTextField txtId = new JTextField(id1);
            txtId.setBounds(150,40,150,20);
            txtId.setEditable(false);
            dialogo1.add(txtId);

            JLabel lblFabricante = new JLabel("Fabricante");
            lblFabricante.setBounds(20,70,80,20);
            lblFabricante.setBorder(BorderFactory.createLineBorder(Color.RED)); // borrar
            dialogo1.add(lblFabricante);

            JTextField txtFabricante = new JTextField(fabricante1);
            txtFabricante.setBounds(150,70,150,20);
            txtFabricante.setEditable(false);
            dialogo1.add(txtFabricante);

            JLabel lblPrecio = new JLabel("Precio (S/.)");
            lblPrecio.setBounds(20,100,80,20);
            lblPrecio.setBorder(BorderFactory.createLineBorder(Color.RED)); // borrar
            dialogo1.add(lblPrecio);

            JTextField txtPrecio = new JTextField(precio1.toString());
            txtPrecio.setBounds(150,100,150,20);
            txtPrecio.setEditable(false);
            dialogo1.add(txtPrecio);

            JLabel lblAnio = new JLabel("Año");
            lblAnio.setBounds(20,130,80,20);
            lblAnio.setBorder(BorderFactory.createLineBorder(Color.RED)); // borrar
            dialogo1.add(lblAnio);

            JTextField txtAnio = new JTextField(String.valueOf(anioFabricacion1));
            txtAnio.setEditable(false);
            txtAnio.setBounds(150,130,150,20);
            dialogo1.add(txtAnio);

            JLabel lblGarantia = new JLabel("Garantía");
            lblGarantia.setBounds(20,160,80,20);
            lblGarantia.setBorder(BorderFactory.createLineBorder(Color.RED)); // borrar
            dialogo1.add(lblGarantia);

            JTextField txtGarantia = new JTextField(responderBooleano(tieneGarantia1));
            txtGarantia.setEditable(false);
            txtGarantia.setBounds(150,160,150,20);
            dialogo1.add(txtGarantia);

            JButton btnCerrar = new JButton("Cerrar");
            btnCerrar.setBounds(350,10,80,20);
            btnCerrar.addActionListener(evt -> dialogo1.dispose());

            dialogo1.add(btnCerrar);

            cboModelo.addActionListener(event -> {
                switch (cboModelo.getSelectedIndex()) {
                    case 0:
                        txtId.setText(id1);
                        txtFabricante.setText(fabricante1);
                        txtPrecio.setText(precio1.toString());
                        txtAnio.setText(String.valueOf(anioFabricacion1));
                        txtGarantia.setText(responderBooleano(tieneGarantia1));
                        break;

                    case 1:
                        txtId.setText(id2);
                        txtFabricante.setText(fabricante2);
                        txtPrecio.setText(precio2.toString());
                        txtAnio.setText(String.valueOf(anioFabricacion2));
                        txtGarantia.setText(responderBooleano(tieneGarantia2));
                        break;

                    case 2:
                        txtId.setText(id3);
                        txtFabricante.setText(fabricante3);
                        txtPrecio.setText(precio3.toString());
                        txtAnio.setText(String.valueOf(anioFabricacion3));
                        txtGarantia.setText(responderBooleano(tieneGarantia3));
                        break;

                    case 3:
                        txtId.setText(id4);
                        txtFabricante.setText(fabricante4);
                        txtPrecio.setText(precio4.toString());
                        txtAnio.setText(String.valueOf(anioFabricacion4));
                        txtGarantia.setText(responderBooleano(tieneGarantia4));
                        break;

                    case 4:
                        txtId.setText(id5);
                        txtFabricante.setText(fabricante5);
                        txtPrecio.setText(precio5.toString());
                        txtAnio.setText(String.valueOf(anioFabricacion5));
                        txtGarantia.setText(responderBooleano(tieneGarantia5));
                        break;

                    case 5:
                        txtId.setText(id6);
                        txtFabricante.setText(fabricante6);
                        txtPrecio.setText(precio6.toString());
                        txtAnio.setText(String.valueOf(anioFabricacion6));
                        txtGarantia.setText(responderBooleano(tieneGarantia6));
                        break;

                    case 6:
                        txtId.setText(id7);
                        txtFabricante.setText(fabricante7);
                        txtPrecio.setText(precio7.toString());
                        txtAnio.setText(String.valueOf(anioFabricacion7));
                        txtGarantia.setText(responderBooleano(tieneGarantia7));
                        break;
                }
            });

            dialogo1.setVisible(true);
        }

        if (e.getSource() == mItemModificar) {
            System.out.println("456");
        }

        if (e.getSource() == mItemListar) {
            JDialog dialogo3 = new JDialog(this, "Listado de CPUs");
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

            mostrarCPU(txtArea, id1, modelo1, fabricante1, precio1, anioFabricacion1, tieneGarantia1);
            mostrarCPU(txtArea, id2, modelo2, fabricante2, precio2, anioFabricacion2, tieneGarantia2);
            mostrarCPU(txtArea, id3, modelo3, fabricante3, precio3, anioFabricacion3, tieneGarantia3);
            mostrarCPU(txtArea, id4, modelo4, fabricante4, precio4, anioFabricacion4, tieneGarantia4);
            mostrarCPU(txtArea, id5, modelo5, fabricante5, precio5, anioFabricacion5, tieneGarantia5);
            mostrarCPU(txtArea, id6, modelo6, fabricante6, precio6, anioFabricacion6, tieneGarantia6);
            mostrarCPU(txtArea, id7, modelo7, fabricante7, precio7, anioFabricacion7, tieneGarantia7);

            dialogo3.setSize(520, 450);
            dialogo3.setLocationRelativeTo(this);
            dialogo3.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
            txtArea.setCaretPosition(0);
            dialogo3.setVisible(true);
        }
    }

    public static String responderBooleano(boolean garantia) {
        return garantia ? "Sí" : "No";
    }

    public void mostrarCPU(JTextArea txtArea, String id, String modelo, String fabricante, BigDecimal precio, int anioFabricacion, boolean tieneGarantia) {
        txtArea.append("\n\nID           : " + id + "\n");
        txtArea.append("Modelo       : " + modelo + "\n");
        txtArea.append("Fabricante   : " + fabricante + "\n");
        txtArea.append("Precio       : S/ " + precio + "\n");
        txtArea.append("Fabricación  : " + anioFabricacion + "\n");
        txtArea.append("Garantía     : " + responderBooleano(tieneGarantia));
    }
}
