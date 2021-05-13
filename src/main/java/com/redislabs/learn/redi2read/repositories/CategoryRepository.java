package com.redislabs.learn.redi2read.repositories;

import com.redislabs.learn.redi2read.models.Category;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends CrudRepository<Category, String> {
}
