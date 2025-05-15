package br.pucrs.nomeusuario.exemplo.persistencia;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

public interface IAutorJpaItfRep extends CrudRepository<Autor,Long>{
    @SuppressWarnings("null")
    List<Autor> findAll(); 
    Autor findById(long id); 
}




