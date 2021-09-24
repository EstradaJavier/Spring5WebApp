package com.spring5webapp.demo.repositories;

import com.spring5webapp.demo.model.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
