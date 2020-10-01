package cursojava.executavel;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;
import cursojava.classes.Diretor;
import cursojava.classes.Disciplina;
import cursojava.classes.Secretario;
import cursojava.classesauxiliares.FuncaoAutenticacao;
import cursojava.constantes.StatusAluno;
import cursojava.excecao.ExcecaoProcessarNota;
import cursojava.interfaces.*;

public class PrimeiraClasseJava {

	/* Main é um método que autoexecutável em Java */
	public static void main(String[] args) {
		
		
		try {
		
		  lerAquivo();
		  
		String login = JOptionPane.showInputDialog("Digite o Login: ");
		String senha = JOptionPane.showInputDialog("Digite a Senha: ");
	
		if(new FuncaoAutenticacao(new Diretor(login, senha)).autenticar()){ /* Vou travar o contrato para autorizar somente quem tem o contrato 100% légitimo */

		/* new Aluno() é uma instância (Criação de Objeto) */
		/* aluno1 é uma referência para o objeto aluno */

		List<Aluno> alunos = new ArrayList<Aluno>();
		
		/* É uma lista que dentro dela temos uma chave que identifica uma sequência de valores também */
		HashMap<String, List<Aluno>> maps = new HashMap<String, List<Aluno>>();
		
		for (int qtd = 1; qtd <= 1; qtd++) {

			String nome = JOptionPane.showInputDialog("Digite o Nome do Aluno(a) " + qtd + "?: ");
 			String idade = JOptionPane.showInputDialog("Digite a Idade do Aluno(a)?: ");
			
			/*String dataNascimento =	JOptionPane.showInputDialog("Digite a Data de Nascimento do Aluno(a)?: ");
			String registroGeral = JOptionPane.showInputDialog("Digite o Registro Geral do Aluno(a)?: "); String
			cpf = JOptionPane.showInputDialog("Digite o CPF do Aluno(a)?: "); String
			nomeMae = JOptionPane.showInputDialog("Digite o Nome da Mãe do Aluno(a)?: ");
			String nomePai = JOptionPane.showInputDialog("Digite o Nome do Pai do Aluno(a)?: "); String
			dataMatricula = JOptionPane.showInputDialog("Digite a Data de Matrícula do Aluno(a)?: ");
			String serieMatriculado = JOptionPane.showInputDialog("Digite a Série que o Aluno(a) está Matriculado?: "); 
			String nomeEscola = JOptionPane.showInputDialog("Digite o Nome da Escola do Aluno(a)?: ");
			*/
			
			Aluno aluno1 = new Aluno();

			aluno1.setNome(nome);
			aluno1.setIdade(Integer.valueOf(idade));
			
			 /*aluno1.setDataNascimento(dataNascimento);
			  aluno1.setRegistroGeral(registroGeral); aluno1.setNumeroCpf(cpf);
			  aluno1.setNomeMae(nomeMae); aluno1.setNomePai(nomePai);
			  aluno1.setDataMatricula(dataMatricula);
			  aluno1.setSerieMatriculado(serieMatriculado);
			  aluno1.setNomeEscola(nomeEscola);
			 */

			for (int pos = 1; pos <= 1; pos++) { 
				String nomeDisciplina = JOptionPane.showInputDialog("Digite o Nome da Disciplina " + pos + "?: ");
				String notaDisciplina = JOptionPane.showInputDialog("Digite a Nota da Disciplina " + pos + "?");

				Disciplina disciplina = new Disciplina();
				disciplina.setDisciplina(nomeDisciplina);
				//disciplina.setNota(Double.valueOf(notaDisciplina));

				aluno1.getDisciplinas().add(disciplina);

			}
			

			int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover alguma Disciplina?");

			if (escolha == 0) { /* Opção SIM é Zero */

				int continuarRemover = 0;
				int posicao = 1;

				while (continuarRemover == 0) {
					String disciplinaRemover = JOptionPane.showInputDialog("Qual a Disciplina 1, 2, 3 ou 4?");
					aluno1.getDisciplinas().remove(Integer.valueOf(disciplinaRemover).intValue() - posicao);
					posicao++;
					continuarRemover = JOptionPane.showConfirmDialog(null, "Continuar a Remover? ");
				}

			}
			
			alunos.add(aluno1);
			
		}
		
				
		maps.put(StatusAluno.APROVADO, new ArrayList<Aluno>());		
		maps.put(StatusAluno.REPROVADO, new ArrayList<Aluno>());
		maps.put(StatusAluno.RECUPERACAO, new ArrayList<Aluno>());
		
		for (Aluno aluno : alunos) {/* Separei em listas */
			
			if(aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.APROVADO)) {
				maps.get(StatusAluno.APROVADO).add(aluno);
			} else if(aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.RECUPERACAO)) {
				maps.get(StatusAluno.RECUPERACAO).add(aluno);
			} else if(aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.REPROVADO)){
				maps.get(StatusAluno.REPROVADO).add(aluno);
			}
		}
		
		
		System.out.println("--------------------- Lista dos Aprovados ---------------------");
		for (Aluno aluno : maps.get(StatusAluno.APROVADO)) {
			System.out.println("Aluno: " + aluno.getNome() + " Resultado é igual a: " + aluno.getAlunoAprovado2() + " com a Média de: " + aluno.getMediaNota());
			
		}
		
