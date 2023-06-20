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

@Path("cadastroDePerfil")
public class CadastroDePerfilController {

    //@Inject
    //Sessao sessao;

    private final Template cadastroDePerfil;

    public CadastroDePerfilController(Template cadastroDePerfil) {
        this.cadastroDePerfil = cadastroDePerfil;
    }

    @GET
    @Produces(MediaType.TEXT_HTML)
    public TemplateInstance cadastroDePerfil(){
        /*if (sessao.getUsuario().isEmpty()){
            return ErroTemplates.accessoNegado();
        } else if(Possui a permissão){
            return cadastroDePerfil.instance();
        } else{
            return ErroTemplates.accessoNegado();
        }*/
        return cadastroDePerfil.instance();
    }

}