package com.ksimeonova.simple.blogging.SimpleBloggingApplication.dao;

import com.ksimeonova.simple.blogging.SimpleBloggingApplication.model.Blog;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface BlogRepository extends JpaRepository<Blog, Long> {

    @Query("SELECT b FROM Blog b")
    Optional<List<Blog>> getFirstFifteen(Pageable pageable);

}
