package ch.bawey.wordbook.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Definition {
    @Id
    @Column(name = "id")
    @GeneratedValue(generator = "definition_id_seq")
    private Integer id;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "word_id", insertable = false, updatable = false)
    private Word word;

    @Column(name = "word_id")
    Integer wordId;

    @Column(name = "value")
    private String value;

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
     * @return the word
     */
    public Word getWord() {
        return word;
    }

    /**
     * @param word the word to set
     */
    public void setWord(Word word) {
        this.word = word;
    }

    /**
     * @return the wordId
     */
    public Integer getWordId() {
        return wordId;
    }

    /**
     * @param wordId the wordId to set
     */
    public void setWordId(Integer wordId) {
        this.wordId = wordId;
    }

}