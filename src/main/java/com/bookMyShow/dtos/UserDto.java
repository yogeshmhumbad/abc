package com.bookMyShow.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {
    private int id;
    @NotEmpty
    @Size(min = 2 ,message = "First name must be min of 2 characters")
    private String fname;

    private String lname;
    @NotEmpty
    private String dob;
    @Email(message = "Email is not valid")
    private String email;
    @NotEmpty
    @Size(min = 3 , max = 10 ,message = "Password should be 3 to 10 characters")
    private String password;

}
