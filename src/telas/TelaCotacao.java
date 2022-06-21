package telas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextPane;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.border.TitledBorder;
import javax.swing.SwingConstants;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import cadastro.TabelaPreco;

import javax.swing.JScrollPane;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class TelaCotacao {

	private JFrame frame;
	private JTable table;
	private JTextField txtNF;
	private JTextField txtPeso;
	private JTextField txtAltura;
	private JTextField txtLargura;
	private JTextField txtQtdeVolume;
	private JTextField txtComprimento;

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
		panel.setBounds(10, 72, 322, 124);
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
		
		JComboBox jCmbOrigem = new JComboBox();
		jCmbOrigem.setModel(new DefaultComboBoxModel(new String[] {"Selecione a Cidade...", "Ribeirao Preto"}));
		jCmbOrigem.setFont(new Font("Tahoma", Font.PLAIN, 17));
		jCmbOrigem.setBounds(103, 22, 185, 26);
		panel.add(jCmbOrigem);
		

		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 207, 322, 158);
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
		
		txtNF = new JTextField("0");
		txtNF.setHorizontalAlignment(SwingConstants.RIGHT);
		txtNF.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtNF.setColumns(10);
		txtNF.setBounds(191, 18, 106, 20);
		panel_1.add(txtNF);
		
		txtPeso = new JTextField("0");
		txtPeso.setHorizontalAlignment(SwingConstants.RIGHT);
		txtPeso.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtPeso.setColumns(10);
		txtPeso.setBounds(191, 51, 106, 20);
		panel_1.add(txtPeso);
		
		JLabel lblCubagem = new JLabel("");
		lblCubagem.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCubagem.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblCubagem.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblCubagem.setBounds(191, 80, 106, 20);
		panel_1.add(lblCubagem);
		
		JLabel lblPesoConsiderado = new JLabel("");
		lblPesoConsiderado.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPesoConsiderado.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblPesoConsiderado.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblPesoConsiderado.setBounds(191, 114, 106, 20);
		panel_1.add(lblPesoConsiderado);
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setBounds(371, 284, 336, 239);
		panel_2_1.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0), 4), "Informa\u00E7\u00F5es do Destino", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		frame.getContentPane().add(panel_2_1);
		panel_2_1.setLayout(null);
		
		JLabel lblPesoDeclarado_1_2 = new JLabel("Distancia (KM):");
		lblPesoDeclarado_1_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblPesoDeclarado_1_2.setBounds(69, 205, 118, 20);
		panel_2_1.add(lblPesoDeclarado_1_2);
		
		JLabel lblDistancia = new JLabel("");
		lblDistancia.setHorizontalAlignment(SwingConstants.RIGHT);
		lblDistancia.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblDistancia.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblDistancia.setBounds(197, 205, 107, 20);
		panel_2_1.add(lblDistancia);
		
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
		
		JLabel lblFretePeso = new JLabel("");
		lblFretePeso.setHorizontalAlignment(SwingConstants.RIGHT);
		lblFretePeso.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblFretePeso.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblFretePeso.setBounds(164, 84, 121, 34);
		panel_2_2.add(lblFretePeso);
		
		JLabel lblNewLabel_1_2_1_1 = new JLabel("Frete Valor");
		lblNewLabel_1_2_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_2_1_1.setBounds(29, 129, 125, 34);
		panel_2_2.add(lblNewLabel_1_2_1_1);
		
		JLabel lblFreteNF = new JLabel("");
		lblFreteNF.setHorizontalAlignment(SwingConstants.RIGHT);
		lblFreteNF.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblFreteNF.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblFreteNF.setBounds(164, 129, 121, 34);
		panel_2_2.add(lblFreteNF);
		
		JLabel lblNewLabel_1_2_1_2 = new JLabel("Valor Ped\u00E1gio");
		lblNewLabel_1_2_1_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_2_1_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_2_1_2.setBounds(29, 174, 125, 34);
		panel_2_2.add(lblNewLabel_1_2_1_2);
		
		JLabel lblPedagio = new JLabel("");
		lblPedagio.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPedagio.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblPedagio.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblPedagio.setBounds(164, 174, 121, 34);
		panel_2_2.add(lblPedagio);
		
		JLabel lblNewLabel_1_2_1_3 = new JLabel("Gris/Ademe");
		lblNewLabel_1_2_1_3.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_2_1_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_2_1_3.setBounds(29, 219, 125, 34);
		panel_2_2.add(lblNewLabel_1_2_1_3);
		
		JLabel lblGris = new JLabel("");
		lblGris.setHorizontalAlignment(SwingConstants.RIGHT);
		lblGris.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblGris.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblGris.setBounds(164, 219, 121, 34);
		panel_2_2.add(lblGris);
		
		JLabel lblNewLabel_1_2_1_3_1 = new JLabel("ICMS");
		lblNewLabel_1_2_1_3_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_2_1_3_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_2_1_3_1.setBounds(29, 264, 125, 34);
		panel_2_2.add(lblNewLabel_1_2_1_3_1);
		
		JLabel lblICMS = new JLabel("");
		lblICMS.setHorizontalAlignment(SwingConstants.RIGHT);
		lblICMS.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblICMS.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblICMS.setBounds(164, 264, 121, 34);
		panel_2_2.add(lblICMS);
		
		JLabel lblNewLabel_1_2_1_3_2 = new JLabel("% Aliquota");
		lblNewLabel_1_2_1_3_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_2_1_3_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_2_1_3_2.setBounds(29, 309, 125, 34);
		panel_2_2.add(lblNewLabel_1_2_1_3_2);
		
		JLabel lblAliquota = new JLabel("");
		lblAliquota.setHorizontalAlignment(SwingConstants.RIGHT);
		lblAliquota.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblAliquota.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblAliquota.setBounds(164, 309, 121, 34);
		panel_2_2.add(lblAliquota);
		
		JLabel lblNewLabel_2 = new JLabel("Simulador de Frete - SmartFrete 1.0");
		lblNewLabel_2.setBounds(58, 11, 996, 50);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 40));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(lblNewLabel_2);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(342, 72, 394, 201);
		frame.getContentPane().add(scrollPane);
		
		table = new JTable();
		table.setFont(new Font("Tahoma", Font.BOLD, 14));
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Altura", "Largura", "Comprimento", "Qtde Vol.", "Peso\u00B3"
			}
		) {
			Class[] columnTypes = new Class[] {
				Object.class, Object.class, Object.class, Object.class, Double.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		scrollPane.setViewportView(table);
		
		JComboBox jCmbDestino = new JComboBox();
		jCmbDestino.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (jCmbDestino.getSelectedItem().equals("Ribeirao Preto")) {
					lblDistancia.setText("1");}
				if (jCmbDestino.getSelectedItem().equals("Sao Paulo")) {
					lblDistancia.setText("316");}
				if (jCmbDestino.getSelectedItem().equals("Curitiba")) {
					lblDistancia.setText("713");}
				if (jCmbDestino.getSelectedItem().equals("Belo Horizonte")) {
					lblDistancia.setText("540");}
				if (jCmbDestino.getSelectedItem().equals("Rio de Janeiro")) {
					lblDistancia.setText("717");}
			}
		});
		jCmbDestino.setModel(new DefaultComboBoxModel(new String[] {"Selecione a Cidade...", "Ribeirao Preto", "Sao Paulo", "Curitiba", "Belo Horizonte", "Rio de Janeiro"}));
		jCmbDestino.setFont(new Font("Tahoma", Font.PLAIN, 17));
		jCmbDestino.setBounds(103, 67, 185, 26);
		panel.add(jCmbDestino);
		
		JButton jbtnCalcular = new JButton("Calcular");
		jbtnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
