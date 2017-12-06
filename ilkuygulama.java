package jawaSwing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.border.LineBorder;

public class ilkuygulama {

	private JFrame frmIlkJavaFormum;
	private JTextField txtadiniz;
	private JTextField txtsoyadiniz;
	private JTextField txtyasiniz;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ilkuygulama window = new ilkuygulama();
					window.frmIlkJavaFormum.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ilkuygulama() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmIlkJavaFormum = new JFrame();
		frmIlkJavaFormum.getContentPane().setBackground(new Color(255, 204, 255));
		frmIlkJavaFormum.setTitle("ilk  java formum");
		frmIlkJavaFormum.setBounds(100, 100, 450, 203);
		frmIlkJavaFormum.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmIlkJavaFormum.getContentPane().setLayout(null);
		
		JLabel lblAdiniz = new JLabel("Ad\u0131n\u0131z:");
		lblAdiniz.setForeground(new Color(0, 102, 255));
		lblAdiniz.setBounds(10, 11, 69, 14);
		frmIlkJavaFormum.getContentPane().add(lblAdiniz);
		
		JLabel lblSoyadiniz = new JLabel("Soyad\u0131n\u0131z:");
		lblSoyadiniz.setForeground(new Color(0, 102, 255));
		lblSoyadiniz.setBounds(10, 36, 69, 14);
		frmIlkJavaFormum.getContentPane().add(lblSoyadiniz);
		
		JLabel lblDYili = new JLabel("Do\u011Fum Y\u0131l\u0131:");
		lblDYili.setForeground(new Color(0, 102, 255));
		lblDYili.setBounds(10, 61, 69, 14);
		frmIlkJavaFormum.getContentPane().add(lblDYili);
		
		txtadiniz = new JTextField();
		txtadiniz.setBounds(108, 8, 76, 20);
		frmIlkJavaFormum.getContentPane().add(txtadiniz);
		txtadiniz.setColumns(10);
		
		txtsoyadiniz = new JTextField();
		txtsoyadiniz.setBounds(108, 33, 76, 20);
		frmIlkJavaFormum.getContentPane().add(txtsoyadiniz);
		txtsoyadiniz.setColumns(10);
		
		txtyasiniz = new JTextField();
		txtyasiniz.setBackground(Color.WHITE);
		txtyasiniz.setBounds(108, 58, 76, 20);
		frmIlkJavaFormum.getContentPane().add(txtyasiniz);
		txtyasiniz.setColumns(10);
		
		JTextArea textSonuc = new JTextArea();
		textSonuc.setBackground(new Color(255, 255, 204));
		textSonuc.setEditable(false);
		textSonuc.setBounds(257, 8, 155, 68);
		frmIlkJavaFormum.getContentPane().add(textSonuc);
		
		JButton btnGoster = new JButton("G\u00D6STER");
		btnGoster.setBorder(new LineBorder(new Color(0, 102, 255), 1, true));
		btnGoster.setForeground(new Color(0, 153, 204));
		btnGoster.setBackground(new Color(255, 255, 204));
		btnGoster.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				//JOptionPane.showMessageDialog(null, "merhabalar");ekrana uyarý kutusu mesajý yazýyo
				String Ad= txtadiniz.getText();
				String Soyad= txtsoyadiniz.getText();
				int dYili= Integer.parseInt(txtyasiniz.getText());
				int yas= 2017-dYili;
				
				String sonuc= "Adýnýz: "+ Ad + "\nSoyadýnýz: "+ Soyad + "\n Yaþýnýz: "+ String.valueOf(yas);
				textSonuc.setText(sonuc);
				
			}
		});
		btnGoster.setBounds(108, 98, 100, 23);
		frmIlkJavaFormum.getContentPane().add(btnGoster);
	}
}
