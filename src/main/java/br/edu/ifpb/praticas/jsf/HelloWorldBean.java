package br.edu.ifpb.praticas.jsf;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import java.io.Serializable;

/**
 * Created by diogomoreira on 18/08/16.
 */
@Named
@RequestScoped
public class HelloWorldBean implements Serializable {

    private String name = "Diogo Moreira";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
