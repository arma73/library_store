package com.librarystore.library.domain;


import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.SelectBeforeUpdate;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "book", catalog = "library")
@DynamicUpdate
@DynamicInsert
@SelectBeforeUpdate
@Setter @Getter
@EqualsAndHashCode(of = "id")
public class Book {
    public Book() {
    }

    public Book(Long id, byte[] imageByte) {

    }
}