//------------------------Calcular Frete Valor (calculo mais basico) --------------------
	
				double fretevalor = Double.parseDouble(txtNF.getText()) * 0.005;
				String fretevalortxt = String.format("%.2f", fretevalor);
				lblFreteNF.setText(fretevalortxt);
				
				
				
				
//------------------------Aliquota --------------------
				
				lblAliquota.setText("12%");
				
//------------------------Aliquota --------------------
				
				lblPedagio.setText("4,85");				
				
				
				//lblAliquota
				//lblICMS
				
			}
		});
		jbtnCalcular.setFont(new Font("Tahoma", Font.PLAIN, 17));
		jbtnCalcular.setBounds(756, 500, 96, 23);
		frame.getContentPane().add(jbtnCalcular);
		
		JButton jbtnLimpar = new JButton("Limpar");
		jbtnLimpar.setFont(new Font("Tahoma", Font.PLAIN, 17));
		jbtnLimpar.setBounds(877, 500, 89, 23);
		frame.getContentPane().add(jbtnLimpar);
		
		JButton jbtnSair = new JButton("Sair");
		jbtnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame = new JFrame("Exit");
				if (JOptionPane.showConfirmDialog(frame, "Tem certeza que deseja sair?", "SmartFrete System",
					JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION){
					System.exit(0);
				}
			}
		});
		jbtnSair.setFont(new Font("Tahoma", Font.PLAIN, 17));
		jbtnSair.setBounds(993, 500, 89, 23);
		frame.getContentPane().add(jbtnSair);
		
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setLayout(null);
		panel_1_1.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0), 4), "Cubagem", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_1_1.setBounds(10, 376, 322, 187);
		frame.getContentPane().add(panel_1_1);
		
		JLabel lblLargura = new JLabel("Largura (cm):");
		lblLargura.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblLargura.setBounds(10, 49, 180, 20);
		panel_1_1.add(lblLargura);
		
		JLabel lblAltura = new JLabel("Altura (cm):");
		lblAltura.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblAltura.setBounds(10, 11, 180, 30);
		panel_1_1.add(lblAltura);
		
		JLabel lblPesoDeclarado_1_3 = new JLabel("Comprimento (cm):");
		lblPesoDeclarado_1_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblPesoDeclarado_1_3.setBounds(10, 83, 180, 20);
		panel_1_1.add(lblPesoDeclarado_1_3);
		
		txtAltura = new JTextField("0");
		txtAltura.setHorizontalAlignment(SwingConstants.RIGHT);
		txtAltura.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtAltura.setColumns(10);
		txtAltura.setBounds(191, 18, 106, 20);
		panel_1_1.add(txtAltura);
		
		txtLargura = new JTextField("0");
		txtLargura.setHorizontalAlignment(SwingConstants.RIGHT);
		txtLargura.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtLargura.setColumns(10);
		txtLargura.setBounds(191, 51, 106, 20);
		panel_1_1.add(txtLargura);
		
		JButton jbtnCubagem = new JButton("+");
		jbtnCubagem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				model.addRow(new Object[] {
						txtAltura.getText(),
						txtLargura.getText(),
						txtComprimento.getText(),
						txtQtdeVolume.getText(),
						(Double.parseDouble(txtAltura.getText())/100*
						(Double.parseDouble(txtLargura.getText())/100)*
						(Double.parseDouble(txtComprimento.getText())/100)*
						Double.parseDouble(txtQtdeVolume.getText())*300)
								
				});
				double sum = 0;
				
				for (int i = 0; i < table.getRowCount(); i++) {
					sum = sum + Double.parseDouble(table.getValueAt(i, 4).toString());
					lblCubagem.setText(Double.toString(sum));
				}
				
				double pesoconsiderado;
				if( Double.parseDouble(lblCubagem.getText()) > Double.parseDouble(txtPeso.getText())) {
					pesoconsiderado = Double.parseDouble(lblCubagem.getText());
					String pesoconsideradostring = String.format("%.2f", pesoconsiderado);
					lblPesoConsiderado.setText(pesoconsideradostring);
				} else {
					pesoconsiderado = Double.parseDouble(txtPeso.getText());
					String pesoconsideradostring = String.format("%.2f", pesoconsiderado);
					lblPesoConsiderado.setText(pesoconsideradostring);
				}
								
			}
		});
		jbtnCubagem.setFont(new Font("Tahoma", Font.BOLD, 19));
		jbtnCubagem.setBounds(245, 149, 67, 27);
		panel_1_1.add(jbtnCubagem);
		
		JLabel lblQtdeVolume = new JLabel("Qtde Volume:");
		lblQtdeVolume.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblQtdeVolume.setBounds(10, 116, 180, 20);
		panel_1_1.add(lblQtdeVolume);
		
		txtQtdeVolume = new JTextField("0");
		txtQtdeVolume.setHorizontalAlignment(SwingConstants.RIGHT);
		txtQtdeVolume.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtQtdeVolume.setColumns(10);
		txtQtdeVolume.setBounds(191, 118, 106, 20);
		panel_1_1.add(txtQtdeVolume);
		
		txtComprimento = new JTextField("0");
		txtComprimento.setHorizontalAlignment(SwingConstants.RIGHT);
		txtComprimento.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtComprimento.setColumns(10);
		txtComprimento.setBounds(191, 85, 106, 20);
		panel_1_1.add(txtComprimento);
		
		JButton btnTabelaDePreo = new JButton("Tabela de Pre\u00E7o");
		btnTabelaDePreo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TabelaPreco.main(null);
			}
		});
		btnTabelaDePreo.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnTabelaDePreo.setBounds(411, 534, 226, 23);
		frame.getContentPane().add(btnTabelaDePreo);
	}
}
