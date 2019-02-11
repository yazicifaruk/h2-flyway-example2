package com.db.dbh2repoexp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class RepoController{
    @Autowired
    private dbRepository repo;

    @RequestMapping("/them")
    public List<ToDoItem> getAll() {
        return repo.findAll();
    }

    @RequestMapping("/them/{id}")
    public ToDoItem getToDoItem(@PathVariable int id) {
        return repo.findById(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/them")
    public void postTodoItem(@RequestBody ToDoItem item) {
        repo.save(item);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/them/{id}")
    public void putTodoItem(@RequestBody ToDoItem item, @PathVariable int id) {
        Optional<ToDoItem> td= Optional.ofNullable(repo.findById(id));
        item=td.get();
        repo.save(item);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = ("/them/{userName}"))
    public void delTodoItem(@PathVariable String userName) {
        repo.deleteById(userName);
    }
}
