package controller;

import io.quarkus.qute.Template;
import io.quarkus.qute.TemplateInstance;
import model.util.Sessao;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("resultadoPartida")
public class ResultadoPartidaController {

    //@Inject
    //Sessao sessao;

    private final Template resultadoPartida;

    public ResultadoPartidaController(Template resultadoPartida) {
        this.resultadoPartida = resultadoPartida;
    }

    @GET
    @Produces(MediaType.TEXT_HTML)
    public TemplateInstance resultadoPartida(){
        /*if (sessao.getUsuario().isEmpty()){
            return ErroTemplates.accessoNegado();
        } else if(Possui a permissão){
            return resultadoPartida.instance();
        } else{
            return ErroTemplates.accessoNegado();
        }*/
        return resultadoPartida.instance();
    }

}
