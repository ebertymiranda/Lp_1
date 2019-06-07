package conceito;

public class Pessoa {
    
    private String nome;
    private String nomeMae;
    private String nomePai;
    
    
    public Pessoa() {
        this.nome = "";
        this.nomeMae = "";
        this.nomePai = "";
    }
    
    public Pessoa(String nome, String nomeMae, String nomePai) throws PessoaException{
        this.setNome(nome);
        this.setNomeMae(nomeMae);
        this.setNomePai(nomePai);
    }
    
    public final String getNome() {
        return nome;
    }
    
    public final void setNome(String nome) throws PessoaException {
        if (nome.length() >=3) {
            this.nome = nome;
        } else {
            throw new PessoaException("Nome invalido");
        }
    }
    
    public final String getNomeMae() {
        return nomeMae;
    }
    
    public final void serNomeMae(String nomeMae) throws PessoaException{
        if (nomeMae.length() >=3) {
            this.nomeMae = nomeMae;
        } else {
            throw new PessoaException("Nome da Mae invalido");
        }
    }
    
    public final String getNomePai() {
        return nomePai;
    }
    
    public final void setNomePai(String nomePai) throws PessoaException {
        if (nomePai.length() >=3) {
            this.nomePai = nomePai;
        } else { 
            throw new PessoaException("Nome do Pai invalido");
        }
    }
}

