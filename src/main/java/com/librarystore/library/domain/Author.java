package com.librarystore.library.domain;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.SelectBeforeUpdate;
import javax.persistence.OneToMany;
import javax.persistence.Entity;
import javax.persistence.Basic;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;

import javax.persistence.GenerationType;
import javax.persistence.FetchType;
import java.sql.Date;
import java.util.List;

@Entity
@Table(catalog = "library")
@DynamicUpdate
@DynamicInsert
@SelectBeforeUpdate
@EqualsAndHashCode(of = "id")
@Getter @Setter
public class Author {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;

    private String fio;

    private Date birthday;

    @Basic(fetch = FetchType.LAZY)
    @OneToMany(mappedBy = "author")
    private List<Book> books;

    @Override
    public String toString() {
        return fio;
    }
}
