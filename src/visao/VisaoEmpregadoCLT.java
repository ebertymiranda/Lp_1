package visao;

import conceito.Empregado;
import conceito.EmpregadoCLT;
import conceito.PessoaException;
import javax.swing.JOptionPane;

/**
 *
 * @author Eberty
 */
public class VisaoEmpregadoCLT implements IVisaoEmpregado{
    
    private EmpregadoCLT emp;
    public VisaoEmpregadoCLT() {
        emp = new EmpregadoCLT();
    }
    
    @Override
    public void lerDados() {
        boolean continuarLoop = true;
        do{
            try{
                emp.setNome(JOptionPane.showInputDialog("Forneca o nome: "));
                emp.setCargo(JOptionPane.showInputDialog("Forneca o cargo: "));
                emp.setSalarioBase(Float.parseFloat(JOptionPane.showInputDialog("Forneca o Salario Base: ")));
                emp.setPINSS(Float.parseFloat(JOptionPane.showInputDialog("Forneca o percentual de INSS: ")));
                emp.setPIR(Float.parseFloat(JOptionPane.showInputDialog("Forneca de IR: ")));
                emp.setValorSalarioFamilia(Float.parseFloat(JOptionPane.showInputDialog("Forneca o valor do salario familia: ")));
                emp.setNumeroFilhos(Integer.parseInt(JOptionPane.showInputDialog("Forneca o numero de filhos: ")));
                
                continuaLoop = false;
            } catch (PessoaException e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Erro de digitacao");
            }
        } while (continuaLoop);
    }
    
    @Override
    public void mostraDados() {
        JOptionPane.showMessageDialog(null, this.obterDados(), "Resultados", JOptionPane.PLAIN_MESSAGE);
    }
    
    @Override
    public String obterDados() {
        return "Nome: " + emp.getNome() + "\nCargo: " + emp.getCargo() + "\n Salario: R$ " + emp.calcularSalario();
    }
    
    @Override
    public Empregado getEmpregado(){
        return emp;
    }
}
