package cursojava.classes;

import java.util.ArrayList;
import java.util.List;

import cursojava.constantes.StatusAluno;

/* Classe filha que extende da Classe Pessoa */
/* Está é a nossa classe/objeto que representa o Aluno */
public class Aluno extends Pessoa {
	/* Esses são os atributos do Aluno */
	private String dataMatricula;
	private String nomeEscola;
	private String serieMatriculado;
	
	private List<Disciplina> disciplinas = new ArrayList<Disciplina>();

	public void setDisciplinas(List<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}

	public List<Disciplina> getDisciplinas() {
		return disciplinas;
	}

	public Aluno() { /* Cria os dados na memória - Sendo o padrão do Java */

	}
	
	public Aluno(String nomePadrao) {
		nome = nomePadrao;
	}

	
	public Aluno (String nomePadrao, int idadePadrao) {
		nome = nomePadrao;
		idade = idadePadrao;
	}
	

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		
		return nome;
	}
	
	
	public int getIdade() {
		return idade;
	}
	
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
		
	public String getDataNascimento() {
		return dataNascimento;
	}
	
	
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	
	public String getRegistroGeral() {
		return registroGeral;
	}
	
	
	public void setRegistroGeral(String registroGeral) {
		this.registroGeral = registroGeral;
	}
	
	
	public String getNumeroCPF() {
		return numeroCpf;
	}
	
	
	public void setNumeroCPF(String numeroCpf) {
		this.numeroCpf = numeroCpf;
	}
	
	
	public String getNomePai() {
		return nomePai;
	}
	
	public void setNomePai(String nomePai) {
		this.nome = nomePai;
	}
	
	
	public String getNomeMae() {
		return nomeMae;
	}
	
	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}
	
	
	public String getDataMatricula() {
		return dataMatricula;
	}

	public void setDataMatricula(String dataMatricula) {
		this.dataMatricula = dataMatricula;
	}

	public String getNomeEscola() {
		return nomeEscola;
	}

	public void setNomeEscola(String nomeEscola) {
		this.nomeEscola = nomeEscola;
	}

	public String getSerieMatriculado() {
		return serieMatriculado;
	}

	public void setSerieMatriculado(String serieMatriculado) {
		this.serieMatriculado = serieMatriculado;
	}

	/* Método que retorna a média do aluno */
	public double getMediaNota() {
		double somaNotas = 0.0;

		for (Disciplina disciplina : disciplinas) {
			somaNotas += disciplina.getMediaNotas();
		}

		return somaNotas / disciplinas.size();
	}

	/* Método que retorna true para Aprovado e false para Reprovado */
	public boolean getAlunoAprovado() {
		double media = this.getMediaNota();
		if (media >= 70) {
			return true;
		} else {
			return false;
		}
	}

	public String getAlunoAprovado2() {
		double media = this.getMediaNota();
		if (media >= 50) { 
			if (media >= 70) {
				return StatusAluno.APROVADO;
			} else {
				return StatusAluno.RECUPERACAO;
			}

		} else {
			return StatusAluno.REPROVADO;
		}
	}
	
	
	@Override
	public String toString() {
		return "Aluno [dataMatricula=" + dataMatricula + ", nomeEscola=" + nomeEscola + ", serieMatriculado="
				+ serieMatriculado + ", disciplinas=" + disciplinas + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dataMatricula == null) ? 0 : dataMatricula.hashCode());
		result = prime * result + ((disciplinas == null) ? 0 : disciplinas.hashCode());
		result = prime * result + ((nomeEscola == null) ? 0 : nomeEscola.hashCode());
		result = prime * result + ((serieMatriculado == null) ? 0 : serieMatriculado.hashCode());
		return result;
	}
	

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		if (dataMatricula == null) {
			if (other.dataMatricula != null)
				return false;
		} else if (!dataMatricula.equals(other.dataMatricula))
			return false;
		if (disciplinas == null) {
			if (other.disciplinas != null)
				return false;
		} else if (!disciplinas.equals(other.disciplinas))
			return false;
		if (nomeEscola == null) {
			if (other.nomeEscola != null)
				return false;
		} else if (!nomeEscola.equals(other.nomeEscola))
			return false;
		if (serieMatriculado == null) {
			if (other.serieMatriculado != null)
				return false;
		} else if (!serieMatriculado.equals(other.serieMatriculado))
			return false;
		return true;
	}
	
	
	@Override /* Identifica método sobreescrito */
	public boolean pessoaMaiorIdade() {
		
		return idade >= 21;
	}
	
	public String msgMaiorIdade() {
		return this.pessoaMaiorIdade() ? "Aluno é maior de idade!" : "Aluno é menor de idade!";
	}

	@Override
	public double salario() {
		return 1500.90;
	}
	
}
