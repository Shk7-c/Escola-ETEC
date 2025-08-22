package view;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class FormularioAluno extends JFrame{
	
	private int x;
	private JLabel lbNome;
	private JTextField txNota1;
	private JTextField txNota2;
	private JTextField txNota3;
	private JTextField txNota4;
	private JTextField txMateria;	
	private JTextField txNome;	
	private JButton btExibir;
	
	public FormularioAluno() {
		
		// Exemplo:
		JLabel labelImagem = new JLabel();
		labelImagem.setBounds(500, 100, 200, 300);
	    ImageIcon icon = new ImageIcon(getClass().getResource("/imagem/lula.jpg")); 
	    Image imagem = icon.getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH);
	    labelImagem.setIcon(new ImageIcon(imagem));
	    add(labelImagem);
		
		setTitle("Digite as notas");
		setSize(800, 600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(false);
		setLayout(null);
		getContentPane().setBackground(new Color(176,224,230));
		
		lbNome = new JLabel();
		lbNome.setText("Nome Aluno");
		lbNome.setBounds(50, 100, 100, 30); //x y largura altura
		lbNome.setForeground(Color.BLACK);
		add (lbNome);
		
		txNome = new JTextField();
		txNome.setBounds(130, 100, 200, 30);
		add (txNome);

		lbNome = new JLabel();
		lbNome.setText("Materia");
		lbNome.setBounds(50, 150, 100, 30); //x y largura altura
		lbNome.setForeground(Color.BLACK);
		add (lbNome);
		
		txMateria = new JTextField();
		txMateria.setBounds(130, 150, 200, 30);
		add (txMateria);
		
		lbNome = new JLabel();
		lbNome.setText("Nota 1");
		lbNome.setBounds(50, 200, 100, 30); //x y largura altura
		lbNome.setForeground(Color.BLACK);
		add (lbNome);
		
		txNota1 = new JTextField();
		txNota1.setBounds(130, 200, 200, 30);
		add (txNota1);
		
		lbNome = new JLabel();
		lbNome.setText("Nota 2");
		lbNome.setBounds(50, 250, 100, 30); //x y largura altura
		lbNome.setForeground(Color.BLACK);
		add (lbNome);
		
		txNota2 = new JTextField();
		txNota2.setBounds(130, 250, 200, 30);
		add (txNota2);
		
		lbNome = new JLabel();
		lbNome.setText("Nota 3");
		lbNome.setBounds(50, 300, 100, 30); //x y largura altura
		lbNome.setForeground(Color.BLACK);
		add (lbNome);
		
		txNota3 = new JTextField();
		txNota3.setBounds(130, 300, 200, 30);
		add (txNota3);
		
		lbNome = new JLabel();
		lbNome.setText("Nota 4");
		lbNome.setBounds(50, 350, 100, 30); //x y largura altura
		lbNome.setForeground(Color.BLACK);
		add (lbNome);
		
		txNota4 = new JTextField();
		txNota4.setBounds(130, 350, 200, 30);
		add (txNota4);
		
		btExibir = new JButton();
		btExibir.setBounds(340, 450, 120, 30);
		btExibir.setText("Exibir Notas");
		btExibir.setForeground(Color.BLACK);
		btExibir.setBackground(Color.WHITE);
		btExibir.addActionListener(null);
	    btExibir.addActionListener(new ActionListener() {
			

			@Override
			public void actionPerformed(ActionEvent e) {
				String materia =txMateria.getText();
				String nome =txNome.getText();
				double nota1 = Double.parseDouble(txNota1.getText());
				double nota2 = Double.parseDouble(txNota2.getText());
				double nota3 = Double.parseDouble(txNota3.getText());
				double nota4 = Double.parseDouble(txNota4.getText());


	    	
				// TODO Auto-generated method stub
				double media = (nota1 + nota2 + nota3 + nota4) / 4;
				JOptionPane.showMessageDialog(null, "Nome do aluno: "+nome+"\n"+materia+":\n Media das notas:"+media);
				

			}
		});
		add (btExibir);
		
		setVisible(true);
	}

}