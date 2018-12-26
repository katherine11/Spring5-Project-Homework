package com.ksimeonova.simple.blogging.SimpleBloggingApplication.service;

import com.ksimeonova.simple.blogging.SimpleBloggingApplication.model.Blog;

import java.util.List;

public interface BlogService {

    List<Blog> getFirstFifteen();

}
