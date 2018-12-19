package com.ksimeonova.simple.blogging.SimpleBloggingApplication.model;

import org.commonmark.node.Node;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name="blogs")
public class Blog {

    @Id
    @GeneratedValue
    @Column(name="blog_id")
    private Long blogId;

    @Column(name="date_of_publishing")
    private LocalDate dateOfPublishing;

    @Column(name="heading")
    private String heading;

    @Column(name="author")
    private String author;

    @Type(type="text")
    @Column(name="text")
    private Node text; //with markdown support

    @Type(type="text")
    @Column(name="tags")
    private List<Tag> tags;

    @Type(type="text")
    @Column(name="image")
    private Node image;

    //status -> active by default
    @Type(type="yes_no")
    @Column(name="active_status")
    private boolean activeStatus = true;


}
