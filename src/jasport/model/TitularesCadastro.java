package jasport.model;

public class TitularesCadastro {

	private int id;
	private String titular;
	private String cpf;
	private String celular;

	public TitularesCadastro(int id, String titular, String cpf, String celular) {
		super();
		this.id = id;
		this.titular = titular;
		this.cpf = cpf;
		this.celular = celular;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

		System.out.println("*************************************************");
		System.out.println("                 DADOS DO TITULAR                ");
		System.out.println("*************************************************");
		System.out.println("ID do titular: ");
		System.out.println("Nome do titular: " + this.titular);
		System.out.println("Telefone do titular: " + this.celular);
		System.out.println("CPF do titular: " + this.cpf);

	}
}
