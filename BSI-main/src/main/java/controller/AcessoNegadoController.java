package controller;
import io.quarkus.qute.Template;
import io.quarkus.qute.TemplateInstance;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("acessoNegado")
public class AcessoNegadoController {

    //@Inject
    //Sessao sessao;

    private final Template acessoNegado;

    public AcessoNegadoController(Template acessoNegado) {
        this.acessoNegado = acessoNegado;
    }

    @GET
    @Produces(MediaType.TEXT_HTML)
    public TemplateInstance acessoNegado(){
        /*if (sessao.getUsuario().isEmpty()){
            return ErroTemplates.accessoNegado();
        } else if(Possui a permissão){
            return acessoNegado.instance();
        } else{
            return ErroTemplates.accessoNegado();
        }*/
        return acessoNegado.instance();
    }
}
