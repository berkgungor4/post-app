package com.youngadessi.app.user.entity;

import com.youngadessi.app.common.sql.entity.BaseEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;


@Entity
@Table(name = "tbl_user",uniqueConstraints = {
        @UniqueConstraint(columnNames = {"username"}),
        @UniqueConstraint(columnNames = {"email"})
},
        indexes = {
        @Index(columnList = "fullname")
})
@Getter
@Setter
public class User extends BaseEntity {

    @Column(name = "fullname")
    private String fullname;

    @NotNull
    @NotBlank
    @Column(name = "username")
    private String username;

    @NotNull
    @NotBlank
    @Column(name = "password")
    private String password;

    @Column(name = "email")
    private String email;
}
