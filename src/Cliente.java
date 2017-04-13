
public class Cliente {

	String nome;
    String registroGeral;
    String telefone;
    
    public Cliente(String nm, String rg, String tl){
        nome = nm;
        registroGeral = rg;
        telefone = tl;
    }
    
    public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRegistroGeral() {
		return registroGeral;
	}

	public void setRegistroGeral(String registroGeral) {
		this.registroGeral = registroGeral;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
}
