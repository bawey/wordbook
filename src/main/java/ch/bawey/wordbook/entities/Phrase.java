package ch.bawey.wordbook.entities;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Phrase {
    @Id
    @Column(name = "id")
    @GeneratedValue(generator = "phrase_id_seq")
    private Integer id;

    @ManyToOne(targetEntity = Language.class)
    @JoinColumn(name = "lang_id", insertable = false, updatable = false)
    private Language language;

    @Column(name = "lang_id")
    private Integer languageId;

    @Column(name = "value")
    private String value;

    @ManyToMany(targetEntity = Phrase.class)
    @JoinTable(name = "phrase_meaning", joinColumns = { @JoinColumn(name = "defined_id") }, inverseJoinColumns = {
            @JoinColumn(name = "defining_id") })
    private Set<Phrase> meanings;

    /**
     * @return the id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return the language
     */
    public Language getLanguage() {
        return language;
    }

    /**
     * @param language the language to set
     */
    public void setLanguage(Language language) {
        this.language = language;
    }

    /**
     * @return the value
     */
    public String getValue() {
        return value;
    }

    /**
     * @param value the value to set
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * @return the meanings
     */
    public Set<Phrase> getMeanings() {
        return meanings;
    }

    /**
     * @param meanings the meanings to set
     */
    public void setMeanings(Set<Phrase> meanings) {
        this.meanings = meanings;
    }

    /**
     * @return the languageId
     */
    public Integer getLanguageId() {
        return languageId;
    }

    /**
     * @param languageId the languageId to set
     */
    public void setLanguageId(Integer languageId) {
        this.languageId = languageId;
    }
}