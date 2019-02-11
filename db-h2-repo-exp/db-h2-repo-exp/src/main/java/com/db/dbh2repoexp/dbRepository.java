package com.db.dbh2repoexp;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface dbRepository extends JpaRepository<ToDoItem, String>{
    ToDoItem findBytext(String text);

    @Override
    List<ToDoItem> findAll();

    ToDoItem findById(int id);
}
