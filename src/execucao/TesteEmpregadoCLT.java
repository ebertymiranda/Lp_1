package execucao;
import visao.VisaoEmpregadoCLT;


/**
 *
 * @author Eberty
 */
public class TesteEmpregadoCLT {
    
    public static void main(String args[]) {
        
        VisaoEmpregadoCLT emp1 = new VisaoEmpregadoCLT();
        emp1.lerDados();
        emp1.mostrarDados();
        
        
        System.exit(0);
    }
    
}
