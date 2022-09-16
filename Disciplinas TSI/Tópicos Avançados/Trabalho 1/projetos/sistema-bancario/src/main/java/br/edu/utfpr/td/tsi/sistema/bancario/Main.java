package br.edu.utfpr.td.tsi.sistema.bancario;

import br.edu.utfpr.td.tsi.sistema.bancario.clientes.dominio.Cliente;
import br.edu.utfpr.td.tsi.sistema.bancario.clientes.negocio.GerenciadorClientes;

public class Main {
	
	public static void main(String[] args) {
		
		Cliente cliente = new Cliente();
		cliente.setCpf("1234");
		cliente.setDataNascimento("10/10/2000");
		cliente.setNome("joao silva");
		cliente.setEmail("joao@silva.com");
		cliente.setRendaAnual(50000);
		
		
		GerenciadorClientes gerenciadorClientes = new GerenciadorClientes();
		gerenciadorClientes.cadastrar(cliente);		
		gerenciadorClientes.ler("1234");
	}
}
