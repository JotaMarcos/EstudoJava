package cursojava.executavel;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;

public class ArrayVetor {

	/* Usado para executar código */
	public static void main(String[] args) {
		
		/* Array pode ser de todos os tipos de dados e objetos também */
		//String posicoes = JOptionPane.showInputDialog("Digite a quantidade de posições do Array? ");
		
		/* O Array sempre deve ter a quantidade de posições definidas */
		/*double[] notas = new double[Integer.parseInt(posicoes)];
		
		for (int pos = 0; pos < notas.length; pos++) {
			String valor = JOptionPane.showInputDialog("Digite o valor da " + (pos + 1) + "ª posição: ");
			notas[pos] = Double.valueOf(valor);
			
		}
		
		
		for (int i = 0; i < notas.length; i++) {
			JOptionPane.showInternalMessageDialog(null, "\n Nota "+(i+1)+ " é: " + notas[i]);
			System.out.println("Nota "+(i+1)+ " é: " + notas[i]);
					
			
		}*/
		
		/* Outras formas de trabalhar com Array(vetor) */
		
		//double[] valores = {9.5, 8.9, 5.8, 100.8};
		/*String[] valores = new String[4];
		valores[0] = "João Marcos";
		valores[1] = "98,5";
		valores[2] = "Curso de Java";
		valores[3] = "contato@jdevtreinamento.com.br";
		
		for (int i = 0; i < valores.length; i++) {
			System.out.println(valores[i]);
		}*/
		
		/*String[] valores = {"João Marcos", "98,5", "Curso de Java", "contato@jdevtreinamentos.com.br", "80"};
		
		for (int i = 0; i < valores.length; i++) {
			System.out.println("Valor na posição " + (i +1) + " é: " + valores[i]);
		
		}*/
		
		
		double[] notas = {8.8, 9.7, 7.6, 6.8};	
		double[] notasLogica = {7.1, 5.7, 9.6, 7.8};	
		
		
		/* Criação do aluno */
		Aluno aluno = new Aluno();
		aluno.setNome("João Marcos");
		aluno.setNomeEscola("JDEV Treinamento");
		
		/* Criação da disciplina */
		Disciplina disciplina = new Disciplina();
		disciplina.setDisciplina("Curso de Java");	
		disciplina.setNota(notas);
		
		aluno.getDisciplinas().add(disciplina);
		
		Disciplina disciplina2 = new Disciplina();
		disciplina2.setDisciplina("Lógica de Programação");
		disciplina2.setNota(notasLogica);
		
		aluno.getDisciplinas().add(disciplina2);
		
		
		
		
		
		
		
		
		

	}

}
