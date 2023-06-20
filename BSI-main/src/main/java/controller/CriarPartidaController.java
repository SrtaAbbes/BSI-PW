package controller;
import io.quarkus.qute.Template;
import io.quarkus.qute.TemplateInstance;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("criarPartida")
public class CriarPartidaController {

    //@Inject
   //Sessao sessao;

    private final Template criarPartida;

    public CriarPartidaController(Template criarPartida) {
        this.criarPartida = criarPartida;
    }

    @GET
    @Produces(MediaType.TEXT_HTML)
    public TemplateInstance criarPartida(){
        /*if (sessao.getUsuario().isEmpty()){
            return ErroTemplates.accessoNegado();
        } else if(Possui a permissão){
            return criarPartida.instance();
        } else{
            return ErroTemplates.accessoNegado();
        }*/
        return criarPartida.instance();
    }
}
