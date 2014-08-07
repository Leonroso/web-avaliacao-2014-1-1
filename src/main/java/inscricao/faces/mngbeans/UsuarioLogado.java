package inscricao.faces.mngbeans;

/**
 *
 * @author a1015710
 */

import java.io.Serializable;
import java.util.Date;

public class UsuarioLogado implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    private String nome;
    private Date dataLogin;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataLogin() {
        return dataLogin;
    }

    public void setDataLogin(Date dataLogin) {
        this.dataLogin = dataLogin;
    }
    
    
    
}
