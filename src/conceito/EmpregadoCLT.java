package conceito;
/**
 *
 * @author Eberty
 */
public class EmpregadoCLT extends Empregado {
    private float salarioBase;
    private float pINSS;
    private float pIR;
    private int numeroFilhos;
    private float valorSalarioFamilia;
    
    public EmpregadoCLT(){
        super();
    }
    public EmpregadoCLT(float salarioBase, float percINSS, float percIR, 
                        int numeroFilhos, float valorSalarioFamilia, 
                        String cargo, String nomeEmpresa, String nome,
                        String nomeMae, String nomePai) throws PessoaException{
    super (cargo, nomeEmpresa, nome, nomeMae, nomePai);
    this.setNumeroFilhos (numeroFilhos);
    this.setValorSalarioFamilia (valorSalarioFamilia);
    this.setSalarioBase (salarioBase);
    this.setPINSS ( percINSS );
    this.setPIR ( percIR );
       
    }
    public final void setSalarioBase ( float salarioBase ) throws PessoaException {
     if ( salarioBase >= 0 ) {
         this.salarioBase = salarioBase;
    }else {
         throw new PessoaException ("Salario Base invalido");
     }   
    }
    public final void setPINSS (float pINSS ) throws PessoaException{
        if ( pINSS >= 0 && pINSS <= 100){
            this.pINSS = pINSS;
        }else{
         throw new PessoaException ( " Percentual de INSS invalido" );   
        }      
    }

    public final void setPIR ( float pIR ) throws PessoaException{
    if ( pIR >= 0 && pIR <= 100){
      this.pIR = pIR;  
    }else{
       throw new PessoaException ( " Percentual de IR invalido " ); 
    }   
    }
    public final void setNumeroFilhos ( int numeroFilhos ) throws PessoaException{
      if ( numeroFilhos >= 0 ){
        this.numeroFilhos = numeroFilhos;
    }else {
         throw new PessoaException ( "Numero de filhos invalido " ); 
      }  
    }
    public final void setValorSalarioFamilia ( float valorSalarioFamilia ) throws
PessoaException {
      if ( valorSalarioFamilia >= 0 ){
        this.valorSalarioFamilia = valorSalarioFamilia;
    }else{
          throw new PessoaException ( "SalarioFamilia invalido");  
    }  
    }
    @Override
    public float calcularSalario( ){
        float totalSalarioFamilia, totalINSS, totalIR;
        if ( numeroFilhos <= 3 ){
           totalSalarioFamilia = valorSalarioFamilia * numeroFilhos; 
        }else {
           totalSalarioFamilia = valorSalarioFamilia * 3;
        }
        totalINSS = salarioBase * pINSS / 100;
        totalIR = salarioBase * pIR / 100;
        
        return salarioBase + totalSalarioFamilia - totalINSS - totalIR ;
    }
}
