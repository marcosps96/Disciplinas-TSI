package br.edu.utfpr.td.tsi.sistema.bancario.clientes.dao;

import java.util.ArrayList;
import java.util.List;

import br.edu.utfpr.td.tsi.sistema.bancario.clientes.dominio.Cliente;

public class InMemoriaClienteDAO implements ClienteDAO{
	
	List<Cliente> clientesCadastrados = new ArrayList<Cliente>();

	@Override
	public void gravar(Cliente cliente) {
		this.clientesCadastrados.add(cliente);
		System.out.println("Cliente persistido em memoria.");
	}

	@Override
	public Cliente ler(String cpf) {
		for(Cliente c: clientesCadastrados) {
			if (c.getCpf().equals(cpf)){
				System.out.println(c);
				return c;
			}else {
				System.out.println("Cliente não encontrado");
			}
		}
		return null;
	}

	@Override
	public void remover(String cpf) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Cliente> lerTodos() {
		// TODO Auto-generated method stub
		return null;
	}
}

