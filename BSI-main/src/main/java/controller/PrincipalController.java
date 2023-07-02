package controller;

import model.util.ErroTemplates;
import model.util.Sessao;
import io.quarkus.qute.Template;
import io.quarkus.qute.TemplateInstance;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("principal")
public class PrincipalController {

    @Inject
    Sessao sessao;

    private final Template principal;

    public PrincipalController(Template principal) {
        this.principal = principal;
    }

    @GET
    @Produces(MediaType.TEXT_HTML)
    public TemplateInstance principal(){
//        if (sessao.getUsuario().isEmpty())
//            return ErroTemplates.proibido();
        return principal.instance();
    }

}
