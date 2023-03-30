package jasport.model;

public class Titular {

	private String titular;
	private String cpf;
	private String celular;

	public Titular(String titular, String cpf, String celular) {
		super();
		this.titular = titular;
		this.cpf = cpf;
		this.celular = celular;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public void visualizar() {

		String tipo = "";

		System.out.println("**************************************");
		System.out.println("             Dados da Conta           ");
		System.out.println("**************************************");
		System.out.println("Numero da conta: " + this.titular);
		System.out.println("Numero da agência: " + this.cpf);
		System.out.println("Nome dp titular da conta: " + tipo);
		System.out.println("Nome do titular da conta: " + this.celular);
	
	}
}
