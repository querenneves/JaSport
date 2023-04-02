package controller;

import java.util.ArrayList;
import Menu.menu;
import repositoryj.repository;
import model.Titular;

public class Controller implements repository {
	private ArrayList<Titular> listaJaspot = new ArrayList<Titular>();

	@Override
	public void cadastrar(Titular titular) {
		listaJaspot.add(titular);
		System.out.println("A pessoa titular de nome" + titular.getCpf() + "foi cadastrado com sucesso!");

	}

	@Override
	public void listarTitular() {
		for (var titular : listaJaspot) {
			System.out.println("O titular: " + titular.getCpf() + "foi localizada!");
		}

	}

	@Override
	public void atualizar(Titular titular) {
		var buscaJaspot = BuscarNaCollection(titular.getCpf());

		if (buscaJaspot != null) {
			listaJaspot.set(listaJaspot.indexOf(buscaJaspot), titular);
			System.out.println("Os dados do titular foram atualizados com sucesso!");
		} else
			System.out.println("O titular não foi encontrado!");

	}

	private Titular BuscarNaCollection(String cpf) {
		for (var titular : listaJaspot) {
			if (titular.getCpf() == cpf) {
				return titular;
			}
		}
		return null;
	}

	@Override
	public void deletar(String cpf) {

		var titular = BuscarNaCollection(cpf);
		if (titular != null) {
			if (listaJaspot.remove(titular) == true)
				System.out.println("O titular foi excluido!");
		} else
			System.out.println("O titular não foi encontrado!");
	}
}
