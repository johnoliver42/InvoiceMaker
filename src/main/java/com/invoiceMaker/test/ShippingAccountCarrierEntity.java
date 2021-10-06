package com.invoiceMaker.test;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "Shipping_Account_Carrier", schema = "InvoiceMaker", catalog = "")
@IdClass(ShippingAccountCarrierEntityPK.class)
public class ShippingAccountCarrierEntity {
    private int shippingAccountUsersId;
    private int shippingCarrierId;
    private ShippingAccountEntity shippingAccountByShippingAccountUsersId;
    private ShippingCarrierEntity shippingCarrierByShippingCarrierId;

    @Id
    @Column(name = "Shipping_Account_users_id", nullable = false)
    public int getShippingAccountUsersId() {
        return shippingAccountUsersId;
    }

    public void setShippingAccountUsersId(int shippingAccountUsersId) {
        this.shippingAccountUsersId = shippingAccountUsersId;
    }

    @Id
    @Column(name = "Shipping_Carrier_id", nullable = false)
    public int getShippingCarrierId() {
        return shippingCarrierId;
    }

    public void setShippingCarrierId(int shippingCarrierId) {
        this.shippingCarrierId = shippingCarrierId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ShippingAccountCarrierEntity that = (ShippingAccountCarrierEntity) o;
        return shippingAccountUsersId == that.shippingAccountUsersId && shippingCarrierId == that.shippingCarrierId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(shippingAccountUsersId, shippingCarrierId);
    }

    @ManyToOne
    @JoinColumn(name = "Shipping_Account_users_id", referencedColumnName = "users_id", nullable = false)
    public ShippingAccountEntity getShippingAccountByShippingAccountUsersId() {
        return shippingAccountByShippingAccountUsersId;
    }

    public void setShippingAccountByShippingAccountUsersId(ShippingAccountEntity shippingAccountByShippingAccountUsersId) {
        this.shippingAccountByShippingAccountUsersId = shippingAccountByShippingAccountUsersId;
    }

    @ManyToOne
    @JoinColumn(name = "Shipping_Carrier_id", referencedColumnName = "id", nullable = false)
    public ShippingCarrierEntity getShippingCarrierByShippingCarrierId() {
        return shippingCarrierByShippingCarrierId;
    }

    public void setShippingCarrierByShippingCarrierId(ShippingCarrierEntity shippingCarrierByShippingCarrierId) {
        this.shippingCarrierByShippingCarrierId = shippingCarrierByShippingCarrierId;
    }
}
