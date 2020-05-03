package ch.bawey.wordbook.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "word_meaning")
public class WordMeaning {
    @Id
    @Column(name = "id")
    @GeneratedValue(generator = "word_meaning_id_seq")
    private Integer id;

    @Column(name = "defined_id")
    private Integer definedWordId;

    @Column(name = "defining_id")
    private Integer definingWordId;

    @ManyToOne(targetEntity = Word.class)
    @JoinColumn(name = "defined_id", insertable = false, updatable = false)
    private Word definedWord;

    @ManyToOne(targetEntity = Word.class)
    @JoinColumn(name = "defining_id", insertable = false, updatable = false)
    private Word definingWord;

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
     * @return the definedWordId
     */
    public Integer getDefinedWordId() {
        return definedWordId;
    }

    /**
     * @param definedWordId the definedWordId to set
     */
    public void setDefinedWordId(Integer definedWordId) {
        this.definedWordId = definedWordId;
    }

    /**
     * @return the definingWordId
     */
    public Integer getDefiningWordId() {
        return definingWordId;
    }

    /**
     * @param definingWordId the definingWordId to set
     */
    public void setDefiningWordId(Integer definingWordId) {
        this.definingWordId = definingWordId;
    }

    /**
     * @return the definedWord
     */
    public Word getDefinedWord() {
        return definedWord;
    }

    /**
     * @param definedWord the definedWord to set
     */
    public void setDefinedWord(Word definedWord) {
        this.definedWord = definedWord;
    }

    /**
     * @return the definingWord
     */
    public Word getDefiningWord() {
        return definingWord;
    }

    /**
     * @param definingWord the definingWord to set
     */
    public void setDefiningWord(Word definingWord) {
        this.definingWord = definingWord;
    }

}