package com.slepan.slepanshop;

import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class User{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String role;
    private String username;
    private String uid;
    private String name;
    private String surname;
    private String email;
    private String phonenumber;
    private String password;
    private Boolean tryb;

    public void setUsername(String username) {
        this.username = username;
    }
    public String getUsername(){
        return username;
    }

    public void setRole(String role){
        this.role = role;
    }
    public String getRole(){
        return role;
    }

    public void setId(Long id){
        this.id = id;
    }
    public Long getId(){
        return id;
    }

    public void setUid(String uid){
        this.uid = uid;
    }
    public String getUid(){
        return uid;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void setSurname(String surname){
        this.surname = surname;
    }
    public String getSurname(){
        return surname;
    }

    public void setEmail(String email){
        this.email = email;
    }
    public String getEmail(){
        return email;
    }

    public void setPhonenumber(String phonenumber){
        this.phonenumber = phonenumber;
    }
    public String getPhonenumber(){
        return phonenumber;
    }

    public void setPassword(String password){
        this.password = password;
    }
    public String getPassword(){
        return password;
    }

    public void setTryb(Boolean tryb){
        this.tryb = tryb;
    }
    public Boolean getTryb(){
        return tryb;
    }

}
