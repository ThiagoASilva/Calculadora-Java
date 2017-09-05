package aula;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;


public class Calculadora extends JFrame{
	JTextField txtvisor = new JTextField(); // criar o visor da calculadora
	JButton btnMc = new JButton("MC"); //criar o botão de limpar os números
	JButton btnMr = new JButton("MR");
	JButton btnMs = new JButton("MS");
	JButton btnMmais = new JButton("M+");
	JButton btnMmenos = new JButton("M-");
	JButton btnBackspace = new JButton("<----");
	JButton btnCe = new JButton("CE");
	JButton btnC = new JButton("C");
	JButton btnMaisOuMenos = new JButton("±");
	JButton btnRaiz = new JButton("Raiz");
	JButton btn7 = new JButton("7");
	JButton btn8 = new JButton("8");
	JButton btn9 = new JButton("9");
	JButton btnDiv = new JButton("/");
	JButton btnPercent = new JButton("%");
	JButton btn4 = new JButton("4");
	JButton btn5 = new JButton("5");
	JButton btn6 = new JButton("6");
	JButton btnMult = new JButton("*");
	JButton btnReciproc = new JButton("1/X");
	JButton btn1 = new JButton("1");
	JButton btn2 = new JButton("2");
	JButton btn3 = new JButton("3");
	JButton btnMenos = new JButton("-");
	JButton btnIgual = new JButton("=");
	JButton btn0 = new JButton("0");
	JButton btnVirgula = new JButton(",");
	JButton btnMais = new JButton("+");	
	
	public String resultado = "0";
	
