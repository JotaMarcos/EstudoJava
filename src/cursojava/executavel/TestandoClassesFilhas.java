package cursojava.executavel;

import cursojava.classes.Aluno;
import cursojava.classes.Diretor;
import cursojava.classes.Pessoa;
import cursojava.classes.Secretario;

public class TestandoClassesFilhas {

	public static void main(String[] args) {
		Aluno aluno = new Aluno();
		aluno.setNome("João Marcos");
		aluno.setNomeEscola("JDEV Treinamento");
		aluno.setIdade(22);
		
		
		Diretor diretor = new Diretor();
		diretor.setRegistroGeral("3453df3esfar345dsfasf");
		diretor.setNome("Alex Egidio");
		diretor.setIdade(50);
		
		
		
		Secretario secretario = new Secretario();
		secretario.setExperiencia("Administração");
		secretario.setNumeroCpf("111.999.888-33");
		secretario.setIdade(18);
		secretario.setNome("Poliane");
		
		
		/*System.out.println("O Aluno " + aluno.getNome() + " estuda na Escola " + aluno.getNomeEscola());
		System.out.println("O Diretor " + diretor.getNome() + " possuí o registro geral: " + diretor.getRegistroGeral());
		System.out.println("A experiência do Secretário(a) é: " + secretario.getExperiencia() + " com o CPF nº.: " + secretario.getNumeroCpf());*/
		System.out.println(aluno);
		System.out.println(diretor);
		System.out.println(secretario);
		
		
		System.out.println(aluno.pessoaMaiorIdade() + " - " + aluno.msgMaiorIdade());
		System.out.println(diretor.pessoaMaiorIdade());
		System.out.println(secretario.pessoaMaiorIdade());
		
		
		System.out.println("Salário do Aluno é: " + aluno.salario());
		System.out.println("Salário do Diretor é: " + diretor.salario());
		System.out.println("Salário do Secretario é: " + secretario.salario());
		
		
		
		teste(aluno);
		teste(diretor);
		teste(secretario);
		

	}
	
	
	public static void teste(Pessoa pessoa) {
		System.out.println("Essa pessoa " + pessoa.getNome() + " é demais: " + " e o salário é de R$ " + pessoa.salario());
	}

}
