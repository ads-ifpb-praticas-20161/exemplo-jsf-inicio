package br.edu.ifpb.praticas.jsf;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.context.SessionScoped;
import javax.enterprise.inject.Any;
import javax.enterprise.inject.New;
import javax.enterprise.inject.Produces;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by diogomoreira on 28/08/16.
 */
@Named
@ViewScoped
public class ControladorPessoa implements Serializable {

    @Inject
    private Pessoa pessoa;

    private List<Pessoa> pessoas = new LinkedList<>();

    public String cadastrar() {
        pessoas.add(pessoa);
        return "index_form";
    }


    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public List<Pessoa> getPessoas() {
        return Collections.unmodifiableList(pessoas);
    }

    public void setPessoas(List<Pessoa> pessoas) {
        this.pessoas = pessoas;
    }
}
