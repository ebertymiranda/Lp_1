package conceito;
/**
 *
 * @author Aluno
 */
public class EnderecoException extends Exception{
    
     public EnderecoException () {
        super("Erro ao manipular endereço");
    }
    
    public EnderecoException(String mensagem) {
        super(mensagem);
    }
    
}
