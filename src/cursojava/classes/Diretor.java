package cursojava.classes;

import cursojava.interfaces.PermitirAcesso;

/* Classe filha que extende da Classe Pessoa */
public class Diretor extends Pessoa implements PermitirAcesso {
	
	private String resgistroEducacao;
	private int tempoDirecao;
	private String titulacao;
	
	
	private String login;
	private String senha;
	
	
	public Diretor(String login, String senha) {
		this.login = login;
		this.senha = senha;
	}
	
	
	public Diretor() {
		
	}
	
	
	public String getResgistroEducacao() {
		return resgistroEducacao;
	}
	public void setResgistroEducacao(String resgistroEducacao) {
		this.resgistroEducacao = resgistroEducacao;
	}
	public int getTempoDirecao() {
		return tempoDirecao;
	}
	public void setTempoDirecao(int tempoDirecao) {
		this.tempoDirecao = tempoDirecao;
	}
	public String getTitulacao() {
		return titulacao;
	}
	public void setTitulacao(String titulacao) {
		this.titulacao = titulacao;
	}
	
	
	
	
	
	@Override
	public String toString() {
		return "Diretor [resgistroEducacao=" + resgistroEducacao + ", tempoDirecao=" + tempoDirecao + ", titulacao="
				+ titulacao + ", nome=" + nome + ", idade=" + idade + ", dataNascimento=" + dataNascimento
				+ ", registroGeral=" + registroGeral + ", numeroCpf=" + numeroCpf + ", nomePai=" + nomePai
				+ ", nomeMae=" + nomeMae + "]";
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((resgistroEducacao == null) ? 0 : resgistroEducacao.hashCode());
		result = prime * result + tempoDirecao;
		result = prime * result + ((titulacao == null) ? 0 : titulacao.hashCode());
		return result;
	}
		
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Diretor other = (Diretor) obj;
		if (resgistroEducacao == null) {
			if (other.resgistroEducacao != null)
				return false;
		} else if (!resgistroEducacao.equals(other.resgistroEducacao))
			return false;
		if (tempoDirecao != other.tempoDirecao)
			return false;
		if (titulacao == null) {
			if (other.titulacao != null)
				return false;
		} else if (!titulacao.equals(other.titulacao))
			return false;
		return true;
	}
	@Override
	public double salario() {
		return 3900.78;
	}
	
	
	@Override
	public boolean autenticar(String login, String senha) {
		this.login = login;
		this.senha = senha;
		return autenticar();
	}
	
	
	@Override
	public boolean autenticar() {
		return login.equals("joao") && senha.equals("123");
	}	
	

}
