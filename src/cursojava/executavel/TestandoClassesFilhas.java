package cursojava.executavel;

import cursojava.classes.Aluno;
import cursojava.classes.Diretor;
import cursojava.classes.Pessoa;
import cursojava.classes.Secretario;

public class TestandoClassesFilhas {

	public static void main(String[] args) {
		Aluno aluno = new Aluno();
		aluno.setNome("Jo�o Marcos");
		aluno.setNomeEscola("JDEV Treinamento");
		aluno.setIdade(22);
		
		
		Diretor diretor = new Diretor();
		diretor.setRegistroGeral("3453df3esfar345dsfasf");
		diretor.setNome("Alex Egidio");
		diretor.setIdade(50);
		
		
		
		Secretario secretario = new Secretario();
		secretario.setExperiencia("Administra��o");
		secretario.setNumeroCpf("111.999.888-33");
		secretario.setIdade(18);
		secretario.setNome("Poliane");
		
		
		/*System.out.println("O Aluno " + aluno.getNome() + " estuda na Escola " + aluno.getNomeEscola());
		System.out.println("O Diretor " + diretor.getNome() + " possu� o registro geral: " + diretor.getRegistroGeral());
		System.out.println("A experi�ncia do Secret�rio(a) �: " + secretario.getExperiencia() + " com o CPF n�.: " + secretario.getNumeroCpf());*/
		System.out.println(aluno);
		System.out.println(diretor);
		System.out.println(secretario);
		
		
		System.out.println(aluno.pessoaMaiorIdade() + " - " + aluno.msgMaiorIdade());
		System.out.println(diretor.pessoaMaiorIdade());
		System.out.println(secretario.pessoaMaiorIdade());
		
		
		System.out.println("Sal�rio do Aluno �: " + aluno.salario());
		System.out.println("Sal�rio do Diretor �: " + diretor.salario());
		System.out.println("Sal�rio do Secretario �: " + secretario.salario());
		
		
		
		teste(aluno);
		teste(diretor);
		teste(secretario);
		

	}
	
	
	public static void teste(Pessoa pessoa) {
		System.out.println("Essa pessoa " + pessoa.getNome() + " � demais: " + " e o sal�rio � de R$ " + pessoa.salario());
	}

}
