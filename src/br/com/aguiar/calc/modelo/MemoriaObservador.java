package br.com.aguiar.calc.modelo;

@FunctionalInterface
public interface MemoriaObservador {
	
	void valorAlterado(String novoValor);
}
