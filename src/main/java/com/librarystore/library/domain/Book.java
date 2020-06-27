package com.librarystore.library.domain;


import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.SelectBeforeUpdate;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.Lob;
import javax.persistence.Column;

import javax.persistence.GenerationType;

@Entity
@Table(catalog = "library")
@DynamicUpdate
@DynamicInsert
@SelectBeforeUpdate
@EqualsAndHashCode(of = "id")
@Setter @Getter
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Lob
    @Column(updatable = false)
    private byte[] content;

    @Column(name = "page_count")
    private Integer pageCount;

    private String isbn;

    @Column(name = "publish_year")
    private Integer publishYear;

    private byte[] image;

    private String descr;

    @Column(name = "view_count")
    private long viewCount;

    @Column(name = "total_rating")
    private long totalRating;

    @Column(name = "total_vote_count")
    private long totalVoteCount;

    @Column(name = "avg_rating")
    private int avgRating;

    @Override
    public String toString() {
        return super.toString();
    }
}
