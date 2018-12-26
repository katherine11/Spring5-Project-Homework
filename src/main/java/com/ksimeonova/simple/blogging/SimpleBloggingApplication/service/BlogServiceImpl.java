package com.ksimeonova.simple.blogging.SimpleBloggingApplication.service;

import com.ksimeonova.simple.blogging.SimpleBloggingApplication.dao.BlogRepository;
import com.ksimeonova.simple.blogging.SimpleBloggingApplication.model.Blog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BlogServiceImpl implements BlogService{

    @Autowired
    BlogRepository blogRepository;

    @Override
    public List<Blog> getFirstFifteen() {
        Optional<List<Blog>> blogs = blogRepository.getFirstFifteen(PageRequest.of(0, 15));
        return blogs.orElse(null);
    }
}
