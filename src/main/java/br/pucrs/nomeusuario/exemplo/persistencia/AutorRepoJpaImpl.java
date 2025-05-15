package br.pucrs.nomeusuario.exemplo.persistencia;
import java.util.LinkedList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Repository
//@Primary
public class AutorRepoJpaImpl implements IAutorRepository {
    private IAutorJpaItfRep repository;

    @Autowired
    public AutorRepoJpaImpl(IAutorJpaItfRep repository) {
        this.repository = repository;
    }

    @Override
    public List<Autor> getAutores() {
        List<Autor> autores = repository.findAll();
        if (autores.size() == 0) {
            return new LinkedList<Autor>();
        } else {
            return autores.stream()
                         .toList();
        }
    }

    @Override
    public Autor getAutorNumero(long codigo) {
        Autor autor = repository.findById(codigo);
        return autor;
    }

    // @Override
    // public boolean addEditora(Editora editora) {
    //     if(repository.save(editora) != null)
    //         return true;
    //     return false;
    // }    

}