		System.out.println("--------------------- Lista de Recuperação ---------------------");
		for (Aluno aluno : maps.get(StatusAluno.RECUPERACAO)) {
			System.out.println("Aluno: " + aluno.getNome() + " Resultado é igual a: " + aluno.getAlunoAprovado2() + " com a Média de: " + aluno.getMediaNota());
			
		}
		
		System.out.println("--------------------- Lista dos Reprovados ---------------------");
		for (Aluno aluno : maps.get(StatusAluno.REPROVADO)) {
			System.out.println("Aluno: " + aluno.getNome() + " Resultado é igual a: " + aluno.getAlunoAprovado2() + " com a Média de: " + aluno.getMediaNota());
			
		}
		
	
	   } else {
		   JOptionPane.showInternalMessageDialog(null, "Acesso não Permitido!");
	   }
		
		/*Aqui*/
		} catch (Exception e) { /* Captura erro de conversão de número */
			StringBuilder saida = new StringBuilder();
			/* Imprime o erro no Console Java */
			e.printStackTrace();
			
			/* Mensagem do erro ou causa */
			System.out.println("Mensagem: " + e.getMessage());
			
			for (int i = 0; i < e.getStackTrace().length; i++) {
				
				/*System.out.println("Classe de Erro: " + e.getStackTrace()[i].getClassName());
				System.out.println("Método de Erro: " + e.getStackTrace()[i].getMethodName());
				System.out.println("Linha de Erro: " + e.getStackTrace()[i].getLineNumber());*/
				
				saida.append("\n Classe de Erro: " + e.getStackTrace()[i].getClassName());
				saida.append("\n Método de Erro: " + e.getStackTrace()[i].getMethodName());
				saida.append("\n Linha de Erro: " + e.getStackTrace()[i].getLineNumber());
				saida.append("\n Class: " + e.getClass().getName());
				
			}
			
			//JOptionPane.showMessageDialog(null, "Erro ao Processar Notas! " + e.getMessage());
			JOptionPane.showMessageDialog(null, "Erro de conversão de número: " + saida.toString());
		
		} finally { /* Sempre é executado ocorrendo erro ou não. Porquê? */
			/* Finally sempre é usuado quando precisa executar um processo acontecendo erro ou não no sistema. */
			JOptionPane.showInternalMessageDialog(null, "...Você é aquilo que faz constantemente...!");
		}
		
	}
	
	
	public static void lerAquivo() throws FileNotFoundException {
		
			File fil = new File("c://lines.txt");
			Scanner scanner = new Scanner(fil);
		
	}

}