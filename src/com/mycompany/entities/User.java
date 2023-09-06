/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.entities;

import java.io.Serializable;

/**
 *
 * @author maham
 */
public class User {

    //private static final long serialVersionUID = 1L;
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String email;
    private String name;
    private String lastname;
    private String  num_tel;
    private String password;
    private String image;
    private String role;
  // private String dateN;

    public User(int id, String email, String name,String lastname, String num_tel, String password, String photo, String role) {
        this.id = id;
        this.email = email;
        this.name = name;
        this.lastname = lastname;
        this.num_tel = num_tel;
        this.password = password;
        this.image = photo;
        this.role = role;
       
    }

    public User(String name,String lastname, String numTel, String email, String password, String photo) {
        this.email = email;
        this.name = name;
        this.lastname = lastname;
        this.num_tel = numTel;
        this.password = password;
        this.image = photo;
    }

    public User(String email, String password) {
        this.email = email;
        this.password = password;
    }
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public User() {
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return name;
    }

    public void setUsername(String username) {
        this.name = name;
    }
     public String getUserlastname() {
        return name;
    }

    public void setUserlastname(String username) {
        this.name = name;
    }

    public String getNumTel() {
        return num_tel;
    }

    public void setNumTel(String num_tel) {
        this.num_tel = num_tel;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhoto() {
        return image;
    }

    public void setPhoto(String photo) {
        this.image = photo;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "User{" + "id=" + id + ", email=" + email + ", name=" + name + ", lastname=" + lastname + ", num_tel=" + num_tel + ", password=" + password + ", image=" + image + ", role=" + role + '}';
    }


}
