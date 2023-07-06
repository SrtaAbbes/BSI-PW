package controller;

import io.quarkus.qute.Template;
import io.quarkus.qute.TemplateInstance;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("perfis")
public class PerfisController {

    //@Inject
    //Sessao sessao;

    private final Template perfis;

    public PerfisController(Template perfis) {
        this.perfis = perfis;
    }

    @GET
    @Produces(MediaType.TEXT_HTML)
    public TemplateInstance perfis(){
        /*if (sessao.getUsuario().isEmpty()){
            return ErroTemplates.accessoNegado();
        } else if(Possui a permissão){
            return perfis.instance();
        } else{
            return ErroTemplates.accessoNegado();
        }*/
        return perfis.instance();
    }

}
