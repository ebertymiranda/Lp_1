package execucao;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import visao.IVisaoEmpregado;
import visao.VisaoEmpregadoHorista;
import visao.VisaoEmpregadoComissao;
import visao.VisaoEmpregadoCLT;        



/**
 *
 * @author Eberty
 */
public class TesteEmpregados {
    
    private static final String stringMenu = "Forneca uma das opcoes: \n\n"+
                                            "[1] Incluir EmpregadoCLT\n" +
                                            "[2] Incluir EmpregadoComissao\n" +
                                            "[3] Incluir EmpregadoHorista\n" +
                                            "[4] Mostrar Dados\n" +
                                            "[5] Totalizar Salaris\n" +
                                            "[6] Sair\n";
    
    public static void main(String args[]) {
        int resp = 0;
        ArrayList<IVisaoEmpregado> listaEmpregado = new ArrayList();
        IVisaoEmpregado visaoEmpregadoTemp;
        
        double totalSalarios = 0;
        
        do {    
            resp = exibirMenu();
            if (resp == 1 ) {
                visaoEmpregadoTemp = new VisaoEmpregadoCLT();
                visaoEmpregadoTemp.lerDados();
                listaEmpregado.add(visaoEmpregadoTemp);
            } else if(resp == 2) {
                visaoEmpregadoTemp = new VisaoEmpregadoComissao();
                visaoEmpregadoTemp.lerDados();
                listaEmpregado.add(visaoEmpregadoTemp);
            } else if (resp == 3) {
                visaoEmpregadoTemp = new VisaoEmpregadoHorista();
                visaoEmpregadoTemp.lerDados();
                listaEmpregado.add(visaoEmpregadoTemp);
            } else if (resp == 4) {
                for(IVisaoEmpregado visao : listaEmpregado){
                    visao.mostrarDados();
                }
            } else if(resp == 5) {
                totalSalarios = 0;
                for(IVisaoEmpregado visao : listaEmpregado) {
                    totalSalarios += visao.getEmpregado().calcularSalario();
                } 
                JOptionPane.showMessageDialog(null, "Total dos salarios = "+totalSalarios);
            }
        } while (resp != 6);
        System.exit(0);
    }
       private static int exibirMenu() {
           int resp = 0;
           do {
               try {
                   resp = Integer.parseInt(JOption.showInputDialog(null, stringMenu));
               } catch (NumberFormatException ex) {
                   JOptionPane.showDialog(null, "Digitacao inconsistente");
                   resp - 0;
               }
           } while (resp <1 || resp > 6);
           return resp;
       }                                     
    
}
