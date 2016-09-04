package br.edu.ifpb.praticas.jsf;

import javax.enterprise.context.RequestScoped;
import java.io.Serializable;

/**
 * Created by diogomoreira on 28/08/16.
 */
public class Pessoa implements Serializable {

    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
