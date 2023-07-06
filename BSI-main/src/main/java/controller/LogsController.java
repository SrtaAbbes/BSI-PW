package controller;

import io.quarkus.qute.Template;
import io.quarkus.qute.TemplateInstance;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("logs")
public class LogsController {

    //@Inject
    //Sessao sessao;

    private final Template logs;

    public LogsController(Template logs) {
        this.logs = logs;
    }

    @GET
    @Produces(MediaType.TEXT_HTML)
    public TemplateInstance logs(){
        /*if (sessao.getUsuario().isEmpty()){
            return ErroTemplates.accessoNegado();
        } else if(Possui a permissão){
            return logs.instance();
        } else{
            return ErroTemplates.accessoNegado();
        }*/
        return logs.instance();
    }

}
