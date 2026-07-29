import java.math.BigDecimal;
import javax.swing.*;
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
    JMenuItem mItemSalir, mItemConsultarCPU, mItemModificarCPU, mItemListarCPU, mItemVender,
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

        mItemConsultarCPU = new JMenuItem("Consultar CPU");
        mItemConsultarCPU.addActionListener(this);
        menuMantenimiento.add(mItemConsultarCPU);

        mItemModificarCPU = new JMenuItem("Modificar CPU");
        mItemModificarCPU.addActionListener(this);
        menuMantenimiento.add(mItemModificarCPU);

        mItemListarCPU = new JMenuItem("Listar CPUs");
        mItemListarCPU.addActionListener(this);
        menuMantenimiento.add(mItemListarCPU);

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

        if (e.getSource() == mItemConsultarCPU) {
            JDialog dialogo1 = new JDialog(this);
            dialogo1.setBounds(200,200,500,500);
            dialogo1.setVisible(true);
            dialogo1.setTitle("Consultar CPU");

            JLabel modeloLbl = new JLabel("Modelo");
            modeloLbl.setBounds(100,75,50,50);
            dialogo1.add(modeloLbl);


        }

        if (e.getSource() == mItemModificarCPU) {
            System.out.println("456");
        }

        if (e.getSource() == mItemListarCPU) {
            JDialog dialogo3 = new JDialog(this);
            //dialogo3.setBounds( ,200,500,500);
            dialogo3.setSize(400, 400);
            dialogo3.setLocationRelativeTo(this);
            dialogo3.setVisible(true);
            dialogo3.setTitle("Listado de CPUs");

            JTextArea txtArea = new JTextArea();
            txtArea.setBounds(100,100, 200,200);
            dialogo3.add(txtArea);
            txtArea.append("LISTADO DE CPUS\n\n");

            txtArea.append("ID:         : "+id1+"\n");
            txtArea.append("Modelo      : "+modelo1+"\n");
            txtArea.append("Fabricante  : "+fabricante1+"\n");
            txtArea.append("Precio      : "+precio1+"\n");
            txtArea.append("Fabricación : "+anioFabricacion1+"\n");
            txtArea.append("Garantía    : "+responderBooleano(tieneGarantia1)+"\n\n");

            txtArea.append("ID:         : "+id2+"\n");
            txtArea.append("Modelo      : "+modelo2+"\n");
            txtArea.append("Fabricante  : "+fabricante2+"\n");
            txtArea.append("Precio      : "+precio2+"\n");
            txtArea.append("Fabricación : "+anioFabricacion2+"\n");
            txtArea.append("Garantía    : "+responderBooleano(tieneGarantia2)+"\n\n");

            txtArea.append("ID:         : "+id3+"\n");
            txtArea.append("Modelo      : "+modelo3+"\n");
            txtArea.append("Fabricante  : "+fabricante3+"\n");
            txtArea.append("Precio      : "+precio3+"\n");
            txtArea.append("Fabricación : "+anioFabricacion3+"\n");
            txtArea.append("Garantía    : "+responderBooleano(tieneGarantia3)+"\n\n");

            txtArea.append("ID:         : "+id4+"\n");
            txtArea.append("Modelo      : "+modelo4+"\n");
            txtArea.append("Fabricante  : "+fabricante4+"\n");
            txtArea.append("Precio      : "+precio4+"\n");
            txtArea.append("Fabricación : "+anioFabricacion4+"\n");
            txtArea.append("Garantía    : "+responderBooleano(tieneGarantia4)+"\n\n");

            txtArea.append("ID:         : "+id5+"\n");
            txtArea.append("Modelo      : "+modelo5+"\n");
            txtArea.append("Fabricante  : "+fabricante5+"\n");
            txtArea.append("Precio      : "+precio5+"\n");
            txtArea.append("Fabricación : "+anioFabricacion5+"\n");
            txtArea.append("Garantía    : "+responderBooleano(tieneGarantia5)+"\n\n");

            txtArea.append("ID:         : "+id6+"\n");
            txtArea.append("Modelo      : "+modelo6+"\n");
            txtArea.append("Fabricante  : "+fabricante6+"\n");
            txtArea.append("Precio      : "+precio6+"\n");
            txtArea.append("Fabricación : "+anioFabricacion6+"\n");
            txtArea.append("Garantía    : "+responderBooleano(tieneGarantia6)+"\n\n");

            txtArea.append("ID:         : "+id7+"\n");
            txtArea.append("Modelo      : "+modelo7+"\n");
            txtArea.append("Fabricante  : "+fabricante7+"\n");
            txtArea.append("Precio      : "+precio7+"\n");
            txtArea.append("Fabricación : "+anioFabricacion7+"\n");
            txtArea.append("Garantía    : "+responderBooleano(tieneGarantia7)+"\n\n");
        }
    }

    public static String responderBooleano(boolean garantia) {
        if (garantia)
            return "Sí";
        else
            return "No";
    }
}
