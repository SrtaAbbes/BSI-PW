package controller;

import io.quarkus.qute.Template;
import io.quarkus.qute.TemplateInstance;
import io.vertx.ext.web.Session;
import model.util.Sessao;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("home")
public class HomeController {

    //@Inject
    //Sessao sessao;

    private final Template home;

    public HomeController(Template home) {
        this.home = home;
    }

    @GET
    @Produces(MediaType.TEXT_HTML)
    public TemplateInstance home(){
        /*if (sessao.getUsuario().isEmpty()){
            return ErroTemplates.accessoNegado();
        } else if(Possui a permissão){
            return home.instance();
        } else{
            return ErroTemplates.accessoNegado();
        }*/
        return home.instance();
    }

}
