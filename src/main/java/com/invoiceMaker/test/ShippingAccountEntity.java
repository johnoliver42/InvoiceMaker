package com.invoiceMaker.test;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "Shipping_Account", schema = "InvoiceMaker", catalog = "")
public class ShippingAccountEntity {
    private int usersId;
    private String easyApiKeyProdection;
    private String easyPostApiKeyTest;
    private BigDecimal balance;
    private UserEntity userByUsersId;
    private Collection<ShippingAccountCarrierEntity> shippingAccountCarriersByUsersId;

    @Id
    @Column(name = "users_id", nullable = false)
    public int getUsersId() {
        return usersId;
    }

    public void setUsersId(int usersId) {
        this.usersId = usersId;
    }

    @Basic
    @Column(name = "easyApiKeyProdection", nullable = true, length = 100)
    public String getEasyApiKeyProdection() {
        return easyApiKeyProdection;
    }

    public void setEasyApiKeyProdection(String easyApiKeyProdection) {
        this.easyApiKeyProdection = easyApiKeyProdection;
    }

    @Basic
    @Column(name = "easyPostApiKeyTest", nullable = true, length = 100)
    public String getEasyPostApiKeyTest() {
        return easyPostApiKeyTest;
    }

    public void setEasyPostApiKeyTest(String easyPostApiKeyTest) {
        this.easyPostApiKeyTest = easyPostApiKeyTest;
    }

    @Basic
    @Column(name = "balance", nullable = false, precision = 4)
    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ShippingAccountEntity that = (ShippingAccountEntity) o;
        return usersId == that.usersId && Objects.equals(easyApiKeyProdection, that.easyApiKeyProdection) && Objects.equals(easyPostApiKeyTest, that.easyPostApiKeyTest) && Objects.equals(balance, that.balance);
    }

    @Override
    public int hashCode() {
        return Objects.hash(usersId, easyApiKeyProdection, easyPostApiKeyTest, balance);
    }

    @OneToOne
    @JoinColumn(name = "users_id", referencedColumnName = "id", nullable = false)
    public UserEntity getUserByUsersId() {
        return userByUsersId;
    }

    public void setUserByUsersId(UserEntity userByUsersId) {
        this.userByUsersId = userByUsersId;
    }

    @OneToMany(mappedBy = "shippingAccountByShippingAccountUsersId")
    public Collection<ShippingAccountCarrierEntity> getShippingAccountCarriersByUsersId() {
        return shippingAccountCarriersByUsersId;
    }

    public void setShippingAccountCarriersByUsersId(Collection<ShippingAccountCarrierEntity> shippingAccountCarriersByUsersId) {
        this.shippingAccountCarriersByUsersId = shippingAccountCarriersByUsersId;
    }
}
