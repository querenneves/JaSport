package jasport.model;

public class PlanoBasic extends Titular {

	private float planob;

	public PlanoBasic(String titular, String cpf, String celular) {
		super(titular, cpf, celular);

	}

	public float getPlabob() {
		return planob;
	}

	public void setPlabob(float planob) {
		this.planob = planob;
	}

	public void visualizar() {
		super.visualizar();
		System.out.println("Seu plano é" + this.planob);
	}
}
