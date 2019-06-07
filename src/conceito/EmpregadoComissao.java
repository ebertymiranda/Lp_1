package conceito;
/**
 *
 * @author Eberty
 */
public class EmpregadoComissao extends Empregado {
    
    private float totalVenda;
    private float pComissao;
    
    public EmpregadoComissao() {
        
    }
    
     public EmpregadoComissao(float totalVenda, float pComissao, String cargo, String nomeEmpresa, String nome, String nomeMae, String nomePai) throws PessoaException{
         super(cargo, nomeEmpresa, nome, nomeMae,nomePai);
         this.setTotalVenda(totalVenda);
         this.setPComissao(pComissao);
    }
     
     public final float getTotalVenda() {
         return totalVenda;
     }
     
     public final void setTotalVenda(float totalVenda) throws PessoaException {
         if (totalVenda > 0) {
             this.totalVenda = totalVenda;
         } else {
             throw new PessoaException("Total de vendas invalido");
         }
     }
     
     public final float getPComissao() {
         return pComissao;
     }
     
     public final void setPComissao(float percComissao) throws PessoaException {
         if (percComissao >= 0 && percComissao <= 100) {
             this.pComissao = percComissao;
         } else {
             throw new PessoaException("Percentual de comissao invalido");
         }
     }
     
     @Override
     public float calcularSalario() {
         return totalVenda * pComissao / 100;
     }
     
}
