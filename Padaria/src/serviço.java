import java.text.DecimalFormat;

import java.text.NumberFormat;

import javax.swing.JOptionPane;

public class serviço {

	private int codigo;	private String nome;

	private String func;

	private double salario;

	public int getCodigo() {

		return codigo;

	}

	public void setCodigo(int codigo) {

		this.codigo = codigo;

	}

	public String getNome() {

		return nome;

	}

	public void setNome(String nome) {

		this.nome = nome;

	}

	public String getFunc() {

		return func;

	}

	public void setFunc(String func) {

		this.func = func;

	}

	public double getSalario() {

		return salario;

	}

	public void setSalario(double salario) {

		this.salario = salario;

	}

	

public void inserirDados() {

	this.codigo = Integer.parseInt(JOptionPane.showInputDialog("Codigo:"));

	this.nome = JOptionPane.showInputDialog("Nome:");

	this.func = JOptionPane.showInputDialog("Fun��o:");

	this.salario = Double.parseDouble(JOptionPane.showInputDialog("Valor alimento:"));

}

public double atualizarValor(double taxa) {

	this.salario += this.salario * taxa / 100;

	return this.salario;

}

public void mostrar() {

	String mensagem = "OBJETO DA CLASSE PADARIA \n";

	mensagem += "\n Codigo: " + this.codigo;

	mensagem += "\n Nome: " + this.nome;

	mensagem += "\n Fun��o: " + this.func;

	

NumberFormat formatar = DecimalFormat.getCurrencyInstance();

	mensagem += "\n Valor Alimento: " + formatar.format(this.salario);

	

	JOptionPane.showMessageDialog(null, mensagem);

}

}