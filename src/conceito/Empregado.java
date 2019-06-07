package conceito;
/**
 *
 * @author Eberty
 */
public abstract class Empregado extends Pessoa {
    
    private String cargo;
    private String nomeEmpresa;
    
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
        if (cargo.length() > 0) {
            this.cargo = cargo;
        } else {
            throw new PessoaException("Cargo Invalido");
        }
    }
    
    public final String getNomeEmpresa(){
        return nomeEmpresa;
    }
    
    public final void setNomeEmpresa(String nomeEmpresa) throws PessoaException {
        if (nomeEmpresa.length() > 5) {
            this.nomeEmpresa = nomeEmpresa;
        }else { 
            throw new PessoaException("Nome empresa invalido");
        }
    }
    
    public abstract float calcularSalario();
    
}
