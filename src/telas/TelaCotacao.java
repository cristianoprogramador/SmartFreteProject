package telas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextPane;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.border.TitledBorder;
import javax.swing.SwingConstants;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;

public class TelaCotacao {

	private JFrame frame;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCotacao window = new TelaCotacao();
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
	public TelaCotacao() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1108, 613);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(45, 72, 322, 124);
		panel.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0), 4), "Trecho", TitledBorder.CENTER, TitledBorder.TOP, null, null));
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblDestino = new JLabel("Destino:");
		lblDestino.setBounds(10, 66, 59, 20);
		panel.add(lblDestino);
		lblDestino.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		JLabel lblNewLabel = new JLabel("Origem:");
		lblNewLabel.setBounds(10, 21, 59, 20);
		panel.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(45, 325, 322, 158);
		panel_1.setLayout(null);
		panel_1.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0), 4), "Mercadoria", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		frame.getContentPane().add(panel_1);
		
		JLabel lblPesoDeclarado = new JLabel("Peso Declarado:");
		lblPesoDeclarado.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblPesoDeclarado.setBounds(10, 49, 180, 20);
		panel_1.add(lblPesoDeclarado);
		
		JLabel lblValorNf = new JLabel("Valor Nota Fiscal:");
		lblValorNf.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblValorNf.setBounds(10, 11, 180, 30);
		panel_1.add(lblValorNf);
		
		JLabel lblPesoDeclarado_1 = new JLabel("Peso Aferido (Cubado):");
		lblPesoDeclarado_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblPesoDeclarado_1.setBounds(10, 83, 180, 20);
		panel_1.add(lblPesoDeclarado_1);
		
		JLabel lblPesoDeclarado_1_1 = new JLabel("Peso a Considerar:");
		lblPesoDeclarado_1_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblPesoDeclarado_1_1.setBounds(10, 114, 180, 20);
		panel_1.add(lblPesoDeclarado_1_1);
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setBounds(391, 284, 336, 239);
		panel_2_1.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0), 4), "Informa\u00E7\u00F5es do Destino", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		frame.getContentPane().add(panel_2_1);
		panel_2_1.setLayout(null);
		
		JPanel panel_2_2 = new JPanel();
		panel_2_2.setBounds(746, 72, 336, 411);
		panel_2_2.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0), 4), "Valor do Frete", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		frame.getContentPane().add(panel_2_2);
		panel_2_2.setLayout(null);
		
		JLabel lblNewLabel_1_2 = new JLabel("Total do Frete:");
		lblNewLabel_1_2.setBounds(29, 30, 125, 34);
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		panel_2_2.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("Frete Peso/Volume");
		lblNewLabel_1_2_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_2_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_2_1.setBounds(29, 84, 125, 34);
		panel_2_2.add(lblNewLabel_1_2_1);
		
		JLabel lblTotalFrete = new JLabel("");
		lblTotalFrete.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTotalFrete.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblTotalFrete.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		lblTotalFrete.setBounds(164, 30, 121, 34);
		panel_2_2.add(lblTotalFrete);
		
		JLabel lblTotalFrete_1 = new JLabel("");
		lblTotalFrete_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTotalFrete_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblTotalFrete_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblTotalFrete_1.setBounds(164, 84, 121, 34);
		panel_2_2.add(lblTotalFrete_1);
		
		JLabel lblNewLabel_1_2_1_1 = new JLabel("Frete Valor");
		lblNewLabel_1_2_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_2_1_1.setBounds(29, 129, 125, 34);
		panel_2_2.add(lblNewLabel_1_2_1_1);
		
		JLabel lblTotalFrete_1_1 = new JLabel("");
		lblTotalFrete_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTotalFrete_1_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblTotalFrete_1_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblTotalFrete_1_1.setBounds(164, 129, 121, 34);
		panel_2_2.add(lblTotalFrete_1_1);
		
		JLabel lblNewLabel_1_2_1_2 = new JLabel("Valor Ped\u00E1gio");
		lblNewLabel_1_2_1_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_2_1_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_2_1_2.setBounds(29, 174, 125, 34);
		panel_2_2.add(lblNewLabel_1_2_1_2);
		
		JLabel lblTotalFrete_1_2 = new JLabel("");
		lblTotalFrete_1_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTotalFrete_1_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblTotalFrete_1_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblTotalFrete_1_2.setBounds(164, 174, 121, 34);
		panel_2_2.add(lblTotalFrete_1_2);
		
		JLabel lblNewLabel_1_2_1_3 = new JLabel("Gris/Ademe");
		lblNewLabel_1_2_1_3.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_2_1_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_2_1_3.setBounds(29, 219, 125, 34);
		panel_2_2.add(lblNewLabel_1_2_1_3);
		
		JLabel lblTotalFrete_1_3 = new JLabel("");
		lblTotalFrete_1_3.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTotalFrete_1_3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblTotalFrete_1_3.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblTotalFrete_1_3.setBounds(164, 219, 121, 34);
		panel_2_2.add(lblTotalFrete_1_3);
		
		JLabel lblNewLabel_1_2_1_3_1 = new JLabel("ICMS");
		lblNewLabel_1_2_1_3_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_2_1_3_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_2_1_3_1.setBounds(29, 264, 125, 34);
		panel_2_2.add(lblNewLabel_1_2_1_3_1);
		
		JLabel lblTotalFrete_1_3_1 = new JLabel("");
		lblTotalFrete_1_3_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTotalFrete_1_3_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblTotalFrete_1_3_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblTotalFrete_1_3_1.setBounds(164, 264, 121, 34);
		panel_2_2.add(lblTotalFrete_1_3_1);
		
		JLabel lblNewLabel_1_2_1_3_2 = new JLabel("% Aliquota");
		lblNewLabel_1_2_1_3_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_2_1_3_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_2_1_3_2.setBounds(29, 309, 125, 34);
		panel_2_2.add(lblNewLabel_1_2_1_3_2);
		
		JLabel lblTotalFrete_1_3_2 = new JLabel("");
		lblTotalFrete_1_3_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTotalFrete_1_3_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblTotalFrete_1_3_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblTotalFrete_1_3_2.setBounds(164, 309, 121, 34);
		panel_2_2.add(lblTotalFrete_1_3_2);
		
		JLabel lblNewLabel_2 = new JLabel("Simulador de Frete - SmartFrete 1.0");
		lblNewLabel_2.setBounds(58, 11, 996, 50);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 40));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(lblNewLabel_2);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(377, 72, 350, 201);
		frame.getContentPane().add(scrollPane);
		
		table = new JTable();
		table.setFont(new Font("Tahoma", Font.BOLD, 14));
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Altura", "Largura", "Comprimento", "Qtde Vol."
			}
		));
		scrollPane.setViewportView(table);
	}
}
