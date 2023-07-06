package controller;

import io.quarkus.qute.Template;
import io.quarkus.qute.TemplateInstance;
import io.vertx.ext.web.Session;
import model.util.Sessao;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("historicoPartidas")
public class HistoricoPartidasController {

    //@Inject
    //Sessao sessao;

    private final Template historicoPartidas;

    public HistoricoPartidasController(Template historicoPartidas) {
        this.historicoPartidas = historicoPartidas;
    }

    @GET
    @Produces(MediaType.TEXT_HTML)
    public TemplateInstance historicoPartidas(){
        /*if (sessao.getUsuario().isEmpty()){
            return ErroTemplates.accessoNegado();
        } else if(Possui a permissão){
            return historicoPartidas.instance();
        } else{
            return ErroTemplates.accessoNegado();
        }*/
        return historicoPartidas.instance();
    }

}
