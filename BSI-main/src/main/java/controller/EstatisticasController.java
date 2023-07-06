package controller;

import io.quarkus.qute.Template;
import io.quarkus.qute.TemplateInstance;
import io.vertx.ext.web.Session;
import model.util.Sessao;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("estatisticas")
public class EstatisticasController {

    //@Inject
    //Sessao sessao;

    private final Template estatisticas;

    public EstatisticasController(Template estatisticas) {
        this.estatisticas = estatisticas;
    }

    @GET
    @Produces(MediaType.TEXT_HTML)
    public TemplateInstance estatisticas(){
        /*if (sessao.getUsuario().isEmpty()){
            return ErroTemplates.accessoNegado();
        } else if(Possui a permissão){
            return estatisticas.instance();
        } else{
            return ErroTemplates.accessoNegado();
        }*/
        return estatisticas.instance();
    }

}
