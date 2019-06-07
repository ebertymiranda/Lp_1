package conceito;
/**
 *
 * @author Eberty
 */
public class EmpregadoHorista extends Empregado {
    
    private float valorHora;
    private float numeroHora;
    
    public EmpregadoHorista() {
        super();
    }
    
    public EmpregadoHorista(float valorHora, float numeroHora, String cargo, String nomeEmpresa, String nome, String nomeMae, String nomePai) throws PessoaException {
        super(cargo, nomeEmpresa, nome, nomeMae, nomePai);
        this.setNumeroHora(numeroHora);
        this.setValorHora(valorHora);
    }
    
    public final float getValorHora() {
        return valorHora;
    }
    
    public final void setValorHora(float valorHora) throws PessoaException {
        if(valorHora > 0) {
            this.valorHora = valorHora;
        } else {
            throw new PessoaException("Valor hora debe ser maior que zero");
        }
    }
    
    public final float getNumeroHora() {
        return numeroHora;
    }
    
    public final void setNumeroHora(float numeroHora) throws PessoaException {
        if (numeroHora >= 0) {
            this.numeroHora = numeroHora;
        } else { throw new PessoaException("Numero de horas deve ser maior ou igual a zero");
    }
}
    @Override
    public float calcularSalario() {
        return this.valorHora * this.numeroHora;
    }
}