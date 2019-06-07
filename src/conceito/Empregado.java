package conceito;
/**
 *
 * @author Eberty
 */
public abstract class Empregado extends Pessoa {
    
    private String cargo;
    private String nomeEmpresa;
    private Endereco enderecoEmpresa;
    
    
    public Empregado() {
        this.cargo = "";
        this.nomeEmpresa = "";
        
    }
    
    public Empregado(String cargo, String nomeEmpresa, String nome, String nomeMae, String nomePai) throws PessoaException {
        super(nome, nomeMae, nomePai);
        this.setCargo(cargo);
        this.setNomeEmpresa(nomeEmpresa);
        
    }
    
    public final String getCargo() {
        return cargo;
    }
    
    public final void setCargo(String cargo) throws PessoaException {
        if (cargo.length() > 3 ) {
            this.cargo = cargo;
        } else {
            throw new PessoaException("Cargo Invalido");
        }
    }
    
    public final String getNomeEmpresa(){
        return nomeEmpresa;
    }
    
    public final void setNomeEmpresa(String nomeEmpresa) throws PessoaException {
        if (nomeEmpresa.length() > 3) {
            this.nomeEmpresa = nomeEmpresa;
        }else { 
            throw new PessoaException("Nome empresa invalido");
        }
    }
    
    
     public void setLogradouroEmpresa (String logradouroEmpresa) throws EnderecoException {
        this.enderecoEmpresa.setLogradouro(logradouroEmpresa);
        }
     public String getLogradouroEmpresa () {
        return enderecoEmpresa.getLogradouro();
    }
    public void setNumeroEmpresa (int numeroEmpresa) throws EnderecoException {
        this.enderecoEmpresa.setNumero(numeroEmpresa);
        }
     public int getNumeroEmpresa () {
        return enderecoEmpresa.getNumero();
        
    }
    
   public void setBairroEmpresa (String bairroEmpresa) throws EnderecoException {
        this.enderecoEmpresa.setBairro(bairroEmpresa);
        }
     public String getBairroEmpresa () {
        return enderecoEmpresa.getBairro();
    }
    public void setCidadeEmpresa (String cidadeEmpresa) throws EnderecoException {
        this.enderecoEmpresa.setCidade(cidadeEmpresa);
        }
     public String getCidadeEmpresa () {
        return enderecoEmpresa.getCidade();
    }
     public void setCepEmpresa (String cepEmpresa) throws EnderecoException {
        this.enderecoEmpresa.setCep(cepEmpresa);
        }
     public String getCepEmpresa () {
        return enderecoEmpresa.getCidade();
     }
     public void setUfEmpresa (String ufEmpresa) throws EnderecoException {
        this.enderecoEmpresa.setUf(ufEmpresa);
        }
     public String getUfEmpresa () {
        return enderecoEmpresa.getUf();
     }
     
    public abstract float calcularSalario();
    
}
