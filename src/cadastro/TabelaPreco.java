package cadastro;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.Font;
import javax.swing.table.DefaultTableModel;

import telas.TelaCotacao;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTabbedPane;

public class TabelaPreco {

	private JFrame frame;
	public static JTable tabelapreco;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TabelaPreco window = new TabelaPreco();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	/**
	 * Create the application.
	 */
	public TabelaPreco() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 531, 460);
	
		frame.getContentPane().setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 0, 515, 139);
		frame.getContentPane().add(scrollPane);
		
		tabelapreco = new JTable();
		tabelapreco.setModel(new DefaultTableModel(
			new Object[][] {
				{new Double(100.0), new Double(37.3), new Double(47.27), new Double(58.51), new Double(72.04), new Double(86.23)},
				{new Double(200.0), new Double(41.14), new Double(51.11), new Double(63.64), new Double(79.58), new Double(93.93)},
				{new Double(400.0), new Double(49.97), new Double(63.64), new Double(76.17), new Double(92.11), new Double(109.83)},
				{new Double(600.0), new Double(61.21), new Double(78.58), new Double(96.1), new Double(114.47), new Double(135.56)},
				{new Double(800.0), new Double(74.74), new Double(91.82), new Double(111.75), new Double(131.97), new Double(156.07)},
				{new Double(1000.0), new Double(85.14), new Double(106.64), new Double(125.42), new Double(149.19), new Double(175.03)},
			},
			new String[] {
				"Distancia/Peso", "10", "20", "40", "60", "100"
			}
		) {
			Class[] columnTypes = new Class[] {
				Double.class, Double.class, Double.class, Double.class, Double.class, Double.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		tabelapreco.getColumnModel().getColumn(0).setPreferredWidth(89);
		tabelapreco.setFont(new Font("Tahoma", Font.BOLD, 14));
		scrollPane.setViewportView(tabelapreco);
	}
}
