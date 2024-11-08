package com.example.MovieWebsite.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.MovieWebsite.entity.*;

@Repository
public interface UpdateCategoryRepository extends JpaRepository<UpdateCategory, Integer> {
}
