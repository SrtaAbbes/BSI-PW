package model.dto;

import javax.ws.rs.core.Response;

import static java.util.Objects.nonNull;

public class AutenticacaoDTO {

    private String email;
    private String senha;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Response autenticar(AutenticacaoDTO autenticacao){
        RetornoAutenticacaoDTO retornoAutenticacao = new RetornoAutenticacaoDTO();
        if (nonNull(autenticacao)){
            if (autenticacao.getEmail().equals("abc") && autenticacao.getSenha().equals("123"))
                retornoAutenticacao.setRetorno("Usuário autenticado!");
            else
                retornoAutenticacao.setRetorno("Usuário não encontrado!");
            return Response.ok(retornoAutenticacao).build();
        }else
            return Response.status(Response.Status.BAD_REQUEST).entity("Dados obrigatórios não presentes!").build();
    }
}
