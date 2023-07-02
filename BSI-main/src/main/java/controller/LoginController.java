package controller;
import io.quarkus.qute.Template;
import io.quarkus.qute.TemplateInstance;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/")
public class LoginController {


    @Inject
    model.bo.UsuarioBO usuarioBO;

    private final Template login;

    public LoginController(Template login) {
        this.login = login;
    }

    @GET
    public TemplateInstance login(){
        return login.instance();
    }

    @POST
    @Path("autenticar")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response autenticar(model.dto.AutenticacaoDTO autenticacaoDTO){
        return usuarioBO.autenticar(autenticacaoDTO);
    }

//    //@Inject
//    //Sessao sessao;
//
//    private final Template login;
//
//    public LoginController(Template login) {
//        this.login = login;
//    }
//
//    @GET
//    @Produces(MediaType.TEXT_HTML)
//    public TemplateInstance login(){
//        /*if (sessao.getUsuario().isEmpty()){
//            return ErroTemplates.accessoNegado();
//        } else if(Possui a permissão){
//            return login.instance();
//        } else{
//            return ErroTemplates.accessoNegado();
//        }*/
//        return login.instance();
//    }
}
