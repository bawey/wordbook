package ch.bawey.wordbook.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="phrase_meaning")
public class PhraseMeaning {
    @Id
    @Column(name="id")
    @GeneratedValue(generator = "phrase_meaning_id_seq")
    private Integer id;

    @Column(name="defined_id")
    private Integer definedPhraseId;

    @Column(name="defining_id")
    private Integer definingPhraseId;

    @ManyToOne(targetEntity = Phrase.class)
    @JoinColumn(name="defined_id", insertable = false, updatable = false)
    private Phrase definedPhrase;

    @ManyToOne(targetEntity = Phrase.class)
    @JoinColumn(name="defining_id", insertable = false, updatable = false)
    private Phrase definingPhrase;

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
     * @return the definedPhraseId
     */
    public Integer getDefinedPhraseId() {
        return definedPhraseId;
    }

    /**
     * @param definedPhraseId the definedPhraseId to set
     */
    public void setDefinedPhraseId(Integer definedPhraseId) {
        this.definedPhraseId = definedPhraseId;
    }

    /**
     * @return the definingPhraseId
     */
    public Integer getDefiningPhraseId() {
        return definingPhraseId;
    }

    /**
     * @param definingPhraseId the definingPhraseId to set
     */
    public void setDefiningPhraseId(Integer definingPhraseId) {
        this.definingPhraseId = definingPhraseId;
    }

    /**
     * @return the definedPhrase
     */
    public Phrase getDefinedPhrase() {
        return definedPhrase;
    }

    /**
     * @param definedPhrase the definedPhrase to set
     */
    public void setDefinedPhrase(Phrase definedPhrase) {
        this.definedPhrase = definedPhrase;
    }

    /**
     * @return the definingPhrase
     */
    public Phrase getDefiningPhrase() {
        return definingPhrase;
    }

    /**
     * @param definingPhrase the definingPhrase to set
     */
    public void setDefiningPhrase(Phrase definingPhrase) {
        this.definingPhrase = definingPhrase;
    }

    
}