package com.ksimeonova.simple.blogging.SimpleBloggingApplication.model;

import org.hibernate.annotations.Type;
import org.hibernate.validator.constraints.Length;

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
    @Length(min = 4, max = 128)
    private String author;

    @Column(name="text")
    @Length(min = 128, max = 4096)
    private String text; //with markdown support

    @ManyToMany
    private List<Tag> tags;

    @Type(type="text")
    @Column(name="image")
    @Length(min = 16, max = 512)
    private String imagePath;

    //status -> active by default
    @Type(type="yes_no")
    @Column(name="active_status")
    private Boolean activeStatus = true;


}
