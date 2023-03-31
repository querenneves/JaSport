package jasport.model;

public class PlanoPremium extends Titular {

	private float planoP;

	public PlanoPremium(String titular, String cpf, String celular) {
		super(titular, cpf, celular);
	}
	public float getPlabob() {
		return planoP;
	}

	public void setPlabob(float planoP) {
		this.planoP = planoP;
	}

	public void visualizar() {
		super.visualizar();
		System.out.println("Seu plano é" + this.planoP);
	}
}
