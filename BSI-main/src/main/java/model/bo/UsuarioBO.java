package model.bo;

import model.dao.UsuarioDAO;
import model.dto.AutenticacaoDTO;
import model.dto.RespostaDTO;
import model.dto.RetornoDTO;
import model.dto.UsuarioDTO;
import model.entity.Usuario;
import model.util.Sessao;

import javax.enterprise.context.Dependent;
import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.core.Response;

import static java.util.Objects.nonNull;

@Dependent
public class UsuarioBO {

    @Inject
    Sessao sessao;

    @Inject
    UsuarioDAO usuarioDAO;

    public Response autenticar(AutenticacaoDTO autenticacaoDTO){
        RetornoDTO retornoDTO = new RetornoDTO();
        if (nonNull(autenticacaoDTO)){
            Usuario usuario = usuarioDAO.getByEmailAndSenha(autenticacaoDTO.getEmail(), autenticacaoDTO.getSenha());
            if (nonNull(usuario)) {
                retornoDTO.setMensagem("Bem vindo "+usuario.getNome()+"!");
                sessao.setUsuario(usuario.getNome());
                return Response.ok(retornoDTO).build();
            }
            else {
                retornoDTO.setMensagem("Usuário não encontrado!");
                return Response.status(Response.Status.NOT_FOUND).entity(retornoDTO).build();
            }

        }else
            return Response.status(Response.Status.BAD_REQUEST).entity("Dados obrigatórios não presentes!").build();
    }

    @Transactional
    public RespostaDTO salvar(UsuarioDTO dto) {

        RespostaDTO respostaDTO = new RespostaDTO();

        Usuario entity = new Usuario();

        entity.setEmail(dto.getEmail());
        entity.setNome(dto.getNome());
        entity.setSenha(dto.getSenha());

        try {
            usuarioDAO.save(entity);
            respostaDTO.setStatus(200);
            respostaDTO.setMensagem("Usuário salvo com sucesso!");
            respostaDTO.setUrl("/principal");
        }catch (Exception e){
            respostaDTO.setStatus(500);
            respostaDTO.setMensagem("Falha ao salvar usuário!");
            respostaDTO.setUrl("/");
        }

        return respostaDTO;
    }
}
