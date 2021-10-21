package com.github.evgeruby.keepinmind.model;



import javax.persistence.*;

@Entity
@Table(name ="card")
public class Card {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;
    private String term;
    private String definition;

    public String getTerm() {
        return term;
    }

    public Card setTerm(String term) {
        this.term = term;
        return this;
    }

    public String getDefinition() {
        return definition;
    }

    public Card setDefinition(String definition) {
        this.definition = definition;
        return this;
    }
}
