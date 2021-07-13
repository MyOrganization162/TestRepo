package com.authentication.model.signup;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table( name = "mytbl")
public class Signuser {

    @Id
    @SequenceGenerator( name = "signUser_sequence", sequenceName = "student_sequence", allocationSize = 1)
    @GeneratedValue( strategy = GenerationType.SEQUENCE, generator = "signUser_sequence")
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String phone;
    private boolean enabled = false;
    private String token = "token";
    private LocalDateTime creationtime = null;

    public Signuser(String firstName, String lastName, String email, String password, String phone, boolean enabled) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.phone = phone;
        this.enabled = enabled;
       
    }


}
