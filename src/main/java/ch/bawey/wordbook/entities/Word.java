package ch.bawey.wordbook.entities;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;

@Entity
@TypeDef(name = "enum_postgressql", typeClass = EnumTypePostgreSql.class)
public class Word {

    public enum PartOfSpeech {
        NOUN, VERB, ADJECTIVE, ADVERB, PRONOUN
    };

    public enum Gender {
        MASCULINE, FEMININE, NEUTRAL, OTHER
    };

    public enum Plurality {
        SINGULAR, PLURAL, BOTH, OTHER
    };

    @Id
    @Column(name = "id")
    @GeneratedValue(generator = "word_id_seq")
    private Integer id;

    @ManyToOne(targetEntity = Language.class)
    @JoinColumn(name = "lang_id", insertable = false, updatable = false)
    @JsonIgnore
    Language language;

    @Column(name = "lang_id")
    private Integer languageId;

    @Column(name = "value", length = 64)
    private String value;

    @Column(name = "part_of_speech")
    @Enumerated(EnumType.STRING)
    @Type(type = "enum_postgressql")
    private PartOfSpeech partOfSpeech;

    @Column(name = "gender")
    @Enumerated(EnumType.STRING)
    @Type(type = "enum_postgressql")
    private Gender gender;

    @Column(name = "plurality")
    @Enumerated(EnumType.STRING)
    @Type(type = "enum_postgressql")
    private Plurality plurality;

    @OneToMany(targetEntity = Definition.class)
    @JoinColumn(name = "word_id")
    private Set<Definition> definitions;

    @ManyToMany(targetEntity = Word.class)
    @JoinTable(name = "word_meaning", joinColumns = { @JoinColumn(name = "defined_id") }, inverseJoinColumns = {
            @JoinColumn(name = "defining_id") })
    Set<Word> meanings;

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
     * @return the partOfSpeech
     */
    public PartOfSpeech getPartOfSpeech() {
        return partOfSpeech;
    }

    /**
     * @param partOfSpeech the partOfSpeech to set
     */
    public void setPartOfSpeech(PartOfSpeech partOfSpeech) {
        this.partOfSpeech = partOfSpeech;
    }

    /**
     * @return the gender
     */
    public Gender getGender() {
        return gender;
    }

    /**
     * @param gender the gender to set
     */
    public void setGender(Gender gender) {
        this.gender = gender;
    }

    /**
     * @return the plurality
     */
    public Plurality getPlurality() {
        return plurality;
    }

    /**
     * @param plurality the plurality to set
     */
    public void setPlurality(Plurality plurality) {
        this.plurality = plurality;
    }

    /**
     * @return the definitions
     */
    public Set<Definition> getDefinitions() {
        return definitions;
    }

    /**
     * @param definitions the definitions to set
     */
    public void setDefinitions(Set<Definition> definitions) {
        this.definitions = definitions;
    }

    /**
     * @return the meanings
     */
    public Set<Word> getMeanings() {
        return meanings;
    }

    /**
     * @param meanings the meanings to set
     */
    public void setMeanings(Set<Word> meanings) {
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