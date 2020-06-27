package com.librarystore.library.domain;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.SelectBeforeUpdate;
import javax.persistence.Id;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;

import javax.persistence.GenerationType;
import java.sql.Date;

@Entity
@Table(catalog = "library")
@DynamicUpdate
@DynamicInsert
@EqualsAndHashCode(of = "id")
@SelectBeforeUpdate
@Getter @Setter
public class Vote {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private long id;

    private String value;

    @Column(name = "book_id")
    private Date bookId;

    private String username;
}
