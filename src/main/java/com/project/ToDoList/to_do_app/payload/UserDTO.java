package com.project.ToDoList.to_do_app.payload;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserDTO {

    private Long id;
    private String username;
    @JsonIgnore
    private String password;
    private String email;
    private RoleDTO role;
}
