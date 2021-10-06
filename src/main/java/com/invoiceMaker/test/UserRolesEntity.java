package com.invoiceMaker.test;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "User_Roles", schema = "InvoiceMaker", catalog = "")
public class UserRolesEntity {
    private int id;
    private String userName;
    private String roleName;
    private int userId;
    private Collection<UserEntity> userByEmail;
    private UserEntity userByUserId;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "user_name", nullable = false, length = 100)
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Basic
    @Column(name = "role_name", nullable = false, length = 10)
    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    @Basic
    @Column(name = "user_id", nullable = false)
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserRolesEntity that = (UserRolesEntity) o;
        return id == that.id && userId == that.userId && Objects.equals(userName, that.userName) && Objects.equals(roleName, that.roleName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, userName, roleName, userId);
    }

    @OneToMany(mappedBy = "userRolesByEmail")
    public Collection<UserEntity> getUserByEmail() {
        return userByEmail;
    }

    public void setUserByEmail(Collection<UserEntity> userByEmail) {
        this.userByEmail = userByEmail;
    }

    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id", nullable = false)
    public UserEntity getUserByUserId() {
        return userByUserId;
    }

    public void setUserByUserId(UserEntity userByUserId) {
        this.userByUserId = userByUserId;
    }
}
