package com.lunionlab.turbo_restaurant.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "utilisateur")
@NoArgsConstructor
@Getter
@Setter
public class UserModel extends BaseModel {
    private String firstName;
    private String lastName;
    private String email;
    private String telephone;
    private String username;
    private String avatar;
    private String avatarUrl;
    @JsonIgnore
    private String password;
    @ManyToOne
    private RoleModel role;
    @ManyToOne
    private RestaurantModel restaurant;

    public UserModel(String firstName, String lastName, String email, String telephone, String username) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.telephone = telephone;
        this.username = username;
    }

}
