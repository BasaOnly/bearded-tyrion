package pucrs.alpro3np.graphs;

import java.util.ArrayList;

public class DirectedGraphMatrix extends AbstractGraphMatrix implements DirectedGraph {


	@Override
	public ArrayList<String> getSources() {
		// TODO Para cada vertice v
		// TODO se o vertice v n�o tem entradas, mas tem uma sa�da ao menos
		// TODO acrescentar o vertice na lista de respostas
		return null;
	}

	@Override
	public ArrayList<String> getSinks() {
		// TODO Para cada vertice v
		// TODO se o vertice v n�o tem saidas, mas tem uma entrada ao menos
		// TODO acrescentar o vertice na lista de respostas
		return null;
	}

	@Override
	public void addEdge(String strOrig, String strDest) {
		int posOrig = names.indexOf(strOrig);
		int posDest = names.indexOf(strDest);
		matrix[posOrig][posDest] = true;
	}

}







