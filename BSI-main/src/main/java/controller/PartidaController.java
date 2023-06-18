package controller;

import io.quarkus.qute.Template;
import io.quarkus.qute.TemplateInstance;
import io.vertx.ext.web.Session;
import model.util.Sessao;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("partida")
public class PartidaController {

    //@Inject
    //Sessao sessao;

    private final Template partida;

    public PartidaController(Template partida) {
        this.partida = partida;
    }

    @GET
    @Produces(MediaType.TEXT_HTML)
    public TemplateInstance partida(){
        /*if (sessao.getUsuario().isEmpty()){
            return ErroTemplates.proibido();
        } else if(Possui a permissão){
            return partida.instance();
        } else{
            return ErroTemplates.proibido();
        }*/
        return partida.instance();
    }

}
