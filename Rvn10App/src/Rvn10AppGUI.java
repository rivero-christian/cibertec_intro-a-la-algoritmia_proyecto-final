import java.math.BigDecimal;
import javax.swing.*;
public class Rvn10AppGUI extends JFrame {
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

    static void main() {
        Rvn10AppGUI frame1 = new Rvn10AppGUI();
        frame1.setVisible(true);
    }

    public Rvn10AppGUI() {
        JMenuBar menuBar;
        JMenu menuArchivo, menuMantenimiento, menuVentas, menuConfiguracion, menuAyuda;;
        //JMenuItem menuArchivo,menuMantenimiento,menuVentas, menuConfiguracion, miAyuda;
        JMenuItem mItemSalir, mItemConsultarCPU, mItemModificarCPU, mItemListarCPU, mItemVender, mItemConfigurarDescuentos, mItemConfigurarObsequios, mItemAcercaDe;

        setTitle("Rvn10 Store 1.0");
        setBounds(550, 200, 813, 623);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        menuArchivo=new JMenu("Archivo");
        menuBar.add(menuArchivo);

        mItemSalir = new JMenuItem("Salir");
        //mItemSalir.addActionListener(this);
        menuArchivo.add(mItemSalir);

        menuMantenimiento=new JMenu("Mantenimiento");
        menuBar.add(menuMantenimiento);

        mItemConsultarCPU = new JMenuItem("Consultar CPU");
        //mItemSalir.addActionListener(this);
        menuMantenimiento.add(mItemConsultarCPU);

        mItemModificarCPU = new JMenuItem("Modificar CPU");
        //mItemSalir.addActionListener(this);
        menuMantenimiento.add(mItemModificarCPU);

        mItemListarCPU = new JMenuItem("Listar CPUs");
        //mItemSalir.addActionListener(this);
        menuMantenimiento.add(mItemListarCPU);

        menuVentas=new JMenu("Ventas");
        menuBar.add(menuVentas);

        mItemVender = new JMenuItem("Vender");
        //mItemSalir.addActionListener(this);
        menuVentas.add(mItemVender);

        menuConfiguracion=new JMenu("Configuración");
        menuBar.add(menuConfiguracion);

        mItemConfigurarDescuentos = new JMenuItem("Configurar descuentos");
        //mItemSalir.addActionListener(this);
        menuConfiguracion.add(mItemConfigurarDescuentos);

        mItemConfigurarObsequios = new JMenuItem("Configurar obsequios");
        //mItemSalir.addActionListener(this);
        menuConfiguracion.add(mItemConfigurarObsequios);

        menuAyuda=new JMenu("Ayuda");
        menuBar.add(menuAyuda);

        mItemAcercaDe = new JMenuItem("Acerca de Rvn10 Store");
        //mItemSalir.addActionListener(this);
        menuAyuda.add(mItemAcercaDe);

        getContentPane().setLayout(null);
    }
}
