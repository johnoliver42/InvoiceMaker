package com.invoiceMaker.test;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "User", schema = "InvoiceMaker", catalog = "")
public class UserEntity {
    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private String street1;
    private String street2;
    private String city;
    private String state;
    private String postalCode;
    private String businessName;
    private Timestamp createDate;
    private Timestamp lastUpdated;
    private String password;
    private Collection<OrdersEntity> ordersById;
    private ShippingAccountEntity shippingAccountById;
    private UserRolesEntity userRolesByEmail;
    private Collection<UserRolesEntity> userRolesById;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "firstName", nullable = false, length = 50)
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Basic
    @Column(name = "lastName", nullable = false, length = 50)
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Basic
    @Column(name = "email", nullable = false, length = 100)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "street1", nullable = true, length = 100)
    public String getStreet1() {
        return street1;
    }

    public void setStreet1(String street1) {
        this.street1 = street1;
    }

    @Basic
    @Column(name = "street2", nullable = true, length = 100)
    public String getStreet2() {
        return street2;
    }

    public void setStreet2(String street2) {
        this.street2 = street2;
    }

    @Basic
    @Column(name = "city", nullable = true, length = 100)
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Basic
    @Column(name = "state", nullable = true, length = 50)
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Basic
    @Column(name = "postalCode", nullable = true, length = 50)
    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    @Basic
    @Column(name = "businessName", nullable = true, length = 100)
    public String getBusinessName() {
        return businessName;
    }

    public void setBusinessName(String businessName) {
        this.businessName = businessName;
    }

    @Basic
    @Column(name = "createDate", nullable = false)
    public Timestamp getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Timestamp createDate) {
        this.createDate = createDate;
    }

    @Basic
    @Column(name = "lastUpdated", nullable = false)
    public Timestamp getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(Timestamp lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    @Basic
    @Column(name = "password", nullable = false, length = 100)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserEntity that = (UserEntity) o;
        return id == that.id && Objects.equals(firstName, that.firstName) && Objects.equals(lastName, that.lastName) && Objects.equals(email, that.email) && Objects.equals(street1, that.street1) && Objects.equals(street2, that.street2) && Objects.equals(city, that.city) && Objects.equals(state, that.state) && Objects.equals(postalCode, that.postalCode) && Objects.equals(businessName, that.businessName) && Objects.equals(createDate, that.createDate) && Objects.equals(lastUpdated, that.lastUpdated) && Objects.equals(password, that.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName, email, street1, street2, city, state, postalCode, businessName, createDate, lastUpdated, password);
    }

    @OneToMany(mappedBy = "userByUsersId")
    public Collection<OrdersEntity> getOrdersById() {
        return ordersById;
    }

    public void setOrdersById(Collection<OrdersEntity> ordersById) {
        this.ordersById = ordersById;
    }

    @OneToOne(mappedBy = "userByUsersId")
    public ShippingAccountEntity getShippingAccountById() {
        return shippingAccountById;
    }

    public void setShippingAccountById(ShippingAccountEntity shippingAccountById) {
        this.shippingAccountById = shippingAccountById;
    }

    @ManyToOne
    @JoinColumn(name = "email", referencedColumnName = "user_name", nullable = false)
    public UserRolesEntity getUserRolesByEmail() {
        return userRolesByEmail;
    }

    public void setUserRolesByEmail(UserRolesEntity userRolesByEmail) {
        this.userRolesByEmail = userRolesByEmail;
    }

    @OneToMany(mappedBy = "userByUserId")
    public Collection<UserRolesEntity> getUserRolesById() {
        return userRolesById;
    }

    public void setUserRolesById(Collection<UserRolesEntity> userRolesById) {
        this.userRolesById = userRolesById;
    }
}
