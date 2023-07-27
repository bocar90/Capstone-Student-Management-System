package com.perscholas.capstone.model;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Collection;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(uniqueConstraints = @UniqueConstraint(columnNames = "email"))
public class User {

   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   private Long id;

   private String firstName;
   private String lastName;
   private String email;
   private String password;

   @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
   @JoinTable(
           name = "users_roles",
           joinColumns = @JoinColumn(
                   name = "user_id", referencedColumnName = "id"),
           inverseJoinColumns = @JoinColumn(
                   name = "role_id", referencedColumnName = "id"))
   private Collection<Role> roles;

   public User(String firstName, String lastName, String email, String password) {
       this.firstName = firstName;
       this.lastName = lastName;
       this.email = email;
       this.password = password;
   }

   public User(String firstName, String lastName, String email, String password, Collection<Role> roles) {
       this.firstName = firstName;
       this.lastName = lastName;
       this.email = email;
       this.password = password;
       this.roles = roles;
   }

   @Override
   public String toString() {
       return "User{" +
               "id=" + id +
               ", firstName='" + firstName + '\'' +
               ", lastName='" + lastName + '\'' +
               ", email='" + email + '\'' +
               ", password='" + "*********" + '\'' +
               ", roles=" + roles +
               '}';
   }
}