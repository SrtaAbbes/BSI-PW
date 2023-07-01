package controller;
import io.quarkus.qute.Template;
import io.quarkus.qute.TemplateInstance;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/")
public class LoginController {

    //@Inject
    //Sessao sessao;

    private final Template login;

    public LoginController(Template login) {
        this.login = login;
    }

    @GET
    @Produces(MediaType.TEXT_HTML)
    public TemplateInstance login(){
        /*if (sessao.getUsuario().isEmpty()){
            return ErroTemplates.accessoNegado();
        } else if(Possui a permissão){
            return login.instance();
        } else{
            return ErroTemplates.accessoNegado();
        }*/
        return login.instance();
    }
}
