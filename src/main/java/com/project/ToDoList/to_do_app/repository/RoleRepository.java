package com.project.ToDoList.to_do_app.repository;

import com.project.ToDoList.to_do_app.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role,Long> {
}
