package controller;
import io.quarkus.qute.Template;
import io.quarkus.qute.TemplateInstance;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("usuarios")
public class UsuariosController {

    //@Inject
    //Sessao sessao;

    private final Template usuarios;

    public UsuariosController(Template usuarios) {
        this.usuarios = usuarios;
    }

    @GET
    @Produces(MediaType.TEXT_HTML)
    public TemplateInstance usuarios(){
        /*if (sessao.getUsuario().isEmpty()){
            return ErroTemplates.accessoNegado();
        } else if(Possui a permissão){
            return usuarios.instance();
        } else{
            return ErroTemplates.accessoNegado();
        }*/
        return usuarios.instance();
    }
}
