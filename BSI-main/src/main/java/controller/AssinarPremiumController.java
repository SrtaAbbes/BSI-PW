package controller;

import io.quarkus.qute.Template;
import io.quarkus.qute.TemplateInstance;
import model.util.Sessao;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("assinarPremium")
public class AssinarPremiumController {

    //@Inject
    //Sessao sessao;

    private final Template assinarPremium;

    public AssinarPremiumController(Template assinarPremium) {
        this.assinarPremium = assinarPremium;
    }

    @GET
    @Produces(MediaType.TEXT_HTML)
    public TemplateInstance assinarPremium(){
        /*if (sessao.getUsuario().isEmpty()){
            return ErroTemplates.proibido();
        } else if(Possui a permissão){
            return assinarPremium.instance();
        } else{
            return ErroTemplates.proibido();
        }*/
        return assinarPremium.instance();
    }

}
