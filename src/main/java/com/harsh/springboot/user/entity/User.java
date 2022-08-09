package com.harsh.springboot.user.entity;


import com.harsh.springboot.user.config.AesEncryptor;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "USER")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Convert(converter = AesEncryptor.class)
    private String name;
    @Convert(converter = AesEncryptor.class)
    private String password;
    @Convert(converter = AesEncryptor.class)
    private String email;
    @Convert(converter = AesEncryptor.class)
    private String mobileNumber;

}
