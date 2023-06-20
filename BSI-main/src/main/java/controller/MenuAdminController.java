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

@Path("menuAdmin")
public class MenuAdminController {

    //@Inject
    //Sessao sessao;

    private final Template menuAdmin;

    public MenuAdminController(Template menuAdmin) {
        this.menuAdmin = menuAdmin;
    }

    @GET
    @Produces(MediaType.TEXT_HTML)
    public TemplateInstance menuAdmin(){
        /*if (sessao.getUsuario().isEmpty()){
            return ErroTemplates.accessoNegado();
        } else if(Possui a permissão){
            return menuAdmin.instance();
        } else{
            return ErroTemplates.accessoNegado();
        }*/
        return menuAdmin.instance();
    }

}
