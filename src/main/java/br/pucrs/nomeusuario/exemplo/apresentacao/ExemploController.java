package br.pucrs.nomeusuario.exemplo.apresentacao;

import br.pucrs.nomeusuario.exemplo.persistencia.*;
import java.util.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;



@RestController
@RequestMapping("/biblioteca")
public class ExemploController {
    private IAcervoRepository acervo;
    private IEditoraRepository editoras;
    private IAutorRepository autores;

    @Autowired
    public ExemploController(IAcervoRepository acervo, IEditoraRepository editoras, IAutorRepository autores) {
        this.acervo = acervo;        
        this.editoras = editoras;
        this.autores = autores;
    }

    @GetMapping("")
    public String getMensagemInicial() {
        return "Aplicacao Spring-Boot funcionando!";
    }

    @GetMapping("/livros")
    public List<Livro> getLivros() {
        return acervo.getLivros();
    }

    @GetMapping("/livroid/{id}")
    public Livro getLivroId(@PathVariable("id") long id) {
        return acervo.getLivroId(id);
    }

    @GetMapping("/editoras")
    public List<Editora> getEditoras() {
        return editoras.getEditoras();
    }

    @GetMapping("/editoracod/{cod}")
    public Editora getEditoraCodigo(@PathVariable("cod") long codigo) {
        return editoras.getEditoraCodigo(codigo);
    }

    @PostMapping("/novaeditora")
    public boolean cadastraLNovaEditora(@RequestBody final Editora editora) {
        editoras.addEditora(editora);
        return true;
    }

    @GetMapping("autores")
    public List<Autor> getAutores() {
        return this.autores.getAutores().stream().toList();
    }

    @GetMapping("autores/{num}")
    public Autor getAutoresNumero(@RequestParam long numero) {
        return this.autores.getAutorNumero(numero);
    }
    
    

}