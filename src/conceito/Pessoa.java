package conceito;

public class Pessoa {
    
 private String nome ;
 private String nomeMae;
 private String nomePai ;
 private Endereco endereco;

 
 public Pessoa (){
     this.nome = "";
     this.nomeMae = "";
     this.nomePai = "";
 }
 
 public Pessoa(String nome, String nomeMae, String nomePai) throws PessoaException{
     this.setNome(nome);
     this.setNomeMae(nomeMae);
     this.setNomePai(nomePai);
 }
 
public final String getNome ( ){
    return nome;
}

public final void setNome(String nome) throws PessoaException{
    if (nome.length() >= 3){
        this.nome = nome;
    }else {
     throw new PessoaException ( "Nome invalido");   
    }
}
public final String getNomeMae(){
    return nomeMae;
}
public final void setNomeMae (String nomeMae) throws PessoaException{
    if(nomeMae.length() >= 3){
        this.nomeMae =nomeMae;
    }else {
        throw new PessoaException ( "Nome da Mae invalido" );
    }
}
public final String getNomePai (){
    return nomePai;  
    }       

public final void setNomePai(String nomePai) throws PessoaException{
    if (nomePai.length() >= 3){
        this.nomePai = nomePai;
    }else {
        throw new PessoaException("nome do Pai invailido");
    }
}

    public void setRua(String rua) throws EnderecoException{
        this.endereco.setLogradouro(rua);
    }
     public String getRua() {
        return endereco.getLogradouro();
      }
     
                    
    public void setBairro(String bairro) throws EnderecoException{
        this.endereco.setBairro(bairro);
    }
    
    public String getBairro (){
        return endereco.getBairro();
    }
    public void setCidade (String cidade) throws EnderecoException {
        this.endereco.setCidade(cidade);
        }
    public String getCidade () {
        return endereco.getCidade();
    }
    
    public void setNumero (int numero) throws EnderecoException {
        this.endereco.setNumero(numero);
        }
    
    public int getNumero () {
        return endereco.getNumero();
    }
    
    public void setCep (String cep) throws EnderecoException {
        this.endereco.setCep(cep);
        
    }
    
    public String getCep () {
        return endereco.getCep();
    }
    
    public void setUf (String uf) throws EnderecoException {
        this.endereco.setUf(uf);
    }
    
    public String getUf () {
        return endereco.getUf();
    }
    
    
    
}

