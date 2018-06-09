package com.harak.recipe.repository;

import com.harak.recipe.entity.Notes;
import org.springframework.data.repository.CrudRepository;

public interface NotesRepository extends CrudRepository<Notes,Long> {
}
