package br.com.springshop.entities;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "spring_shop")
public class User {
    private long id;
    private String name;
    private String email;
    private String phone;
    private String password;
}
