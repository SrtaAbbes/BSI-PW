package controller;
import io.quarkus.qute.Template;
import io.quarkus.qute.TemplateInstance;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("listaDeTimes")
public class ListaDeTimesController {

    //@Inject
    //Sessao sessao;

    private final Template listaDeTimes;

    public ListaDeTimesController(Template listaDeTimes) {
        this.listaDeTimes = listaDeTimes;
    }

    @GET
    @Produces(MediaType.TEXT_HTML)
    public TemplateInstance listaDeTimes(){
        /*if (sessao.getUsuario().isEmpty()){
            return ErroTemplates.proibido();
        } else if(Possui a permissão){
            return listaDeTimes.instance();
        } else{
            return ErroTemplates.proibido();
        }*/
        return listaDeTimes.instance();
    }
}
