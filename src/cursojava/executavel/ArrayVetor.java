package cursojava.executavel;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;

public class ArrayVetor {

	/* Usado para executar c�digo */
	public static void main(String[] args) {
		
		/* Array pode ser de todos os tipos de dados e objetos tamb�m */
		//String posicoes = JOptionPane.showInputDialog("Digite a quantidade de posi��es do Array? ");
		
		/* O Array sempre deve ter a quantidade de posi��es definidas */
		/*double[] notas = new double[Integer.parseInt(posicoes)];
		
		for (int pos = 0; pos < notas.length; pos++) {
			String valor = JOptionPane.showInputDialog("Digite o valor da " + (pos + 1) + "� posi��o: ");
			notas[pos] = Double.valueOf(valor);
			
		}
		
		
		for (int i = 0; i < notas.length; i++) {
			JOptionPane.showInternalMessageDialog(null, "\n Nota "+(i+1)+ " �: " + notas[i]);
			System.out.println("Nota "+(i+1)+ " �: " + notas[i]);
					
			
		}*/
		
		/* Outras formas de trabalhar com Array(vetor) */
		
		//double[] valores = {9.5, 8.9, 5.8, 100.8};
		/*String[] valores = new String[4];
		valores[0] = "Jo�o Marcos";
		valores[1] = "98,5";
		valores[2] = "Curso de Java";
		valores[3] = "contato@jdevtreinamento.com.br";
		
		for (int i = 0; i < valores.length; i++) {
			System.out.println(valores[i]);
		}*/
		
		/*String[] valores = {"Jo�o Marcos", "98,5", "Curso de Java", "contato@jdevtreinamentos.com.br", "80"};
		
		for (int i = 0; i < valores.length; i++) {
			System.out.println("Valor na posi��o " + (i +1) + " �: " + valores[i]);
		
		}*/
		
		
		double[] notas = {8.8, 9.7, 7.6, 6.8};	
		double[] notasLogica = {7.1, 5.7, 9.6, 7.8};	
		
		
		/* Cria��o do aluno */
		Aluno aluno = new Aluno();
		aluno.setNome("Jo�o Marcos");
		aluno.setNomeEscola("JDEV Treinamento");
		
		/* Cria��o da disciplina */
		Disciplina disciplina = new Disciplina();
		disciplina.setDisciplina("Curso de Java");	
		disciplina.setNota(notas);
		
		aluno.getDisciplinas().add(disciplina);
		
		Disciplina disciplina2 = new Disciplina();
		disciplina2.setDisciplina("L�gica de Programa��o");
		disciplina2.setNota(notasLogica);
		
		aluno.getDisciplinas().add(disciplina2);
		
		
		
		
		
		
		
		
		

	}

}
