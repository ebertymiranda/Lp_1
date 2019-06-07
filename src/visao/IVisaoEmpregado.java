package visao;
import conceito.Empregado;
/**
 *
 * @author Eberty
 */
public interface IVisaoEmpregado {

   void lerDados(); 
   void mostrarDados();
   String obterDados();
   Empregado getEmpregado();
}
