package com.project.ToDoList.to_do_app.repository;

import com.project.ToDoList.to_do_app.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
