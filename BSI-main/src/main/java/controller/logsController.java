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

@Path("logs")
public class logsController {

    @Inject
    Sessao sessao;

    private final Template logs;

    public logsController(Template logs) {
        this.logs = logs;
    }

    @GET
    @Produces(MediaType.TEXT_HTML)
    public TemplateInstance logs(){
        /*if (sessao.getUsuario().isEmpty()){
            return ErroTemplates.proibido();
        } else if(Possui a permissão){
            return logs.instance();
        } else{
            return ErroTemplates.proibido();
        }*/
        return logs.instance();
    }

}