	public Calculadora(){
		super("Calculadora"); //responsável por colocar o rótulo na janela		
		Container paine = this.getContentPane(); //Conteiner é uma classe responsável pela fixação dos objetos na tela
		
		paine.add(txtvisor); //fixando o visor na tela
		txtvisor.setBounds(20, 20, 320, 40); //Definir o valor, primeiro valor define da esquerda para a direita, o segundo valor define a posição de cima para baixo, o terceiro e quato valor definem a largura e a altura respectivamente
		
		paine.add(btnMc); //fixando o botao na tela
		btnMc.setBounds(20, 65, 60, 60);
		
		paine.add(btnMr); //fixando o botao na tela
		btnMr.setBounds(85, 65, 60, 60);
		
		paine.add(btnMs); //fixando o botao na tela
		btnMs.setBounds(150, 65, 60, 60);
		
		paine.add(btnMmais); //fixando o botao na tela
		btnMmais.setBounds(215, 65, 60, 60);

		paine.add(btnMmenos); //fixando o botao na tela
		btnMmenos.setBounds(280, 65, 60, 60);

		//Segunda linha
		
		paine.add(btnBackspace);
		btnBackspace.setBounds(20, 130, 60, 60);
		btnBackspace.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String texto = txtvisor.getText();
				String[] txt = texto.split("");
				String nTexto = "";
				
				for(int i = 0;i < texto.length() - 1; i ++) {
					nTexto = nTexto + txt[i];
				}
							
				txtvisor.setText(nTexto);
				
			}
		});
		
		paine.add(btnCe);
		btnCe.setBounds(85, 130, 60, 60);
		btnCe.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String texto = txtvisor.getText();
				
				if(texto.contains("+")) {
					//soma
				String[] txt = texto.split("\\+");
				txtvisor.setText(txt[0] + "+");
				
				
				
				}else if(texto.contains("-")){
					//subtração
					String[] txt = texto.split("\\-");
					txtvisor.setText(txt[0] + "-");
					

				}else if(texto.contains("*")){
					//multiplicação
					String[] txt = texto.split("\\*");
					txtvisor.setText(txt[0] + "*");
					
	
				}else if(texto.contains("/")){
					//divisão
					String[] txt = texto.split("/");		
					txtvisor.setText(txt[0] + "/");
					
				}else {

				}
				
			}
		});
		
		paine.add(btnC);
		btnC.setBounds(150, 130, 60, 60);
		btnC.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				txtvisor.setText("");
				resultado = "0";
				
			}
		});
		
		paine.add(btnMaisOuMenos);		
		btnMaisOuMenos.setBounds(215, 130, 60, 60);		
		
		
		paine.add(btnRaiz);
		btnRaiz.setBounds(280, 130, 60, 60);
		
		//Terceira linha
		
		paine.add(btn7);
		btn7.setBounds(20, 195, 60, 60);
		btn7.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						txtvisor.setText(txtvisor.getText() + "7");
						
					}
				});
		
		paine.add(btn8);
		btn8.setBounds(85, 195, 60, 60);
		btn8.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						txtvisor.setText(txtvisor.getText() + "8");
						
					}
				});
		
		paine.add(btn9);
		btn9.setBounds(150, 195, 60, 60);
		btn9.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						txtvisor.setText(txtvisor.getText() + "9");
						
					}
				});
		
		paine.add(btnDiv);
		btnDiv.setBounds(215, 195, 60, 60);
		btnDiv.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						String texto = txtvisor.getText();		
						
						if(texto.contains("+") || texto.contains("-") || texto.contains("*") || texto.contains("/")) {
						calcular(texto);
						txtvisor.setText(resultado);
						}
						txtvisor.setText(txtvisor.getText() + "/");
						
					}
				});
		
		paine.add(btnPercent);
		btnPercent.setBounds(280, 195, 60, 60);
			
		
		//Quarta linha
		
		paine.add(btn4);
		btn4.setBounds(20, 260, 60, 60);
		btn4.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						txtvisor.setText(txtvisor.getText() + "4");
						
					}
				});
		
		paine.add(btn5);
		btn5.setBounds(85, 260, 60, 60);
		btn5.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						txtvisor.setText(txtvisor.getText() + "5");
						
					}
				});
		
		paine.add(btn6);
		btn6.setBounds(150, 260, 60, 60);
		btn6.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						txtvisor.setText(txtvisor.getText() + "6");
						
					}
				});
		
		paine.add(btnMult);
		btnMult.setBounds(215, 260, 60, 60);
		btnMult.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						String texto = txtvisor.getText();		
						
						if(texto.contains("+") || texto.contains("-") || texto.contains("*") || texto.contains("/")) {
						calcular(texto);
						txtvisor.setText(resultado);
						}
						txtvisor.setText(txtvisor.getText() + "*");
						
					}
				});
		
		paine.add(btnReciproc);
		btnReciproc.setBounds(280, 260, 60, 60);
		//Quinta linha
		
		paine.add(btn1);
		btn1.setBounds(20, 325, 60, 60);
		btn1.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						txtvisor.setText(txtvisor.getText() + "1");
						
					}
				});
		
		paine.add(btn2);
		btn2.setBounds(85, 325, 60, 60);
		btn2.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						txtvisor.setText(txtvisor.getText() + "2");
						
					}
				});
		
		paine.add(btn3);
		btn3.setBounds(150, 325, 60, 60);
		btn3.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						txtvisor.setText(txtvisor.getText() + "3");
						
					}
				});
		
		paine.add(btnMenos);
		btnMenos.setBounds(215, 325, 60, 60);
		btnMenos.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String texto = txtvisor.getText();		
				
				if(texto.contains("+") || texto.contains("-") || texto.contains("*") || texto.contains("/")) {
				calcular(texto);
				txtvisor.setText(resultado);
				}
				txtvisor.setText(txtvisor.getText() + "-");
				
			}
		});
		
		paine.add(btnIgual);
		btnIgual.setBounds(280, 325, 60, 125);
		btnIgual.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				calcular(txtvisor.getText());
				txtvisor.setText("" + resultado);
				
			}
		});
		
		//Sexta linha
		
		paine.add(btn0);
		btn0.setBounds(20, 390, 125, 60);
		btn0.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						txtvisor.setText(txtvisor.getText() + "0");
						
					}
				});
		
		paine.add(btnVirgula);
		btnVirgula.setBounds(150, 390, 60, 60);
		btnVirgula.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						txtvisor.setText(txtvisor.getText() + ",");
						
					}
				});
		
		paine.add(btnMais);
		btnMais.setBounds(215, 390, 60, 60);
		btnMais.addActionListener(new ActionListener() {
				
			@Override
			public void actionPerformed(ActionEvent e) {
					String texto = txtvisor.getText();		
					
					if(texto.contains("+") || texto.contains("-") || texto.contains("*") || texto.contains("/")) {
					calcular(texto);
					txtvisor.setText(resultado);
					}
						txtvisor.setText(txtvisor.getText() + "+");					
			}
		});
			

		paine.setLayout(null); //é responsável por definir o posicionamento do objetos do layout
		this.setSize(380, 510); //define o tamanho da tela
		this.setVisible(true); //permite que minha tela seja visivel
		this.setDefaultCloseOperation(EXIT_ON_CLOSE); // Fecha realmente a aplicação
		
	}
	public static void main(String args[]){
		Calculadora calc = new Calculadora();
	}
	
	public void calcular(String texto){
		double x = 0;
		double y = 0;
		Calculos c = new Calculos();
		
		texto = texto.replace(",", ".");
		
		if(texto.contains("+")) {
			//soma
		String[] txt = texto.split("\\+");
		
		x =  Double.parseDouble(txt[0]);
		y =  Double.parseDouble(txt[1]);
		
		resultado = "" + c.soma(x, y);
		
		}else if(texto.contains("-")){
			//subtração
			String[] txt = texto.split("\\-");
			
			x =  Double.parseDouble(txt[0]);
			y =  Double.parseDouble(txt[1]);
			
			resultado = "" + c.subtracao(x, y);
		}else if(texto.contains("*")){
			//multiplicação
			String[] txt = texto.split("\\*");
			
			x =  Double.parseDouble(txt[0]);
			y =  Double.parseDouble(txt[1]);
			
			resultado = "" + c.multiplicao(x, y);
		}else if(texto.contains("/")){
			//divisão
			String[] txt = texto.split("/");
			
			x =  Double.parseDouble(txt[0]);
			y =  Double.parseDouble(txt[1]);
			
			resultado = "" + c.divisao(x, y);
		}else {
			resultado = texto;
		}
		
		
	}

}
