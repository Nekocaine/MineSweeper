package demineur;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.CardLayout;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSpinner;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JTextArea;
import javax.swing.SpinnerNumberModel;

public class MainWindow extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainWindow frame = new MainWindow();
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
	public MainWindow() {
		setTitle("D\u00E9mineur");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		Plate P = new Plate();
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		CardLayout cl = new CardLayout(0,0);
		contentPane.setLayout(cl);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, "name_84440649835669");
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel.rowHeights = new int[]{0, 0, 0, 0, 0, 0};
		gbl_panel.columnWeights = new double[]{0.0, 1.0, 1.0, 1.0, 1.0, 1.0, 0.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 1.0, 1.0, 1.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		JLabel lblNewLabel = new JLabel("Largeur :");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 1;
		gbc_lblNewLabel.gridy = 1;
		panel.add(lblNewLabel, gbc_lblNewLabel);
		
		JSpinner spinner = new JSpinner();
		spinner.setModel(new SpinnerNumberModel(new Integer(5), new Integer(5), null, new Integer(1)));
		GridBagConstraints gbc_spinner = new GridBagConstraints();
		gbc_spinner.fill = GridBagConstraints.HORIZONTAL;
		gbc_spinner.insets = new Insets(0, 0, 5, 5);
		gbc_spinner.gridx = 2;
		gbc_spinner.gridy = 1;
		panel.add(spinner, gbc_spinner);
		
		JLabel lblNewLabel_1 = new JLabel("Hauteur :");
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 1;
		gbc_lblNewLabel_1.gridy = 2;
		panel.add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		JSpinner spinner_1 = new JSpinner();
		spinner_1.setModel(new SpinnerNumberModel(new Integer(5), new Integer(5), null, new Integer(1)));
		GridBagConstraints gbc_spinner_1 = new GridBagConstraints();
		gbc_spinner_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_spinner_1.insets = new Insets(0, 0, 5, 5);
		gbc_spinner_1.gridx = 2;
		gbc_spinner_1.gridy = 2;
		panel.add(spinner_1, gbc_spinner_1);
		
		
		
		JLabel lblNewLabel_2 = new JLabel("Mines :");
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2.gridx = 1;
		gbc_lblNewLabel_2.gridy = 3;
		panel.add(lblNewLabel_2, gbc_lblNewLabel_2);
		
		JSpinner spinner_2 = new JSpinner();
		spinner_2.setModel(new SpinnerNumberModel(new Integer(3), new Integer(3), null, new Integer(1)));
		GridBagConstraints gbc_spinner_2 = new GridBagConstraints();
		gbc_spinner_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_spinner_2.insets = new Insets(0, 0, 5, 5);
		gbc_spinner_2.gridx = 2;
		gbc_spinner_2.gridy = 3;
		panel.add(spinner_2, gbc_spinner_2);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, "name_86187651157902");
		GridBagLayout gbl_panel_1 = new GridBagLayout();
		gbl_panel_1.columnWidths = new int[]{0, 0, 0};
		gbl_panel_1.rowHeights = new int[]{0, 0};
		gbl_panel_1.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gbl_panel_1.rowWeights = new double[]{1.0, Double.MIN_VALUE};
		panel_1.setLayout(gbl_panel_1);
		
		JPanel panel_2 = new JPanel();
		GridBagConstraints gbc_panel_2 = new GridBagConstraints();
		gbc_panel_2.insets = new Insets(0, 0, 0, 5);
		gbc_panel_2.fill = GridBagConstraints.BOTH;
		gbc_panel_2.gridx = 0;
		gbc_panel_2.gridy = 0;
		panel_1.add(panel_2, gbc_panel_2);
		GridBagLayout gbl_panel_2 = new GridBagLayout();
		gbl_panel_2.columnWidths = new int[]{0, 0, 0};
		gbl_panel_2.rowHeights = new int[]{0, 0, 0, 0};
		gbl_panel_2.columnWeights = new double[]{1.0, 1.0, Double.MIN_VALUE};
		gbl_panel_2.rowWeights = new double[]{1.0, 1.0, 1.0, Double.MIN_VALUE};
		panel_2.setLayout(gbl_panel_2);
		
		JLabel lblCoordonnes = new JLabel("Coordonn\u00E9es");
		GridBagConstraints gbc_lblCoordonnes = new GridBagConstraints();
		gbc_lblCoordonnes.insets = new Insets(0, 0, 5, 5);
		gbc_lblCoordonnes.gridx = 0;
		gbc_lblCoordonnes.gridy = 0;
		panel_2.add(lblCoordonnes, gbc_lblCoordonnes);
		
		JComboBox<Integer> comboBox_1 = new JComboBox<Integer>();
		GridBagConstraints gbc_comboBox_1 = new GridBagConstraints();
		gbc_comboBox_1.insets = new Insets(0, 0, 5, 0);
		gbc_comboBox_1.gridx = 0;
		gbc_comboBox_1.gridy = 1;
		panel_2.add(comboBox_1, gbc_comboBox_1);
		
		JComboBox<Integer> comboBox = new JComboBox<Integer>();
		GridBagConstraints gbc_comboBox = new GridBagConstraints();
		gbc_comboBox.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox.gridx = 1;
		gbc_comboBox.gridy = 0;
		panel_2.add(comboBox, gbc_comboBox);
		
		JPanel panel_3 = new JPanel();
		GridBagConstraints gbc_panel_3 = new GridBagConstraints();
		gbc_panel_3.fill = GridBagConstraints.BOTH;
		gbc_panel_3.gridx = 1;
		gbc_panel_3.gridy = 0;
		panel_1.add(panel_3, gbc_panel_3);
		GridBagLayout gbl_panel_3 = new GridBagLayout();
		gbl_panel_3.columnWidths = new int[]{0, 0};
		gbl_panel_3.rowHeights = new int[]{0, 0};
		gbl_panel_3.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_panel_3.rowWeights = new double[]{1.0, Double.MIN_VALUE};
		panel_3.setLayout(gbl_panel_3);
		
		JTextArea textArea = new JTextArea();
		GridBagConstraints gbc_textArea = new GridBagConstraints();
		gbc_textArea.fill = GridBagConstraints.BOTH;
		gbc_textArea.gridx = 0;
		gbc_textArea.gridy = 0;
		panel_3.add(textArea, gbc_textArea);
		
		JButton btnClick2 = new JButton("Click");
		btnClick2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				boolean gagne = false;
				boolean perdu = false;
				perdu = P.update(comboBox.getSelectedIndex(), comboBox_1.getSelectedIndex());
				gagne = P.isWon();
				textArea.setText(Display.showWorld(P));
				if(perdu){
					btnClick2.setEnabled(false);
					textArea.setText(Display.showEndWorld(P)+"\nPerdu");
				}else if(gagne){
					btnClick2.setEnabled(false);
					textArea.setText(Display.showEndWorld(P)+"\nGagné");
				}
			}
		});
		GridBagConstraints gbc_btnClick2 = new GridBagConstraints();
		gbc_btnClick2.insets = new Insets(0, 0, 5, 0);
		gbc_btnClick2.gridx = 1;
		gbc_btnClick2.gridy = 1;
		panel_2.add(btnClick2, gbc_btnClick2);
		btnClick2.setVisible(false);
		
		JButton btnClick = new JButton("Click");
		btnClick.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				btnClick.setVisible(false);
				btnClick2.setVisible(true);
				boolean gagne = false;
				boolean perdu = false;
				P.setIni((int)spinner.getValue(),(int)spinner_1.getValue(),(int)spinner_2.getValue(),comboBox.getSelectedIndex(),comboBox_1.getSelectedIndex());
				perdu = P.update(comboBox.getSelectedIndex(), comboBox_1.getSelectedIndex());
				gagne = P.isWon();
				textArea.setText(Display.showWorld(P));
				if(perdu){
					btnClick2.setEnabled(false);
					textArea.setText(Display.showEndWorld(P)+"\nPerdu");
				}else if(gagne){
					btnClick2.setEnabled(false);
					textArea.setText(Display.showEndWorld(P)+"\nGagné");
				}
			}
		});
		GridBagConstraints gbc_btnClick = new GridBagConstraints();
		gbc_btnClick.insets = new Insets(0, 0, 5, 0);
		gbc_btnClick.gridx = 1;
		gbc_btnClick.gridy = 1;
		panel_2.add(btnClick, gbc_btnClick);
		
		JButton btnRetour = new JButton("Retour");
		btnRetour.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cl.previous(contentPane);
				btnClick2.setVisible(false);
				btnClick.setVisible(true);
				comboBox.removeAllItems();
				comboBox_1.removeAllItems();
				btnClick2.setEnabled(true);
			}
		});
		GridBagConstraints gbc_btnRetour = new GridBagConstraints();
		gbc_btnRetour.insets = new Insets(0, 0, 0, 5);
		gbc_btnRetour.gridx = 0;
		gbc_btnRetour.gridy = 2;
		panel_2.add(btnRetour, gbc_btnRetour);
		
		JButton btnNewButton = new JButton("Jeu");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if((int)spinner_2.getValue()>(((int)spinner.getValue()*(int)spinner_1.getValue())-9)){
					try {
						Error dialog = new Error();
						dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
						dialog.setVisible(true);
					} catch (Exception e1) {
						e1.printStackTrace();
					}
				}else{
					textArea.setText(Display.showWorldBeginning((int)spinner.getValue(), (int)spinner_1.getValue()));
					for (int i = 0; i < (int)spinner.getValue(); i++) {
						comboBox.addItem(i);
					}
					for (int j = 0; j < (int)spinner_1.getValue(); j++) {
						comboBox_1.addItem(j);
					}
					cl.next(contentPane);
				}
			}
		});
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton.gridx = 5;
		gbc_btnNewButton.gridy = 2;
		panel.add(btnNewButton, gbc_btnNewButton);
	}
}
