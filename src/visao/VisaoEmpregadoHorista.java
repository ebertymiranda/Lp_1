package visao;

import conceito.Empregado;
import conceito.EmpregadoHorista;
import conceito.PessoaException;
import javax.swing.JOptionPane;

/**
 *
 * @author Eberty
 */
public class VisaoEmpregadoHorista implements IVisaoEmpregado {
    
    private EmpregadoHorista emp;
    
    public VisaoEmpregadoHorista() {
        emp = new EmpregadoHorista();
    }
    
    @Override
    public void lerDados() {
        boolean continuaLoop = true;
        do {
            try {
                emp.setNome(JOptionPane.showInputDialog("Forneca o nome: "));
                emp.setCargo(JOptionPane.showInputDialog("Forneca o cargo: "));
                emp.setNumeroHora(Float.parseFloat(JOptionPane.showInputDialog("Forneca o numero de horas trabalhadas: ")));
                emp.setValorHora(Float.parseFloat(JOptionPane.showInputDialog("Forneca o valor da hora trabalhada: ")));
                continuaLoop = false;
            } catch (PessoaException e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Erro de digitaçao");
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
    public Empregado getEmpregado() {
        return emp;
    }
    
}
