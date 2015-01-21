package br.com.sistemacurso.ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class AppUi {

	private static JLabel lbLogin;
	private static JLabel lbSenha;
	private static JTextField tfLogin;
	private static JTextField tfSenha;
	private static JButton btLogar;
	private static JButton btCancelar;
	private static JFrame janela;
	private static AppUi frame;

	public AppUi() {
		inicializadorDeComponentes();
		definirEventos();
	}

	private static void inicializadorDeComponentes() {

		janela = new JFrame();
		janela.setTitle("Sistema de Login");
		janela.setLayout(null);
		janela.setBounds(0, 0, 300, 250);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		lbLogin = new JLabel("Login: ");
		lbSenha = new JLabel();
		lbSenha.setText("Senha");
		tfLogin = new JTextField(5);
		tfSenha = new JPasswordField(5);
		btLogar = new JButton("Logar");
		btCancelar = new JButton("Cancelar");

		tfLogin.setBounds(100, 30, 120, 25);
		lbLogin.setBounds(30, 30, 80, 25);

		tfSenha.setBounds(100, 75, 120, 25);
		lbSenha.setBounds(30, 75, 80, 25);

		btLogar.setBounds(20, 120, 100, 25);
		btCancelar.setBounds(125, 120, 100, 25);

		janela.add(lbLogin);
		janela.add(lbSenha);
		janela.add(tfLogin);
		janela.add(tfSenha);
		janela.add(btLogar);
		janela.add(btCancelar);
		
		janela.setVisible(true);
	}

	private static void definirEventos() {
		btLogar.addActionListener(new ActionListener());
		
		public void actionPerformed(ActionEvent e){
			String senha = String.valueOf(tfSenha.getPassword());
			
			if(tfLogin.getText().equals("java")&& senha.equals("123456")){
				janela.setVisible(false);
			}else{
				String message = "Login ou senha inválida";
				JOptionPane.showMessageDialog(null, message);
				
			}
			
		}
	}

	public static void main(String[] args) {
		new AppUi();
	}
}
