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

public class TabelaPreco {

	private JFrame frame;
	private JTable tabelapreco;

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
		frame.setBounds(100, 100, 627, 460);
	
		frame.getContentPane().setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 0, 612, 384);
		frame.getContentPane().add(scrollPane);
		
		tabelapreco = new JTable();
		tabelapreco.setModel(new DefaultTableModel(
			new Object[][] {
				{"100", "37.3", "47.27", "58.51", "72.04", "86.23"},
				{"200", "41.14", "51.11", "63.64", "79.58", "93.93"},
				{"400", "49.97", "63.64", "76.17", "92.11", "109.83"},
				{"600", "61.21", "78.58", "96.10", "114.47", "135.56"},
				{"800", "74.74", "91.82", "111.75", "131.97", "156.07"},
				{"1000", "85.14", "106.64", "125.42", "149.19", "175.03"},
			},
			new String[] {
				"Distancia/Peso", "10", "20", "40", "60", "100"
			}
		) {
			boolean[] columnEditables = new boolean[] {
				false, false, false, false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		tabelapreco.getColumnModel().getColumn(0).setPreferredWidth(89);
		tabelapreco.setFont(new Font("Tahoma", Font.BOLD, 14));
		scrollPane.setViewportView(tabelapreco);
	}
}
