package Model;

import Repository.RepositoryPessoaFisica;
import Repository.RepositoryPessoaJuridica;

public class Teste {

	public static void main(String[] args) {
		testaPF();
		testaPJ();

	}

	private static void testaPF() {
		RepositoryPessoaFisica rpf = new RepositoryPessoaFisica();
		String cpfApagar="92185624288";

		PessoaFisica aluno1 = new PessoaFisica();
		aluno1.setCpf("18502989715");
		aluno1.setNome("Zodi");

		PessoaFisica aluno2 = new PessoaFisica();
		aluno2.setCpf("92185624288");
		aluno2.setNome("Vinicius");

		rpf.inseri(aluno1);
		rpf.inseri(aluno2);

		System.out.println("Lista");
		for (int i = 0; i < rpf.retornaLista().size(); i++) {
			PessoaFisica pf = (PessoaFisica) rpf.retornaLista().get(i);
			System.out.println("*********************");
			System.out.println("cpf: " + pf.getCpf() + "\n");
			System.out.println("nome: " + pf.getNome() + "\n");
		}

		aluno1.setNome("Zodi Rodrigues");

		if (rpf.atualiza(aluno1)) {
			for (int i = 0; i < rpf.retornaLista().size(); i++) {
				PessoaFisica pf = (PessoaFisica) rpf.retornaLista().get(i);
				System.out.println("------------------------");
				System.out.println("cpf: " + pf.getCpf() + "\n");
				System.out.println("nome: " + pf.getNome() + "\n");
			}
		}

		
		if (rpf.apaga(cpfApagar)) {
			System.out.println("pessoa fisica apagada - cpf: " + cpfApagar );
		} else {
			System.out.println("pessoa fisica não encontrada");
		}

		System.out.println("Lista Atualizada");
		for (int i = 0; i < rpf.retornaLista().size(); i++) {
			PessoaFisica pf = (PessoaFisica) rpf.retornaLista().get(i);
			System.out.println("*********************");
			System.out.println("cpf: " + pf.getCpf() + "\n");
			System.out.println("nome: " + pf.getNome() + "\n");
		}

	}

	private static void testaPJ() {
		RepositoryPessoaJuridica rpj = new RepositoryPessoaJuridica();
		String cnpjApagar="28.272.613/0001-05";

		PessoaJuridica pj1 = new PessoaJuridica();
		pj1.setCnpj("13.578.981/0001-09");
		pj1.setNome("Empresa 01");

		PessoaJuridica pj2 = new PessoaJuridica();
		pj2.setCnpj("28.272.613/0001-05");
		pj2.setNome("Empresa 02");

		rpj.inseri(pj1);
		rpj.inseri(pj2);

		System.out.println("Lista");
		for (int i = 0; i < rpj.retornaLista().size(); i++) {
			PessoaJuridica pj = (PessoaJuridica) rpj.retornaLista().get(i);
			System.out.println("*********************");
			System.out.println("cpf: " + pj.getCnpj() + "\n");
			System.out.println("nome: " + pj.getNome() + "\n");
		}

		pj1.setNome("Empresa 01 - Atualizada");

		if (rpj.atualiza(pj1)) {
			for (int i = 0; i < rpj.retornaLista().size(); i++) {
				PessoaJuridica pj = (PessoaJuridica) rpj.retornaLista().get(i);
				System.out.println("------------------------");
				System.out.println("cpf: " + pj.getCnpj() + "\n");
				System.out.println("nome: " + pj.getNome() + "\n");
			}
		}

		// existe este cnpj
		if (rpj.apaga(cnpjApagar)) {
			System.out.println("pessoa juridica apagada - cnpj: "+ cnpjApagar);
		} else {
			System.out.println("pessoa juridica não encontrada");
		}

		System.out.println("\n\n\n Lista Atualizada");
		for (int i = 0; i < rpj.retornaLista().size(); i++) {
			PessoaJuridica pj = (PessoaJuridica) rpj.retornaLista().get(i);
			System.out.println("*********************");
			System.out.println("cpf: " + pj.getCnpj() + "\n");
			System.out.println("nome: " + pj.getNome() + "\n");
		}

	}

}
