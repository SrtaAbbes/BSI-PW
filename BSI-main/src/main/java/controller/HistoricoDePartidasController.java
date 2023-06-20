package controller;
import io.quarkus.qute.Template;
import io.quarkus.qute.TemplateInstance;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("historicoDePartidas")
public class HistoricoDePartidasController {

    //@Inject
    //Sessao sessao;

    private final Template historicoDePartidas;

    public HistoricoDePartidasController(Template historicoDePartidas) {
        this.historicoDePartidas = historicoDePartidas;
    }

    @GET
    @Produces(MediaType.TEXT_HTML)
    public TemplateInstance historicoDePartidas(){
        /*if (sessao.getUsuario().isEmpty()){
            return ErroTemplates.accessoNegado();
        } else if(Possui a permissão){
            return historicoDePartidas.instance();
        } else{
            return ErroTemplates.accessoNegado();
        }*/
        return historicoDePartidas.instance();
    }
}
