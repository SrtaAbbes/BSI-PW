package controller;
import io.quarkus.qute.Template;
import io.quarkus.qute.TemplateInstance;
import io.vertx.ext.web.Session;
import model.util.Sessao;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("iniciarPartida")
public class IniciarPartidaController {

    @Inject
    Sessao sessao;

    private final Template iniciarPartida;

    public void iniciarPartidaController(Template iniciarPartida) {
        this.iniciarPartida = iniciarPartida;
    }

    @GET
    @Produces(MediaType.TEXT_HTML)
    public TemplateInstance iniciarPartida(){
        /*if (sessao.getUsuario().isEmpty()){
            return ErroTemplates.proibido();
        } else if(Possui a permissão){
            return iniciarPartida.instance();
        } else{
            return ErroTemplates.proibido();
        }*/
        return iniciarPartida.instance();
    }
}
