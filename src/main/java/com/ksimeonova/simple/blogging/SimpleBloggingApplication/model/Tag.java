package com.ksimeonova.simple.blogging.SimpleBloggingApplication.model;

import javax.persistence.*;

@Entity
@Table(name="tags")
public class Tag {

    @Id
    @GeneratedValue
    @Column(name="tag_id")
    private Long tagId;

    @Column(name="value")
    private String value;

}
