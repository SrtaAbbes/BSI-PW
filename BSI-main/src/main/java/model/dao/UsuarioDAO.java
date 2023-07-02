package model.dao;

import model.entity.Usuario;

import javax.enterprise.context.Dependent;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

@Dependent
public class UsuarioDAO {

    @Inject
    EntityManager em;

    public void save(Usuario entity){
        em.persist(entity);
    }

//    public Usuario getByEmail(String email){
//        Query query = em.createQuery("from Usuario where email = :email");
//        query.setParameter("email", email);
//        return (Usuario) query.getSingleResult();
//    }

    public Usuario getByEmailAndSenha(String email, String senha){
        Query query = em.createQuery("from user where emailUser = :email and passUser = :senha");
        query.setParameter("email", email);
        query.setParameter("senha", senha);
        return (Usuario) query.getSingleResult();
    }

    public List<Usuario> getAllUsuario(){
        Query query = em.createQuery("from user");
        return (List<Usuario>) query.getResultList();
    }

}
