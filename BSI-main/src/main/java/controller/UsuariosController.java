package controller;

import model.bo.UsuarioBO;
import model.dto.RespostaDTO;
import model.dto.UsuarioDTO;
import io.quarkus.qute.Template;
import io.quarkus.qute.TemplateInstance;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/")
public class UsuariosController {

    @Inject
    model.bo.UsuarioBO usuarioBO;
    private final Template login;

    public UsuariosController(Template login) {
        this.login = login;
    }

    @GET
    @Produces(MediaType.TEXT_HTML)
    public TemplateInstance loginHTML(){
        return login.instance();
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    @Path("salvar")
    public Response salvar(model.dto.UsuarioDTO dto){
        model.dto.RespostaDTO respostaDTO = usuarioBO.salvar(dto);
        return Response
                .status(respostaDTO.getStatus())
                .entity(respostaDTO)
                .build();
    }

//    //@Inject
//    //Sessao sessao;
//
//    private final Template usuarios;
//
//    public UsuariosController(Template usuarios) {
//        this.usuarios = usuarios;
//    }
//
//    @GET
//    @Produces(MediaType.TEXT_HTML)
//    public TemplateInstance usuarios(){
//        /*if (sessao.getUsuario().isEmpty()){
//            return ErroTemplates.accessoNegado();
//        } else if(Possui a permissão){
//            return usuarios.instance();
//        } else{
//            return ErroTemplates.accessoNegado();
//        }*/
//        return usuarios.instance();
//    }
}
