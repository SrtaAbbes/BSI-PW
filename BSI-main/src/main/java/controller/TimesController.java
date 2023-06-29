package controller;
import io.quarkus.qute.Template;
import io.quarkus.qute.TemplateInstance;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("times")
public class TimesController {

    //@Inject
    //Sessao sessao;

    private final Template times;

    public TimesController(Template times) {
        this.times = times;
    }

    @GET
    @Produces(MediaType.TEXT_HTML)
    public TemplateInstance times(){
        /*if (sessao.getUsuario().isEmpty()){
            return ErroTemplates.accessoNegado();
        } else if(Possui a permissão){
            return times.instance();
        } else{
            return ErroTemplates.accessoNegado();
        }*/
        return times.instance();
    }
}
