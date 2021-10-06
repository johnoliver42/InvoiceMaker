package com.invoiceMaker.test;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class ShippingAccountCarrierEntityPK implements Serializable {
    private int shippingAccountUsersId;
    private int shippingCarrierId;

    @Column(name = "Shipping_Account_users_id", nullable = false)
    @Id
    public int getShippingAccountUsersId() {
        return shippingAccountUsersId;
    }

    public void setShippingAccountUsersId(int shippingAccountUsersId) {
        this.shippingAccountUsersId = shippingAccountUsersId;
    }

    @Column(name = "Shipping_Carrier_id", nullable = false)
    @Id
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
        ShippingAccountCarrierEntityPK that = (ShippingAccountCarrierEntityPK) o;
        return shippingAccountUsersId == that.shippingAccountUsersId && shippingCarrierId == that.shippingCarrierId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(shippingAccountUsersId, shippingCarrierId);
    }
}
