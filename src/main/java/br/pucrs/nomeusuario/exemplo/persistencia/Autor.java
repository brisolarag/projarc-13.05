package br.pucrs.nomeusuario.exemplo.persistencia;
import java.util.LinkedList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.*;

@Entity
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class,property = "numero")
public class Autor {
    @Id
    private long numero;
    private String nome;
    private int anoNascimento;
    @OneToMany(mappedBy = "autor", cascade = CascadeType.ALL)
    private List<Livro> livros;

    protected Autor() {
    }

    public Autor(long numero, String nome, int anoNascimento) {
        this.numero = numero;
        this.nome = nome;
        this.anoNascimento = anoNascimento;
        this.livros = new LinkedList<Livro>();
    }

    public long getNumero() {
        return this.numero;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNumero(long numero) {
        this.numero = numero;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }

    public int getAnoNascimento() {
        return anoNascimento;
    }


}
