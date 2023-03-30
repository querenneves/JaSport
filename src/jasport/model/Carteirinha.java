package jasport.model;

public class Carteirinha extends TitularesCadastro {

	private String carteirinha;

	public Carteirinha(int id, String titular, String cpf, String celular, String carteirinha) {
		super(id, titular, cpf, celular);
		this.carteirinha = carteirinha;
	}

	public String getCarteirinha() {
		return carteirinha;
	}

	public void setCarteirinha(String carteirinha) {
		this.carteirinha = carteirinha;
	}

	public void visualizar() {
		super.visualizar();
		System.out.println("Carteirinha do titular: " + this.carteirinha);

	}
}
