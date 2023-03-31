package titular.controller;

import java.util.ArrayList;

import jasport.model.Titular;
import plano.repository.TitularRepository;

public class TitularController implements TitularRepository {

	private ArrayList<Titular> listaJasport = new ArrayList<Titular>();
	int numero = 0;

	public void cadastrar(Titular titular) {
		listaJasport.add(titular);
		System.out.println("A pessoa titular de nome" + titular.getTitular() + " agora faz parte do clube!");

	}

	public void deletar(String titular) {

		var deletaTitular = buscarNaCollection(titular.concat(titular));

		if (deletaTitular != null) {
			listaJasport.remove(titular);
			System.out.println("Pedido número " + titular + " foi removido com sucesso!");
			return;
		} else
			System.out.println("Numero do pedido não foi encontrado!");
	}


	@Override
	public void listarTitular() {
		for (var titular : listaJasport) {
			((Titular) titular).visualizar();
		}

	}

	@Override
	public void atualizar(Titular titular) {

		var buscaTitular = buscarNaCollection(titular.getCpf());

		if (buscaTitular != null) {
			listaJasport.set(listaJasport.indexOf(buscaTitular), titular);
			System.out.println("Os dados do titular foram atualizados com sucesso!");
		} else
			System.out.println("O titular não foi encontrado");

	}

	private Object buscarNaCollection(String cpf) {
		for (var titular : listaJasport) {
			if (titular.getCpf() == cpf) {
				return titular;
			}

		}
		return null;
	}

	@Override
	public void deletar() {
		// TODO Auto-generated method stub

	}

}